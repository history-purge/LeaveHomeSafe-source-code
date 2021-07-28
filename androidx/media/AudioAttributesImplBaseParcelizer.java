package androidx.media;

import androidx.versionedparcelable.a;

public final class AudioAttributesImplBaseParcelizer {
  public static c read(a parama) {
    c c = new c();
    c.a = parama.a(c.a, 1);
    c.b = parama.a(c.b, 2);
    c.c = parama.a(c.c, 3);
    c.d = parama.a(c.d, 4);
    return c;
  }
  
  public static void write(c paramc, a parama) {
    parama.a(false, false);
    parama.b(paramc.a, 1);
    parama.b(paramc.b, 2);
    parama.b(paramc.c, 3);
    parama.b(paramc.d, 4);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/media/AudioAttributesImplBaseParcelizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */