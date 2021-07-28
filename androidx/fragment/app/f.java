package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import b.g.m.s;

class f {
  private static int a(int paramInt, boolean paramBoolean) {
    return (paramInt != 4097) ? ((paramInt != 4099) ? ((paramInt != 8194) ? -1 : (paramBoolean ? b.l.a.fragment_close_enter : b.l.a.fragment_close_exit)) : (paramBoolean ? b.l.a.fragment_fade_enter : b.l.a.fragment_fade_exit)) : (paramBoolean ? b.l.a.fragment_open_enter : b.l.a.fragment_open_exit);
  }
  
  private static int a(Fragment paramFragment, boolean paramBoolean1, boolean paramBoolean2) {
    return paramBoolean2 ? (paramBoolean1 ? paramFragment.B() : paramFragment.C()) : (paramBoolean1 ? paramFragment.p() : paramFragment.s());
  }
  
  static d a(Context paramContext, Fragment paramFragment, boolean paramBoolean1, boolean paramBoolean2) {
    int k = paramFragment.x();
    int j = a(paramFragment, paramBoolean1, paramBoolean2);
    boolean bool = false;
    paramFragment.a(0, 0, 0, 0);
    ViewGroup viewGroup = paramFragment.I;
    if (viewGroup != null && viewGroup.getTag(b.l.b.visible_removing_fragment_view_tag) != null)
      paramFragment.I.setTag(b.l.b.visible_removing_fragment_view_tag, null); 
    viewGroup = paramFragment.I;
    if (viewGroup != null && viewGroup.getLayoutTransition() != null)
      return null; 
    Animation animation = paramFragment.a(k, paramBoolean1, j);
    if (animation != null)
      return new d(animation); 
    Animator animator = paramFragment.b(k, paramBoolean1, j);
    if (animator != null)
      return new d(animator); 
    int i = j;
    if (j == 0) {
      i = j;
      if (k != 0)
        i = a(k, paramBoolean1); 
    } 
    if (i != 0) {
      paramBoolean1 = "anim".equals(paramContext.getResources().getResourceTypeName(i));
      j = bool;
      if (paramBoolean1)
        try {
          Animation animation1 = AnimationUtils.loadAnimation(paramContext, i);
          if (animation1 != null)
            return new d(animation1); 
          j = 1;
        } catch (android.content.res.Resources.NotFoundException notFoundException) {
          throw notFoundException;
        } catch (RuntimeException runtimeException) {
          j = bool;
        }  
      if (j == 0)
        try {
          animator = AnimatorInflater.loadAnimator((Context)notFoundException, i);
          if (animator != null)
            return new d(animator); 
        } catch (RuntimeException runtimeException) {
          if (!paramBoolean1) {
            Animation animation1 = AnimationUtils.loadAnimation((Context)notFoundException, i);
            if (animation1 != null)
              return new d(animation1); 
          } else {
            throw runtimeException;
          } 
        }  
    } 
    return null;
  }
  
  static void a(Fragment paramFragment, d paramd, y.g paramg) {
    e e;
    View view = paramFragment.J;
    ViewGroup viewGroup = paramFragment.I;
    viewGroup.startViewTransition(view);
    b.g.j.a a = new b.g.j.a();
    a.a(new a(paramFragment));
    paramg.b(paramFragment, a);
    Animation animation = paramd.a;
    if (animation != null) {
      e = new e(animation, viewGroup, view);
      paramFragment.a(paramFragment.J);
      e.setAnimationListener(new b(viewGroup, paramFragment, paramg, a));
      paramFragment.J.startAnimation((Animation)e);
      return;
    } 
    Animator animator = ((d)e).b;
    paramFragment.a(animator);
    animator.addListener((Animator.AnimatorListener)new c(viewGroup, view, paramFragment, paramg, a));
    animator.setTarget(paramFragment.J);
    animator.start();
  }
  
  class a implements b.g.j.a.a {
    a(f this$0) {}
    
    public void a() {
      if (this.a.k() != null) {
        View view = this.a.k();
        this.a.a((View)null);
        view.clearAnimation();
      } 
      this.a.a((Animator)null);
    }
  }
  
  class b implements Animation.AnimationListener {
    b(f this$0, Fragment param1Fragment, y.g param1g, b.g.j.a param1a) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      this.a.post(new a(this));
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
    
    class a implements Runnable {
      a(f.b this$0) {}
      
      public void run() {
        if (this.c.b.k() != null) {
          this.c.b.a((View)null);
          f.b b1 = this.c;
          b1.c.a(b1.b, b1.d);
        } 
      }
    }
  }
  
  class a implements Runnable {
    a(f this$0) {}
    
    public void run() {
      if (this.c.b.k() != null) {
        this.c.b.a((View)null);
        f.b b1 = this.c;
        b1.c.a(b1.b, b1.d);
      } 
    }
  }
  
  class c extends AnimatorListenerAdapter {
    c(f this$0, View param1View, Fragment param1Fragment, y.g param1g, b.g.j.a param1a) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      this.a.endViewTransition(this.b);
      param1Animator = this.c.l();
      this.c.a((Animator)null);
      if (param1Animator != null && this.a.indexOfChild(this.b) < 0)
        this.d.a(this.c, this.e); 
    }
  }
  
  static class d {
    public final Animation a = null;
    
    public final Animator b;
    
    d(Animator param1Animator) {
      this.b = param1Animator;
      if (param1Animator != null)
        return; 
      throw new IllegalStateException("Animator cannot be null");
    }
    
    d(Animation param1Animation) {
      this.b = null;
      if (param1Animation != null)
        return; 
      throw new IllegalStateException("Animation cannot be null");
    }
  }
  
  static class e extends AnimationSet implements Runnable {
    private final ViewGroup c;
    
    private final View d;
    
    private boolean e;
    
    private boolean f;
    
    private boolean g = true;
    
    e(Animation param1Animation, ViewGroup param1ViewGroup, View param1View) {
      super(false);
      this.c = param1ViewGroup;
      this.d = param1View;
      addAnimation(param1Animation);
      this.c.post(this);
    }
    
    public boolean getTransformation(long param1Long, Transformation param1Transformation) {
      this.g = true;
      if (this.e)
        return this.f ^ true; 
      if (!super.getTransformation(param1Long, param1Transformation)) {
        this.e = true;
        s.a((View)this.c, this);
      } 
      return true;
    }
    
    public boolean getTransformation(long param1Long, Transformation param1Transformation, float param1Float) {
      this.g = true;
      if (this.e)
        return this.f ^ true; 
      if (!super.getTransformation(param1Long, param1Transformation, param1Float)) {
        this.e = true;
        s.a((View)this.c, this);
      } 
      return true;
    }
    
    public void run() {
      if (!this.e && this.g) {
        this.g = false;
        this.c.post(this);
        return;
      } 
      this.c.endViewTransition(this.d);
      this.f = true;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/fragment/app/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */