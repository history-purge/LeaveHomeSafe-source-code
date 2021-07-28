package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import b.g.j.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

final class e implements Runnable {
  static final ThreadLocal<e> g = new ThreadLocal<e>();
  
  static Comparator<c> h = new a();
  
  ArrayList<RecyclerView> c = new ArrayList<RecyclerView>();
  
  long d;
  
  long e;
  
  private ArrayList<c> f = new ArrayList<c>();
  
  private RecyclerView.d0 a(RecyclerView paramRecyclerView, int paramInt, long paramLong) {
    if (a(paramRecyclerView, paramInt))
      return null; 
    null = paramRecyclerView.mRecycler;
    try {
      paramRecyclerView.onEnterLayoutOrScroll();
      RecyclerView.d0 d0 = null.a(paramInt, false, paramLong);
      if (d0 != null)
        if (d0.n() && !d0.o()) {
          null.b(d0.a);
        } else {
          null.a(d0, false);
        }  
      return d0;
    } finally {
      paramRecyclerView.onExitLayoutOrScroll(false);
    } 
  }
  
  private void a() {
    int k = this.c.size();
    int i = 0;
    int j;
    for (j = 0; i < k; j = m) {
      RecyclerView recyclerView = this.c.get(i);
      int m = j;
      if (recyclerView.getWindowVisibility() == 0) {
        recyclerView.mPrefetchRegistry.a(recyclerView, false);
        m = j + recyclerView.mPrefetchRegistry.d;
      } 
      i++;
    } 
    this.f.ensureCapacity(j);
    j = 0;
    i = 0;
    while (j < k) {
      RecyclerView recyclerView = this.c.get(j);
      if (recyclerView.getWindowVisibility() == 0) {
        b b = recyclerView.mPrefetchRegistry;
        int n = Math.abs(b.a) + Math.abs(b.b);
        for (int m = 0; m < b.d * 2; m += 2) {
          boolean bool;
          c c;
          if (i >= this.f.size()) {
            c = new c();
            this.f.add(c);
          } else {
            c = this.f.get(i);
          } 
          int i1 = b.c[m + 1];
          if (i1 <= n) {
            bool = true;
          } else {
            bool = false;
          } 
          c.a = bool;
          c.b = n;
          c.c = i1;
          c.d = recyclerView;
          c.e = b.c[m];
          i++;
        } 
      } 
      j++;
    } 
    Collections.sort(this.f, h);
  }
  
  private void a(RecyclerView paramRecyclerView, long paramLong) {
    if (paramRecyclerView == null)
      return; 
    if (paramRecyclerView.mDataSetHasChangedAfterLayout && paramRecyclerView.mChildHelper.b() != 0)
      paramRecyclerView.removeAndRecycleViews(); 
    b b = paramRecyclerView.mPrefetchRegistry;
    b.a(paramRecyclerView, true);
    if (b.d != 0)
      try {
        j.a("RV Nested Prefetch");
        paramRecyclerView.mState.a(paramRecyclerView.mAdapter);
        int i;
        for (i = 0; i < b.d * 2; i += 2)
          a(paramRecyclerView, b.c[i], paramLong); 
        return;
      } finally {
        j.a();
      }  
  }
  
  private void a(c paramc, long paramLong) {
    long l;
    if (paramc.a) {
      l = Long.MAX_VALUE;
    } else {
      l = paramLong;
    } 
    RecyclerView.d0 d0 = a(paramc.d, paramc.e, l);
    if (d0 != null && d0.b != null && d0.n() && !d0.o())
      a(d0.b.get(), paramLong); 
  }
  
  static boolean a(RecyclerView paramRecyclerView, int paramInt) {
    int j = paramRecyclerView.mChildHelper.b();
    for (int i = 0; i < j; i++) {
      RecyclerView.d0 d0 = RecyclerView.getChildViewHolderInt(paramRecyclerView.mChildHelper.d(i));
      if (d0.c == paramInt && !d0.o())
        return true; 
    } 
    return false;
  }
  
  private void b(long paramLong) {
    for (int i = 0; i < this.f.size(); i++) {
      c c = this.f.get(i);
      if (c.d == null)
        return; 
      a(c, paramLong);
      c.a();
    } 
  }
  
  void a(long paramLong) {
    a();
    b(paramLong);
  }
  
  public void a(RecyclerView paramRecyclerView) {
    this.c.add(paramRecyclerView);
  }
  
  void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {
    if (paramRecyclerView.isAttachedToWindow() && this.d == 0L) {
      this.d = paramRecyclerView.getNanoTime();
      paramRecyclerView.post(this);
    } 
    paramRecyclerView.mPrefetchRegistry.b(paramInt1, paramInt2);
  }
  
  public void b(RecyclerView paramRecyclerView) {
    this.c.remove(paramRecyclerView);
  }
  
  public void run() {
    try {
      j.a("RV Prefetch");
      boolean bool = this.c.isEmpty();
      if (!bool) {
        int j = this.c.size();
        int i = 0;
        long l;
        for (l = 0L; i < j; l = l1) {
          RecyclerView recyclerView = this.c.get(i);
          long l1 = l;
          if (recyclerView.getWindowVisibility() == 0)
            l1 = Math.max(recyclerView.getDrawingTime(), l); 
          i++;
        } 
        if (l != 0L) {
          a(TimeUnit.MILLISECONDS.toNanos(l) + this.e);
          return;
        } 
      } 
      return;
    } finally {
      this.d = 0L;
      j.a();
    } 
  }
  
  static final class a implements Comparator<c> {
    public int a(e.c param1c1, e.c param1c2) {
      byte b1;
      RecyclerView recyclerView = param1c1.d;
      byte b2 = 1;
      if (recyclerView == null) {
        i = 1;
      } else {
        i = 0;
      } 
      if (param1c2.d == null) {
        b1 = 1;
      } else {
        b1 = 0;
      } 
      if (i != b1)
        return (param1c1.d == null) ? 1 : -1; 
      boolean bool = param1c1.a;
      if (bool != param1c2.a) {
        i = b2;
        if (bool)
          i = -1; 
        return i;
      } 
      int i = param1c2.b - param1c1.b;
      if (i != 0)
        return i; 
      i = param1c1.c - param1c2.c;
      return (i != 0) ? i : 0;
    }
  }
  
  @SuppressLint({"VisibleForTests"})
  static class b implements RecyclerView.o.c {
    int a;
    
    int b;
    
    int[] c;
    
    int d;
    
    void a() {
      int[] arrayOfInt = this.c;
      if (arrayOfInt != null)
        Arrays.fill(arrayOfInt, -1); 
      this.d = 0;
    }
    
    public void a(int param1Int1, int param1Int2) {
      if (param1Int1 >= 0) {
        if (param1Int2 >= 0) {
          int i = this.d * 2;
          int[] arrayOfInt = this.c;
          if (arrayOfInt == null) {
            this.c = new int[4];
            Arrays.fill(this.c, -1);
          } else if (i >= arrayOfInt.length) {
            this.c = new int[i * 2];
            System.arraycopy(arrayOfInt, 0, this.c, 0, arrayOfInt.length);
          } 
          arrayOfInt = this.c;
          arrayOfInt[i] = param1Int1;
          arrayOfInt[i + 1] = param1Int2;
          this.d++;
          return;
        } 
        throw new IllegalArgumentException("Pixel distance must be non-negative");
      } 
      throw new IllegalArgumentException("Layout positions must be non-negative");
    }
    
    void a(RecyclerView param1RecyclerView, boolean param1Boolean) {
      this.d = 0;
      int[] arrayOfInt = this.c;
      if (arrayOfInt != null)
        Arrays.fill(arrayOfInt, -1); 
      RecyclerView.o o = param1RecyclerView.mLayout;
      if (param1RecyclerView.mAdapter != null && o != null && o.w()) {
        if (param1Boolean) {
          if (!param1RecyclerView.mAdapterHelper.c())
            o.a(param1RecyclerView.mAdapter.a(), this); 
        } else if (!param1RecyclerView.hasPendingAdapterUpdates()) {
          o.a(this.a, this.b, param1RecyclerView.mState, this);
        } 
        int i = this.d;
        if (i > o.m) {
          o.m = i;
          o.n = param1Boolean;
          param1RecyclerView.mRecycler.j();
        } 
      } 
    }
    
    boolean a(int param1Int) {
      if (this.c != null) {
        int j = this.d;
        for (int i = 0; i < j * 2; i += 2) {
          if (this.c[i] == param1Int)
            return true; 
        } 
      } 
      return false;
    }
    
    void b(int param1Int1, int param1Int2) {
      this.a = param1Int1;
      this.b = param1Int2;
    }
  }
  
  static class c {
    public boolean a;
    
    public int b;
    
    public int c;
    
    public RecyclerView d;
    
    public int e;
    
    public void a() {
      this.a = false;
      this.b = 0;
      this.c = 0;
      this.d = null;
      this.e = 0;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/recyclerview/widget/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */