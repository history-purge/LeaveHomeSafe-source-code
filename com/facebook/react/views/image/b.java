package com.facebook.react.views.image;

import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;

public class b extends c<b> {
  private final int f;
  
  private final String g;
  
  private final int h;
  
  private final int i;
  
  private final String j;
  
  public b(int paramInt1, int paramInt2) {
    this(paramInt1, paramInt2, null);
  }
  
  public b(int paramInt1, int paramInt2, String paramString) {
    this(paramInt1, paramInt2, paramString, 0, 0, null);
  }
  
  public b(int paramInt1, int paramInt2, String paramString, int paramInt3, int paramInt4) {
    this(paramInt1, paramInt2, paramString, paramInt3, paramInt4, null);
  }
  
  public b(int paramInt1, int paramInt2, String paramString1, int paramInt3, int paramInt4, String paramString2) {
    super(paramInt1);
    this.f = paramInt2;
    this.g = paramString1;
    this.h = paramInt3;
    this.i = paramInt4;
    this.j = paramString2;
  }
  
  public b(int paramInt1, int paramInt2, boolean paramBoolean, String paramString) {
    this(paramInt1, paramInt2, null, 0, 0, paramString);
  }
  
  public static String b(int paramInt) {
    if (paramInt != 1) {
      if (paramInt != 2) {
        if (paramInt != 3) {
          if (paramInt != 4) {
            if (paramInt == 5)
              return "topProgress"; 
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid image event: ");
            stringBuilder.append(Integer.toString(paramInt));
            throw new IllegalStateException(stringBuilder.toString());
          } 
          return "topLoadStart";
        } 
        return "topLoadEnd";
      } 
      return "topLoad";
    } 
    return "topError";
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    // Byte code:
    //   0: aload_0
    //   1: getfield g : Ljava/lang/String;
    //   4: ifnonnull -> 30
    //   7: aload_0
    //   8: getfield f : I
    //   11: istore_2
    //   12: iload_2
    //   13: iconst_2
    //   14: if_icmpeq -> 30
    //   17: iload_2
    //   18: iconst_1
    //   19: if_icmpne -> 25
    //   22: goto -> 30
    //   25: aconst_null
    //   26: astore_3
    //   27: goto -> 155
    //   30: invokestatic createMap : ()Lcom/facebook/react/bridge/WritableMap;
    //   33: astore #4
    //   35: aload_0
    //   36: getfield g : Ljava/lang/String;
    //   39: astore_3
    //   40: aload_3
    //   41: ifnull -> 54
    //   44: aload #4
    //   46: ldc 'uri'
    //   48: aload_3
    //   49: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   54: aload_0
    //   55: getfield f : I
    //   58: istore_2
    //   59: iload_2
    //   60: iconst_2
    //   61: if_icmpne -> 131
    //   64: invokestatic createMap : ()Lcom/facebook/react/bridge/WritableMap;
    //   67: astore_3
    //   68: aload_3
    //   69: ldc 'width'
    //   71: aload_0
    //   72: getfield h : I
    //   75: i2d
    //   76: invokeinterface putDouble : (Ljava/lang/String;D)V
    //   81: aload_3
    //   82: ldc 'height'
    //   84: aload_0
    //   85: getfield i : I
    //   88: i2d
    //   89: invokeinterface putDouble : (Ljava/lang/String;D)V
    //   94: aload_0
    //   95: getfield g : Ljava/lang/String;
    //   98: astore #5
    //   100: aload #5
    //   102: ifnull -> 115
    //   105: aload_3
    //   106: ldc 'url'
    //   108: aload #5
    //   110: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   115: aload #4
    //   117: ldc 'source'
    //   119: aload_3
    //   120: invokeinterface putMap : (Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V
    //   125: aload #4
    //   127: astore_3
    //   128: goto -> 155
    //   131: aload #4
    //   133: astore_3
    //   134: iload_2
    //   135: iconst_1
    //   136: if_icmpne -> 155
    //   139: aload #4
    //   141: ldc 'error'
    //   143: aload_0
    //   144: getfield j : Ljava/lang/String;
    //   147: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   152: aload #4
    //   154: astore_3
    //   155: aload_1
    //   156: aload_0
    //   157: invokevirtual g : ()I
    //   160: aload_0
    //   161: invokevirtual d : ()Ljava/lang/String;
    //   164: aload_3
    //   165: invokeinterface receiveEvent : (ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    //   170: return
  }
  
  public short c() {
    return (short)this.f;
  }
  
  public String d() {
    return b(this.f);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/image/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */