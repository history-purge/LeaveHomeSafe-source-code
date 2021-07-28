package b.g.e.d;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class c {
  private static int a(TypedArray paramTypedArray, int paramInt) {
    if (Build.VERSION.SDK_INT >= 21)
      return paramTypedArray.getType(paramInt); 
    TypedValue typedValue = new TypedValue();
    paramTypedArray.getValue(paramInt, typedValue);
    return typedValue.type;
  }
  
  public static a a(XmlPullParser paramXmlPullParser, Resources paramResources) {
    int i;
    while (true) {
      i = paramXmlPullParser.next();
      if (i != 2 && i != 1)
        continue; 
      break;
    } 
    if (i == 2)
      return b(paramXmlPullParser, paramResources); 
    XmlPullParserException xmlPullParserException = new XmlPullParserException("No start tag found");
    throw xmlPullParserException;
  }
  
  public static List<List<byte[]>> a(Resources paramResources, int paramInt) {
    if (paramInt == 0)
      return Collections.emptyList(); 
    TypedArray typedArray = paramResources.obtainTypedArray(paramInt);
    try {
      List<?> list;
      if (typedArray.length() == 0) {
        list = Collections.emptyList();
        return (List)list;
      } 
      ArrayList<List<byte[]>> arrayList = new ArrayList();
      if (a(typedArray, 0) == 1)
        for (paramInt = 0;; paramInt++) {
          if (paramInt < typedArray.length()) {
            int i = typedArray.getResourceId(paramInt, 0);
            if (i != 0)
              arrayList.add(a(list.getStringArray(i))); 
          } else {
            return arrayList;
          } 
        }  
      arrayList.add(a(list.getStringArray(paramInt)));
      return arrayList;
    } finally {
      typedArray.recycle();
    } 
  }
  
  private static List<byte[]> a(String[] paramArrayOfString) {
    ArrayList<byte[]> arrayList = new ArrayList();
    int j = paramArrayOfString.length;
    for (int i = 0; i < j; i++)
      arrayList.add(Base64.decode(paramArrayOfString[i], 0)); 
    return (List<byte[]>)arrayList;
  }
  
  private static void a(XmlPullParser paramXmlPullParser) {
    for (int i = 1; i; i++) {
      int j = paramXmlPullParser.next();
      if (j != 2) {
        if (j != 3)
          continue; 
        i--;
        continue;
      } 
    } 
  }
  
  private static a b(XmlPullParser paramXmlPullParser, Resources paramResources) {
    paramXmlPullParser.require(2, null, "font-family");
    if (paramXmlPullParser.getName().equals("font-family"))
      return c(paramXmlPullParser, paramResources); 
    a(paramXmlPullParser);
    return null;
  }
  
  private static a c(XmlPullParser paramXmlPullParser, Resources paramResources) {
    TypedArray typedArray = paramResources.obtainAttributes(Xml.asAttributeSet(paramXmlPullParser), b.g.d.FontFamily);
    String str1 = typedArray.getString(b.g.d.FontFamily_fontProviderAuthority);
    String str2 = typedArray.getString(b.g.d.FontFamily_fontProviderPackage);
    String str3 = typedArray.getString(b.g.d.FontFamily_fontProviderQuery);
    int i = typedArray.getResourceId(b.g.d.FontFamily_fontProviderCerts, 0);
    int j = typedArray.getInteger(b.g.d.FontFamily_fontProviderFetchStrategy, 1);
    int k = typedArray.getInteger(b.g.d.FontFamily_fontProviderFetchTimeout, 500);
    typedArray.recycle();
    if (str1 != null && str2 != null && str3 != null) {
      while (paramXmlPullParser.next() != 3)
        a(paramXmlPullParser); 
      return new d(new b.g.k.a(str1, str2, str3, a(paramResources, i)), j, k);
    } 
    ArrayList<c> arrayList = new ArrayList();
    while (paramXmlPullParser.next() != 3) {
      if (paramXmlPullParser.getEventType() != 2)
        continue; 
      if (paramXmlPullParser.getName().equals("font")) {
        arrayList.add(d(paramXmlPullParser, paramResources));
        continue;
      } 
      a(paramXmlPullParser);
    } 
    return arrayList.isEmpty() ? null : new b(arrayList.<c>toArray(new c[arrayList.size()]));
  }
  
  private static c d(XmlPullParser paramXmlPullParser, Resources paramResources) {
    int i;
    boolean bool;
    TypedArray typedArray = paramResources.obtainAttributes(Xml.asAttributeSet(paramXmlPullParser), b.g.d.FontFamilyFont);
    if (typedArray.hasValue(b.g.d.FontFamilyFont_fontWeight)) {
      i = b.g.d.FontFamilyFont_fontWeight;
    } else {
      i = b.g.d.FontFamilyFont_android_fontWeight;
    } 
    int k = typedArray.getInt(i, 400);
    if (typedArray.hasValue(b.g.d.FontFamilyFont_fontStyle)) {
      i = b.g.d.FontFamilyFont_fontStyle;
    } else {
      i = b.g.d.FontFamilyFont_android_fontStyle;
    } 
    if (1 == typedArray.getInt(i, 0)) {
      bool = true;
    } else {
      bool = false;
    } 
    if (typedArray.hasValue(b.g.d.FontFamilyFont_ttcIndex)) {
      i = b.g.d.FontFamilyFont_ttcIndex;
    } else {
      i = b.g.d.FontFamilyFont_android_ttcIndex;
    } 
    if (typedArray.hasValue(b.g.d.FontFamilyFont_fontVariationSettings)) {
      j = b.g.d.FontFamilyFont_fontVariationSettings;
    } else {
      j = b.g.d.FontFamilyFont_android_fontVariationSettings;
    } 
    String str1 = typedArray.getString(j);
    int j = typedArray.getInt(i, 0);
    if (typedArray.hasValue(b.g.d.FontFamilyFont_font)) {
      i = b.g.d.FontFamilyFont_font;
    } else {
      i = b.g.d.FontFamilyFont_android_font;
    } 
    int m = typedArray.getResourceId(i, 0);
    String str2 = typedArray.getString(i);
    typedArray.recycle();
    while (paramXmlPullParser.next() != 3)
      a(paramXmlPullParser); 
    return new c(str2, k, bool, str1, j, m);
  }
  
  public static interface a {}
  
  public static final class b implements a {
    private final c.c[] a;
    
    public b(c.c[] param1ArrayOfc) {
      this.a = param1ArrayOfc;
    }
    
    public c.c[] a() {
      return this.a;
    }
  }
  
  public static final class c {
    private final String a;
    
    private int b;
    
    private boolean c;
    
    private String d;
    
    private int e;
    
    private int f;
    
    public c(String param1String1, int param1Int1, boolean param1Boolean, String param1String2, int param1Int2, int param1Int3) {
      this.a = param1String1;
      this.b = param1Int1;
      this.c = param1Boolean;
      this.d = param1String2;
      this.e = param1Int2;
      this.f = param1Int3;
    }
    
    public String a() {
      return this.a;
    }
    
    public int b() {
      return this.f;
    }
    
    public int c() {
      return this.e;
    }
    
    public String d() {
      return this.d;
    }
    
    public int e() {
      return this.b;
    }
    
    public boolean f() {
      return this.c;
    }
  }
  
  public static final class d implements a {
    private final b.g.k.a a;
    
    private final int b;
    
    private final int c;
    
    public d(b.g.k.a param1a, int param1Int1, int param1Int2) {
      this.a = param1a;
      this.c = param1Int1;
      this.b = param1Int2;
    }
    
    public int a() {
      return this.c;
    }
    
    public b.g.k.a b() {
      return this.a;
    }
    
    public int c() {
      return this.b;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/e/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */