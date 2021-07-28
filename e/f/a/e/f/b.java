package e.f.a.e.f;

import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.q;
import java.lang.reflect.Field;

public final class b<T> extends a.a {
  private final T a;
  
  private b(T paramT) {
    this.a = paramT;
  }
  
  @RecentlyNonNull
  public static <T> a a(@RecentlyNonNull T paramT) {
    return new b<T>(paramT);
  }
  
  @RecentlyNonNull
  public static <T> T a(@RecentlyNonNull a parama) {
    Field field;
    if (parama instanceof b)
      return ((b)parama).a; 
    IBinder iBinder = parama.asBinder();
    Field[] arrayOfField = iBinder.getClass().getDeclaredFields();
    int k = arrayOfField.length;
    int i = 0;
    parama = null;
    int j;
    for (j = 0; i < k; j = m) {
      Field field1 = arrayOfField[i];
      int m = j;
      if (!field1.isSynthetic()) {
        m = j + 1;
        field = field1;
      } 
      i++;
    } 
    if (j == 1) {
      q.a(field);
      if (!field.isAccessible()) {
        field.setAccessible(true);
        try {
          return (T)field.get(iBinder);
        } catch (NullPointerException nullPointerException) {
          throw new IllegalArgumentException("Binder object is null.", nullPointerException);
        } catch (IllegalAccessException illegalAccessException) {
          throw new IllegalArgumentException("Could not access the field in remoteBinder.", illegalAccessException);
        } 
      } 
      throw new IllegalArgumentException("IObjectWrapper declared field not private!");
    } 
    i = arrayOfField.length;
    StringBuilder stringBuilder = new StringBuilder(64);
    stringBuilder.append("Unexpected number of IObjectWrapper declared fields: ");
    stringBuilder.append(i);
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
    throw illegalArgumentException;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */