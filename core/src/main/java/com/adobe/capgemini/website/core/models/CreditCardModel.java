package com.adobe.capgemini.website.core.models;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.Self;
import com.adobe.cq.dam.cfm.ContentFragment;
import com.adobe.cq.dam.cfm.ContentElement;
import com.day.cq.wcm.api.Page;
import org.apache.commons.lang3.StringUtils;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CreditCardModel {

    @Inject
    @Self
    private Resource resource;

    @Inject
    private ResourceResolver resourceResolver;

    private ContentFragment contentFragment;

    @PostConstruct
    public void init() {
        // Initialize and get the content fragment
        Resource fragmentResource = resourceResolver.getResource("/content/dam/we-retail/credit-card");
        if (fragmentResource != null) {
            contentFragment = fragmentResource.adaptTo(ContentFragment.class);
        }
    }

    // Getters for each editable property from Content Fragment

    public String getTitle() {
        return getContentFromFragment("title");
    }

    public String getImage() {
        return getContentFromFragment("image");
    }

    public String getInformation() {
        return getContentFromFragment("information");
    }

    public String getExpiry() {
        return getContentFromFragment("expiry");
    }

    public String getDateyear() {
        return getContentFromFragment("dateyear");
    }

    public String getName() {
        return getContentFromFragment("name");
    }

    public String getImage1() {
        return getContentFromFragment("image1");
    }

    // Helper method to get the content from Content Fragment or fallback to dialog JCR data
    private String getContentFromFragment(String elementName) {
        if (contentFragment != null) {
            ContentElement element = contentFragment.getElement(elementName);
            if (element != null && StringUtils.isNotEmpty(element.getContent())) {
                return element.getContent();
            }
        }
        // Optionally, fetch data from dialog JCR node here if needed
        return resource.getValueMap().get(elementName, String.class);
    }
}


// import javax.annotation.PostConstruct;
// import javax.inject.Inject;

// import org.apache.sling.api.resource.Resource;
// import org.apache.sling.api.resource.ResourceResolver;
// import org.apache.sling.models.annotations.DefaultInjectionStrategy;
// import org.apache.sling.models.annotations.Model;
// import org.apache.sling.models.annotations.injectorspecific.Self;
// import com.adobe.cq.dam.cfm.ContentFragment;
// import com.adobe.cq.dam.cfm.ContentElement;
// import com.day.cq.wcm.api.Page;
// import org.apache.commons.lang3.StringUtils;

// @Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
// public class CreditCardModel {

//     @Inject
//     @Self
//     private Resource resource;

//     @Inject
//     private ResourceResolver resourceResolver;

//     private ContentFragment contentFragment;

//     @PostConstruct
//     public void init() {
//         // Initialize and get the content fragment
//         Resource fragmentResource = resourceResolver.getResource("/content/dam/we-retail/credit-card");
//         if (fragmentResource != null) {
//             contentFragment = fragmentResource.adaptTo(ContentFragment.class);
//         }
//     }

//     // Getters and Setters for each editable property

//     public String getTitle() {
//         return getContentFromFragment("title");
//     }

//     public void setTitle(String title) {
//         // Save the title back to the ContentFragment or JCR node
//     }

//     public String getImage() {
//         return getContentFromFragment("image");
//     }

//     public void setImage(String image) {
//         // Save the image path back to the ContentFragment or JCR node
//     }

//     public String getInformation() {
//         return getContentFromFragment("information");
//     }

//     public void setInformation(String information) {
//         // Save the information back to the ContentFragment or JCR node
//     }

//     public String getExpiry() {
//         return getContentFromFragment("expiry");
//     }

//     public void setExpiry(String expiry) {
//         // Save the expiry value back to the ContentFragment or JCR node
//     }

//     public String getDateyear() {
//         return getContentFromFragment("dateyear");
//     }

//     public void setDateyear(String dateyear) {
//         // Save the dateyear value back to the ContentFragment or JCR node
//     }

//     public String getName() {
//         return getContentFromFragment("name");
//     }

//     public void setName(String name) {
//         // Save the name value back to the ContentFragment or JCR node
//     }

//     public String getImage1() {
//         return getContentFromFragment("image1");
//     }

//     public void setImage1(String image1) {
//         // Save the second image path back to the ContentFragment or JCR node
//     }

//     private String getContentFromFragment(String elementName) {
//         if (contentFragment != null) {
//             ContentElement element = contentFragment.getElement(elementName);
//             if (element != null && StringUtils.isNotEmpty(element.getContent())) {
//                 return element.getContent();
//             }
//         }
//         return "";
//     }
// }
