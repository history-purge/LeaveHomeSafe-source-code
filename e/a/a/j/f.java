package e.a.a.j;

import e.a.a.a;
import e.a.a.c;
import e.a.a.d;
import e.a.a.g;
import e.a.a.h;
import e.a.a.k.e;
import java.util.Iterator;
import org.w3c.dom.Node;

public class f implements c, a {
  private static int a(Node paramNode) {
    // Byte code:
    //   0: aload_0
    //   1: invokeinterface getLocalName : ()Ljava/lang/String;
    //   6: astore_3
    //   7: aload_0
    //   8: invokeinterface getNamespaceURI : ()Ljava/lang/String;
    //   13: astore_2
    //   14: aload_2
    //   15: astore_1
    //   16: aload_2
    //   17: ifnonnull -> 76
    //   20: ldc 'about'
    //   22: aload_3
    //   23: invokevirtual equals : (Ljava/lang/Object;)Z
    //   26: ifne -> 40
    //   29: aload_2
    //   30: astore_1
    //   31: ldc 'ID'
    //   33: aload_3
    //   34: invokevirtual equals : (Ljava/lang/Object;)Z
    //   37: ifeq -> 76
    //   40: aload_2
    //   41: astore_1
    //   42: aload_0
    //   43: instanceof org/w3c/dom/Attr
    //   46: ifeq -> 76
    //   49: aload_2
    //   50: astore_1
    //   51: ldc 'http://www.w3.org/1999/02/22-rdf-syntax-ns#'
    //   53: aload_0
    //   54: checkcast org/w3c/dom/Attr
    //   57: invokeinterface getOwnerElement : ()Lorg/w3c/dom/Element;
    //   62: invokeinterface getNamespaceURI : ()Ljava/lang/String;
    //   67: invokevirtual equals : (Ljava/lang/Object;)Z
    //   70: ifeq -> 76
    //   73: ldc 'http://www.w3.org/1999/02/22-rdf-syntax-ns#'
    //   75: astore_1
    //   76: ldc 'http://www.w3.org/1999/02/22-rdf-syntax-ns#'
    //   78: aload_1
    //   79: invokevirtual equals : (Ljava/lang/Object;)Z
    //   82: ifeq -> 224
    //   85: ldc 'li'
    //   87: aload_3
    //   88: invokevirtual equals : (Ljava/lang/Object;)Z
    //   91: ifeq -> 97
    //   94: bipush #9
    //   96: ireturn
    //   97: ldc 'parseType'
    //   99: aload_3
    //   100: invokevirtual equals : (Ljava/lang/Object;)Z
    //   103: ifeq -> 108
    //   106: iconst_4
    //   107: ireturn
    //   108: ldc 'Description'
    //   110: aload_3
    //   111: invokevirtual equals : (Ljava/lang/Object;)Z
    //   114: ifeq -> 120
    //   117: bipush #8
    //   119: ireturn
    //   120: ldc 'about'
    //   122: aload_3
    //   123: invokevirtual equals : (Ljava/lang/Object;)Z
    //   126: ifeq -> 131
    //   129: iconst_3
    //   130: ireturn
    //   131: ldc 'resource'
    //   133: aload_3
    //   134: invokevirtual equals : (Ljava/lang/Object;)Z
    //   137: ifeq -> 142
    //   140: iconst_5
    //   141: ireturn
    //   142: ldc 'RDF'
    //   144: aload_3
    //   145: invokevirtual equals : (Ljava/lang/Object;)Z
    //   148: ifeq -> 153
    //   151: iconst_1
    //   152: ireturn
    //   153: ldc 'ID'
    //   155: aload_3
    //   156: invokevirtual equals : (Ljava/lang/Object;)Z
    //   159: ifeq -> 164
    //   162: iconst_2
    //   163: ireturn
    //   164: ldc 'nodeID'
    //   166: aload_3
    //   167: invokevirtual equals : (Ljava/lang/Object;)Z
    //   170: ifeq -> 176
    //   173: bipush #6
    //   175: ireturn
    //   176: ldc 'datatype'
    //   178: aload_3
    //   179: invokevirtual equals : (Ljava/lang/Object;)Z
    //   182: ifeq -> 188
    //   185: bipush #7
    //   187: ireturn
    //   188: ldc 'aboutEach'
    //   190: aload_3
    //   191: invokevirtual equals : (Ljava/lang/Object;)Z
    //   194: ifeq -> 200
    //   197: bipush #10
    //   199: ireturn
    //   200: ldc 'aboutEachPrefix'
    //   202: aload_3
    //   203: invokevirtual equals : (Ljava/lang/Object;)Z
    //   206: ifeq -> 212
    //   209: bipush #11
    //   211: ireturn
    //   212: ldc 'bagID'
    //   214: aload_3
    //   215: invokevirtual equals : (Ljava/lang/Object;)Z
    //   218: ifeq -> 224
    //   221: bipush #12
    //   223: ireturn
    //   224: iconst_0
    //   225: ireturn
  }
  
  private static m a(k paramk, m paramm, Node paramNode, String paramString, boolean paramBoolean) {
    h h = g.a();
    String str = paramNode.getNamespaceURI();
    if (str != null) {
      String str1 = str;
      if ("http://purl.org/dc/1.1/".equals(str))
        str1 = "http://purl.org/dc/elements/1.1/"; 
      String str2 = h.b(str1);
      str = str2;
      if (str2 == null) {
        if (paramNode.getPrefix() != null) {
          str = paramNode.getPrefix();
        } else {
          str = "_dflt";
        } 
        str = h.a(str1, str);
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str);
      stringBuilder.append(paramNode.getLocalName());
      str = stringBuilder.toString();
      e e = new e();
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (paramBoolean) {
        m m2 = n.a(paramk.a(), str1, "_dflt", true);
        m2.d(false);
        bool1 = bool2;
        paramm = m2;
        if (h.a(str) != null) {
          paramk.a().b(true);
          m2.b(true);
          bool1 = true;
          paramm = m2;
        } 
      } 
      bool2 = "rdf:li".equals(str);
      boolean bool3 = "rdf:value".equals(str);
      m m1 = new m(str, paramString, e);
      m1.a(bool1);
      if (!bool3) {
        paramm.a(m1);
      } else {
        paramm.a(1, m1);
      } 
      if (bool3)
        if (!paramBoolean && paramm.r().l()) {
          paramm.c(true);
        } else {
          throw new d("Misplaced rdf:value element", 202);
        }  
      if (bool2) {
        if (paramm.r().d()) {
          m1.c("[]");
          return m1;
        } 
        throw new d("Misplaced rdf:li element", 202);
      } 
      return m1;
    } 
    throw new d("XML namespace required for all elements and attributes", 202);
  }
  
  private static m a(m paramm, String paramString1, String paramString2) {
    String str = paramString2;
    if ("xml:lang".equals(paramString1))
      str = h.d(paramString2); 
    m m1 = new m(paramString1, str, null);
    paramm.b(m1);
    return m1;
  }
  
  private static void a() {
    throw new d("ParseTypeCollection property element not allowed", 203);
  }
  
  private static void a(k paramk, m paramm, Node paramNode) {
    for (int i = 0; i < paramNode.getChildNodes().getLength(); i++) {
      Node node = paramNode.getChildNodes().item(i);
      if (!b(node))
        c(paramk, paramm, node, true); 
    } 
  }
  
  private static void a(k paramk, m paramm, Node paramNode, boolean paramBoolean) {
    // Byte code:
    //   0: aload_2
    //   1: invokeinterface hasChildNodes : ()Z
    //   6: ifne -> 782
    //   9: aconst_null
    //   10: astore #14
    //   12: iconst_0
    //   13: istore #7
    //   15: iconst_0
    //   16: istore #8
    //   18: iconst_0
    //   19: istore #6
    //   21: iconst_0
    //   22: istore #5
    //   24: iconst_0
    //   25: istore #4
    //   27: iload #7
    //   29: aload_2
    //   30: invokeinterface getAttributes : ()Lorg/w3c/dom/NamedNodeMap;
    //   35: invokeinterface getLength : ()I
    //   40: if_icmpge -> 465
    //   43: aload_2
    //   44: invokeinterface getAttributes : ()Lorg/w3c/dom/NamedNodeMap;
    //   49: iload #7
    //   51: invokeinterface item : (I)Lorg/w3c/dom/Node;
    //   56: astore #16
    //   58: iload #8
    //   60: istore #9
    //   62: iload #6
    //   64: istore #10
    //   66: iload #5
    //   68: istore #11
    //   70: aload #14
    //   72: astore #15
    //   74: iload #4
    //   76: istore #12
    //   78: ldc 'xmlns'
    //   80: aload #16
    //   82: invokeinterface getPrefix : ()Ljava/lang/String;
    //   87: invokevirtual equals : (Ljava/lang/Object;)Z
    //   90: ifne -> 436
    //   93: aload #16
    //   95: invokeinterface getPrefix : ()Ljava/lang/String;
    //   100: ifnonnull -> 141
    //   103: ldc 'xmlns'
    //   105: aload #16
    //   107: invokeinterface getNodeName : ()Ljava/lang/String;
    //   112: invokevirtual equals : (Ljava/lang/Object;)Z
    //   115: ifeq -> 141
    //   118: iload #8
    //   120: istore #9
    //   122: iload #6
    //   124: istore #10
    //   126: iload #5
    //   128: istore #11
    //   130: aload #14
    //   132: astore #15
    //   134: iload #4
    //   136: istore #12
    //   138: goto -> 436
    //   141: aload #16
    //   143: invokestatic a : (Lorg/w3c/dom/Node;)I
    //   146: istore #13
    //   148: iload #13
    //   150: ifeq -> 312
    //   153: iload #8
    //   155: istore #9
    //   157: iload #6
    //   159: istore #10
    //   161: iload #5
    //   163: istore #11
    //   165: aload #14
    //   167: astore #15
    //   169: iload #4
    //   171: istore #12
    //   173: iload #13
    //   175: iconst_2
    //   176: if_icmpeq -> 436
    //   179: iload #13
    //   181: iconst_5
    //   182: if_icmpeq -> 245
    //   185: iload #13
    //   187: bipush #6
    //   189: if_icmpne -> 232
    //   192: iload #6
    //   194: ifne -> 219
    //   197: iconst_1
    //   198: istore #12
    //   200: iload #8
    //   202: istore #9
    //   204: iload #6
    //   206: istore #10
    //   208: iload #5
    //   210: istore #11
    //   212: aload #14
    //   214: astore #15
    //   216: goto -> 436
    //   219: new e/a/a/d
    //   222: dup
    //   223: ldc 'Empty property element can't have both rdf:resource and rdf:nodeID'
    //   225: sipush #202
    //   228: invokespecial <init> : (Ljava/lang/String;I)V
    //   231: athrow
    //   232: new e/a/a/d
    //   235: dup
    //   236: ldc 'Unrecognized attribute of empty property element'
    //   238: sipush #202
    //   241: invokespecial <init> : (Ljava/lang/String;I)V
    //   244: athrow
    //   245: iload #4
    //   247: ifne -> 299
    //   250: iload #8
    //   252: ifne -> 286
    //   255: iload #8
    //   257: ifne -> 264
    //   260: aload #16
    //   262: astore #14
    //   264: iconst_1
    //   265: istore #10
    //   267: iload #8
    //   269: istore #9
    //   271: iload #5
    //   273: istore #11
    //   275: aload #14
    //   277: astore #15
    //   279: iload #4
    //   281: istore #12
    //   283: goto -> 436
    //   286: new e/a/a/d
    //   289: dup
    //   290: ldc 'Empty property element can't have both rdf:value and rdf:resource'
    //   292: sipush #203
    //   295: invokespecial <init> : (Ljava/lang/String;I)V
    //   298: athrow
    //   299: new e/a/a/d
    //   302: dup
    //   303: ldc 'Empty property element can't have both rdf:resource and rdf:nodeID'
    //   305: sipush #202
    //   308: invokespecial <init> : (Ljava/lang/String;I)V
    //   311: athrow
    //   312: ldc 'value'
    //   314: aload #16
    //   316: invokeinterface getLocalName : ()Ljava/lang/String;
    //   321: invokevirtual equals : (Ljava/lang/Object;)Z
    //   324: ifeq -> 382
    //   327: ldc 'http://www.w3.org/1999/02/22-rdf-syntax-ns#'
    //   329: aload #16
    //   331: invokeinterface getNamespaceURI : ()Ljava/lang/String;
    //   336: invokevirtual equals : (Ljava/lang/Object;)Z
    //   339: ifeq -> 382
    //   342: iload #6
    //   344: ifne -> 369
    //   347: aload #16
    //   349: astore #15
    //   351: iconst_1
    //   352: istore #9
    //   354: iload #6
    //   356: istore #10
    //   358: iload #5
    //   360: istore #11
    //   362: iload #4
    //   364: istore #12
    //   366: goto -> 436
    //   369: new e/a/a/d
    //   372: dup
    //   373: ldc 'Empty property element can't have both rdf:value and rdf:resource'
    //   375: sipush #203
    //   378: invokespecial <init> : (Ljava/lang/String;I)V
    //   381: athrow
    //   382: iload #8
    //   384: istore #9
    //   386: iload #6
    //   388: istore #10
    //   390: iload #5
    //   392: istore #11
    //   394: aload #14
    //   396: astore #15
    //   398: iload #4
    //   400: istore #12
    //   402: ldc 'xml:lang'
    //   404: aload #16
    //   406: invokeinterface getNodeName : ()Ljava/lang/String;
    //   411: invokevirtual equals : (Ljava/lang/Object;)Z
    //   414: ifne -> 436
    //   417: iconst_1
    //   418: istore #11
    //   420: iload #4
    //   422: istore #12
    //   424: aload #14
    //   426: astore #15
    //   428: iload #6
    //   430: istore #10
    //   432: iload #8
    //   434: istore #9
    //   436: iload #7
    //   438: iconst_1
    //   439: iadd
    //   440: istore #7
    //   442: iload #9
    //   444: istore #8
    //   446: iload #10
    //   448: istore #6
    //   450: iload #11
    //   452: istore #5
    //   454: aload #15
    //   456: astore #14
    //   458: iload #12
    //   460: istore #4
    //   462: goto -> 27
    //   465: ldc ''
    //   467: astore #15
    //   469: aload_0
    //   470: aload_1
    //   471: aload_2
    //   472: ldc ''
    //   474: iload_3
    //   475: invokestatic a : (Le/a/a/j/k;Le/a/a/j/m;Lorg/w3c/dom/Node;Ljava/lang/String;Z)Le/a/a/j/m;
    //   478: astore #16
    //   480: iload #8
    //   482: ifne -> 516
    //   485: iload #6
    //   487: ifeq -> 493
    //   490: goto -> 516
    //   493: iload #5
    //   495: ifeq -> 553
    //   498: aload #16
    //   500: invokevirtual r : ()Le/a/a/k/e;
    //   503: astore_1
    //   504: iconst_1
    //   505: istore #4
    //   507: aload_1
    //   508: iconst_1
    //   509: invokevirtual j : (Z)Le/a/a/k/e;
    //   512: pop
    //   513: goto -> 556
    //   516: aload #15
    //   518: astore_1
    //   519: aload #14
    //   521: ifnull -> 532
    //   524: aload #14
    //   526: invokeinterface getNodeValue : ()Ljava/lang/String;
    //   531: astore_1
    //   532: aload #16
    //   534: aload_1
    //   535: invokevirtual d : (Ljava/lang/String;)V
    //   538: iload #8
    //   540: ifne -> 553
    //   543: aload #16
    //   545: invokevirtual r : ()Le/a/a/k/e;
    //   548: iconst_1
    //   549: invokevirtual k : (Z)Le/a/a/k/e;
    //   552: pop
    //   553: iconst_0
    //   554: istore #4
    //   556: iconst_0
    //   557: istore #5
    //   559: iload #5
    //   561: aload_2
    //   562: invokeinterface getAttributes : ()Lorg/w3c/dom/NamedNodeMap;
    //   567: invokeinterface getLength : ()I
    //   572: if_icmpge -> 781
    //   575: aload_2
    //   576: invokeinterface getAttributes : ()Lorg/w3c/dom/NamedNodeMap;
    //   581: iload #5
    //   583: invokeinterface item : (I)Lorg/w3c/dom/Node;
    //   588: astore_1
    //   589: aload_1
    //   590: aload #14
    //   592: if_acmpeq -> 772
    //   595: ldc 'xmlns'
    //   597: aload_1
    //   598: invokeinterface getPrefix : ()Ljava/lang/String;
    //   603: invokevirtual equals : (Ljava/lang/Object;)Z
    //   606: ifne -> 772
    //   609: aload_1
    //   610: invokeinterface getPrefix : ()Ljava/lang/String;
    //   615: ifnonnull -> 635
    //   618: ldc 'xmlns'
    //   620: aload_1
    //   621: invokeinterface getNodeName : ()Ljava/lang/String;
    //   626: invokevirtual equals : (Ljava/lang/Object;)Z
    //   629: ifeq -> 635
    //   632: goto -> 772
    //   635: aload_1
    //   636: invokestatic a : (Lorg/w3c/dom/Node;)I
    //   639: istore #6
    //   641: iload #6
    //   643: ifeq -> 704
    //   646: iload #6
    //   648: iconst_2
    //   649: if_icmpeq -> 772
    //   652: iload #6
    //   654: iconst_5
    //   655: if_icmpeq -> 681
    //   658: iload #6
    //   660: bipush #6
    //   662: if_icmpne -> 668
    //   665: goto -> 772
    //   668: new e/a/a/d
    //   671: dup
    //   672: ldc 'Unrecognized attribute of empty property element'
    //   674: sipush #202
    //   677: invokespecial <init> : (Ljava/lang/String;I)V
    //   680: athrow
    //   681: aload_1
    //   682: invokeinterface getNodeValue : ()Ljava/lang/String;
    //   687: astore_1
    //   688: ldc 'rdf:resource'
    //   690: astore #15
    //   692: aload #16
    //   694: aload #15
    //   696: aload_1
    //   697: invokestatic a : (Le/a/a/j/m;Ljava/lang/String;Ljava/lang/String;)Le/a/a/j/m;
    //   700: pop
    //   701: goto -> 772
    //   704: aload_1
    //   705: invokeinterface getNodeName : ()Ljava/lang/String;
    //   710: astore #15
    //   712: iload #4
    //   714: ifne -> 727
    //   717: aload_1
    //   718: invokeinterface getNodeValue : ()Ljava/lang/String;
    //   723: astore_1
    //   724: goto -> 692
    //   727: ldc 'xml:lang'
    //   729: aload #15
    //   731: invokevirtual equals : (Ljava/lang/Object;)Z
    //   734: ifeq -> 754
    //   737: aload #16
    //   739: ldc 'xml:lang'
    //   741: aload_1
    //   742: invokeinterface getNodeValue : ()Ljava/lang/String;
    //   747: invokestatic a : (Le/a/a/j/m;Ljava/lang/String;Ljava/lang/String;)Le/a/a/j/m;
    //   750: pop
    //   751: goto -> 772
    //   754: aload_0
    //   755: aload #16
    //   757: aload_1
    //   758: aload_1
    //   759: invokeinterface getNodeValue : ()Ljava/lang/String;
    //   764: iconst_0
    //   765: invokestatic a : (Le/a/a/j/k;Le/a/a/j/m;Lorg/w3c/dom/Node;Ljava/lang/String;Z)Le/a/a/j/m;
    //   768: pop
    //   769: goto -> 772
    //   772: iload #5
    //   774: iconst_1
    //   775: iadd
    //   776: istore #5
    //   778: goto -> 559
    //   781: return
    //   782: new e/a/a/d
    //   785: dup
    //   786: ldc 'Nested content not allowed with rdf:resource or property attributes'
    //   788: sipush #202
    //   791: invokespecial <init> : (Ljava/lang/String;I)V
    //   794: astore_0
    //   795: goto -> 800
    //   798: aload_0
    //   799: athrow
    //   800: goto -> 798
  }
  
  static void a(k paramk, Node paramNode) {
    if (paramNode.hasAttributes()) {
      a(paramk, paramk.a(), paramNode);
      return;
    } 
    throw new d("Invalid attributes of rdf:RDF element", 202);
  }
  
  private static void a(m paramm) {
    byte b = 1;
    m m1 = paramm.f(1);
    int i = b;
    if (m1.r().c())
      if (!paramm.r().c()) {
        m m2 = m1.g(1);
        m1.e(m2);
        paramm.b(m2);
        i = b;
      } else {
        throw new d("Redundant xml:lang for rdf:value element", 203);
      }  
    while (i <= m1.t()) {
      paramm.b(m1.g(i));
      i++;
    } 
    for (i = 2; i <= paramm.b(); i++)
      paramm.b(paramm.f(i)); 
    paramm.c(false);
    paramm.r().j(false);
    paramm.r().a(m1.r());
    paramm.d(m1.v());
    paramm.C();
    Iterator<m> iterator = m1.A();
    while (iterator.hasNext())
      paramm.a(iterator.next()); 
  }
  
  private static boolean a(int paramInt) {
    return (1 <= paramInt && paramInt <= 7);
  }
  
  private static void b() {
    throw new d("ParseTypeLiteral property element not allowed", 203);
  }
  
  private static void b(k paramk, m paramm, Node paramNode, boolean paramBoolean) {
    paramm = a(paramk, paramm, paramNode, null, paramBoolean);
    boolean bool = false;
    int i;
    for (i = 0; i < paramNode.getAttributes().getLength(); i++) {
      Node node = paramNode.getAttributes().item(i);
      if (!"xmlns".equals(node.getPrefix()) && (node.getPrefix() != null || !"xmlns".equals(node.getNodeName()))) {
        String str1 = node.getNamespaceURI();
        String str2 = node.getLocalName();
        if ("xml:lang".equals(node.getNodeName())) {
          a(paramm, "xml:lang", node.getNodeValue());
        } else if (!"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(str1) || (!"ID".equals(str2) && !"datatype".equals(str2))) {
          throw new d("Invalid attribute for literal property element", 202);
        } 
      } 
    } 
    String str = "";
    i = bool;
    while (i < paramNode.getChildNodes().getLength()) {
      Node node = paramNode.getChildNodes().item(i);
      if (node.getNodeType() == 3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(node.getNodeValue());
        str = stringBuilder.toString();
        i++;
        continue;
      } 
      throw new d("Invalid child of literal property element", 202);
    } 
    paramm.d(str);
  }
  
  private static boolean b(int paramInt) {
    return (10 <= paramInt && paramInt <= 12);
  }
  
  private static boolean b(Node paramNode) {
    if (paramNode.getNodeType() != 3)
      return false; 
    String str = paramNode.getNodeValue();
    for (int i = 0; i < str.length(); i++) {
      if (!Character.isWhitespace(str.charAt(i)))
        return false; 
    } 
    return true;
  }
  
  static k c(Node paramNode) {
    k k = new k();
    a(k, paramNode);
    return k;
  }
  
  private static void c() {
    throw new d("ParseTypeOther property element not allowed", 203);
  }
  
  private static void c(k paramk, m paramm, Node paramNode, boolean paramBoolean) {
    int i = a(paramNode);
    if (i == 8 || i == 0) {
      if (!paramBoolean || i != 0) {
        d(paramk, paramm, paramNode, paramBoolean);
        g(paramk, paramm, paramNode, paramBoolean);
        return;
      } 
      throw new d("Top level typed node not allowed", 203);
    } 
    throw new d("Node element must be rdf:Description or typed node", 202);
  }
  
  private static boolean c(int paramInt) {
    return (paramInt == 8 || b(paramInt)) ? false : (a(paramInt) ^ true);
  }
  
  private static void d(k paramk, m paramm, Node paramNode, boolean paramBoolean) {
    int i = 0;
    int j;
    for (j = 0; i < paramNode.getAttributes().getLength(); j = n) {
      Node node = paramNode.getAttributes().item(i);
      int n = j;
      if (!"xmlns".equals(node.getPrefix()))
        if (node.getPrefix() == null && "xmlns".equals(node.getNodeName())) {
          n = j;
        } else {
          int i1 = a(node);
          if (i1 != 0) {
            if (i1 == 6 || i1 == 2 || i1 == 3) {
              if (j) {
                n = ++j;
                if (paramBoolean) {
                  n = j;
                  if (i1 == 3)
                    if (paramm.q() != null && paramm.q().length() > 0) {
                      if (paramm.q().equals(node.getNodeValue())) {
                        n = j;
                      } else {
                        throw new d("Mismatched top level rdf:about values", 203);
                      } 
                    } else {
                      paramm.c(node.getNodeValue());
                      n = j;
                    }  
                } 
              } else {
                throw new d("Mutally exclusive about, ID, nodeID attributes", 202);
              } 
            } else {
              throw new d("Invalid nodeElement attribute", 202);
            } 
          } else {
            a(paramk, paramm, node, node.getNodeValue(), paramBoolean);
            n = j;
          } 
        }  
      i++;
    } 
  }
  
  private static void e(k paramk, m paramm, Node paramNode, boolean paramBoolean) {
    paramm = a(paramk, paramm, paramNode, "", paramBoolean);
    paramm.r().j(true);
    int i;
    for (i = 0; i < paramNode.getAttributes().getLength(); i++) {
      Node node = paramNode.getAttributes().item(i);
      if (!"xmlns".equals(node.getPrefix()) && (node.getPrefix() != null || !"xmlns".equals(node.getNodeName()))) {
        String str1 = node.getLocalName();
        String str2 = node.getNamespaceURI();
        if ("xml:lang".equals(node.getNodeName())) {
          a(paramm, "xml:lang", node.getNodeValue());
        } else if (!"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(str2) || (!"ID".equals(str1) && !"parseType".equals(str1))) {
          throw new d("Invalid attribute for ParseTypeResource property element", 202);
        } 
      } 
    } 
    g(paramk, paramm, paramNode, false);
    if (paramm.d())
      a(paramm); 
  }
  
  private static void f(k paramk, m paramm, Node paramNode, boolean paramBoolean) {
    // Byte code:
    //   0: aload_2
    //   1: invokestatic a : (Lorg/w3c/dom/Node;)I
    //   4: invokestatic c : (I)Z
    //   7: ifeq -> 499
    //   10: aload_2
    //   11: invokeinterface getAttributes : ()Lorg/w3c/dom/NamedNodeMap;
    //   16: astore #8
    //   18: iconst_0
    //   19: istore #5
    //   21: aconst_null
    //   22: astore #6
    //   24: iconst_0
    //   25: istore #4
    //   27: iload #4
    //   29: aload #8
    //   31: invokeinterface getLength : ()I
    //   36: if_icmpge -> 144
    //   39: aload #8
    //   41: iload #4
    //   43: invokeinterface item : (I)Lorg/w3c/dom/Node;
    //   48: astore #9
    //   50: ldc 'xmlns'
    //   52: aload #9
    //   54: invokeinterface getPrefix : ()Ljava/lang/String;
    //   59: invokevirtual equals : (Ljava/lang/Object;)Z
    //   62: ifne -> 98
    //   65: aload #6
    //   67: astore #7
    //   69: aload #9
    //   71: invokeinterface getPrefix : ()Ljava/lang/String;
    //   76: ifnonnull -> 131
    //   79: aload #6
    //   81: astore #7
    //   83: ldc 'xmlns'
    //   85: aload #9
    //   87: invokeinterface getNodeName : ()Ljava/lang/String;
    //   92: invokevirtual equals : (Ljava/lang/Object;)Z
    //   95: ifeq -> 131
    //   98: aload #6
    //   100: astore #7
    //   102: aload #6
    //   104: ifnonnull -> 116
    //   107: new java/util/ArrayList
    //   110: dup
    //   111: invokespecial <init> : ()V
    //   114: astore #7
    //   116: aload #7
    //   118: aload #9
    //   120: invokeinterface getNodeName : ()Ljava/lang/String;
    //   125: invokeinterface add : (Ljava/lang/Object;)Z
    //   130: pop
    //   131: iload #4
    //   133: iconst_1
    //   134: iadd
    //   135: istore #4
    //   137: aload #7
    //   139: astore #6
    //   141: goto -> 27
    //   144: aload #6
    //   146: ifnull -> 189
    //   149: aload #6
    //   151: invokeinterface iterator : ()Ljava/util/Iterator;
    //   156: astore #6
    //   158: aload #6
    //   160: invokeinterface hasNext : ()Z
    //   165: ifeq -> 189
    //   168: aload #8
    //   170: aload #6
    //   172: invokeinterface next : ()Ljava/lang/Object;
    //   177: checkcast java/lang/String
    //   180: invokeinterface removeNamedItem : (Ljava/lang/String;)Lorg/w3c/dom/Node;
    //   185: pop
    //   186: goto -> 158
    //   189: aload #8
    //   191: invokeinterface getLength : ()I
    //   196: iconst_3
    //   197: if_icmple -> 208
    //   200: aload_0
    //   201: aload_1
    //   202: aload_2
    //   203: iload_3
    //   204: invokestatic a : (Le/a/a/j/k;Le/a/a/j/m;Lorg/w3c/dom/Node;Z)V
    //   207: return
    //   208: iconst_0
    //   209: istore #4
    //   211: iload #4
    //   213: aload #8
    //   215: invokeinterface getLength : ()I
    //   220: if_icmpge -> 423
    //   223: aload #8
    //   225: iload #4
    //   227: invokeinterface item : (I)Lorg/w3c/dom/Node;
    //   232: astore #6
    //   234: aload #6
    //   236: invokeinterface getLocalName : ()Ljava/lang/String;
    //   241: astore #7
    //   243: aload #6
    //   245: invokeinterface getNamespaceURI : ()Ljava/lang/String;
    //   250: astore #9
    //   252: aload #6
    //   254: invokeinterface getNodeValue : ()Ljava/lang/String;
    //   259: astore #10
    //   261: ldc 'xml:lang'
    //   263: aload #6
    //   265: invokeinterface getNodeName : ()Ljava/lang/String;
    //   270: invokevirtual equals : (Ljava/lang/Object;)Z
    //   273: ifeq -> 308
    //   276: ldc 'ID'
    //   278: aload #7
    //   280: invokevirtual equals : (Ljava/lang/Object;)Z
    //   283: ifeq -> 299
    //   286: ldc 'http://www.w3.org/1999/02/22-rdf-syntax-ns#'
    //   288: aload #9
    //   290: invokevirtual equals : (Ljava/lang/Object;)Z
    //   293: ifeq -> 299
    //   296: goto -> 308
    //   299: iload #4
    //   301: iconst_1
    //   302: iadd
    //   303: istore #4
    //   305: goto -> 211
    //   308: ldc 'datatype'
    //   310: aload #7
    //   312: invokevirtual equals : (Ljava/lang/Object;)Z
    //   315: ifeq -> 336
    //   318: ldc 'http://www.w3.org/1999/02/22-rdf-syntax-ns#'
    //   320: aload #9
    //   322: invokevirtual equals : (Ljava/lang/Object;)Z
    //   325: ifeq -> 336
    //   328: aload_0
    //   329: aload_1
    //   330: aload_2
    //   331: iload_3
    //   332: invokestatic b : (Le/a/a/j/k;Le/a/a/j/m;Lorg/w3c/dom/Node;Z)V
    //   335: return
    //   336: ldc 'parseType'
    //   338: aload #7
    //   340: invokevirtual equals : (Ljava/lang/Object;)Z
    //   343: ifeq -> 415
    //   346: ldc 'http://www.w3.org/1999/02/22-rdf-syntax-ns#'
    //   348: aload #9
    //   350: invokevirtual equals : (Ljava/lang/Object;)Z
    //   353: ifne -> 359
    //   356: goto -> 415
    //   359: ldc_w 'Literal'
    //   362: aload #10
    //   364: invokevirtual equals : (Ljava/lang/Object;)Z
    //   367: ifne -> 410
    //   370: ldc_w 'Resource'
    //   373: aload #10
    //   375: invokevirtual equals : (Ljava/lang/Object;)Z
    //   378: ifeq -> 389
    //   381: aload_0
    //   382: aload_1
    //   383: aload_2
    //   384: iload_3
    //   385: invokestatic e : (Le/a/a/j/k;Le/a/a/j/m;Lorg/w3c/dom/Node;Z)V
    //   388: return
    //   389: ldc_w 'Collection'
    //   392: aload #10
    //   394: invokevirtual equals : (Ljava/lang/Object;)Z
    //   397: ifeq -> 405
    //   400: invokestatic a : ()V
    //   403: aconst_null
    //   404: athrow
    //   405: invokestatic c : ()V
    //   408: aconst_null
    //   409: athrow
    //   410: invokestatic b : ()V
    //   413: aconst_null
    //   414: athrow
    //   415: aload_0
    //   416: aload_1
    //   417: aload_2
    //   418: iload_3
    //   419: invokestatic a : (Le/a/a/j/k;Le/a/a/j/m;Lorg/w3c/dom/Node;Z)V
    //   422: return
    //   423: aload_2
    //   424: invokeinterface hasChildNodes : ()Z
    //   429: ifeq -> 200
    //   432: iload #5
    //   434: istore #4
    //   436: iload #4
    //   438: aload_2
    //   439: invokeinterface getChildNodes : ()Lorg/w3c/dom/NodeList;
    //   444: invokeinterface getLength : ()I
    //   449: if_icmpge -> 491
    //   452: aload_2
    //   453: invokeinterface getChildNodes : ()Lorg/w3c/dom/NodeList;
    //   458: iload #4
    //   460: invokeinterface item : (I)Lorg/w3c/dom/Node;
    //   465: invokeinterface getNodeType : ()S
    //   470: iconst_3
    //   471: if_icmpeq -> 482
    //   474: aload_0
    //   475: aload_1
    //   476: aload_2
    //   477: iload_3
    //   478: invokestatic h : (Le/a/a/j/k;Le/a/a/j/m;Lorg/w3c/dom/Node;Z)V
    //   481: return
    //   482: iload #4
    //   484: iconst_1
    //   485: iadd
    //   486: istore #4
    //   488: goto -> 436
    //   491: aload_0
    //   492: aload_1
    //   493: aload_2
    //   494: iload_3
    //   495: invokestatic b : (Le/a/a/j/k;Le/a/a/j/m;Lorg/w3c/dom/Node;Z)V
    //   498: return
    //   499: new e/a/a/d
    //   502: dup
    //   503: ldc_w 'Invalid property element name'
    //   506: sipush #202
    //   509: invokespecial <init> : (Ljava/lang/String;I)V
    //   512: astore_0
    //   513: goto -> 518
    //   516: aload_0
    //   517: athrow
    //   518: goto -> 516
  }
  
  private static void g(k paramk, m paramm, Node paramNode, boolean paramBoolean) {
    for (int i = 0; i < paramNode.getChildNodes().getLength(); i++) {
      Node node = paramNode.getChildNodes().item(i);
      if (!b(node))
        if (node.getNodeType() == 1) {
          f(paramk, paramm, node, paramBoolean);
        } else {
          throw new d("Expected property element node not found", 202);
        }  
    } 
  }
  
  private static void h(k paramk, m paramm, Node paramNode, boolean paramBoolean) {
    if (paramBoolean && "iX:changes".equals(paramNode.getNodeName()))
      return; 
    paramm = a(paramk, paramm, paramNode, "", paramBoolean);
    int i;
    for (i = 0; i < paramNode.getAttributes().getLength(); i++) {
      Node node = paramNode.getAttributes().item(i);
      if (!"xmlns".equals(node.getPrefix()) && (node.getPrefix() != null || !"xmlns".equals(node.getNodeName()))) {
        String str1 = node.getLocalName();
        String str2 = node.getNamespaceURI();
        if ("xml:lang".equals(node.getNodeName())) {
          a(paramm, "xml:lang", node.getNodeValue());
        } else if (!"ID".equals(str1) || !"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(str2)) {
          throw new d("Invalid attribute for resource property element", 202);
        } 
      } 
    } 
    i = 0;
    boolean bool;
    for (bool = false; i < paramNode.getChildNodes().getLength(); bool = bool1) {
      Node node = paramNode.getChildNodes().item(i);
      boolean bool1 = bool;
      if (!b(node))
        if (node.getNodeType() == 1 && !bool) {
          paramBoolean = "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(node.getNamespaceURI());
          String str = node.getLocalName();
          if (paramBoolean && "Bag".equals(str)) {
            paramm.r().a(true);
          } else {
            e e;
            if (paramBoolean && "Seq".equals(str)) {
              e = paramm.r();
              e.a(true);
              e.d(true);
            } else if (paramBoolean && "Alt".equals(e)) {
              e = paramm.r();
              e.a(true);
              e.d(true);
              e.c(true);
            } else {
              paramm.r().j(true);
              if (!paramBoolean && !"Description".equals(e)) {
                String str1 = node.getNamespaceURI();
                if (str1 != null) {
                  StringBuilder stringBuilder = new StringBuilder();
                  stringBuilder.append(str1);
                  stringBuilder.append(':');
                  stringBuilder.append((String)e);
                  a(paramm, "rdf:type", stringBuilder.toString());
                } else {
                  throw new d("All XML elements must be in a namespace", 203);
                } 
              } 
            } 
          } 
          c(paramk, paramm, node, false);
          if (paramm.d()) {
            a(paramm);
          } else if (paramm.r().f()) {
            n.b(paramm);
          } 
          bool1 = true;
        } else {
          if (bool) {
            d d2 = new d("Invalid child of resource property element", 202);
            throw d2;
          } 
          d d1 = new d("Children of resource property element must be XML elements", 202);
          throw d1;
        }  
      i++;
    } 
    if (bool)
      return; 
    d d = new d("Missing child of resource property element", 202);
    throw d;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/a/a/j/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */