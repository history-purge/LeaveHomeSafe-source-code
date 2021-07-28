package e.e.o;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.appcompat.app.d;
import com.facebook.react.modules.core.b;
import com.facebook.react.modules.core.e;
import com.facebook.react.modules.core.f;

public abstract class m extends d implements b, e {
  private final n s = t();
  
  public void a(String[] paramArrayOfString, int paramInt, f paramf) {
    this.s.a(paramArrayOfString, paramInt, paramf);
  }
  
  public void e() {
    super.onBackPressed();
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    this.s.a(paramInt1, paramInt2, paramIntent);
  }
  
  public void onBackPressed() {
    if (!this.s.g())
      super.onBackPressed(); 
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    this.s.a(paramBundle);
  }
  
  protected void onDestroy() {
    super.onDestroy();
    this.s.h();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    return (this.s.a(paramInt, paramKeyEvent) || super.onKeyDown(paramInt, paramKeyEvent));
  }
  
  public boolean onKeyLongPress(int paramInt, KeyEvent paramKeyEvent) {
    return (this.s.b(paramInt, paramKeyEvent) || super.onKeyLongPress(paramInt, paramKeyEvent));
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent) {
    return (this.s.c(paramInt, paramKeyEvent) || super.onKeyUp(paramInt, paramKeyEvent));
  }
  
  public void onNewIntent(Intent paramIntent) {
    if (!this.s.a(paramIntent))
      super.onNewIntent(paramIntent); 
  }
  
  protected void onPause() {
    super.onPause();
    this.s.i();
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfint) {
    this.s.a(paramInt, paramArrayOfString, paramArrayOfint);
  }
  
  protected void onResume() {
    super.onResume();
    this.s.j();
  }
  
  public void onWindowFocusChanged(boolean paramBoolean) {
    super.onWindowFocusChanged(paramBoolean);
    this.s.a(paramBoolean);
  }
  
  protected n t() {
    return new n(this, u());
  }
  
  protected String u() {
    return null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */