package b.g.e.d;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

public class g {
  public static float a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt, float paramFloat) {
    return !a(paramXmlPullParser, paramString) ? paramFloat : paramTypedArray.getFloat(paramInt, paramFloat);
  }
  
  public static int a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt1, int paramInt2) {
    return !a(paramXmlPullParser, paramString) ? paramInt2 : paramTypedArray.getColor(paramInt1, paramInt2);
  }
  
  public static ColorStateList a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, Resources.Theme paramTheme, String paramString, int paramInt) {
    if (a(paramXmlPullParser, paramString)) {
      TypedValue typedValue = new TypedValue();
      paramTypedArray.getValue(paramInt, typedValue);
      int i = typedValue.type;
      if (i != 2)
        return (i >= 28 && i <= 31) ? a(typedValue) : a.a(paramTypedArray.getResources(), paramTypedArray.getResourceId(paramInt, 0), paramTheme); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Failed to resolve attribute at index ");
      stringBuilder.append(paramInt);
      stringBuilder.append(": ");
      stringBuilder.append(typedValue);
      throw new UnsupportedOperationException(stringBuilder.toString());
    } 
    return null;
  }
  
  private static ColorStateList a(TypedValue paramTypedValue) {
    return ColorStateList.valueOf(paramTypedValue.data);
  }
  
  public static TypedArray a(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, int[] paramArrayOfint) {
    return (paramTheme == null) ? paramResources.obtainAttributes(paramAttributeSet, paramArrayOfint) : paramTheme.obtainStyledAttributes(paramAttributeSet, paramArrayOfint, 0, 0);
  }
  
  public static b a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, Resources.Theme paramTheme, String paramString, int paramInt1, int paramInt2) {
    if (a(paramXmlPullParser, paramString)) {
      TypedValue typedValue = new TypedValue();
      paramTypedArray.getValue(paramInt1, typedValue);
      int i = typedValue.type;
      if (i >= 28 && i <= 31)
        return b.b(typedValue.data); 
      b b = b.b(paramTypedArray.getResources(), paramTypedArray.getResourceId(paramInt1, 0), paramTheme);
      if (b != null)
        return b; 
    } 
    return b.b(paramInt2);
  }
  
  public static String a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt) {
    return !a(paramXmlPullParser, paramString) ? null : paramTypedArray.getString(paramInt);
  }
  
  public static boolean a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt, boolean paramBoolean) {
    return !a(paramXmlPullParser, paramString) ? paramBoolean : paramTypedArray.getBoolean(paramInt, paramBoolean);
  }
  
  public static boolean a(XmlPullParser paramXmlPullParser, String paramString) {
    return (paramXmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", paramString) != null);
  }
  
  public static int b(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt1, int paramInt2) {
    return !a(paramXmlPullParser, paramString) ? paramInt2 : paramTypedArray.getInt(paramInt1, paramInt2);
  }
  
  public static TypedValue b(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt) {
    return !a(paramXmlPullParser, paramString) ? null : paramTypedArray.peekValue(paramInt);
  }
  
  public static int c(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt1, int paramInt2) {
    return !a(paramXmlPullParser, paramString) ? paramInt2 : paramTypedArray.getResourceId(paramInt1, paramInt2);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/e/d/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */