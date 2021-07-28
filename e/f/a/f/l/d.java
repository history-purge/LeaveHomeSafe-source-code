package e.f.a.f.l;

import android.util.Property;
import android.view.ViewGroup;
import e.f.a.f.f;

public class d extends Property<ViewGroup, Float> {
  public static final Property<ViewGroup, Float> a = new d("childrenAlpha");
  
  private d(String paramString) {
    super(Float.class, paramString);
  }
  
  public Float a(ViewGroup paramViewGroup) {
    Float float_ = (Float)paramViewGroup.getTag(f.mtrl_internal_children_alpha_tag);
    return (float_ != null) ? float_ : Float.valueOf(1.0F);
  }
  
  public void a(ViewGroup paramViewGroup, Float paramFloat) {
    float f = paramFloat.floatValue();
    paramViewGroup.setTag(f.mtrl_internal_children_alpha_tag, Float.valueOf(f));
    int j = paramViewGroup.getChildCount();
    int i;
    for (i = 0; i < j; i++)
      paramViewGroup.getChildAt(i).setAlpha(f); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/f/l/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */