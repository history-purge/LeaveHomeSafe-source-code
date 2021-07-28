package e.f.a.b;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.CamcorderProfile;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b.g.j.h;
import b.g.j.i;
import b.g.m.v;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.SortedSet;

public class e extends FrameLayout {
  f c;
  
  private final c d;
  
  private boolean e;
  
  private Context f;
  
  private final h g;
  
  protected HandlerThread h;
  
  protected Handler i;
  
  public e(Context paramContext, AttributeSet paramAttributeSet, int paramInt, boolean paramBoolean) {
    super(paramContext, paramAttributeSet, paramInt);
    b b;
    c c1;
    this.h = new HandlerThread("RNCamera-Handler-Thread");
    this.h.start();
    this.i = new Handler(this.h.getLooper());
    if (isInEditMode()) {
      this.d = null;
      this.g = null;
      return;
    } 
    this.e = true;
    this.f = paramContext;
    i i = a(paramContext);
    this.d = new c(this);
    if (paramBoolean || Build.VERSION.SDK_INT < 21 || c.a(paramContext)) {
      b = new b(this.d, i, this.i);
    } else if (Build.VERSION.SDK_INT < 23) {
      c1 = new c(this.d, (i)b, paramContext, this.i);
    } else {
      c1 = new d(this.d, (i)c1, paramContext, this.i);
    } 
    this.c = c1;
    this.g = new a(this, paramContext);
  }
  
  public e(Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean) {
    this(paramContext, paramAttributeSet, 0, paramBoolean);
  }
  
  public e(Context paramContext, boolean paramBoolean) {
    this(paramContext, null, paramBoolean);
  }
  
  private i a(Context paramContext) {
    return (i)((Build.VERSION.SDK_INT < 14) ? new l(paramContext, (ViewGroup)this) : new m(paramContext, (ViewGroup)this));
  }
  
  public SortedSet<j> a(a parama) {
    return this.c.a(parama);
  }
  
  public void a(float paramFloat1, float paramFloat2) {
    this.c.a(paramFloat1, paramFloat2);
  }
  
  public void a(ReadableMap paramReadableMap) {
    this.c.a(paramReadableMap);
  }
  
  public void a(b paramb) {
    this.d.a(paramb);
  }
  
  public boolean a(String paramString, int paramInt1, int paramInt2, boolean paramBoolean, CamcorderProfile paramCamcorderProfile, int paramInt3, int paramInt4) {
    return this.c.a(paramString, paramInt1, paramInt2, paramBoolean, paramCamcorderProfile, paramInt3, paramInt4);
  }
  
  public void e() {
    HandlerThread handlerThread = this.h;
    if (handlerThread != null) {
      if (Build.VERSION.SDK_INT < 18) {
        handlerThread.quit();
      } else {
        handlerThread.quitSafely();
      } 
      this.h = null;
    } 
  }
  
  public boolean f() {
    return this.c.s();
  }
  
  public void g() {
    this.c.t();
  }
  
  public boolean getAdjustViewBounds() {
    return this.e;
  }
  
  public a getAspectRatio() {
    return this.c.a();
  }
  
  public boolean getAutoFocus() {
    return this.c.b();
  }
  
  public String getCameraId() {
    return this.c.c();
  }
  
  public List<Properties> getCameraIds() {
    return this.c.d();
  }
  
  public int getCameraOrientation() {
    return this.c.e();
  }
  
  public float getExposureCompensation() {
    return this.c.f();
  }
  
  public int getFacing() {
    return this.c.g();
  }
  
  public int getFlash() {
    return this.c.h();
  }
  
  public float getFocusDepth() {
    return this.c.i();
  }
  
  public j getPictureSize() {
    return this.c.j();
  }
  
  public boolean getPlaySoundOnCapture() {
    return this.c.k();
  }
  
  public j getPreviewSize() {
    return this.c.l();
  }
  
  public boolean getScanning() {
    return this.c.m();
  }
  
  public Set<a> getSupportedAspectRatios() {
    return this.c.n();
  }
  
  public ArrayList<int[]> getSupportedPreviewFpsRange() {
    return this.c.o();
  }
  
  public View getView() {
    f f1 = this.c;
    return (f1 != null) ? f1.p() : null;
  }
  
  public int getWhiteBalance() {
    return this.c.q();
  }
  
  public float getZoom() {
    return this.c.r();
  }
  
  public void h() {
    this.c.u();
  }
  
  public void i() {
    this.c.v();
  }
  
  public void j() {
    this.c.w();
  }
  
  public void k() {
    this.c.x();
  }
  
  public void l() {
    this.c.y();
  }
  
  public void m() {
    this.c.z();
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    if (!isInEditMode())
      this.g.a(v.k((View)this)); 
  }
  
  protected void onDetachedFromWindow() {
    if (!isInEditMode())
      this.g.a(); 
    super.onDetachedFromWindow();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    if (isInEditMode()) {
      super.onMeasure(paramInt1, paramInt2);
      return;
    } 
    int i = paramInt1;
    int j = paramInt2;
    if (this.e) {
      if (!f()) {
        this.d.e();
        super.onMeasure(paramInt1, paramInt2);
        return;
      } 
      int k = View.MeasureSpec.getMode(paramInt1);
      int m = View.MeasureSpec.getMode(paramInt2);
      if (k == 1073741824 && m != 1073741824) {
        a a = getAspectRatio();
        j = (int)(View.MeasureSpec.getSize(paramInt1) * a.t());
        i = j;
        if (m == Integer.MIN_VALUE)
          i = Math.min(j, View.MeasureSpec.getSize(paramInt2)); 
        j = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        i = paramInt1;
      } else {
        i = paramInt1;
        j = paramInt2;
        if (k != 1073741824) {
          i = paramInt1;
          j = paramInt2;
          if (m == 1073741824) {
            a a = getAspectRatio();
            j = (int)(View.MeasureSpec.getSize(paramInt2) * a.t());
            i = j;
            if (k == Integer.MIN_VALUE)
              i = Math.min(j, View.MeasureSpec.getSize(paramInt1)); 
            i = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
            j = paramInt2;
          } 
        } 
      } 
    } 
    super.onMeasure(i, j);
    paramInt1 = getMeasuredWidth();
    paramInt2 = getMeasuredHeight();
    a a2 = getAspectRatio();
    a a1 = a2;
    if (this.g.b() % 180 == 0)
      a1 = a2.s(); 
    if (paramInt2 < a1.r() * paramInt1 / a1.q()) {
      this.c.p().measure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), View.MeasureSpec.makeMeasureSpec(paramInt1 * a1.r() / a1.q(), 1073741824));
      return;
    } 
    this.c.p().measure(View.MeasureSpec.makeMeasureSpec(a1.q() * paramInt2 / a1.r(), 1073741824), View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824));
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof d)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    d d = (d)paramParcelable;
    super.onRestoreInstanceState(d.getSuperState());
    setFacing(d.c);
    setCameraId(d.d);
    setAspectRatio(d.e);
    setAutoFocus(d.f);
    setFlash(d.g);
    setExposureCompensation(d.h);
    setFocusDepth(d.i);
    setZoom(d.j);
    setWhiteBalance(d.k);
    setPlaySoundOnCapture(d.l);
    setScanning(d.m);
    setPictureSize(d.n);
  }
  
  protected Parcelable onSaveInstanceState() {
    d d = new d(super.onSaveInstanceState());
    d.c = getFacing();
    d.d = getCameraId();
    d.e = getAspectRatio();
    d.f = getAutoFocus();
    d.g = getFlash();
    d.h = getExposureCompensation();
    d.i = getFocusDepth();
    d.j = getZoom();
    d.k = getWhiteBalance();
    d.l = getPlaySoundOnCapture();
    d.m = getScanning();
    d.n = getPictureSize();
    return (Parcelable)d;
  }
  
  public void setAdjustViewBounds(boolean paramBoolean) {
    if (this.e != paramBoolean) {
      this.e = paramBoolean;
      requestLayout();
    } 
  }
  
  public void setAspectRatio(a parama) {
    if (this.c.b(parama))
      requestLayout(); 
  }
  
  public void setAutoFocus(boolean paramBoolean) {
    this.c.a(paramBoolean);
  }
  
  public void setCameraId(String paramString) {
    this.c.a(paramString);
  }
  
  public void setExposureCompensation(float paramFloat) {
    this.c.a(paramFloat);
  }
  
  public void setFacing(int paramInt) {
    this.c.c(paramInt);
  }
  
  public void setFlash(int paramInt) {
    this.c.d(paramInt);
  }
  
  public void setFocusDepth(float paramFloat) {
    this.c.b(paramFloat);
  }
  
  public void setPictureSize(j paramj) {
    this.c.a(paramj);
  }
  
  public void setPlaySoundOnCapture(boolean paramBoolean) {
    this.c.b(paramBoolean);
  }
  
  public void setPreviewTexture(SurfaceTexture paramSurfaceTexture) {
    this.c.a(paramSurfaceTexture);
  }
  
  public void setScanning(boolean paramBoolean) {
    this.c.c(paramBoolean);
  }
  
  public void setUsingCamera2Api(boolean paramBoolean) {
    if (Build.VERSION.SDK_INT < 21)
      return; 
    boolean bool = f();
    Parcelable parcelable = onSaveInstanceState();
    if (paramBoolean && !c.a(this.f)) {
      c c1;
      if (bool)
        l(); 
      if (Build.VERSION.SDK_INT < 23) {
        c1 = new c(this.d, this.c.d, this.f, this.i);
      } else {
        c1 = new d(this.d, this.c.d, this.f, this.i);
      } 
      this.c = c1;
      onRestoreInstanceState(parcelable);
    } else {
      if (this.c instanceof b)
        return; 
      if (bool)
        l(); 
      this.c = new b(this.d, this.c.d, this.i);
    } 
    if (bool)
      k(); 
  }
  
  public void setWhiteBalance(int paramInt) {
    this.c.e(paramInt);
  }
  
  public void setZoom(float paramFloat) {
    this.c.c(paramFloat);
  }
  
  class a extends h {
    a(e this$0, Context param1Context) {
      super(param1Context);
    }
    
    public void a(int param1Int1, int param1Int2) {
      this.f.c.b(param1Int1);
      this.f.c.a(param1Int2);
    }
  }
  
  public static abstract class b {
    public void a(e param1e) {}
    
    public void a(e param1e, String param1String, int param1Int1, int param1Int2) {}
    
    public void a(e param1e, byte[] param1ArrayOfbyte, int param1Int) {}
    
    public void a(e param1e, byte[] param1ArrayOfbyte, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void b(e param1e) {}
    
    public void b(e param1e, String param1String, int param1Int1, int param1Int2) {}
    
    public void c(e param1e) {}
    
    public void d(e param1e) {}
  }
  
  private class c implements f.a {
    private final ArrayList<e.b> a = new ArrayList<e.b>();
    
    private boolean b;
    
    c(e this$0) {}
    
    public void a() {
      Iterator<e.b> iterator = this.a.iterator();
      while (iterator.hasNext())
        ((e.b)iterator.next()).c(this.c); 
    }
    
    public void a(e.b param1b) {
      this.a.add(param1b);
    }
    
    public void a(String param1String, int param1Int1, int param1Int2) {
      Iterator<e.b> iterator = this.a.iterator();
      while (iterator.hasNext())
        ((e.b)iterator.next()).a(this.c, param1String, param1Int1, param1Int2); 
    }
    
    public void a(byte[] param1ArrayOfbyte, int param1Int) {
      Iterator<e.b> iterator = this.a.iterator();
      while (iterator.hasNext())
        ((e.b)iterator.next()).a(this.c, param1ArrayOfbyte, param1Int); 
    }
    
    public void a(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2, int param1Int3) {
      Iterator<e.b> iterator = this.a.iterator();
      while (iterator.hasNext())
        ((e.b)iterator.next()).a(this.c, param1ArrayOfbyte, param1Int1, param1Int2, param1Int3); 
    }
    
    public void b() {
      Iterator<e.b> iterator = this.a.iterator();
      while (iterator.hasNext())
        ((e.b)iterator.next()).a(this.c); 
    }
    
    public void b(String param1String, int param1Int1, int param1Int2) {
      Iterator<e.b> iterator = this.a.iterator();
      while (iterator.hasNext())
        ((e.b)iterator.next()).b(this.c, param1String, param1Int1, param1Int2); 
    }
    
    public void c() {
      Iterator<e.b> iterator = this.a.iterator();
      while (iterator.hasNext())
        ((e.b)iterator.next()).d(this.c); 
    }
    
    public void d() {
      if (this.b) {
        this.b = false;
        this.c.requestLayout();
      } 
      Iterator<e.b> iterator = this.a.iterator();
      while (iterator.hasNext())
        ((e.b)iterator.next()).b(this.c); 
    }
    
    public void e() {
      this.b = true;
    }
  }
  
  protected static class d extends View.BaseSavedState {
    public static final Parcelable.Creator<d> CREATOR = h.a(new a());
    
    int c;
    
    String d;
    
    a e;
    
    boolean f;
    
    int g;
    
    float h;
    
    float i;
    
    float j;
    
    int k;
    
    boolean l;
    
    boolean m;
    
    j n;
    
    public d(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      super(param1Parcel);
      boolean bool1;
      this.c = param1Parcel.readInt();
      this.d = param1Parcel.readString();
      this.e = (a)param1Parcel.readParcelable(param1ClassLoader);
      byte b = param1Parcel.readByte();
      boolean bool2 = true;
      if (b != 0) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      this.f = bool1;
      this.g = param1Parcel.readInt();
      this.h = param1Parcel.readFloat();
      this.i = param1Parcel.readFloat();
      this.j = param1Parcel.readFloat();
      this.k = param1Parcel.readInt();
      if (param1Parcel.readByte() != 0) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      this.l = bool1;
      if (param1Parcel.readByte() != 0) {
        bool1 = bool2;
      } else {
        bool1 = false;
      } 
      this.m = bool1;
      this.n = (j)param1Parcel.readParcelable(param1ClassLoader);
    }
    
    public d(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      super.writeToParcel(param1Parcel, param1Int);
      param1Parcel.writeInt(this.c);
      param1Parcel.writeString(this.d);
      param1Parcel.writeParcelable(this.e, 0);
      param1Parcel.writeByte((byte)this.f);
      param1Parcel.writeInt(this.g);
      param1Parcel.writeFloat(this.h);
      param1Parcel.writeFloat(this.i);
      param1Parcel.writeFloat(this.j);
      param1Parcel.writeInt(this.k);
      param1Parcel.writeByte((byte)this.l);
      param1Parcel.writeByte((byte)this.m);
      param1Parcel.writeParcelable(this.n, param1Int);
    }
    
    class a implements i<d> {
      public e.d createFromParcel(Parcel param2Parcel, ClassLoader param2ClassLoader) {
        return new e.d(param2Parcel, param2ClassLoader);
      }
      
      public e.d[] newArray(int param2Int) {
        return new e.d[param2Int];
      }
    }
  }
  
  class a implements i<d> {
    public e.d createFromParcel(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      return new e.d(param1Parcel, param1ClassLoader);
    }
    
    public e.d[] newArray(int param1Int) {
      return new e.d[param1Int];
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */