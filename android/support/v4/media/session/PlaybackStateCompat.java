package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
  public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();
  
  final int c;
  
  final long d;
  
  final long e;
  
  final float f;
  
  final long g;
  
  final int h;
  
  final CharSequence i;
  
  final long j;
  
  List<CustomAction> k;
  
  final long l;
  
  final Bundle m;
  
  PlaybackStateCompat(int paramInt1, long paramLong1, long paramLong2, float paramFloat, long paramLong3, int paramInt2, CharSequence paramCharSequence, long paramLong4, List<CustomAction> paramList, long paramLong5, Bundle paramBundle) {
    this.c = paramInt1;
    this.d = paramLong1;
    this.e = paramLong2;
    this.f = paramFloat;
    this.g = paramLong3;
    this.h = paramInt2;
    this.i = paramCharSequence;
    this.j = paramLong4;
    this.k = new ArrayList<CustomAction>(paramList);
    this.l = paramLong5;
    this.m = paramBundle;
  }
  
  PlaybackStateCompat(Parcel paramParcel) {
    this.c = paramParcel.readInt();
    this.d = paramParcel.readLong();
    this.f = paramParcel.readFloat();
    this.j = paramParcel.readLong();
    this.e = paramParcel.readLong();
    this.g = paramParcel.readLong();
    this.i = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
    this.k = paramParcel.createTypedArrayList(CustomAction.CREATOR);
    this.l = paramParcel.readLong();
    this.m = paramParcel.readBundle(MediaSessionCompat.class.getClassLoader());
    this.h = paramParcel.readInt();
  }
  
  public static PlaybackStateCompat a(Object paramObject) {
    PlaybackStateCompat playbackStateCompat;
    List<Object> list2 = null;
    Bundle bundle = null;
    List<Object> list1 = list2;
    if (paramObject != null) {
      list1 = list2;
      if (Build.VERSION.SDK_INT >= 21) {
        list2 = h.d(paramObject);
        if (list2 != null) {
          list1 = new ArrayList(list2.size());
          Iterator iterator = list2.iterator();
          while (iterator.hasNext())
            list1.add(CustomAction.a(iterator.next())); 
        } else {
          list1 = null;
        } 
        if (Build.VERSION.SDK_INT >= 22)
          bundle = i.a(paramObject); 
        playbackStateCompat = new PlaybackStateCompat(h.i(paramObject), h.h(paramObject), h.c(paramObject), h.g(paramObject), h.a(paramObject), 0, h.e(paramObject), h.f(paramObject), (List)list1, h.b(paramObject), bundle);
      } 
    } 
    return playbackStateCompat;
  }
  
  public int describeContents() {
    return 0;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("PlaybackState {");
    stringBuilder.append("state=");
    stringBuilder.append(this.c);
    stringBuilder.append(", position=");
    stringBuilder.append(this.d);
    stringBuilder.append(", buffered position=");
    stringBuilder.append(this.e);
    stringBuilder.append(", speed=");
    stringBuilder.append(this.f);
    stringBuilder.append(", updated=");
    stringBuilder.append(this.j);
    stringBuilder.append(", actions=");
    stringBuilder.append(this.g);
    stringBuilder.append(", error code=");
    stringBuilder.append(this.h);
    stringBuilder.append(", error message=");
    stringBuilder.append(this.i);
    stringBuilder.append(", custom actions=");
    stringBuilder.append(this.k);
    stringBuilder.append(", active item id=");
    stringBuilder.append(this.l);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.c);
    paramParcel.writeLong(this.d);
    paramParcel.writeFloat(this.f);
    paramParcel.writeLong(this.j);
    paramParcel.writeLong(this.e);
    paramParcel.writeLong(this.g);
    TextUtils.writeToParcel(this.i, paramParcel, paramInt);
    paramParcel.writeTypedList(this.k);
    paramParcel.writeLong(this.l);
    paramParcel.writeBundle(this.m);
    paramParcel.writeInt(this.h);
  }
  
  public static final class CustomAction implements Parcelable {
    public static final Parcelable.Creator<CustomAction> CREATOR = new a();
    
    private final String c;
    
    private final CharSequence d;
    
    private final int e;
    
    private final Bundle f;
    
    CustomAction(Parcel param1Parcel) {
      this.c = param1Parcel.readString();
      this.d = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(param1Parcel);
      this.e = param1Parcel.readInt();
      this.f = param1Parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
    
    CustomAction(String param1String, CharSequence param1CharSequence, int param1Int, Bundle param1Bundle) {
      this.c = param1String;
      this.d = param1CharSequence;
      this.e = param1Int;
      this.f = param1Bundle;
    }
    
    public static CustomAction a(Object param1Object) {
      return (param1Object == null || Build.VERSION.SDK_INT < 21) ? null : new CustomAction(h.a.a(param1Object), h.a.d(param1Object), h.a.c(param1Object), h.a.b(param1Object));
    }
    
    public int describeContents() {
      return 0;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Action:mName='");
      stringBuilder.append(this.d);
      stringBuilder.append(", mIcon=");
      stringBuilder.append(this.e);
      stringBuilder.append(", mExtras=");
      stringBuilder.append(this.f);
      return stringBuilder.toString();
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      param1Parcel.writeString(this.c);
      TextUtils.writeToParcel(this.d, param1Parcel, param1Int);
      param1Parcel.writeInt(this.e);
      param1Parcel.writeBundle(this.f);
    }
    
    static final class a implements Parcelable.Creator<CustomAction> {
      public PlaybackStateCompat.CustomAction createFromParcel(Parcel param2Parcel) {
        return new PlaybackStateCompat.CustomAction(param2Parcel);
      }
      
      public PlaybackStateCompat.CustomAction[] newArray(int param2Int) {
        return new PlaybackStateCompat.CustomAction[param2Int];
      }
    }
  }
  
  static final class a implements Parcelable.Creator<CustomAction> {
    public PlaybackStateCompat.CustomAction createFromParcel(Parcel param1Parcel) {
      return new PlaybackStateCompat.CustomAction(param1Parcel);
    }
    
    public PlaybackStateCompat.CustomAction[] newArray(int param1Int) {
      return new PlaybackStateCompat.CustomAction[param1Int];
    }
  }
  
  static final class a implements Parcelable.Creator<PlaybackStateCompat> {
    public PlaybackStateCompat createFromParcel(Parcel param1Parcel) {
      return new PlaybackStateCompat(param1Parcel);
    }
    
    public PlaybackStateCompat[] newArray(int param1Int) {
      return new PlaybackStateCompat[param1Int];
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/android/support/v4/media/session/PlaybackStateCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */