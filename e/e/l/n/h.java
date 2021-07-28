package e.e.l.n;

import e.e.c.a.d;
import e.e.e.h.a;
import e.e.l.d.f;
import e.e.l.d.p;
import e.e.l.k.b;

public class h implements j0<a<b>> {
  private final p<d, b> a;
  
  private final f b;
  
  private final j0<a<b>> c;
  
  public h(p<d, b> paramp, f paramf, j0<a<b>> paramj0) {
    this.a = paramp;
    this.b = paramf;
    this.c = paramj0;
  }
  
  protected k<a<b>> a(k<a<b>> paramk, d paramd, boolean paramBoolean) {
    return new a(this, paramk, paramd, paramBoolean);
  }
  
  protected String a() {
    return "BitmapMemoryCacheProducer";
  }
  
  public void a(k<a<b>> paramk, k0 paramk0) {
    throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.useAs(TypeTransformer.java:868)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:668)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  class a extends n<a<b>, a<b>> {
    a(h this$0, k<a<b>> param1k, d param1d, boolean param1Boolean) {
      super(param1k);
    }
    
    public void a(a<b> param1a, int param1Int) {
      // Byte code:
      //   0: invokestatic c : ()Z
      //   3: ifeq -> 11
      //   6: ldc 'BitmapMemoryCacheProducer#onNewResultImpl'
      //   8: invokestatic a : (Ljava/lang/String;)V
      //   11: iload_2
      //   12: invokestatic a : (I)Z
      //   15: istore #5
      //   17: aconst_null
      //   18: astore #6
      //   20: aload_1
      //   21: ifnonnull -> 50
      //   24: iload #5
      //   26: ifeq -> 40
      //   29: aload_0
      //   30: invokevirtual c : ()Le/e/l/n/k;
      //   33: aconst_null
      //   34: iload_2
      //   35: invokeinterface a : (Ljava/lang/Object;I)V
      //   40: invokestatic c : ()Z
      //   43: ifeq -> 49
      //   46: invokestatic a : ()V
      //   49: return
      //   50: aload_1
      //   51: invokevirtual b : ()Ljava/lang/Object;
      //   54: checkcast e/e/l/k/b
      //   57: invokevirtual e : ()Z
      //   60: ifne -> 294
      //   63: iload_2
      //   64: bipush #8
      //   66: invokestatic b : (II)Z
      //   69: ifeq -> 75
      //   72: goto -> 294
      //   75: iload #5
      //   77: ifne -> 207
      //   80: aload_0
      //   81: getfield e : Le/e/l/n/h;
      //   84: invokestatic a : (Le/e/l/n/h;)Le/e/l/d/p;
      //   87: aload_0
      //   88: getfield c : Le/e/c/a/d;
      //   91: invokeinterface get : (Ljava/lang/Object;)Le/e/e/h/a;
      //   96: astore #7
      //   98: aload #7
      //   100: ifnull -> 207
      //   103: aload_1
      //   104: invokevirtual b : ()Ljava/lang/Object;
      //   107: checkcast e/e/l/k/b
      //   110: invokevirtual c : ()Le/e/l/k/g;
      //   113: astore #8
      //   115: aload #7
      //   117: invokevirtual b : ()Ljava/lang/Object;
      //   120: checkcast e/e/l/k/b
      //   123: invokevirtual c : ()Le/e/l/k/g;
      //   126: astore #9
      //   128: aload #9
      //   130: invokeinterface a : ()Z
      //   135: ifne -> 172
      //   138: aload #9
      //   140: invokeinterface c : ()I
      //   145: istore_3
      //   146: aload #8
      //   148: invokeinterface c : ()I
      //   153: istore #4
      //   155: iload_3
      //   156: iload #4
      //   158: if_icmplt -> 164
      //   161: goto -> 172
      //   164: aload #7
      //   166: invokestatic b : (Le/e/e/h/a;)V
      //   169: goto -> 207
      //   172: aload_0
      //   173: invokevirtual c : ()Le/e/l/n/k;
      //   176: aload #7
      //   178: iload_2
      //   179: invokeinterface a : (Ljava/lang/Object;I)V
      //   184: aload #7
      //   186: invokestatic b : (Le/e/e/h/a;)V
      //   189: invokestatic c : ()Z
      //   192: ifeq -> 198
      //   195: invokestatic a : ()V
      //   198: return
      //   199: astore_1
      //   200: aload #7
      //   202: invokestatic b : (Le/e/e/h/a;)V
      //   205: aload_1
      //   206: athrow
      //   207: aload_0
      //   208: getfield d : Z
      //   211: ifeq -> 233
      //   214: aload_0
      //   215: getfield e : Le/e/l/n/h;
      //   218: invokestatic a : (Le/e/l/n/h;)Le/e/l/d/p;
      //   221: aload_0
      //   222: getfield c : Le/e/c/a/d;
      //   225: aload_1
      //   226: invokeinterface a : (Ljava/lang/Object;Le/e/e/h/a;)Le/e/e/h/a;
      //   231: astore #6
      //   233: iload #5
      //   235: ifeq -> 248
      //   238: aload_0
      //   239: invokevirtual c : ()Le/e/l/n/k;
      //   242: fconst_1
      //   243: invokeinterface a : (F)V
      //   248: aload_0
      //   249: invokevirtual c : ()Le/e/l/n/k;
      //   252: astore #7
      //   254: aload #6
      //   256: ifnull -> 262
      //   259: aload #6
      //   261: astore_1
      //   262: aload #7
      //   264: aload_1
      //   265: iload_2
      //   266: invokeinterface a : (Ljava/lang/Object;I)V
      //   271: aload #6
      //   273: invokestatic b : (Le/e/e/h/a;)V
      //   276: invokestatic c : ()Z
      //   279: ifeq -> 285
      //   282: invokestatic a : ()V
      //   285: return
      //   286: astore_1
      //   287: aload #6
      //   289: invokestatic b : (Le/e/e/h/a;)V
      //   292: aload_1
      //   293: athrow
      //   294: aload_0
      //   295: invokevirtual c : ()Le/e/l/n/k;
      //   298: aload_1
      //   299: iload_2
      //   300: invokeinterface a : (Ljava/lang/Object;I)V
      //   305: invokestatic c : ()Z
      //   308: ifeq -> 314
      //   311: invokestatic a : ()V
      //   314: return
      //   315: astore_1
      //   316: invokestatic c : ()Z
      //   319: ifeq -> 325
      //   322: invokestatic a : ()V
      //   325: aload_1
      //   326: athrow
      // Exception table:
      //   from	to	target	type
      //   0	11	315	finally
      //   11	17	315	finally
      //   29	40	315	finally
      //   50	72	315	finally
      //   80	98	315	finally
      //   103	155	199	finally
      //   164	169	315	finally
      //   172	184	199	finally
      //   184	189	315	finally
      //   200	207	315	finally
      //   207	233	315	finally
      //   238	248	286	finally
      //   248	254	286	finally
      //   262	271	286	finally
      //   271	276	315	finally
      //   287	294	315	finally
      //   294	305	315	finally
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */