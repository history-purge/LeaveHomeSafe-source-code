package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;
import androidx.versionedparcelable.a;

public final class AudioAttributesImplApi21Parcelizer {
  public static b read(a parama) {
    b b = new b();
    b.a = (AudioAttributes)parama.a((Parcelable)b.a, 1);
    b.b = parama.a(b.b, 2);
    return b;
  }
  
  public static void write(b paramb, a parama) {
    parama.a(false, false);
    parama.b((Parcelable)paramb.a, 1);
    parama.b(paramb.b, 2);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/media/AudioAttributesImplApi21Parcelizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */