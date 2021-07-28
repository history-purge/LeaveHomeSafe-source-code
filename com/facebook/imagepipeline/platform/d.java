package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.imagepipeline.memory.q;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import e.e.e.d.i;
import e.e.e.g.g;
import e.e.e.h.a;

@TargetApi(19)
public class d extends DalvikPurgeableDecoder {
  private final q c;
  
  public d(q paramq) {
    this.c = paramq;
  }
  
  private static void a(byte[] paramArrayOfbyte, int paramInt) {
    paramArrayOfbyte[paramInt] = -1;
    paramArrayOfbyte[paramInt + 1] = -39;
  }
  
  protected Bitmap a(a<g> parama, int paramInt, BitmapFactory.Options paramOptions) {
    boolean bool;
    byte[] arrayOfByte;
    if (DalvikPurgeableDecoder.a(parama, paramInt)) {
      arrayOfByte = null;
    } else {
      arrayOfByte = DalvikPurgeableDecoder.b;
    } 
    g g = (g)parama.b();
    if (paramInt <= g.size()) {
      bool = true;
    } else {
      bool = false;
    } 
    i.a(bool);
    q q1 = this.c;
    int i = paramInt + 2;
    a a1 = q1.a(i);
    try {
      byte[] arrayOfByte1 = (byte[])a1.b();
      g.a(0, arrayOfByte1, 0, paramInt);
      int j = paramInt;
      if (arrayOfByte != null) {
        a(arrayOfByte1, paramInt);
        j = i;
      } 
      Bitmap bitmap = BitmapFactory.decodeByteArray(arrayOfByte1, 0, j, paramOptions);
      i.a(bitmap, "BitmapFactory returned null");
      bitmap = bitmap;
      return bitmap;
    } finally {
      a.b(a1);
    } 
  }
  
  protected Bitmap a(a<g> parama, BitmapFactory.Options paramOptions) {
    g g = (g)parama.b();
    int i = g.size();
    parama = this.c.a(i);
    try {
      byte[] arrayOfByte = (byte[])parama.b();
      g.a(0, arrayOfByte, 0, i);
      Bitmap bitmap = BitmapFactory.decodeByteArray(arrayOfByte, 0, i, paramOptions);
      i.a(bitmap, "BitmapFactory returned null");
      bitmap = bitmap;
      return bitmap;
    } finally {
      a.b(parama);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/platform/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */