package androidx.media;

import androidx.versionedparcelable.a;

public final class AudioAttributesCompatParcelizer {
  public static AudioAttributesCompat read(a parama) {
    AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
    audioAttributesCompat.a = (a)parama.a(audioAttributesCompat.a, 1);
    return audioAttributesCompat;
  }
  
  public static void write(AudioAttributesCompat paramAudioAttributesCompat, a parama) {
    parama.a(false, false);
    parama.b(paramAudioAttributesCompat.a, 1);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/media/AudioAttributesCompatParcelizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */