package com.RNFetchBlob;

import android.net.Uri;
import android.util.Base64;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import j.d;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import okhttp3.MediaType;
import okhttp3.RequestBody;

class a extends RequestBody {
  private InputStream a;
  
  private long b = 0L;
  
  private ReadableArray c;
  
  private String d;
  
  private String e;
  
  private g.e f;
  
  private MediaType g;
  
  private File h;
  
  private Boolean i = Boolean.valueOf(false);
  
  a(String paramString) {
    this.d = paramString;
  }
  
  private void a(long paramLong) {
    f f = g.c(this.d);
    if (f != null) {
      long l = this.b;
      if (l != 0L && f.a((float)paramLong / (float)l)) {
        WritableMap writableMap = Arguments.createMap();
        writableMap.putString("taskId", this.d);
        writableMap.putString("written", String.valueOf(paramLong));
        writableMap.putString("total", String.valueOf(this.b));
        ((DeviceEventManagerModule.RCTDeviceEventEmitter)RNFetchBlob.RCTContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("RNFetchBlobProgress-upload", writableMap);
      } 
    } 
  }
  
  private void a(InputStream paramInputStream, d paramd) {
    byte[] arrayOfByte = new byte[10240];
    long l = 0L;
    while (true) {
      int i = paramInputStream.read(arrayOfByte, 0, 10240);
      if (i > 0) {
        paramd.write(arrayOfByte, 0, i);
        l += i;
        a(l);
        continue;
      } 
      paramInputStream.close();
      return;
    } 
  }
  
  private void a(InputStream paramInputStream, FileOutputStream paramFileOutputStream) {
    byte[] arrayOfByte = new byte[10240];
    while (true) {
      int i = paramInputStream.read(arrayOfByte);
      if (i > 0) {
        paramFileOutputStream.write(arrayOfByte, 0, i);
        continue;
      } 
      paramInputStream.close();
      return;
    } 
  }
  
  private ArrayList<b> b() {
    Object object;
    long l1;
    ArrayList<b> arrayList = new ArrayList();
    ReactApplicationContext reactApplicationContext = RNFetchBlob.RCTContext;
    long l2 = 0L;
    int i = 0;
    while (true) {
      InputStream inputStream;
      if (i < this.c.size()) {
        String str1;
        StringBuilder stringBuilder;
        b b = new b(this, this.c.getMap(i));
        arrayList.add(b);
        String str2 = b.d;
        if (str2 == null) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("RNFetchBlob multipart request builder has found a field without `data` property, the field `");
          stringBuilder.append(b.a);
          stringBuilder.append("` will be removed implicitly.");
          str1 = stringBuilder.toString();
        } else {
          int j;
          InputStream inputStream1;
          if (((b)str1).b != null) {
            if (stringBuilder.startsWith("RNFetchBlob-file://")) {
              String str;
              str1 = d.e(stringBuilder.substring(19));
              if (d.c(str1)) {
                try {
                  str1 = str1.replace("bundle-assets://", "");
                  j = reactApplicationContext.getAssets().open(str1).available();
                } catch (IOException iOException) {
                  str = iOException.getLocalizedMessage();
                  h.a(str);
                  Object object1 = object;
                } 
              } else {
                long l4 = (new File(d.e(str))).length();
                l4 = object + l4;
              } 
            } else {
              if (stringBuilder.startsWith("RNFetchBlob-content://")) {
                String str = stringBuilder.substring(22);
                str1 = null;
                stringBuilder = null;
                try {
                  InputStream inputStream2 = reactApplicationContext.getContentResolver().openInputStream(Uri.parse(str));
                  inputStream1 = inputStream2;
                  inputStream = inputStream2;
                  j = inputStream2.available();
                  l1 = object + j;
                  long l4 = l1;
                  if (inputStream2 != null) {
                    inputStream = inputStream2;
                    l4 = l1;
                  } else {
                    continue;
                  } 
                } catch (Exception exception) {
                  inputStream1 = inputStream;
                } finally {}
              } else {
                j = (Base64.decode((String)inputStream1, 0)).length;
                long l4 = j;
              } 
              inputStream.close();
            } 
          } else {
            j = (inputStream1.getBytes()).length;
          } 
          long l3 = j;
        } 
      } else {
        break;
      } 
      h.a((String)inputStream);
      long l = l1;
      i++;
      object = SYNTHETIC_LOCAL_VARIABLE_3;
    } 
    this.b = l1;
    return arrayList;
  }
  
  private File c() {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_1
    //   8: aload_1
    //   9: ldc_w 'RNFetchBlob-'
    //   12: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   15: pop
    //   16: aload_1
    //   17: aload_0
    //   18: getfield d : Ljava/lang/String;
    //   21: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   24: pop
    //   25: aload_1
    //   26: invokevirtual toString : ()Ljava/lang/String;
    //   29: astore #5
    //   31: ldc_w 'rnfb-form-tmp'
    //   34: ldc ''
    //   36: getstatic com/RNFetchBlob/RNFetchBlob.RCTContext : Lcom/facebook/react/bridge/ReactApplicationContext;
    //   39: invokevirtual getCacheDir : ()Ljava/io/File;
    //   42: invokestatic createTempFile : (Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    //   45: astore #6
    //   47: new java/io/FileOutputStream
    //   50: dup
    //   51: aload #6
    //   53: invokespecial <init> : (Ljava/io/File;)V
    //   56: astore #7
    //   58: aload_0
    //   59: invokespecial b : ()Ljava/util/ArrayList;
    //   62: astore_1
    //   63: getstatic com/RNFetchBlob/RNFetchBlob.RCTContext : Lcom/facebook/react/bridge/ReactApplicationContext;
    //   66: astore #8
    //   68: aload_1
    //   69: invokevirtual iterator : ()Ljava/util/Iterator;
    //   72: astore #4
    //   74: aload #4
    //   76: invokeinterface hasNext : ()Z
    //   81: ifeq -> 744
    //   84: aload #4
    //   86: invokeinterface next : ()Ljava/lang/Object;
    //   91: checkcast com/RNFetchBlob/a$b
    //   94: astore_1
    //   95: aload_1
    //   96: getfield d : Ljava/lang/String;
    //   99: astore_2
    //   100: aload_1
    //   101: getfield a : Ljava/lang/String;
    //   104: astore_3
    //   105: aload_3
    //   106: ifnull -> 74
    //   109: aload_2
    //   110: ifnonnull -> 116
    //   113: goto -> 74
    //   116: new java/lang/StringBuilder
    //   119: dup
    //   120: invokespecial <init> : ()V
    //   123: astore #9
    //   125: aload #9
    //   127: ldc_w '--'
    //   130: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   133: pop
    //   134: aload #9
    //   136: aload #5
    //   138: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: pop
    //   142: aload #9
    //   144: ldc_w '\\r\\n'
    //   147: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: pop
    //   151: aload #9
    //   153: invokevirtual toString : ()Ljava/lang/String;
    //   156: astore #9
    //   158: aload_1
    //   159: getfield b : Ljava/lang/String;
    //   162: ifnull -> 625
    //   165: new java/lang/StringBuilder
    //   168: dup
    //   169: invokespecial <init> : ()V
    //   172: astore #10
    //   174: aload #10
    //   176: aload #9
    //   178: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: pop
    //   182: aload #10
    //   184: ldc_w 'Content-Disposition: form-data; name="'
    //   187: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: pop
    //   191: aload #10
    //   193: aload_3
    //   194: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   197: pop
    //   198: aload #10
    //   200: ldc_w '"; filename="'
    //   203: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: pop
    //   207: aload #10
    //   209: aload_1
    //   210: getfield b : Ljava/lang/String;
    //   213: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: pop
    //   217: aload #10
    //   219: ldc_w '"\\r\\n'
    //   222: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   225: pop
    //   226: aload #10
    //   228: invokevirtual toString : ()Ljava/lang/String;
    //   231: astore_3
    //   232: new java/lang/StringBuilder
    //   235: dup
    //   236: invokespecial <init> : ()V
    //   239: astore #9
    //   241: aload #9
    //   243: aload_3
    //   244: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   247: pop
    //   248: aload #9
    //   250: ldc_w 'Content-Type: '
    //   253: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   256: pop
    //   257: aload #9
    //   259: aload_1
    //   260: getfield c : Ljava/lang/String;
    //   263: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   266: pop
    //   267: aload #9
    //   269: ldc_w '\\r\\n\\r\\n'
    //   272: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   275: pop
    //   276: aload #7
    //   278: aload #9
    //   280: invokevirtual toString : ()Ljava/lang/String;
    //   283: invokevirtual getBytes : ()[B
    //   286: invokevirtual write : ([B)V
    //   289: aload_2
    //   290: ldc 'RNFetchBlob-file://'
    //   292: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   295: ifeq -> 467
    //   298: aload_2
    //   299: bipush #19
    //   301: invokevirtual substring : (I)Ljava/lang/String;
    //   304: invokestatic e : (Ljava/lang/String;)Ljava/lang/String;
    //   307: astore_1
    //   308: aload_1
    //   309: invokestatic c : (Ljava/lang/String;)Z
    //   312: ifeq -> 389
    //   315: aload_1
    //   316: ldc 'bundle-assets://'
    //   318: ldc ''
    //   320: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   323: astore_2
    //   324: aload_0
    //   325: aload #8
    //   327: invokevirtual getAssets : ()Landroid/content/res/AssetManager;
    //   330: aload_2
    //   331: invokevirtual open : (Ljava/lang/String;)Ljava/io/InputStream;
    //   334: aload #7
    //   336: invokespecial a : (Ljava/io/InputStream;Ljava/io/FileOutputStream;)V
    //   339: goto -> 730
    //   342: astore_2
    //   343: new java/lang/StringBuilder
    //   346: dup
    //   347: invokespecial <init> : ()V
    //   350: astore_3
    //   351: aload_3
    //   352: ldc_w 'Failed to create form data asset :'
    //   355: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   358: pop
    //   359: aload_3
    //   360: aload_1
    //   361: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   364: pop
    //   365: aload_3
    //   366: ldc ', '
    //   368: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   371: pop
    //   372: aload_3
    //   373: aload_2
    //   374: invokevirtual getLocalizedMessage : ()Ljava/lang/String;
    //   377: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   380: pop
    //   381: aload_3
    //   382: invokevirtual toString : ()Ljava/lang/String;
    //   385: astore_1
    //   386: goto -> 460
    //   389: new java/io/File
    //   392: dup
    //   393: aload_1
    //   394: invokestatic e : (Ljava/lang/String;)Ljava/lang/String;
    //   397: invokespecial <init> : (Ljava/lang/String;)V
    //   400: astore_2
    //   401: aload_2
    //   402: invokevirtual exists : ()Z
    //   405: ifeq -> 425
    //   408: aload_0
    //   409: new java/io/FileInputStream
    //   412: dup
    //   413: aload_2
    //   414: invokespecial <init> : (Ljava/io/File;)V
    //   417: aload #7
    //   419: invokespecial a : (Ljava/io/InputStream;Ljava/io/FileOutputStream;)V
    //   422: goto -> 730
    //   425: new java/lang/StringBuilder
    //   428: dup
    //   429: invokespecial <init> : ()V
    //   432: astore_2
    //   433: aload_2
    //   434: ldc_w 'Failed to create form data from path :'
    //   437: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   440: pop
    //   441: aload_2
    //   442: aload_1
    //   443: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   446: pop
    //   447: aload_2
    //   448: ldc_w ', file not exists.'
    //   451: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   454: pop
    //   455: aload_2
    //   456: invokevirtual toString : ()Ljava/lang/String;
    //   459: astore_1
    //   460: aload_1
    //   461: invokestatic a : (Ljava/lang/String;)V
    //   464: goto -> 730
    //   467: aload_2
    //   468: ldc 'RNFetchBlob-content://'
    //   470: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   473: ifeq -> 612
    //   476: aload_2
    //   477: bipush #22
    //   479: invokevirtual substring : (I)Ljava/lang/String;
    //   482: astore #9
    //   484: aconst_null
    //   485: astore_1
    //   486: aconst_null
    //   487: astore_2
    //   488: aload #8
    //   490: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   493: aload #9
    //   495: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   498: invokevirtual openInputStream : (Landroid/net/Uri;)Ljava/io/InputStream;
    //   501: astore_3
    //   502: aload_3
    //   503: astore_2
    //   504: aload_3
    //   505: astore_1
    //   506: aload_0
    //   507: aload_3
    //   508: aload #7
    //   510: invokespecial a : (Ljava/io/InputStream;Ljava/io/FileOutputStream;)V
    //   513: aload_3
    //   514: ifnull -> 730
    //   517: aload_3
    //   518: astore_1
    //   519: aload_1
    //   520: invokevirtual close : ()V
    //   523: goto -> 730
    //   526: astore_1
    //   527: goto -> 602
    //   530: astore_3
    //   531: aload_1
    //   532: astore_2
    //   533: new java/lang/StringBuilder
    //   536: dup
    //   537: invokespecial <init> : ()V
    //   540: astore #10
    //   542: aload_1
    //   543: astore_2
    //   544: aload #10
    //   546: ldc_w 'Failed to create form data from content URI:'
    //   549: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   552: pop
    //   553: aload_1
    //   554: astore_2
    //   555: aload #10
    //   557: aload #9
    //   559: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   562: pop
    //   563: aload_1
    //   564: astore_2
    //   565: aload #10
    //   567: ldc ', '
    //   569: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   572: pop
    //   573: aload_1
    //   574: astore_2
    //   575: aload #10
    //   577: aload_3
    //   578: invokevirtual getLocalizedMessage : ()Ljava/lang/String;
    //   581: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   584: pop
    //   585: aload_1
    //   586: astore_2
    //   587: aload #10
    //   589: invokevirtual toString : ()Ljava/lang/String;
    //   592: invokestatic a : (Ljava/lang/String;)V
    //   595: aload_1
    //   596: ifnull -> 730
    //   599: goto -> 519
    //   602: aload_2
    //   603: ifnull -> 610
    //   606: aload_2
    //   607: invokevirtual close : ()V
    //   610: aload_1
    //   611: athrow
    //   612: aload #7
    //   614: aload_2
    //   615: iconst_0
    //   616: invokestatic decode : (Ljava/lang/String;I)[B
    //   619: invokevirtual write : ([B)V
    //   622: goto -> 730
    //   625: new java/lang/StringBuilder
    //   628: dup
    //   629: invokespecial <init> : ()V
    //   632: astore_2
    //   633: aload_2
    //   634: aload #9
    //   636: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   639: pop
    //   640: aload_2
    //   641: ldc_w 'Content-Disposition: form-data; name="'
    //   644: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   647: pop
    //   648: aload_2
    //   649: aload_3
    //   650: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   653: pop
    //   654: aload_2
    //   655: ldc_w '"\\r\\n'
    //   658: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   661: pop
    //   662: aload_2
    //   663: invokevirtual toString : ()Ljava/lang/String;
    //   666: astore_2
    //   667: new java/lang/StringBuilder
    //   670: dup
    //   671: invokespecial <init> : ()V
    //   674: astore_3
    //   675: aload_3
    //   676: aload_2
    //   677: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   680: pop
    //   681: aload_3
    //   682: ldc_w 'Content-Type: '
    //   685: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   688: pop
    //   689: aload_3
    //   690: aload_1
    //   691: getfield c : Ljava/lang/String;
    //   694: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   697: pop
    //   698: aload_3
    //   699: ldc_w '\\r\\n\\r\\n'
    //   702: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   705: pop
    //   706: aload #7
    //   708: aload_3
    //   709: invokevirtual toString : ()Ljava/lang/String;
    //   712: invokevirtual getBytes : ()[B
    //   715: invokevirtual write : ([B)V
    //   718: aload #7
    //   720: aload_1
    //   721: getfield d : Ljava/lang/String;
    //   724: invokevirtual getBytes : ()[B
    //   727: invokevirtual write : ([B)V
    //   730: aload #7
    //   732: ldc_w '\\r\\n'
    //   735: invokevirtual getBytes : ()[B
    //   738: invokevirtual write : ([B)V
    //   741: goto -> 74
    //   744: new java/lang/StringBuilder
    //   747: dup
    //   748: invokespecial <init> : ()V
    //   751: astore_1
    //   752: aload_1
    //   753: ldc_w '--'
    //   756: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   759: pop
    //   760: aload_1
    //   761: aload #5
    //   763: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   766: pop
    //   767: aload_1
    //   768: ldc_w '--\\r\\n'
    //   771: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   774: pop
    //   775: aload #7
    //   777: aload_1
    //   778: invokevirtual toString : ()Ljava/lang/String;
    //   781: invokevirtual getBytes : ()[B
    //   784: invokevirtual write : ([B)V
    //   787: aload #7
    //   789: invokevirtual flush : ()V
    //   792: aload #7
    //   794: invokevirtual close : ()V
    //   797: aload #6
    //   799: areturn
    // Exception table:
    //   from	to	target	type
    //   315	339	342	java/io/IOException
    //   488	502	530	java/lang/Exception
    //   488	502	526	finally
    //   506	513	530	java/lang/Exception
    //   506	513	526	finally
    //   533	542	526	finally
    //   544	553	526	finally
    //   555	563	526	finally
    //   565	573	526	finally
    //   575	585	526	finally
    //   587	595	526	finally
  }
  
  private InputStream d() {
    if (this.e.startsWith("RNFetchBlob-file://")) {
      String str = d.e(this.e.substring(19));
      if (d.c(str))
        try {
          str = str.replace("bundle-assets://", "");
          return RNFetchBlob.RCTContext.getAssets().open(str);
        } catch (Exception exception) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("error when getting request stream from asset : ");
          stringBuilder.append(exception.getLocalizedMessage());
          throw new Exception(stringBuilder.toString());
        }  
      File file = new File(d.e((String)exception));
      try {
        if (!file.exists())
          file.createNewFile(); 
        return new FileInputStream(file);
      } catch (Exception exception1) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("error when getting request stream: ");
        stringBuilder.append(exception1.getLocalizedMessage());
        throw new Exception(stringBuilder.toString());
      } 
    } 
    if (this.e.startsWith("RNFetchBlob-content://")) {
      String str = this.e.substring(22);
      try {
        return RNFetchBlob.RCTContext.getContentResolver().openInputStream(Uri.parse(str));
      } catch (Exception exception) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("error when getting request stream for content URI: ");
        stringBuilder.append(str);
        throw new Exception(stringBuilder.toString(), exception);
      } 
    } 
    try {
      return new ByteArrayInputStream(Base64.decode(this.e, 0));
    } catch (Exception exception) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("error when getting request stream: ");
      stringBuilder.append(exception.getLocalizedMessage());
      throw new Exception(stringBuilder.toString());
    } 
  }
  
  a a(g.e parame) {
    this.f = parame;
    return this;
  }
  
  a a(ReadableArray paramReadableArray) {
    this.c = paramReadableArray;
    try {
      this.h = c();
      this.a = new FileInputStream(this.h);
      this.b = this.h.length();
      return this;
    } catch (Exception exception) {
      exception.printStackTrace();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("RNFetchBlob failed to create request multipart body :");
      stringBuilder.append(exception.getLocalizedMessage());
      h.a(stringBuilder.toString());
      return this;
    } 
  }
  
  a a(String paramString) {
    this.e = paramString;
    if (this.e == null) {
      this.e = "";
      this.f = g.e.e;
    } 
    try {
      int i = a.a[this.f.ordinal()];
      if (i != 1) {
        if (i != 2)
          return this; 
        this.b = (this.e.getBytes()).length;
        this.a = new ByteArrayInputStream(this.e.getBytes());
        return this;
      } 
      this.a = d();
      this.b = this.a.available();
      return this;
    } catch (Exception exception) {
      exception.printStackTrace();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("RNFetchBlob failed to create single content request body :");
      stringBuilder.append(exception.getLocalizedMessage());
      stringBuilder.append("\r\n");
      h.a(stringBuilder.toString());
      return this;
    } 
  }
  
  a a(MediaType paramMediaType) {
    this.g = paramMediaType;
    return this;
  }
  
  a a(boolean paramBoolean) {
    this.i = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  boolean a() {
    try {
      if (this.h != null && this.h.exists())
        this.h.delete(); 
      return true;
    } catch (Exception exception) {
      h.a(exception.getLocalizedMessage());
      return false;
    } 
  }
  
  public long contentLength() {
    return this.i.booleanValue() ? -1L : this.b;
  }
  
  public MediaType contentType() {
    return this.g;
  }
  
  public void writeTo(d paramd) {
    try {
      a(this.a, paramd);
      return;
    } catch (Exception exception) {
      h.a(exception.getLocalizedMessage());
      exception.printStackTrace();
      return;
    } 
  }
  
  private class b {
    public String a;
    
    String b;
    
    String c;
    
    public String d;
    
    b(a this$0, ReadableMap param1ReadableMap) {
      String str;
      if (param1ReadableMap.hasKey("name"))
        this.a = param1ReadableMap.getString("name"); 
      if (param1ReadableMap.hasKey("filename"))
        this.b = param1ReadableMap.getString("filename"); 
      if (param1ReadableMap.hasKey("type")) {
        str = param1ReadableMap.getString("type");
      } else if (this.b == null) {
        str = "text/plain";
      } else {
        str = "application/octet-stream";
      } 
      this.c = str;
      if (param1ReadableMap.hasKey("data"))
        this.d = param1ReadableMap.getString("data"); 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/RNFetchBlob/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */