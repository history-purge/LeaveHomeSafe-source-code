package okhttp3;

import j.c;
import j.e;
import j.f;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import okhttp3.internal.Util;

public abstract class ResponseBody implements Closeable {
  private Reader reader;
  
  private Charset charset() {
    MediaType mediaType = contentType();
    return (mediaType != null) ? mediaType.charset(Util.UTF_8) : Util.UTF_8;
  }
  
  public static ResponseBody create(final MediaType contentType, final long contentLength, final e content) {
    if (content != null)
      return new ResponseBody() {
          public long contentLength() {
            return contentLength;
          }
          
          public MediaType contentType() {
            return contentType;
          }
          
          public e source() {
            return content;
          }
        }; 
    throw new NullPointerException("source == null");
  }
  
  public static ResponseBody create(MediaType paramMediaType, f paramf) {
    c c = new c();
    c.a(paramf);
    return create(paramMediaType, paramf.s(), (e)c);
  }
  
  public static ResponseBody create(MediaType paramMediaType, String paramString) {
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
    c c = new c();
    c.a(paramString, charset);
    return create(mediaType, c.s(), (e)c);
  }
  
  public static ResponseBody create(MediaType paramMediaType, byte[] paramArrayOfbyte) {
    c c = new c();
    c.write(paramArrayOfbyte);
    return create(paramMediaType, paramArrayOfbyte.length, (e)c);
  }
  
  public final InputStream byteStream() {
    return source().n();
  }
  
  public final byte[] bytes() {
    long l = contentLength();
    if (l <= 2147483647L) {
      StringBuilder stringBuilder1;
      e e = source();
      try {
        byte[] arrayOfByte = e.h();
        Util.closeQuietly((Closeable)e);
        return arrayOfByte;
      } finally {
        Util.closeQuietly((Closeable)stringBuilder1);
      } 
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Cannot buffer entire body for content length: ");
    stringBuilder.append(l);
    throw new IOException(stringBuilder.toString());
  }
  
  public final Reader charStream() {
    Reader reader = this.reader;
    if (reader != null)
      return reader; 
    reader = new BomAwareReader(source(), charset());
    this.reader = reader;
    return reader;
  }
  
  public void close() {
    Util.closeQuietly((Closeable)source());
  }
  
  public abstract long contentLength();
  
  public abstract MediaType contentType();
  
  public abstract e source();
  
  public final String string() {
    e e = source();
    try {
      return e.a(Util.bomAwareCharset(e, charset()));
    } finally {
      Util.closeQuietly((Closeable)e);
    } 
  }
  
  static final class BomAwareReader extends Reader {
    private final Charset charset;
    
    private boolean closed;
    
    private Reader delegate;
    
    private final e source;
    
    BomAwareReader(e param1e, Charset param1Charset) {
      this.source = param1e;
      this.charset = param1Charset;
    }
    
    public void close() {
      this.closed = true;
      Reader reader = this.delegate;
      if (reader != null) {
        reader.close();
        return;
      } 
      this.source.close();
    }
    
    public int read(char[] param1ArrayOfchar, int param1Int1, int param1Int2) {
      if (!this.closed) {
        Reader reader2 = this.delegate;
        Reader reader1 = reader2;
        if (reader2 == null) {
          Charset charset = Util.bomAwareCharset(this.source, this.charset);
          reader1 = new InputStreamReader(this.source.n(), charset);
          this.delegate = reader1;
        } 
        return reader1.read(param1ArrayOfchar, param1Int1, param1Int2);
      } 
      throw new IOException("Stream closed");
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/ResponseBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */