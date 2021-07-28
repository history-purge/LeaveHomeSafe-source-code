package com.swmansion.reanimated.f;

import b.r.b0;
import b.r.e;
import b.r.f;
import b.r.v0;
import b.r.w;
import b.r.x;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

class d {
  private static v0 a(String paramString) {
    if (paramString == null || "none".equals(paramString))
      return null; 
    if ("fade".equals(paramString))
      return (v0)new f(3); 
    if ("scale".equals(paramString))
      return new b(); 
    if ("slide-top".equals(paramString))
      return (v0)new w(48); 
    if ("slide-bottom".equals(paramString))
      return (v0)new w(80); 
    if ("slide-right".equals(paramString))
      return (v0)new w(5); 
    if ("slide-left".equals(paramString))
      return (v0)new w(3); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Invalid transition type ");
    stringBuilder.append(paramString);
    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
  }
  
  static x a(ReadableMap paramReadableMap) {
    String str = paramReadableMap.getString("type");
    if ("group".equals(str))
      return c(paramReadableMap); 
    if ("in".equals(str))
      return d(paramReadableMap); 
    if ("out".equals(str))
      return e(paramReadableMap); 
    if ("change".equals(str))
      return b(paramReadableMap); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unrecognized transition type ");
    stringBuilder.append(str);
    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
  }
  
  private static void a(x paramx, ReadableMap paramReadableMap) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'durationMs'
    //   3: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   8: ifeq -> 25
    //   11: aload_0
    //   12: aload_1
    //   13: ldc 'durationMs'
    //   15: invokeinterface getInt : (Ljava/lang/String;)I
    //   20: i2l
    //   21: invokevirtual a : (J)Lb/r/x;
    //   24: pop
    //   25: aload_1
    //   26: ldc 'interpolation'
    //   28: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   33: ifeq -> 164
    //   36: aload_1
    //   37: ldc 'interpolation'
    //   39: invokeinterface getString : (Ljava/lang/String;)Ljava/lang/String;
    //   44: astore_3
    //   45: aload_3
    //   46: ldc 'easeIn'
    //   48: invokevirtual equals : (Ljava/lang/Object;)Z
    //   51: ifeq -> 71
    //   54: new android/view/animation/AccelerateInterpolator
    //   57: dup
    //   58: invokespecial <init> : ()V
    //   61: astore_3
    //   62: aload_0
    //   63: aload_3
    //   64: invokevirtual a : (Landroid/animation/TimeInterpolator;)Lb/r/x;
    //   67: pop
    //   68: goto -> 164
    //   71: aload_3
    //   72: ldc 'easeOut'
    //   74: invokevirtual equals : (Ljava/lang/Object;)Z
    //   77: ifeq -> 91
    //   80: new android/view/animation/DecelerateInterpolator
    //   83: dup
    //   84: invokespecial <init> : ()V
    //   87: astore_3
    //   88: goto -> 62
    //   91: aload_3
    //   92: ldc 'easeInOut'
    //   94: invokevirtual equals : (Ljava/lang/Object;)Z
    //   97: ifeq -> 111
    //   100: new android/view/animation/AccelerateDecelerateInterpolator
    //   103: dup
    //   104: invokespecial <init> : ()V
    //   107: astore_3
    //   108: goto -> 62
    //   111: aload_3
    //   112: ldc 'linear'
    //   114: invokevirtual equals : (Ljava/lang/Object;)Z
    //   117: ifeq -> 131
    //   120: new android/view/animation/LinearInterpolator
    //   123: dup
    //   124: invokespecial <init> : ()V
    //   127: astore_3
    //   128: goto -> 62
    //   131: new java/lang/StringBuilder
    //   134: dup
    //   135: invokespecial <init> : ()V
    //   138: astore_0
    //   139: aload_0
    //   140: ldc 'Invalid interpolation type '
    //   142: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: pop
    //   146: aload_0
    //   147: aload_3
    //   148: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: pop
    //   152: new com/facebook/react/bridge/JSApplicationIllegalArgumentException
    //   155: dup
    //   156: aload_0
    //   157: invokevirtual toString : ()Ljava/lang/String;
    //   160: invokespecial <init> : (Ljava/lang/String;)V
    //   163: athrow
    //   164: aload_1
    //   165: ldc 'propagation'
    //   167: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   172: ifeq -> 266
    //   175: aload_1
    //   176: ldc 'propagation'
    //   178: invokeinterface getString : (Ljava/lang/String;)Ljava/lang/String;
    //   183: astore_3
    //   184: new com/swmansion/reanimated/f/a
    //   187: dup
    //   188: invokespecial <init> : ()V
    //   191: astore #4
    //   193: ldc 'top'
    //   195: aload_3
    //   196: invokevirtual equals : (Ljava/lang/Object;)Z
    //   199: ifeq -> 214
    //   202: bipush #80
    //   204: istore_2
    //   205: aload #4
    //   207: iload_2
    //   208: invokevirtual a : (I)V
    //   211: goto -> 257
    //   214: ldc 'bottom'
    //   216: aload_3
    //   217: invokevirtual equals : (Ljava/lang/Object;)Z
    //   220: ifeq -> 229
    //   223: bipush #48
    //   225: istore_2
    //   226: goto -> 205
    //   229: ldc 'left'
    //   231: aload_3
    //   232: invokevirtual equals : (Ljava/lang/Object;)Z
    //   235: ifeq -> 243
    //   238: iconst_5
    //   239: istore_2
    //   240: goto -> 205
    //   243: ldc 'right'
    //   245: aload_3
    //   246: invokevirtual equals : (Ljava/lang/Object;)Z
    //   249: ifeq -> 257
    //   252: iconst_3
    //   253: istore_2
    //   254: goto -> 205
    //   257: aload_0
    //   258: aload #4
    //   260: invokevirtual a : (Lb/r/a0;)V
    //   263: goto -> 271
    //   266: aload_0
    //   267: aconst_null
    //   268: invokevirtual a : (Lb/r/a0;)V
    //   271: aload_1
    //   272: ldc 'delayMs'
    //   274: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   279: ifeq -> 296
    //   282: aload_0
    //   283: aload_1
    //   284: ldc 'delayMs'
    //   286: invokeinterface getInt : (Ljava/lang/String;)I
    //   291: i2l
    //   292: invokevirtual b : (J)Lb/r/x;
    //   295: pop
    //   296: return
  }
  
  private static x b(ReadableMap paramReadableMap) {
    b.r.d d1 = new b.r.d();
    e e = new e();
    a((x)d1, paramReadableMap);
    a((x)e, paramReadableMap);
    b0 b0 = new b0();
    b0.a((x)d1);
    b0.a((x)e);
    return (x)b0;
  }
  
  private static x c(ReadableMap paramReadableMap) {
    b0 b0 = new b0();
    boolean bool = paramReadableMap.hasKey("sequence");
    int i = 0;
    if (bool && paramReadableMap.getBoolean("sequence")) {
      b0.b(1);
    } else {
      b0.b(0);
    } 
    ReadableArray readableArray = paramReadableMap.getArray("transitions");
    int j = readableArray.size();
    while (i < j) {
      x x = a(readableArray.getMap(i));
      if (x != null)
        b0.a(x); 
      i++;
    } 
    return (x)b0;
  }
  
  private static x d(ReadableMap paramReadableMap) {
    v0 v0 = a(paramReadableMap.getString("animation"));
    if (v0 == null)
      return null; 
    v0.a(1);
    a((x)v0, paramReadableMap);
    return (x)v0;
  }
  
  private static x e(ReadableMap paramReadableMap) {
    v0 v0 = a(paramReadableMap.getString("animation"));
    if (v0 == null)
      return null; 
    v0.a(2);
    a((x)v0, paramReadableMap);
    return (x)v0;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/reanimated/f/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */