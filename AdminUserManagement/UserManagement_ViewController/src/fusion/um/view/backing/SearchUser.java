package fusion.um.view.backing;

import javax.faces.component.UISelectItems;

import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.RichDialog;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.RichQuery;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectBooleanCheckbox;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichGridCell;
import oracle.adf.view.rich.component.rich.layout.RichGridRow;
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGridLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichCommandButton;
import oracle.adf.view.rich.component.rich.nav.RichCommandImageLink;
import oracle.adf.view.rich.component.rich.output.RichOutputLabel;
import oracle.adf.view.rich.component.rich.output.RichPanelCollection;
import oracle.adf.view.rich.component.rich.output.RichSpacer;

import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.PopupFetchEvent;

import org.apache.myfaces.trinidad.component.UIXGroup;

import fusion.um.view.utils.ADFUtils;
import fusion.um.view.utils.JSFUtils;

import java.io.UnsupportedEncodingException;

import java.security.NoSuchAlgorithmException;

import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaRow;
import oracle.jbo.ViewObject;

public class SearchUser {
    private RichPanelGroupLayout pgl1;
    private RichPanelGridLayout pgl2;
    private RichGridRow gr1;
    private RichGridCell gc1;
    private RichGridCell gc2;
    private RichOutputLabel ol1;
    private RichQuery qryId1;
    private RichTable resId1;
    private RichSpacer s1;
    private RichPanelBox pb1;
    private RichPanelCollection pc1;
    private RichToolbar t1;
    private RichCommandImageLink cil1;
    private RichCommandImageLink cil2;
    private RichSpacer s2;
    private RichPopup p1;
    private RichDialog d1;
    private RichPanelFormLayout pfl1;
    private RichInputText it1;
    private RichInputText it2;
    private RichInputText it3;
    private RichSelectOneChoice soc4;
    private UISelectItems si4;
    private RichInputText it4;
    private RichInputText it5;
    private RichInputText it6;
    private RichSelectOneChoice soc5;
    private UISelectItems si5;
    private RichSelectOneChoice soc6;
    private UISelectItems si6;
    private RichSelectBooleanCheckbox sbc1;
    private RichCommandButton cb1;
    private UIXGroup g1;
    private RichSpacer s3;
    private RichCommandButton cb2;
    private RichPanelGroupLayout pgl3;
    private RichPopup p2;
    private RichDialog d2;
    private RichPanelFormLayout panelFormLayout1;
    private RichInputText inputText1;
    private RichInputText inputText2;
    private RichInputText inputText3;
    private RichSelectOneChoice selectOneChoice1;
    private UISelectItems selectItems1;
    private RichInputText inputText4;
    private RichInputText inputText5;
    private RichInputText inputText6;
    private RichSelectOneChoice selectOneChoice2;
    private UISelectItems selectItems2;
    private RichSelectOneChoice selectOneChoice3;
    private UISelectItems selectItems3;
    private RichSelectBooleanCheckbox selectBooleanCheckbox1;

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void setPgl2(RichPanelGridLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGridLayout getPgl2() {
        return pgl2;
    }

    public void setGr1(RichGridRow gr1) {
        this.gr1 = gr1;
    }

    public RichGridRow getGr1() {
        return gr1;
    }

    public void setGc1(RichGridCell gc1) {
        this.gc1 = gc1;
    }

    public RichGridCell getGc1() {
        return gc1;
    }

    public void setGc2(RichGridCell gc2) {
        this.gc2 = gc2;
    }

    public RichGridCell getGc2() {
        return gc2;
    }

    public void setOl1(RichOutputLabel ol1) {
        this.ol1 = ol1;
    }

    public RichOutputLabel getOl1() {
        return ol1;
    }


    public void setQryId1(RichQuery qryId1) {
        this.qryId1 = qryId1;
    }

    public RichQuery getQryId1() {
        return qryId1;
    }

    public void setResId1(RichTable resId1) {
        this.resId1 = resId1;
    }

    public RichTable getResId1() {
        return resId1;
    }

    public void setS1(RichSpacer s1) {
        this.s1 = s1;
    }

    public RichSpacer getS1() {
        return s1;
    }

    public void setPb1(RichPanelBox pb1) {
        this.pb1 = pb1;
    }

    public RichPanelBox getPb1() {
        return pb1;
    }

    public void setPc1(RichPanelCollection pc1) {
        this.pc1 = pc1;
    }

    public RichPanelCollection getPc1() {
        return pc1;
    }

    public void setT1(RichToolbar t1) {
        this.t1 = t1;
    }

    public RichToolbar getT1() {
        return t1;
    }

    public void setCil1(RichCommandImageLink cil1) {
        this.cil1 = cil1;
    }

    public RichCommandImageLink getCil1() {
        return cil1;
    }

    public void setCil2(RichCommandImageLink cil2) {
        this.cil2 = cil2;
    }

    public RichCommandImageLink getCil2() {
        return cil2;
    }

    public void setS2(RichSpacer s2) {
        this.s2 = s2;
    }

    public RichSpacer getS2() {
        return s2;
    }

    public void setP1(RichPopup p1) {
        this.p1 = p1;
    }

    public RichPopup getP1() {
        return p1;
    }

    public void setD1(RichDialog d1) {
        this.d1 = d1;
    }

    public RichDialog getD1() {
        return d1;
    }

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
    }

    public void setSoc4(RichSelectOneChoice soc4) {
        this.soc4 = soc4;
    }

    public RichSelectOneChoice getSoc4() {
        return soc4;
    }

    public void setSi4(UISelectItems si4) {
        this.si4 = si4;
    }

    public UISelectItems getSi4() {
        return si4;
    }

    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
    }

    public void setIt5(RichInputText it5) {
        this.it5 = it5;
    }

    public RichInputText getIt5() {
        return it5;
    }

    public void setIt6(RichInputText it6) {
        this.it6 = it6;
    }

    public RichInputText getIt6() {
        return it6;
    }


    public void setSoc5(RichSelectOneChoice soc5) {
        this.soc5 = soc5;
    }

    public RichSelectOneChoice getSoc5() {
        return soc5;
    }

    public void setSi5(UISelectItems si5) {
        this.si5 = si5;
    }

    public UISelectItems getSi5() {
        return si5;
    }

    public void setSoc6(RichSelectOneChoice soc6) {
        this.soc6 = soc6;
    }

    public RichSelectOneChoice getSoc6() {
        return soc6;
    }

    public void setSi6(UISelectItems si6) {
        this.si6 = si6;
    }

    public UISelectItems getSi6() {
        return si6;
    }

    public void setSbc1(RichSelectBooleanCheckbox sbc1) {
        this.sbc1 = sbc1;
    }

    public RichSelectBooleanCheckbox getSbc1() {
        return sbc1;
    }

    public void setCb1(RichCommandButton cb1) {
        this.cb1 = cb1;
    }

    public RichCommandButton getCb1() {
        return cb1;
    }

    public void setG1(UIXGroup g1) {
        this.g1 = g1;
    }

    public UIXGroup getG1() {
        return g1;
    }

    public void setS3(RichSpacer s3) {
        this.s3 = s3;
    }

    public RichSpacer getS3() {
        return s3;
    }

    public void setCb2(RichCommandButton cb2) {
        this.cb2 = cb2;
    }

    public RichCommandButton getCb2() {
        return cb2;
    }

    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }

    public void onClickCreate(ActionEvent actionEvent) {
        ADFUtils.findOperation("CreateInsert").execute();
        // RichPopup.PopupHints hints = new RichPopup.PopupHints();
        //getP1().show(hints);
        JSFUtils.showPopup(p2);

    }

    public void onClickEdit(ActionEvent actionEvent) {
        ADFUtils.findOperation("ExecuteWithParams").execute();
        JSFUtils.showPopup(p2);
//        AdfFacesContext.getCurrentInstance().addPartialTarget(pfl1);
    }

    public void onClickRollback(ActionEvent actionEvent) {
//        ADFUtils.findOperation("Rollback").execute();
    }

    public void onClickCommit(ActionEvent actionEvent) {
        ADFContext.getCurrent().getSessionScope().put("Message", "");
        String Msg = "";
        System.err.println(JSFUtils.resolveExpressionAsString("#{pageFlowScope.addEdit}"));
        if (JSFUtils.resolveExpressionAsString("#{pageFlowScope.addEdit}").trim().equalsIgnoreCase("add")) {
            System.out.println("1");
            RichInputText passwd =
                (RichInputText)JSFUtils.findComponentInRoot("it2");
            RichInputText confmPass =
                (RichInputText)JSFUtils.findComponentInRoot("it3");
            System.out.println("2");


            String pwd1 =
                passwd.getValue() == null ? null : passwd.getValue().toString();
            String pwd2 =
                confmPass.getValue() == null ? null : confmPass.getValue().toString();

            System.out.println("3");
            if (pwd1 != null && pwd2 != null) {
                if (pwd1.equalsIgnoreCase(pwd2)) {
                    try {
                        System.out.println("4");
                        //                        System.out.println(((String) ADFUtils.findIterator("MosmUserTVO1Iterator").getCurrentRow().getAttribute("UserName")).toUpperCase());
                        ADFUtils.findIterator("User_VO1Iterator").getCurrentRow().setAttribute("UserName",
                                                                                               ((String)ADFUtils.findIterator("User_VO1Iterator").getCurrentRow().getAttribute("UserName")).toUpperCase());
                        //                        System.out.println(EncryptPassword.getSHA1(pwd1));
                        ADFUtils.findIterator("User_VO1Iterator").getCurrentRow().setAttribute("UserPawd",
                                                                                               EncryptPassword.getSHA1(pwd1));
                    } catch (UnsupportedEncodingException uee) {
                        JSFUtils.addFacesWarningMessage("Unexpected error raise.Please contact System Admin");
                    } catch (NoSuchAlgorithmException nsae) {
                        JSFUtils.addFacesWarningMessage("Unexpected error raise.Please contact System Admin");
                    }
                    System.out.println("5");
                    ADFUtils.invokeEL("#{bindings.Commit.execute}");
                    JSFUtils.addFacesInformationMessage("Information Saved Successfully!..");
                    Msg = "S";

                } else {
                    System.out.println("6");
                    JSFUtils.addFacesWarningMessage("Passwords and Confirm Password must match");
                    Msg = "F";
                }
            } else {
                JSFUtils.addFacesInformationMessage("Passwords and Confirm Password must be entered");
                Msg = "F";
            }
        } else {
            System.err.println("outside the if ");
        }
        if (JSFUtils.resolveExpressionAsString("#{pageFlowScope.addEdit}").equalsIgnoreCase("edit")) {
            //            System.err.println("====Edit====");
            try {
                ADFUtils.findOperation("Commit").execute();
                ADFUtils.findIterator("User_ROVO1Iterator").executeQuery();
                JSFUtils.addFacesInformationMessage("Information Saved Successfully");
                Msg = "S";
            } catch (Exception e) {
                JSFUtils.addFacesWarningMessage("" + e.toString());
            }
            ADFUtils.findIterator("User_ROVO1Iterator").executeQuery();
            // mo.displayMessage("User Record Saved Scuccessfully", "");
        }
        ADFContext.getCurrent().getSessionScope().put("Message", Msg);
    }

    public void userEditPopup(PopupFetchEvent popupFetchEvent) {
        Object var = ADFContext.getCurrent().getPageFlowScope().get("addEdit");
        if(var!=null && "edit".equals(var)){
        
                ViewObject vo =
                    ADFUtils.findIterator("User_VO1Iterator").getViewObject();
                ViewCriteria vc = vo.createViewCriteria();
                // vo.getCurrentRow().getAttribute("UserId");
                ADFContext.getCurrent().getPageFlowScope().get("uid");
               
                System.out.println("userId value======" +
                                   ADFContext.getCurrent().getPageFlowScope().get("uid"));
                ViewCriteriaRow vcr = vc.createViewCriteriaRow();

                vcr.setAttribute("UserId",
                                 ADFContext.getCurrent().getPageFlowScope().get("uid"));

                vc.addRow(vcr);

                vo.applyViewCriteria(vc);

                vo.executeQuery();
            }
        
       
    }


    public void setP2(RichPopup p2) {
        this.p2 = p2;
    }

    public RichPopup getP2() {
        return p2;
    }

    public void setD2(RichDialog d2) {
        this.d2 = d2;
    }

    public RichDialog getD2() {
        return d2;
    }

    public void setPanelFormLayout1(RichPanelFormLayout panelFormLayout1) {
        this.panelFormLayout1 = panelFormLayout1;
    }

    public RichPanelFormLayout getPanelFormLayout1() {
        return panelFormLayout1;
    }

    public void setInputText1(RichInputText inputText1) {
        this.inputText1 = inputText1;
    }

    public RichInputText getInputText1() {
        return inputText1;
    }

    public void setInputText2(RichInputText inputText2) {
        this.inputText2 = inputText2;
    }

    public RichInputText getInputText2() {
        return inputText2;
    }

    public void setInputText3(RichInputText inputText3) {
        this.inputText3 = inputText3;
    }

    public RichInputText getInputText3() {
        return inputText3;
    }

    public void setSelectOneChoice1(RichSelectOneChoice selectOneChoice1) {
        this.selectOneChoice1 = selectOneChoice1;
    }

    public RichSelectOneChoice getSelectOneChoice1() {
        return selectOneChoice1;
    }

    public void setSelectItems1(UISelectItems selectItems1) {
        this.selectItems1 = selectItems1;
    }

    public UISelectItems getSelectItems1() {
        return selectItems1;
    }

    public void setInputText4(RichInputText inputText4) {
        this.inputText4 = inputText4;
    }

    public RichInputText getInputText4() {
        return inputText4;
    }

    public void setInputText5(RichInputText inputText5) {
        this.inputText5 = inputText5;
    }

    public RichInputText getInputText5() {
        return inputText5;
    }

    public void setInputText6(RichInputText inputText6) {
        this.inputText6 = inputText6;
    }

    public RichInputText getInputText6() {
        return inputText6;
    }

    public void setSelectOneChoice2(RichSelectOneChoice selectOneChoice2) {
        this.selectOneChoice2 = selectOneChoice2;
    }

    public RichSelectOneChoice getSelectOneChoice2() {
        return selectOneChoice2;
    }

    public void setSelectItems2(UISelectItems selectItems2) {
        this.selectItems2 = selectItems2;
    }

    public UISelectItems getSelectItems2() {
        return selectItems2;
    }

    public void setSelectOneChoice3(RichSelectOneChoice selectOneChoice3) {
        this.selectOneChoice3 = selectOneChoice3;
    }

    public RichSelectOneChoice getSelectOneChoice3() {
        return selectOneChoice3;
    }

    public void setSelectItems3(UISelectItems selectItems3) {
        this.selectItems3 = selectItems3;
    }

    public UISelectItems getSelectItems3() {
        return selectItems3;
    }

    public void setSelectBooleanCheckbox1(RichSelectBooleanCheckbox selectBooleanCheckbox1) {
        this.selectBooleanCheckbox1 = selectBooleanCheckbox1;
    }

    public RichSelectBooleanCheckbox getSelectBooleanCheckbox1() {
        return selectBooleanCheckbox1;
    }

    public void popUpDialog(DialogEvent dialogEvent) {
        if(dialogEvent.getOutcome()==DialogEvent.Outcome.ok){
            ADFContext.getCurrent().getSessionScope().put("Message", "");
            String Msg = "";
            System.err.println(JSFUtils.resolveExpressionAsString("#{pageFlowScope.addEdit}"));
            if (JSFUtils.resolveExpressionAsString("#{pageFlowScope.addEdit}").trim().equalsIgnoreCase("add")) {
                System.out.println("1");
                RichInputText passwd =
                    (RichInputText)JSFUtils.findComponentInRoot("it2");
                RichInputText confmPass =
                    (RichInputText)JSFUtils.findComponentInRoot("it3");
                System.out.println("2");


                String pwd1 =
                    passwd.getValue() == null ? null : passwd.getValue().toString();
                String pwd2 =
                    confmPass.getValue() == null ? null : confmPass.getValue().toString();

                System.out.println("3");
                if (pwd1 != null && pwd2 != null) {
                    if (pwd1.equalsIgnoreCase(pwd2)) {
                        try {
                            System.out.println("4");
                            //                        System.out.println(((String) ADFUtils.findIterator("MosmUserTVO1Iterator").getCurrentRow().getAttribute("UserName")).toUpperCase());
                            ADFUtils.findIterator("User_VO1Iterator").getCurrentRow().setAttribute("UserName",
                                                                                                   ((String)ADFUtils.findIterator("User_VO1Iterator").getCurrentRow().getAttribute("UserName")).toUpperCase());
                            //                        System.out.println(EncryptPassword.getSHA1(pwd1));
                            ADFUtils.findIterator("User_VO1Iterator").getCurrentRow().setAttribute("UserPawd",
                                                                                                   EncryptPassword.getSHA1(pwd1));
                        } catch (UnsupportedEncodingException uee) {
                            JSFUtils.addFacesWarningMessage("Unexpected error raise.Please contact System Admin");
                        } catch (NoSuchAlgorithmException nsae) {
                            JSFUtils.addFacesWarningMessage("Unexpected error raise.Please contact System Admin");
                        }
                        System.out.println("5");
                        ADFUtils.invokeEL("#{bindings.Commit.execute}");
                        JSFUtils.addFacesInformationMessage("Information Saved Successfully!..");
                        ADFUtils.findIterator("User_ROVO1Iterator").executeQuery();
                        AdfFacesContext.getCurrentInstance().addPartialTarget(resId1);
                        Msg = "S";

                    } else {
                        System.out.println("6");
                        JSFUtils.addFacesWarningMessage("Passwords and Confirm Password must match");
                        Msg = "F";
                    }
                } else {
                    JSFUtils.addFacesInformationMessage("Passwords and Confirm Password must be entered");
                    Msg = "F";
                }
            } else {
                System.err.println("outside the if ");
            }
            if (JSFUtils.resolveExpressionAsString("#{pageFlowScope.addEdit}").equalsIgnoreCase("edit")) {
                //            System.err.println("====Edit====");
                try {
                    ADFUtils.findOperation("Commit").execute();
                    ADFUtils.findIterator("User_ROVO1Iterator").executeQuery();
                    JSFUtils.addFacesInformationMessage("Information Saved Successfully");
                    Msg = "S";
                } catch (Exception e) {
                    JSFUtils.addFacesWarningMessage("" + e.toString());
                }
                ADFUtils.findIterator("User_ROVO1Iterator").executeQuery();
                AdfFacesContext.getCurrentInstance().addPartialTarget(resId1);
                // mo.displayMessage("User Record Saved Scuccessfully", "");
            }
            
            ADFContext.getCurrent().getSessionScope().put("Message", Msg);
        }
    }
}
