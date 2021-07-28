package com.rnfs;

import android.os.AsyncTask;
import android.webkit.MimeTypeMap;
import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.util.concurrent.atomic.AtomicBoolean;

public class h extends AsyncTask<f, int[], g> {
  private f a;
  
  private g b;
  
  private AtomicBoolean c = new AtomicBoolean(false);
  
  private void a(f paramf, g paramg) {
    String str3 = "filename";
    String str2 = "name";
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("\r\n");
    String str4 = "--";
    stringBuilder.append("--");
    stringBuilder.append("*****");
    stringBuilder.append("--");
    stringBuilder.append("\r\n");
    String str1 = stringBuilder.toString();
    try {
      HttpURLConnection httpURLConnection1;
      HttpURLConnection httpURLConnection2;
    } finally {
      DataOutputStream dataOutputStream = null;
      stringBuilder = null;
      BufferedInputStream bufferedInputStream = null;
      HttpURLConnection httpURLConnection = null;
      if (httpURLConnection != null)
        httpURLConnection.disconnect(); 
      if (dataOutputStream != null)
        dataOutputStream.close(); 
      if (bufferedInputStream != null)
        bufferedInputStream.close(); 
      if (stringBuilder != null)
        stringBuilder.close(); 
    } 
    boolean bool = bool2;
  }
  
  protected g a(f... paramVarArgs) {
    this.a = paramVarArgs[0];
    this.b = new g();
    (new Thread(new a(this))).start();
    return this.b;
  }
  
  protected String a(String paramString) {
    paramString = MimeTypeMap.getFileExtensionFromUrl(paramString);
    if (paramString != null) {
      paramString = MimeTypeMap.getSingleton().getMimeTypeFromExtension(paramString.toLowerCase());
    } else {
      paramString = null;
    } 
    String str = paramString;
    if (paramString == null)
      str = "*/*"; 
    return str;
  }
  
  protected void a() {
    this.c.set(true);
  }
  
  class a implements Runnable {
    a(h this$0) {}
    
    public void run() {
      try {
        h.a(this.c, h.a(this.c), h.b(this.c));
        (h.a(this.c)).g.a(h.b(this.c));
        return;
      } catch (Exception exception) {
        (h.b(this.c)).c = exception;
        (h.a(this.c)).g.a(h.b(this.c));
        return;
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/rnfs/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */