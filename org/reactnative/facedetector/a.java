package org.reactnative.facedetector;

import android.graphics.PointF;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import e.f.a.e.n.e.b;

public class a {
  private static final String[] a = new String[] { 
      "bottomMouthPosition", "leftCheekPosition", "leftEarPosition", "leftEarTipPosition", "leftEyePosition", "leftMouthPosition", "noseBasePosition", "rightCheekPosition", "rightEarPosition", "rightEarTipPosition", 
      "rightEyePosition", "rightMouthPosition" };
  
  public static double a(double paramDouble1, int paramInt, double paramDouble2) {
    paramDouble1 /= paramDouble2;
    double d = paramInt;
    Double.isNaN(d);
    return (d - paramDouble1) * paramDouble2;
  }
  
  public static WritableMap a(PointF paramPointF, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    WritableMap writableMap = Arguments.createMap();
    Float float_1 = Float.valueOf(paramPointF.x);
    Float float_2 = Float.valueOf(paramPointF.y);
    float f1 = paramPointF.x;
    float f2 = (paramInt1 / 2);
    if (f1 < f2) {
      f1 = float_1.floatValue() + (paramInt3 / 2);
    } else if (f1 > f2) {
      f1 = float_1.floatValue() - (paramInt3 / 2);
    } 
    f1 = paramPointF.y;
    f2 = (paramInt2 / 2);
    if (f1 < f2) {
      f1 = float_2.floatValue() + (paramInt4 / 2);
    } else if (f1 > f2) {
      f1 = float_2.floatValue() - (paramInt4 / 2);
    } 
    double d = paramPointF.x;
    Double.isNaN(d);
    writableMap.putDouble("x", d * paramDouble1);
    paramDouble1 = paramPointF.y;
    Double.isNaN(paramDouble1);
    writableMap.putDouble("y", paramDouble1 * paramDouble2);
    return writableMap;
  }
  
  public static WritableMap a(ReadableMap paramReadableMap, double paramDouble) {
    WritableMap writableMap = Arguments.createMap();
    writableMap.merge(paramReadableMap);
    writableMap.putDouble("x", paramReadableMap.getDouble("x") + paramDouble);
    return writableMap;
  }
  
  public static WritableMap a(ReadableMap paramReadableMap, int paramInt, double paramDouble) {
    WritableMap writableMap = Arguments.createMap();
    writableMap.merge(paramReadableMap);
    writableMap.putDouble("x", a(paramReadableMap.getDouble("x"), paramInt, paramDouble));
    return writableMap;
  }
  
  public static WritableMap a(WritableMap paramWritableMap) {
    paramWritableMap.putDouble("rollAngle", (-paramWritableMap.getDouble("rollAngle") + 360.0D) % 360.0D);
    paramWritableMap.putDouble("yawAngle", (-paramWritableMap.getDouble("yawAngle") + 360.0D) % 360.0D);
    return paramWritableMap;
  }
  
  public static WritableMap a(WritableMap paramWritableMap, int paramInt, double paramDouble) {
    ReadableMap readableMap = paramWritableMap.getMap("bounds");
    WritableMap writableMap2 = a((ReadableMap)a(readableMap.getMap("origin"), paramInt, paramDouble), -readableMap.getMap("size").getDouble("width"));
    WritableMap writableMap1 = Arguments.createMap();
    writableMap1.merge(readableMap);
    writableMap1.putMap("origin", (ReadableMap)writableMap2);
    for (String str : a) {
      if (paramWritableMap.hasKey(str)) {
        readableMap = paramWritableMap.getMap(str);
      } else {
        readableMap = null;
      } 
      if (readableMap != null)
        paramWritableMap.putMap(str, (ReadableMap)a(readableMap, paramInt, paramDouble)); 
    } 
    paramWritableMap.putMap("bounds", (ReadableMap)writableMap1);
    return paramWritableMap;
  }
  
  public static WritableMap a(b paramb) {
    return a(paramb, 1.0D, 1.0D, 0, 0, 0, 0);
  }
  
  public static WritableMap a(b paramb, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: invokestatic createMap : ()Lcom/facebook/react/bridge/WritableMap;
    //   3: astore #16
    //   5: aload #16
    //   7: ldc 'faceID'
    //   9: aload_0
    //   10: invokevirtual d : ()I
    //   13: invokeinterface putInt : (Ljava/lang/String;I)V
    //   18: aload #16
    //   20: ldc 'rollAngle'
    //   22: aload_0
    //   23: invokevirtual b : ()F
    //   26: f2d
    //   27: invokeinterface putDouble : (Ljava/lang/String;D)V
    //   32: aload #16
    //   34: ldc 'yawAngle'
    //   36: aload_0
    //   37: invokevirtual a : ()F
    //   40: f2d
    //   41: invokeinterface putDouble : (Ljava/lang/String;D)V
    //   46: aload_0
    //   47: invokevirtual g : ()F
    //   50: fconst_0
    //   51: fcmpl
    //   52: iflt -> 69
    //   55: aload #16
    //   57: ldc 'smilingProbability'
    //   59: aload_0
    //   60: invokevirtual g : ()F
    //   63: f2d
    //   64: invokeinterface putDouble : (Ljava/lang/String;D)V
    //   69: aload_0
    //   70: invokevirtual e : ()F
    //   73: fconst_0
    //   74: fcmpl
    //   75: iflt -> 92
    //   78: aload #16
    //   80: ldc 'leftEyeOpenProbability'
    //   82: aload_0
    //   83: invokevirtual e : ()F
    //   86: f2d
    //   87: invokeinterface putDouble : (Ljava/lang/String;D)V
    //   92: aload_0
    //   93: invokevirtual f : ()F
    //   96: fconst_0
    //   97: fcmpl
    //   98: iflt -> 115
    //   101: aload #16
    //   103: ldc 'rightEyeOpenProbability'
    //   105: aload_0
    //   106: invokevirtual f : ()F
    //   109: f2d
    //   110: invokeinterface putDouble : (Ljava/lang/String;D)V
    //   115: aload_0
    //   116: invokevirtual h : ()Ljava/util/List;
    //   119: invokeinterface iterator : ()Ljava/util/Iterator;
    //   124: astore #13
    //   126: aload #13
    //   128: invokeinterface hasNext : ()Z
    //   133: ifeq -> 185
    //   136: aload #13
    //   138: invokeinterface next : ()Ljava/lang/Object;
    //   143: checkcast e/f/a/e/n/e/d
    //   146: astore #14
    //   148: aload #16
    //   150: getstatic org/reactnative/facedetector/a.a : [Ljava/lang/String;
    //   153: aload #14
    //   155: invokevirtual b : ()I
    //   158: aaload
    //   159: aload #14
    //   161: invokevirtual a : ()Landroid/graphics/PointF;
    //   164: dload_1
    //   165: dload_3
    //   166: iload #5
    //   168: iload #6
    //   170: iload #7
    //   172: iload #8
    //   174: invokestatic a : (Landroid/graphics/PointF;DDIIII)Lcom/facebook/react/bridge/WritableMap;
    //   177: invokeinterface putMap : (Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V
    //   182: goto -> 126
    //   185: invokestatic createMap : ()Lcom/facebook/react/bridge/WritableMap;
    //   188: astore #17
    //   190: aload_0
    //   191: invokevirtual i : ()Landroid/graphics/PointF;
    //   194: getfield x : F
    //   197: invokestatic valueOf : (F)Ljava/lang/Float;
    //   200: astore #14
    //   202: aload_0
    //   203: invokevirtual i : ()Landroid/graphics/PointF;
    //   206: getfield y : F
    //   209: invokestatic valueOf : (F)Ljava/lang/Float;
    //   212: astore #15
    //   214: aload_0
    //   215: invokevirtual i : ()Landroid/graphics/PointF;
    //   218: getfield x : F
    //   221: fstore #11
    //   223: iload #5
    //   225: iconst_2
    //   226: idiv
    //   227: i2f
    //   228: fstore #12
    //   230: fload #11
    //   232: fload #12
    //   234: fcmpg
    //   235: ifge -> 261
    //   238: aload #14
    //   240: invokevirtual floatValue : ()F
    //   243: iload #7
    //   245: iconst_2
    //   246: idiv
    //   247: i2f
    //   248: fadd
    //   249: fstore #11
    //   251: fload #11
    //   253: invokestatic valueOf : (F)Ljava/lang/Float;
    //   256: astore #13
    //   258: goto -> 294
    //   261: aload #14
    //   263: astore #13
    //   265: aload_0
    //   266: invokevirtual i : ()Landroid/graphics/PointF;
    //   269: getfield x : F
    //   272: fload #12
    //   274: fcmpl
    //   275: ifle -> 294
    //   278: aload #14
    //   280: invokevirtual floatValue : ()F
    //   283: iload #7
    //   285: iconst_2
    //   286: idiv
    //   287: i2f
    //   288: fsub
    //   289: fstore #11
    //   291: goto -> 251
    //   294: aload_0
    //   295: invokevirtual i : ()Landroid/graphics/PointF;
    //   298: getfield y : F
    //   301: fstore #11
    //   303: iload #6
    //   305: iconst_2
    //   306: idiv
    //   307: i2f
    //   308: fstore #12
    //   310: fload #11
    //   312: fload #12
    //   314: fcmpg
    //   315: ifge -> 341
    //   318: aload #15
    //   320: invokevirtual floatValue : ()F
    //   323: iload #8
    //   325: iconst_2
    //   326: idiv
    //   327: i2f
    //   328: fadd
    //   329: fstore #11
    //   331: fload #11
    //   333: invokestatic valueOf : (F)Ljava/lang/Float;
    //   336: astore #14
    //   338: goto -> 374
    //   341: aload #15
    //   343: astore #14
    //   345: aload_0
    //   346: invokevirtual i : ()Landroid/graphics/PointF;
    //   349: getfield y : F
    //   352: fload #12
    //   354: fcmpl
    //   355: ifle -> 374
    //   358: aload #15
    //   360: invokevirtual floatValue : ()F
    //   363: iload #8
    //   365: iconst_2
    //   366: idiv
    //   367: i2f
    //   368: fsub
    //   369: fstore #11
    //   371: goto -> 331
    //   374: aload #13
    //   376: invokevirtual floatValue : ()F
    //   379: f2d
    //   380: dstore #9
    //   382: dload #9
    //   384: invokestatic isNaN : (D)Z
    //   387: pop
    //   388: aload #17
    //   390: ldc 'x'
    //   392: dload #9
    //   394: dload_1
    //   395: dmul
    //   396: invokeinterface putDouble : (Ljava/lang/String;D)V
    //   401: aload #14
    //   403: invokevirtual floatValue : ()F
    //   406: f2d
    //   407: dstore #9
    //   409: dload #9
    //   411: invokestatic isNaN : (D)Z
    //   414: pop
    //   415: aload #17
    //   417: ldc 'y'
    //   419: dload #9
    //   421: dload_3
    //   422: dmul
    //   423: invokeinterface putDouble : (Ljava/lang/String;D)V
    //   428: invokestatic createMap : ()Lcom/facebook/react/bridge/WritableMap;
    //   431: astore #13
    //   433: aload_0
    //   434: invokevirtual j : ()F
    //   437: f2d
    //   438: dstore #9
    //   440: dload #9
    //   442: invokestatic isNaN : (D)Z
    //   445: pop
    //   446: aload #13
    //   448: ldc 'width'
    //   450: dload #9
    //   452: dload_1
    //   453: dmul
    //   454: invokeinterface putDouble : (Ljava/lang/String;D)V
    //   459: aload_0
    //   460: invokevirtual c : ()F
    //   463: f2d
    //   464: dstore_1
    //   465: dload_1
    //   466: invokestatic isNaN : (D)Z
    //   469: pop
    //   470: aload #13
    //   472: ldc 'height'
    //   474: dload_1
    //   475: dload_3
    //   476: dmul
    //   477: invokeinterface putDouble : (Ljava/lang/String;D)V
    //   482: invokestatic createMap : ()Lcom/facebook/react/bridge/WritableMap;
    //   485: astore_0
    //   486: aload_0
    //   487: ldc 'origin'
    //   489: aload #17
    //   491: invokeinterface putMap : (Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V
    //   496: aload_0
    //   497: ldc 'size'
    //   499: aload #13
    //   501: invokeinterface putMap : (Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V
    //   506: aload #16
    //   508: ldc 'bounds'
    //   510: aload_0
    //   511: invokeinterface putMap : (Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V
    //   516: aload #16
    //   518: areturn
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/facedetector/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */