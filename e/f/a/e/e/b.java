package e.f.a.e.e;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.q;

public class b extends DialogFragment {
  private Dialog c;
  
  private DialogInterface.OnCancelListener d;
  
  public static b a(@RecentlyNonNull Dialog paramDialog, DialogInterface.OnCancelListener paramOnCancelListener) {
    b b1 = new b();
    q.a(paramDialog, "Cannot display null dialog");
    paramDialog = paramDialog;
    paramDialog.setOnCancelListener(null);
    paramDialog.setOnDismissListener(null);
    b1.c = paramDialog;
    if (paramOnCancelListener != null)
      b1.d = paramOnCancelListener; 
    return b1;
  }
  
  public void onCancel(@RecentlyNonNull DialogInterface paramDialogInterface) {
    DialogInterface.OnCancelListener onCancelListener = this.d;
    if (onCancelListener != null)
      onCancelListener.onCancel(paramDialogInterface); 
  }
  
  public Dialog onCreateDialog(Bundle paramBundle) {
    if (this.c == null)
      setShowsDialog(false); 
    return this.c;
  }
  
  public void show(@RecentlyNonNull FragmentManager paramFragmentManager, String paramString) {
    super.show(paramFragmentManager, paramString);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */