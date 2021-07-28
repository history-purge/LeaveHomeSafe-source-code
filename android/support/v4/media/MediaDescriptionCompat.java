package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public final class MediaDescriptionCompat implements Parcelable {
  public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();
  
  private final String c;
  
  private final CharSequence d;
  
  private final CharSequence e;
  
  private final CharSequence f;
  
  private final Bitmap g;
  
  private final Uri h;
  
  private final Bundle i;
  
  private final Uri j;
  
  private Object k;
  
  MediaDescriptionCompat(Parcel paramParcel) {
    this.c = paramParcel.readString();
    this.d = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
    this.e = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
    this.f = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
    ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
    this.g = (Bitmap)paramParcel.readParcelable(classLoader);
    this.h = (Uri)paramParcel.readParcelable(classLoader);
    this.i = paramParcel.readBundle(classLoader);
    this.j = (Uri)paramParcel.readParcelable(classLoader);
  }
  
  MediaDescriptionCompat(String paramString, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, Bitmap paramBitmap, Uri paramUri1, Bundle paramBundle, Uri paramUri2) {
    this.c = paramString;
    this.d = paramCharSequence1;
    this.e = paramCharSequence2;
    this.f = paramCharSequence3;
    this.g = paramBitmap;
    this.h = paramUri1;
    this.i = paramBundle;
    this.j = paramUri2;
  }
  
  public static MediaDescriptionCompat a(Object paramObject) {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore_2
    //   4: aload_3
    //   5: astore_1
    //   6: aload_0
    //   7: ifnull -> 205
    //   10: aload_3
    //   11: astore_1
    //   12: getstatic android/os/Build$VERSION.SDK_INT : I
    //   15: bipush #21
    //   17: if_icmplt -> 205
    //   20: new android/support/v4/media/MediaDescriptionCompat$b
    //   23: dup
    //   24: invokespecial <init> : ()V
    //   27: astore #4
    //   29: aload #4
    //   31: aload_0
    //   32: invokestatic e : (Ljava/lang/Object;)Ljava/lang/String;
    //   35: invokevirtual a : (Ljava/lang/String;)Landroid/support/v4/media/MediaDescriptionCompat$b;
    //   38: pop
    //   39: aload #4
    //   41: aload_0
    //   42: invokestatic g : (Ljava/lang/Object;)Ljava/lang/CharSequence;
    //   45: invokevirtual c : (Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaDescriptionCompat$b;
    //   48: pop
    //   49: aload #4
    //   51: aload_0
    //   52: invokestatic f : (Ljava/lang/Object;)Ljava/lang/CharSequence;
    //   55: invokevirtual b : (Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaDescriptionCompat$b;
    //   58: pop
    //   59: aload #4
    //   61: aload_0
    //   62: invokestatic a : (Ljava/lang/Object;)Ljava/lang/CharSequence;
    //   65: invokevirtual a : (Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaDescriptionCompat$b;
    //   68: pop
    //   69: aload #4
    //   71: aload_0
    //   72: invokestatic c : (Ljava/lang/Object;)Landroid/graphics/Bitmap;
    //   75: invokevirtual a : (Landroid/graphics/Bitmap;)Landroid/support/v4/media/MediaDescriptionCompat$b;
    //   78: pop
    //   79: aload #4
    //   81: aload_0
    //   82: invokestatic d : (Ljava/lang/Object;)Landroid/net/Uri;
    //   85: invokevirtual a : (Landroid/net/Uri;)Landroid/support/v4/media/MediaDescriptionCompat$b;
    //   88: pop
    //   89: aload_0
    //   90: invokestatic b : (Ljava/lang/Object;)Landroid/os/Bundle;
    //   93: astore_3
    //   94: aload_3
    //   95: ifnull -> 115
    //   98: aload_3
    //   99: invokestatic a : (Landroid/os/Bundle;)V
    //   102: aload_3
    //   103: ldc 'android.support.v4.media.description.MEDIA_URI'
    //   105: invokevirtual getParcelable : (Ljava/lang/String;)Landroid/os/Parcelable;
    //   108: checkcast android/net/Uri
    //   111: astore_1
    //   112: goto -> 117
    //   115: aconst_null
    //   116: astore_1
    //   117: aload_1
    //   118: ifnull -> 153
    //   121: aload_3
    //   122: ldc 'android.support.v4.media.description.NULL_BUNDLE_FLAG'
    //   124: invokevirtual containsKey : (Ljava/lang/String;)Z
    //   127: ifeq -> 141
    //   130: aload_3
    //   131: invokevirtual size : ()I
    //   134: iconst_2
    //   135: if_icmpne -> 141
    //   138: goto -> 155
    //   141: aload_3
    //   142: ldc 'android.support.v4.media.description.MEDIA_URI'
    //   144: invokevirtual remove : (Ljava/lang/String;)V
    //   147: aload_3
    //   148: ldc 'android.support.v4.media.description.NULL_BUNDLE_FLAG'
    //   150: invokevirtual remove : (Ljava/lang/String;)V
    //   153: aload_3
    //   154: astore_2
    //   155: aload #4
    //   157: aload_2
    //   158: invokevirtual a : (Landroid/os/Bundle;)Landroid/support/v4/media/MediaDescriptionCompat$b;
    //   161: pop
    //   162: aload_1
    //   163: ifnull -> 176
    //   166: aload #4
    //   168: aload_1
    //   169: invokevirtual b : (Landroid/net/Uri;)Landroid/support/v4/media/MediaDescriptionCompat$b;
    //   172: pop
    //   173: goto -> 194
    //   176: getstatic android/os/Build$VERSION.SDK_INT : I
    //   179: bipush #23
    //   181: if_icmplt -> 194
    //   184: aload #4
    //   186: aload_0
    //   187: invokestatic a : (Ljava/lang/Object;)Landroid/net/Uri;
    //   190: invokevirtual b : (Landroid/net/Uri;)Landroid/support/v4/media/MediaDescriptionCompat$b;
    //   193: pop
    //   194: aload #4
    //   196: invokevirtual a : ()Landroid/support/v4/media/MediaDescriptionCompat;
    //   199: astore_1
    //   200: aload_1
    //   201: aload_0
    //   202: putfield k : Ljava/lang/Object;
    //   205: aload_1
    //   206: areturn
  }
  
  public int describeContents() {
    return 0;
  }
  
  public Object e() {
    if (this.k != null || Build.VERSION.SDK_INT < 21)
      return this.k; 
    Object object = d.a.a();
    d.a.a(object, this.c);
    d.a.c(object, this.d);
    d.a.b(object, this.e);
    d.a.a(object, this.f);
    d.a.a(object, this.g);
    d.a.a(object, this.h);
    Bundle bundle2 = this.i;
    Bundle bundle1 = bundle2;
    if (Build.VERSION.SDK_INT < 23) {
      bundle1 = bundle2;
      if (this.j != null) {
        bundle1 = bundle2;
        if (bundle2 == null) {
          bundle1 = new Bundle();
          bundle1.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
        } 
        bundle1.putParcelable("android.support.v4.media.description.MEDIA_URI", (Parcelable)this.j);
      } 
    } 
    d.a.a(object, bundle1);
    if (Build.VERSION.SDK_INT >= 23)
      e.a.a(object, this.j); 
    this.k = d.a.a(object);
    return this.k;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.d);
    stringBuilder.append(", ");
    stringBuilder.append(this.e);
    stringBuilder.append(", ");
    stringBuilder.append(this.f);
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    if (Build.VERSION.SDK_INT < 21) {
      paramParcel.writeString(this.c);
      TextUtils.writeToParcel(this.d, paramParcel, paramInt);
      TextUtils.writeToParcel(this.e, paramParcel, paramInt);
      TextUtils.writeToParcel(this.f, paramParcel, paramInt);
      paramParcel.writeParcelable((Parcelable)this.g, paramInt);
      paramParcel.writeParcelable((Parcelable)this.h, paramInt);
      paramParcel.writeBundle(this.i);
      paramParcel.writeParcelable((Parcelable)this.j, paramInt);
      return;
    } 
    d.a(e(), paramParcel, paramInt);
  }
  
  static final class a implements Parcelable.Creator<MediaDescriptionCompat> {
    public MediaDescriptionCompat createFromParcel(Parcel param1Parcel) {
      return (Build.VERSION.SDK_INT < 21) ? new MediaDescriptionCompat(param1Parcel) : MediaDescriptionCompat.a(d.a(param1Parcel));
    }
    
    public MediaDescriptionCompat[] newArray(int param1Int) {
      return new MediaDescriptionCompat[param1Int];
    }
  }
  
  public static final class b {
    private String a;
    
    private CharSequence b;
    
    private CharSequence c;
    
    private CharSequence d;
    
    private Bitmap e;
    
    private Uri f;
    
    private Bundle g;
    
    private Uri h;
    
    public b a(Bitmap param1Bitmap) {
      this.e = param1Bitmap;
      return this;
    }
    
    public b a(Uri param1Uri) {
      this.f = param1Uri;
      return this;
    }
    
    public b a(Bundle param1Bundle) {
      this.g = param1Bundle;
      return this;
    }
    
    public b a(CharSequence param1CharSequence) {
      this.d = param1CharSequence;
      return this;
    }
    
    public b a(String param1String) {
      this.a = param1String;
      return this;
    }
    
    public MediaDescriptionCompat a() {
      return new MediaDescriptionCompat(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
    
    public b b(Uri param1Uri) {
      this.h = param1Uri;
      return this;
    }
    
    public b b(CharSequence param1CharSequence) {
      this.c = param1CharSequence;
      return this;
    }
    
    public b c(CharSequence param1CharSequence) {
      this.b = param1CharSequence;
      return this;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/android/support/v4/media/MediaDescriptionCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */