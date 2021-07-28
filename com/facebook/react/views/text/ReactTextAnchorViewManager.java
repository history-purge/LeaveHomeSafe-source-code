package com.facebook.react.views.text;

import android.text.TextUtils;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.e1.a;
import com.facebook.react.uimanager.e1.b;
import com.facebook.react.uimanager.q;
import com.facebook.yoga.g;

public abstract class ReactTextAnchorViewManager<T extends View, C extends h> extends BaseViewManager<T, C> {
  private static final int[] SPACING_TYPES = new int[] { 8, 0, 2, 1, 3 };
  
  @a(name = "adjustsFontSizeToFit")
  public void setAdjustFontSizeToFit(r paramr, boolean paramBoolean) {
    paramr.setAdjustFontSizeToFit(paramBoolean);
  }
  
  @b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
  public void setBorderColor(r paramr, int paramInt, Integer paramInteger) {
    float f1;
    float f2 = Float.NaN;
    if (paramInteger == null) {
      f1 = Float.NaN;
    } else {
      f1 = (paramInteger.intValue() & 0xFFFFFF);
    } 
    if (paramInteger != null)
      f2 = (paramInteger.intValue() >>> 24); 
    paramr.a(SPACING_TYPES[paramInt], f1, f2);
  }
  
  @b(defaultFloat = NaNF, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
  public void setBorderRadius(r paramr, int paramInt, float paramFloat) {
    float f = paramFloat;
    if (!g.a(paramFloat))
      f = q.b(paramFloat); 
    if (paramInt == 0) {
      paramr.setBorderRadius(f);
      return;
    } 
    paramr.a(f, paramInt - 1);
  }
  
  @a(name = "borderStyle")
  public void setBorderStyle(r paramr, String paramString) {
    paramr.setBorderStyle(paramString);
  }
  
  @b(defaultFloat = NaNF, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
  public void setBorderWidth(r paramr, int paramInt, float paramFloat) {
    float f = paramFloat;
    if (!g.a(paramFloat))
      f = q.b(paramFloat); 
    paramr.a(SPACING_TYPES[paramInt], f);
  }
  
  @a(name = "dataDetectorType")
  public void setDataDetectorType(r paramr, String paramString) {
    byte b;
    switch (paramString.hashCode()) {
      default:
        b = -1;
        break;
      case 96619420:
        if (paramString.equals("email")) {
          b = 2;
          break;
        } 
      case 3387192:
        if (paramString.equals("none")) {
          b = 4;
          break;
        } 
      case 3321850:
        if (paramString.equals("link")) {
          b = 1;
          break;
        } 
      case 96673:
        if (paramString.equals("all")) {
          b = 3;
          break;
        } 
      case -1192969641:
        if (paramString.equals("phoneNumber")) {
          b = 0;
          break;
        } 
    } 
    if (b != 0) {
      if (b != 1) {
        if (b != 2) {
          if (b != 3) {
            paramr.setLinkifyMask(0);
            return;
          } 
          paramr.setLinkifyMask(15);
          return;
        } 
        paramr.setLinkifyMask(2);
        return;
      } 
      paramr.setLinkifyMask(1);
      return;
    } 
    paramr.setLinkifyMask(4);
  }
  
  @a(defaultBoolean = false, name = "disabled")
  public void setDisabled(r paramr, boolean paramBoolean) {
    paramr.setEnabled(paramBoolean ^ true);
  }
  
  @a(name = "ellipsizeMode")
  public void setEllipsizeMode(r paramr, String paramString) {
    StringBuilder stringBuilder;
    TextUtils.TruncateAt truncateAt;
    if (paramString == null || paramString.equals("tail")) {
      truncateAt = TextUtils.TruncateAt.END;
    } else if (truncateAt.equals("head")) {
      truncateAt = TextUtils.TruncateAt.START;
    } else if (truncateAt.equals("middle")) {
      truncateAt = TextUtils.TruncateAt.MIDDLE;
    } else if (truncateAt.equals("clip")) {
      truncateAt = null;
    } else {
      stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid ellipsizeMode: ");
      stringBuilder.append((String)truncateAt);
      throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
    } 
    stringBuilder.setEllipsizeLocation(truncateAt);
  }
  
  @a(defaultBoolean = true, name = "includeFontPadding")
  public void setIncludeFontPadding(r paramr, boolean paramBoolean) {
    paramr.setIncludeFontPadding(paramBoolean);
  }
  
  @a(name = "onInlineViewLayout")
  public void setNotifyOnInlineViewLayout(r paramr, boolean paramBoolean) {
    paramr.setNotifyOnInlineViewLayout(paramBoolean);
  }
  
  @a(defaultInt = 2147483647, name = "numberOfLines")
  public void setNumberOfLines(r paramr, int paramInt) {
    paramr.setNumberOfLines(paramInt);
  }
  
  @a(name = "selectable")
  public void setSelectable(r paramr, boolean paramBoolean) {
    paramr.setTextIsSelectable(paramBoolean);
  }
  
  @a(customType = "Color", name = "selectionColor")
  public void setSelectionColor(r paramr, Integer paramInteger) {
    int i;
    if (paramInteger == null) {
      i = d.b(paramr.getContext());
    } else {
      i = paramInteger.intValue();
    } 
    paramr.setHighlightColor(i);
  }
  
  @a(name = "textAlignVertical")
  public void setTextAlignVertical(r paramr, String paramString) {
    StringBuilder stringBuilder;
    byte b;
    if (paramString == null || "auto".equals(paramString)) {
      b = 0;
    } else if ("top".equals(paramString)) {
      b = 48;
    } else if ("bottom".equals(paramString)) {
      b = 80;
    } else if ("center".equals(paramString)) {
      b = 16;
    } else {
      stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid textAlignVertical: ");
      stringBuilder.append(paramString);
      throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
    } 
    stringBuilder.setGravityVertical(b);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/text/ReactTextAnchorViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */