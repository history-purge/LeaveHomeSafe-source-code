package b.g.e.d;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class b {
  private final Shader a;
  
  private final ColorStateList b;
  
  private int c;
  
  private b(Shader paramShader, ColorStateList paramColorStateList, int paramInt) {
    this.a = paramShader;
    this.b = paramColorStateList;
    this.c = paramInt;
  }
  
  static b a(ColorStateList paramColorStateList) {
    return new b(null, paramColorStateList, paramColorStateList.getDefaultColor());
  }
  
  private static b a(Resources paramResources, int paramInt, Resources.Theme paramTheme) {
    XmlResourceParser xmlResourceParser = paramResources.getXml(paramInt);
    AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
    while (true) {
      paramInt = xmlResourceParser.next();
      if (paramInt != 2 && paramInt != 1)
        continue; 
      break;
    } 
    if (paramInt == 2) {
      StringBuilder stringBuilder;
      String str = xmlResourceParser.getName();
      paramInt = -1;
      int i = str.hashCode();
      if (i != 89650992) {
        if (i == 1191572447 && str.equals("selector"))
          paramInt = 0; 
      } else if (str.equals("gradient")) {
        paramInt = 1;
      } 
      if (paramInt != 0) {
        if (paramInt == 1)
          return a(d.a(paramResources, (XmlPullParser)xmlResourceParser, attributeSet, paramTheme)); 
        stringBuilder = new StringBuilder();
        stringBuilder.append(xmlResourceParser.getPositionDescription());
        stringBuilder.append(": unsupported complex color tag ");
        stringBuilder.append(str);
        throw new XmlPullParserException(stringBuilder.toString());
      } 
      return a(a.a((Resources)stringBuilder, (XmlPullParser)xmlResourceParser, attributeSet, paramTheme));
    } 
    XmlPullParserException xmlPullParserException = new XmlPullParserException("No start tag found");
    throw xmlPullParserException;
  }
  
  static b a(Shader paramShader) {
    return new b(paramShader, null, 0);
  }
  
  static b b(int paramInt) {
    return new b(null, null, paramInt);
  }
  
  public static b b(Resources paramResources, int paramInt, Resources.Theme paramTheme) {
    try {
      return a(paramResources, paramInt, paramTheme);
    } catch (Exception exception) {
      Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", exception);
      return null;
    } 
  }
  
  public int a() {
    return this.c;
  }
  
  public void a(int paramInt) {
    this.c = paramInt;
  }
  
  public boolean a(int[] paramArrayOfint) {
    if (d()) {
      ColorStateList colorStateList = this.b;
      int i = colorStateList.getColorForState(paramArrayOfint, colorStateList.getDefaultColor());
      if (i != this.c) {
        this.c = i;
        return true;
      } 
    } 
    return false;
  }
  
  public Shader b() {
    return this.a;
  }
  
  public boolean c() {
    return (this.a != null);
  }
  
  public boolean d() {
    if (this.a == null) {
      ColorStateList colorStateList = this.b;
      if (colorStateList != null && colorStateList.isStateful())
        return true; 
    } 
    return false;
  }
  
  public boolean e() {
    return (c() || this.c != 0);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/e/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */