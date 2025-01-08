package com.adobe.capgemini.website.core.models;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Component(service = CustomCardModel.class)
public class CustomCardModel {

    @Inject
    private String blueCardTitle;

    @Inject
    private String blueCardSubtitle;

    @Inject
    private String blueCardButtonText;

    @Inject
    private String fileReference; 

    @Inject
    private String whiteCardLabel;

    @Inject
    private String whiteCardTitle;

    @Inject
    private String whiteCardLinkText;

    @Activate
    protected void activate() {
        System.out.println("Model activated with:");
        System.out.println("Blue Card Title: " + blueCardTitle);
        System.out.println("Blue Card Subtitle: " + blueCardSubtitle);
        System.out.println("Button Text: " + blueCardButtonText);
        System.out.println("Background Image: " + fileReference); 
        System.out.println("White Card Label: " + whiteCardLabel);
        System.out.println("White Card Title: " + whiteCardTitle);
        System.out.println("White Card Link Text: " + whiteCardLinkText);
    }

   
    public String getBlueCardTitle() {
        return blueCardTitle;
    }

    public void setBlueCardTitle(String blueCardTitle) {
        this.blueCardTitle = blueCardTitle;
    }

    public String getBlueCardSubtitle() {
        return blueCardSubtitle;
    }

    public void setBlueCardSubtitle(String blueCardSubtitle) {
        this.blueCardSubtitle = blueCardSubtitle;
    }

    public String getBlueCardButtonText() {
        return blueCardButtonText;
    }

    public void setBlueCardButtonText(String blueCardButtonText) {
        this.blueCardButtonText = blueCardButtonText;
    }

    public String getFileReference() {
        return fileReference;
    }

    public void setFileReference(String fileReference) {
        this.fileReference = fileReference;
    }

    public String getWhiteCardLabel() {
        return whiteCardLabel;
    }

    public void setWhiteCardLabel(String whiteCardLabel) {
        this.whiteCardLabel = whiteCardLabel;
    }

    public String getWhiteCardTitle() {
        return whiteCardTitle;
    }

    public void setWhiteCardTitle(String whiteCardTitle) {
        this.whiteCardTitle = whiteCardTitle;
    }

    public String getWhiteCardLinkText() {
        return whiteCardLinkText;
    }

    public void setWhiteCardLinkText(String whiteCardLinkText) {
        this.whiteCardLinkText = whiteCardLinkText;
    }
}