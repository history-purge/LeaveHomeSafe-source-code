package okhttp3.internal.io;

import j.l;
import j.s;
import j.t;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface FileSystem {
  public static final FileSystem SYSTEM = new FileSystem() {
      public s appendingSink(File param1File) {
        try {
          return l.a(param1File);
        } catch (FileNotFoundException fileNotFoundException) {
          param1File.getParentFile().mkdirs();
          return l.a(param1File);
        } 
      }
      
      public void delete(File param1File) {
        if (!param1File.delete()) {
          if (!param1File.exists())
            return; 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("failed to delete ");
          stringBuilder.append(param1File);
          throw new IOException(stringBuilder.toString());
        } 
      }
      
      public void deleteContents(File param1File) {
        File[] arrayOfFile = param1File.listFiles();
        if (arrayOfFile != null) {
          int j = arrayOfFile.length;
          int i = 0;
          while (i < j) {
            param1File = arrayOfFile[i];
            if (param1File.isDirectory())
              deleteContents(param1File); 
            if (param1File.delete()) {
              i++;
              continue;
            } 
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append("failed to delete ");
            stringBuilder1.append(param1File);
            throw new IOException(stringBuilder1.toString());
          } 
          return;
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("not a readable directory: ");
        stringBuilder.append(param1File);
        IOException iOException = new IOException(stringBuilder.toString());
        throw iOException;
      }
      
      public boolean exists(File param1File) {
        return param1File.exists();
      }
      
      public void rename(File param1File1, File param1File2) {
        delete(param1File2);
        if (param1File1.renameTo(param1File2))
          return; 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("failed to rename ");
        stringBuilder.append(param1File1);
        stringBuilder.append(" to ");
        stringBuilder.append(param1File2);
        throw new IOException(stringBuilder.toString());
      }
      
      public s sink(File param1File) {
        try {
          return l.b(param1File);
        } catch (FileNotFoundException fileNotFoundException) {
          param1File.getParentFile().mkdirs();
          return l.b(param1File);
        } 
      }
      
      public long size(File param1File) {
        return param1File.length();
      }
      
      public t source(File param1File) {
        return l.c(param1File);
      }
    };
  
  s appendingSink(File paramFile);
  
  void delete(File paramFile);
  
  void deleteContents(File paramFile);
  
  boolean exists(File paramFile);
  
  void rename(File paramFile1, File paramFile2);
  
  s sink(File paramFile);
  
  long size(File paramFile);
  
  t source(File paramFile);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/io/FileSystem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */