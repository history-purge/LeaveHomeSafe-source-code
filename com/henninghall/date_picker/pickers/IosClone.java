package com.henninghall.date_picker.pickers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import d.a.a.a.a.a;

public class IosClone extends a implements a {
  public IosClone(Context paramContext) {
    super(paramContext);
  }
  
  public IosClone(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public IosClone(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public boolean a() {
    return b();
  }
  
  public View getView() {
    return (View)this;
  }
  
  public void setOnValueChangeListenerInScrolling(a.b paramb) {
    setOnValueChangeListenerInScrolling(new a(this, paramb, this));
  }
  
  public void setOnValueChangedListener(a.a parama) {
    setOnValueChangedListener(new b(this, parama));
  }
  
  class a implements a.e {
    a(IosClone this$0, a.b param1b, a param1a) {}
    
    public void a(a param1a, int param1Int1, int param1Int2) {
      this.a.a(this.b, param1Int1, param1Int2);
    }
  }
  
  class b implements a.d {
    b(IosClone this$0, a.a param1a) {}
    
    public void a(a param1a, int param1Int1, int param1Int2) {
      this.a.a();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/henninghall/date_picker/pickers/IosClone.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */