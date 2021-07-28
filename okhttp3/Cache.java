package okhttp3;

import j.c;
import j.d;
import j.e;
import j.f;
import j.g;
import j.h;
import j.l;
import j.s;
import j.t;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.cache.InternalCache;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;

public final class Cache implements Closeable, Flushable {
  private static final int ENTRY_BODY = 1;
  
  private static final int ENTRY_COUNT = 2;
  
  private static final int ENTRY_METADATA = 0;
  
  private static final int VERSION = 201105;
  
  final DiskLruCache cache;
  
  private int hitCount;
  
  final InternalCache internalCache = new InternalCache() {
      public Response get(Request param1Request) {
        return Cache.this.get(param1Request);
      }
      
      public CacheRequest put(Response param1Response) {
        return Cache.this.put(param1Response);
      }
      
      public void remove(Request param1Request) {
        Cache.this.remove(param1Request);
      }
      
      public void trackConditionalCacheHit() {
        Cache.this.trackConditionalCacheHit();
      }
      
      public void trackResponse(CacheStrategy param1CacheStrategy) {
        Cache.this.trackResponse(param1CacheStrategy);
      }
      
      public void update(Response param1Response1, Response param1Response2) {
        Cache.this.update(param1Response1, param1Response2);
      }
    };
  
  private int networkCount;
  
  private int requestCount;
  
  int writeAbortCount;
  
  int writeSuccessCount;
  
  public Cache(File paramFile, long paramLong) {
    this(paramFile, paramLong, FileSystem.SYSTEM);
  }
  
  Cache(File paramFile, long paramLong, FileSystem paramFileSystem) {
    this.cache = DiskLruCache.create(paramFileSystem, paramFile, 201105, 2, paramLong);
  }
  
  private void abortQuietly(DiskLruCache.Editor paramEditor) {
    if (paramEditor != null)
      try {
        paramEditor.abort();
        return;
      } catch (IOException iOException) {
        return;
      }  
  }
  
  public static String key(HttpUrl paramHttpUrl) {
    return f.d(paramHttpUrl.toString()).d().b();
  }
  
  static int readInt(e parame) {
    try {
      long l = parame.l();
      String str = parame.g();
      if (l >= 0L && l <= 2147483647L && str.isEmpty())
        return (int)l; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("expected an int but was \"");
      stringBuilder.append(l);
      stringBuilder.append(str);
      stringBuilder.append("\"");
      throw new IOException(stringBuilder.toString());
    } catch (NumberFormatException numberFormatException) {
      throw new IOException(numberFormatException.getMessage());
    } 
  }
  
  public void close() {
    this.cache.close();
  }
  
  public void delete() {
    this.cache.delete();
  }
  
  public File directory() {
    return this.cache.getDirectory();
  }
  
  public void evictAll() {
    this.cache.evictAll();
  }
  
  public void flush() {
    this.cache.flush();
  }
  
  Response get(Request paramRequest) {
    String str = key(paramRequest.url());
    try {
      Response response;
      DiskLruCache.Snapshot snapshot = this.cache.get(str);
      if (snapshot == null)
        return null; 
      try {
        Entry entry = new Entry(snapshot.getSource(0));
        response = entry.response(snapshot);
        if (!entry.matches(paramRequest, response)) {
          Util.closeQuietly(response.body());
          return null;
        } 
        return response;
      } catch (IOException iOException) {}
      Util.closeQuietly(response);
      return null;
    } catch (IOException iOException) {
      return null;
    } 
  }
  
  public int hitCount() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield hitCount : I
    //   6: istore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: iload_1
    //   10: ireturn
    //   11: astore_2
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_2
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  public void initialize() {
    this.cache.initialize();
  }
  
  public boolean isClosed() {
    return this.cache.isClosed();
  }
  
  public long maxSize() {
    return this.cache.getMaxSize();
  }
  
  public int networkCount() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield networkCount : I
    //   6: istore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: iload_1
    //   10: ireturn
    //   11: astore_2
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_2
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  CacheRequest put(Response paramResponse) {
    String str = paramResponse.request().method();
    if (HttpMethod.invalidatesCache(paramResponse.request().method()))
      try {
        remove(paramResponse.request());
        return null;
      } catch (IOException null) {
        return null;
      }  
    if (!str.equals("GET"))
      return null; 
    if (HttpHeaders.hasVaryAll((Response)iOException))
      return null; 
    Entry entry = new Entry((Response)iOException);
    try {
      DiskLruCache.Editor editor = this.cache.edit(key(iOException.request().url()));
      if (editor == null)
        return null; 
      try {
        entry.writeTo(editor);
        return new CacheRequestImpl(editor);
      } catch (IOException iOException1) {}
    } catch (IOException iOException) {
      iOException = null;
    } 
    abortQuietly((DiskLruCache.Editor)iOException);
    return null;
  }
  
  void remove(Request paramRequest) {
    this.cache.remove(key(paramRequest.url()));
  }
  
  public int requestCount() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield requestCount : I
    //   6: istore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: iload_1
    //   10: ireturn
    //   11: astore_2
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_2
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  public long size() {
    return this.cache.size();
  }
  
  void trackConditionalCacheHit() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_0
    //   4: getfield hitCount : I
    //   7: iconst_1
    //   8: iadd
    //   9: putfield hitCount : I
    //   12: aload_0
    //   13: monitorexit
    //   14: return
    //   15: astore_1
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_1
    //   19: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	15	finally
  }
  
  void trackResponse(CacheStrategy paramCacheStrategy) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_0
    //   4: getfield requestCount : I
    //   7: iconst_1
    //   8: iadd
    //   9: putfield requestCount : I
    //   12: aload_1
    //   13: getfield networkRequest : Lokhttp3/Request;
    //   16: ifnull -> 32
    //   19: aload_0
    //   20: aload_0
    //   21: getfield networkCount : I
    //   24: iconst_1
    //   25: iadd
    //   26: putfield networkCount : I
    //   29: goto -> 49
    //   32: aload_1
    //   33: getfield cacheResponse : Lokhttp3/Response;
    //   36: ifnull -> 49
    //   39: aload_0
    //   40: aload_0
    //   41: getfield hitCount : I
    //   44: iconst_1
    //   45: iadd
    //   46: putfield hitCount : I
    //   49: aload_0
    //   50: monitorexit
    //   51: return
    //   52: astore_1
    //   53: aload_0
    //   54: monitorexit
    //   55: aload_1
    //   56: athrow
    // Exception table:
    //   from	to	target	type
    //   2	29	52	finally
    //   32	49	52	finally
  }
  
  void update(Response paramResponse1, Response paramResponse2) {
    Entry entry = new Entry(paramResponse2);
    DiskLruCache.Snapshot snapshot = ((CacheResponseBody)paramResponse1.body()).snapshot;
    try {
      DiskLruCache.Editor editor = snapshot.edit();
      if (editor != null) {
        try {
          entry.writeTo(editor);
          editor.commit();
          return;
        } catch (IOException iOException1) {}
      } else {
        return;
      } 
    } catch (IOException iOException) {
      iOException = null;
    } 
    abortQuietly((DiskLruCache.Editor)iOException);
  }
  
  public Iterator<String> urls() {
    return new Iterator<String>() {
        boolean canRemove;
        
        final Iterator<DiskLruCache.Snapshot> delegate = Cache.this.cache.snapshots();
        
        String nextUrl;
        
        public boolean hasNext() {
          if (this.nextUrl != null)
            return true; 
          this.canRemove = false;
          while (true) {
            if (this.delegate.hasNext()) {
              DiskLruCache.Snapshot snapshot = this.delegate.next();
              try {
                this.nextUrl = l.a(snapshot.getSource(0)).g();
                return true;
              } catch (IOException iOException) {
                continue;
              } finally {
                snapshot.close();
              } 
            } 
            return false;
          } 
        }
        
        public String next() {
          if (hasNext()) {
            String str = this.nextUrl;
            this.nextUrl = null;
            this.canRemove = true;
            return str;
          } 
          throw new NoSuchElementException();
        }
        
        public void remove() {
          if (this.canRemove) {
            this.delegate.remove();
            return;
          } 
          throw new IllegalStateException("remove() before next()");
        }
      };
  }
  
  public int writeAbortCount() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield writeAbortCount : I
    //   6: istore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: iload_1
    //   10: ireturn
    //   11: astore_2
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_2
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  public int writeSuccessCount() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield writeSuccessCount : I
    //   6: istore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: iload_1
    //   10: ireturn
    //   11: astore_2
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_2
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  private final class CacheRequestImpl implements CacheRequest {
    private s body;
    
    private s cacheOut;
    
    boolean done;
    
    private final DiskLruCache.Editor editor;
    
    CacheRequestImpl(final DiskLruCache.Editor editor) {
      this.editor = editor;
      this.cacheOut = editor.newSink(1);
      this.body = (s)new g(this.cacheOut) {
          public void close() {
            synchronized (Cache.this) {
              if (Cache.CacheRequestImpl.this.done)
                return; 
              Cache.CacheRequestImpl.this.done = true;
              Cache cache = Cache.this;
              cache.writeSuccessCount++;
              super.close();
              editor.commit();
              return;
            } 
          }
        };
    }
    
    public void abort() {
      Cache cache;
      synchronized (Cache.this) {
        if (this.done)
          return; 
        this.done = true;
        Cache cache1 = Cache.this;
        cache1.writeAbortCount++;
        Util.closeQuietly((Closeable)this.cacheOut);
        try {
          this.editor.abort();
          return;
        } catch (IOException iOException) {}
      } 
    }
    
    public s body() {
      return this.body;
    }
  }
  
  class null extends g {
    null(s param1s) {
      super(param1s);
    }
    
    public void close() {
      synchronized (Cache.this) {
        if (this.this$1.done)
          return; 
        this.this$1.done = true;
        Cache cache = Cache.this;
        cache.writeSuccessCount++;
        super.close();
        editor.commit();
        return;
      } 
    }
  }
  
  private static class CacheResponseBody extends ResponseBody {
    private final e bodySource;
    
    private final String contentLength;
    
    private final String contentType;
    
    final DiskLruCache.Snapshot snapshot;
    
    CacheResponseBody(final DiskLruCache.Snapshot snapshot, String param1String1, String param1String2) {
      this.snapshot = snapshot;
      this.contentType = param1String1;
      this.contentLength = param1String2;
      this.bodySource = l.a((t)new h(snapshot.getSource(1)) {
            public void close() {
              snapshot.close();
              super.close();
            }
          });
    }
    
    public long contentLength() {
      long l = -1L;
      try {
        if (this.contentLength != null)
          l = Long.parseLong(this.contentLength); 
        return l;
      } catch (NumberFormatException numberFormatException) {
        return -1L;
      } 
    }
    
    public MediaType contentType() {
      String str = this.contentType;
      return (str != null) ? MediaType.parse(str) : null;
    }
    
    public e source() {
      return this.bodySource;
    }
  }
  
  class null extends h {
    null(t param1t) {
      super(param1t);
    }
    
    public void close() {
      snapshot.close();
      super.close();
    }
  }
  
  private static final class Entry {
    private static final String RECEIVED_MILLIS;
    
    private static final String SENT_MILLIS;
    
    private final int code;
    
    private final Handshake handshake;
    
    private final String message;
    
    private final Protocol protocol;
    
    private final long receivedResponseMillis;
    
    private final String requestMethod;
    
    private final Headers responseHeaders;
    
    private final long sentRequestMillis;
    
    private final String url;
    
    private final Headers varyHeaders;
    
    static {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(Platform.get().getPrefix());
      stringBuilder.append("-Sent-Millis");
      SENT_MILLIS = stringBuilder.toString();
      stringBuilder = new StringBuilder();
      stringBuilder.append(Platform.get().getPrefix());
      stringBuilder.append("-Received-Millis");
      RECEIVED_MILLIS = stringBuilder.toString();
    }
    
    Entry(t param1t) {
      try {
        e e = l.a(param1t);
        this.url = e.g();
        this.requestMethod = e.g();
        Headers.Builder builder2 = new Headers.Builder();
        int j = Cache.readInt(e);
        boolean bool = false;
        int i;
        for (i = 0; i < j; i++)
          builder2.addLenient(e.g()); 
        this.varyHeaders = builder2.build();
        StatusLine statusLine = StatusLine.parse(e.g());
        this.protocol = statusLine.protocol;
        this.code = statusLine.code;
        this.message = statusLine.message;
        Headers.Builder builder1 = new Headers.Builder();
        j = Cache.readInt(e);
        for (i = bool; i < j; i++)
          builder1.addLenient(e.g()); 
        String str1 = builder1.get(SENT_MILLIS);
        String str2 = builder1.get(RECEIVED_MILLIS);
        builder1.removeAll(SENT_MILLIS);
        builder1.removeAll(RECEIVED_MILLIS);
        long l2 = 0L;
        if (str1 != null) {
          l1 = Long.parseLong(str1);
        } else {
          l1 = 0L;
        } 
        this.sentRequestMillis = l1;
        long l1 = l2;
        if (str2 != null)
          l1 = Long.parseLong(str2); 
        this.receivedResponseMillis = l1;
        this.responseHeaders = builder1.build();
        if (isHttps()) {
          CipherSuite cipherSuite;
          String str = e.g();
          if (str.length() <= 0) {
            TlsVersion tlsVersion;
            cipherSuite = CipherSuite.forJavaName(e.g());
            List<Certificate> list1 = readCertificateList(e);
            List<Certificate> list2 = readCertificateList(e);
            if (!e.j()) {
              tlsVersion = TlsVersion.forJavaName(e.g());
            } else {
              tlsVersion = TlsVersion.SSL_3_0;
            } 
            this.handshake = Handshake.get(tlsVersion, cipherSuite, list1, list2);
          } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("expected \"\" but was \"");
            stringBuilder.append((String)cipherSuite);
            stringBuilder.append("\"");
            throw new IOException(stringBuilder.toString());
          } 
        } else {
          this.handshake = null;
        } 
        return;
      } finally {
        param1t.close();
      } 
    }
    
    Entry(Response param1Response) {
      this.url = param1Response.request().url().toString();
      this.varyHeaders = HttpHeaders.varyHeaders(param1Response);
      this.requestMethod = param1Response.request().method();
      this.protocol = param1Response.protocol();
      this.code = param1Response.code();
      this.message = param1Response.message();
      this.responseHeaders = param1Response.headers();
      this.handshake = param1Response.handshake();
      this.sentRequestMillis = param1Response.sentRequestAtMillis();
      this.receivedResponseMillis = param1Response.receivedResponseAtMillis();
    }
    
    private boolean isHttps() {
      return this.url.startsWith("https://");
    }
    
    private List<Certificate> readCertificateList(e param1e) {
      int i = Cache.readInt(param1e);
      if (i == -1)
        return Collections.emptyList(); 
      try {
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        ArrayList<Certificate> arrayList = new ArrayList(i);
        for (int j = 0; j < i; j++) {
          String str = param1e.g();
          c c = new c();
          c.a(f.a(str));
          arrayList.add(certificateFactory.generateCertificate(c.n()));
        } 
        return arrayList;
      } catch (CertificateException certificateException) {
        IOException iOException = new IOException(certificateException.getMessage());
        throw iOException;
      } 
    }
    
    private void writeCertList(d param1d, List<Certificate> param1List) {
      try {
        param1d.i(param1List.size()).writeByte(10);
        int i = 0;
        int j = param1List.size();
        while (i < j) {
          param1d.a(f.a(((Certificate)param1List.get(i)).getEncoded()).a()).writeByte(10);
          i++;
        } 
        return;
      } catch (CertificateEncodingException certificateEncodingException) {
        IOException iOException = new IOException(certificateEncodingException.getMessage());
        throw iOException;
      } 
    }
    
    public boolean matches(Request param1Request, Response param1Response) {
      return (this.url.equals(param1Request.url().toString()) && this.requestMethod.equals(param1Request.method()) && HttpHeaders.varyMatches(param1Response, this.varyHeaders, param1Request));
    }
    
    public Response response(DiskLruCache.Snapshot param1Snapshot) {
      String str1 = this.responseHeaders.get("Content-Type");
      String str2 = this.responseHeaders.get("Content-Length");
      Request request = (new Request.Builder()).url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build();
      return (new Response.Builder()).request(request).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new Cache.CacheResponseBody(param1Snapshot, str1, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
    }
    
    public void writeTo(DiskLruCache.Editor param1Editor) {
      boolean bool = false;
      d d = l.a(param1Editor.newSink(0));
      d.a(this.url).writeByte(10);
      d.a(this.requestMethod).writeByte(10);
      d.i(this.varyHeaders.size()).writeByte(10);
      int j = this.varyHeaders.size();
      int i;
      for (i = 0; i < j; i++)
        d.a(this.varyHeaders.name(i)).a(": ").a(this.varyHeaders.value(i)).writeByte(10); 
      d.a((new StatusLine(this.protocol, this.code, this.message)).toString()).writeByte(10);
      d.i((this.responseHeaders.size() + 2)).writeByte(10);
      j = this.responseHeaders.size();
      for (i = bool; i < j; i++)
        d.a(this.responseHeaders.name(i)).a(": ").a(this.responseHeaders.value(i)).writeByte(10); 
      d.a(SENT_MILLIS).a(": ").i(this.sentRequestMillis).writeByte(10);
      d.a(RECEIVED_MILLIS).a(": ").i(this.receivedResponseMillis).writeByte(10);
      if (isHttps()) {
        d.writeByte(10);
        d.a(this.handshake.cipherSuite().javaName()).writeByte(10);
        writeCertList(d, this.handshake.peerCertificates());
        writeCertList(d, this.handshake.localCertificates());
        d.a(this.handshake.tlsVersion().javaName()).writeByte(10);
      } 
      d.close();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/Cache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */