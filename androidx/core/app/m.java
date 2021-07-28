package androidx.core.app;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.Set;

public final class m {
  private final String a;
  
  private final CharSequence b;
  
  private final CharSequence[] c;
  
  private final boolean d;
  
  private final int e;
  
  private final Bundle f;
  
  private final Set<String> g;
  
  static RemoteInput a(m paramm) {
    RemoteInput.Builder builder = (new RemoteInput.Builder(paramm.g())).setLabel(paramm.f()).setChoices(paramm.c()).setAllowFreeFormInput(paramm.a()).addExtras(paramm.e());
    if (Build.VERSION.SDK_INT >= 29)
      builder.setEditChoicesBeforeSending(paramm.d()); 
    return builder.build();
  }
  
  static RemoteInput[] a(m[] paramArrayOfm) {
    if (paramArrayOfm == null)
      return null; 
    RemoteInput[] arrayOfRemoteInput = new RemoteInput[paramArrayOfm.length];
    for (int i = 0; i < paramArrayOfm.length; i++)
      arrayOfRemoteInput[i] = a(paramArrayOfm[i]); 
    return arrayOfRemoteInput;
  }
  
  public boolean a() {
    return this.d;
  }
  
  public Set<String> b() {
    return this.g;
  }
  
  public CharSequence[] c() {
    return this.c;
  }
  
  public int d() {
    return this.e;
  }
  
  public Bundle e() {
    return this.f;
  }
  
  public CharSequence f() {
    return this.b;
  }
  
  public String g() {
    return this.a;
  }
  
  public boolean h() {
    return (!a() && (c() == null || (c()).length == 0) && b() != null && !b().isEmpty());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/core/app/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */