package okhttp3.internal.huc;

import j.c;
import j.d;
import j.l;
import j.m;
import okhttp3.internal.http.UnrepeatableRequestBody;

final class StreamedRequestBody extends OutputStreamRequestBody implements UnrepeatableRequestBody {
  private final m pipe = new m(8192L);
  
  StreamedRequestBody(long paramLong) {
    initOutputStream(l.a(this.pipe.a()), paramLong);
  }
  
  public void writeTo(d paramd) {
    c c = new c();
    while (this.pipe.b().read(c, 8192L) != -1L)
      paramd.write(c, c.s()); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/huc/StreamedRequestBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */