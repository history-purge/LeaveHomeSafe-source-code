package b.g.e.d;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class a {
  private static int a(int paramInt, float paramFloat) {
    return paramInt & 0xFFFFFF | Math.round(Color.alpha(paramInt) * paramFloat) << 24;
  }
  
  public static ColorStateList a(Resources paramResources, int paramInt, Resources.Theme paramTheme) {
    try {
      return a(paramResources, (XmlPullParser)paramResources.getXml(paramInt), paramTheme);
    } catch (Exception exception) {
      Log.e("CSLCompat", "Failed to inflate ColorStateList.", exception);
      return null;
    } 
  }
  
  public static ColorStateList a(Resources paramResources, XmlPullParser paramXmlPullParser, Resources.Theme paramTheme) {
    int i;
    AttributeSet attributeSet = Xml.asAttributeSet(paramXmlPullParser);
    while (true) {
      i = paramXmlPullParser.next();
      if (i != 2 && i != 1)
        continue; 
      break;
    } 
    if (i == 2)
      return a(paramResources, paramXmlPullParser, attributeSet, paramTheme); 
    XmlPullParserException xmlPullParserException = new XmlPullParserException("No start tag found");
    throw xmlPullParserException;
  }
  
  public static ColorStateList a(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    String str = paramXmlPullParser.getName();
    if (str.equals("selector"))
      return b(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramXmlPullParser.getPositionDescription());
    stringBuilder.append(": invalid color state list tag ");
    stringBuilder.append(str);
    throw new XmlPullParserException(stringBuilder.toString());
  }
  
  private static TypedArray a(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, int[] paramArrayOfint) {
    return (paramTheme == null) ? paramResources.obtainAttributes(paramAttributeSet, paramArrayOfint) : paramTheme.obtainStyledAttributes(paramAttributeSet, paramArrayOfint, 0, 0);
  }
  
  private static ColorStateList b(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface getDepth : ()I
    //   6: iconst_1
    //   7: iadd
    //   8: istore #10
    //   10: bipush #20
    //   12: anewarray [I
    //   15: astore #13
    //   17: aload #13
    //   19: arraylength
    //   20: newarray int
    //   22: astore #14
    //   24: iconst_0
    //   25: istore #5
    //   27: aload_1
    //   28: invokeinterface next : ()I
    //   33: istore #6
    //   35: iload #6
    //   37: iconst_1
    //   38: if_icmpeq -> 343
    //   41: aload_1
    //   42: invokeinterface getDepth : ()I
    //   47: istore #7
    //   49: iload #7
    //   51: iload #10
    //   53: if_icmpge -> 62
    //   56: iload #6
    //   58: iconst_3
    //   59: if_icmpeq -> 343
    //   62: iload #6
    //   64: iconst_2
    //   65: if_icmpne -> 340
    //   68: iload #7
    //   70: iload #10
    //   72: if_icmpgt -> 340
    //   75: aload_1
    //   76: invokeinterface getName : ()Ljava/lang/String;
    //   81: ldc 'item'
    //   83: invokevirtual equals : (Ljava/lang/Object;)Z
    //   86: ifne -> 92
    //   89: goto -> 340
    //   92: aload_0
    //   93: aload_3
    //   94: aload_2
    //   95: getstatic b/g/d.ColorStateListItem : [I
    //   98: invokestatic a : (Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   101: astore #15
    //   103: aload #15
    //   105: getstatic b/g/d.ColorStateListItem_android_color : I
    //   108: ldc -65281
    //   110: invokevirtual getColor : (II)I
    //   113: istore #11
    //   115: fconst_1
    //   116: fstore #4
    //   118: aload #15
    //   120: getstatic b/g/d.ColorStateListItem_android_alpha : I
    //   123: invokevirtual hasValue : (I)Z
    //   126: ifeq -> 147
    //   129: getstatic b/g/d.ColorStateListItem_android_alpha : I
    //   132: istore #6
    //   134: aload #15
    //   136: iload #6
    //   138: fconst_1
    //   139: invokevirtual getFloat : (IF)F
    //   142: fstore #4
    //   144: goto -> 166
    //   147: aload #15
    //   149: getstatic b/g/d.ColorStateListItem_alpha : I
    //   152: invokevirtual hasValue : (I)Z
    //   155: ifeq -> 166
    //   158: getstatic b/g/d.ColorStateListItem_alpha : I
    //   161: istore #6
    //   163: goto -> 134
    //   166: aload #15
    //   168: invokevirtual recycle : ()V
    //   171: aload_2
    //   172: invokeinterface getAttributeCount : ()I
    //   177: istore #12
    //   179: iload #12
    //   181: newarray int
    //   183: astore #15
    //   185: iconst_0
    //   186: istore #6
    //   188: iconst_0
    //   189: istore #7
    //   191: iload #6
    //   193: iload #12
    //   195: if_icmpge -> 292
    //   198: aload_2
    //   199: iload #6
    //   201: invokeinterface getAttributeNameResource : (I)I
    //   206: istore #9
    //   208: iload #7
    //   210: istore #8
    //   212: iload #9
    //   214: ldc 16843173
    //   216: if_icmpeq -> 279
    //   219: iload #7
    //   221: istore #8
    //   223: iload #9
    //   225: ldc 16843551
    //   227: if_icmpeq -> 279
    //   230: iload #7
    //   232: istore #8
    //   234: iload #9
    //   236: getstatic b/g/a.alpha : I
    //   239: if_icmpeq -> 279
    //   242: aload_2
    //   243: iload #6
    //   245: iconst_0
    //   246: invokeinterface getAttributeBooleanValue : (IZ)Z
    //   251: ifeq -> 261
    //   254: iload #9
    //   256: istore #8
    //   258: goto -> 266
    //   261: iload #9
    //   263: ineg
    //   264: istore #8
    //   266: aload #15
    //   268: iload #7
    //   270: iload #8
    //   272: iastore
    //   273: iload #7
    //   275: iconst_1
    //   276: iadd
    //   277: istore #8
    //   279: iload #6
    //   281: iconst_1
    //   282: iadd
    //   283: istore #6
    //   285: iload #8
    //   287: istore #7
    //   289: goto -> 191
    //   292: aload #15
    //   294: iload #7
    //   296: invokestatic trimStateSet : ([II)[I
    //   299: astore #15
    //   301: aload #14
    //   303: iload #5
    //   305: iload #11
    //   307: fload #4
    //   309: invokestatic a : (IF)I
    //   312: invokestatic a : ([III)[I
    //   315: astore #14
    //   317: aload #13
    //   319: iload #5
    //   321: aload #15
    //   323: invokestatic a : ([Ljava/lang/Object;ILjava/lang/Object;)[Ljava/lang/Object;
    //   326: checkcast [[I
    //   329: astore #13
    //   331: iload #5
    //   333: iconst_1
    //   334: iadd
    //   335: istore #5
    //   337: goto -> 340
    //   340: goto -> 27
    //   343: iload #5
    //   345: newarray int
    //   347: astore_0
    //   348: iload #5
    //   350: anewarray [I
    //   353: astore_1
    //   354: aload #14
    //   356: iconst_0
    //   357: aload_0
    //   358: iconst_0
    //   359: iload #5
    //   361: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   364: aload #13
    //   366: iconst_0
    //   367: aload_1
    //   368: iconst_0
    //   369: iload #5
    //   371: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   374: new android/content/res/ColorStateList
    //   377: dup
    //   378: aload_1
    //   379: aload_0
    //   380: invokespecial <init> : ([[I[I)V
    //   383: areturn
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/e/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */