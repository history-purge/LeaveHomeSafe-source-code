package b.t.a;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class a {
  private final DataSetObservable a = new DataSetObservable();
  
  private DataSetObserver b;
  
  public float a(int paramInt) {
    return 1.0F;
  }
  
  public abstract int a();
  
  public abstract int a(Object paramObject);
  
  public abstract Object a(ViewGroup paramViewGroup, int paramInt);
  
  void a(DataSetObserver paramDataSetObserver) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: putfield b : Landroid/database/DataSetObserver;
    //   7: aload_0
    //   8: monitorexit
    //   9: return
    //   10: astore_1
    //   11: aload_0
    //   12: monitorexit
    //   13: aload_1
    //   14: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	10	finally
    //   11	13	10	finally
  }
  
  public void a(Parcelable paramParcelable, ClassLoader paramClassLoader) {}
  
  @Deprecated
  public void a(View paramView) {}
  
  @Deprecated
  public void a(View paramView, int paramInt, Object paramObject) {}
  
  public void a(ViewGroup paramViewGroup) {
    a((View)paramViewGroup);
  }
  
  public abstract void a(ViewGroup paramViewGroup, int paramInt, Object paramObject);
  
  public abstract boolean a(View paramView, Object paramObject);
  
  public void b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Landroid/database/DataSetObserver;
    //   6: ifnull -> 16
    //   9: aload_0
    //   10: getfield b : Landroid/database/DataSetObserver;
    //   13: invokevirtual onChanged : ()V
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_0
    //   19: getfield a : Landroid/database/DataSetObservable;
    //   22: invokevirtual notifyChanged : ()V
    //   25: return
    //   26: astore_1
    //   27: aload_0
    //   28: monitorexit
    //   29: aload_1
    //   30: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	26	finally
    //   16	18	26	finally
    //   27	29	26	finally
  }
  
  @Deprecated
  public void b(View paramView) {}
  
  public void b(ViewGroup paramViewGroup) {
    b((View)paramViewGroup);
  }
  
  public void b(ViewGroup paramViewGroup, int paramInt, Object paramObject) {
    a((View)paramViewGroup, paramInt, paramObject);
  }
  
  public Parcelable c() {
    return null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/t/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */