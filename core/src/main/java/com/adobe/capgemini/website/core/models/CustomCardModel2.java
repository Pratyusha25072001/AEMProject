package com.adobe.capgemini.website.core.models;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
 
import javax.inject.Inject;
import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
 
@Model(adaptables = Resource.class)
public class CustomCardModel2 {
 
    @ValueMapValue
    private String logoImage;
 
    @ValueMapValue
    private String logoImage1;
 
    @ValueMapValue
    private String logoImage2;
 
    @ValueMapValue
    private String logoImage3;
 
    @ValueMapValue
    private String brandText;
 
    @ValueMapValue
    private String FooterText;
 
    @ValueMapValue
    private String SocialImage;
//     @ValueMapValue
//     private String SocialLinkImage;
 
    @ValueMapValue
    private String SocialImage1;
 
//     @ValueMapValue
//     private String SocialLinkImage1;
 
    @ValueMapValue
    private String SocialImage2;
 
//      @ValueMapValue
//     private String SocialLinkImage2;
 
    @ValueMapValue
    private String SocialImage3;
 
//      @ValueMapValue
//     private String SocialLinkImage3;
 
    @ValueMapValue
    private String SocialImage4;
 
//      @ValueMapValue
//     private String SocialLinkImage4;
//     // @ValueMapValue
//     // private String brandImage;
//     // @ValueMapValue
//     // private String brandText;
//     // @ValueMapValue
//     // private String brandLink;
 
//     // @ValueMapValue
//     // private String brandImage1;
//     // @ValueMapValue
//     // private String brandText1;
//     // @ValueMapValue
//     // private String brandLink1;
 
//     // @ValueMapValue
//     // private String brandImage2;
//     // @ValueMapValue
//     // private String brandText2;
//     // @ValueMapValue
//     // private String brandLink2;
 
    @ValueMapValue
    private String footerLink1Text;
    @ValueMapValue
    private String footerLink1URL;
    @ValueMapValue
    private String footerLink2Text;
    @ValueMapValue
    private String footerLink2URL;
    @ValueMapValue
    private String footerLink3Text;
    @ValueMapValue
    private String footerLink3URL;
    @ValueMapValue
    private String footerLink4Text;
    @ValueMapValue
    private String footerLink4URL;
    @ValueMapValue
    private String footerLink5Text;
    @ValueMapValue
    private String footerLink5URL;
    @ValueMapValue
    private String footerLink6Text;
    @ValueMapValue
    private String footerLink6URL;
    @ValueMapValue
    private String footerLink7Text;
    @ValueMapValue
    private String footerLink7URL;
    @ValueMapValue
    private String footerLink8Text;
    @ValueMapValue
    private String footerLink8URL;
    @ValueMapValue
    private String footerLink9Text;
    @ValueMapValue
    private String footerLink9URL;
    @ValueMapValue
    private String footerLink10Text;
    @ValueMapValue
    private String footerLink10URL;
    @ValueMapValue
    private String footerLink11Text;
    @ValueMapValue
    private String footerLink11URL;
    @ValueMapValue
    private String footerLink12Text;
    @ValueMapValue
    private String footerLink12URL;
    @ValueMapValue
    private String footerLink13Text;
    @ValueMapValue
    private String footerLink13URL;
    @ValueMapValue
    private String footerLink14Text;
    @ValueMapValue
    private String footerLink14URL;
    @ValueMapValue
    private String footerLink15Text;
    @ValueMapValue
    private String footerLink15URL;
 
    @SlingObject
    private Resource resource;
 
    private String fullLogoPath;
    private String fullLogoPath1;
    private String fullLogoPath2;
    private String fullLogoPath3;
    private String fullSocialPath;
    private String fullSocialPath1;
     private String fullSocialPath2;
      private String fullSocialPath3;
       private String fullSocialPath4;
//     // private String fullBrandImagePath;
//     // private String fullBrandImagePath1;
//     // private String fullBrandImagePath2;
 
    @PostConstruct
    protected void init() {
        fullLogoPath = getFullImagePath(logoImage);
        fullLogoPath1 = getFullImagePath(logoImage1);
        fullLogoPath2 = getFullImagePath(logoImage2);
        fullLogoPath3 = getFullImagePath(logoImage3);
        fullSocialPath = getFullSocialPath(SocialImage);
        fullSocialPath1 = getFullSocialPath(SocialImage1);
        fullSocialPath2 = getFullSocialPath(SocialImage2);
        fullSocialPath3 = getFullSocialPath(SocialImage3);
        fullSocialPath4 = getFullSocialPath(SocialImage4);
//         // fullBrandImagePath = getFullImagePath(brandImage);
//         // fullBrandImagePath1 = getFullImagePath(brandImage1);
//         // fullBrandImagePath2 = getFullImagePath(brandImage2);
     }
 
    private String getFullImagePath(String imagePath) {
        if (imagePath != null && !imagePath.isEmpty()) {
            if (!imagePath.startsWith("/content/dam")) {
                return "/content/dam" + imagePath;
            }
            return imagePath;
        }
        return null;
    }
 
    private String getFullSocialPath(String socialImagePath) {
        if (socialImagePath != null && !socialImagePath.isEmpty()) {
            if (!socialImagePath.startsWith("/content/dam")) {
                return "/content/dam" + socialImagePath;
            }
            return socialImagePath;
        }
        return null;
    }
 
 
    public String getLogoImage() {
        return fullLogoPath;
    }
 
 
    public String getLogoImage1() {
        return fullLogoPath1;
    }
 
    public String getLogoImage2() {
        return fullLogoPath2;
    }
 
    public String getLogoImage3() {
        return fullLogoPath3;
    }
 
    public String getSocialImage() {
        return fullSocialPath;
    }
   
    public String getSocialImage1() {
        return fullSocialPath1;
    }
 
    public String getSocialImage2() {
        return fullSocialPath2;
    }
 
    public String getSocialImage3() {
        return fullSocialPath3;
    }
 
    public String getSocialImage4() {
        return fullSocialPath4;
    }
    public String getBrandText() {
         return brandText != null && !brandText.isEmpty() ? brandText : "Our brands:";
     }
 
    public String getFooterText() {
        return FooterText != null && !FooterText.isEmpty() ? FooterText : "@";
    }
 
    public String getFooterLink1URL() {
        return footerLink1URL != null ? footerLink1URL : "#";
    }
 
    public String getFooterLink1Text() {
        return footerLink1Text != null ? footerLink1Text : "Default Link 1 Text";
    }
 
    public String getFooterLink2Text() {
        return footerLink2Text != null ? footerLink2Text : "Default Link 2 Text";
    }
 
    public String getFooterLink2URL() {
        return footerLink2URL != null ? footerLink2URL : "#";
    }
 
    public String getFooterLink3Text() {
        return footerLink3Text != null ? footerLink3Text : "Default Link 3 Text";
    }
 
    public String getFooterLink3URL() {
        return footerLink3URL != null ? footerLink3URL : "#";
    }
 
    public String getFooterLink4Text() {
        return footerLink4Text != null ? footerLink4Text : "Default Link 4 Text";
    }
 
    public String getFooterLink4URL() {
        return footerLink4URL != null ? footerLink4URL : "#";
    }
 
    public String getFooterLink5Text() {
        return footerLink5Text != null ? footerLink5Text : "Default Link 5 Text";
    }
 
    public String getFooterLink5URL() {
        return footerLink5URL != null ? footerLink5URL : "#";
    }
 
    public String getFooterLink6Text() {
        return footerLink6Text != null ? footerLink6Text : "Default Link 6 Text";
    }
 
    public String getFooterLink6URL() {
        return footerLink6URL != null ? footerLink6URL : "#";
    }
 
    public String getFooterLink7Text() {
        return footerLink7Text != null ? footerLink7Text : "Default Link 7 Text";
    }
 
    public String getFooterLink7URL() {
        return footerLink7URL != null ? footerLink7URL : "#";
    }
 
    public String getFooterLink8Text() {
        return footerLink8Text != null ? footerLink8Text : "Default Link 8 Text";
    }
 
    public String getFooterLink8URL() {
        return footerLink8URL != null ? footerLink8URL : "#";
    }
    public String getFooterLink9Text() {
    return footerLink9Text != null ? footerLink9Text : "Default Link 9 Text";
}
 
public String getFooterLink9URL() {
    return footerLink9URL != null ? footerLink9URL : "#";
}
 
public String getFooterLink10Text() {
    return footerLink10Text != null ? footerLink10Text : "Default Link 10 Text";
}
 
public String getFooterLink10URL() {
    return footerLink10URL != null ? footerLink10URL : "#";
}
 
public String getFooterLink11Text() {
    return footerLink11Text != null ? footerLink11Text : "Default Link 11 Text";
}
 
public String getFooterLink11URL() {
    return footerLink11URL != null ? footerLink11URL : "#";
}
 
public String getFooterLink12Text() {
    return footerLink12Text != null ? footerLink12Text : "Default Link 12 Text";
}
 
public String getFooterLink12URL() {
    return footerLink12URL != null ? footerLink12URL : "#";
}
 
public String getFooterLink13Text() {
    return footerLink13Text != null ? footerLink13Text : "Default Link 13 Text";
}
 
public String getFooterLink13URL() {
    return footerLink13URL != null ? footerLink13URL : "#";
}
 
public String getFooterLink14Text() {
    return footerLink14Text != null ? footerLink14Text : "Default Link 14 Text";
}
 
public String getFooterLink14URL() {
    return footerLink14URL != null ? footerLink14URL : "#";
}
 
public String getFooterLink15Text() {
    return footerLink15Text != null ? footerLink15Text : "Default Link 15 Text";
}
 
public String getFooterLink15URL() {
    return footerLink15URL != null ? footerLink15URL : "#";
}
 
// public String getSocialLinkImage() {
//         return SocialLinkImage != null ? SocialLinkImage : "#";
//     }
 
// public String getSocialLinkImage1() {
//         return SocialLinkImage1 != null ? SocialLinkImage1 : "#";
//     }
 
// public String getSocialLinkImage2() {
//         return SocialLinkImage2 != null ? SocialLinkImage2 : "#";
//     }
//     public String getSocialLinkImage3() {
//         return SocialLinkImage3 != null ? SocialLinkImage3 : "#";
//     }
//     public String getSocialLinkImage4() {
//         return SocialLinkImage4 != null ? SocialLinkImage4 : "#";
//     }
}
