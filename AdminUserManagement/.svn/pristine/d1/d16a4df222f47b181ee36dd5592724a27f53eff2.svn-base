package fusion.um.view.backing;

import fusion.um.view.utils.ADFUtils;

import java.io.IOException;

import java.text.DateFormat;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import javax.faces.model.SelectItem;

import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;

import oracle.adf.view.rich.component.rich.nav.RichGoLink;
import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.binding.OperationBinding;

import oracle.jbo.Row;
import oracle.jbo.ViewObject;

import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.BindingContext;
import oracle.binding.BindingContainer;
import oracle.adf.model.AttributeBinding;

import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;

public class ReportsPfb {
    
    Map<String,ArrayList<SelectItem>> paramsMap;
    Map<String,String> paramsType;
    Map<String,String> paramsDisplay;
    List<String> params;
    private RichPanelGroupLayout dynamicParamsPGL;
    Map<String,String> paramsSelectedValue;
    private RichSelectOneChoice reportLOVBinding;
    private String reportPath;
    private RichGoLink goLink;

    public ReportsPfb() {
        super();
    }

    public void reportsValueChangeListener(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        FacesContext.getCurrentInstance().renderResponse();
        String reportId = valueChangeEvent.getNewValue()!=null ? valueChangeEvent.getNewValue().toString() : null;
//        System.out.println("called reportsValueChangeListener:reportId->"+reportId);
        paramsMap = new HashMap<String,ArrayList<SelectItem>>();
        paramsType = new HashMap<String,String>();
        paramsDisplay = new HashMap<String,String>();
        params = new ArrayList<String>();
        paramsSelectedValue = new HashMap<String,String>();
        if(reportId!=null){
        ViewObject vo = ADFUtils.findIterator("Functions_VO1Iterator").getViewObject();
        vo.applyViewCriteria(vo.getViewCriteriaManager().getViewCriteria("FindByFuncId"));
        vo.setNamedWhereClauseParam("BV_ID", reportId);
        vo.setRangeSize(-1);
        vo.executeQuery();
        Row row;
        if(vo.getEstimatedRowCount()>0){
            row = vo.getAllRowsInRange()[0];
            reportPath = row.getAttribute("PagePath")!=null ? row.getAttribute("PagePath").toString() : "";
        }
        vo = ADFUtils.findIterator("XxfndReportParamsVoIterator").getViewObject();
        vo.applyViewCriteria(vo.getViewCriteriaManager().getViewCriteria("FindByFuncId"));
        vo.setNamedWhereClauseParam("b_FuncId", reportId);
        vo.setRangeSize(-1);
        vo.executeQuery();
        Row[] rows = vo.getAllRowsInRange();
        OperationBinding operationBinding = ADFUtils.findOperation("getLOVValues");
        for(int i=0;i<rows.length;i++){
            row=rows[i];
            Map mapObj = operationBinding.getParamsMap();
//            System.out.println("called reportsValueChangeListener:ParamTable"+row.getAttribute("ParamTable"));
//            System.out.println("called reportsValueChangeListener:ParamColumn"+row.getAttribute("ParamColumn"));
//            System.out.println("called reportsValueChangeListener:ParamDispColumn"+row.getAttribute("ParamDispColumn"));
//            System.out.println("called reportsValueChangeListener:ParamLookupType"+row.getAttribute("ParamLookupType"));
            if(row.getAttribute("ParamTable")!=null && row.getAttribute("ParamColumn")!=null && row.getAttribute("ParamDispColumn")!=null
                    && row.getAttribute("ParamLookupType")==null){
                mapObj.put("tableName", row.getAttribute("ParamTable"));
                mapObj.put("value", row.getAttribute("ParamColumn"));
                mapObj.put("displayValue", row.getAttribute("ParamDispColumn"));
                mapObj.put("lookupType", null);
                paramsMap.put((String)row.getAttribute("Token"),(ArrayList<SelectItem>)operationBinding.execute());
                params.add(row.getAttribute("Token").toString());
                paramsType.put((String)row.getAttribute("Token"), "LOV");
                paramsDisplay.put((String)row.getAttribute("Token"), (String)row.getAttribute("ParamName"));
            }
            else if(row.getAttribute("ParamTable")==null && row.getAttribute("ParamColumn")==null && row.getAttribute("ParamDispColumn")==null
                        && row.getAttribute("ParamLookupType")!=null){
                mapObj.put("tableName", null);
                mapObj.put("value", null);
                mapObj.put("displayValue", null);
                mapObj.put("lookupType", row.getAttribute("ParamLookupType"));
                paramsMap.put((String)row.getAttribute("Token"),(ArrayList<SelectItem>)operationBinding.execute());
                params.add(row.getAttribute("Token").toString());
                paramsType.put((String)row.getAttribute("Token"), "LOV");
                paramsDisplay.put((String)row.getAttribute("Token"), (String)row.getAttribute("ParamName"));
            }
            else if(row.getAttribute("ParamTable")==null && row.getAttribute("ParamColumn")==null && row.getAttribute("ParamDispColumn")==null
                        && row.getAttribute("ParamLookupType")==null){
                params.add(row.getAttribute("Token").toString());
                paramsDisplay.put((String)row.getAttribute("Token"), (String)row.getAttribute("ParamName"));
                if(row.getAttribute("DataType")!=null){
                    if(row.getAttribute("DataType").toString().equalsIgnoreCase("C")){
                        paramsType.put((String)row.getAttribute("Token"), "CHAR");
                    }
                    else if(row.getAttribute("DataType").toString().equalsIgnoreCase("N")){
                        paramsType.put((String)row.getAttribute("Token"), "NUMBER");
                    }
                    else if(row.getAttribute("DataType").toString().equalsIgnoreCase("D")){
                        paramsType.put((String)row.getAttribute("Token"), "DATE");
                    }
                }
                else{
                    paramsType.put((String)row.getAttribute("Token"), "CHAR");
                }
            }
        }
//        System.out.println("called reportsValueChangeListener:refreshing panel group");
//        System.out.println("called reportsValueChangeListener:paramsMap->"+paramsMap);
//        System.out.println("called reportsValueChangeListener:params->"+params);
//        System.out.println("called reportsValueChangeListener:paramsType->"+paramsType);
    }   
        AdfFacesContext.getCurrentInstance().addPartialTarget(dynamicParamsPGL);
    }

    public void setDynamicParamsPGL(RichPanelGroupLayout dynamicParamsPGL) {
        this.dynamicParamsPGL = dynamicParamsPGL;
    }

    public RichPanelGroupLayout getDynamicParamsPGL() {
        return dynamicParamsPGL;
    }

    public void setParamsMap(Map<String, ArrayList<SelectItem>> paramsMap) {
        this.paramsMap = paramsMap;
    }

    public Map<String, ArrayList<SelectItem>> getParamsMap() {
        return paramsMap;
    }

    public void setParamsType(Map<String, String> paramsType) {
        this.paramsType = paramsType;
    }

    public Map<String, String> getParamsType() {
        return paramsType;
    }

    public void setParams(List<String> params) {
        this.params = params;
    }

    public List<String> getParams() {
        return params;
    }

    public void setParamsSelectedValue(Map<String, String> paramsSelectedValue) {
        this.paramsSelectedValue = paramsSelectedValue;
    }

    public Map<String, String> getParamsSelectedValue() {
        return paramsSelectedValue;
    }

    public void paramValueChangeListener(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        String value = valueChangeEvent.getNewValue().toString();
        String paramName = (String)valueChangeEvent.getComponent().getAttributes().get("paramName");
//        System.out.println("value:"+value+" paramName:"+paramName);
        paramsSelectedValue.remove(paramName);
        paramsSelectedValue.put(paramName,value);
    }

    public void getReport(ActionEvent actionEvent) {
        // Add event code here...
//        System.out.println("called getReport");
        Object[] paramNameObj = paramsSelectedValue.keySet().toArray();
        String reportPath = this.reportPath;
        reportPath = reportPath.concat("?");
        System.out.println("Report path from LOV:"+reportPath);
//        System.out.println("paramNameObj:"+paramNameObj);
        for(int i=0;i<paramNameObj.length;i++){
            String paramName = (String)paramNameObj[i];
            System.out.println("paramName:"+paramName);
            Object selectedValue = paramsSelectedValue.get(paramName);
//            System.out.println("calss:"+selectedValue.getClass().getName());
            if(selectedValue.getClass().getName().equalsIgnoreCase("java.util.Date")){
                Map sessionApplicationSetup = (Map)ADFContext.getCurrent().getSessionScope().get("applicationSetup");
                //String dFormat = (String)sessionApplicationSetup.get("REPORT_DATE_FORMAT");
                String dFormat = "dd-MM-yyyy";
                System.out.println("Date format:"+dFormat);
                DateFormat dateFormat = new SimpleDateFormat(dFormat);  
                String strDate = dateFormat.format(paramsSelectedValue.get(paramName));  
                System.out.println("Converted String: " + strDate);
                if(i==0){
                    reportPath = reportPath.concat(paramName+"="+strDate);
                }else{
                    reportPath = reportPath.concat("&"+paramName+"="+strDate);
                }
            }
            else{
                System.out.println(paramsSelectedValue.get(paramName).toString());
                if(i==0){
                    reportPath = reportPath.concat(paramName+"="+paramsSelectedValue.get(paramName).toString());
                }else{
                    reportPath = reportPath.concat("&"+paramName+"="+paramsSelectedValue.get(paramName).toString());
                }
            }
//            System.out.println("paramName:"+paramName);
//            System.out.println("selectedValue:"+selectedValue);
        }
        System.out.println("Final Report PAth:"+reportPath);
//        FacesContext faces = FacesContext.getCurrentInstance();
//        ExternalContext context =  faces.getExternalContext();
//        try{
//            context.redirect(reportPath);
//        }
//        catch(IOException e){
//            e.printStackTrace();
//        }
//        goLink.setDestination(reportPath);
        FacesContext fctx = FacesContext.getCurrentInstance();
        String taskflowURL = reportPath;
        ExtendedRenderKitService erks = Service.getRenderKitService(fctx, ExtendedRenderKitService.class);
        StringBuilder script = new StringBuilder();
        script.append("window.open(\"" + taskflowURL + "\");");
        erks.addScript(fctx, script.toString());
        paramsSelectedValue.clear();
        reportLOVBinding.resetValue();
        AdfFacesContext.getCurrentInstance().addPartialTarget(reportLOVBinding);
        AdfFacesContext.getCurrentInstance().addPartialTarget(dynamicParamsPGL);
    }

    public void setReportLOVBinding(RichSelectOneChoice reportLOVBinding) {
        this.reportLOVBinding = reportLOVBinding;
    }

    public RichSelectOneChoice getReportLOVBinding() {
        return reportLOVBinding;
    }

    public void setReportPath(String reportPath) {
        this.reportPath = reportPath;
    }

    public String getReportPath() {
        return reportPath;
    }

    public void setGoLink(RichGoLink goLink) {
        this.goLink = goLink;
    }

    public RichGoLink getGoLink() {
        return goLink;
    }

    public void setParamsDisplay(Map<String, String> paramsDisplay) {
        this.paramsDisplay = paramsDisplay;
    }

    public Map<String, String> getParamsDisplay() {
        return paramsDisplay;
    }
}
