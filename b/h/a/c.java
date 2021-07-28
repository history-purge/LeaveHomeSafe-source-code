package b.h.a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class c extends a {
  private int k;
  
  private int l;
  
  private LayoutInflater m;
  
  @Deprecated
  public c(Context paramContext, int paramInt, Cursor paramCursor, boolean paramBoolean) {
    super(paramContext, paramCursor, paramBoolean);
    this.l = paramInt;
    this.k = paramInt;
    this.m = (LayoutInflater)paramContext.getSystemService("layout_inflater");
  }
  
  public View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup) {
    return this.m.inflate(this.l, paramViewGroup, false);
  }
  
  public View b(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup) {
    return this.m.inflate(this.k, paramViewGroup, false);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/h/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */