package com.view.beans.filmStrip;

import com.octetstring.vde.util.Base64;

import com.view.beans.filmStrip.SessionState;
import com.view.uiutils.ADFUtils;
import com.view.uiutils.JSFUtils;

import java.text.SimpleDateFormat;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

import javax.faces.event.PhaseId;
import oracle.adf.controller.v2.lifecycle.Lifecycle;
import oracle.adf.controller.v2.lifecycle.PagePhaseEvent;
import oracle.adf.controller.v2.lifecycle.PagePhaseListener;
import oracle.adf.model.BindingContext;
import oracle.adf.model.OperationBinding;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.jbo.Row;
import oracle.jbo.ViewObject;

import org.json.JSONObject;

public class FilmStripPhaseListener implements PagePhaseListener {
    
    private static final String DATE_FORMAT = "MM/dd/yyyy";
    private static final String CURRENCY_CODE = "AED";
    private static final String TIME_FORMAT = "HH24:MT";
    private static final String TIME_ZONE_FORMAT = "GT";
    private static final String NUMBER_FORMAT = "###,###,###,###";
    java.util.Map sessionMap = ADFContext.getCurrent().getSessionScope();
    private String jwt;
    public FilmStripPhaseListener() {
        super();
//        String jwt=JSFUtils.resolveExpression("#{param.jwt}")==null?"null":JSFUtils.resolveExpression("#{param.jwt}").toString();
//        setJwt(jwt);   
    }
    
   

    public void afterPhase(PagePhaseEvent phaseEvent) {
    }

    public void beforePhase(PagePhaseEvent phaseEvent) {
        if (phaseEvent.getPhaseId() == Lifecycle.PREPARE_RENDER_ID) {
            onPageLoad();
        }
    }

    public PhaseId getPhaseId() {
        return null;
    }
    public void onPageLoad(){
        if (!AdfFacesContext.getCurrentInstance().isPostback()) {
//          System.err.println("Token-->"+JSFUtils.resolveExpression("#{param.jwt}"));
          String jwt=JSFUtils.resolveExpression("#{pageFlowScope.token}")==null?null:JSFUtils.resolveExpression("#{pageFlowScope.token}").toString();
//          jwt="eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsIng1dCI6IlRBc0pMVXY0MFVuaWRJclVrRGFwRzhFXzlLOCJ9.eyJleHAiOjE0ODM1MzA3NzEsImlzcyI6Ind3dy5vcmFjbGUuY29tIiwicHJuIjoiYXBpIiwiaWF0IjoxNDgzNTE2MzcxfQ.ALvDilyGj-VQUmRQnUc7L1tz895bxjiSfPetczwqbUhMTmBIIoyJd9tKFQTnYPg8esUiiym8RnXRisFXcWmdmcoYAg3bbhqQ877KBDdXg6_CAk5h4OSHG8jgXhWFSJsE-";
          System.err.println("jwt-->"+jwt);
    // Sample Token
        //eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsIng1dCI6IlRBc0pMVXY0MFVuaWRJclVrRGFwRzhFXzlLOCJ9.eyJleHAiOjE0ODM1MzA3NzEsImlzcyI6Ind3dy5vcmFjbGUuY29tIiwicHJuIjoiYXBpIiwiaWF0IjoxNDgzNTE2MzcxfQ.ALvDilyGj-VQUmRQnUc7L1tz895bxjiSfPetczwqbUhMTmBIIoyJd9tKFQTnYPg8esUiiym8RnXRisFXcWmdmcoYAg3bbhqQ877KBDdXg6_CAk5h4OSHG8jgXhWFSJsE-
// Ken Token       
// jwt="eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsIng1dCI6IkI2MXZGVHlWa1ZzZ2JJNUFxM0pnaVV1Rmt6VSIsImtpZCI6InRydXN0c2VydmljZSJ9.eyJleHAiOjE1NjU4MDUzMjEsInN1YiI6Imtlbm5ldGguZGNvc3RhQG9tbml5YXQuY29tIiwiaXNzIjoid3d3Lm9yYWNsZS5jb20iLCJwcm4iOiJrZW5uZXRoLmRjb3N0YUBvbW5peWF0LmNvbSIsImlhdCI6MTU2NTc5MDkyMX0.SAZQR0xUTJWD2TRf6tTYAU249WUbMJdSW80YALciOobhy9JuaqnPXfKmwOIFNdAXy3DUqc1KiBbpxiUq7Tp2QAQDdcN3Agkgs2t68A-pbxJjUf4pw0tdWFtKVjoMaVSUQxPOya1p1_Um_L2dP1C8KRHKbTHGos4Dm0WU3dUQizMOGtJFbD35wBWhJ1LZ3gBkmAiDVhAMegVFe-h7lKJiQFrYBmo6_yCbgLRvzllCjjYel0QiJafkKppYqOzrwR4L4MDTggtuXm9y5dl0_O68os_T4CkKz9kwVg69H752GGkpWCPntVali1kzQQFvq2I3E2wUVFpQgKXg3pMFIMUcLA";
        String userRole = null;
        if (jwt != null) {
        System.err.println("==>in");
        String inputEncodedText = jwt;
                //ADFContext.getCurrent().getPageFlowScope().get("tokens").toString();
            try {
                String[] xIn = inputEncodedText.split("\\.");
                byte b[] = Base64.decode(xIn[1]);
                String tempPass = new String(b);
                int chkOccurance = tempPass.lastIndexOf("}");
                if (chkOccurance < 1) {
                    tempPass += "}";
                }
                JSONObject jo;

                jo = new JSONObject(tempPass);
        //                sessionMap.put("userName", jo.getString("prn"));
                //TODO commenting hard coded values since PROFILE_VALUED coming from lookup data
        //                System.err.println("User Name==" + sessionMap.get("userName"));
                System.err.println("PRN==>"+jo.getString("prn"));
                ViewObject getUserDetailsVO = ADFUtils.findIterator("checkUserROVO1Iterator").getViewObject();
                getUserDetailsVO .setNamedWhereClauseParam("USER_NAME", jo.getString("prn"));
                getUserDetailsVO .executeQuery();
               System.err.println("COUNT-->"+getUserDetailsVO.getEstimatedRowCount());
                if (getUserDetailsVO .getEstimatedRowCount() > 0) {
                    Row re = getUserDetailsVO .first();
                    if (re.getAttribute("LookupValueName") != null) {
                        userRole = re.getAttribute("LookupValueName").toString();
                        System.err.println("lookupupname"+userRole);
                    }
                    if(userRole.equalsIgnoreCase("SALES_ADMIN")){
                        ADFContext.getCurrent().getPageFlowScope().put("redirect","Dashboard");
                    }else{
                        System.err.println("Not Sale Admin");
                        ADFContext.getCurrent().getPageFlowScope().put("redirect","Error");
//                        pageRedirect = "invalidUser";
//                        ADFContext.getCurrent().getPageFlowScope().put("val","invalidUser");
                    }
                    
                    System.out.println("phase listener constructor called");
                    DCBindingContainer bindings =(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
                    OperationBinding oper = (OperationBinding)bindings.getControlBinding("applicationSessionSetup");
                    Map sessionMap = (Map)oper.execute();
                    ADFUtils.setEL("#{sessionScope.applicationSetup}", sessionMap);
                    SessionState sessionState = (SessionState)JSFUtils.getManagedBeanValue("sessionScope.SessionState");
                    if(sessionState==null){
                        sessionState = new SessionState();
                    }
                    sessionState.parseRootMenu();
                    JSFUtils.setManagedBeanValue("sessionScope.SessionState", sessionState);
                    String groupNodeId = "AdminModule";
                    String itemNodeId =  sessionState.getHomePage();
                    if(ADFContext.getCurrent().getSessionScope().get("selectedItemId")==null){
                        ADFContext.getCurrent().getSessionScope().put("selectedGroupId", groupNodeId);
                        ADFContext.getCurrent().getSessionScope().put("selectedItemId", itemNodeId);
                        ADFContext.getCurrent().getSessionScope().put("disableGoHome", "N");
                        if (groupNodeId.equalsIgnoreCase(itemNodeId)){
                            ADFContext.getCurrent().getSessionScope().put("hideStrip", true);
                            ADFContext.getCurrent().getSessionScope().put("hideStripToggle", true);
                        } else {
                            ADFContext.getCurrent().getSessionScope().put("hideStrip", false);
                            ADFContext.getCurrent().getSessionScope().put("hideStripToggle", false);
                        }
                    } 
                    
                    //                        pageRedirect = "validUser";
                    //                        ADFContext.getCurrent().getPageFlowScope().put("val","validUser"); 
                    
                } else {
                    System.err.println("Not in Db");
                    ADFContext.getCurrent().getPageFlowScope().put("redirect","Error");
                    
//                    pageRedirect = "invalidUser";
//                    ADFContext.getCurrent().getPageFlowScope().put("val","invalidUser");
                }
            } catch (Exception e) {
                ADFContext.getCurrent().getPageFlowScope().put("redirect","Error");
            }
        } else {
            ADFContext.getCurrent().getPageFlowScope().put("redirect","Error");
            System.err.println("No Token");
//            pageRedirect = "invalidUser";  inter
//            ADFContext.getCurrent().getPageFlowScope().put("val","invalidUser");
        }
          System.err.println("pageflow==>"+ ADFContext.getCurrent().getPageFlowScope().get("redirect"));    
    }
}

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}


