package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import e.e.e.d.b;
import e.e.e.d.n;
import e.e.e.g.g;
import e.e.e.h.a;
import e.e.e.j.a;
import e.e.e.l.b;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;

public class c extends DalvikPurgeableDecoder {
  private static Method d;
  
  private final b c = e.e.e.l.c.b();
  
  private Bitmap a(a<g> parama, int paramInt, byte[] paramArrayOfbyte, BitmapFactory.Options paramOptions) {
    try {
      MemoryFile memoryFile2 = a(parama, paramInt, paramArrayOfbyte);
      MemoryFile memoryFile1 = memoryFile2;
    } catch (IOException iOException) {
    
    } finally {
      paramArrayOfbyte = null;
    } 
    n.a((Throwable)paramArrayOfbyte);
    throw null;
  }
  
  private static MemoryFile a(a<g> parama, int paramInt, byte[] paramArrayOfbyte) {
    int i;
    a a1;
    OutputStream outputStream3;
    if (paramArrayOfbyte == null) {
      i = 0;
    } else {
      i = paramArrayOfbyte.length;
    } 
    OutputStream outputStream2 = null;
    OutputStream outputStream1 = null;
    MemoryFile memoryFile = new MemoryFile(null, i + paramInt);
    memoryFile.allowPurging(false);
    try {
    
    } finally {
      paramArrayOfbyte = null;
      outputStream1 = null;
    } 
    a.b(parama);
    b.a((InputStream)outputStream3);
    b.a((InputStream)a1);
    b.a(outputStream1, true);
    throw paramArrayOfbyte;
  }
  
  private FileDescriptor a(MemoryFile paramMemoryFile) {
    try {
      return (FileDescriptor)a().invoke(paramMemoryFile, new Object[0]);
    } catch (Exception exception) {
      n.a(exception);
      throw null;
    } 
  }
  
  private Method a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic com/facebook/imagepipeline/platform/c.d : Ljava/lang/reflect/Method;
    //   5: astore_1
    //   6: aload_1
    //   7: ifnonnull -> 35
    //   10: ldc android/os/MemoryFile
    //   12: ldc 'getFileDescriptor'
    //   14: iconst_0
    //   15: anewarray java/lang/Class
    //   18: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   21: putstatic com/facebook/imagepipeline/platform/c.d : Ljava/lang/reflect/Method;
    //   24: goto -> 35
    //   27: astore_1
    //   28: aload_1
    //   29: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/RuntimeException;
    //   32: pop
    //   33: aconst_null
    //   34: athrow
    //   35: getstatic com/facebook/imagepipeline/platform/c.d : Ljava/lang/reflect/Method;
    //   38: astore_1
    //   39: aload_0
    //   40: monitorexit
    //   41: aload_1
    //   42: areturn
    //   43: astore_1
    //   44: aload_0
    //   45: monitorexit
    //   46: aload_1
    //   47: athrow
    // Exception table:
    //   from	to	target	type
    //   2	6	43	finally
    //   10	24	27	java/lang/Exception
    //   10	24	43	finally
    //   28	33	43	finally
    //   35	39	43	finally
  }
  
  protected Bitmap a(a<g> parama, int paramInt, BitmapFactory.Options paramOptions) {
    byte[] arrayOfByte;
    if (DalvikPurgeableDecoder.a(parama, paramInt)) {
      arrayOfByte = null;
    } else {
      arrayOfByte = DalvikPurgeableDecoder.b;
    } 
    return a(parama, paramInt, arrayOfByte, paramOptions);
  }
  
  protected Bitmap a(a<g> parama, BitmapFactory.Options paramOptions) {
    return a(parama, ((g)parama.b()).size(), null, paramOptions);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/platform/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */