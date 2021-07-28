package b.g.l;

import java.util.Locale;

public final class e {
  public static final d a = new e(null, false);
  
  public static final d b = new e(null, true);
  
  public static final d c = new e(b.a, false);
  
  public static final d d = new e(b.a, true);
  
  static {
    new e(a.b, false);
    f f = f.b;
  }
  
  static int a(int paramInt) {
    return (paramInt != 0) ? ((paramInt != 1 && paramInt != 2) ? 2 : 0) : 1;
  }
  
  static int b(int paramInt) {
    if (paramInt != 0)
      if (paramInt != 1 && paramInt != 2) {
        switch (paramInt) {
          default:
            return 2;
          case 16:
          case 17:
            return 0;
          case 14:
          case 15:
            break;
        } 
        return 1;
      }  
    return 1;
  }
  
  private static class a implements c {
    static final a b = new a(true);
    
    private final boolean a;
    
    private a(boolean param1Boolean) {
      this.a = param1Boolean;
    }
    
    public int a(CharSequence param1CharSequence, int param1Int1, int param1Int2) {
      throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
  }
  
  private static class b implements c {
    static final b a = new b();
    
    public int a(CharSequence param1CharSequence, int param1Int1, int param1Int2) {
      int j = 2;
      int i;
      for (i = param1Int1; i < param1Int2 + param1Int1 && j == 2; i++)
        j = e.b(Character.getDirectionality(param1CharSequence.charAt(i))); 
      return j;
    }
  }
  
  private static interface c {
    int a(CharSequence param1CharSequence, int param1Int1, int param1Int2);
  }
  
  private static abstract class d implements d {
    private final e.c a;
    
    d(e.c param1c) {
      this.a = param1c;
    }
    
    private boolean b(CharSequence param1CharSequence, int param1Int1, int param1Int2) {
      param1Int1 = this.a.a(param1CharSequence, param1Int1, param1Int2);
      return (param1Int1 != 0) ? ((param1Int1 != 1) ? a() : false) : true;
    }
    
    protected abstract boolean a();
    
    public boolean a(CharSequence param1CharSequence, int param1Int1, int param1Int2) {
      if (param1CharSequence != null && param1Int1 >= 0 && param1Int2 >= 0 && param1CharSequence.length() - param1Int2 >= param1Int1)
        return (this.a == null) ? a() : b(param1CharSequence, param1Int1, param1Int2); 
      throw new IllegalArgumentException();
    }
  }
  
  private static class e extends d {
    private final boolean b;
    
    e(e.c param1c, boolean param1Boolean) {
      super(param1c);
      this.b = param1Boolean;
    }
    
    protected boolean a() {
      return this.b;
    }
  }
  
  private static class f extends d {
    static final f b = new f();
    
    f() {
      super(null);
    }
    
    protected boolean a() {
      return (f.b(Locale.getDefault()) == 1);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/l/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */