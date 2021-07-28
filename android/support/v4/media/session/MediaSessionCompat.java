package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MediaSessionCompat {
  public static void a(Bundle paramBundle) {
    if (paramBundle != null)
      paramBundle.setClassLoader(MediaSessionCompat.class.getClassLoader()); 
  }
  
  public static final class QueueItem implements Parcelable {
    public static final Parcelable.Creator<QueueItem> CREATOR = new a();
    
    private final MediaDescriptionCompat c;
    
    private final long d;
    
    QueueItem(Parcel param1Parcel) {
      this.c = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(param1Parcel);
      this.d = param1Parcel.readLong();
    }
    
    private QueueItem(Object param1Object, MediaDescriptionCompat param1MediaDescriptionCompat, long param1Long) {
      if (param1MediaDescriptionCompat != null) {
        if (param1Long != -1L) {
          this.c = param1MediaDescriptionCompat;
          this.d = param1Long;
          return;
        } 
        throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
      } 
      throw new IllegalArgumentException("Description cannot be null.");
    }
    
    public static QueueItem a(Object param1Object) {
      return (param1Object == null || Build.VERSION.SDK_INT < 21) ? null : new QueueItem(param1Object, MediaDescriptionCompat.a(g.a(param1Object)), g.b(param1Object));
    }
    
    public static List<QueueItem> a(List<?> param1List) {
      if (param1List == null || Build.VERSION.SDK_INT < 21)
        return null; 
      ArrayList<QueueItem> arrayList = new ArrayList();
      Iterator<?> iterator = param1List.iterator();
      while (iterator.hasNext())
        arrayList.add(a(iterator.next())); 
      return arrayList;
    }
    
    public int describeContents() {
      return 0;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("MediaSession.QueueItem {Description=");
      stringBuilder.append(this.c);
      stringBuilder.append(", Id=");
      stringBuilder.append(this.d);
      stringBuilder.append(" }");
      return stringBuilder.toString();
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      this.c.writeToParcel(param1Parcel, param1Int);
      param1Parcel.writeLong(this.d);
    }
    
    static final class a implements Parcelable.Creator<QueueItem> {
      public MediaSessionCompat.QueueItem createFromParcel(Parcel param2Parcel) {
        return new MediaSessionCompat.QueueItem(param2Parcel);
      }
      
      public MediaSessionCompat.QueueItem[] newArray(int param2Int) {
        return new MediaSessionCompat.QueueItem[param2Int];
      }
    }
  }
  
  static final class a implements Parcelable.Creator<QueueItem> {
    public MediaSessionCompat.QueueItem createFromParcel(Parcel param1Parcel) {
      return new MediaSessionCompat.QueueItem(param1Parcel);
    }
    
    public MediaSessionCompat.QueueItem[] newArray(int param1Int) {
      return new MediaSessionCompat.QueueItem[param1Int];
    }
  }
  
  public static final class ResultReceiverWrapper implements Parcelable {
    public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();
    
    ResultReceiver c;
    
    ResultReceiverWrapper(Parcel param1Parcel) {
      this.c = (ResultReceiver)ResultReceiver.CREATOR.createFromParcel(param1Parcel);
    }
    
    public int describeContents() {
      return 0;
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      this.c.writeToParcel(param1Parcel, param1Int);
    }
    
    static final class a implements Parcelable.Creator<ResultReceiverWrapper> {
      public MediaSessionCompat.ResultReceiverWrapper createFromParcel(Parcel param2Parcel) {
        return new MediaSessionCompat.ResultReceiverWrapper(param2Parcel);
      }
      
      public MediaSessionCompat.ResultReceiverWrapper[] newArray(int param2Int) {
        return new MediaSessionCompat.ResultReceiverWrapper[param2Int];
      }
    }
  }
  
  static final class a implements Parcelable.Creator<ResultReceiverWrapper> {
    public MediaSessionCompat.ResultReceiverWrapper createFromParcel(Parcel param1Parcel) {
      return new MediaSessionCompat.ResultReceiverWrapper(param1Parcel);
    }
    
    public MediaSessionCompat.ResultReceiverWrapper[] newArray(int param1Int) {
      return new MediaSessionCompat.ResultReceiverWrapper[param1Int];
    }
  }
  
  public static final class Token implements Parcelable {
    public static final Parcelable.Creator<Token> CREATOR = new a();
    
    private final Object c;
    
    private b d;
    
    Token(Object param1Object) {
      this(param1Object, null, null);
    }
    
    Token(Object param1Object, b param1b, Bundle param1Bundle) {
      this.c = param1Object;
      this.d = param1b;
    }
    
    public void a(Bundle param1Bundle) {}
    
    public void a(b param1b) {
      this.d = param1b;
    }
    
    public int describeContents() {
      return 0;
    }
    
    public b e() {
      return this.d;
    }
    
    public boolean equals(Object param1Object) {
      if (this == param1Object)
        return true; 
      if (!(param1Object instanceof Token))
        return false; 
      Token token = (Token)param1Object;
      param1Object = this.c;
      Object object = token.c;
      return (param1Object == null) ? ((object == null)) : ((object == null) ? false : param1Object.equals(object));
    }
    
    public int hashCode() {
      Object object = this.c;
      return (object == null) ? 0 : object.hashCode();
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      if (Build.VERSION.SDK_INT >= 21) {
        param1Parcel.writeParcelable((Parcelable)this.c, param1Int);
        return;
      } 
      param1Parcel.writeStrongBinder((IBinder)this.c);
    }
    
    static final class a implements Parcelable.Creator<Token> {
      public MediaSessionCompat.Token createFromParcel(Parcel param2Parcel) {
        Parcelable parcelable;
        IBinder iBinder;
        if (Build.VERSION.SDK_INT >= 21) {
          parcelable = param2Parcel.readParcelable(null);
        } else {
          iBinder = parcelable.readStrongBinder();
        } 
        return new MediaSessionCompat.Token(iBinder);
      }
      
      public MediaSessionCompat.Token[] newArray(int param2Int) {
        return new MediaSessionCompat.Token[param2Int];
      }
    }
  }
  
  static final class a implements Parcelable.Creator<Token> {
    public MediaSessionCompat.Token createFromParcel(Parcel param1Parcel) {
      Parcelable parcelable;
      IBinder iBinder;
      if (Build.VERSION.SDK_INT >= 21) {
        parcelable = param1Parcel.readParcelable(null);
      } else {
        iBinder = parcelable.readStrongBinder();
      } 
      return new MediaSessionCompat.Token(iBinder);
    }
    
    public MediaSessionCompat.Token[] newArray(int param1Int) {
      return new MediaSessionCompat.Token[param1Int];
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/android/support/v4/media/session/MediaSessionCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */