package fusion.um.view.backing.pages;

import fusion.apr.view.utils.ADFUtils;

import fusion.um.view.utils.JSFUtils;

import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.nav.RichCommandLink;
import oracle.adf.view.rich.component.rich.output.RichImage;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.component.rich.output.RichSpacer;

public class Dashboard {
    private RichForm f1;
    private RichDocument d1;
    private RichPanelGroupLayout pgl1;
    private RichSpacer s1;
    private RichPanelGroupLayout pgl2;
    private RichPanelGroupLayout pgl3;
    private RichCommandLink cl1;
    private RichPanelGroupLayout pgl4;
    private RichImage i1;
    private RichOutputText ot1;
    private RichSpacer s2;
    private RichPanelGroupLayout pgl5;
    private RichCommandLink cl3;
    private RichPanelGroupLayout pgl6;
    private RichImage i3;
    private RichOutputText ot3;
    private RichSpacer s3;
    private RichSpacer s4;
    private RichSpacer s5;
    private RichPanelGroupLayout panelGroupLayout1;
    private RichCommandLink commandLink1;
    private RichPanelGroupLayout panelGroupLayout2;
    private RichImage image1;
    private RichOutputText outputText1;
    private RichPanelGroupLayout panelGroupLayout3;
    private RichCommandLink commandLink2;
    private RichPanelGroupLayout panelGroupLayout4;
    private RichImage image2;
    private RichOutputText outputText2;
    private RichPanelGroupLayout panelGroupLayout5;
    private RichCommandLink commandLink3;
    private RichPanelGroupLayout panelGroupLayout6;
    private RichImage image3;
    private RichOutputText outputText3;
    private RichPanelGroupLayout panelGroupLayout7;
    private RichSpacer spacer1;
    private RichPanelGroupLayout panelGroupLayout8;
    private RichPanelGroupLayout panelGroupLayout13;
    private RichCommandLink commandLink6;
    private RichPanelGroupLayout panelGroupLayout14;
    private RichImage image6;
    private RichOutputText outputText6;
    private RichSpacer spacer4;
    private RichPanelGroupLayout panelGroupLayout15;
    private RichCommandLink commandLink7;
    private RichPanelGroupLayout panelGroupLayout16;
    private RichImage image7;
    private RichOutputText outputText7;
    private RichSpacer spacer5;
    private RichPanelGroupLayout panelGroupLayout17;
    private RichCommandLink commandLink8;
    private RichPanelGroupLayout panelGroupLayout18;
    private RichImage image8;
    private RichOutputText outputText8;
    private RichSpacer s6;
    private RichPanelGroupLayout panelGroupLayout19;
    private RichCommandLink commandLink9;
    private RichPanelGroupLayout panelGroupLayout20;
    private RichImage image9;
    private RichOutputText outputText9;
    private RichSpacer s7;
    private RichSpacer s1_fc;
    private RichPanelGroupLayout panelGroupLayout1_fc;
    private RichPanelGroupLayout panelGroupLayout2_fc;
    private RichCommandLink commandLink1_fc;
    private RichImage image1_fc;
    private RichOutputText outputText1_fc;
    private RichSpacer s2_fc;
    private RichPanelGroupLayout panelGroupLayout3_fc;
    private RichPanelGroupLayout panelGroupLayout4_fc;
    private RichCommandLink commandLink2_fc;
    private RichImage image2_fc;
    private RichOutputText outputText2_fc;
    private RichSpacer s3_fc;
    private RichPanelGroupLayout panelGroupLayout5_fc;
    private RichPanelGroupLayout panelGroupLayout6_fc;
    private RichCommandLink commandLink3_fc;
    private RichImage image3_fc;
    private RichOutputText outputText3_fc;
    private RichPopup dataMigrationPopup;

    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void setS1(RichSpacer s1) {
        this.s1 = s1;
    }

    public RichSpacer getS1() {
        return s1;
    }

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }

    public void setCl1(RichCommandLink cl1) {
        this.cl1 = cl1;
    }

    public RichCommandLink getCl1() {
        return cl1;
    }

    public void setPgl4(RichPanelGroupLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGroupLayout getPgl4() {
        return pgl4;
    }

    public void setI1(RichImage i1) {
        this.i1 = i1;
    }

    public RichImage getI1() {
        return i1;
    }

    public void setOt1(RichOutputText ot1) {
        this.ot1 = ot1;
    }

    public RichOutputText getOt1() {
        return ot1;
    }

    public void setS2(RichSpacer s2) {
        this.s2 = s2;
    }

    public RichSpacer getS2() {
        return s2;
    }

    public void setPgl5(RichPanelGroupLayout pgl5) {
        this.pgl5 = pgl5;
    }

    public RichPanelGroupLayout getPgl5() {
        return pgl5;
    }

    public void setCl3(RichCommandLink cl3) {
        this.cl3 = cl3;
    }

    public RichCommandLink getCl3() {
        return cl3;
    }

    public void setPgl6(RichPanelGroupLayout pgl6) {
        this.pgl6 = pgl6;
    }

    public RichPanelGroupLayout getPgl6() {
        return pgl6;
    }

    public void setI3(RichImage i3) {
        this.i3 = i3;
    }

    public RichImage getI3() {
        return i3;
    }

    public void setOt3(RichOutputText ot3) {
        this.ot3 = ot3;
    }

    public RichOutputText getOt3() {
        return ot3;
    }

    public void setS3(RichSpacer s3) {
        this.s3 = s3;
    }

    public RichSpacer getS3() {
        return s3;
    }


    public void setS4(RichSpacer s4) {
        this.s4 = s4;
    }

    public RichSpacer getS4() {
        return s4;
    }


    public void setS5(RichSpacer s5) {
        this.s5 = s5;
    }

    public RichSpacer getS5() {
        return s5;
    }


    public void setPanelGroupLayout1(RichPanelGroupLayout panelGroupLayout1) {
        this.panelGroupLayout1 = panelGroupLayout1;
    }

    public RichPanelGroupLayout getPanelGroupLayout1() {
        return panelGroupLayout1;
    }

    public void setCommandLink1(RichCommandLink commandLink1) {
        this.commandLink1 = commandLink1;
    }

    public RichCommandLink getCommandLink1() {
        return commandLink1;
    }

    public void setPanelGroupLayout2(RichPanelGroupLayout panelGroupLayout2) {
        this.panelGroupLayout2 = panelGroupLayout2;
    }

    public RichPanelGroupLayout getPanelGroupLayout2() {
        return panelGroupLayout2;
    }

    public void setImage1(RichImage image1) {
        this.image1 = image1;
    }

    public RichImage getImage1() {
        return image1;
    }

    public void setOutputText1(RichOutputText outputText1) {
        this.outputText1 = outputText1;
    }

    public RichOutputText getOutputText1() {
        return outputText1;
    }

    public void setPanelGroupLayout3(RichPanelGroupLayout panelGroupLayout3) {
        this.panelGroupLayout3 = panelGroupLayout3;
    }

    public RichPanelGroupLayout getPanelGroupLayout3() {
        return panelGroupLayout3;
    }

    public void setCommandLink2(RichCommandLink commandLink2) {
        this.commandLink2 = commandLink2;
    }

    public RichCommandLink getCommandLink2() {
        return commandLink2;
    }

    public void setPanelGroupLayout4(RichPanelGroupLayout panelGroupLayout4) {
        this.panelGroupLayout4 = panelGroupLayout4;
    }

    public RichPanelGroupLayout getPanelGroupLayout4() {
        return panelGroupLayout4;
    }

    public void setImage2(RichImage image2) {
        this.image2 = image2;
    }

    public RichImage getImage2() {
        return image2;
    }

    public void setOutputText2(RichOutputText outputText2) {
        this.outputText2 = outputText2;
    }

    public RichOutputText getOutputText2() {
        return outputText2;
    }

    public void setPanelGroupLayout5(RichPanelGroupLayout panelGroupLayout5) {
        this.panelGroupLayout5 = panelGroupLayout5;
    }

    public RichPanelGroupLayout getPanelGroupLayout5() {
        return panelGroupLayout5;
    }

    public void setCommandLink3(RichCommandLink commandLink3) {
        this.commandLink3 = commandLink3;
    }

    public RichCommandLink getCommandLink3() {
        return commandLink3;
    }

    public void setPanelGroupLayout6(RichPanelGroupLayout panelGroupLayout6) {
        this.panelGroupLayout6 = panelGroupLayout6;
    }

    public RichPanelGroupLayout getPanelGroupLayout6() {
        return panelGroupLayout6;
    }

    public void setImage3(RichImage image3) {
        this.image3 = image3;
    }

    public RichImage getImage3() {
        return image3;
    }

    public void setOutputText3(RichOutputText outputText3) {
        this.outputText3 = outputText3;
    }

    public RichOutputText getOutputText3() {
        return outputText3;
    }

    public void setPanelGroupLayout7(RichPanelGroupLayout panelGroupLayout7) {
        this.panelGroupLayout7 = panelGroupLayout7;
    }

    public RichPanelGroupLayout getPanelGroupLayout7() {
        return panelGroupLayout7;
    }

    public void setSpacer1(RichSpacer spacer1) {
        this.spacer1 = spacer1;
    }

    public RichSpacer getSpacer1() {
        return spacer1;
    }

    public void setPanelGroupLayout8(RichPanelGroupLayout panelGroupLayout8) {
        this.panelGroupLayout8 = panelGroupLayout8;
    }

    public RichPanelGroupLayout getPanelGroupLayout8() {
        return panelGroupLayout8;
    }


    public void setPanelGroupLayout13(RichPanelGroupLayout panelGroupLayout13) {
        this.panelGroupLayout13 = panelGroupLayout13;
    }

    public RichPanelGroupLayout getPanelGroupLayout13() {
        return panelGroupLayout13;
    }

    public void setCommandLink6(RichCommandLink commandLink6) {
        this.commandLink6 = commandLink6;
    }

    public RichCommandLink getCommandLink6() {
        return commandLink6;
    }

    public void setPanelGroupLayout14(RichPanelGroupLayout panelGroupLayout14) {
        this.panelGroupLayout14 = panelGroupLayout14;
    }

    public RichPanelGroupLayout getPanelGroupLayout14() {
        return panelGroupLayout14;
    }

    public void setImage6(RichImage image6) {
        this.image6 = image6;
    }

    public RichImage getImage6() {
        return image6;
    }

    public void setOutputText6(RichOutputText outputText6) {
        this.outputText6 = outputText6;
    }

    public RichOutputText getOutputText6() {
        return outputText6;
    }

    public void setSpacer4(RichSpacer spacer4) {
        this.spacer4 = spacer4;
    }

    public RichSpacer getSpacer4() {
        return spacer4;
    }

    public void setPanelGroupLayout15(RichPanelGroupLayout panelGroupLayout15) {
        this.panelGroupLayout15 = panelGroupLayout15;
    }

    public RichPanelGroupLayout getPanelGroupLayout15() {
        return panelGroupLayout15;
    }

    public void setCommandLink7(RichCommandLink commandLink7) {
        this.commandLink7 = commandLink7;
    }

    public RichCommandLink getCommandLink7() {
        return commandLink7;
    }

    public void setPanelGroupLayout16(RichPanelGroupLayout panelGroupLayout16) {
        this.panelGroupLayout16 = panelGroupLayout16;
    }

    public RichPanelGroupLayout getPanelGroupLayout16() {
        return panelGroupLayout16;
    }

    public void setImage7(RichImage image7) {
        this.image7 = image7;
    }

    public RichImage getImage7() {
        return image7;
    }

    public void setOutputText7(RichOutputText outputText7) {
        this.outputText7 = outputText7;
    }

    public RichOutputText getOutputText7() {
        return outputText7;
    }

    public void setSpacer5(RichSpacer spacer5) {
        this.spacer5 = spacer5;
    }

    public RichSpacer getSpacer5() {
        return spacer5;
    }

    public void setPanelGroupLayout17(RichPanelGroupLayout panelGroupLayout17) {
        this.panelGroupLayout17 = panelGroupLayout17;
    }

    public RichPanelGroupLayout getPanelGroupLayout17() {
        return panelGroupLayout17;
    }

    public void setCommandLink8(RichCommandLink commandLink8) {
        this.commandLink8 = commandLink8;
    }

    public RichCommandLink getCommandLink8() {
        return commandLink8;
    }

    public void setPanelGroupLayout18(RichPanelGroupLayout panelGroupLayout18) {
        this.panelGroupLayout18 = panelGroupLayout18;
    }

    public RichPanelGroupLayout getPanelGroupLayout18() {
        return panelGroupLayout18;
    }

    public void setImage8(RichImage image8) {
        this.image8 = image8;
    }

    public RichImage getImage8() {
        return image8;
    }

    public void setOutputText8(RichOutputText outputText8) {
        this.outputText8 = outputText8;
    }

    public RichOutputText getOutputText8() {
        return outputText8;
    }

    public void setS6(RichSpacer s6) {
        this.s6 = s6;
    }

    public RichSpacer getS6() {
        return s6;
    }

    public void setPanelGroupLayout19(RichPanelGroupLayout panelGroupLayout19) {
        this.panelGroupLayout19 = panelGroupLayout19;
    }

    public RichPanelGroupLayout getPanelGroupLayout19() {
        return panelGroupLayout19;
    }

    public void setCommandLink9(RichCommandLink commandLink9) {
        this.commandLink9 = commandLink9;
    }

    public RichCommandLink getCommandLink9() {
        return commandLink9;
    }

    public void setPanelGroupLayout20(RichPanelGroupLayout panelGroupLayout20) {
        this.panelGroupLayout20 = panelGroupLayout20;
    }

    public RichPanelGroupLayout getPanelGroupLayout20() {
        return panelGroupLayout20;
    }

    public void setImage9(RichImage image9) {
        this.image9 = image9;
    }

    public RichImage getImage9() {
        return image9;
    }

    public void setOutputText9(RichOutputText outputText9) {
        this.outputText9 = outputText9;
    }

    public RichOutputText getOutputText9() {
        return outputText9;
    }

    public void setS7(RichSpacer s7) {
        this.s7 = s7;
    }

    public RichSpacer getS7() {
        return s7;
    }

    public void setS1_fc(RichSpacer s1_fc) {
        this.s1_fc = s1_fc;
    }

    public RichSpacer getS1_fc() {
        return s1_fc;
    }

    public void setPanelGroupLayout1_fc(RichPanelGroupLayout panelGroupLayout1_fc) {
        this.panelGroupLayout1_fc = panelGroupLayout1_fc;
    }

    public RichPanelGroupLayout getPanelGroupLayout1_fc() {
        return panelGroupLayout1_fc;
    }

    public void setPanelGroupLayout2_fc(RichPanelGroupLayout panelGroupLayout2_fc) {
        this.panelGroupLayout2_fc = panelGroupLayout2_fc;
    }

    public RichPanelGroupLayout getPanelGroupLayout2_fc() {
        return panelGroupLayout2_fc;
    }

    public void setCommandLink1_fc(RichCommandLink commandLink1_fc) {
        this.commandLink1_fc = commandLink1_fc;
    }

    public RichCommandLink getCommandLink1_fc() {
        return commandLink1_fc;
    }

    public void setImage1_fc(RichImage image1_fc) {
        this.image1_fc = image1_fc;
    }

    public RichImage getImage1_fc() {
        return image1_fc;
    }

    public void setOutputText1_fc(RichOutputText outputText1_fc) {
        this.outputText1_fc = outputText1_fc;
    }

    public RichOutputText getOutputText1_fc() {
        return outputText1_fc;
    }

    public void setS2_fc(RichSpacer s2_fc) {
        this.s2_fc = s2_fc;
    }

    public RichSpacer getS2_fc() {
        return s2_fc;
    }

    public void setPanelGroupLayout3_fc(RichPanelGroupLayout panelGroupLayout3_fc) {
        this.panelGroupLayout3_fc = panelGroupLayout3_fc;
    }

    public RichPanelGroupLayout getPanelGroupLayout3_fc() {
        return panelGroupLayout3_fc;
    }

    public void setPanelGroupLayout4_fc(RichPanelGroupLayout panelGroupLayout4_fc) {
        this.panelGroupLayout4_fc = panelGroupLayout4_fc;
    }

    public RichPanelGroupLayout getPanelGroupLayout4_fc() {
        return panelGroupLayout4_fc;
    }

    public void setCommandLink2_fc(RichCommandLink commandLink2_fc) {
        this.commandLink2_fc = commandLink2_fc;
    }

    public RichCommandLink getCommandLink2_fc() {
        return commandLink2_fc;
    }

    public void setImage2_fc(RichImage image2_fc) {
        this.image2_fc = image2_fc;
    }

    public RichImage getImage2_fc() {
        return image2_fc;
    }

    public void setOutputText2_fc(RichOutputText outputText2_fc) {
        this.outputText2_fc = outputText2_fc;
    }

    public RichOutputText getOutputText2_fc() {
        return outputText2_fc;
    }

    public void setS3_fc(RichSpacer s3_fc) {
        this.s3_fc = s3_fc;
    }

    public RichSpacer getS3_fc() {
        return s3_fc;
    }

    public void setPanelGroupLayout5_fc(RichPanelGroupLayout panelGroupLayout5_fc) {
        this.panelGroupLayout5_fc = panelGroupLayout5_fc;
    }

    public RichPanelGroupLayout getPanelGroupLayout5_fc() {
        return panelGroupLayout5_fc;
    }

    public void setPanelGroupLayout6_fc(RichPanelGroupLayout panelGroupLayout6_fc) {
        this.panelGroupLayout6_fc = panelGroupLayout6_fc;
    }

    public RichPanelGroupLayout getPanelGroupLayout6_fc() {
        return panelGroupLayout6_fc;
    }

    public void setCommandLink3_fc(RichCommandLink commandLink3_fc) {
        this.commandLink3_fc = commandLink3_fc;
    }

    public RichCommandLink getCommandLink3_fc() {
        return commandLink3_fc;
    }

    public void setImage3_fc(RichImage image3_fc) {
        this.image3_fc = image3_fc;
    }

    public RichImage getImage3_fc() {
        return image3_fc;
    }

    public void setOutputText3_fc(RichOutputText outputText3_fc) {
        this.outputText3_fc = outputText3_fc;
    }

    public RichOutputText getOutputText3_fc() {
        return outputText3_fc;
    }

    public void onClickAddDataMigration(ActionEvent actionEvent) {
        // Add event code here...
      ADFUtils.findOperation("CreateInsert").execute();
      
        RichPopup.PopupHints hints = new RichPopup.PopupHints();
                     this.getDataMigrationPopup().show(hints);


    }

    public void setDataMigrationPopup(RichPopup dataMigrationPopup) {
        this.dataMigrationPopup = dataMigrationPopup;
    }

    public RichPopup getDataMigrationPopup() {
        return dataMigrationPopup;
    }

    public String onclickSave() {
        // Add event code here...
        JSFUtils.addFacesInformationMessage("Information Saved Successfully");
        return null;
    }
}
