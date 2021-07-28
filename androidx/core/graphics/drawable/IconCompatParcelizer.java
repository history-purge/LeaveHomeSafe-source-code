package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.a;

public class IconCompatParcelizer {
  public static IconCompat read(a parama) {
    IconCompat iconCompat = new IconCompat();
    iconCompat.a = parama.a(iconCompat.a, 1);
    iconCompat.c = parama.a(iconCompat.c, 2);
    iconCompat.d = parama.a(iconCompat.d, 3);
    iconCompat.e = parama.a(iconCompat.e, 4);
    iconCompat.f = parama.a(iconCompat.f, 5);
    iconCompat.g = (ColorStateList)parama.a((Parcelable)iconCompat.g, 6);
    iconCompat.i = parama.a(iconCompat.i, 7);
    iconCompat.e();
    return iconCompat;
  }
  
  public static void write(IconCompat paramIconCompat, a parama) {
    parama.a(true, true);
    paramIconCompat.a(parama.c());
    int i = paramIconCompat.a;
    if (-1 != i)
      parama.b(i, 1); 
    byte[] arrayOfByte = paramIconCompat.c;
    if (arrayOfByte != null)
      parama.b(arrayOfByte, 2); 
    Parcelable parcelable = paramIconCompat.d;
    if (parcelable != null)
      parama.b(parcelable, 3); 
    i = paramIconCompat.e;
    if (i != 0)
      parama.b(i, 4); 
    i = paramIconCompat.f;
    if (i != 0)
      parama.b(i, 5); 
    ColorStateList colorStateList = paramIconCompat.g;
    if (colorStateList != null)
      parama.b((Parcelable)colorStateList, 6); 
    String str = paramIconCompat.i;
    if (str != null)
      parama.b(str, 7); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/core/graphics/drawable/IconCompatParcelizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */