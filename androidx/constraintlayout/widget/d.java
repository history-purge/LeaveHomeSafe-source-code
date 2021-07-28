package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class d {
  private SparseArray<a> a = new SparseArray();
  
  private SparseArray<e> b = new SparseArray();
  
  d(Context paramContext, ConstraintLayout paramConstraintLayout, int paramInt) {
    a(paramContext, paramInt);
  }
  
  private void a(Context paramContext, int paramInt) {
    XmlResourceParser xmlResourceParser = paramContext.getResources().getXml(paramInt);
    StringBuilder stringBuilder = null;
    try {
      paramInt = xmlResourceParser.getEventType();
    } catch (XmlPullParserException xmlPullParserException) {
      xmlPullParserException.printStackTrace();
      return;
    } catch (IOException iOException) {
      iOException.printStackTrace();
      return;
    } 
    while (true) {
      if (paramInt != 1) {
        StringBuilder stringBuilder1;
        if (paramInt != 0) {
          if (paramInt != 2) {
            stringBuilder1 = stringBuilder;
          } else {
            String str = xmlResourceParser.getName();
            paramInt = -1;
            switch (str.hashCode()) {
              case 1901439077:
                if (str.equals("Variant"))
                  paramInt = 3; 
                break;
              case 1657696882:
                if (str.equals("layoutDescription"))
                  paramInt = 0; 
                break;
              case 1382829617:
                if (str.equals("StateSet"))
                  paramInt = 1; 
                break;
              case 80204913:
                if (str.equals("State"))
                  paramInt = 2; 
                break;
              case -1349929691:
                if (str.equals("ConstraintSet"))
                  paramInt = 4; 
                break;
            } 
            stringBuilder1 = stringBuilder;
            if (paramInt != 0) {
              stringBuilder1 = stringBuilder;
              if (paramInt != 1)
                if (paramInt != 2) {
                  if (paramInt != 3) {
                    if (paramInt != 4) {
                      stringBuilder1 = new StringBuilder();
                      stringBuilder1.append("unknown tag ");
                      stringBuilder1.append(str);
                      Log.v("ConstraintLayoutStates", stringBuilder1.toString());
                      stringBuilder1 = stringBuilder;
                    } else {
                      a((Context)iOException, (XmlPullParser)xmlResourceParser);
                      stringBuilder1 = stringBuilder;
                    } 
                  } else {
                    b b = new b((Context)iOException, (XmlPullParser)xmlResourceParser);
                    stringBuilder1 = stringBuilder;
                    if (stringBuilder != null) {
                      stringBuilder.a(b);
                      stringBuilder1 = stringBuilder;
                    } 
                  } 
                } else {
                  a a = new a((Context)iOException, (XmlPullParser)xmlResourceParser);
                  this.a.put(a.a, a);
                }  
            } 
          } 
        } else {
          xmlResourceParser.getName();
          stringBuilder1 = stringBuilder;
        } 
        paramInt = xmlResourceParser.next();
        stringBuilder = stringBuilder1;
        continue;
      } 
      return;
    } 
  }
  
  private void a(Context paramContext, XmlPullParser paramXmlPullParser) {
    e e = new e();
    int j = paramXmlPullParser.getAttributeCount();
    for (int i = 0; i < j; i++) {
      if ("id".equals(paramXmlPullParser.getAttributeName(i))) {
        String str = paramXmlPullParser.getAttributeValue(i);
        if (str.contains("/")) {
          String str1 = str.substring(str.indexOf('/') + 1);
          i = paramContext.getResources().getIdentifier(str1, "id", paramContext.getPackageName());
        } else {
          i = -1;
        } 
        j = i;
        if (i == -1)
          if (str != null && str.length() > 1) {
            j = Integer.parseInt(str.substring(1));
          } else {
            Log.e("ConstraintLayoutStates", "error in parsing id");
            j = i;
          }  
        e.a(paramContext, paramXmlPullParser);
        this.b.put(j, e);
        return;
      } 
    } 
  }
  
  public void a(g paramg) {}
  
  static class a {
    int a;
    
    ArrayList<d.b> b = new ArrayList<d.b>();
    
    int c = -1;
    
    e d;
    
    public a(Context param1Context, XmlPullParser param1XmlPullParser) {
      TypedArray typedArray = param1Context.obtainStyledAttributes(Xml.asAttributeSet(param1XmlPullParser), k.State);
      int j = typedArray.getIndexCount();
      for (int i = 0; i < j; i++) {
        int k = typedArray.getIndex(i);
        if (k == k.State_android_id) {
          this.a = typedArray.getResourceId(k, this.a);
        } else if (k == k.State_constraints) {
          this.c = typedArray.getResourceId(k, this.c);
          String str = param1Context.getResources().getResourceTypeName(this.c);
          param1Context.getResources().getResourceName(this.c);
          if ("layout".equals(str)) {
            this.d = new e();
            this.d.a(param1Context, this.c);
          } 
        } 
      } 
      typedArray.recycle();
    }
    
    void a(d.b param1b) {
      this.b.add(param1b);
    }
  }
  
  static class b {
    float a = Float.NaN;
    
    float b = Float.NaN;
    
    float c = Float.NaN;
    
    float d = Float.NaN;
    
    int e = -1;
    
    e f;
    
    public b(Context param1Context, XmlPullParser param1XmlPullParser) {
      TypedArray typedArray = param1Context.obtainStyledAttributes(Xml.asAttributeSet(param1XmlPullParser), k.Variant);
      int j = typedArray.getIndexCount();
      for (int i = 0; i < j; i++) {
        int k = typedArray.getIndex(i);
        if (k == k.Variant_constraints) {
          this.e = typedArray.getResourceId(k, this.e);
          String str = param1Context.getResources().getResourceTypeName(this.e);
          param1Context.getResources().getResourceName(this.e);
          if ("layout".equals(str)) {
            this.f = new e();
            this.f.a(param1Context, this.e);
          } 
        } else if (k == k.Variant_region_heightLessThan) {
          this.d = typedArray.getDimension(k, this.d);
        } else if (k == k.Variant_region_heightMoreThan) {
          this.b = typedArray.getDimension(k, this.b);
        } else if (k == k.Variant_region_widthLessThan) {
          this.c = typedArray.getDimension(k, this.c);
        } else if (k == k.Variant_region_widthMoreThan) {
          this.a = typedArray.getDimension(k, this.a);
        } else {
          Log.v("ConstraintLayoutStates", "Unknown tag");
        } 
      } 
      typedArray.recycle();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/constraintlayout/widget/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */