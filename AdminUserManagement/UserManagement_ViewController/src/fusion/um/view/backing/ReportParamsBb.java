package fusion.um.view.backing;

import fusion.um.view.utils.ADFUtils;

import java.util.Map;

import javax.faces.event.ActionEvent;

import oracle.adf.share.ADFContext;

import oracle.jbo.ViewObject;
import oracle.jbo.domain.Number;


public class ReportParamsBb {
    private static final String ITERATOR = "XxfndReportParamsVoIterator";

    public ReportParamsBb() {
        super();
    }

    /**
     * method to invoke on click of create a new row
     * @param actionEvent
     */
    public void onClickCreate(ActionEvent actionEvent) {
        Map map = ADFContext.getCurrent().getPageFlowScope();
        Number funcId = null;
        if (map.get("pFuncId") != null) {
            funcId = (Number)map.get("pFuncId");
        }      
        ViewObject vo = ADFUtils.findIterator(ITERATOR).getViewObject();
        int count = (int)vo.getEstimatedRowCount();
        int countIncre = count + 1;
        ADFUtils.findOperation("CreateInsert").execute();
        ADFUtils.setBoundAttributeValue("SeqNumber",new Number(countIncre));
        ADFUtils.setBoundAttributeValue("FuncId",funcId);       
    }
}
