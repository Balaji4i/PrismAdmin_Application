package fusion.um.view.backing;

import fusion.um.view.utils.ADFUtils;
import fusion.um.view.utils.JSFUtils;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import oracle.adf.view.rich.component.rich.RichPopup;

import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;

import oracle.binding.OperationBinding;

import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewObject;
import oracle.jbo.server.ViewObjectImpl;


public class FunctionClass {
    private RichSelectOneChoice clType;
    private RichSelectOneChoice checkListlookup;

    public FunctionClass() {
    }
    private String checkFuncType;
    private RichPopup p1;


    public void onClickCommit(ActionEvent actionEvent) {
        ViewObject vo =
            ADFUtils.findIterator("XxfndReportParamsVoIterator").getViewObject();
        ViewObject funcvo =
            ADFUtils.findIterator("FuncChecklist_VO1Iterator").getViewObject();
        OperationBinding binding = null;
        if (getCheckFuncType() != null && "P".equals(getCheckFuncType())) {
            RowSetIterator funciter = funcvo.createRowSetIterator(null);
            while (funciter.hasNext()) {
                Row rowfunc = funciter.next();

                if (rowfunc.getAttribute("ClName") == null) {
                    JSFUtils.addFacesErrorMessage("Please enter Name");
                    return;
                }
            }
        }
        if (getCheckFuncType() != null && "R".equals(getCheckFuncType())) {
            RowSetIterator iter = vo.createRowSetIterator(null);
            while (iter.hasNext()) {
                Row row = iter.next();
                if (row.getAttribute("ParamTable") != null &&
                    row.getAttribute("ParamLookupType") != null) {
                    JSFUtils.addFacesErrorMessage("You cannot enter both Param Table and Lookup Type");
                    return;

                }

                System.out.println(row.getAttribute("ParamColumn") + "::" +
                                   row.getAttribute("ParamDispColumn"));
                if (row.getAttribute("ParamTable") != null) {
                    if (row.getAttribute("ParamColumn") == null ||
                        row.getAttribute("ParamDispColumn") == null) {
                        JSFUtils.addFacesErrorMessage("Please Enter Param Column & Param Display Column");
                        return;
                    }
                }
            }
            iter.closeRowSetIterator();
            if (ADFUtils.getBoundAttributeValue("PagePath") == null) {
                JSFUtils.addFacesErrorMessage("Please enter page path");
                return;
            }
        }
        System.err.println("AttrGrpId===" +
                           ADFUtils.getBoundAttributeValue("AttrGrpId"));
        System.err.println("funcid==" +
                           ADFUtils.getBoundAttributeValue("FuncId"));
        //if AttrGrpId is selected then assign a func_id else don't create an empty record in XXFND_func_approvals table
        //hence removing the empty row
        if (ADFUtils.getBoundAttributeValue("AttrGrpId") != null &&
            !"".equals(ADFUtils.getBoundAttributeValue("AttrGrpId"))) {
            // assign XXFND_functions func_id to XXFND_func_approvals func_id to save attribute_group info
            ADFUtils.setBoundAttributeValue("FuncId_Approval",
                                            ADFUtils.getBoundAttributeValue("FuncId"));
            binding = ADFUtils.findOperation("Commit1");
            binding.execute();
        } else {
            ViewObject xxfndFuncApprovalsVo =
                ADFUtils.findIterator("FuncApprovals_VO1Iterator1").getViewObject();
            xxfndFuncApprovalsVo.removeCurrentRow();
        }
        binding = ADFUtils.findOperation("Commit");
        binding.execute();
        if (binding.getErrors().isEmpty()) {
            JSFUtils.addFacesInformationMessage("Information Saved Successfully!");
            JSFUtils.handleNavigation("back");
        } else {
            JSFUtils.addFacesInformationMessage("Error:" +
                                                binding.getErrors().get(0));
        }

    }

    public void onClickRollback(ActionEvent actionEvent) {
        ADFUtils.findOperation("Rollback").execute();
    }

    public void onClickClose(ActionEvent actionEvent) {
        getP1().cancel();
    }

    public void setP1(RichPopup p1) {
        this.p1 = p1;
    }

    public RichPopup getP1() {
        return p1;
    }

    public void onClickCreate(ActionEvent actionEvent) {
        ViewObject vo =
            ADFUtils.findIterator("FuncApprLevels_VO1Iterator").getViewObject();
        int count = (int)vo.getEstimatedRowCount();
        int count1 = count + 1;
        ADFUtils.findOperation("CreateInsert").execute();
        vo.getCurrentRow().setAttribute("LevelNo", count1);
    }

    public void onClickApprovalCreate(ActionEvent actionEvent) {
        ViewObject vo =
            ADFUtils.findIterator("FuncApprovals_VO1Iterator").getViewObject();
        int count = (int)vo.getEstimatedRowCount();
        int count1 = count + 1;
        ADFUtils.findOperation("CreateInsert1").execute();
        vo.getCurrentRow().setAttribute("SeqNumber", count1);
    }

    public void onClickEmpInsert(ValueChangeEvent vce) {
        //        onClickEmpins();
        System.out.println("New Value is-" + vce.getNewValue());
        if (vce.getNewValue() != null) {
            this.setvalueToExpression("#{row.bindings.UserId.inputValue}",
                                      vce.getNewValue()); //Updating Model Values
            Integer selectedCode =
                Integer.parseInt(this.getValueFrmExpression("#{row.bindings.UserId.inputValue}").toString());

            System.out.println("******** Selected Value in List***** " +
                               selectedCode);
            System.out.println("*******Display Value in List ****" +
                               getValueFrmExpression("#{row.bindings.DeptIdTrans.selectedValue.attributeValues[1]}"));

        }
    }

    /**Method to set value in Expression (EL)
     * @param el
     * @param val
     */
    public void setvalueToExpression(String el, Object val) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ELContext elContext = facesContext.getELContext();
        ExpressionFactory expressionFactory =
            facesContext.getApplication().getExpressionFactory();
        ValueExpression exp =
            expressionFactory.createValueExpression(elContext, el,
                                                    Object.class);
        exp.setValue(elContext, val);
    }

    /**Method to get value from Expression (EL)
     * @param data
     * @return
     */
    public String getValueFrmExpression(String data) {
        FacesContext fc = FacesContext.getCurrentInstance();
        Application app = fc.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = fc.getELContext();
        ValueExpression valueExp =
            elFactory.createValueExpression(elContext, data, Object.class);
        String Message = null;
        Object obj = valueExp.getValue(elContext);
        if (obj != null) {
            Message = obj.toString();
        }
        return Message;
    }

    public void onClickChecklistCreate(ActionEvent actionEvent) {
        ViewObject vo =
            ADFUtils.findIterator("FuncChecklist_VO1Iterator").getViewObject();
        int count = (int)vo.getEstimatedRowCount();
        int count1 = count + 1;
        ADFUtils.findOperation("CreateInsert2").execute();
        vo.getCurrentRow().setAttribute("SeqNumber", count1);
    }

    public void onClickEmpins() {
        ViewObject vo =
            ADFUtils.findIterator("FuncApprovals_VO1Iterator").getViewObject();
        String user_id = vo.getCurrentRow().getAttribute("UserId").toString();
        System.err.println("userid===" + user_id);
    }

    public String getCheckFuncType() {
        String funcType = null;
        if (ADFUtils.getBoundAttributeValue("FuncType") != null) {
            funcType = (String)ADFUtils.getBoundAttributeValue("FuncType");
        }
        return funcType;
    }

    public void createInsert() {
        //functions
        ADFUtils.findOperation("CreateInsert").execute();
        //function_approvals
        ADFUtils.findOperation("CreateInsert1").execute();
    }

    public void editFunction(ActionEvent actionEvent) {
        System.err.println("AttrGrpId==" +
                           ADFUtils.getBoundAttributeValue("AttrGrpId"));
        ViewObject xxfndFuncApprovalsVo =
            ADFUtils.findIterator("FuncApprovals_VO1Iterator").getViewObject();
        ViewObjectImpl vo = (ViewObjectImpl)xxfndFuncApprovalsVo;
        ViewCriteria vc = vo.getViewCriteria("findByFuncId");
        vo.setNamedWhereClauseParam("pFundId",
                                    ADFUtils.getBoundAttributeValue("FuncId"));
        xxfndFuncApprovalsVo.applyViewCriteria(vc);
        xxfndFuncApprovalsVo.executeQuery();
        Row row = xxfndFuncApprovalsVo.first();
        System.err.println("row------------" + row);
        if (row == null || row.getAttribute("AttrGrpId") == null) {
            ADFUtils.findOperation("CreateInsert").execute();
        }
    }

    public void onClickClTypeVcl(ValueChangeEvent valueChangeEvent) {
        if (clType.getValue() != null && clType.getValue() != "Lookup") {
            checkListlookup.setValue("");

        }


    }

    public void setClType(RichSelectOneChoice clType) {
        this.clType = clType;
    }

    public RichSelectOneChoice getClType() {
        return clType;
    }

    public void setCheckListlookup(RichSelectOneChoice checkListlookup) {
        this.checkListlookup = checkListlookup;
    }

    public RichSelectOneChoice getCheckListlookup() {
        return checkListlookup;
    }
}
