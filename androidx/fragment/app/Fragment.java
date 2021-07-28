package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.c;
import androidx.core.app.n;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.j;
import androidx.lifecycle.k;
import androidx.lifecycle.o;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, j, x, f, c, c {
  static final Object a0 = new Object();
  
  String A;
  
  boolean B;
  
  boolean C;
  
  boolean D;
  
  boolean E;
  
  boolean F;
  
  boolean G = true;
  
  private boolean H;
  
  ViewGroup I;
  
  View J;
  
  boolean K;
  
  boolean L = true;
  
  e M;
  
  boolean N;
  
  boolean O;
  
  float P;
  
  LayoutInflater Q;
  
  boolean R;
  
  androidx.lifecycle.g.c S;
  
  k T;
  
  b0 U;
  
  o<j> V;
  
  private v.b W;
  
  androidx.savedstate.b X;
  
  private int Y;
  
  private final ArrayList<g> Z;
  
  int c = -1;
  
  Bundle d;
  
  SparseArray<Parcelable> e;
  
  Bundle f;
  
  Boolean g;
  
  String h = UUID.randomUUID().toString();
  
  Bundle i;
  
  Fragment j;
  
  String k = null;
  
  int l;
  
  private Boolean m = null;
  
  boolean n;
  
  boolean o;
  
  boolean p;
  
  boolean q;
  
  boolean r;
  
  boolean s;
  
  int t;
  
  n u;
  
  k<?> v;
  
  n w = new o();
  
  Fragment x;
  
  int y;
  
  int z;
  
  public Fragment() {
    new a(this);
    this.S = androidx.lifecycle.g.c.g;
    this.V = new o();
    new AtomicInteger();
    this.Z = new ArrayList<g>();
    y0();
  }
  
  @Deprecated
  public static Fragment a(Context paramContext, String paramString, Bundle paramBundle) {
    try {
      Fragment fragment = j.d(paramContext.getClassLoader(), paramString).getConstructor(new Class[0]).newInstance(new Object[0]);
      if (paramBundle != null) {
        paramBundle.setClassLoader(fragment.getClass().getClassLoader());
        fragment.m(paramBundle);
      } 
      return fragment;
    } catch (InstantiationException instantiationException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to instantiate fragment ");
      stringBuilder.append(paramString);
      stringBuilder.append(": make sure class name exists, is public, and has an empty constructor that is public");
      throw new f(stringBuilder.toString(), instantiationException);
    } catch (IllegalAccessException illegalAccessException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to instantiate fragment ");
      stringBuilder.append(paramString);
      stringBuilder.append(": make sure class name exists, is public, and has an empty constructor that is public");
      throw new f(stringBuilder.toString(), illegalAccessException);
    } catch (NoSuchMethodException noSuchMethodException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to instantiate fragment ");
      stringBuilder.append(paramString);
      stringBuilder.append(": could not find Fragment constructor");
      throw new f(stringBuilder.toString(), noSuchMethodException);
    } catch (InvocationTargetException invocationTargetException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to instantiate fragment ");
      stringBuilder.append(paramString);
      stringBuilder.append(": calling Fragment constructor caused an exception");
      throw new f(stringBuilder.toString(), invocationTargetException);
    } 
  }
  
  private e w0() {
    if (this.M == null)
      this.M = new e(); 
    return this.M;
  }
  
  private int x0() {
    androidx.lifecycle.g.c c1 = this.S;
    return (c1 == androidx.lifecycle.g.c.d || this.x == null) ? this.S.ordinal() : Math.min(c1.ordinal(), this.x.x0());
  }
  
  private void y0() {
    this.T = new k(this);
    this.X = androidx.savedstate.b.a(this);
    this.W = null;
  }
  
  private void z0() {
    if (n.d(3)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("moveto RESTORE_VIEW_STATE: ");
      stringBuilder.append(this);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    if (this.J != null)
      l(this.d); 
    this.d = null;
  }
  
  boolean A() {
    e e1 = this.M;
    return (e1 == null) ? false : e1.c;
  }
  
  int B() {
    e e1 = this.M;
    return (e1 == null) ? 0 : e1.f;
  }
  
  int C() {
    e e1 = this.M;
    return (e1 == null) ? 0 : e1.g;
  }
  
  float D() {
    e e1 = this.M;
    return (e1 == null) ? 1.0F : e1.u;
  }
  
  public Object E() {
    e e1 = this.M;
    if (e1 == null)
      return null; 
    Object object2 = e1.n;
    Object object1 = object2;
    if (object2 == a0)
      object1 = t(); 
    return object1;
  }
  
  public final Resources F() {
    return t0().getResources();
  }
  
  public Object G() {
    e e1 = this.M;
    if (e1 == null)
      return null; 
    Object object2 = e1.l;
    Object object1 = object2;
    if (object2 == a0)
      object1 = q(); 
    return object1;
  }
  
  public Object H() {
    e e1 = this.M;
    return (e1 == null) ? null : e1.o;
  }
  
  public Object I() {
    e e1 = this.M;
    if (e1 == null)
      return null; 
    Object object2 = e1.p;
    Object object1 = object2;
    if (object2 == a0)
      object1 = H(); 
    return object1;
  }
  
  ArrayList<String> J() {
    e e1 = this.M;
    if (e1 != null) {
      ArrayList<String> arrayList = e1.i;
      if (arrayList != null)
        return arrayList; 
    } 
    return new ArrayList<String>();
  }
  
  ArrayList<String> K() {
    e e1 = this.M;
    if (e1 != null) {
      ArrayList<String> arrayList = e1.j;
      if (arrayList != null)
        return arrayList; 
    } 
    return new ArrayList<String>();
  }
  
  @Deprecated
  public final Fragment L() {
    Fragment fragment = this.j;
    if (fragment != null)
      return fragment; 
    n n1 = this.u;
    if (n1 != null) {
      String str = this.k;
      if (str != null)
        return n1.b(str); 
    } 
    return null;
  }
  
  public View M() {
    return this.J;
  }
  
  public LiveData<j> N() {
    return (LiveData<j>)this.V;
  }
  
  void O() {
    y0();
    this.h = UUID.randomUUID().toString();
    this.n = false;
    this.o = false;
    this.p = false;
    this.q = false;
    this.r = false;
    this.t = 0;
    this.u = null;
    this.w = new o();
    this.v = null;
    this.y = 0;
    this.z = 0;
    this.A = null;
    this.B = false;
    this.C = false;
  }
  
  public final boolean P() {
    return (this.v != null && this.n);
  }
  
  boolean Q() {
    e e1 = this.M;
    return (e1 == null) ? false : e1.y;
  }
  
  final boolean R() {
    return (this.t > 0);
  }
  
  public final boolean S() {
    if (this.G) {
      n n1 = this.u;
      if (n1 == null || n1.i(this.x))
        return true; 
    } 
    return false;
  }
  
  boolean T() {
    e e1 = this.M;
    return (e1 == null) ? false : e1.w;
  }
  
  public final boolean U() {
    return this.o;
  }
  
  final boolean V() {
    Fragment fragment = y();
    return (fragment != null && (fragment.U() || fragment.V()));
  }
  
  public final boolean W() {
    return (this.c >= 7);
  }
  
  public final boolean X() {
    n n1 = this.u;
    return (n1 == null) ? false : n1.D();
  }
  
  void Y() {
    this.w.E();
  }
  
  public void Z() {
    this.H = true;
  }
  
  @Deprecated
  public LayoutInflater a(Bundle paramBundle) {
    k<?> k1 = this.v;
    if (k1 != null) {
      LayoutInflater layoutInflater = k1.j();
      b.g.m.f.b(layoutInflater, this.w.w());
      return layoutInflater;
    } 
    throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    int i = this.Y;
    return (i != 0) ? paramLayoutInflater.inflate(i, paramViewGroup, false) : null;
  }
  
  public Animation a(int paramInt1, boolean paramBoolean, int paramInt2) {
    return null;
  }
  
  Fragment a(String paramString) {
    return paramString.equals(this.h) ? this : this.w.d(paramString);
  }
  
  public androidx.lifecycle.g a() {
    return (androidx.lifecycle.g)this.T;
  }
  
  public final String a(int paramInt) {
    return F().getString(paramInt);
  }
  
  void a(float paramFloat) {
    (w0()).u = paramFloat;
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.M == null && paramInt1 == 0 && paramInt2 == 0 && paramInt3 == 0 && paramInt4 == 0)
      return; 
    (w0()).d = paramInt1;
    (w0()).e = paramInt2;
    (w0()).f = paramInt3;
    (w0()).g = paramInt4;
  }
  
  @Deprecated
  public void a(int paramInt1, int paramInt2, Intent paramIntent) {
    if (n.d(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Fragment ");
      stringBuilder.append(this);
      stringBuilder.append(" received the following in onActivityResult(): requestCode: ");
      stringBuilder.append(paramInt1);
      stringBuilder.append(" resultCode: ");
      stringBuilder.append(paramInt2);
      stringBuilder.append(" data: ");
      stringBuilder.append(paramIntent);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
  }
  
  @Deprecated
  public void a(int paramInt, String[] paramArrayOfString, int[] paramArrayOfint) {}
  
  void a(Animator paramAnimator) {
    (w0()).b = paramAnimator;
  }
  
  @Deprecated
  public void a(Activity paramActivity) {
    this.H = true;
  }
  
  @Deprecated
  public void a(Activity paramActivity, AttributeSet paramAttributeSet, Bundle paramBundle) {
    this.H = true;
  }
  
  public void a(Context paramContext) {
    Activity activity;
    this.H = true;
    k<?> k1 = this.v;
    if (k1 == null) {
      k1 = null;
    } else {
      activity = k1.e();
    } 
    if (activity != null) {
      this.H = false;
      a(activity);
    } 
  }
  
  public void a(Context paramContext, AttributeSet paramAttributeSet, Bundle paramBundle) {
    Activity activity;
    this.H = true;
    k<?> k1 = this.v;
    if (k1 == null) {
      k1 = null;
    } else {
      activity = k1.e();
    } 
    if (activity != null) {
      this.H = false;
      a(activity, paramAttributeSet, paramBundle);
    } 
  }
  
  @Deprecated
  public void a(@SuppressLint({"UnknownNullness"}) Intent paramIntent, int paramInt, Bundle paramBundle) {
    if (this.v != null) {
      z().a(this, paramIntent, paramInt, paramBundle);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" not attached to Activity");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  void a(Configuration paramConfiguration) {
    onConfigurationChanged(paramConfiguration);
    this.w.a(paramConfiguration);
  }
  
  public void a(Menu paramMenu) {}
  
  public void a(Menu paramMenu, MenuInflater paramMenuInflater) {}
  
  void a(View paramView) {
    (w0()).a = paramView;
  }
  
  public void a(View paramView, Bundle paramBundle) {}
  
  void a(h paramh) {
    w0();
    h h1 = this.M.x;
    if (paramh == h1)
      return; 
    if (paramh == null || h1 == null) {
      e e1 = this.M;
      if (e1.w)
        e1.x = paramh; 
      if (paramh != null)
        paramh.b(); 
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Trying to set a replacement startPostponedEnterTransition on ");
    stringBuilder.append(this);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  @Deprecated
  public void a(Fragment paramFragment) {}
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mFragmentId=#");
    paramPrintWriter.print(Integer.toHexString(this.y));
    paramPrintWriter.print(" mContainerId=#");
    paramPrintWriter.print(Integer.toHexString(this.z));
    paramPrintWriter.print(" mTag=");
    paramPrintWriter.println(this.A);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mState=");
    paramPrintWriter.print(this.c);
    paramPrintWriter.print(" mWho=");
    paramPrintWriter.print(this.h);
    paramPrintWriter.print(" mBackStackNesting=");
    paramPrintWriter.println(this.t);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mAdded=");
    paramPrintWriter.print(this.n);
    paramPrintWriter.print(" mRemoving=");
    paramPrintWriter.print(this.o);
    paramPrintWriter.print(" mFromLayout=");
    paramPrintWriter.print(this.p);
    paramPrintWriter.print(" mInLayout=");
    paramPrintWriter.println(this.q);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mHidden=");
    paramPrintWriter.print(this.B);
    paramPrintWriter.print(" mDetached=");
    paramPrintWriter.print(this.C);
    paramPrintWriter.print(" mMenuVisible=");
    paramPrintWriter.print(this.G);
    paramPrintWriter.print(" mHasMenu=");
    paramPrintWriter.println(this.F);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mRetainInstance=");
    paramPrintWriter.print(this.D);
    paramPrintWriter.print(" mUserVisibleHint=");
    paramPrintWriter.println(this.L);
    if (this.u != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mFragmentManager=");
      paramPrintWriter.println(this.u);
    } 
    if (this.v != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mHost=");
      paramPrintWriter.println(this.v);
    } 
    if (this.x != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mParentFragment=");
      paramPrintWriter.println(this.x);
    } 
    if (this.i != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mArguments=");
      paramPrintWriter.println(this.i);
    } 
    if (this.d != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedFragmentState=");
      paramPrintWriter.println(this.d);
    } 
    if (this.e != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedViewState=");
      paramPrintWriter.println(this.e);
    } 
    if (this.f != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedViewRegistryState=");
      paramPrintWriter.println(this.f);
    } 
    Fragment fragment = L();
    if (fragment != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTarget=");
      paramPrintWriter.print(fragment);
      paramPrintWriter.print(" mTargetRequestCode=");
      paramPrintWriter.println(this.l);
    } 
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mPopDirection=");
    paramPrintWriter.println(A());
    if (p() != 0) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("getEnterAnim=");
      paramPrintWriter.println(p());
    } 
    if (s() != 0) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("getExitAnim=");
      paramPrintWriter.println(s());
    } 
    if (B() != 0) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("getPopEnterAnim=");
      paramPrintWriter.println(B());
    } 
    if (C() != 0) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("getPopExitAnim=");
      paramPrintWriter.println(C());
    } 
    if (this.I != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mContainer=");
      paramPrintWriter.println(this.I);
    } 
    if (this.J != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mView=");
      paramPrintWriter.println(this.J);
    } 
    if (k() != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAnimatingAway=");
      paramPrintWriter.println(k());
    } 
    if (o() != null)
      b.n.a.a.a(this).a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString); 
    paramPrintWriter.print(paramString);
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append("Child ");
    stringBuilder1.append(this.w);
    stringBuilder1.append(":");
    paramPrintWriter.println(stringBuilder1.toString());
    n n1 = this.w;
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(paramString);
    stringBuilder2.append("  ");
    n1.a(stringBuilder2.toString(), paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  void a(ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2) {
    w0();
    e e1 = this.M;
    e1.i = paramArrayList1;
    e1.j = paramArrayList2;
  }
  
  void a(boolean paramBoolean) {
    e e1 = this.M;
    h h = null;
    if (e1 != null) {
      e1.w = false;
      h = e1.x;
      e1.x = null;
    } 
    if (h != null) {
      h.a();
      return;
    } 
    if (n.P && this.J != null) {
      ViewGroup viewGroup = this.I;
      if (viewGroup != null) {
        n n1 = this.u;
        if (n1 != null) {
          d0 d0 = d0.a(viewGroup, n1);
          d0.e();
          if (paramBoolean) {
            this.v.h().post(new c(this, d0));
            return;
          } 
          d0.a();
        } 
      } 
    } 
  }
  
  public boolean a(MenuItem paramMenuItem) {
    return false;
  }
  
  public void a0() {}
  
  public Animator b(int paramInt1, boolean paramBoolean, int paramInt2) {
    return null;
  }
  
  void b(int paramInt) {
    if (this.M == null && paramInt == 0)
      return; 
    w0();
    this.M.h = paramInt;
  }
  
  @Deprecated
  public void b(Bundle paramBundle) {
    this.H = true;
  }
  
  void b(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    this.w.E();
    this.s = true;
    this.U = new b0();
    this.J = a(paramLayoutInflater, paramViewGroup, paramBundle);
    if (this.J != null) {
      this.U.b();
      y.a(this.J, (j)this.U);
      z.a(this.J, this);
      androidx.savedstate.d.a(this.J, this.U);
      this.V.b(this.U);
      return;
    } 
    if (!this.U.d()) {
      this.U = null;
      return;
    } 
    throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
  }
  
  public void b(Menu paramMenu) {}
  
  void b(View paramView) {
    (w0()).v = paramView;
  }
  
  public void b(boolean paramBoolean) {}
  
  boolean b(Menu paramMenu, MenuInflater paramMenuInflater) {
    boolean bool3 = this.B;
    boolean bool2 = false;
    boolean bool1 = false;
    if (!bool3) {
      boolean bool = bool1;
      if (this.F) {
        bool = bool1;
        if (this.G) {
          bool = true;
          a(paramMenu, paramMenuInflater);
        } 
      } 
      bool2 = bool | this.w.a(paramMenu, paramMenuInflater);
    } 
    return bool2;
  }
  
  public boolean b(MenuItem paramMenuItem) {
    return false;
  }
  
  public void b0() {
    this.H = true;
  }
  
  public final SavedStateRegistry c() {
    return this.X.a();
  }
  
  public void c(Bundle paramBundle) {
    this.H = true;
    k(paramBundle);
    if (!this.w.b(1))
      this.w.f(); 
  }
  
  void c(Menu paramMenu) {
    if (!this.B) {
      if (this.F && this.G)
        a(paramMenu); 
      this.w.a(paramMenu);
    } 
  }
  
  public void c(boolean paramBoolean) {}
  
  boolean c(MenuItem paramMenuItem) {
    return !this.B ? (a(paramMenuItem) ? true : this.w.a(paramMenuItem)) : false;
  }
  
  public void c0() {
    this.H = true;
  }
  
  public LayoutInflater d(Bundle paramBundle) {
    return a(paramBundle);
  }
  
  public w d() {
    if (this.u != null) {
      if (x0() != androidx.lifecycle.g.c.d.ordinal())
        return this.u.f(this); 
      throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    } 
    throw new IllegalStateException("Can't access ViewModels from detached fragment");
  }
  
  public void d(boolean paramBoolean) {}
  
  boolean d(Menu paramMenu) {
    boolean bool3 = this.B;
    boolean bool2 = false;
    boolean bool1 = false;
    if (!bool3) {
      boolean bool = bool1;
      if (this.F) {
        bool = bool1;
        if (this.G) {
          bool = true;
          b(paramMenu);
        } 
      } 
      bool2 = bool | this.w.b(paramMenu);
    } 
    return bool2;
  }
  
  boolean d(MenuItem paramMenuItem) {
    return !this.B ? ((this.F && this.G && b(paramMenuItem)) ? true : this.w.b(paramMenuItem)) : false;
  }
  
  public void d0() {
    this.H = true;
  }
  
  public void e(Bundle paramBundle) {}
  
  public void e(boolean paramBoolean) {}
  
  public void e0() {
    this.H = true;
  }
  
  public final boolean equals(Object paramObject) {
    return super.equals(paramObject);
  }
  
  public v.b f() {
    if (this.u != null) {
      if (this.W == null) {
        Application application1;
        Application application2 = null;
        Context context = t0().getApplicationContext();
        while (true) {
          application1 = application2;
          if (context instanceof ContextWrapper) {
            if (context instanceof Application) {
              application1 = (Application)context;
              break;
            } 
            context = ((ContextWrapper)context).getBaseContext();
            continue;
          } 
          break;
        } 
        if (application1 == null && n.d(3)) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Could not find Application instance from Context ");
          stringBuilder.append(t0().getApplicationContext());
          stringBuilder.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
          Log.d("FragmentManager", stringBuilder.toString());
        } 
        this.W = (v.b)new t(application1, this, m());
      } 
      return this.W;
    } 
    IllegalStateException illegalStateException = new IllegalStateException("Can't access ViewModels from detached fragment");
    throw illegalStateException;
  }
  
  public void f(Bundle paramBundle) {
    this.H = true;
  }
  
  void f(boolean paramBoolean) {
    c(paramBoolean);
    this.w.a(paramBoolean);
  }
  
  public void f0() {
    this.H = true;
  }
  
  g g() {
    return new d(this);
  }
  
  void g(Bundle paramBundle) {
    this.w.E();
    this.c = 3;
    this.H = false;
    b(paramBundle);
    if (this.H) {
      z0();
      this.w.d();
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" did not call through to super.onActivityCreated()");
    throw new f0(stringBuilder.toString());
  }
  
  void g(boolean paramBoolean) {
    d(paramBoolean);
    this.w.b(paramBoolean);
  }
  
  public void g0() {
    this.H = true;
  }
  
  public final e h() {
    k<?> k1 = this.v;
    return (k1 == null) ? null : (e)k1.e();
  }
  
  void h(Bundle paramBundle) {
    this.w.E();
    this.c = 1;
    this.H = false;
    if (Build.VERSION.SDK_INT >= 19)
      this.T.a((i)new androidx.lifecycle.h(this) {
            public void a(j param1j, androidx.lifecycle.g.b param1b) {
              if (param1b == androidx.lifecycle.g.b.ON_STOP) {
                View view = this.c.J;
                if (view != null)
                  view.cancelPendingInputEvents(); 
              } 
            }
          }); 
    this.X.a(paramBundle);
    c(paramBundle);
    this.R = true;
    if (this.H) {
      this.T.a(androidx.lifecycle.g.b.ON_CREATE);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" did not call through to super.onCreate()");
    throw new f0(stringBuilder.toString());
  }
  
  void h(boolean paramBoolean) {
    (w0()).y = paramBoolean;
  }
  
  void h0() {
    Iterator<g> iterator = this.Z.iterator();
    while (iterator.hasNext())
      ((g)iterator.next()).a(); 
    this.Z.clear();
    this.w.a(this.v, g(), this);
    this.c = 0;
    this.H = false;
    a(this.v.f());
    if (this.H) {
      this.u.e(this);
      this.w.e();
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" did not call through to super.onAttach()");
    f0 f0 = new f0(stringBuilder.toString());
    throw f0;
  }
  
  public final int hashCode() {
    return super.hashCode();
  }
  
  LayoutInflater i(Bundle paramBundle) {
    this.Q = d(paramBundle);
    return this.Q;
  }
  
  void i(boolean paramBoolean) {
    if (this.M == null)
      return; 
    (w0()).c = paramBoolean;
  }
  
  public boolean i() {
    e e1 = this.M;
    if (e1 != null) {
      Boolean bool = e1.r;
      if (bool != null)
        return bool.booleanValue(); 
    } 
    return true;
  }
  
  void i0() {
    this.w.g();
    this.T.a(androidx.lifecycle.g.b.ON_DESTROY);
    this.c = 0;
    this.H = false;
    this.R = false;
    Z();
    if (this.H)
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" did not call through to super.onDestroy()");
    throw new f0(stringBuilder.toString());
  }
  
  void j(Bundle paramBundle) {
    e(paramBundle);
    this.X.b(paramBundle);
    Parcelable parcelable = this.w.G();
    if (parcelable != null)
      paramBundle.putParcelable("android:support:fragments", parcelable); 
  }
  
  public boolean j() {
    e e1 = this.M;
    if (e1 != null) {
      Boolean bool = e1.q;
      if (bool != null)
        return bool.booleanValue(); 
    } 
    return true;
  }
  
  void j0() {
    this.w.h();
    if (this.J != null && this.U.a().a().a(androidx.lifecycle.g.c.e))
      this.U.a(androidx.lifecycle.g.b.ON_DESTROY); 
    this.c = 1;
    this.H = false;
    b0();
    if (this.H) {
      b.n.a.a.a(this).a();
      this.s = false;
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" did not call through to super.onDestroyView()");
    throw new f0(stringBuilder.toString());
  }
  
  View k() {
    e e1 = this.M;
    return (e1 == null) ? null : e1.a;
  }
  
  void k(Bundle paramBundle) {
    if (paramBundle != null) {
      Parcelable parcelable = paramBundle.getParcelable("android:support:fragments");
      if (parcelable != null) {
        this.w.a(parcelable);
        this.w.f();
      } 
    } 
  }
  
  void k0() {
    this.c = -1;
    this.H = false;
    c0();
    this.Q = null;
    if (this.H) {
      if (!this.w.C()) {
        this.w.g();
        this.w = new o();
      } 
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" did not call through to super.onDetach()");
    throw new f0(stringBuilder.toString());
  }
  
  Animator l() {
    e e1 = this.M;
    return (e1 == null) ? null : e1.b;
  }
  
  final void l(Bundle paramBundle) {
    SparseArray<Parcelable> sparseArray = this.e;
    if (sparseArray != null) {
      this.J.restoreHierarchyState(sparseArray);
      this.e = null;
    } 
    if (this.J != null) {
      this.U.a(this.f);
      this.f = null;
    } 
    this.H = false;
    f(paramBundle);
    if (this.H) {
      if (this.J != null)
        this.U.a(androidx.lifecycle.g.b.ON_CREATE); 
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" did not call through to super.onViewStateRestored()");
    throw new f0(stringBuilder.toString());
  }
  
  void l0() {
    onLowMemory();
    this.w.i();
  }
  
  public final Bundle m() {
    return this.i;
  }
  
  public void m(Bundle paramBundle) {
    if (this.u == null || !X()) {
      this.i = paramBundle;
      return;
    } 
    throw new IllegalStateException("Fragment already added and state has been saved");
  }
  
  void m0() {
    this.w.j();
    if (this.J != null)
      this.U.a(androidx.lifecycle.g.b.ON_PAUSE); 
    this.T.a(androidx.lifecycle.g.b.ON_PAUSE);
    this.c = 6;
    this.H = false;
    d0();
    if (this.H)
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" did not call through to super.onPause()");
    throw new f0(stringBuilder.toString());
  }
  
  public final n n() {
    if (this.v != null)
      return this.w; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" has not been attached yet.");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  void n0() {
    boolean bool = this.u.j(this);
    Boolean bool1 = this.m;
    if (bool1 == null || bool1.booleanValue() != bool) {
      this.m = Boolean.valueOf(bool);
      e(bool);
      this.w.k();
    } 
  }
  
  public Context o() {
    k<?> k1 = this.v;
    return (k1 == null) ? null : k1.f();
  }
  
  void o0() {
    this.w.E();
    this.w.c(true);
    this.c = 7;
    this.H = false;
    e0();
    if (this.H) {
      this.T.a(androidx.lifecycle.g.b.ON_RESUME);
      if (this.J != null)
        this.U.a(androidx.lifecycle.g.b.ON_RESUME); 
      this.w.l();
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" did not call through to super.onResume()");
    throw new f0(stringBuilder.toString());
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {
    this.H = true;
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo) {
    s0().onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
  }
  
  public void onLowMemory() {
    this.H = true;
  }
  
  int p() {
    e e1 = this.M;
    return (e1 == null) ? 0 : e1.d;
  }
  
  void p0() {
    this.w.E();
    this.w.c(true);
    this.c = 5;
    this.H = false;
    f0();
    if (this.H) {
      this.T.a(androidx.lifecycle.g.b.ON_START);
      if (this.J != null)
        this.U.a(androidx.lifecycle.g.b.ON_START); 
      this.w.m();
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" did not call through to super.onStart()");
    throw new f0(stringBuilder.toString());
  }
  
  public Object q() {
    e e1 = this.M;
    return (e1 == null) ? null : e1.k;
  }
  
  void q0() {
    this.w.n();
    if (this.J != null)
      this.U.a(androidx.lifecycle.g.b.ON_STOP); 
    this.T.a(androidx.lifecycle.g.b.ON_STOP);
    this.c = 4;
    this.H = false;
    g0();
    if (this.H)
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" did not call through to super.onStop()");
    throw new f0(stringBuilder.toString());
  }
  
  n r() {
    e e1 = this.M;
    return (e1 == null) ? null : e1.s;
  }
  
  void r0() {
    a(this.J, this.d);
    this.w.o();
  }
  
  int s() {
    e e1 = this.M;
    return (e1 == null) ? 0 : e1.e;
  }
  
  public final e s0() {
    e e1 = h();
    if (e1 != null)
      return e1; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" not attached to an activity.");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  @Deprecated
  public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent paramIntent, int paramInt) {
    a(paramIntent, paramInt, (Bundle)null);
  }
  
  public Object t() {
    e e1 = this.M;
    return (e1 == null) ? null : e1.m;
  }
  
  public final Context t0() {
    Context context = o();
    if (context != null)
      return context; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" not attached to a context.");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(128);
    stringBuilder.append(getClass().getSimpleName());
    stringBuilder.append("{");
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append("}");
    stringBuilder.append(" (");
    stringBuilder.append(this.h);
    if (this.y != 0) {
      stringBuilder.append(" id=0x");
      stringBuilder.append(Integer.toHexString(this.y));
    } 
    if (this.A != null) {
      stringBuilder.append(" tag=");
      stringBuilder.append(this.A);
    } 
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  n u() {
    e e1 = this.M;
    return (e1 == null) ? null : e1.t;
  }
  
  public final View u0() {
    View view = M();
    if (view != null)
      return view; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" did not return a View from onCreateView() or this was called before onCreateView().");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  View v() {
    e e1 = this.M;
    return (e1 == null) ? null : e1.v;
  }
  
  public void v0() {
    if (this.M != null) {
      if (!(w0()).w)
        return; 
      if (this.v == null) {
        (w0()).w = false;
        return;
      } 
      if (Looper.myLooper() != this.v.h().getLooper()) {
        this.v.h().postAtFrontOfQueue(new b(this));
        return;
      } 
      a(true);
    } 
  }
  
  public final Object w() {
    k<?> k1 = this.v;
    return (k1 == null) ? null : k1.i();
  }
  
  int x() {
    e e1 = this.M;
    return (e1 == null) ? 0 : e1.h;
  }
  
  public final Fragment y() {
    return this.x;
  }
  
  public final n z() {
    n n1 = this.u;
    if (n1 != null)
      return n1; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" not associated with a fragment manager.");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  class a implements Runnable {
    a(Fragment this$0) {}
    
    public void run() {
      this.c.v0();
    }
  }
  
  class b implements Runnable {
    b(Fragment this$0) {}
    
    public void run() {
      this.c.a(false);
    }
  }
  
  class c implements Runnable {
    c(Fragment this$0, d0 param1d0) {}
    
    public void run() {
      this.c.a();
    }
  }
  
  class d extends g {
    d(Fragment this$0) {}
    
    public View a(int param1Int) {
      View view = this.a.J;
      if (view != null)
        return view.findViewById(param1Int); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Fragment ");
      stringBuilder.append(this.a);
      stringBuilder.append(" does not have a view");
      throw new IllegalStateException(stringBuilder.toString());
    }
    
    public boolean c() {
      return (this.a.J != null);
    }
  }
  
  static class e {
    View a;
    
    Animator b;
    
    boolean c;
    
    int d;
    
    int e;
    
    int f;
    
    int g;
    
    int h;
    
    ArrayList<String> i;
    
    ArrayList<String> j;
    
    Object k = null;
    
    Object l;
    
    Object m;
    
    Object n;
    
    Object o;
    
    Object p;
    
    Boolean q;
    
    Boolean r;
    
    n s;
    
    n t;
    
    float u;
    
    View v;
    
    boolean w;
    
    Fragment.h x;
    
    boolean y;
    
    e() {
      Object object = Fragment.a0;
      this.l = object;
      this.m = null;
      this.n = object;
      this.o = null;
      this.p = object;
      this.s = null;
      this.t = null;
      this.u = 1.0F;
      this.v = null;
    }
  }
  
  public static class f extends RuntimeException {
    public f(String param1String, Exception param1Exception) {
      super(param1String, param1Exception);
    }
  }
  
  private static abstract class g {
    abstract void a();
  }
  
  static interface h {
    void a();
    
    void b();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/fragment/app/Fragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */