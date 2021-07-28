package com.facebook.react.fabric;

import java.util.HashMap;
import java.util.Map;

public class a {
  private static final Map<String, String> a = new HashMap<String, String>();
  
  static {
    a.put("View", "RCTView");
    a.put("Image", "RCTImageView");
    a.put("ScrollView", "RCTScrollView");
    a.put("Slider", "RCTSlider");
    a.put("ModalHostView", "RCTModalHostView");
    a.put("Paragraph", "RCTText");
    a.put("Text", "RCText");
    a.put("RawText", "RCTRawText");
    a.put("ActivityIndicatorView", "AndroidProgressBar");
    a.put("ShimmeringView", "RKShimmeringView");
    a.put("TemplateView", "RCTTemplateView");
    a.put("AxialGradientView", "RCTAxialGradientView");
    a.put("Video", "RCTVideo");
    a.put("StickerInputView", "RCTStickerInputView");
    a.put("Map", "RCTMap");
    a.put("WebView", "RCTWebView");
  }
  
  static String a(String paramString) {
    String str = a.get(paramString);
    if (str != null)
      paramString = str; 
    return paramString;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/fabric/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */