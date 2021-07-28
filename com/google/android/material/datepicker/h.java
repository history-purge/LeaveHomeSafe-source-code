package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.g.m.v;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

public final class h<S> extends p<S> {
  static final Object m0 = "MONTHS_VIEW_GROUP_TAG";
  
  static final Object n0 = "NAVIGATION_PREV_TAG";
  
  static final Object o0 = "NAVIGATION_NEXT_TAG";
  
  static final Object p0 = "SELECTOR_TOGGLE_TAG";
  
  private int c0;
  
  private d<S> d0;
  
  private a e0;
  
  private l f0;
  
  private k g0;
  
  private c h0;
  
  private RecyclerView i0;
  
  private RecyclerView j0;
  
  private View k0;
  
  private View l0;
  
  private RecyclerView.n D0() {
    return new e(this);
  }
  
  static <T> h<T> a(d<T> paramd, int paramInt, a parama) {
    h<T> h1 = new h();
    Bundle bundle = new Bundle();
    bundle.putInt("THEME_RES_ID_KEY", paramInt);
    bundle.putParcelable("GRID_SELECTOR_KEY", paramd);
    bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", parama);
    bundle.putParcelable("CURRENT_MONTH_KEY", parama.h());
    h1.m(bundle);
    return h1;
  }
  
  private void a(View paramView, n paramn) {
    MaterialButton materialButton1 = (MaterialButton)paramView.findViewById(e.f.a.f.f.month_navigation_fragment_toggle);
    materialButton1.setTag(p0);
    v.a((View)materialButton1, new f(this));
    MaterialButton materialButton2 = (MaterialButton)paramView.findViewById(e.f.a.f.f.month_navigation_previous);
    materialButton2.setTag(n0);
    MaterialButton materialButton3 = (MaterialButton)paramView.findViewById(e.f.a.f.f.month_navigation_next);
    materialButton3.setTag(o0);
    this.k0 = paramView.findViewById(e.f.a.f.f.mtrl_calendar_year_selector_frame);
    this.l0 = paramView.findViewById(e.f.a.f.f.mtrl_calendar_day_selector_frame);
    a(k.c);
    materialButton1.setText(this.f0.r());
    this.j0.addOnScrollListener(new g(this, paramn, materialButton1));
    materialButton1.setOnClickListener(new h(this));
    materialButton3.setOnClickListener(new i(this, paramn));
    materialButton2.setOnClickListener(new j(this, paramn));
  }
  
  static int b(Context paramContext) {
    return paramContext.getResources().getDimensionPixelSize(e.f.a.f.d.mtrl_calendar_day_height);
  }
  
  private void c(int paramInt) {
    this.j0.post(new a(this, paramInt));
  }
  
  public d<S> A0() {
    return this.d0;
  }
  
  LinearLayoutManager B0() {
    return (LinearLayoutManager)this.j0.getLayoutManager();
  }
  
  void C0() {
    k k1 = this.g0;
    if (k1 == k.d) {
      k1 = k.c;
    } else if (k1 == k.c) {
      k1 = k.d;
    } else {
      return;
    } 
    a(k1);
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    boolean bool;
    ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(o(), this.c0);
    this.h0 = new c((Context)contextThemeWrapper);
    paramLayoutInflater = paramLayoutInflater.cloneInContext((Context)contextThemeWrapper);
    l l1 = this.e0.i();
    if (i.g((Context)contextThemeWrapper)) {
      i = e.f.a.f.h.mtrl_calendar_vertical;
      bool = true;
    } else {
      i = e.f.a.f.h.mtrl_calendar_horizontal;
      bool = false;
    } 
    View view = paramLayoutInflater.inflate(i, paramViewGroup, false);
    GridView gridView = (GridView)view.findViewById(e.f.a.f.f.mtrl_calendar_days_of_week);
    v.a((View)gridView, new b(this));
    gridView.setAdapter((ListAdapter)new g());
    gridView.setNumColumns(l1.g);
    gridView.setEnabled(false);
    this.j0 = (RecyclerView)view.findViewById(e.f.a.f.f.mtrl_calendar_months);
    c c1 = new c(this, o(), bool, false, bool);
    this.j0.setLayoutManager((RecyclerView.o)c1);
    this.j0.setTag(m0);
    n n = new n((Context)contextThemeWrapper, this.d0, this.e0, new d(this));
    this.j0.setAdapter(n);
    int i = contextThemeWrapper.getResources().getInteger(e.f.a.f.g.mtrl_calendar_year_selector_span);
    this.i0 = (RecyclerView)view.findViewById(e.f.a.f.f.mtrl_calendar_year_selector_frame);
    RecyclerView recyclerView = this.i0;
    if (recyclerView != null) {
      recyclerView.setHasFixedSize(true);
      this.i0.setLayoutManager((RecyclerView.o)new GridLayoutManager((Context)contextThemeWrapper, i, 1, false));
      this.i0.setAdapter(new s(this));
      this.i0.addItemDecoration(D0());
    } 
    if (view.findViewById(e.f.a.f.f.month_navigation_fragment_toggle) != null)
      a(view, n); 
    if (!i.g((Context)contextThemeWrapper))
      (new androidx.recyclerview.widget.i()).a(this.j0); 
    this.j0.scrollToPosition(n.a(this.f0));
    return view;
  }
  
  void a(k paramk) {
    this.g0 = paramk;
    if (paramk == k.d) {
      this.i0.getLayoutManager().i(((s)this.i0.getAdapter()).c(this.f0.f));
      this.k0.setVisibility(0);
      this.l0.setVisibility(8);
      return;
    } 
    if (paramk == k.c) {
      this.k0.setVisibility(8);
      this.l0.setVisibility(0);
      a(this.f0);
    } 
  }
  
  void a(l paraml) {
    // Byte code:
    //   0: aload_0
    //   1: getfield j0 : Landroidx/recyclerview/widget/RecyclerView;
    //   4: invokevirtual getAdapter : ()Landroidx/recyclerview/widget/RecyclerView$g;
    //   7: checkcast com/google/android/material/datepicker/n
    //   10: astore #6
    //   12: aload #6
    //   14: aload_1
    //   15: invokevirtual a : (Lcom/google/android/material/datepicker/l;)I
    //   18: istore #4
    //   20: iload #4
    //   22: aload #6
    //   24: aload_0
    //   25: getfield f0 : Lcom/google/android/material/datepicker/l;
    //   28: invokevirtual a : (Lcom/google/android/material/datepicker/l;)I
    //   31: isub
    //   32: istore #5
    //   34: iload #5
    //   36: invokestatic abs : (I)I
    //   39: istore_2
    //   40: iconst_1
    //   41: istore_3
    //   42: iload_2
    //   43: iconst_3
    //   44: if_icmple -> 52
    //   47: iconst_1
    //   48: istore_2
    //   49: goto -> 54
    //   52: iconst_0
    //   53: istore_2
    //   54: iload #5
    //   56: ifle -> 62
    //   59: goto -> 64
    //   62: iconst_0
    //   63: istore_3
    //   64: aload_0
    //   65: aload_1
    //   66: putfield f0 : Lcom/google/android/material/datepicker/l;
    //   69: iload_2
    //   70: ifeq -> 90
    //   73: iload_3
    //   74: ifeq -> 90
    //   77: aload_0
    //   78: getfield j0 : Landroidx/recyclerview/widget/RecyclerView;
    //   81: astore_1
    //   82: iload #4
    //   84: iconst_3
    //   85: isub
    //   86: istore_2
    //   87: goto -> 104
    //   90: iload_2
    //   91: ifeq -> 109
    //   94: aload_0
    //   95: getfield j0 : Landroidx/recyclerview/widget/RecyclerView;
    //   98: astore_1
    //   99: iload #4
    //   101: iconst_3
    //   102: iadd
    //   103: istore_2
    //   104: aload_1
    //   105: iload_2
    //   106: invokevirtual scrollToPosition : (I)V
    //   109: aload_0
    //   110: iload #4
    //   112: invokespecial c : (I)V
    //   115: return
  }
  
  public void c(Bundle paramBundle) {
    super.c(paramBundle);
    Bundle bundle = paramBundle;
    if (paramBundle == null)
      bundle = m(); 
    this.c0 = bundle.getInt("THEME_RES_ID_KEY");
    this.d0 = (d<S>)bundle.getParcelable("GRID_SELECTOR_KEY");
    this.e0 = (a)bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    this.f0 = (l)bundle.getParcelable("CURRENT_MONTH_KEY");
  }
  
  public void e(Bundle paramBundle) {
    super.e(paramBundle);
    paramBundle.putInt("THEME_RES_ID_KEY", this.c0);
    paramBundle.putParcelable("GRID_SELECTOR_KEY", this.d0);
    paramBundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.e0);
    paramBundle.putParcelable("CURRENT_MONTH_KEY", this.f0);
  }
  
  a x0() {
    return this.e0;
  }
  
  c y0() {
    return this.h0;
  }
  
  l z0() {
    return this.f0;
  }
  
  class a implements Runnable {
    a(h this$0, int param1Int) {}
    
    public void run() {
      h.a(this.d).smoothScrollToPosition(this.c);
    }
  }
  
  class b extends b.g.m.a {
    b(h this$0) {}
    
    public void a(View param1View, b.g.m.e0.c param1c) {
      super.a(param1View, param1c);
      param1c.a(null);
    }
  }
  
  class c extends q {
    c(h this$0, Context param1Context, int param1Int1, boolean param1Boolean, int param1Int2) {
      super(param1Context, param1Int1, param1Boolean);
    }
    
    protected void a(RecyclerView.a0 param1a0, int[] param1ArrayOfint) {
      if (this.I == 0) {
        param1ArrayOfint[0] = h.a(this.J).getWidth();
        param1ArrayOfint[1] = h.a(this.J).getWidth();
        return;
      } 
      param1ArrayOfint[0] = h.a(this.J).getHeight();
      param1ArrayOfint[1] = h.a(this.J).getHeight();
    }
  }
  
  class d implements l {
    d(h this$0) {}
    
    public void a(long param1Long) {
      if (h.b(this.a).e().a(param1Long)) {
        h.c(this.a).b(param1Long);
        Iterator<o> iterator = this.a.b0.iterator();
        while (iterator.hasNext())
          ((o)iterator.next()).a(h.c(this.a).d()); 
        h.a(this.a).getAdapter().d();
        if (h.d(this.a) != null)
          h.d(this.a).getAdapter().d(); 
      } 
    }
  }
  
  class e extends RecyclerView.n {
    private final Calendar a = r.d();
    
    private final Calendar b = r.d();
    
    e(h this$0) {}
    
    public void a(Canvas param1Canvas, RecyclerView param1RecyclerView, RecyclerView.a0 param1a0) {
      if (param1RecyclerView.getAdapter() instanceof s) {
        if (!(param1RecyclerView.getLayoutManager() instanceof GridLayoutManager))
          return; 
        s s = (s)param1RecyclerView.getAdapter();
        GridLayoutManager gridLayoutManager = (GridLayoutManager)param1RecyclerView.getLayoutManager();
        for (androidx.core.util.c<Long, Long> c : h.c(this.c).a()) {
          Object object = c.a;
          if (object == null || c.b == null)
            continue; 
          this.a.setTimeInMillis(((Long)object).longValue());
          this.b.setTimeInMillis(((Long)c.b).longValue());
          int j = s.c(this.a.get(1));
          int i = s.c(this.b.get(1));
          View view = gridLayoutManager.c(j);
          object = gridLayoutManager.c(i);
          int k = j / gridLayoutManager.M();
          int m = i / gridLayoutManager.M();
          for (i = k; i <= m; i++) {
            View view1 = gridLayoutManager.c(gridLayoutManager.M() * i);
            if (view1 != null) {
              int i1;
              int i2 = view1.getTop();
              int i3 = (h.e(this.c)).d.b();
              int i4 = view1.getBottom();
              int i5 = (h.e(this.c)).d.a();
              if (i == k) {
                j = view.getLeft() + view.getWidth() / 2;
              } else {
                j = 0;
              } 
              if (i == m) {
                i1 = object.getLeft() + object.getWidth() / 2;
              } else {
                i1 = param1RecyclerView.getWidth();
              } 
              param1Canvas.drawRect(j, (i2 + i3), i1, (i4 - i5), (h.e(this.c)).h);
            } 
          } 
        } 
      } 
    }
  }
  
  class f extends b.g.m.a {
    f(h this$0) {}
    
    public void a(View param1View, b.g.m.e0.c param1c) {
      h h1;
      int i;
      super.a(param1View, param1c);
      if (h.f(this.d).getVisibility() == 0) {
        h1 = this.d;
        i = e.f.a.f.i.mtrl_picker_toggle_to_year_selection;
      } else {
        h1 = this.d;
        i = e.f.a.f.i.mtrl_picker_toggle_to_day_selection;
      } 
      param1c.d(h1.a(i));
    }
  }
  
  class g extends RecyclerView.t {
    g(h this$0, n param1n, MaterialButton param1MaterialButton) {}
    
    public void a(RecyclerView param1RecyclerView, int param1Int) {
      if (param1Int == 0) {
        CharSequence charSequence = this.b.getText();
        if (Build.VERSION.SDK_INT >= 16) {
          param1RecyclerView.announceForAccessibility(charSequence);
          return;
        } 
        param1RecyclerView.sendAccessibilityEvent(2048);
      } 
    }
    
    public void a(RecyclerView param1RecyclerView, int param1Int1, int param1Int2) {
      LinearLayoutManager linearLayoutManager = this.c.B0();
      if (param1Int1 < 0) {
        param1Int1 = linearLayoutManager.G();
      } else {
        param1Int1 = linearLayoutManager.H();
      } 
      h.a(this.c, this.a.c(param1Int1));
      this.b.setText(this.a.d(param1Int1));
    }
  }
  
  class h implements View.OnClickListener {
    h(h this$0) {}
    
    public void onClick(View param1View) {
      this.c.C0();
    }
  }
  
  class i implements View.OnClickListener {
    i(h this$0, n param1n) {}
    
    public void onClick(View param1View) {
      int j = this.d.B0().G() + 1;
      if (j < h.a(this.d).getAdapter().a())
        this.d.a(this.c.c(j)); 
    }
  }
  
  class j implements View.OnClickListener {
    j(h this$0, n param1n) {}
    
    public void onClick(View param1View) {
      int i = this.d.B0().H() - 1;
      if (i >= 0)
        this.d.a(this.c.c(i)); 
    }
  }
  
  enum k {
    c, d;
  }
  
  static interface l {
    void a(long param1Long);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/datepicker/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */