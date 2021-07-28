package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import java.io.File;
import java.util.zip.ZipEntry;

public class a extends f {
  private final int h;
  
  public a(Context paramContext, File paramFile, String paramString, int paramInt) {
    super(paramContext, paramString, paramFile, "^lib/([^/]+)/([^/]+\\.so)$");
    this.h = paramInt;
  }
  
  protected byte[] a() {
    null = this.f.getCanonicalFile();
    Parcel parcel = Parcel.obtain();
    try {
      byte[] arrayOfByte2;
      parcel.writeByte((byte)2);
      parcel.writeString(null.getPath());
      parcel.writeLong(null.lastModified());
      parcel.writeInt(SysUtil.a(this.c));
      if ((this.h & 0x1) == 0) {
        parcel.writeByte((byte)0);
        arrayOfByte2 = parcel.marshall();
        return arrayOfByte2;
      } 
      String str = (this.c.getApplicationInfo()).nativeLibraryDir;
      if (str == null) {
        parcel.writeByte((byte)1);
        arrayOfByte2 = parcel.marshall();
        return arrayOfByte2;
      } 
      File file = (new File((String)arrayOfByte2)).getCanonicalFile();
      if (!file.exists()) {
        parcel.writeByte((byte)1);
        arrayOfByte1 = parcel.marshall();
        return arrayOfByte1;
      } 
      parcel.writeByte((byte)2);
      parcel.writeString(arrayOfByte1.getPath());
      parcel.writeLong(arrayOfByte1.lastModified());
      byte[] arrayOfByte1 = parcel.marshall();
      return arrayOfByte1;
    } finally {
      parcel.recycle();
    } 
  }
  
  protected n.f b() {
    return new a(this, this);
  }
  
  protected class a extends f.c {
    private File g;
    
    private final int h;
    
    a(a this$0, f param1f) {
      super(this$0, param1f);
      this.g = new File((this$0.c.getApplicationInfo()).nativeLibraryDir);
      this.h = a.a(this$0);
    }
    
    protected boolean a(ZipEntry param1ZipEntry, String param1String) {
      String str1;
      String str2 = param1ZipEntry.getName();
      boolean bool1 = param1String.equals(this.i.d);
      boolean bool = true;
      if (bool1) {
        this.i.d = null;
        str1 = String.format("allowing consideration of corrupted lib %s", new Object[] { param1String });
      } else if ((this.h & 0x1) == 0) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("allowing consideration of ");
        stringBuilder.append(str2);
        stringBuilder.append(": self-extraction preferred");
        str1 = stringBuilder.toString();
      } else {
        File file = new File(this.g, param1String);
        if (!file.isFile()) {
          str1 = String.format("allowing considering of %s: %s not in system lib dir", new Object[] { str2, param1String });
        } else {
          long l1 = file.length();
          long l2 = str1.getSize();
          if (l1 != l2) {
            str1 = String.format("allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK", new Object[] { file, Long.valueOf(l1), Long.valueOf(l2) });
          } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("not allowing consideration of ");
            stringBuilder.append(str2);
            stringBuilder.append(": deferring to libdir");
            str1 = stringBuilder.toString();
            bool = false;
          } 
        } 
      } 
      Log.d("ApkSoSource", str1);
      return bool;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/soloader/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */