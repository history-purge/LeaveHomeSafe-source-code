package com.google.firebase.installations;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;

class g {
  private final FileChannel a;
  
  private final FileLock b;
  
  private g(FileChannel paramFileChannel, FileLock paramFileLock) {
    this.a = paramFileChannel;
    this.b = paramFileLock;
  }
  
  static g a(Context paramContext, String paramString) {
    String str;
    try {
      FileChannel fileChannel = (new RandomAccessFile(new File(paramContext.getFilesDir(), paramString), "rw")).getChannel();
      try {
        FileLock fileLock = fileChannel.lock();
        try {
          return new g(fileChannel, fileLock);
        } catch (IOException iOException) {
        
        } catch (Error error) {
        
        } catch (OverlappingFileLockException null) {}
      } catch (IOException iOException) {
        paramString = null;
      } catch (Error error) {
      
      } catch (OverlappingFileLockException null) {}
    } catch (IOException iOException) {
      str = null;
      paramString = str;
    } catch (Error error) {
    
    } catch (OverlappingFileLockException overlappingFileLockException) {}
    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", overlappingFileLockException);
    if (paramString != null)
      try {
        paramString.release();
      } catch (IOException iOException) {} 
    if (str != null)
      try {
        str.close();
        return null;
      } catch (IOException iOException) {
        return null;
      }  
    return null;
  }
  
  void a() {
    try {
      this.b.release();
      this.a.close();
      return;
    } catch (IOException iOException) {
      Log.e("CrossProcessLock", "encountered error while releasing, ignoring", iOException);
      return;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/installations/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */