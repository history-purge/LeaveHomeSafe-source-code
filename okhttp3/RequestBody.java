package okhttp3;

import j.d;
import j.f;
import j.l;
import j.t;
import java.io.Closeable;
import java.io.File;
import java.nio.charset.Charset;
import okhttp3.internal.Util;

public abstract class RequestBody {
  public static RequestBody create(final MediaType contentType, final f content) {
    return new RequestBody() {
        public long contentLength() {
          return content.s();
        }
        
        public MediaType contentType() {
          return contentType;
        }
        
        public void writeTo(d param1d) {
          param1d.a(content);
        }
      };
  }
  
  public static RequestBody create(final MediaType contentType, final File file) {
    if (file != null)
      return new RequestBody() {
          public long contentLength() {
            return file.length();
          }
          
          public MediaType contentType() {
            return contentType;
          }
          
          public void writeTo(d param1d) {
            t t = null;
            try {
              t t1 = l.c(file);
              t = t1;
              param1d.a(t1);
              return;
            } finally {
              Util.closeQuietly((Closeable)t);
            } 
          }
        }; 
    throw new NullPointerException("file == null");
  }
  
  public static RequestBody create(MediaType paramMediaType, String paramString) {
    Charset charset = Util.UTF_8;
    MediaType mediaType = paramMediaType;
    if (paramMediaType != null) {
      Charset charset1 = paramMediaType.charset();
      charset = charset1;
      mediaType = paramMediaType;
      if (charset1 == null) {
        charset = Util.UTF_8;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(paramMediaType);
        stringBuilder.append("; charset=utf-8");
        mediaType = MediaType.parse(stringBuilder.toString());
      } 
    } 
    return create(mediaType, paramString.getBytes(charset));
  }
  
  public static RequestBody create(MediaType paramMediaType, byte[] paramArrayOfbyte) {
    return create(paramMediaType, paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public static RequestBody create(final MediaType contentType, final byte[] content, final int offset, final int byteCount) {
    if (content != null) {
      Util.checkOffsetAndCount(content.length, offset, byteCount);
      return new RequestBody() {
          public long contentLength() {
            return byteCount;
          }
          
          public MediaType contentType() {
            return contentType;
          }
          
          public void writeTo(d param1d) {
            param1d.write(content, offset, byteCount);
          }
        };
    } 
    throw new NullPointerException("content == null");
  }
  
  public long contentLength() {
    return -1L;
  }
  
  public abstract MediaType contentType();
  
  public abstract void writeTo(d paramd);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/RequestBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */