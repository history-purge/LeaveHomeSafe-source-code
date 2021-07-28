package b.r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import b.g.m.v;

public class e extends x {
  private static final String[] O = new String[] { "android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix" };
  
  private static final Property<e, float[]> P = new a(float[].class, "nonTranslations");
  
  private static final Property<e, PointF> Q = new b(PointF.class, "translations");
  
  private static final boolean R;
  
  boolean L = true;
  
  private boolean M = true;
  
  private Matrix N = new Matrix();
  
  static {
    if (Build.VERSION.SDK_INT >= 21)
      bool = true; 
    R = bool;
  }
  
  private ObjectAnimator a(d0 paramd01, d0 paramd02, boolean paramBoolean) {
    Matrix matrix1 = (Matrix)paramd01.a.get("android:changeTransform:matrix");
    Matrix matrix3 = (Matrix)paramd02.a.get("android:changeTransform:matrix");
    Matrix matrix2 = matrix1;
    if (matrix1 == null)
      matrix2 = n.a; 
    matrix1 = matrix3;
    if (matrix3 == null)
      matrix1 = n.a; 
    if (matrix2.equals(matrix1))
      return null; 
    f f = (f)paramd02.a.get("android:changeTransform:transforms");
    View view = paramd02.b;
    f(view);
    float[] arrayOfFloat1 = new float[9];
    matrix2.getValues(arrayOfFloat1);
    float[] arrayOfFloat2 = new float[9];
    matrix1.getValues(arrayOfFloat2);
    e e1 = new e(view, arrayOfFloat1);
    PropertyValuesHolder propertyValuesHolder = PropertyValuesHolder.ofObject(P, new g(new float[9]), (Object[])new float[][] { arrayOfFloat1, arrayOfFloat2 });
    Path path = h().a(arrayOfFloat1[2], arrayOfFloat1[5], arrayOfFloat2[2], arrayOfFloat2[5]);
    ObjectAnimator objectAnimator = ObjectAnimator.ofPropertyValuesHolder(e1, new PropertyValuesHolder[] { propertyValuesHolder, r.a(Q, path) });
    c c = new c(this, paramBoolean, matrix1, view, f, e1);
    objectAnimator.addListener((Animator.AnimatorListener)c);
    a.a((Animator)objectAnimator, c);
    return objectAnimator;
  }
  
  static void a(View paramView, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8) {
    paramView.setTranslationX(paramFloat1);
    paramView.setTranslationY(paramFloat2);
    v.b(paramView, paramFloat3);
    paramView.setScaleX(paramFloat4);
    paramView.setScaleY(paramFloat5);
    paramView.setRotationX(paramFloat6);
    paramView.setRotationY(paramFloat7);
    paramView.setRotation(paramFloat8);
  }
  
  private boolean a(ViewGroup paramViewGroup1, ViewGroup paramViewGroup2) {
    if (!b((View)paramViewGroup1) || !b((View)paramViewGroup2))
      return (paramViewGroup1 == paramViewGroup2); 
    d0 d0 = a((View)paramViewGroup1, true);
    return (d0 != null && paramViewGroup2 == d0.b);
  }
  
  private void b(ViewGroup paramViewGroup, d0 paramd01, d0 paramd02) {
    View view = paramd02.b;
    Matrix matrix = new Matrix((Matrix)paramd02.a.get("android:changeTransform:parentMatrix"));
    o0.c((View)paramViewGroup, matrix);
    i i = m.a(view, paramViewGroup, matrix);
    if (i == null)
      return; 
    i.a((ViewGroup)paramd01.a.get("android:changeTransform:parent"), paramd01.b);
    e e1 = this;
    while (true) {
      b0 b01;
      b0 b02 = e1.t;
      if (b02 != null) {
        b01 = b02;
        continue;
      } 
      b01.a(new d(view, i));
      if (R) {
        View view1 = paramd01.b;
        if (view1 != paramd02.b)
          o0.a(view1, 0.0F); 
        o0.a(view, 1.0F);
      } 
      return;
    } 
  }
  
  private void b(d0 paramd01, d0 paramd02) {
    Matrix matrix2 = (Matrix)paramd02.a.get("android:changeTransform:parentMatrix");
    paramd02.b.setTag(s.parent_matrix, matrix2);
    Matrix matrix3 = this.N;
    matrix3.reset();
    matrix2.invert(matrix3);
    matrix2 = (Matrix)paramd01.a.get("android:changeTransform:matrix");
    Matrix matrix1 = matrix2;
    if (matrix2 == null) {
      matrix1 = new Matrix();
      paramd01.a.put("android:changeTransform:matrix", matrix1);
    } 
    matrix1.postConcat((Matrix)paramd01.a.get("android:changeTransform:parentMatrix"));
    matrix1.postConcat(matrix3);
  }
  
  private void d(d0 paramd0) {
    View view = paramd0.b;
    if (view.getVisibility() == 8)
      return; 
    paramd0.a.put("android:changeTransform:parent", view.getParent());
    f f = new f(view);
    paramd0.a.put("android:changeTransform:transforms", f);
    Matrix matrix = view.getMatrix();
    if (matrix == null || matrix.isIdentity()) {
      matrix = null;
    } else {
      matrix = new Matrix(matrix);
    } 
    paramd0.a.put("android:changeTransform:matrix", matrix);
    if (this.M) {
      matrix = new Matrix();
      ViewGroup viewGroup = (ViewGroup)view.getParent();
      o0.b((View)viewGroup, matrix);
      matrix.preTranslate(-viewGroup.getScrollX(), -viewGroup.getScrollY());
      paramd0.a.put("android:changeTransform:parentMatrix", matrix);
      paramd0.a.put("android:changeTransform:intermediateMatrix", view.getTag(s.transition_transform));
      paramd0.a.put("android:changeTransform:intermediateParentMatrix", view.getTag(s.parent_matrix));
    } 
  }
  
  static void f(View paramView) {
    a(paramView, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
  }
  
  public Animator a(ViewGroup paramViewGroup, d0 paramd01, d0 paramd02) {
    boolean bool;
    if (paramd01 == null || paramd02 == null || !paramd01.a.containsKey("android:changeTransform:parent") || !paramd02.a.containsKey("android:changeTransform:parent"))
      return null; 
    ViewGroup viewGroup1 = (ViewGroup)paramd01.a.get("android:changeTransform:parent");
    ViewGroup viewGroup2 = (ViewGroup)paramd02.a.get("android:changeTransform:parent");
    if (this.M && !a(viewGroup1, viewGroup2)) {
      bool = true;
    } else {
      bool = false;
    } 
    Matrix matrix = (Matrix)paramd01.a.get("android:changeTransform:intermediateMatrix");
    if (matrix != null)
      paramd01.a.put("android:changeTransform:matrix", matrix); 
    matrix = (Matrix)paramd01.a.get("android:changeTransform:intermediateParentMatrix");
    if (matrix != null)
      paramd01.a.put("android:changeTransform:parentMatrix", matrix); 
    if (bool)
      b(paramd01, paramd02); 
    ObjectAnimator objectAnimator = a(paramd01, paramd02, bool);
    if (bool && objectAnimator != null && this.L) {
      b(paramViewGroup, paramd01, paramd02);
      return (Animator)objectAnimator;
    } 
    if (!R)
      viewGroup1.endViewTransition(paramd01.b); 
    return (Animator)objectAnimator;
  }
  
  public void a(d0 paramd0) {
    d(paramd0);
  }
  
  public void c(d0 paramd0) {
    d(paramd0);
    if (!R)
      ((ViewGroup)paramd0.b.getParent()).startViewTransition(paramd0.b); 
  }
  
  public String[] o() {
    return O;
  }
  
  static {
    boolean bool = false;
  }
  
  static final class a extends Property<e, float[]> {
    a(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public void a(e.e param1e, float[] param1ArrayOffloat) {
      param1e.a(param1ArrayOffloat);
    }
    
    public float[] a(e.e param1e) {
      return null;
    }
  }
  
  static final class b extends Property<e, PointF> {
    b(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public PointF a(e.e param1e) {
      return null;
    }
    
    public void a(e.e param1e, PointF param1PointF) {
      param1e.a(param1PointF);
    }
  }
  
  class c extends AnimatorListenerAdapter {
    private boolean a;
    
    private Matrix b = new Matrix();
    
    c(e this$0, boolean param1Boolean, Matrix param1Matrix, View param1View, e.f param1f, e.e param1e) {}
    
    private void a(Matrix param1Matrix) {
      this.b.set(param1Matrix);
      this.e.setTag(s.transition_transform, this.b);
      this.f.a(this.e);
    }
    
    public void onAnimationCancel(Animator param1Animator) {
      this.a = true;
    }
    
    public void onAnimationEnd(Animator param1Animator) {
      if (!this.a)
        if (this.c && this.h.L) {
          a(this.d);
        } else {
          this.e.setTag(s.transition_transform, null);
          this.e.setTag(s.parent_matrix, null);
        }  
      o0.a(this.e, (Matrix)null);
      this.f.a(this.e);
    }
    
    public void onAnimationPause(Animator param1Animator) {
      a(this.g.a());
    }
    
    public void onAnimationResume(Animator param1Animator) {
      e.f(this.e);
    }
  }
  
  private static class d extends y {
    private View a;
    
    private i b;
    
    d(View param1View, i param1i) {
      this.a = param1View;
      this.b = param1i;
    }
    
    public void c(x param1x) {
      this.b.setVisibility(4);
    }
    
    public void d(x param1x) {
      this.b.setVisibility(0);
    }
    
    public void e(x param1x) {
      param1x.b(this);
      m.a(this.a);
      this.a.setTag(s.transition_transform, null);
      this.a.setTag(s.parent_matrix, null);
    }
  }
  
  private static class e {
    private final Matrix a = new Matrix();
    
    private final View b;
    
    private final float[] c;
    
    private float d;
    
    private float e;
    
    e(View param1View, float[] param1ArrayOffloat) {
      this.b = param1View;
      this.c = (float[])param1ArrayOffloat.clone();
      float[] arrayOfFloat = this.c;
      this.d = arrayOfFloat[2];
      this.e = arrayOfFloat[5];
      b();
    }
    
    private void b() {
      float[] arrayOfFloat = this.c;
      arrayOfFloat[2] = this.d;
      arrayOfFloat[5] = this.e;
      this.a.setValues(arrayOfFloat);
      o0.a(this.b, this.a);
    }
    
    Matrix a() {
      return this.a;
    }
    
    void a(PointF param1PointF) {
      this.d = param1PointF.x;
      this.e = param1PointF.y;
      b();
    }
    
    void a(float[] param1ArrayOffloat) {
      System.arraycopy(param1ArrayOffloat, 0, this.c, 0, param1ArrayOffloat.length);
      b();
    }
  }
  
  private static class f {
    final float a;
    
    final float b;
    
    final float c;
    
    final float d;
    
    final float e;
    
    final float f;
    
    final float g;
    
    final float h;
    
    f(View param1View) {
      this.a = param1View.getTranslationX();
      this.b = param1View.getTranslationY();
      this.c = v.y(param1View);
      this.d = param1View.getScaleX();
      this.e = param1View.getScaleY();
      this.f = param1View.getRotationX();
      this.g = param1View.getRotationY();
      this.h = param1View.getRotation();
    }
    
    public void a(View param1View) {
      e.a(param1View, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
    
    public boolean equals(Object param1Object) {
      boolean bool = param1Object instanceof f;
      boolean bool1 = false;
      if (!bool)
        return false; 
      param1Object = param1Object;
      bool = bool1;
      if (((f)param1Object).a == this.a) {
        bool = bool1;
        if (((f)param1Object).b == this.b) {
          bool = bool1;
          if (((f)param1Object).c == this.c) {
            bool = bool1;
            if (((f)param1Object).d == this.d) {
              bool = bool1;
              if (((f)param1Object).e == this.e) {
                bool = bool1;
                if (((f)param1Object).f == this.f) {
                  bool = bool1;
                  if (((f)param1Object).g == this.g) {
                    bool = bool1;
                    if (((f)param1Object).h == this.h)
                      bool = true; 
                  } 
                } 
              } 
            } 
          } 
        } 
      } 
      return bool;
    }
    
    public int hashCode() {
      byte b1;
      byte b2;
      byte b3;
      byte b4;
      byte b5;
      byte b6;
      byte b7;
      float f1 = this.a;
      int i = 0;
      if (f1 != 0.0F) {
        b1 = Float.floatToIntBits(f1);
      } else {
        b1 = 0;
      } 
      f1 = this.b;
      if (f1 != 0.0F) {
        b2 = Float.floatToIntBits(f1);
      } else {
        b2 = 0;
      } 
      f1 = this.c;
      if (f1 != 0.0F) {
        b3 = Float.floatToIntBits(f1);
      } else {
        b3 = 0;
      } 
      f1 = this.d;
      if (f1 != 0.0F) {
        b4 = Float.floatToIntBits(f1);
      } else {
        b4 = 0;
      } 
      f1 = this.e;
      if (f1 != 0.0F) {
        b5 = Float.floatToIntBits(f1);
      } else {
        b5 = 0;
      } 
      f1 = this.f;
      if (f1 != 0.0F) {
        b6 = Float.floatToIntBits(f1);
      } else {
        b6 = 0;
      } 
      f1 = this.g;
      if (f1 != 0.0F) {
        b7 = Float.floatToIntBits(f1);
      } else {
        b7 = 0;
      } 
      f1 = this.h;
      if (f1 != 0.0F)
        i = Float.floatToIntBits(f1); 
      return ((((((b1 * 31 + b2) * 31 + b3) * 31 + b4) * 31 + b5) * 31 + b6) * 31 + b7) * 31 + i;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */