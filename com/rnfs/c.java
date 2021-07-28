package com.rnfs;

import android.os.AsyncTask;
import android.os.Build;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

public class c extends AsyncTask<a, long[], b> {
  private a a;
  
  private AtomicBoolean b = new AtomicBoolean(false);
  
  b c;
  
  private long a(HttpURLConnection paramHttpURLConnection) {
    return (Build.VERSION.SDK_INT >= 24) ? paramHttpURLConnection.getContentLengthLong() : paramHttpURLConnection.getContentLength();
  }
  
  private void a(a parama, b paramb) {
    b b1;
    HttpURLConnection httpURLConnection1;
    a a1 = parama;
    HttpURLConnection httpURLConnection2 = null;
    Iterator iterator = null;
    try {
    
    } finally {
      parama = null;
      paramb = null;
      b1 = paramb;
    } 
    if (httpURLConnection1 != null)
      httpURLConnection1.close(); 
    if (paramb != null)
      paramb.close(); 
    if (b1 != null)
      b1.disconnect(); 
    throw parama;
  }
  
  protected b a(a... paramVarArgs) {
    this.a = paramVarArgs[0];
    this.c = new b();
    (new Thread(new a(this))).start();
    return this.c;
  }
  
  protected void a() {
    this.b.set(true);
  }
  
  protected void a(long[]... paramVarArgs) {
    super.onProgressUpdate((Object[])paramVarArgs);
    a.b b1 = this.a.j;
    if (b1 != null)
      b1.a(paramVarArgs[0][0], paramVarArgs[0][1]); 
  }
  
  class a implements Runnable {
    a(c this$0) {}
    
    public void run() {
      try {
        c.a(this.c, c.a(this.c), this.c.c);
        (c.a(this.c)).h.a(this.c.c);
        return;
      } catch (Exception exception) {
        c c1 = this.c;
        c1.c.c = exception;
        (c.a(c1)).h.a(this.c.c);
        return;
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/rnfs/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */