package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;

public final class g implements Closeable {
  private final FileOutputStream c;
  
  private final FileLock d;
  
  private g(File paramFile) {
    this.c = new FileOutputStream(paramFile);
    try {
      FileLock fileLock = this.c.getChannel().lock();
      if (fileLock == null)
        this.c.close(); 
      return;
    } finally {
      this.c.close();
    } 
  }
  
  public static g a(File paramFile) {
    return new g(paramFile);
  }
  
  public void close() {
    try {
      if (this.d != null)
        this.d.release(); 
      return;
    } finally {
      this.c.close();
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/soloader/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */