package com.google.mlkit.vision.text.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import e.f.a.e.i.k.l7;
import e.f.a.e.i.k.r7;
import e.f.a.e.i.k.v5;
import e.f.a.e.i.k.x5;
import e.f.a.e.i.k.z6;
import e.f.a.e.m.l;
import e.f.b.b.a.a;
import e.f.b.b.b.a;
import e.f.b.b.b.c;
import e.f.b.b.b.d;
import java.util.concurrent.Executor;

public class TextRecognizerImpl extends MobileVisionBase<a> implements c {
  private static final d i = (new d.a()).a();
  
  TextRecognizerImpl(e parame, Executor paramExecutor, r7 paramr7) {
    super(parame, paramExecutor);
    x5 x5 = new x5();
    x5.a(Boolean.valueOf(false));
    x5.a((new z6()).a());
    paramr7.a(l7.a(x5), v5.h);
  }
  
  public final l<a> a(@RecentlyNonNull a parama) {
    return b(parama);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/mlkit/vision/text/internal/TextRecognizerImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */