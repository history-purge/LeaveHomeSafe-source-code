package com.google.mlkit.vision.text.internal;

import e.f.a.e.i.k.z7;
import e.f.b.a.c.d;
import e.f.b.b.b.c;
import e.f.b.b.b.d;

public final class b {
  private final e a;
  
  private final d b;
  
  b(e parame, d paramd) {
    this.a = parame;
    this.b = paramd;
  }
  
  public final c a() {
    return a(TextRecognizerImpl.a());
  }
  
  public final c a(d paramd) {
    return new TextRecognizerImpl(this.a, this.b.a(paramd.a()), z7.a("play-services-mlkit-text-recognition"));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/mlkit/vision/text/internal/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */