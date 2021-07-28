package b.h.a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

public abstract class a extends BaseAdapter implements Filterable, b.a {
  protected boolean c;
  
  protected boolean d;
  
  protected Cursor e;
  
  protected Context f;
  
  protected int g;
  
  protected a h;
  
  protected DataSetObserver i;
  
  protected b j;
  
  public a(Context paramContext, Cursor paramCursor, boolean paramBoolean) {
    byte b1;
    if (paramBoolean) {
      b1 = 1;
    } else {
      b1 = 2;
    } 
    a(paramContext, paramCursor, b1);
  }
  
  public Cursor a() {
    return this.e;
  }
  
  public abstract View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup);
  
  void a(Context paramContext, Cursor paramCursor, int paramInt) {
    byte b1;
    boolean bool = false;
    if ((paramInt & 0x1) == 1) {
      paramInt |= 0x2;
      this.d = true;
    } else {
      this.d = false;
    } 
    if (paramCursor != null)
      bool = true; 
    this.e = paramCursor;
    this.c = bool;
    this.f = paramContext;
    if (bool) {
      b1 = paramCursor.getColumnIndexOrThrow("_id");
    } else {
      b1 = -1;
    } 
    this.g = b1;
    if ((paramInt & 0x2) == 2) {
      this.h = new a(this);
      b b2 = new b(this);
    } else {
      paramContext = null;
      this.h = null;
    } 
    this.i = (DataSetObserver)paramContext;
    if (bool) {
      a a1 = this.h;
      if (a1 != null)
        paramCursor.registerContentObserver(a1); 
      DataSetObserver dataSetObserver = this.i;
      if (dataSetObserver != null)
        paramCursor.registerDataSetObserver(dataSetObserver); 
    } 
  }
  
  public void a(Cursor paramCursor) {
    paramCursor = c(paramCursor);
    if (paramCursor != null)
      paramCursor.close(); 
  }
  
  public abstract void a(View paramView, Context paramContext, Cursor paramCursor);
  
  public abstract View b(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup);
  
  public abstract CharSequence b(Cursor paramCursor);
  
  protected void b() {
    if (this.d) {
      Cursor cursor = this.e;
      if (cursor != null && !cursor.isClosed())
        this.c = this.e.requery(); 
    } 
  }
  
  public Cursor c(Cursor paramCursor) {
    Cursor cursor = this.e;
    if (paramCursor == cursor)
      return null; 
    if (cursor != null) {
      a a1 = this.h;
      if (a1 != null)
        cursor.unregisterContentObserver(a1); 
      DataSetObserver dataSetObserver = this.i;
      if (dataSetObserver != null)
        cursor.unregisterDataSetObserver(dataSetObserver); 
    } 
    this.e = paramCursor;
    if (paramCursor != null) {
      a a1 = this.h;
      if (a1 != null)
        paramCursor.registerContentObserver(a1); 
      DataSetObserver dataSetObserver = this.i;
      if (dataSetObserver != null)
        paramCursor.registerDataSetObserver(dataSetObserver); 
      this.g = paramCursor.getColumnIndexOrThrow("_id");
      this.c = true;
      notifyDataSetChanged();
      return cursor;
    } 
    this.g = -1;
    this.c = false;
    notifyDataSetInvalidated();
    return cursor;
  }
  
  public int getCount() {
    if (this.c) {
      Cursor cursor = this.e;
      if (cursor != null)
        return cursor.getCount(); 
    } 
    return 0;
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    if (this.c) {
      this.e.moveToPosition(paramInt);
      View view = paramView;
      if (paramView == null)
        view = a(this.f, this.e, paramViewGroup); 
      a(view, this.f, this.e);
      return view;
    } 
    return null;
  }
  
  public Filter getFilter() {
    if (this.j == null)
      this.j = new b(this); 
    return this.j;
  }
  
  public Object getItem(int paramInt) {
    if (this.c) {
      Cursor cursor = this.e;
      if (cursor != null) {
        cursor.moveToPosition(paramInt);
        return this.e;
      } 
    } 
    return null;
  }
  
  public long getItemId(int paramInt) {
    if (this.c) {
      Cursor cursor = this.e;
      if (cursor != null && cursor.moveToPosition(paramInt))
        return this.e.getLong(this.g); 
    } 
    return 0L;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    if (this.c) {
      if (this.e.moveToPosition(paramInt)) {
        View view = paramView;
        if (paramView == null)
          view = b(this.f, this.e, paramViewGroup); 
        a(view, this.f, this.e);
        return view;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("couldn't move cursor to position ");
      stringBuilder.append(paramInt);
      throw new IllegalStateException(stringBuilder.toString());
    } 
    throw new IllegalStateException("this should only be called when the cursor is valid");
  }
  
  private class a extends ContentObserver {
    a(a this$0) {
      super(new Handler());
    }
    
    public boolean deliverSelfNotifications() {
      return true;
    }
    
    public void onChange(boolean param1Boolean) {
      this.a.b();
    }
  }
  
  private class b extends DataSetObserver {
    b(a this$0) {}
    
    public void onChanged() {
      a a1 = this.a;
      a1.c = true;
      a1.notifyDataSetChanged();
    }
    
    public void onInvalidated() {
      a a1 = this.a;
      a1.c = false;
      a1.notifyDataSetInvalidated();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/h/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */