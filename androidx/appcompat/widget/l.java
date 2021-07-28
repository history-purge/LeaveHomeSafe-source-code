package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

class l {
  static InputConnection a(InputConnection paramInputConnection, EditorInfo paramEditorInfo, View paramView) {
    if (paramInputConnection != null && paramEditorInfo.hintText == null)
      for (ViewParent viewParent = paramView.getParent(); viewParent instanceof View; viewParent = viewParent.getParent()) {
        if (viewParent instanceof e1) {
          paramEditorInfo.hintText = ((e1)viewParent).a();
          return paramInputConnection;
        } 
      }  
    return paramInputConnection;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */