package com.facebook.imagepipeline.nativecode;

import e.e.e.d.d;
import e.e.k.b;
import e.e.k.c;
import e.e.l.q.c;
import e.e.l.q.d;

@d
public class NativeJpegTranscoderFactory implements d {
  private final int a;
  
  private final boolean b;
  
  @d
  public NativeJpegTranscoderFactory(int paramInt, boolean paramBoolean) {
    this.a = paramInt;
    this.b = paramBoolean;
  }
  
  @d
  public c createImageTranscoder(c paramc, boolean paramBoolean) {
    return (paramc != b.a) ? null : new NativeJpegTranscoder(paramBoolean, this.a, this.b);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/nativecode/NativeJpegTranscoderFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */