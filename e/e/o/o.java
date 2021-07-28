package e.e.o;

import android.view.KeyEvent;
import android.view.View;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.f;
import java.util.Map;

public class o {
  private static final Map<Integer, String> c;
  
  private int a = -1;
  
  private final y b;
  
  static {
    f.b b = f.a();
    b.a(Integer.valueOf(23), "select");
    b.a(Integer.valueOf(66), "select");
    b.a(Integer.valueOf(62), "select");
    b.a(Integer.valueOf(85), "playPause");
    b.a(Integer.valueOf(89), "rewind");
    b.a(Integer.valueOf(90), "fastForward");
    b.a(Integer.valueOf(19), "up");
    b.a(Integer.valueOf(22), "right");
    b.a(Integer.valueOf(20), "down");
    b.a(Integer.valueOf(21), "left");
    c = b.a();
  }
  
  o(y paramy) {
    this.b = paramy;
  }
  
  private void a(String paramString, int paramInt) {
    a(paramString, paramInt, -1);
  }
  
  private void a(String paramString, int paramInt1, int paramInt2) {
    WritableNativeMap writableNativeMap = new WritableNativeMap();
    writableNativeMap.putString("eventType", paramString);
    writableNativeMap.putInt("eventKeyAction", paramInt2);
    if (paramInt1 != -1)
      writableNativeMap.putInt("tag", paramInt1); 
    this.b.a("onHWKeyEvent", (WritableMap)writableNativeMap);
  }
  
  public void a() {
    int i = this.a;
    if (i != -1)
      a("blur", i); 
    this.a = -1;
  }
  
  public void a(KeyEvent paramKeyEvent) {
    int i = paramKeyEvent.getKeyCode();
    int j = paramKeyEvent.getAction();
    if ((j == 1 || j == 0) && c.containsKey(Integer.valueOf(i)))
      a(c.get(Integer.valueOf(i)), this.a, j); 
  }
  
  public void a(View paramView) {
    if (this.a == paramView.getId())
      return; 
    int i = this.a;
    if (i != -1)
      a("blur", i); 
    this.a = paramView.getId();
    a("focus", paramView.getId());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */