package com.facebook.react.views.text.frescosupport;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.views.text.o;
import com.facebook.react.views.text.z;
import e.e.j.c.b;
import java.util.Locale;

public class a extends o {
  private Uri B;
  
  private ReadableMap C;
  
  private final b D;
  
  private final Object E;
  
  private float F = Float.NaN;
  
  private String G;
  
  private float H = Float.NaN;
  
  private int I = 0;
  
  public a(b paramb, Object paramObject) {
    this.D = paramb;
    this.E = paramObject;
  }
  
  private static Uri a(Context paramContext, String paramString) {
    if (paramString == null || paramString.isEmpty())
      return null; 
    paramString = paramString.toLowerCase(Locale.getDefault()).replace("-", "_");
    int i = paramContext.getResources().getIdentifier(paramString, "drawable", paramContext.getPackageName());
    return (new Uri.Builder()).scheme("res").path(String.valueOf(i)).build();
  }
  
  public z Q() {
    Resources resources = h().getResources();
    int i = (int)Math.ceil(this.F);
    return new b(resources, (int)Math.ceil(this.H), i, this.I, U(), T(), S(), R(), this.G);
  }
  
  public Object R() {
    return this.E;
  }
  
  public b S() {
    return this.D;
  }
  
  public ReadableMap T() {
    return this.C;
  }
  
  public Uri U() {
    return this.B;
  }
  
  @com.facebook.react.uimanager.e1.a(name = "headers")
  public void setHeaders(ReadableMap paramReadableMap) {
    this.C = paramReadableMap;
  }
  
  public void setHeight(Dynamic paramDynamic) {
    if (paramDynamic.getType() == ReadableType.Number) {
      this.H = (float)paramDynamic.asDouble();
      return;
    } 
    throw new JSApplicationIllegalArgumentException("Inline images must not have percentage based height");
  }
  
  @com.facebook.react.uimanager.e1.a(name = "resizeMode")
  public void setResizeMode(String paramString) {
    this.G = paramString;
  }
  
  @com.facebook.react.uimanager.e1.a(name = "src")
  public void setSource(ReadableArray paramReadableArray) {
    // Byte code:
    //   0: aconst_null
    //   1: astore #4
    //   3: aconst_null
    //   4: astore_2
    //   5: aload_1
    //   6: ifnull -> 39
    //   9: aload_1
    //   10: invokeinterface size : ()I
    //   15: ifne -> 21
    //   18: goto -> 39
    //   21: aload_1
    //   22: iconst_0
    //   23: invokeinterface getMap : (I)Lcom/facebook/react/bridge/ReadableMap;
    //   28: ldc 'uri'
    //   30: invokeinterface getString : (Ljava/lang/String;)Ljava/lang/String;
    //   35: astore_3
    //   36: goto -> 41
    //   39: aconst_null
    //   40: astore_3
    //   41: aload #4
    //   43: astore_1
    //   44: aload_3
    //   45: ifnull -> 87
    //   48: aload_3
    //   49: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   52: astore_1
    //   53: aload_1
    //   54: invokevirtual getScheme : ()Ljava/lang/String;
    //   57: astore #4
    //   59: aload #4
    //   61: ifnonnull -> 67
    //   64: goto -> 72
    //   67: aload_1
    //   68: astore_2
    //   69: goto -> 72
    //   72: aload_2
    //   73: astore_1
    //   74: aload_2
    //   75: ifnonnull -> 87
    //   78: aload_0
    //   79: invokevirtual h : ()Lcom/facebook/react/uimanager/k0;
    //   82: aload_3
    //   83: invokestatic a : (Landroid/content/Context;Ljava/lang/String;)Landroid/net/Uri;
    //   86: astore_1
    //   87: aload_1
    //   88: aload_0
    //   89: getfield B : Landroid/net/Uri;
    //   92: if_acmpeq -> 99
    //   95: aload_0
    //   96: invokevirtual L : ()V
    //   99: aload_0
    //   100: aload_1
    //   101: putfield B : Landroid/net/Uri;
    //   104: return
    //   105: astore_1
    //   106: goto -> 72
    //   109: astore_2
    //   110: goto -> 67
    // Exception table:
    //   from	to	target	type
    //   48	53	105	java/lang/Exception
    //   53	59	109	java/lang/Exception
  }
  
  @com.facebook.react.uimanager.e1.a(name = "tintColor")
  public void setTintColor(int paramInt) {
    this.I = paramInt;
  }
  
  public void setWidth(Dynamic paramDynamic) {
    if (paramDynamic.getType() == ReadableType.Number) {
      this.F = (float)paramDynamic.asDouble();
      return;
    } 
    throw new JSApplicationIllegalArgumentException("Inline images must not have percentage based width");
  }
  
  public boolean y() {
    return true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/text/frescosupport/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */