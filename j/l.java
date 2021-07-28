package j;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class l {
  static final Logger a = Logger.getLogger(l.class.getName());
  
  public static d a(s params) {
    return new n(params);
  }
  
  public static e a(t paramt) {
    return new o(paramt);
  }
  
  public static s a() {
    return new c();
  }
  
  public static s a(File paramFile) {
    if (paramFile != null)
      return a(new FileOutputStream(paramFile, true)); 
    throw new IllegalArgumentException("file == null");
  }
  
  public static s a(OutputStream paramOutputStream) {
    return a(paramOutputStream, new u());
  }
  
  private static s a(OutputStream paramOutputStream, u paramu) {
    if (paramOutputStream != null) {
      if (paramu != null)
        return new a(paramu, paramOutputStream); 
      throw new IllegalArgumentException("timeout == null");
    } 
    throw new IllegalArgumentException("out == null");
  }
  
  public static s a(Socket paramSocket) {
    if (paramSocket != null) {
      if (paramSocket.getOutputStream() != null) {
        a a = c(paramSocket);
        return a.sink(a(paramSocket.getOutputStream(), a));
      } 
      throw new IOException("socket's output stream == null");
    } 
    throw new IllegalArgumentException("socket == null");
  }
  
  public static t a(InputStream paramInputStream) {
    return a(paramInputStream, new u());
  }
  
  private static t a(InputStream paramInputStream, u paramu) {
    if (paramInputStream != null) {
      if (paramu != null)
        return new b(paramu, paramInputStream); 
      throw new IllegalArgumentException("timeout == null");
    } 
    throw new IllegalArgumentException("in == null");
  }
  
  static boolean a(AssertionError paramAssertionError) {
    return (paramAssertionError.getCause() != null && paramAssertionError.getMessage() != null && paramAssertionError.getMessage().contains("getsockname failed"));
  }
  
  public static s b(File paramFile) {
    if (paramFile != null)
      return a(new FileOutputStream(paramFile)); 
    throw new IllegalArgumentException("file == null");
  }
  
  public static t b(Socket paramSocket) {
    if (paramSocket != null) {
      if (paramSocket.getInputStream() != null) {
        a a = c(paramSocket);
        return a.source(a(paramSocket.getInputStream(), a));
      } 
      throw new IOException("socket's input stream == null");
    } 
    throw new IllegalArgumentException("socket == null");
  }
  
  private static a c(Socket paramSocket) {
    return new d(paramSocket);
  }
  
  public static t c(File paramFile) {
    if (paramFile != null)
      return a(new FileInputStream(paramFile)); 
    throw new IllegalArgumentException("file == null");
  }
  
  final class a implements s {
    a(l this$0, OutputStream param1OutputStream) {}
    
    public void close() {
      this.d.close();
    }
    
    public void flush() {
      this.d.flush();
    }
    
    public u timeout() {
      return this.c;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("sink(");
      stringBuilder.append(this.d);
      stringBuilder.append(")");
      return stringBuilder.toString();
    }
    
    public void write(c param1c, long param1Long) {
      v.a(param1c.d, 0L, param1Long);
      while (param1Long > 0L) {
        this.c.throwIfReached();
        p p = param1c.c;
        int i = (int)Math.min(param1Long, (p.c - p.b));
        this.d.write(p.a, p.b, i);
        p.b += i;
        long l2 = i;
        long l1 = param1Long - l2;
        param1c.d -= l2;
        param1Long = l1;
        if (p.b == p.c) {
          param1c.c = p.b();
          q.a(p);
          param1Long = l1;
        } 
      } 
    }
  }
  
  final class b implements t {
    b(l this$0, InputStream param1InputStream) {}
    
    public void close() {
      this.d.close();
    }
    
    public long read(c param1c, long param1Long) {
      if (param1Long >= 0L) {
        if (param1Long == 0L)
          return 0L; 
        try {
          this.c.throwIfReached();
          p p = param1c.b(1);
          int i = (int)Math.min(param1Long, (8192 - p.c));
          i = this.d.read(p.a, p.c, i);
          if (i == -1)
            return -1L; 
          p.c += i;
          param1Long = param1c.d;
          long l = i;
          param1c.d = param1Long + l;
          return l;
        } catch (AssertionError assertionError) {
          if (l.a(assertionError))
            throw new IOException(assertionError); 
          throw assertionError;
        } 
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("byteCount < 0: ");
      stringBuilder.append(param1Long);
      throw new IllegalArgumentException(stringBuilder.toString());
    }
    
    public u timeout() {
      return this.c;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("source(");
      stringBuilder.append(this.d);
      stringBuilder.append(")");
      return stringBuilder.toString();
    }
  }
  
  final class c implements s {
    public void close() {}
    
    public void flush() {}
    
    public u timeout() {
      return u.NONE;
    }
    
    public void write(c param1c, long param1Long) {
      param1c.skip(param1Long);
    }
  }
  
  final class d extends a {
    d(l this$0) {}
    
    protected IOException newTimeoutException(IOException param1IOException) {
      SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
      if (param1IOException != null)
        socketTimeoutException.initCause(param1IOException); 
      return socketTimeoutException;
    }
    
    protected void timedOut() {
      Logger logger;
      Level level;
      StringBuilder stringBuilder;
      try {
        this.a.close();
        return;
      } catch (Exception exception) {
        logger = l.a;
        level = Level.WARNING;
        stringBuilder = new StringBuilder();
      } catch (AssertionError assertionError) {
        if (l.a(assertionError)) {
          logger = l.a;
          level = Level.WARNING;
          stringBuilder = new StringBuilder();
        } else {
          throw assertionError;
        } 
      } 
      stringBuilder.append("Failed to close timed out socket ");
      stringBuilder.append(this.a);
      logger.log(level, stringBuilder.toString(), assertionError);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/j/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */