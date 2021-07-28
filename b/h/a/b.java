package b.h.a;

import android.database.Cursor;
import android.widget.Filter;

class b extends Filter {
  a a;
  
  b(a parama) {
    this.a = parama;
  }
  
  public CharSequence convertResultToString(Object paramObject) {
    return this.a.b((Cursor)paramObject);
  }
  
  protected Filter.FilterResults performFiltering(CharSequence paramCharSequence) {
    Cursor cursor = this.a.a(paramCharSequence);
    Filter.FilterResults filterResults = new Filter.FilterResults();
    if (cursor != null) {
      filterResults.count = cursor.getCount();
    } else {
      filterResults.count = 0;
      cursor = null;
    } 
    filterResults.values = cursor;
    return filterResults;
  }
  
  protected void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults) {
    Cursor cursor = this.a.a();
    Object object = paramFilterResults.values;
    if (object != null && object != cursor)
      this.a.a((Cursor)object); 
  }
  
  static interface a {
    Cursor a();
    
    Cursor a(CharSequence param1CharSequence);
    
    void a(Cursor param1Cursor);
    
    CharSequence b(Cursor param1Cursor);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/h/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */