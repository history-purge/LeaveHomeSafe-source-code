package com.facebook.react.modules.dialog;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.d;

public class a extends d implements DialogInterface.OnClickListener {
  private final DialogModule.b r0 = null;
  
  public a() {}
  
  @SuppressLint({"ValidFragment"})
  public a(DialogModule.b paramb, Bundle paramBundle) {
    m(paramBundle);
  }
  
  public static Dialog a(Context paramContext, Bundle paramBundle, DialogInterface.OnClickListener paramOnClickListener) {
    AlertDialog.Builder builder = (new AlertDialog.Builder(paramContext)).setTitle(paramBundle.getString("title"));
    if (paramBundle.containsKey("button_positive"))
      builder.setPositiveButton(paramBundle.getString("button_positive"), paramOnClickListener); 
    if (paramBundle.containsKey("button_negative"))
      builder.setNegativeButton(paramBundle.getString("button_negative"), paramOnClickListener); 
    if (paramBundle.containsKey("button_neutral"))
      builder.setNeutralButton(paramBundle.getString("button_neutral"), paramOnClickListener); 
    if (paramBundle.containsKey("message"))
      builder.setMessage(paramBundle.getString("message")); 
    if (paramBundle.containsKey("items"))
      builder.setItems(paramBundle.getCharSequenceArray("items"), paramOnClickListener); 
    return (Dialog)builder.create();
  }
  
  public Dialog n(Bundle paramBundle) {
    return a((Context)h(), m(), this);
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt) {
    DialogModule.b b1 = this.r0;
    if (b1 != null)
      b1.onClick(paramDialogInterface, paramInt); 
  }
  
  public void onDismiss(DialogInterface paramDialogInterface) {
    super.onDismiss(paramDialogInterface);
    DialogModule.b b1 = this.r0;
    if (b1 != null)
      b1.onDismiss(paramDialogInterface); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/dialog/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */