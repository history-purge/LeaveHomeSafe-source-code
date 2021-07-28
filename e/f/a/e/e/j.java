package e.f.a.e.e;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.d;
import androidx.fragment.app.n;
import com.google.android.gms.common.internal.q;

public class j extends d {
  private Dialog r0;
  
  private DialogInterface.OnCancelListener s0;
  
  public static j a(@RecentlyNonNull Dialog paramDialog, DialogInterface.OnCancelListener paramOnCancelListener) {
    j j1 = new j();
    q.a(paramDialog, "Cannot display null dialog");
    paramDialog = paramDialog;
    paramDialog.setOnCancelListener(null);
    paramDialog.setOnDismissListener(null);
    j1.r0 = paramDialog;
    if (paramOnCancelListener != null)
      j1.s0 = paramOnCancelListener; 
    return j1;
  }
  
  public void a(@RecentlyNonNull n paramn, String paramString) {
    super.a(paramn, paramString);
  }
  
  public Dialog n(Bundle paramBundle) {
    if (this.r0 == null)
      k(false); 
    return this.r0;
  }
  
  public void onCancel(@RecentlyNonNull DialogInterface paramDialogInterface) {
    DialogInterface.OnCancelListener onCancelListener = this.s0;
    if (onCancelListener != null)
      onCancelListener.onCancel(paramDialogInterface); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/e/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */