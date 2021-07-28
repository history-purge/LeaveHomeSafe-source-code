package e.f.a.e.i.g;

import com.google.firebase.m.d;
import com.google.firebase.m.e;
import com.google.firebase.m.f;
import com.google.firebase.m.g;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Map;

final class c implements f {
  private static final Charset f = Charset.forName("UTF-8");
  
  private static final d g;
  
  private static final d h;
  
  private static final e<Map.Entry<Object, Object>> i = b.a;
  
  private OutputStream a;
  
  private final Map<Class<?>, e<?>> b;
  
  private final Map<Class<?>, g<?>> c;
  
  private final e<Object> d;
  
  private final g e = new g(this);
  
  c(OutputStream paramOutputStream, Map<Class<?>, e<?>> paramMap, Map<Class<?>, g<?>> paramMap1, e<Object> parame) {
    this.a = paramOutputStream;
    this.b = paramMap;
    this.c = paramMap1;
    this.d = parame;
  }
  
  private static int a(d paramd) {
    f0 f0 = (f0)paramd.a(f0.class);
    if (f0 != null)
      return f0.zza(); 
    throw new com.google.firebase.m.c("Field has no @Protobuf config");
  }
  
  private final <T> long a(e<T> parame, T paramT) {
    c0 c0 = new c0();
    try {
      OutputStream outputStream = this.a;
      this.a = c0;
    } finally {
      try {
        c0.close();
      } finally {
        paramT = null;
      } 
    } 
  }
  
  private final <T> c a(e<T> parame, d paramd, T paramT, boolean paramBoolean) {
    long l = a(parame, paramT);
    if (paramBoolean && l == 0L)
      return this; 
    b(a(paramd) << 3 | 0x2);
    a(l);
    parame.a(paramT, this);
    return this;
  }
  
  private final <T> c a(g<T> paramg, d paramd, T paramT, boolean paramBoolean) {
    this.e.a(paramd, paramBoolean);
    paramg.a(paramT, this.e);
    return this;
  }
  
  private static ByteBuffer a(int paramInt) {
    return ByteBuffer.allocate(paramInt).order(ByteOrder.LITTLE_ENDIAN);
  }
  
  private final void a(long paramLong) {
    while (true) {
      OutputStream outputStream = this.a;
      if ((0xFFFFFFFFFFFFFF80L & paramLong) != 0L) {
        outputStream.write((int)paramLong & 0x7F | 0x80);
        paramLong >>>= 7L;
        continue;
      } 
      outputStream.write((int)paramLong & 0x7F);
      return;
    } 
  }
  
  private static f0 b(d paramd) {
    f0 f0 = (f0)paramd.a(f0.class);
    if (f0 != null)
      return f0; 
    throw new com.google.firebase.m.c("Field has no @Protobuf config");
  }
  
  private final void b(int paramInt) {
    while (true) {
      long l = (paramInt & 0xFFFFFF80);
      OutputStream outputStream = this.a;
      if (l != 0L) {
        outputStream.write(paramInt & 0x7F | 0x80);
        paramInt >>>= 7;
        continue;
      } 
      outputStream.write(paramInt & 0x7F);
      return;
    } 
  }
  
  final f a(d paramd, double paramDouble, boolean paramBoolean) {
    if (paramBoolean && paramDouble == 0.0D)
      return this; 
    b(a(paramd) << 3 | 0x1);
    this.a.write(a(8).putDouble(paramDouble).array());
    return this;
  }
  
  final f a(d paramd, float paramFloat, boolean paramBoolean) {
    if (paramBoolean && paramFloat == 0.0F)
      return this; 
    b(a(paramd) << 3 | 0x5);
    this.a.write(a(4).putFloat(paramFloat).array());
    return this;
  }
  
  public final f a(d paramd, Object paramObject) {
    a(paramd, paramObject, true);
    return this;
  }
  
  final f a(d paramd, Object paramObject, boolean paramBoolean) {
    throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final f a(String paramString, Object paramObject) {
    a(d.b(paramString), paramObject, true);
    return this;
  }
  
  final c a(d paramd, int paramInt, boolean paramBoolean) {
    if (!paramBoolean || paramInt != 0) {
      f0 f0 = b(paramd);
      e0 e0 = e0.c;
      int i = f0.zzb().ordinal();
      if (i != 0) {
        if (i != 1) {
          if (i != 2)
            return this; 
          b(f0.zza() << 3 | 0x5);
          this.a.write(a(4).putInt(paramInt).array());
          return this;
        } 
        b(f0.zza() << 3);
        b(paramInt + paramInt ^ paramInt >> 31);
        return this;
      } 
      b(f0.zza() << 3);
      b(paramInt);
      return this;
    } 
    return this;
  }
  
  final c a(d paramd, long paramLong, boolean paramBoolean) {
    if (!paramBoolean || paramLong != 0L) {
      f0 f0 = b(paramd);
      e0 e0 = e0.c;
      int i = f0.zzb().ordinal();
      if (i != 0) {
        if (i != 1) {
          if (i != 2)
            return this; 
          b(f0.zza() << 3 | 0x1);
          this.a.write(a(8).putLong(paramLong).array());
          return this;
        } 
        b(f0.zza() << 3);
        a(paramLong >> 63L ^ paramLong + paramLong);
        return this;
      } 
      b(f0.zza() << 3);
      a(paramLong);
      return this;
    } 
    return this;
  }
  
  final c a(Object paramObject) {
    if (paramObject == null)
      return this; 
    e e1 = this.b.get(paramObject.getClass());
    if (e1 != null) {
      e1.a(paramObject, this);
      return this;
    } 
    paramObject = String.valueOf(paramObject.getClass());
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramObject).length() + 15);
    stringBuilder.append("No encoder for ");
    stringBuilder.append((String)paramObject);
    throw new com.google.firebase.m.c(stringBuilder.toString());
  }
  
  static {
    d.b b = d.a("key");
    b0 b0 = new b0();
    b0.a(1);
    b.a(b0.a());
    g = b.a();
    b = d.a("value");
    b0 = new b0();
    b0.a(2);
    b.a(b0.a());
    h = b.a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/g/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */