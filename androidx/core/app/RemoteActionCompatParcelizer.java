package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.a;
import androidx.versionedparcelable.c;

public class RemoteActionCompatParcelizer {
  public static RemoteActionCompat read(a parama) {
    RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
    remoteActionCompat.a = (IconCompat)parama.a((c)remoteActionCompat.a, 1);
    remoteActionCompat.b = parama.a(remoteActionCompat.b, 2);
    remoteActionCompat.c = parama.a(remoteActionCompat.c, 3);
    remoteActionCompat.d = (PendingIntent)parama.a((Parcelable)remoteActionCompat.d, 4);
    remoteActionCompat.e = parama.a(remoteActionCompat.e, 5);
    remoteActionCompat.f = parama.a(remoteActionCompat.f, 6);
    return remoteActionCompat;
  }
  
  public static void write(RemoteActionCompat paramRemoteActionCompat, a parama) {
    parama.a(false, false);
    parama.b((c)paramRemoteActionCompat.a, 1);
    parama.b(paramRemoteActionCompat.b, 2);
    parama.b(paramRemoteActionCompat.c, 3);
    parama.b((Parcelable)paramRemoteActionCompat.d, 4);
    parama.b(paramRemoteActionCompat.e, 5);
    parama.b(paramRemoteActionCompat.f, 6);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/core/app/RemoteActionCompatParcelizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */