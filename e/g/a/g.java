package e.g.a;

import android.annotation.TargetApi;
import android.os.Looper;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Comparator;
import java.util.PriorityQueue;

@TargetApi(9)
public class g {
  static PriorityQueue<ByteBuffer> d = new PriorityQueue<ByteBuffer>(8, new a());
  
  private static int e = 1048576;
  
  public static int f = 262144;
  
  static int g = 0;
  
  static int h = 0;
  
  private static final Object i = new Object();
  
  public static final ByteBuffer j = ByteBuffer.allocate(0);
  
  a<ByteBuffer> a = new a<ByteBuffer>();
  
  ByteOrder b = ByteOrder.BIG_ENDIAN;
  
  private int c = 0;
  
  public g() {}
  
  public g(byte[] paramArrayOfbyte) {
    a(ByteBuffer.wrap(paramArrayOfbyte));
  }
  
  private void a(int paramInt) {
    if (e() >= 0)
      this.c += paramInt; 
  }
  
  public static ByteBuffer b(int paramInt) {
    if (paramInt <= h) {
      PriorityQueue<ByteBuffer> priorityQueue = g();
      if (priorityQueue != null)
        synchronized (i) {
          while (priorityQueue.size() > 0) {
            ByteBuffer byteBuffer = priorityQueue.remove();
            if (priorityQueue.size() == 0)
              h = 0; 
            g -= byteBuffer.capacity();
            if (byteBuffer.capacity() >= paramInt)
              return byteBuffer; 
          } 
        }  
    } 
    return ByteBuffer.allocate(Math.max(8192, paramInt));
  }
  
  public static void b(ByteBuffer paramByteBuffer) {
    if (paramByteBuffer != null) {
      if (paramByteBuffer.isDirect())
        return; 
      if (paramByteBuffer.arrayOffset() == 0) {
        if ((paramByteBuffer.array()).length != paramByteBuffer.capacity())
          return; 
        if (paramByteBuffer.capacity() < 8192)
          return; 
        if (paramByteBuffer.capacity() > f)
          return; 
        PriorityQueue<ByteBuffer> priorityQueue = g();
        if (priorityQueue == null)
          return; 
        synchronized (i) {
          while (g > e && priorityQueue.size() > 0 && ((ByteBuffer)priorityQueue.peek()).capacity() < paramByteBuffer.capacity()) {
            ByteBuffer byteBuffer = priorityQueue.remove();
            g -= byteBuffer.capacity();
          } 
          if (g > e)
            return; 
          paramByteBuffer.position(0);
          paramByteBuffer.limit(paramByteBuffer.capacity());
          g += paramByteBuffer.capacity();
          priorityQueue.add(paramByteBuffer);
          h = Math.max(h, paramByteBuffer.capacity());
          return;
        } 
      } 
    } 
  }
  
  private ByteBuffer c(int paramInt) {
    if (e() >= paramInt) {
      ByteBuffer byteBuffer1;
      while (true) {
        byteBuffer1 = this.a.peek();
        if (byteBuffer1 != null && !byteBuffer1.hasRemaining()) {
          b(this.a.remove());
          continue;
        } 
        break;
      } 
      if (byteBuffer1 == null)
        return j; 
      if (byteBuffer1.remaining() >= paramInt)
        return byteBuffer1.order(this.b); 
      ByteBuffer byteBuffer2 = b(paramInt);
      byteBuffer2.limit(paramInt);
      byte[] arrayOfByte = byteBuffer2.array();
      int i = 0;
      while (true) {
        byteBuffer1 = null;
        while (i < paramInt) {
          ByteBuffer byteBuffer = this.a.remove();
          int j = Math.min(paramInt - i, byteBuffer.remaining());
          byteBuffer.get(arrayOfByte, i, j);
          j = i + j;
          i = j;
          byteBuffer1 = byteBuffer;
          if (byteBuffer.remaining() == 0) {
            b(byteBuffer);
            i = j;
          } 
        } 
        if (byteBuffer1 != null && byteBuffer1.remaining() > 0)
          this.a.addFirst(byteBuffer1); 
        this.a.addFirst(byteBuffer2);
        byteBuffer1 = byteBuffer2;
        // Byte code: goto -> 67
      } 
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("count : ");
    stringBuilder.append(e());
    stringBuilder.append("/");
    stringBuilder.append(paramInt);
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
    throw illegalArgumentException;
  }
  
  private static PriorityQueue<ByteBuffer> g() {
    return (Thread.currentThread() == Looper.getMainLooper().getThread()) ? null : d;
  }
  
  public g a(ByteBuffer paramByteBuffer) {
    if (paramByteBuffer.remaining() <= 0) {
      b(paramByteBuffer);
      return this;
    } 
    a(paramByteBuffer.remaining());
    if (this.a.size() > 0) {
      ByteBuffer byteBuffer = this.a.getLast();
      if (byteBuffer.capacity() - byteBuffer.limit() >= paramByteBuffer.remaining()) {
        byteBuffer.mark();
        byteBuffer.position(byteBuffer.limit());
        byteBuffer.limit(byteBuffer.capacity());
        byteBuffer.put(paramByteBuffer);
        byteBuffer.limit(byteBuffer.position());
        byteBuffer.reset();
        b(paramByteBuffer);
        f();
        return this;
      } 
    } 
    this.a.add(paramByteBuffer);
    f();
    return this;
  }
  
  public g a(ByteBuffer... paramVarArgs) {
    int j = paramVarArgs.length;
    for (int i = 0; i < j; i++)
      a(paramVarArgs[i]); 
    return this;
  }
  
  public void a(byte[] paramArrayOfbyte) {
    a(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (e() >= paramInt2) {
      int i = paramInt1;
      paramInt1 = paramInt2;
      while (paramInt1 > 0) {
        ByteBuffer byteBuffer = this.a.peek();
        int k = Math.min(byteBuffer.remaining(), paramInt1);
        if (paramArrayOfbyte != null)
          byteBuffer.get(paramArrayOfbyte, i, k); 
        int j = paramInt1 - k;
        k = i + k;
        i = k;
        paramInt1 = j;
        if (byteBuffer.remaining() == 0) {
          ByteBuffer byteBuffer1 = this.a.remove();
          b(byteBuffer);
          i = k;
          paramInt1 = j;
        } 
      } 
      this.c -= paramInt2;
      return;
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("length");
    throw illegalArgumentException;
  }
  
  public ByteBuffer[] a() {
    ByteBuffer[] arrayOfByteBuffer = new ByteBuffer[this.a.size()];
    arrayOfByteBuffer = this.a.<ByteBuffer>toArray(arrayOfByteBuffer);
    this.a.clear();
    this.c = 0;
    return arrayOfByteBuffer;
  }
  
  public byte[] b() {
    if (this.a.size() == 1) {
      ByteBuffer byteBuffer = this.a.peek();
      if (byteBuffer.capacity() == e() && byteBuffer.isDirect()) {
        this.c = 0;
        return ((ByteBuffer)this.a.remove()).array();
      } 
    } 
    byte[] arrayOfByte = new byte[e()];
    a(arrayOfByte);
    return arrayOfByte;
  }
  
  public boolean c() {
    return (e() > 0);
  }
  
  public void d() {
    while (this.a.size() > 0)
      b(this.a.remove()); 
    this.c = 0;
  }
  
  public int e() {
    return this.c;
  }
  
  public void f() {
    c(0);
  }
  
  static class a implements Comparator<ByteBuffer> {
    public int a(ByteBuffer param1ByteBuffer1, ByteBuffer param1ByteBuffer2) {
      return (param1ByteBuffer1.capacity() == param1ByteBuffer2.capacity()) ? 0 : ((param1ByteBuffer1.capacity() > param1ByteBuffer2.capacity()) ? 1 : -1);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/g/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */