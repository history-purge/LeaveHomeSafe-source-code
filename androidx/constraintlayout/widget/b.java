package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

public class b {
  String a;
  
  private b b;
  
  private int c;
  
  private float d;
  
  private String e;
  
  boolean f;
  
  private int g;
  
  public b(b paramb, Object paramObject) {
    this.a = paramb.a;
    this.b = paramb.b;
    a(paramObject);
  }
  
  public b(String paramString, b paramb, Object paramObject) {
    this.a = paramString;
    this.b = paramb;
    a(paramObject);
  }
  
  public static HashMap<String, b> a(HashMap<String, b> paramHashMap, View paramView) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    Class<?> clazz = paramView.getClass();
    for (String str : paramHashMap.keySet()) {
      b b1 = paramHashMap.get(str);
      try {
        if (str.equals("BackgroundColor")) {
          b1 = new b(b1, Integer.valueOf(((ColorDrawable)paramView.getBackground()).getColor()));
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("getMap");
          stringBuilder.append(str);
          b1 = new b(b1, clazz.getMethod(stringBuilder.toString(), new Class[0]).invoke(paramView, new Object[0]));
        } 
        hashMap.put(str, b1);
      } catch (NoSuchMethodException noSuchMethodException) {
        noSuchMethodException.printStackTrace();
      } catch (IllegalAccessException illegalAccessException) {
        illegalAccessException.printStackTrace();
      } catch (InvocationTargetException invocationTargetException) {
        invocationTargetException.printStackTrace();
      } 
    } 
    return (HashMap)hashMap;
  }
  
  public static void a(Context paramContext, XmlPullParser paramXmlPullParser, HashMap<String, b> paramHashMap) {
    String str;
    TypedArray typedArray = paramContext.obtainStyledAttributes(Xml.asAttributeSet(paramXmlPullParser), k.CustomAttribute);
    int j = typedArray.getIndexCount();
    XmlPullParser xmlPullParser = null;
    paramXmlPullParser = xmlPullParser;
    Object object1 = paramXmlPullParser;
    int i = 0;
    Object object2 = paramXmlPullParser;
    while (true) {
      int k;
      if (i < j) {
        k = typedArray.getIndex(i);
        if (k == k.CustomAttribute_attributeName) {
          str = typedArray.getString(k);
          String str1 = str;
          Object object3 = object2;
          Object object4 = object1;
          if (str != null) {
            str1 = str;
            object3 = object2;
            object4 = object1;
            if (str.length() > 0) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append(Character.toUpperCase(str.charAt(0)));
              stringBuilder.append(str.substring(1));
              String str2 = stringBuilder.toString();
              object3 = object2;
              object4 = object1;
            } 
          } 
          continue;
        } 
        if (k == k.CustomAttribute_customBoolean) {
          Boolean bool = Boolean.valueOf(typedArray.getBoolean(k, false));
          b b1 = b.h;
          String str1 = str;
          continue;
        } 
        if (k == k.CustomAttribute_customColorValue) {
          b b1 = b.e;
        } else if (k == k.CustomAttribute_customColorDrawableValue) {
          b b1 = b.f;
        } else {
          float f;
          if (k == k.CustomAttribute_customPixelDimension) {
            b b1 = b.i;
            f = TypedValue.applyDimension(1, typedArray.getDimension(k, 0.0F), paramContext.getResources().getDisplayMetrics());
          } else if (k == k.CustomAttribute_customDimension) {
            b b1 = b.i;
            f = typedArray.getDimension(k, 0.0F);
          } else if (k == k.CustomAttribute_customFloatValue) {
            b b1 = b.d;
            f = typedArray.getFloat(k, Float.NaN);
          } else {
            if (k == k.CustomAttribute_customIntegerValue) {
              b b1 = b.c;
              k = typedArray.getInteger(k, -1);
            } else {
              b b1;
              String str3 = str;
              Object object3 = object2;
              Object object4 = object1;
              if (k == k.CustomAttribute_customStringValue) {
                b1 = b.g;
                object3 = typedArray.getString(k);
              } else {
                continue;
              } 
              object4 = b1;
              str1 = str;
            } 
            Integer integer1 = Integer.valueOf(k);
          } 
          Float float_ = Float.valueOf(f);
          String str2 = str1;
          String str1 = str;
        } 
        k = typedArray.getColor(k, 0);
      } else {
        break;
      } 
      Integer integer = Integer.valueOf(k);
      i++;
      xmlPullParser = paramXmlPullParser;
      object2 = SYNTHETIC_LOCAL_VARIABLE_7;
      object1 = SYNTHETIC_LOCAL_VARIABLE_8;
    } 
    if (str != null && object2 != null)
      paramHashMap.put(str, new b(str, (b)object1, object2)); 
    typedArray.recycle();
  }
  
  public static void a(View paramView, HashMap<String, b> paramHashMap) {
    Class<?> clazz = paramView.getClass();
    for (String str1 : paramHashMap.keySet()) {
      StringBuilder stringBuilder1;
      b b1 = paramHashMap.get(str1);
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append("set");
      stringBuilder2.append(str1);
      String str2 = stringBuilder2.toString();
      try {
        Method method;
        ColorDrawable colorDrawable;
        switch (a.a[b1.b.ordinal()]) {
          case 7:
            clazz.getMethod(str2, new Class[] { float.class }).invoke(paramView, new Object[] { Float.valueOf(b1.d) });
          case 6:
            clazz.getMethod(str2, new Class[] { boolean.class }).invoke(paramView, new Object[] { Boolean.valueOf(b1.f) });
          case 5:
            clazz.getMethod(str2, new Class[] { CharSequence.class }).invoke(paramView, new Object[] { b1.e });
          case 4:
            clazz.getMethod(str2, new Class[] { float.class }).invoke(paramView, new Object[] { Float.valueOf(b1.d) });
          case 3:
            clazz.getMethod(str2, new Class[] { int.class }).invoke(paramView, new Object[] { Integer.valueOf(b1.c) });
          case 2:
            method = clazz.getMethod(str2, new Class[] { Drawable.class });
            colorDrawable = new ColorDrawable();
            colorDrawable.setColor(b1.g);
            method.invoke(paramView, new Object[] { colorDrawable });
          case 1:
            clazz.getMethod(str2, new Class[] { int.class }).invoke(paramView, new Object[] { Integer.valueOf(b1.g) });
        } 
      } catch (NoSuchMethodException noSuchMethodException) {
        Log.e("TransitionLayout", noSuchMethodException.getMessage());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" Custom Attribute \"");
        stringBuilder.append(str1);
        stringBuilder.append("\" not found on ");
        stringBuilder.append(clazz.getName());
        Log.e("TransitionLayout", stringBuilder.toString());
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append(clazz.getName());
        stringBuilder1.append(" must have a method ");
        stringBuilder1.append(str2);
        Log.e("TransitionLayout", stringBuilder1.toString());
      } catch (IllegalAccessException illegalAccessException) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" Custom Attribute \"");
        stringBuilder.append((String)stringBuilder1);
        stringBuilder.append("\" not found on ");
        stringBuilder.append(clazz.getName());
        Log.e("TransitionLayout", stringBuilder.toString());
        illegalAccessException.printStackTrace();
      } catch (InvocationTargetException invocationTargetException) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" Custom Attribute \"");
        stringBuilder.append((String)stringBuilder1);
        stringBuilder.append("\" not found on ");
        stringBuilder.append(clazz.getName());
        Log.e("TransitionLayout", stringBuilder.toString());
        invocationTargetException.printStackTrace();
      } 
    } 
  }
  
  public void a(Object paramObject) {
    switch (a.a[this.b.ordinal()]) {
      default:
        return;
      case 6:
        this.f = ((Boolean)paramObject).booleanValue();
        return;
      case 5:
        this.e = (String)paramObject;
        return;
      case 4:
      case 7:
        this.d = ((Float)paramObject).floatValue();
        return;
      case 3:
        this.c = ((Integer)paramObject).intValue();
        return;
      case 1:
      case 2:
        break;
    } 
    this.g = ((Integer)paramObject).intValue();
  }
  
  public enum b {
    c, d, e, f, g, h, i;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/constraintlayout/widget/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */