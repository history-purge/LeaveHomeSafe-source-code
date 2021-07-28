package e.f.a.e.d;

import android.os.Bundle;
import android.util.Log;
import e.f.a.e.m.m;

abstract class u<T> {
  final int a;
  
  final m<T> b = new m();
  
  final int c;
  
  final Bundle d;
  
  u(int paramInt1, int paramInt2, Bundle paramBundle) {
    this.a = paramInt1;
    this.c = paramInt2;
    this.d = paramBundle;
  }
  
  abstract void a(Bundle paramBundle);
  
  final void a(t paramt) {
    if (Log.isLoggable("MessengerIpcClient", 3)) {
      String str1 = String.valueOf(this);
      String str2 = String.valueOf(paramt);
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 14 + String.valueOf(str2).length());
      stringBuilder.append("Failing ");
      stringBuilder.append(str1);
      stringBuilder.append(" with ");
      stringBuilder.append(str2);
      Log.d("MessengerIpcClient", stringBuilder.toString());
    } 
    this.b.a(paramt);
  }
  
  final void a(T paramT) {
    if (Log.isLoggable("MessengerIpcClient", 3)) {
      String str1 = String.valueOf(this);
      String str2 = String.valueOf(paramT);
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 16 + String.valueOf(str2).length());
      stringBuilder.append("Finishing ");
      stringBuilder.append(str1);
      stringBuilder.append(" with ");
      stringBuilder.append(str2);
      Log.d("MessengerIpcClient", stringBuilder.toString());
    } 
    this.b.a(paramT);
  }
  
  abstract boolean a();
  
  public String toString() {
    int i = this.c;
    int j = this.a;
    boolean bool = a();
    StringBuilder stringBuilder = new StringBuilder(55);
    stringBuilder.append("Request { what=");
    stringBuilder.append(i);
    stringBuilder.append(" id=");
    stringBuilder.append(j);
    stringBuilder.append(" oneWay=");
    stringBuilder.append(bool);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/d/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */