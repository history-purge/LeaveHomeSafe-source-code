package e.h.a;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class d {
  private static final PointF o = new PointF();
  
  private static final float[] p = new float[2];
  
  private static final Matrix q = new Matrix();
  
  private static final float[] r = new float[2];
  
  private static final Comparator<b> s = new a();
  
  private final ViewGroup a;
  
  private final e b;
  
  private final p c;
  
  private final b[] d = new b[20];
  
  private final b[] e = new b[20];
  
  private final b[] f = new b[20];
  
  private final b[] g = new b[20];
  
  private int h = 0;
  
  private int i = 0;
  
  private boolean j = false;
  
  private int k = 0;
  
  private boolean l = false;
  
  private int m = 0;
  
  private float n = 0.0F;
  
  public d(ViewGroup paramViewGroup, e parame, p paramp) {
    this.a = paramViewGroup;
    this.b = parame;
    this.c = paramp;
  }
  
  private void a() {
    int i;
    for (i = this.i - 1; i >= 0; i--)
      this.e[i].c(); 
    int j = this.h;
    for (i = 0; i < j; i++)
      this.f[i] = this.d[i]; 
    for (i = j - 1; i >= 0; i--)
      this.f[i].c(); 
  }
  
  private static void a(float paramFloat1, float paramFloat2, ViewGroup paramViewGroup, View paramView, PointF paramPointF) {
    float f1 = paramFloat1 + paramViewGroup.getScrollX() - paramView.getLeft();
    float f2 = paramFloat2 + paramViewGroup.getScrollY() - paramView.getTop();
    Matrix matrix = paramView.getMatrix();
    paramFloat2 = f1;
    paramFloat1 = f2;
    if (!matrix.isIdentity()) {
      float[] arrayOfFloat = p;
      arrayOfFloat[0] = f1;
      arrayOfFloat[1] = f2;
      Matrix matrix1 = q;
      matrix.invert(matrix1);
      matrix1.mapPoints(arrayOfFloat);
      paramFloat2 = arrayOfFloat[0];
      paramFloat1 = arrayOfFloat[1];
    } 
    paramPointF.set(paramFloat2, paramFloat1);
  }
  
  private void a(View paramView, MotionEvent paramMotionEvent, float[] paramArrayOffloat) {
    if (paramView == this.a) {
      paramArrayOffloat[0] = paramMotionEvent.getX();
      paramArrayOffloat[1] = paramMotionEvent.getY();
      return;
    } 
    if (paramView != null && paramView.getParent() instanceof ViewGroup) {
      ViewGroup viewGroup = (ViewGroup)paramView.getParent();
      a((View)viewGroup, paramMotionEvent, paramArrayOffloat);
      PointF pointF = o;
      a(paramArrayOffloat[0], paramArrayOffloat[1], viewGroup, paramView, pointF);
      paramArrayOffloat[0] = pointF.x;
      paramArrayOffloat[1] = pointF.y;
      return;
    } 
    throw new IllegalArgumentException("Parent is null? View is no longer in the tree");
  }
  
  private void a(b paramb) {
    int i = 0;
    while (true) {
      int j = this.i;
      if (i < j) {
        if (this.e[i] == paramb)
          return; 
        i++;
        continue;
      } 
      b[] arrayOfB = this.e;
      if (j < arrayOfB.length) {
        this.i = j + 1;
        arrayOfB[j] = paramb;
        paramb.w = true;
        i = this.m;
        this.m = i + 1;
        paramb.u = i;
        return;
      } 
      IllegalStateException illegalStateException = new IllegalStateException("Too many recognizers");
      throw illegalStateException;
    } 
  }
  
  private void a(b paramb, MotionEvent paramMotionEvent) {
    if (!c(paramb.n())) {
      paramb.c();
      return;
    } 
    if (!paramb.t())
      return; 
    int i = paramMotionEvent.getActionMasked();
    if (paramb.w && i == 2)
      return; 
    float[] arrayOfFloat = r;
    a(paramb.n(), paramMotionEvent, arrayOfFloat);
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    paramMotionEvent.setLocation(arrayOfFloat[0], arrayOfFloat[1]);
    paramb.b(paramMotionEvent);
    if (paramb.v)
      paramb.a(paramMotionEvent); 
    paramMotionEvent.setLocation(f1, f2);
    if (i == 1 || i == 6)
      paramb.c(paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex())); 
  }
  
  private void a(b paramb, View paramView) {
    int i = 0;
    while (true) {
      int j = this.h;
      if (i < j) {
        if (this.d[i] == paramb)
          return; 
        i++;
        continue;
      } 
      b[] arrayOfB = this.d;
      if (j < arrayOfB.length) {
        this.h = j + 1;
        arrayOfB[j] = paramb;
        paramb.v = false;
        paramb.w = false;
        paramb.u = Integer.MAX_VALUE;
        paramb.a(paramView, this);
        return;
      } 
      IllegalStateException illegalStateException = new IllegalStateException("Too many recognizers");
      throw illegalStateException;
    } 
  }
  
  private static boolean a(float paramFloat1, float paramFloat2, View paramView) {
    return (paramFloat1 >= 0.0F && paramFloat1 <= paramView.getWidth() && paramFloat2 >= 0.0F && paramFloat2 < paramView.getHeight());
  }
  
  private static boolean a(int paramInt) {
    boolean bool2 = true;
    boolean bool1 = bool2;
    if (paramInt != 3) {
      bool1 = bool2;
      if (paramInt != 1) {
        if (paramInt == 5)
          return true; 
        bool1 = false;
      } 
    } 
    return bool1;
  }
  
  private boolean a(View paramView) {
    return (paramView.getVisibility() == 0 && paramView.getAlpha() >= this.n);
  }
  
  private static boolean a(View paramView, float[] paramArrayOffloat) {
    boolean bool1;
    boolean bool = paramView instanceof ViewGroup;
    boolean bool2 = false;
    if (!bool || paramView.getBackground() != null) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    bool = bool2;
    if (bool1) {
      bool = bool2;
      if (a(paramArrayOffloat[0], paramArrayOffloat[1], paramView))
        bool = true; 
    } 
    return bool;
  }
  
  private boolean a(View paramView, float[] paramArrayOffloat, int paramInt) {
    ArrayList<b> arrayList = this.b.a(paramView);
    boolean bool = false;
    if (arrayList != null) {
      int j = arrayList.size();
      int i = 0;
      for (bool = false; i < j; bool = bool1) {
        b b1 = arrayList.get(i);
        boolean bool1 = bool;
        if (b1.o()) {
          bool1 = bool;
          if (b1.a(paramView, paramArrayOffloat[0], paramArrayOffloat[1])) {
            a(b1, paramView);
            b1.b(paramInt);
            bool1 = true;
          } 
        } 
        i++;
      } 
    } 
    return bool;
  }
  
  private boolean a(ViewGroup paramViewGroup, float[] paramArrayOffloat, int paramInt) {
    int i;
    for (i = paramViewGroup.getChildCount() - 1; i >= 0; i--) {
      View view = this.c.a(paramViewGroup, i);
      if (a(view)) {
        boolean bool;
        PointF pointF = o;
        a(paramArrayOffloat[0], paramArrayOffloat[1], paramViewGroup, view, pointF);
        float f1 = paramArrayOffloat[0];
        float f2 = paramArrayOffloat[1];
        paramArrayOffloat[0] = pointF.x;
        paramArrayOffloat[1] = pointF.y;
        if (!b(view) || a(paramArrayOffloat[0], paramArrayOffloat[1], view)) {
          bool = b(view, paramArrayOffloat, paramInt);
        } else {
          bool = false;
        } 
        paramArrayOffloat[0] = f1;
        paramArrayOffloat[1] = f2;
        if (bool)
          return true; 
      } 
    } 
    return false;
  }
  
  private static boolean a(b paramb1, b paramb2) {
    return (paramb1 == paramb2 || paramb1.c(paramb2) || paramb2.c(paramb1));
  }
  
  private void b() {
    int i = 0;
    int j;
    for (j = 0; i < this.i; j = k) {
      b[] arrayOfB = this.e;
      int k = j;
      if ((arrayOfB[i]).w) {
        arrayOfB[j] = arrayOfB[i];
        k = j + 1;
      } 
      i++;
    } 
    this.i = j;
  }
  
  private boolean b(View paramView) {
    return (!(paramView instanceof ViewGroup) || this.c.a((ViewGroup)paramView));
  }
  
  private boolean b(View paramView, float[] paramArrayOffloat, int paramInt) {
    l l1 = this.c.a(paramView);
    l l2 = l.c;
    boolean bool = false;
    null = false;
    if (l1 == l2)
      return false; 
    if (l1 == l.e) {
      if (a(paramView, paramArrayOffloat, paramInt) || a(paramView, paramArrayOffloat))
        null = true; 
      return null;
    } 
    if (l1 == l.d)
      return (paramView instanceof ViewGroup) ? a((ViewGroup)paramView, paramArrayOffloat, paramInt) : false; 
    if (l1 == l.f) {
      if (paramView instanceof ViewGroup) {
        null = a((ViewGroup)paramView, paramArrayOffloat, paramInt);
      } else {
        null = false;
      } 
      if (!a(paramView, paramArrayOffloat, paramInt) && !null) {
        null = bool;
        return a(paramView, paramArrayOffloat) ? true : null;
      } 
    } else {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unknown pointer event type: ");
      stringBuilder.append(l1.toString());
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    return true;
  }
  
  private boolean b(b paramb) {
    for (int i = 0; i < this.h; i++) {
      b b1 = this.d[i];
      if (!a(b1.l()) && c(paramb, b1))
        return true; 
    } 
    return false;
  }
  
  private static boolean b(b paramb1, b paramb2) {
    return !paramb1.a(paramb2) ? false : (a(paramb1, paramb2) ? false : ((paramb1 != paramb2 && (paramb1.w || paramb1.l() == 4)) ? paramb1.b(paramb2) : true));
  }
  
  private void c() {
    int i = this.h - 1;
    int j;
    for (j = 0; i >= 0; j = k) {
      b b1 = this.d[i];
      int k = j;
      if (a(b1.l())) {
        k = j;
        if (!b1.w) {
          this.d[i] = null;
          b1.s();
          b1.v = false;
          b1.w = false;
          b1.u = Integer.MAX_VALUE;
          k = 1;
        } 
      } 
      i--;
    } 
    if (j) {
      i = 0;
      for (j = 0; i < this.h; j = k) {
        b[] arrayOfB = this.d;
        int k = j;
        if (arrayOfB[i] != null) {
          arrayOfB[j] = arrayOfB[i];
          k = j + 1;
        } 
        i++;
      } 
      this.h = j;
    } 
    this.l = false;
  }
  
  private void c(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getActionIndex();
    int j = paramMotionEvent.getPointerId(i);
    r[0] = paramMotionEvent.getX(i);
    r[1] = paramMotionEvent.getY(i);
    b((View)this.a, r, j);
    a(this.a, r, j);
  }
  
  private void c(b paramb) {
    int k = paramb.l();
    paramb.w = false;
    paramb.v = true;
    int i = this.m;
    this.m = i + 1;
    paramb.u = i;
    i = 0;
    int j;
    for (j = 0; i < this.h; j = m) {
      b b1 = this.d[i];
      int m = j;
      if (b(b1, paramb)) {
        this.g[j] = b1;
        m = j + 1;
      } 
      i++;
    } 
    for (i = j - 1; i >= 0; i--)
      this.g[i].c(); 
    for (i = this.i - 1; i >= 0; i--) {
      b b1 = this.e[i];
      if (b(b1, paramb)) {
        b1.c();
        b1.w = false;
      } 
    } 
    b();
    paramb.a(4, 2);
    if (k != 4) {
      paramb.a(5, 4);
      if (k != 5)
        paramb.a(0, 5); 
    } 
  }
  
  private boolean c(View paramView) {
    boolean bool = false;
    if (paramView == null)
      return false; 
    if (paramView == this.a)
      return true; 
    ViewParent viewParent;
    for (viewParent = paramView.getParent(); viewParent != null && viewParent != this.a; viewParent = viewParent.getParent());
    if (viewParent == this.a)
      bool = true; 
    return bool;
  }
  
  private static boolean c(b paramb1, b paramb2) {
    return (paramb1 != paramb2 && (paramb1.e(paramb2) || paramb2.d(paramb1)));
  }
  
  private void d() {
    if (this.j || this.k != 0) {
      this.l = true;
      return;
    } 
    c();
  }
  
  private void d(b paramb) {
    if (b(paramb)) {
      a(paramb);
      return;
    } 
    c(paramb);
    paramb.w = false;
  }
  
  public void a(float paramFloat) {
    this.n = paramFloat;
  }
  
  public void a(MotionEvent paramMotionEvent) {
    int j = this.h;
    b[] arrayOfB1 = this.d;
    b[] arrayOfB2 = this.f;
    int i = 0;
    System.arraycopy(arrayOfB1, 0, arrayOfB2, 0, j);
    Arrays.sort(this.f, 0, j, s);
    while (i < j) {
      a(this.f[i], paramMotionEvent);
      i++;
    } 
  }
  
  void a(b paramb, int paramInt1, int paramInt2) {
    this.k++;
    if (a(paramInt1)) {
      int i;
      for (i = 0; i < this.i; i++) {
        b b1 = this.e[i];
        if (c(b1, paramb))
          if (paramInt1 == 5) {
            b1.c();
            b1.w = false;
          } else {
            d(b1);
          }  
      } 
      b();
    } 
    if (paramInt1 == 4) {
      d(paramb);
    } else if ((paramInt2 != 4 && paramInt2 != 5) || paramb.v) {
      paramb.a(paramInt1, paramInt2);
    } 
    this.k--;
    d();
  }
  
  public boolean b(MotionEvent paramMotionEvent) {
    this.j = true;
    int i = paramMotionEvent.getActionMasked();
    if (i == 0 || i == 5) {
      c(paramMotionEvent);
    } else if (i == 3) {
      a();
    } 
    a(paramMotionEvent);
    this.j = false;
    if (this.l && this.k == 0)
      c(); 
    return true;
  }
  
  class a implements Comparator<b> {
    public int a(b param1b1, b param1b2) {
      return ((param1b1.v && param1b2.v) || (param1b1.w && param1b2.w)) ? Integer.signum(param1b2.u - param1b1.u) : (param1b1.v ? -1 : (param1b2.v ? 1 : (param1b1.w ? -1 : (param1b2.w ? 1 : 0))));
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/h/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */