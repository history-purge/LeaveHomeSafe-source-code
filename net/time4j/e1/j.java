package net.time4j.e1;

import java.util.Locale;

public enum j {
  c {
    public int a(String param1String, g param1g) {
      int i = Integer.parseInt(param1String);
      if (i >= 0)
        return i; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Cannot convert negative number: ");
      stringBuilder.append(param1String);
      throw new NumberFormatException(stringBuilder.toString());
    }
    
    public String a() {
      return "0123456789";
    }
    
    public boolean a(char param1Char) {
      return (param1Char >= '0' && param1Char <= '9');
    }
    
    public boolean b() {
      return true;
    }
    
    public String f(int param1Int) {
      if (param1Int >= 0)
        return Integer.toString(param1Int); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Cannot convert: ");
      stringBuilder.append(param1Int);
      throw new IllegalArgumentException(stringBuilder.toString());
    }
  },
  d {
    public String a() {
      return "٠١٢٣٤٥٦٧٨٩";
    }
    
    public boolean b() {
      return true;
    }
  },
  e {
    public String a() {
      return "۰۱۲۳۴۵۶۷۸۹";
    }
    
    public boolean b() {
      return true;
    }
  },
  f {
    public String a() {
      return "০১২৩৪৫৬৭৮৯";
    }
    
    public boolean b() {
      return true;
    }
  },
  g {
    public String a() {
      return "०१२३४५६७८९";
    }
    
    public boolean b() {
      return true;
    }
  },
  h {
    public int a(int param1Int, Appendable param1Appendable) {
      if (param1Int >= 0) {
        int k;
        int m = 0;
        int i = 1;
        while (true) {
          k = m;
          if (i <= 4) {
            if (param1Int < c()[i]) {
              k = i;
              break;
            } 
            i++;
            continue;
          } 
          break;
        } 
        if (k > 0) {
          m = k - 1;
          i = param1Int;
          param1Int = m;
          while (true) {
            char c;
            m = i / c()[param1Int];
            if (m == 11) {
              c = '↋';
            } else if (m == 10) {
              c = '↊';
            } else {
              c = (char)(m + 48);
            } 
            param1Appendable.append(c);
            i -= m * c()[param1Int];
            m = param1Int - 1;
            param1Int = m;
            if (m < 0)
              return k; 
          } 
        } 
      } 
      return super.a(param1Int, param1Appendable);
    }
    
    public int a(String param1String, g param1g) {
      int i = Integer.parseInt(param1String.replace('↊', 'a').replace('↋', 'b'), 12);
      if (i >= 0)
        return i; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Cannot convert negative number: ");
      stringBuilder.append(param1String);
      throw new NumberFormatException(stringBuilder.toString());
    }
    
    public String a() {
      return "0123456789↊↋";
    }
    
    public boolean a(char param1Char) {
      return ((param1Char >= '0' && param1Char <= '9') || param1Char == '↊' || param1Char == '↋');
    }
    
    public boolean b() {
      return false;
    }
    
    public String f(int param1Int) {
      if (param1Int >= 0)
        return Integer.toString(param1Int, 12).replace('a', '↊').replace('b', '↋'); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Cannot convert: ");
      stringBuilder.append(param1Int);
      throw new IllegalArgumentException(stringBuilder.toString());
    }
  },
  i {
    public int a(String param1String, g param1g) {
      Object object1;
      int i;
      Object object2;
      byte b1;
      Object object3;
      int n;
      int k = param1String.length();
      boolean bool3 = true;
      int i2 = k - 1;
      int i1 = 0;
      byte b2 = 0;
      boolean bool1 = true;
      boolean bool2 = false;
      k = 0;
      while (i2 >= 0) {
        char c = param1String.charAt(i2);
        if (c >= '፩' && c < '፲') {
          i3 = c + 1 - 4969;
        } else if (c >= '፲' && c < '፻') {
          i3 = (c + 1 - 4978) * 10;
        } else {
          if (c == '፼') {
            boolean bool;
            Object object = object1;
            if (i1) {
              object = object1;
              if (object1 == null)
                bool = true; 
            } 
            i = a(object3, bool, object2);
            if (i1) {
              n = object2 * 100;
            } else {
              n = object2 * 10000;
            } 
            i1 = i;
            i = 0;
            b1 = 1;
          } else {
            byte b3 = b1;
            int i8 = n;
            int i7 = i;
            if (c == '፻') {
              i1 = a(n, i, b1);
              n = b1 * 100;
              i = 1;
              b1 = 0;
            } else {
              continue;
            } 
          } 
          i3 = 0;
          int i5 = i1;
          int i6 = n;
          b2 = b1;
          i1 = i;
          continue;
        } 
        int i3 = i + i3;
        byte b = b1;
        int i4 = n;
        continue;
        i2--;
        object2 = SYNTHETIC_LOCAL_VARIABLE_11;
        object3 = SYNTHETIC_LOCAL_VARIABLE_10;
        object1 = SYNTHETIC_LOCAL_VARIABLE_4;
      } 
      if ((i1 != 0 || b2 != 0) && i == 0)
        i = bool3; 
      return a(n, i, b1);
    }
    
    public String a() {
      return "፩፪፫፬፭፮፯፰፱፲፳፴፵፶፷፸፹፺፻፼";
    }
    
    public boolean a(char param1Char) {
      return (param1Char >= '፩' && param1Char <= '፼');
    }
    
    public boolean b() {
      return false;
    }
    
    public String f(int param1Int) {
      // Byte code:
      //   0: iload_1
      //   1: iconst_1
      //   2: if_icmplt -> 300
      //   5: iload_1
      //   6: invokestatic valueOf : (I)Ljava/lang/String;
      //   9: astore #10
      //   11: aload #10
      //   13: invokevirtual length : ()I
      //   16: iconst_1
      //   17: isub
      //   18: istore #6
      //   20: iload #6
      //   22: istore_1
      //   23: aload #10
      //   25: astore #9
      //   27: iload #6
      //   29: iconst_2
      //   30: irem
      //   31: ifne -> 71
      //   34: new java/lang/StringBuilder
      //   37: dup
      //   38: invokespecial <init> : ()V
      //   41: astore #9
      //   43: aload #9
      //   45: ldc '0'
      //   47: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   50: pop
      //   51: aload #9
      //   53: aload #10
      //   55: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   58: pop
      //   59: aload #9
      //   61: invokevirtual toString : ()Ljava/lang/String;
      //   64: astore #9
      //   66: iload #6
      //   68: iconst_1
      //   69: iadd
      //   70: istore_1
      //   71: new java/lang/StringBuilder
      //   74: dup
      //   75: invokespecial <init> : ()V
      //   78: astore #10
      //   80: iload_1
      //   81: istore #6
      //   83: iload #6
      //   85: iflt -> 294
      //   88: aload #9
      //   90: iload_1
      //   91: iload #6
      //   93: isub
      //   94: invokevirtual charAt : (I)C
      //   97: istore #7
      //   99: iload #6
      //   101: iconst_1
      //   102: isub
      //   103: istore #6
      //   105: aload #9
      //   107: iload_1
      //   108: iload #6
      //   110: isub
      //   111: invokevirtual charAt : (I)C
      //   114: istore #8
      //   116: iload #8
      //   118: bipush #48
      //   120: if_icmpeq -> 134
      //   123: iload #8
      //   125: sipush #4920
      //   128: iadd
      //   129: i2c
      //   130: istore_2
      //   131: goto -> 136
      //   134: iconst_0
      //   135: istore_2
      //   136: iload #7
      //   138: bipush #48
      //   140: if_icmpeq -> 155
      //   143: iload #7
      //   145: sipush #4929
      //   148: iadd
      //   149: i2c
      //   150: istore #4
      //   152: goto -> 158
      //   155: iconst_0
      //   156: istore #4
      //   158: iload #6
      //   160: iconst_4
      //   161: irem
      //   162: iconst_2
      //   163: idiv
      //   164: istore #7
      //   166: iload #6
      //   168: ifeq -> 199
      //   171: iload #7
      //   173: ifeq -> 192
      //   176: iload_2
      //   177: ifne -> 185
      //   180: iload #4
      //   182: ifeq -> 199
      //   185: sipush #4987
      //   188: istore_3
      //   189: goto -> 201
      //   192: sipush #4988
      //   195: istore_3
      //   196: goto -> 201
      //   199: iconst_0
      //   200: istore_3
      //   201: iload_2
      //   202: istore #5
      //   204: iload_2
      //   205: sipush #4969
      //   208: if_icmpne -> 248
      //   211: iload_2
      //   212: istore #5
      //   214: iload #4
      //   216: ifne -> 248
      //   219: iload_2
      //   220: istore #5
      //   222: iload_1
      //   223: iconst_1
      //   224: if_icmple -> 248
      //   227: iload_3
      //   228: sipush #4987
      //   231: if_icmpeq -> 245
      //   234: iload_2
      //   235: istore #5
      //   237: iload #6
      //   239: iconst_1
      //   240: iadd
      //   241: iload_1
      //   242: if_icmpne -> 248
      //   245: iconst_0
      //   246: istore #5
      //   248: iload #4
      //   250: ifeq -> 261
      //   253: aload #10
      //   255: iload #4
      //   257: invokevirtual append : (C)Ljava/lang/StringBuilder;
      //   260: pop
      //   261: iload #5
      //   263: ifeq -> 274
      //   266: aload #10
      //   268: iload #5
      //   270: invokevirtual append : (C)Ljava/lang/StringBuilder;
      //   273: pop
      //   274: iload_3
      //   275: ifeq -> 285
      //   278: aload #10
      //   280: iload_3
      //   281: invokevirtual append : (C)Ljava/lang/StringBuilder;
      //   284: pop
      //   285: iload #6
      //   287: iconst_1
      //   288: isub
      //   289: istore #6
      //   291: goto -> 83
      //   294: aload #10
      //   296: invokevirtual toString : ()Ljava/lang/String;
      //   299: areturn
      //   300: new java/lang/StringBuilder
      //   303: dup
      //   304: invokespecial <init> : ()V
      //   307: astore #9
      //   309: aload #9
      //   311: ldc 'Can only convert positive numbers: '
      //   313: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   316: pop
      //   317: aload #9
      //   319: iload_1
      //   320: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   323: pop
      //   324: new java/lang/IllegalArgumentException
      //   327: dup
      //   328: aload #9
      //   330: invokevirtual toString : ()Ljava/lang/String;
      //   333: invokespecial <init> : (Ljava/lang/String;)V
      //   336: astore #9
      //   338: goto -> 344
      //   341: aload #9
      //   343: athrow
      //   344: goto -> 341
    }
  },
  j {
    public String a() {
      return "૦૧૨૩૪૫૬૭૮૯";
    }
    
    public boolean b() {
      return true;
    }
  },
  k {
    public int a(String param1String, g param1g) {
      // Byte code:
      //   0: aload_0
      //   1: invokevirtual a : ()Ljava/lang/String;
      //   4: astore_2
      //   5: aload_1
      //   6: invokevirtual length : ()I
      //   9: iconst_1
      //   10: isub
      //   11: istore #7
      //   13: iconst_0
      //   14: istore #6
      //   16: iconst_0
      //   17: istore_3
      //   18: iconst_0
      //   19: istore #5
      //   21: iconst_0
      //   22: istore #4
      //   24: iload #7
      //   26: iflt -> 374
      //   29: aload_1
      //   30: iload #7
      //   32: invokevirtual charAt : (I)C
      //   35: istore #10
      //   37: iload #10
      //   39: sipush #21313
      //   42: if_icmpeq -> 311
      //   45: iload #10
      //   47: sipush #21315
      //   50: if_icmpeq -> 264
      //   53: iload #10
      //   55: sipush #30334
      //   58: if_icmpeq -> 212
      //   61: iconst_0
      //   62: istore #8
      //   64: iload #8
      //   66: bipush #9
      //   68: if_icmpge -> 168
      //   71: aload_2
      //   72: iload #8
      //   74: invokevirtual charAt : (I)C
      //   77: istore #11
      //   79: iload #8
      //   81: iconst_1
      //   82: iadd
      //   83: istore #9
      //   85: iload #9
      //   87: istore #8
      //   89: iload #11
      //   91: iload #10
      //   93: if_icmpne -> 64
      //   96: iload #4
      //   98: iconst_1
      //   99: if_icmpne -> 117
      //   102: iload_3
      //   103: iload #9
      //   105: sipush #1000
      //   108: imul
      //   109: iadd
      //   110: istore_3
      //   111: iconst_m1
      //   112: istore #4
      //   114: goto -> 162
      //   117: iload #5
      //   119: iconst_1
      //   120: if_icmpne -> 137
      //   123: iload_3
      //   124: iload #9
      //   126: bipush #100
      //   128: imul
      //   129: iadd
      //   130: istore_3
      //   131: iconst_m1
      //   132: istore #5
      //   134: goto -> 162
      //   137: iload #6
      //   139: iconst_1
      //   140: if_icmpne -> 157
      //   143: iload_3
      //   144: iload #9
      //   146: bipush #10
      //   148: imul
      //   149: iadd
      //   150: istore_3
      //   151: iconst_m1
      //   152: istore #6
      //   154: goto -> 162
      //   157: iload_3
      //   158: iload #9
      //   160: iadd
      //   161: istore_3
      //   162: iconst_1
      //   163: istore #8
      //   165: goto -> 171
      //   168: iconst_0
      //   169: istore #8
      //   171: iload #8
      //   173: ifeq -> 179
      //   176: goto -> 332
      //   179: new java/lang/StringBuilder
      //   182: dup
      //   183: invokespecial <init> : ()V
      //   186: astore_2
      //   187: aload_2
      //   188: ldc 'Invalid Japanese numeral: '
      //   190: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   193: pop
      //   194: aload_2
      //   195: aload_1
      //   196: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   199: pop
      //   200: new java/lang/IllegalArgumentException
      //   203: dup
      //   204: aload_2
      //   205: invokevirtual toString : ()Ljava/lang/String;
      //   208: invokespecial <init> : (Ljava/lang/String;)V
      //   211: athrow
      //   212: iload #5
      //   214: ifne -> 231
      //   217: iload #4
      //   219: ifne -> 231
      //   222: iload #5
      //   224: iconst_1
      //   225: iadd
      //   226: istore #5
      //   228: goto -> 332
      //   231: new java/lang/StringBuilder
      //   234: dup
      //   235: invokespecial <init> : ()V
      //   238: astore_2
      //   239: aload_2
      //   240: ldc 'Invalid Japanese numeral: '
      //   242: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   245: pop
      //   246: aload_2
      //   247: aload_1
      //   248: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   251: pop
      //   252: new java/lang/IllegalArgumentException
      //   255: dup
      //   256: aload_2
      //   257: invokevirtual toString : ()Ljava/lang/String;
      //   260: invokespecial <init> : (Ljava/lang/String;)V
      //   263: athrow
      //   264: iload #4
      //   266: ifne -> 278
      //   269: iload #4
      //   271: iconst_1
      //   272: iadd
      //   273: istore #4
      //   275: goto -> 332
      //   278: new java/lang/StringBuilder
      //   281: dup
      //   282: invokespecial <init> : ()V
      //   285: astore_2
      //   286: aload_2
      //   287: ldc 'Invalid Japanese numeral: '
      //   289: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   292: pop
      //   293: aload_2
      //   294: aload_1
      //   295: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   298: pop
      //   299: new java/lang/IllegalArgumentException
      //   302: dup
      //   303: aload_2
      //   304: invokevirtual toString : ()Ljava/lang/String;
      //   307: invokespecial <init> : (Ljava/lang/String;)V
      //   310: athrow
      //   311: iload #6
      //   313: ifne -> 341
      //   316: iload #5
      //   318: ifne -> 341
      //   321: iload #4
      //   323: ifne -> 341
      //   326: iload #6
      //   328: iconst_1
      //   329: iadd
      //   330: istore #6
      //   332: iload #7
      //   334: iconst_1
      //   335: isub
      //   336: istore #7
      //   338: goto -> 24
      //   341: new java/lang/StringBuilder
      //   344: dup
      //   345: invokespecial <init> : ()V
      //   348: astore_2
      //   349: aload_2
      //   350: ldc 'Invalid Japanese numeral: '
      //   352: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   355: pop
      //   356: aload_2
      //   357: aload_1
      //   358: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   361: pop
      //   362: new java/lang/IllegalArgumentException
      //   365: dup
      //   366: aload_2
      //   367: invokevirtual toString : ()Ljava/lang/String;
      //   370: invokespecial <init> : (Ljava/lang/String;)V
      //   373: athrow
      //   374: iload_3
      //   375: istore #7
      //   377: iload #6
      //   379: iconst_1
      //   380: if_icmpne -> 389
      //   383: iload_3
      //   384: bipush #10
      //   386: iadd
      //   387: istore #7
      //   389: iload #7
      //   391: istore_3
      //   392: iload #5
      //   394: iconst_1
      //   395: if_icmpne -> 404
      //   398: iload #7
      //   400: bipush #100
      //   402: iadd
      //   403: istore_3
      //   404: iload_3
      //   405: istore #5
      //   407: iload #4
      //   409: iconst_1
      //   410: if_icmpne -> 420
      //   413: iload_3
      //   414: sipush #1000
      //   417: iadd
      //   418: istore #5
      //   420: iload #5
      //   422: ireturn
    }
    
    public String a() {
      return "一二三四五六七八九十百千";
    }
    
    public boolean b() {
      return false;
    }
    
    public String f(int param1Int) {
      if (param1Int >= 1 && param1Int <= 9999) {
        String str = a();
        int i = param1Int / 1000;
        int k = param1Int % 1000;
        param1Int = k / 100;
        int m = k % 100;
        k = m / 10;
        m %= 10;
        StringBuilder stringBuilder1 = new StringBuilder();
        if (i >= 1) {
          if (i > 1)
            stringBuilder1.append(str.charAt(i - 1)); 
          stringBuilder1.append('千');
        } 
        if (param1Int >= 1) {
          if (param1Int > 1)
            stringBuilder1.append(str.charAt(param1Int - 1)); 
          stringBuilder1.append('百');
        } 
        if (k >= 1) {
          if (k > 1)
            stringBuilder1.append(str.charAt(k - 1)); 
          stringBuilder1.append('十');
        } 
        if (m > 0)
          stringBuilder1.append(str.charAt(m - 1)); 
        return stringBuilder1.toString();
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Cannot convert: ");
      stringBuilder.append(param1Int);
      throw new IllegalArgumentException(stringBuilder.toString());
    }
  },
  l {
    public String a() {
      return "០១២៣៤៥៦៧៨៩";
    }
    
    public boolean b() {
      return true;
    }
  },
  m {
    public String a() {
      return "၀၁၂၃၄၅၆၇၈၉";
    }
    
    public boolean b() {
      return true;
    }
  },
  n {
    public String a() {
      return "୦୧୨୩୪୫୬୭୮୯";
    }
    
    public boolean b() {
      return true;
    }
  },
  o {
    public int a(String param1String, g param1g) {
      if (!param1String.isEmpty()) {
        String str = param1String.toUpperCase(Locale.US);
        boolean bool = param1g.c();
        int m = param1String.length();
        int k = 0;
        int i;
        for (i = 0; k < m; i = n) {
          char c = str.charAt(k);
          int i3 = b(c);
          if (++k == m) {
            i += i3;
            continue;
          } 
          int i2 = 1;
          int n = i;
          int i1 = k;
          while (true) {
            i = i1;
            k = n;
            if (i1 < m) {
              char c1 = str.charAt(i1);
              i = i1 + 1;
              if (c1 == c) {
                k = i2 + 1;
                if (k < 4 || !bool) {
                  i1 = i;
                  i2 = k;
                  if (i == m) {
                    n += i3 * k;
                    i1 = i;
                    i2 = k;
                  } 
                  continue;
                } 
                StringBuilder stringBuilder1 = new StringBuilder();
                stringBuilder1.append("Roman numeral contains more than 3 equal letters in sequence: ");
                stringBuilder1.append(param1String);
                throw new NumberFormatException(stringBuilder1.toString());
              } 
              k = b(c1);
              if (k < i3) {
                k = n + i3 * i2;
                i--;
                break;
              } 
              if (!bool || (i2 <= 1 && a(c, c1))) {
                k = n + k - i3 * i2;
                break;
              } 
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("Not conform with modern usage: ");
              stringBuilder.append(param1String);
              throw new NumberFormatException(stringBuilder.toString());
            } 
            break;
          } 
          n = k;
          k = i;
        } 
        if (i <= 3999) {
          if (bool) {
            if (i < 900 || !str.contains("DCD")) {
              if (i < 90 || !str.contains("LXL")) {
                if (i >= 9) {
                  if (!str.contains("VIV"))
                    return i; 
                  throw new NumberFormatException("Roman number contains invalid sequence VIV.");
                } 
                return i;
              } 
              throw new NumberFormatException("Roman number contains invalid sequence LXL.");
            } 
            throw new NumberFormatException("Roman number contains invalid sequence DCD.");
          } 
          return i;
        } 
        throw new NumberFormatException("Roman numbers bigger than 3999 not supported.");
      } 
      NumberFormatException numberFormatException = new NumberFormatException("Empty Roman numeral.");
      throw numberFormatException;
    }
    
    public String a() {
      return "IVXLCDM";
    }
    
    public boolean a(char param1Char) {
      char c = Character.toUpperCase(param1Char);
      return (c == 'I' || c == 'V' || c == 'X' || c == 'L' || c == 'C' || c == 'D' || c == 'M');
    }
    
    public boolean b() {
      return false;
    }
    
    public String f(int param1Int) {
      if (param1Int >= 1 && param1Int <= 3999) {
        StringBuilder stringBuilder1 = new StringBuilder();
        boolean bool = false;
        int i = param1Int;
        for (param1Int = bool; param1Int < (d()).length; param1Int++) {
          while (i >= d()[param1Int]) {
            stringBuilder1.append(q()[param1Int]);
            i -= d()[param1Int];
          } 
        } 
        return stringBuilder1.toString();
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Out of range (1-3999): ");
      stringBuilder.append(param1Int);
      IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
      throw illegalArgumentException;
    }
  },
  p {
    public String a() {
      return "౦౧౨౩౪౫౬౭౮౯";
    }
    
    public boolean b() {
      return true;
    }
  },
  q {
    public String a() {
      return "๐๑๒๓๔๕๖๗๘๙";
    }
    
    public boolean b() {
      return true;
    }
  };
  
  private static final int[] r;
  
  private static final String[] s;
  
  private static final int[] t;
  
  static {
    r = new int[] { 
        1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 
        5, 4, 1 };
    s = new String[] { 
        "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", 
        "V", "IV", "I" };
    t = new int[] { 1, 12, 144, 1728, 20736 };
  }
  
  private static int b(int paramInt1, int paramInt2, int paramInt3) {
    return net.time4j.c1.c.c(paramInt1, net.time4j.c1.c.d(paramInt2, paramInt3));
  }
  
  private static boolean b(char paramChar1, char paramChar2) {
    boolean bool2 = true;
    boolean bool3 = true;
    boolean bool1 = true;
    if (paramChar1 != 'C') {
      if (paramChar1 != 'I') {
        if (paramChar1 != 'X')
          return false; 
        if (paramChar2 != 'C') {
          if (paramChar2 == 'L')
            return true; 
          bool1 = false;
        } 
        return bool1;
      } 
      bool1 = bool2;
      if (paramChar2 != 'X') {
        if (paramChar2 == 'V')
          return true; 
        bool1 = false;
      } 
      return bool1;
    } 
    bool1 = bool3;
    if (paramChar2 != 'M') {
      if (paramChar2 == 'D')
        return true; 
      bool1 = false;
    } 
    return bool1;
  }
  
  private static int c(char paramChar) {
    if (paramChar != 'C') {
      if (paramChar != 'D') {
        if (paramChar != 'I') {
          if (paramChar != 'V') {
            if (paramChar != 'X') {
              if (paramChar != 'L') {
                if (paramChar == 'M')
                  return 1000; 
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid Roman digit: ");
                stringBuilder.append(paramChar);
                throw new NumberFormatException(stringBuilder.toString());
              } 
              return 50;
            } 
            return 10;
          } 
          return 5;
        } 
        return 1;
      } 
      return 500;
    } 
    return 100;
  }
  
  public int a(int paramInt, Appendable paramAppendable) {
    String str = f(paramInt);
    paramAppendable.append(str);
    return str.length();
  }
  
  public int a(String paramString, g paramg) {
    if (b()) {
      String str = a();
      int i = 0;
      char c = str.charAt(0);
      StringBuilder stringBuilder1 = new StringBuilder();
      int k = paramString.length();
      while (i < k) {
        stringBuilder1.append((char)(paramString.charAt(i) - c - 48));
        i++;
      } 
      i = Integer.parseInt(stringBuilder1.toString());
      if (i >= 0)
        return i; 
      stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Cannot convert negative number: ");
      stringBuilder1.append(paramString);
      throw new NumberFormatException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Cannot convert: ");
    stringBuilder.append(paramString);
    NumberFormatException numberFormatException = new NumberFormatException(stringBuilder.toString());
    throw numberFormatException;
  }
  
  public String a() {
    throw new AbstractMethodError();
  }
  
  public boolean a(char paramChar) {
    String str = a();
    int k = str.length();
    for (int i = 0; i < k; i++) {
      if (str.charAt(i) == paramChar)
        return true; 
    } 
    return false;
  }
  
  public boolean b() {
    throw new AbstractMethodError();
  }
  
  public String f(int paramInt) {
    if (b() && paramInt >= 0) {
      String str = a();
      boolean bool = false;
      char c = str.charAt(0);
      str = Integer.toString(paramInt);
      StringBuilder stringBuilder1 = new StringBuilder();
      int i = str.length();
      for (paramInt = bool; paramInt < i; paramInt++)
        stringBuilder1.append((char)(str.charAt(paramInt) + c - 48)); 
      return stringBuilder1.toString();
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Cannot convert: ");
    stringBuilder.append(paramInt);
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
    throw illegalArgumentException;
  }
  
  enum a {
    public String a() {
      return "០១២៣៤៥៦៧៨៩";
    }
    
    public boolean b() {
      return true;
    }
  }
  
  enum b {
    public String a() {
      return "၀၁၂၃၄၅၆၇၈၉";
    }
    
    public boolean b() {
      return true;
    }
  }
  
  enum c {
    public String a() {
      return "୦୧୨୩୪୫୬୭୮୯";
    }
    
    public boolean b() {
      return true;
    }
  }
  
  enum d {
    public int a(String param1String, g param1g) {
      if (!param1String.isEmpty()) {
        String str = param1String.toUpperCase(Locale.US);
        boolean bool = param1g.c();
        int m = param1String.length();
        int k = 0;
        int i;
        for (i = 0; k < m; i = n) {
          char c = str.charAt(k);
          int i3 = j.b(c);
          if (++k == m) {
            i += i3;
            continue;
          } 
          int i2 = 1;
          int n = i;
          int i1 = k;
          while (true) {
            i = i1;
            k = n;
            if (i1 < m) {
              char c1 = str.charAt(i1);
              i = i1 + 1;
              if (c1 == c) {
                k = i2 + 1;
                if (k < 4 || !bool) {
                  i1 = i;
                  i2 = k;
                  if (i == m) {
                    n += i3 * k;
                    i1 = i;
                    i2 = k;
                  } 
                  continue;
                } 
                StringBuilder stringBuilder1 = new StringBuilder();
                stringBuilder1.append("Roman numeral contains more than 3 equal letters in sequence: ");
                stringBuilder1.append(param1String);
                throw new NumberFormatException(stringBuilder1.toString());
              } 
              k = j.b(c1);
              if (k < i3) {
                k = n + i3 * i2;
                i--;
                break;
              } 
              if (!bool || (i2 <= 1 && j.a(c, c1))) {
                k = n + k - i3 * i2;
                break;
              } 
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("Not conform with modern usage: ");
              stringBuilder.append(param1String);
              throw new NumberFormatException(stringBuilder.toString());
            } 
            break;
          } 
          n = k;
          k = i;
        } 
        if (i <= 3999) {
          if (bool) {
            if (i < 900 || !str.contains("DCD")) {
              if (i < 90 || !str.contains("LXL")) {
                if (i >= 9) {
                  if (!str.contains("VIV"))
                    return i; 
                  throw new NumberFormatException("Roman number contains invalid sequence VIV.");
                } 
                return i;
              } 
              throw new NumberFormatException("Roman number contains invalid sequence LXL.");
            } 
            throw new NumberFormatException("Roman number contains invalid sequence DCD.");
          } 
          return i;
        } 
        throw new NumberFormatException("Roman numbers bigger than 3999 not supported.");
      } 
      NumberFormatException numberFormatException = new NumberFormatException("Empty Roman numeral.");
      throw numberFormatException;
    }
    
    public String a() {
      return "IVXLCDM";
    }
    
    public boolean a(char param1Char) {
      char c = Character.toUpperCase(param1Char);
      return (c == 'I' || c == 'V' || c == 'X' || c == 'L' || c == 'C' || c == 'D' || c == 'M');
    }
    
    public boolean b() {
      return false;
    }
    
    public String f(int param1Int) {
      if (param1Int >= 1 && param1Int <= 3999) {
        StringBuilder stringBuilder1 = new StringBuilder();
        boolean bool = false;
        int i = param1Int;
        for (param1Int = bool; param1Int < (j.d()).length; param1Int++) {
          while (i >= j.d()[param1Int]) {
            stringBuilder1.append(j.q()[param1Int]);
            i -= j.d()[param1Int];
          } 
        } 
        return stringBuilder1.toString();
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Out of range (1-3999): ");
      stringBuilder.append(param1Int);
      IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
      throw illegalArgumentException;
    }
  }
  
  enum e {
    public String a() {
      return "౦౧౨౩౪౫౬౭౮౯";
    }
    
    public boolean b() {
      return true;
    }
  }
  
  enum f {
    public String a() {
      return "๐๑๒๓๔๕๖๗๘๙";
    }
    
    public boolean b() {
      return true;
    }
  }
  
  enum g {
    public int a(String param1String, g param1g) {
      int i = Integer.parseInt(param1String);
      if (i >= 0)
        return i; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Cannot convert negative number: ");
      stringBuilder.append(param1String);
      throw new NumberFormatException(stringBuilder.toString());
    }
    
    public String a() {
      return "0123456789";
    }
    
    public boolean a(char param1Char) {
      return (param1Char >= '0' && param1Char <= '9');
    }
    
    public boolean b() {
      return true;
    }
    
    public String f(int param1Int) {
      if (param1Int >= 0)
        return Integer.toString(param1Int); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Cannot convert: ");
      stringBuilder.append(param1Int);
      throw new IllegalArgumentException(stringBuilder.toString());
    }
  }
  
  enum h {
    public String a() {
      return "٠١٢٣٤٥٦٧٨٩";
    }
    
    public boolean b() {
      return true;
    }
  }
  
  enum i {
    public String a() {
      return "۰۱۲۳۴۵۶۷۸۹";
    }
    
    public boolean b() {
      return true;
    }
  }
  
  enum j {
    public String a() {
      return "০১২৩৪৫৬৭৮৯";
    }
    
    public boolean b() {
      return true;
    }
  }
  
  enum k {
    public String a() {
      return "०१२३४५६७८९";
    }
    
    public boolean b() {
      return true;
    }
  }
  
  enum l {
    public int a(int param1Int, Appendable param1Appendable) {
      if (param1Int >= 0) {
        int k;
        int m = 0;
        int i = 1;
        while (true) {
          k = m;
          if (i <= 4) {
            if (param1Int < j.c()[i]) {
              k = i;
              break;
            } 
            i++;
            continue;
          } 
          break;
        } 
        if (k > 0) {
          m = k - 1;
          i = param1Int;
          param1Int = m;
          while (true) {
            char c;
            m = i / j.c()[param1Int];
            if (m == 11) {
              c = '↋';
            } else if (m == 10) {
              c = '↊';
            } else {
              c = (char)(m + 48);
            } 
            param1Appendable.append(c);
            i -= m * j.c()[param1Int];
            m = param1Int - 1;
            param1Int = m;
            if (m < 0)
              return k; 
          } 
        } 
      } 
      return super.a(param1Int, param1Appendable);
    }
    
    public int a(String param1String, g param1g) {
      int i = Integer.parseInt(param1String.replace('↊', 'a').replace('↋', 'b'), 12);
      if (i >= 0)
        return i; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Cannot convert negative number: ");
      stringBuilder.append(param1String);
      throw new NumberFormatException(stringBuilder.toString());
    }
    
    public String a() {
      return "0123456789↊↋";
    }
    
    public boolean a(char param1Char) {
      return ((param1Char >= '0' && param1Char <= '9') || param1Char == '↊' || param1Char == '↋');
    }
    
    public boolean b() {
      return false;
    }
    
    public String f(int param1Int) {
      if (param1Int >= 0)
        return Integer.toString(param1Int, 12).replace('a', '↊').replace('b', '↋'); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Cannot convert: ");
      stringBuilder.append(param1Int);
      throw new IllegalArgumentException(stringBuilder.toString());
    }
  }
  
  enum m {
    public int a(String param1String, g param1g) {
      Object object1;
      int i;
      Object object2;
      byte b1;
      Object object3;
      int n;
      int k = param1String.length();
      boolean bool3 = true;
      int i2 = k - 1;
      int i1 = 0;
      byte b2 = 0;
      boolean bool1 = true;
      boolean bool2 = false;
      k = 0;
      while (i2 >= 0) {
        char c = param1String.charAt(i2);
        if (c >= '፩' && c < '፲') {
          i3 = c + 1 - 4969;
        } else if (c >= '፲' && c < '፻') {
          i3 = (c + 1 - 4978) * 10;
        } else {
          if (c == '፼') {
            boolean bool;
            Object object = object1;
            if (i1) {
              object = object1;
              if (object1 == null)
                bool = true; 
            } 
            i = j.a(object3, bool, object2);
            if (i1) {
              n = object2 * 100;
            } else {
              n = object2 * 10000;
            } 
            i1 = i;
            i = 0;
            b1 = 1;
          } else {
            byte b3 = b1;
            int i8 = n;
            int i7 = i;
            if (c == '፻') {
              i1 = j.a(n, i, b1);
              n = b1 * 100;
              i = 1;
              b1 = 0;
            } else {
              continue;
            } 
          } 
          i3 = 0;
          int i5 = i1;
          int i6 = n;
          b2 = b1;
          i1 = i;
          continue;
        } 
        int i3 = i + i3;
        byte b = b1;
        int i4 = n;
        continue;
        i2--;
        object2 = SYNTHETIC_LOCAL_VARIABLE_11;
        object3 = SYNTHETIC_LOCAL_VARIABLE_10;
        object1 = SYNTHETIC_LOCAL_VARIABLE_4;
      } 
      if ((i1 != 0 || b2 != 0) && i == 0)
        i = bool3; 
      return j.a(n, i, b1);
    }
    
    public String a() {
      return "፩፪፫፬፭፮፯፰፱፲፳፴፵፶፷፸፹፺፻፼";
    }
    
    public boolean a(char param1Char) {
      return (param1Char >= '፩' && param1Char <= '፼');
    }
    
    public boolean b() {
      return false;
    }
    
    public String f(int param1Int) {
      // Byte code:
      //   0: iload_1
      //   1: iconst_1
      //   2: if_icmplt -> 300
      //   5: iload_1
      //   6: invokestatic valueOf : (I)Ljava/lang/String;
      //   9: astore #10
      //   11: aload #10
      //   13: invokevirtual length : ()I
      //   16: iconst_1
      //   17: isub
      //   18: istore #6
      //   20: iload #6
      //   22: istore_1
      //   23: aload #10
      //   25: astore #9
      //   27: iload #6
      //   29: iconst_2
      //   30: irem
      //   31: ifne -> 71
      //   34: new java/lang/StringBuilder
      //   37: dup
      //   38: invokespecial <init> : ()V
      //   41: astore #9
      //   43: aload #9
      //   45: ldc '0'
      //   47: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   50: pop
      //   51: aload #9
      //   53: aload #10
      //   55: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   58: pop
      //   59: aload #9
      //   61: invokevirtual toString : ()Ljava/lang/String;
      //   64: astore #9
      //   66: iload #6
      //   68: iconst_1
      //   69: iadd
      //   70: istore_1
      //   71: new java/lang/StringBuilder
      //   74: dup
      //   75: invokespecial <init> : ()V
      //   78: astore #10
      //   80: iload_1
      //   81: istore #6
      //   83: iload #6
      //   85: iflt -> 294
      //   88: aload #9
      //   90: iload_1
      //   91: iload #6
      //   93: isub
      //   94: invokevirtual charAt : (I)C
      //   97: istore #7
      //   99: iload #6
      //   101: iconst_1
      //   102: isub
      //   103: istore #6
      //   105: aload #9
      //   107: iload_1
      //   108: iload #6
      //   110: isub
      //   111: invokevirtual charAt : (I)C
      //   114: istore #8
      //   116: iload #8
      //   118: bipush #48
      //   120: if_icmpeq -> 134
      //   123: iload #8
      //   125: sipush #4920
      //   128: iadd
      //   129: i2c
      //   130: istore_2
      //   131: goto -> 136
      //   134: iconst_0
      //   135: istore_2
      //   136: iload #7
      //   138: bipush #48
      //   140: if_icmpeq -> 155
      //   143: iload #7
      //   145: sipush #4929
      //   148: iadd
      //   149: i2c
      //   150: istore #4
      //   152: goto -> 158
      //   155: iconst_0
      //   156: istore #4
      //   158: iload #6
      //   160: iconst_4
      //   161: irem
      //   162: iconst_2
      //   163: idiv
      //   164: istore #7
      //   166: iload #6
      //   168: ifeq -> 199
      //   171: iload #7
      //   173: ifeq -> 192
      //   176: iload_2
      //   177: ifne -> 185
      //   180: iload #4
      //   182: ifeq -> 199
      //   185: sipush #4987
      //   188: istore_3
      //   189: goto -> 201
      //   192: sipush #4988
      //   195: istore_3
      //   196: goto -> 201
      //   199: iconst_0
      //   200: istore_3
      //   201: iload_2
      //   202: istore #5
      //   204: iload_2
      //   205: sipush #4969
      //   208: if_icmpne -> 248
      //   211: iload_2
      //   212: istore #5
      //   214: iload #4
      //   216: ifne -> 248
      //   219: iload_2
      //   220: istore #5
      //   222: iload_1
      //   223: iconst_1
      //   224: if_icmple -> 248
      //   227: iload_3
      //   228: sipush #4987
      //   231: if_icmpeq -> 245
      //   234: iload_2
      //   235: istore #5
      //   237: iload #6
      //   239: iconst_1
      //   240: iadd
      //   241: iload_1
      //   242: if_icmpne -> 248
      //   245: iconst_0
      //   246: istore #5
      //   248: iload #4
      //   250: ifeq -> 261
      //   253: aload #10
      //   255: iload #4
      //   257: invokevirtual append : (C)Ljava/lang/StringBuilder;
      //   260: pop
      //   261: iload #5
      //   263: ifeq -> 274
      //   266: aload #10
      //   268: iload #5
      //   270: invokevirtual append : (C)Ljava/lang/StringBuilder;
      //   273: pop
      //   274: iload_3
      //   275: ifeq -> 285
      //   278: aload #10
      //   280: iload_3
      //   281: invokevirtual append : (C)Ljava/lang/StringBuilder;
      //   284: pop
      //   285: iload #6
      //   287: iconst_1
      //   288: isub
      //   289: istore #6
      //   291: goto -> 83
      //   294: aload #10
      //   296: invokevirtual toString : ()Ljava/lang/String;
      //   299: areturn
      //   300: new java/lang/StringBuilder
      //   303: dup
      //   304: invokespecial <init> : ()V
      //   307: astore #9
      //   309: aload #9
      //   311: ldc 'Can only convert positive numbers: '
      //   313: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   316: pop
      //   317: aload #9
      //   319: iload_1
      //   320: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   323: pop
      //   324: new java/lang/IllegalArgumentException
      //   327: dup
      //   328: aload #9
      //   330: invokevirtual toString : ()Ljava/lang/String;
      //   333: invokespecial <init> : (Ljava/lang/String;)V
      //   336: astore #9
      //   338: goto -> 344
      //   341: aload #9
      //   343: athrow
      //   344: goto -> 341
    }
  }
  
  enum n {
    public String a() {
      return "૦૧૨૩૪૫૬૭૮૯";
    }
    
    public boolean b() {
      return true;
    }
  }
  
  enum o {
    public int a(String param1String, g param1g) {
      // Byte code:
      //   0: aload_0
      //   1: invokevirtual a : ()Ljava/lang/String;
      //   4: astore_2
      //   5: aload_1
      //   6: invokevirtual length : ()I
      //   9: iconst_1
      //   10: isub
      //   11: istore #7
      //   13: iconst_0
      //   14: istore #6
      //   16: iconst_0
      //   17: istore_3
      //   18: iconst_0
      //   19: istore #5
      //   21: iconst_0
      //   22: istore #4
      //   24: iload #7
      //   26: iflt -> 374
      //   29: aload_1
      //   30: iload #7
      //   32: invokevirtual charAt : (I)C
      //   35: istore #10
      //   37: iload #10
      //   39: sipush #21313
      //   42: if_icmpeq -> 311
      //   45: iload #10
      //   47: sipush #21315
      //   50: if_icmpeq -> 264
      //   53: iload #10
      //   55: sipush #30334
      //   58: if_icmpeq -> 212
      //   61: iconst_0
      //   62: istore #8
      //   64: iload #8
      //   66: bipush #9
      //   68: if_icmpge -> 168
      //   71: aload_2
      //   72: iload #8
      //   74: invokevirtual charAt : (I)C
      //   77: istore #11
      //   79: iload #8
      //   81: iconst_1
      //   82: iadd
      //   83: istore #9
      //   85: iload #9
      //   87: istore #8
      //   89: iload #11
      //   91: iload #10
      //   93: if_icmpne -> 64
      //   96: iload #4
      //   98: iconst_1
      //   99: if_icmpne -> 117
      //   102: iload_3
      //   103: iload #9
      //   105: sipush #1000
      //   108: imul
      //   109: iadd
      //   110: istore_3
      //   111: iconst_m1
      //   112: istore #4
      //   114: goto -> 162
      //   117: iload #5
      //   119: iconst_1
      //   120: if_icmpne -> 137
      //   123: iload_3
      //   124: iload #9
      //   126: bipush #100
      //   128: imul
      //   129: iadd
      //   130: istore_3
      //   131: iconst_m1
      //   132: istore #5
      //   134: goto -> 162
      //   137: iload #6
      //   139: iconst_1
      //   140: if_icmpne -> 157
      //   143: iload_3
      //   144: iload #9
      //   146: bipush #10
      //   148: imul
      //   149: iadd
      //   150: istore_3
      //   151: iconst_m1
      //   152: istore #6
      //   154: goto -> 162
      //   157: iload_3
      //   158: iload #9
      //   160: iadd
      //   161: istore_3
      //   162: iconst_1
      //   163: istore #8
      //   165: goto -> 171
      //   168: iconst_0
      //   169: istore #8
      //   171: iload #8
      //   173: ifeq -> 179
      //   176: goto -> 332
      //   179: new java/lang/StringBuilder
      //   182: dup
      //   183: invokespecial <init> : ()V
      //   186: astore_2
      //   187: aload_2
      //   188: ldc 'Invalid Japanese numeral: '
      //   190: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   193: pop
      //   194: aload_2
      //   195: aload_1
      //   196: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   199: pop
      //   200: new java/lang/IllegalArgumentException
      //   203: dup
      //   204: aload_2
      //   205: invokevirtual toString : ()Ljava/lang/String;
      //   208: invokespecial <init> : (Ljava/lang/String;)V
      //   211: athrow
      //   212: iload #5
      //   214: ifne -> 231
      //   217: iload #4
      //   219: ifne -> 231
      //   222: iload #5
      //   224: iconst_1
      //   225: iadd
      //   226: istore #5
      //   228: goto -> 332
      //   231: new java/lang/StringBuilder
      //   234: dup
      //   235: invokespecial <init> : ()V
      //   238: astore_2
      //   239: aload_2
      //   240: ldc 'Invalid Japanese numeral: '
      //   242: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   245: pop
      //   246: aload_2
      //   247: aload_1
      //   248: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   251: pop
      //   252: new java/lang/IllegalArgumentException
      //   255: dup
      //   256: aload_2
      //   257: invokevirtual toString : ()Ljava/lang/String;
      //   260: invokespecial <init> : (Ljava/lang/String;)V
      //   263: athrow
      //   264: iload #4
      //   266: ifne -> 278
      //   269: iload #4
      //   271: iconst_1
      //   272: iadd
      //   273: istore #4
      //   275: goto -> 332
      //   278: new java/lang/StringBuilder
      //   281: dup
      //   282: invokespecial <init> : ()V
      //   285: astore_2
      //   286: aload_2
      //   287: ldc 'Invalid Japanese numeral: '
      //   289: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   292: pop
      //   293: aload_2
      //   294: aload_1
      //   295: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   298: pop
      //   299: new java/lang/IllegalArgumentException
      //   302: dup
      //   303: aload_2
      //   304: invokevirtual toString : ()Ljava/lang/String;
      //   307: invokespecial <init> : (Ljava/lang/String;)V
      //   310: athrow
      //   311: iload #6
      //   313: ifne -> 341
      //   316: iload #5
      //   318: ifne -> 341
      //   321: iload #4
      //   323: ifne -> 341
      //   326: iload #6
      //   328: iconst_1
      //   329: iadd
      //   330: istore #6
      //   332: iload #7
      //   334: iconst_1
      //   335: isub
      //   336: istore #7
      //   338: goto -> 24
      //   341: new java/lang/StringBuilder
      //   344: dup
      //   345: invokespecial <init> : ()V
      //   348: astore_2
      //   349: aload_2
      //   350: ldc 'Invalid Japanese numeral: '
      //   352: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   355: pop
      //   356: aload_2
      //   357: aload_1
      //   358: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   361: pop
      //   362: new java/lang/IllegalArgumentException
      //   365: dup
      //   366: aload_2
      //   367: invokevirtual toString : ()Ljava/lang/String;
      //   370: invokespecial <init> : (Ljava/lang/String;)V
      //   373: athrow
      //   374: iload_3
      //   375: istore #7
      //   377: iload #6
      //   379: iconst_1
      //   380: if_icmpne -> 389
      //   383: iload_3
      //   384: bipush #10
      //   386: iadd
      //   387: istore #7
      //   389: iload #7
      //   391: istore_3
      //   392: iload #5
      //   394: iconst_1
      //   395: if_icmpne -> 404
      //   398: iload #7
      //   400: bipush #100
      //   402: iadd
      //   403: istore_3
      //   404: iload_3
      //   405: istore #5
      //   407: iload #4
      //   409: iconst_1
      //   410: if_icmpne -> 420
      //   413: iload_3
      //   414: sipush #1000
      //   417: iadd
      //   418: istore #5
      //   420: iload #5
      //   422: ireturn
    }
    
    public String a() {
      return "一二三四五六七八九十百千";
    }
    
    public boolean b() {
      return false;
    }
    
    public String f(int param1Int) {
      if (param1Int >= 1 && param1Int <= 9999) {
        String str = a();
        int i = param1Int / 1000;
        int k = param1Int % 1000;
        param1Int = k / 100;
        int m = k % 100;
        k = m / 10;
        m %= 10;
        StringBuilder stringBuilder1 = new StringBuilder();
        if (i >= 1) {
          if (i > 1)
            stringBuilder1.append(str.charAt(i - 1)); 
          stringBuilder1.append('千');
        } 
        if (param1Int >= 1) {
          if (param1Int > 1)
            stringBuilder1.append(str.charAt(param1Int - 1)); 
          stringBuilder1.append('百');
        } 
        if (k >= 1) {
          if (k > 1)
            stringBuilder1.append(str.charAt(k - 1)); 
          stringBuilder1.append('十');
        } 
        if (m > 0)
          stringBuilder1.append(str.charAt(m - 1)); 
        return stringBuilder1.toString();
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Cannot convert: ");
      stringBuilder.append(param1Int);
      throw new IllegalArgumentException(stringBuilder.toString());
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */