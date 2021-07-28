package e.a.a.j;

import e.a.a.a;
import e.a.a.d;
import e.a.a.h;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public final class p implements h, a {
  private Map c = new HashMap<Object, Object>();
  
  private Map d = new HashMap<Object, Object>();
  
  private Map e = new HashMap<Object, Object>();
  
  private Pattern f = Pattern.compile("[/*?\\[\\]]");
  
  public p() {
    try {
      b();
      a();
      return;
    } catch (d d) {
      throw new RuntimeException("The XMPSchemaRegistry cannot be initialized!");
    } 
  }
  
  private void a() {
    e.a.a.k.a a1 = new e.a.a.k.a();
    a1.b(true);
    e.a.a.k.a a2 = new e.a.a.k.a();
    a2.a(true);
    a("http://ns.adobe.com/xap/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", a1);
    a("http://ns.adobe.com/xap/1.0/", "Authors", "http://purl.org/dc/elements/1.1/", "creator", null);
    a("http://ns.adobe.com/xap/1.0/", "Description", "http://purl.org/dc/elements/1.1/", "description", null);
    a("http://ns.adobe.com/xap/1.0/", "Format", "http://purl.org/dc/elements/1.1/", "format", null);
    a("http://ns.adobe.com/xap/1.0/", "Keywords", "http://purl.org/dc/elements/1.1/", "subject", null);
    a("http://ns.adobe.com/xap/1.0/", "Locale", "http://purl.org/dc/elements/1.1/", "language", null);
    a("http://ns.adobe.com/xap/1.0/", "Title", "http://purl.org/dc/elements/1.1/", "title", null);
    a("http://ns.adobe.com/xap/1.0/rights/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", null);
    a("http://ns.adobe.com/pdf/1.3/", "Author", "http://purl.org/dc/elements/1.1/", "creator", a1);
    a("http://ns.adobe.com/pdf/1.3/", "BaseURL", "http://ns.adobe.com/xap/1.0/", "BaseURL", null);
    a("http://ns.adobe.com/pdf/1.3/", "CreationDate", "http://ns.adobe.com/xap/1.0/", "CreateDate", null);
    a("http://ns.adobe.com/pdf/1.3/", "Creator", "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
    a("http://ns.adobe.com/pdf/1.3/", "ModDate", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
    a("http://ns.adobe.com/pdf/1.3/", "Subject", "http://purl.org/dc/elements/1.1/", "description", a2);
    a("http://ns.adobe.com/pdf/1.3/", "Title", "http://purl.org/dc/elements/1.1/", "title", a2);
    a("http://ns.adobe.com/photoshop/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", a1);
    a("http://ns.adobe.com/photoshop/1.0/", "Caption", "http://purl.org/dc/elements/1.1/", "description", a2);
    a("http://ns.adobe.com/photoshop/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", a2);
    a("http://ns.adobe.com/photoshop/1.0/", "Keywords", "http://purl.org/dc/elements/1.1/", "subject", null);
    a("http://ns.adobe.com/photoshop/1.0/", "Marked", "http://ns.adobe.com/xap/1.0/rights/", "Marked", null);
    a("http://ns.adobe.com/photoshop/1.0/", "Title", "http://purl.org/dc/elements/1.1/", "title", a2);
    a("http://ns.adobe.com/photoshop/1.0/", "WebStatement", "http://ns.adobe.com/xap/1.0/rights/", "WebStatement", null);
    a("http://ns.adobe.com/tiff/1.0/", "Artist", "http://purl.org/dc/elements/1.1/", "creator", a1);
    a("http://ns.adobe.com/tiff/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", null);
    a("http://ns.adobe.com/tiff/1.0/", "DateTime", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
    a("http://ns.adobe.com/tiff/1.0/", "ImageDescription", "http://purl.org/dc/elements/1.1/", "description", null);
    a("http://ns.adobe.com/tiff/1.0/", "Software", "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
    a("http://ns.adobe.com/png/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", a1);
    a("http://ns.adobe.com/png/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", a2);
    a("http://ns.adobe.com/png/1.0/", "CreationTime", "http://ns.adobe.com/xap/1.0/", "CreateDate", null);
    a("http://ns.adobe.com/png/1.0/", "Description", "http://purl.org/dc/elements/1.1/", "description", a2);
    a("http://ns.adobe.com/png/1.0/", "ModificationTime", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
    a("http://ns.adobe.com/png/1.0/", "Software", "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
    a("http://ns.adobe.com/png/1.0/", "Title", "http://purl.org/dc/elements/1.1/", "title", a2);
  }
  
  private void b() {
    a("http://www.w3.org/XML/1998/namespace", "xml");
    a("http://www.w3.org/1999/02/22-rdf-syntax-ns#", "rdf");
    a("http://purl.org/dc/elements/1.1/", "dc");
    a("http://iptc.org/std/Iptc4xmpCore/1.0/xmlns/", "Iptc4xmpCore");
    a("http://iptc.org/std/Iptc4xmpExt/2008-02-29/", "Iptc4xmpExt");
    a("http://ns.adobe.com/DICOM/", "DICOM");
    a("http://ns.useplus.org/ldf/xmp/1.0/", "plus");
    a("adobe:ns:meta/", "x");
    a("http://ns.adobe.com/iX/1.0/", "iX");
    a("http://ns.adobe.com/xap/1.0/", "xmp");
    a("http://ns.adobe.com/xap/1.0/rights/", "xmpRights");
    a("http://ns.adobe.com/xap/1.0/mm/", "xmpMM");
    a("http://ns.adobe.com/xap/1.0/bj/", "xmpBJ");
    a("http://ns.adobe.com/xmp/note/", "xmpNote");
    a("http://ns.adobe.com/pdf/1.3/", "pdf");
    a("http://ns.adobe.com/pdfx/1.3/", "pdfx");
    a("http://www.npes.org/pdfx/ns/id/", "pdfxid");
    a("http://www.aiim.org/pdfa/ns/schema#", "pdfaSchema");
    a("http://www.aiim.org/pdfa/ns/property#", "pdfaProperty");
    a("http://www.aiim.org/pdfa/ns/type#", "pdfaType");
    a("http://www.aiim.org/pdfa/ns/field#", "pdfaField");
    a("http://www.aiim.org/pdfa/ns/id/", "pdfaid");
    a("http://www.aiim.org/pdfa/ns/extension/", "pdfaExtension");
    a("http://ns.adobe.com/photoshop/1.0/", "photoshop");
    a("http://ns.adobe.com/album/1.0/", "album");
    a("http://ns.adobe.com/exif/1.0/", "exif");
    a("http://cipa.jp/exif/1.0/", "exifEX");
    a("http://ns.adobe.com/exif/1.0/aux/", "aux");
    a("http://ns.adobe.com/tiff/1.0/", "tiff");
    a("http://ns.adobe.com/png/1.0/", "png");
    a("http://ns.adobe.com/jpeg/1.0/", "jpeg");
    a("http://ns.adobe.com/jp2k/1.0/", "jp2k");
    a("http://ns.adobe.com/camera-raw-settings/1.0/", "crs");
    a("http://ns.adobe.com/StockPhoto/1.0/", "bmsp");
    a("http://ns.adobe.com/creatorAtom/1.0/", "creatorAtom");
    a("http://ns.adobe.com/asf/1.0/", "asf");
    a("http://ns.adobe.com/xmp/wav/1.0/", "wav");
    a("http://ns.adobe.com/bwf/bext/1.0/", "bext");
    a("http://ns.adobe.com/riff/info/", "riffinfo");
    a("http://ns.adobe.com/xmp/1.0/Script/", "xmpScript");
    a("http://ns.adobe.com/TransformXMP/", "txmp");
    a("http://ns.adobe.com/swf/1.0/", "swf");
    a("http://ns.adobe.com/xmp/1.0/DynamicMedia/", "xmpDM");
    a("http://ns.adobe.com/xmp/transient/1.0/", "xmpx");
    a("http://ns.adobe.com/xap/1.0/t/", "xmpT");
    a("http://ns.adobe.com/xap/1.0/t/pg/", "xmpTPg");
    a("http://ns.adobe.com/xap/1.0/g/", "xmpG");
    a("http://ns.adobe.com/xap/1.0/g/img/", "xmpGImg");
    a("http://ns.adobe.com/xap/1.0/sType/Font#", "stFnt");
    a("http://ns.adobe.com/xap/1.0/sType/Dimensions#", "stDim");
    a("http://ns.adobe.com/xap/1.0/sType/ResourceEvent#", "stEvt");
    a("http://ns.adobe.com/xap/1.0/sType/ResourceRef#", "stRef");
    a("http://ns.adobe.com/xap/1.0/sType/Version#", "stVer");
    a("http://ns.adobe.com/xap/1.0/sType/Job#", "stJob");
    a("http://ns.adobe.com/xap/1.0/sType/ManifestItem#", "stMfs");
    a("http://ns.adobe.com/xmp/Identifier/qual/1.0/", "xmpidq");
  }
  
  public e.a.a.l.a a(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield e : Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   12: checkcast e/a/a/l/a
    //   15: astore_1
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_1
    //   19: areturn
    //   20: astore_1
    //   21: aload_0
    //   22: monitorexit
    //   23: aload_1
    //   24: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	20	finally
  }
  
  public String a(String paramString1, String paramString2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokestatic d : (Ljava/lang/String;)V
    //   6: aload_2
    //   7: invokestatic b : (Ljava/lang/String;)V
    //   10: aload_2
    //   11: astore #4
    //   13: aload_2
    //   14: aload_2
    //   15: invokevirtual length : ()I
    //   18: iconst_1
    //   19: isub
    //   20: invokevirtual charAt : (I)C
    //   23: bipush #58
    //   25: if_icmpeq -> 59
    //   28: new java/lang/StringBuilder
    //   31: dup
    //   32: invokespecial <init> : ()V
    //   35: astore #4
    //   37: aload #4
    //   39: aload_2
    //   40: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: pop
    //   44: aload #4
    //   46: bipush #58
    //   48: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   51: pop
    //   52: aload #4
    //   54: invokevirtual toString : ()Ljava/lang/String;
    //   57: astore #4
    //   59: aload #4
    //   61: iconst_0
    //   62: aload #4
    //   64: invokevirtual length : ()I
    //   67: iconst_1
    //   68: isub
    //   69: invokevirtual substring : (II)Ljava/lang/String;
    //   72: invokestatic c : (Ljava/lang/String;)Z
    //   75: ifeq -> 230
    //   78: aload_0
    //   79: getfield c : Ljava/util/Map;
    //   82: aload_1
    //   83: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   88: checkcast java/lang/String
    //   91: astore_2
    //   92: aload_0
    //   93: getfield d : Ljava/util/Map;
    //   96: aload #4
    //   98: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   103: checkcast java/lang/String
    //   106: astore #5
    //   108: aload_2
    //   109: ifnull -> 116
    //   112: aload_0
    //   113: monitorexit
    //   114: aload_2
    //   115: areturn
    //   116: aload #4
    //   118: astore_2
    //   119: aload #5
    //   121: ifnull -> 202
    //   124: aload #4
    //   126: astore_2
    //   127: iconst_1
    //   128: istore_3
    //   129: aload_0
    //   130: getfield d : Ljava/util/Map;
    //   133: aload_2
    //   134: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   139: ifeq -> 255
    //   142: new java/lang/StringBuilder
    //   145: dup
    //   146: invokespecial <init> : ()V
    //   149: astore_2
    //   150: aload_2
    //   151: aload #4
    //   153: iconst_0
    //   154: aload #4
    //   156: invokevirtual length : ()I
    //   159: iconst_1
    //   160: isub
    //   161: invokevirtual substring : (II)Ljava/lang/String;
    //   164: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   167: pop
    //   168: aload_2
    //   169: ldc_w '_'
    //   172: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: pop
    //   176: aload_2
    //   177: iload_3
    //   178: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   181: pop
    //   182: aload_2
    //   183: ldc_w '_:'
    //   186: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   189: pop
    //   190: aload_2
    //   191: invokevirtual toString : ()Ljava/lang/String;
    //   194: astore_2
    //   195: iload_3
    //   196: iconst_1
    //   197: iadd
    //   198: istore_3
    //   199: goto -> 129
    //   202: aload_0
    //   203: getfield d : Ljava/util/Map;
    //   206: aload_2
    //   207: aload_1
    //   208: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   213: pop
    //   214: aload_0
    //   215: getfield c : Ljava/util/Map;
    //   218: aload_1
    //   219: aload_2
    //   220: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   225: pop
    //   226: aload_0
    //   227: monitorexit
    //   228: aload_2
    //   229: areturn
    //   230: new e/a/a/d
    //   233: dup
    //   234: ldc_w 'The prefix is a bad XML name'
    //   237: sipush #201
    //   240: invokespecial <init> : (Ljava/lang/String;I)V
    //   243: athrow
    //   244: astore_1
    //   245: aload_0
    //   246: monitorexit
    //   247: goto -> 252
    //   250: aload_1
    //   251: athrow
    //   252: goto -> 250
    //   255: goto -> 202
    // Exception table:
    //   from	to	target	type
    //   2	10	244	finally
    //   13	59	244	finally
    //   59	108	244	finally
    //   129	195	244	finally
    //   202	226	244	finally
    //   230	244	244	finally
  }
  
  void a(String paramString1, String paramString2, String paramString3, String paramString4, e.a.a.k.a parama) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokestatic d : (Ljava/lang/String;)V
    //   6: aload_2
    //   7: invokestatic c : (Ljava/lang/String;)V
    //   10: aload_3
    //   11: invokestatic d : (Ljava/lang/String;)V
    //   14: aload #4
    //   16: invokestatic c : (Ljava/lang/String;)V
    //   19: aload #5
    //   21: ifnull -> 48
    //   24: new e/a/a/k/a
    //   27: dup
    //   28: aload #5
    //   30: invokevirtual f : ()Le/a/a/k/e;
    //   33: aconst_null
    //   34: invokestatic a : (Le/a/a/k/e;Ljava/lang/Object;)Le/a/a/k/e;
    //   37: invokevirtual a : ()I
    //   40: invokespecial <init> : (I)V
    //   43: astore #5
    //   45: goto -> 57
    //   48: new e/a/a/k/a
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: astore #5
    //   57: aload_0
    //   58: getfield f : Ljava/util/regex/Pattern;
    //   61: aload_2
    //   62: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   65: invokevirtual find : ()Z
    //   68: ifne -> 276
    //   71: aload_0
    //   72: getfield f : Ljava/util/regex/Pattern;
    //   75: aload #4
    //   77: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   80: invokevirtual find : ()Z
    //   83: ifne -> 276
    //   86: aload_0
    //   87: aload_1
    //   88: invokevirtual b : (Ljava/lang/String;)Ljava/lang/String;
    //   91: astore #6
    //   93: aload_0
    //   94: aload_3
    //   95: invokevirtual b : (Ljava/lang/String;)Ljava/lang/String;
    //   98: astore_1
    //   99: aload #6
    //   101: ifnull -> 263
    //   104: aload_1
    //   105: ifnull -> 250
    //   108: new java/lang/StringBuilder
    //   111: dup
    //   112: invokespecial <init> : ()V
    //   115: astore #7
    //   117: aload #7
    //   119: aload #6
    //   121: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: pop
    //   125: aload #7
    //   127: aload_2
    //   128: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: pop
    //   132: aload #7
    //   134: invokevirtual toString : ()Ljava/lang/String;
    //   137: astore_2
    //   138: aload_0
    //   139: getfield e : Ljava/util/Map;
    //   142: aload_2
    //   143: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   148: ifne -> 238
    //   151: aload_0
    //   152: getfield e : Ljava/util/Map;
    //   155: astore #6
    //   157: new java/lang/StringBuilder
    //   160: dup
    //   161: invokespecial <init> : ()V
    //   164: astore #7
    //   166: aload #7
    //   168: aload_1
    //   169: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   172: pop
    //   173: aload #7
    //   175: aload #4
    //   177: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: pop
    //   181: aload #6
    //   183: aload #7
    //   185: invokevirtual toString : ()Ljava/lang/String;
    //   188: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   193: ifne -> 226
    //   196: new e/a/a/j/p$a
    //   199: dup
    //   200: aload_0
    //   201: aload_3
    //   202: aload_1
    //   203: aload #4
    //   205: aload #5
    //   207: invokespecial <init> : (Le/a/a/j/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le/a/a/k/a;)V
    //   210: astore_1
    //   211: aload_0
    //   212: getfield e : Ljava/util/Map;
    //   215: aload_2
    //   216: aload_1
    //   217: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   222: pop
    //   223: aload_0
    //   224: monitorexit
    //   225: return
    //   226: new e/a/a/d
    //   229: dup
    //   230: ldc_w 'Actual property is already an alias, use the base property'
    //   233: iconst_4
    //   234: invokespecial <init> : (Ljava/lang/String;I)V
    //   237: athrow
    //   238: new e/a/a/d
    //   241: dup
    //   242: ldc_w 'Alias is already existing'
    //   245: iconst_4
    //   246: invokespecial <init> : (Ljava/lang/String;I)V
    //   249: athrow
    //   250: new e/a/a/d
    //   253: dup
    //   254: ldc_w 'Actual namespace is not registered'
    //   257: bipush #101
    //   259: invokespecial <init> : (Ljava/lang/String;I)V
    //   262: athrow
    //   263: new e/a/a/d
    //   266: dup
    //   267: ldc_w 'Alias namespace is not registered'
    //   270: bipush #101
    //   272: invokespecial <init> : (Ljava/lang/String;I)V
    //   275: athrow
    //   276: new e/a/a/d
    //   279: dup
    //   280: ldc_w 'Alias and actual property names must be simple'
    //   283: bipush #102
    //   285: invokespecial <init> : (Ljava/lang/String;I)V
    //   288: athrow
    //   289: astore_1
    //   290: aload_0
    //   291: monitorexit
    //   292: aload_1
    //   293: athrow
    // Exception table:
    //   from	to	target	type
    //   2	19	289	finally
    //   24	45	289	finally
    //   48	57	289	finally
    //   57	99	289	finally
    //   108	223	289	finally
    //   226	238	289	finally
    //   238	250	289	finally
    //   250	263	289	finally
    //   263	276	289	finally
    //   276	289	289	finally
  }
  
  public String b(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   12: checkcast java/lang/String
    //   15: astore_1
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_1
    //   19: areturn
    //   20: astore_1
    //   21: aload_0
    //   22: monitorexit
    //   23: aload_1
    //   24: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	20	finally
  }
  
  public String c(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: astore_2
    //   4: aload_1
    //   5: ifnull -> 47
    //   8: aload_1
    //   9: astore_2
    //   10: aload_1
    //   11: ldc_w ':'
    //   14: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   17: ifne -> 47
    //   20: new java/lang/StringBuilder
    //   23: dup
    //   24: invokespecial <init> : ()V
    //   27: astore_2
    //   28: aload_2
    //   29: aload_1
    //   30: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: pop
    //   34: aload_2
    //   35: ldc_w ':'
    //   38: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: pop
    //   42: aload_2
    //   43: invokevirtual toString : ()Ljava/lang/String;
    //   46: astore_2
    //   47: aload_0
    //   48: getfield d : Ljava/util/Map;
    //   51: aload_2
    //   52: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   57: checkcast java/lang/String
    //   60: astore_1
    //   61: aload_0
    //   62: monitorexit
    //   63: aload_1
    //   64: areturn
    //   65: astore_1
    //   66: aload_0
    //   67: monitorexit
    //   68: aload_1
    //   69: athrow
    // Exception table:
    //   from	to	target	type
    //   10	47	65	finally
    //   47	61	65	finally
  }
  
  class a implements e.a.a.l.a {
    a(p this$0, String param1String1, String param1String2, String param1String3, e.a.a.k.a param1a) {}
    
    public String a() {
      return this.b;
    }
    
    public String b() {
      return this.a;
    }
    
    public String c() {
      return this.c;
    }
    
    public e.a.a.k.a d() {
      return this.d;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.b);
      stringBuilder.append(this.c);
      stringBuilder.append(" NS(");
      stringBuilder.append(this.a);
      stringBuilder.append("), FORM (");
      stringBuilder.append(d());
      stringBuilder.append(")");
      return stringBuilder.toString();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/a/a/j/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */