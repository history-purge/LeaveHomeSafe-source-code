package com.facebook.react.views.text;

import android.os.Build;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.c0;
import com.facebook.react.uimanager.q;

public class x {
  private static final int x = 0;
  
  private static final int y;
  
  protected float a;
  
  protected boolean b;
  
  protected boolean c;
  
  protected int d;
  
  protected boolean e;
  
  protected int f;
  
  protected int g;
  
  protected float h;
  
  protected float i;
  
  protected float j;
  
  protected c0 k;
  
  protected float l;
  
  protected float m;
  
  protected float n;
  
  protected int o;
  
  protected boolean p;
  
  protected boolean q;
  
  protected int r;
  
  protected int s;
  
  protected String t;
  
  protected String u;
  
  protected float v;
  
  private final c0 w;
  
  static {
    if (Build.VERSION.SDK_INT >= 23)
      i = 1; 
    y = i;
  }
  
  public x(c0 paramc0) {
    ReadableMap readableMap;
    this.a = Float.NaN;
    this.b = false;
    this.c = true;
    this.e = false;
    this.g = -1;
    this.h = -1.0F;
    this.i = -1.0F;
    this.j = Float.NaN;
    this.k = c0.g;
    this.l = 0.0F;
    this.m = 0.0F;
    this.n = 1.0F;
    this.o = 1426063360;
    this.p = false;
    this.q = false;
    this.r = -1;
    this.s = -1;
    Integer integer2 = null;
    this.t = null;
    this.u = null;
    this.v = Float.NaN;
    this.w = paramc0;
    a(a("numberOfLines", -1));
    c(a("lineHeight", -1.0F));
    b(a("letterSpacing", Float.NaN));
    a(a("allowFontScaling", true));
    a(a("fontSize", -1.0F));
    if (paramc0.d("color")) {
      integer1 = Integer.valueOf(paramc0.a("color", 0));
    } else {
      integer1 = null;
    } 
    b(integer1);
    if (paramc0.d("foregroundColor")) {
      integer1 = Integer.valueOf(paramc0.a("foregroundColor", 0));
    } else {
      integer1 = null;
    } 
    b(integer1);
    if (paramc0.d("backgroundColor")) {
      integer1 = Integer.valueOf(paramc0.a("backgroundColor", 0));
    } else {
      integer1 = null;
    } 
    a(integer1);
    a(g("fontFamily"));
    c(g("fontWeight"));
    b(g("fontStyle"));
    a(f("fontVariant"));
    b(a("includeFontPadding", true));
    d(g("textDecorationLine"));
    Integer integer1 = integer2;
    if (paramc0.d("textShadowOffset"))
      readableMap = paramc0.b("textShadowOffset"); 
    a(readableMap);
    d(a("textShadowRadius", 1));
    b(a("textShadowColor", 1426063360));
    e(g("textTransform"));
  }
  
  private float a(String paramString, float paramFloat) {
    return this.w.d(paramString) ? this.w.a(paramString, paramFloat) : paramFloat;
  }
  
  public static int a(c0 paramc0) {
    if (paramc0.d("textAlign")) {
      String str = paramc0.c("textAlign");
    } else {
      paramc0 = null;
    } 
    return ("justify".equals(paramc0) && Build.VERSION.SDK_INT >= 26) ? 1 : x;
  }
  
  private int a(String paramString, int paramInt) {
    return this.w.d(paramString) ? this.w.a(paramString, paramInt) : paramInt;
  }
  
  private boolean a(String paramString, boolean paramBoolean) {
    return this.w.d(paramString) ? this.w.a(paramString, paramBoolean) : paramBoolean;
  }
  
  public static int b(c0 paramc0) {
    if (paramc0.d("textAlign")) {
      String str = paramc0.c("textAlign");
    } else {
      paramc0 = null;
    } 
    if ("justify".equals(paramc0))
      return 3; 
    if (paramc0 == null || "auto".equals(paramc0))
      return 0; 
    if ("left".equals(paramc0))
      return 3; 
    if ("right".equals(paramc0))
      return 5; 
    if ("center".equals(paramc0))
      return 1; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Invalid textAlign: ");
    stringBuilder.append((String)paramc0);
    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
  }
  
  private ReadableArray f(String paramString) {
    return this.w.d(paramString) ? this.w.a(paramString) : null;
  }
  
  private String g(String paramString) {
    return this.w.d(paramString) ? this.w.c(paramString) : null;
  }
  
  public static int h(String paramString) {
    int i = y;
    if (paramString != null) {
      i = -1;
      int j = paramString.hashCode();
      if (j != -1924829944) {
        if (j == -902286926 && paramString.equals("simple"))
          i = 0; 
      } else if (paramString.equals("balanced")) {
        i = 1;
      } 
      if (i != 0)
        return (i != 1) ? 1 : 2; 
      i = 0;
    } 
    return i;
  }
  
  private static int i(String paramString) {
    return (paramString.length() == 3 && paramString.endsWith("00") && paramString.charAt(0) <= '9' && paramString.charAt(0) >= '1') ? ((paramString.charAt(0) - 48) * 100) : -1;
  }
  
  public float a() {
    boolean bool;
    if (!Float.isNaN(this.a) && !Float.isNaN(this.v) && this.v > this.a) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool ? this.v : this.a;
  }
  
  public void a(float paramFloat) {
    this.h = paramFloat;
    float f = paramFloat;
    if (paramFloat != -1.0F) {
      if (this.c) {
        paramFloat = q.c(paramFloat);
      } else {
        paramFloat = q.b(paramFloat);
      } 
      f = (float)Math.ceil(paramFloat);
    } 
    this.g = (int)f;
  }
  
  public void a(int paramInt) {}
  
  public void a(ReadableArray paramReadableArray) {
    this.u = t.a(paramReadableArray);
  }
  
  public void a(ReadableMap paramReadableMap) {
    this.l = 0.0F;
    this.m = 0.0F;
    if (paramReadableMap != null) {
      if (paramReadableMap.hasKey("width") && !paramReadableMap.isNull("width"))
        this.l = q.a(paramReadableMap.getDouble("width")); 
      if (paramReadableMap.hasKey("height") && !paramReadableMap.isNull("height"))
        this.m = q.a(paramReadableMap.getDouble("height")); 
    } 
  }
  
  public void a(Integer paramInteger) {
    boolean bool;
    if (paramInteger != null) {
      bool = true;
    } else {
      bool = false;
    } 
    this.e = bool;
    if (this.e)
      this.f = paramInteger.intValue(); 
  }
  
  public void a(String paramString) {
    this.t = paramString;
  }
  
  public void a(boolean paramBoolean) {
    if (paramBoolean != this.c) {
      this.c = paramBoolean;
      a(this.h);
      c(this.i);
      b(this.j);
    } 
  }
  
  public float b() {
    float f;
    if (this.c) {
      f = q.c(this.j);
    } else {
      f = q.b(this.j);
    } 
    int i = this.g;
    if (i > 0)
      return f / i; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("FontSize should be a positive value. Current value: ");
    stringBuilder.append(this.g);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public void b(float paramFloat) {
    this.j = paramFloat;
  }
  
  public void b(int paramInt) {
    if (paramInt != this.o)
      this.o = paramInt; 
  }
  
  public void b(Integer paramInteger) {
    boolean bool;
    if (paramInteger != null) {
      bool = true;
    } else {
      bool = false;
    } 
    this.b = bool;
    if (this.b)
      this.d = paramInteger.intValue(); 
  }
  
  public void b(String paramString) {
    byte b;
    if ("italic".equals(paramString)) {
      b = 2;
    } else if ("normal".equals(paramString)) {
      b = 0;
    } else {
      b = -1;
    } 
    if (b != this.r)
      this.r = b; 
  }
  
  public void b(boolean paramBoolean) {}
  
  public void c(float paramFloat) {
    this.i = paramFloat;
    if (paramFloat == -1.0F) {
      paramFloat = Float.NaN;
    } else if (this.c) {
      paramFloat = q.c(paramFloat);
    } else {
      paramFloat = q.b(paramFloat);
    } 
    this.a = paramFloat;
  }
  
  public void c(String paramString) {
    // Byte code:
    //   0: iconst_m1
    //   1: istore #4
    //   3: aload_1
    //   4: ifnull -> 15
    //   7: aload_1
    //   8: invokestatic i : (Ljava/lang/String;)I
    //   11: istore_3
    //   12: goto -> 17
    //   15: iconst_m1
    //   16: istore_3
    //   17: iload_3
    //   18: sipush #500
    //   21: if_icmpge -> 70
    //   24: ldc_w 'bold'
    //   27: aload_1
    //   28: invokevirtual equals : (Ljava/lang/Object;)Z
    //   31: ifeq -> 37
    //   34: goto -> 70
    //   37: ldc_w 'normal'
    //   40: aload_1
    //   41: invokevirtual equals : (Ljava/lang/Object;)Z
    //   44: ifne -> 65
    //   47: iload #4
    //   49: istore_2
    //   50: iload_3
    //   51: iconst_m1
    //   52: if_icmpeq -> 72
    //   55: iload #4
    //   57: istore_2
    //   58: iload_3
    //   59: sipush #500
    //   62: if_icmpge -> 72
    //   65: iconst_0
    //   66: istore_2
    //   67: goto -> 72
    //   70: iconst_1
    //   71: istore_2
    //   72: iload_2
    //   73: aload_0
    //   74: getfield s : I
    //   77: if_icmpeq -> 85
    //   80: aload_0
    //   81: iload_2
    //   82: putfield s : I
    //   85: return
  }
  
  public void d(float paramFloat) {
    if (paramFloat != this.n)
      this.n = paramFloat; 
  }
  
  public void d(String paramString) {
    int i = 0;
    this.p = false;
    this.q = false;
    if (paramString != null) {
      String[] arrayOfString = paramString.split("-");
      int j = arrayOfString.length;
      while (i < j) {
        String str = arrayOfString[i];
        if ("underline".equals(str)) {
          this.p = true;
        } else if ("strikethrough".equals(str)) {
          this.q = true;
        } 
        i++;
      } 
    } 
  }
  
  public void e(String paramString) {
    c0 c01;
    if (paramString == null || "none".equals(paramString)) {
      c01 = c0.c;
    } else if ("uppercase".equals(c01)) {
      c01 = c0.d;
    } else if ("lowercase".equals(c01)) {
      c01 = c0.e;
    } else if ("capitalize".equals(c01)) {
      c01 = c0.f;
    } else {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid textTransform: ");
      stringBuilder.append((String)c01);
      throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
    } 
    this.k = c01;
  }
  
  static {
    int i = Build.VERSION.SDK_INT;
    i = 0;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/text/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */