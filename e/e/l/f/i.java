package e.e.l.f;

import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.memory.f0;
import e.e.e.d.l;
import e.e.l.c.f;
import e.e.l.d.f;
import e.e.l.d.h;
import e.e.l.d.n;
import e.e.l.d.q;
import e.e.l.i.d;
import e.e.l.i.e;
import e.e.l.n.f0;
import e.e.l.q.d;
import java.util.Collections;
import java.util.Set;

public class i {
  private static c D = new c(null);
  
  private final boolean A;
  
  private final e.e.d.a B;
  
  private final e.e.l.h.a C;
  
  private final Bitmap.Config a;
  
  private final l<q> b;
  
  private final h.c c;
  
  private final f d;
  
  private final Context e;
  
  private final boolean f;
  
  private final g g;
  
  private final l<q> h;
  
  private final f i;
  
  private final n j;
  
  private final e.e.l.i.c k;
  
  private final d l;
  
  private final Integer m;
  
  private final l<Boolean> n;
  
  private final e.e.c.b.c o;
  
  private final e.e.e.g.c p;
  
  private final int q;
  
  private final f0 r;
  
  private final int s;
  
  private final f0 t;
  
  private final e u;
  
  private final Set<e.e.l.l.c> v;
  
  private final boolean w;
  
  private final e.e.c.b.c x;
  
  private final d y;
  
  private final j z;
  
  private i(b paramb) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic c : ()Z
    //   7: ifeq -> 15
    //   10: ldc 'ImagePipelineConfig()'
    //   12: invokestatic a : (Ljava/lang/String;)V
    //   15: aload_0
    //   16: aload_1
    //   17: invokestatic a : (Le/e/l/f/i$b;)Le/e/l/f/j$b;
    //   20: invokevirtual a : ()Le/e/l/f/j;
    //   23: putfield z : Le/e/l/f/j;
    //   26: aload_1
    //   27: invokestatic l : (Le/e/l/f/i$b;)Le/e/e/d/l;
    //   30: ifnonnull -> 56
    //   33: new e/e/l/d/i
    //   36: dup
    //   37: aload_1
    //   38: invokestatic v : (Le/e/l/f/i$b;)Landroid/content/Context;
    //   41: ldc 'activity'
    //   43: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   46: checkcast android/app/ActivityManager
    //   49: invokespecial <init> : (Landroid/app/ActivityManager;)V
    //   52: astore_3
    //   53: goto -> 61
    //   56: aload_1
    //   57: invokestatic l : (Le/e/l/f/i$b;)Le/e/e/d/l;
    //   60: astore_3
    //   61: aload_0
    //   62: aload_3
    //   63: putfield b : Le/e/e/d/l;
    //   66: aload_1
    //   67: invokestatic y : (Le/e/l/f/i$b;)Le/e/l/d/h$c;
    //   70: ifnonnull -> 84
    //   73: new e/e/l/d/d
    //   76: dup
    //   77: invokespecial <init> : ()V
    //   80: astore_3
    //   81: goto -> 89
    //   84: aload_1
    //   85: invokestatic y : (Le/e/l/f/i$b;)Le/e/l/d/h$c;
    //   88: astore_3
    //   89: aload_0
    //   90: aload_3
    //   91: putfield c : Le/e/l/d/h$c;
    //   94: aload_1
    //   95: invokestatic z : (Le/e/l/f/i$b;)Landroid/graphics/Bitmap$Config;
    //   98: ifnonnull -> 108
    //   101: getstatic android/graphics/Bitmap$Config.ARGB_8888 : Landroid/graphics/Bitmap$Config;
    //   104: astore_3
    //   105: goto -> 113
    //   108: aload_1
    //   109: invokestatic z : (Le/e/l/f/i$b;)Landroid/graphics/Bitmap$Config;
    //   112: astore_3
    //   113: aload_0
    //   114: aload_3
    //   115: putfield a : Landroid/graphics/Bitmap$Config;
    //   118: aload_1
    //   119: invokestatic A : (Le/e/l/f/i$b;)Le/e/l/d/f;
    //   122: ifnonnull -> 132
    //   125: invokestatic a : ()Le/e/l/d/j;
    //   128: astore_3
    //   129: goto -> 137
    //   132: aload_1
    //   133: invokestatic A : (Le/e/l/f/i$b;)Le/e/l/d/f;
    //   136: astore_3
    //   137: aload_0
    //   138: aload_3
    //   139: putfield d : Le/e/l/d/f;
    //   142: aload_1
    //   143: invokestatic v : (Le/e/l/f/i$b;)Landroid/content/Context;
    //   146: astore_3
    //   147: aload_3
    //   148: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   151: pop
    //   152: aload_0
    //   153: aload_3
    //   154: checkcast android/content/Context
    //   157: putfield e : Landroid/content/Context;
    //   160: aload_1
    //   161: invokestatic B : (Le/e/l/f/i$b;)Le/e/l/f/g;
    //   164: ifnonnull -> 185
    //   167: new e/e/l/f/c
    //   170: dup
    //   171: new e/e/l/f/e
    //   174: dup
    //   175: invokespecial <init> : ()V
    //   178: invokespecial <init> : (Le/e/l/f/d;)V
    //   181: astore_3
    //   182: goto -> 190
    //   185: aload_1
    //   186: invokestatic B : (Le/e/l/f/i$b;)Le/e/l/f/g;
    //   189: astore_3
    //   190: aload_0
    //   191: aload_3
    //   192: putfield g : Le/e/l/f/g;
    //   195: aload_0
    //   196: aload_1
    //   197: invokestatic C : (Le/e/l/f/i$b;)Z
    //   200: putfield f : Z
    //   203: aload_1
    //   204: invokestatic D : (Le/e/l/f/i$b;)Le/e/e/d/l;
    //   207: ifnonnull -> 221
    //   210: new e/e/l/d/k
    //   213: dup
    //   214: invokespecial <init> : ()V
    //   217: astore_3
    //   218: goto -> 226
    //   221: aload_1
    //   222: invokestatic D : (Le/e/l/f/i$b;)Le/e/e/d/l;
    //   225: astore_3
    //   226: aload_0
    //   227: aload_3
    //   228: putfield h : Le/e/e/d/l;
    //   231: aload_1
    //   232: invokestatic b : (Le/e/l/f/i$b;)Le/e/l/d/n;
    //   235: ifnonnull -> 245
    //   238: invokestatic h : ()Le/e/l/d/t;
    //   241: astore_3
    //   242: goto -> 250
    //   245: aload_1
    //   246: invokestatic b : (Le/e/l/f/i$b;)Le/e/l/d/n;
    //   249: astore_3
    //   250: aload_0
    //   251: aload_3
    //   252: putfield j : Le/e/l/d/n;
    //   255: aload_0
    //   256: aload_1
    //   257: invokestatic c : (Le/e/l/f/i$b;)Le/e/l/i/c;
    //   260: putfield k : Le/e/l/i/c;
    //   263: aload_0
    //   264: aload_1
    //   265: invokestatic a : (Le/e/l/f/i$b;)Le/e/l/q/d;
    //   268: putfield l : Le/e/l/q/d;
    //   271: aload_0
    //   272: aload_1
    //   273: invokestatic d : (Le/e/l/f/i$b;)Ljava/lang/Integer;
    //   276: putfield m : Ljava/lang/Integer;
    //   279: aload_1
    //   280: invokestatic e : (Le/e/l/f/i$b;)Le/e/e/d/l;
    //   283: ifnonnull -> 298
    //   286: new e/e/l/f/i$a
    //   289: dup
    //   290: aload_0
    //   291: invokespecial <init> : (Le/e/l/f/i;)V
    //   294: astore_3
    //   295: goto -> 303
    //   298: aload_1
    //   299: invokestatic e : (Le/e/l/f/i$b;)Le/e/e/d/l;
    //   302: astore_3
    //   303: aload_0
    //   304: aload_3
    //   305: putfield n : Le/e/e/d/l;
    //   308: aload_1
    //   309: invokestatic f : (Le/e/l/f/i$b;)Le/e/c/b/c;
    //   312: ifnonnull -> 326
    //   315: aload_1
    //   316: invokestatic v : (Le/e/l/f/i$b;)Landroid/content/Context;
    //   319: invokestatic a : (Landroid/content/Context;)Le/e/c/b/c;
    //   322: astore_3
    //   323: goto -> 331
    //   326: aload_1
    //   327: invokestatic f : (Le/e/l/f/i$b;)Le/e/c/b/c;
    //   330: astore_3
    //   331: aload_0
    //   332: aload_3
    //   333: putfield o : Le/e/c/b/c;
    //   336: aload_1
    //   337: invokestatic g : (Le/e/l/f/i$b;)Le/e/e/g/c;
    //   340: ifnonnull -> 350
    //   343: invokestatic a : ()Le/e/e/g/d;
    //   346: astore_3
    //   347: goto -> 355
    //   350: aload_1
    //   351: invokestatic g : (Le/e/l/f/i$b;)Le/e/e/g/c;
    //   354: astore_3
    //   355: aload_0
    //   356: aload_3
    //   357: putfield p : Le/e/e/g/c;
    //   360: aload_0
    //   361: aload_1
    //   362: aload_0
    //   363: getfield z : Le/e/l/f/j;
    //   366: invokestatic a : (Le/e/l/f/i$b;Le/e/l/f/j;)I
    //   369: putfield q : I
    //   372: aload_1
    //   373: invokestatic h : (Le/e/l/f/i$b;)I
    //   376: ifge -> 386
    //   379: sipush #30000
    //   382: istore_2
    //   383: goto -> 391
    //   386: aload_1
    //   387: invokestatic h : (Le/e/l/f/i$b;)I
    //   390: istore_2
    //   391: aload_0
    //   392: iload_2
    //   393: putfield s : I
    //   396: invokestatic c : ()Z
    //   399: ifeq -> 407
    //   402: ldc 'ImagePipelineConfig->mNetworkFetcher'
    //   404: invokestatic a : (Ljava/lang/String;)V
    //   407: aload_1
    //   408: invokestatic i : (Le/e/l/f/i$b;)Le/e/l/n/f0;
    //   411: ifnonnull -> 429
    //   414: new e/e/l/n/t
    //   417: dup
    //   418: aload_0
    //   419: getfield s : I
    //   422: invokespecial <init> : (I)V
    //   425: astore_3
    //   426: goto -> 434
    //   429: aload_1
    //   430: invokestatic i : (Le/e/l/f/i$b;)Le/e/l/n/f0;
    //   433: astore_3
    //   434: aload_0
    //   435: aload_3
    //   436: putfield r : Le/e/l/n/f0;
    //   439: invokestatic c : ()Z
    //   442: ifeq -> 448
    //   445: invokestatic a : ()V
    //   448: aload_1
    //   449: invokestatic j : (Le/e/l/f/i$b;)Le/e/l/c/f;
    //   452: pop
    //   453: aload_1
    //   454: invokestatic k : (Le/e/l/f/i$b;)Lcom/facebook/imagepipeline/memory/f0;
    //   457: ifnonnull -> 477
    //   460: new com/facebook/imagepipeline/memory/f0
    //   463: dup
    //   464: invokestatic m : ()Lcom/facebook/imagepipeline/memory/e0$b;
    //   467: invokevirtual a : ()Lcom/facebook/imagepipeline/memory/e0;
    //   470: invokespecial <init> : (Lcom/facebook/imagepipeline/memory/e0;)V
    //   473: astore_3
    //   474: goto -> 482
    //   477: aload_1
    //   478: invokestatic k : (Le/e/l/f/i$b;)Lcom/facebook/imagepipeline/memory/f0;
    //   481: astore_3
    //   482: aload_0
    //   483: aload_3
    //   484: putfield t : Lcom/facebook/imagepipeline/memory/f0;
    //   487: aload_1
    //   488: invokestatic m : (Le/e/l/f/i$b;)Le/e/l/i/e;
    //   491: ifnonnull -> 505
    //   494: new e/e/l/i/g
    //   497: dup
    //   498: invokespecial <init> : ()V
    //   501: astore_3
    //   502: goto -> 510
    //   505: aload_1
    //   506: invokestatic m : (Le/e/l/f/i$b;)Le/e/l/i/e;
    //   509: astore_3
    //   510: aload_0
    //   511: aload_3
    //   512: putfield u : Le/e/l/i/e;
    //   515: aload_1
    //   516: invokestatic n : (Le/e/l/f/i$b;)Ljava/util/Set;
    //   519: ifnonnull -> 533
    //   522: new java/util/HashSet
    //   525: dup
    //   526: invokespecial <init> : ()V
    //   529: astore_3
    //   530: goto -> 538
    //   533: aload_1
    //   534: invokestatic n : (Le/e/l/f/i$b;)Ljava/util/Set;
    //   537: astore_3
    //   538: aload_0
    //   539: aload_3
    //   540: putfield v : Ljava/util/Set;
    //   543: aload_0
    //   544: aload_1
    //   545: invokestatic o : (Le/e/l/f/i$b;)Z
    //   548: putfield w : Z
    //   551: aload_1
    //   552: invokestatic p : (Le/e/l/f/i$b;)Le/e/c/b/c;
    //   555: ifnonnull -> 566
    //   558: aload_0
    //   559: getfield o : Le/e/c/b/c;
    //   562: astore_3
    //   563: goto -> 571
    //   566: aload_1
    //   567: invokestatic p : (Le/e/l/f/i$b;)Le/e/c/b/c;
    //   570: astore_3
    //   571: aload_0
    //   572: aload_3
    //   573: putfield x : Le/e/c/b/c;
    //   576: aload_0
    //   577: aload_1
    //   578: invokestatic q : (Le/e/l/f/i$b;)Le/e/l/i/d;
    //   581: putfield y : Le/e/l/i/d;
    //   584: aload_0
    //   585: getfield t : Lcom/facebook/imagepipeline/memory/f0;
    //   588: invokevirtual d : ()I
    //   591: istore_2
    //   592: aload_1
    //   593: invokestatic r : (Le/e/l/f/i$b;)Le/e/l/f/f;
    //   596: ifnonnull -> 611
    //   599: new e/e/l/f/b
    //   602: dup
    //   603: iload_2
    //   604: invokespecial <init> : (I)V
    //   607: astore_3
    //   608: goto -> 616
    //   611: aload_1
    //   612: invokestatic r : (Le/e/l/f/i$b;)Le/e/l/f/f;
    //   615: astore_3
    //   616: aload_0
    //   617: aload_3
    //   618: putfield i : Le/e/l/f/f;
    //   621: aload_0
    //   622: aload_1
    //   623: invokestatic s : (Le/e/l/f/i$b;)Z
    //   626: putfield A : Z
    //   629: aload_0
    //   630: aload_1
    //   631: invokestatic t : (Le/e/l/f/i$b;)Le/e/d/a;
    //   634: putfield B : Le/e/d/a;
    //   637: aload_0
    //   638: aload_1
    //   639: invokestatic u : (Le/e/l/f/i$b;)Le/e/l/h/a;
    //   642: putfield C : Le/e/l/h/a;
    //   645: aload_0
    //   646: getfield z : Le/e/l/f/j;
    //   649: invokevirtual h : ()Le/e/e/l/b;
    //   652: astore_3
    //   653: aload_3
    //   654: ifnull -> 681
    //   657: new e/e/l/c/d
    //   660: dup
    //   661: aload_0
    //   662: invokevirtual v : ()Lcom/facebook/imagepipeline/memory/f0;
    //   665: invokespecial <init> : (Lcom/facebook/imagepipeline/memory/f0;)V
    //   668: astore_1
    //   669: aload_3
    //   670: aload_0
    //   671: getfield z : Le/e/l/f/j;
    //   674: aload_1
    //   675: invokestatic a : (Le/e/e/l/b;Le/e/l/f/j;Le/e/e/l/a;)V
    //   678: goto -> 720
    //   681: aload_0
    //   682: getfield z : Le/e/l/f/j;
    //   685: invokevirtual o : ()Z
    //   688: ifeq -> 720
    //   691: getstatic e/e/e/l/c.a : Z
    //   694: ifeq -> 720
    //   697: invokestatic b : ()Le/e/e/l/b;
    //   700: astore_3
    //   701: aload_3
    //   702: ifnull -> 720
    //   705: new e/e/l/c/d
    //   708: dup
    //   709: aload_0
    //   710: invokevirtual v : ()Lcom/facebook/imagepipeline/memory/f0;
    //   713: invokespecial <init> : (Lcom/facebook/imagepipeline/memory/f0;)V
    //   716: astore_1
    //   717: goto -> 669
    //   720: invokestatic c : ()Z
    //   723: ifeq -> 729
    //   726: invokestatic a : ()V
    //   729: return
  }
  
  public static c C() {
    return D;
  }
  
  private static int a(b paramb, j paramj) {
    return (b.x(paramb) != null) ? b.x(paramb).intValue() : (paramj.m() ? 1 : 0);
  }
  
  private static e.e.c.b.c a(Context paramContext) {
    try {
      if (e.e.l.p.b.c())
        e.e.l.p.b.a("DiskCacheConfig.getDefaultMainDiskCacheConfig"); 
      return e.e.c.b.c.a(paramContext).a();
    } finally {
      if (e.e.l.p.b.c())
        e.e.l.p.b.a(); 
    } 
  }
  
  private static d a(b paramb) {
    if (b.w(paramb) == null || b.d(paramb) == null)
      return (b.w(paramb) != null) ? b.w(paramb) : null; 
    throw new IllegalStateException("You can't define a custom ImageTranscoderFactory and provide an ImageTranscoderType");
  }
  
  private static void a(e.e.e.l.b paramb, j paramj, e.e.e.l.a parama) {
    e.e.e.l.c.b = paramb;
    e.e.e.l.b.a a1 = paramj.i();
    if (a1 != null)
      paramb.a(a1); 
    if (parama != null)
      paramb.a(parama); 
  }
  
  public static b b(Context paramContext) {
    return new b(paramContext, null);
  }
  
  public boolean A() {
    return this.f;
  }
  
  public boolean B() {
    return this.w;
  }
  
  public Bitmap.Config a() {
    return this.a;
  }
  
  public l<q> b() {
    return this.b;
  }
  
  public h.c c() {
    return this.c;
  }
  
  public f d() {
    return this.d;
  }
  
  public e.e.d.a e() {
    return this.B;
  }
  
  public e.e.l.h.a f() {
    return this.C;
  }
  
  public Context g() {
    return this.e;
  }
  
  public l<q> h() {
    return this.h;
  }
  
  public f i() {
    return this.i;
  }
  
  public j j() {
    return this.z;
  }
  
  public g k() {
    return this.g;
  }
  
  public n l() {
    return this.j;
  }
  
  public e.e.l.i.c m() {
    return this.k;
  }
  
  public d n() {
    return this.y;
  }
  
  public d o() {
    return this.l;
  }
  
  public Integer p() {
    return this.m;
  }
  
  public l<Boolean> q() {
    return this.n;
  }
  
  public e.e.c.b.c r() {
    return this.o;
  }
  
  public int s() {
    return this.q;
  }
  
  public e.e.e.g.c t() {
    return this.p;
  }
  
  public f0 u() {
    return this.r;
  }
  
  public f0 v() {
    return this.t;
  }
  
  public e w() {
    return this.u;
  }
  
  public Set<e.e.l.l.c> x() {
    return Collections.unmodifiableSet(this.v);
  }
  
  public e.e.c.b.c y() {
    return this.x;
  }
  
  public boolean z() {
    return this.A;
  }
  
  class a implements l<Boolean> {
    a(i this$0) {}
    
    public Boolean get() {
      return Boolean.valueOf(true);
    }
  }
  
  public static class b {
    private final j.b A = new j.b(this);
    
    private boolean B = true;
    
    private e.e.d.a C;
    
    private e.e.l.h.a D = (e.e.l.h.a)new e.e.l.h.b();
    
    private Bitmap.Config a;
    
    private l<q> b;
    
    private h.c c;
    
    private f d;
    
    private final Context e;
    
    private boolean f = false;
    
    private l<q> g;
    
    private f h;
    
    private n i;
    
    private e.e.l.i.c j;
    
    private d k;
    
    private Integer l = null;
    
    private l<Boolean> m;
    
    private e.e.c.b.c n;
    
    private e.e.e.g.c o;
    
    private Integer p = null;
    
    private f0 q;
    
    private f r;
    
    private f0 s;
    
    private e t;
    
    private Set<e.e.l.l.c> u;
    
    private boolean v = true;
    
    private e.e.c.b.c w;
    
    private g x;
    
    private d y;
    
    private int z = -1;
    
    private b(Context param1Context) {
      e.e.e.d.i.a(param1Context);
      this.e = param1Context;
    }
    
    public b a(f0 param1f0) {
      this.q = param1f0;
      return this;
    }
    
    public b a(Set<e.e.l.l.c> param1Set) {
      this.u = param1Set;
      return this;
    }
    
    public b a(boolean param1Boolean) {
      this.f = param1Boolean;
      return this;
    }
    
    public i a() {
      return new i(this, null);
    }
  }
  
  public static class c {
    private boolean a = false;
    
    private c() {}
    
    public boolean a() {
      return this.a;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/f/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */