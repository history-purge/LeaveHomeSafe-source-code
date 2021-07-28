package b.g.e.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import b.g.f.d;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class f {
  public static int a(Resources paramResources, int paramInt, Resources.Theme paramTheme) {
    return (Build.VERSION.SDK_INT >= 23) ? paramResources.getColor(paramInt, paramTheme) : paramResources.getColor(paramInt);
  }
  
  public static Typeface a(Context paramContext, int paramInt) {
    return paramContext.isRestricted() ? null : a(paramContext, paramInt, new TypedValue(), 0, null, null, false);
  }
  
  public static Typeface a(Context paramContext, int paramInt1, TypedValue paramTypedValue, int paramInt2, a parama) {
    return paramContext.isRestricted() ? null : a(paramContext, paramInt1, paramTypedValue, paramInt2, parama, null, true);
  }
  
  private static Typeface a(Context paramContext, int paramInt1, TypedValue paramTypedValue, int paramInt2, a parama, Handler paramHandler, boolean paramBoolean) {
    StringBuilder stringBuilder;
    Resources resources = paramContext.getResources();
    resources.getValue(paramInt1, paramTypedValue, true);
    Typeface typeface = a(paramContext, resources, paramTypedValue, paramInt1, paramInt2, parama, paramHandler, paramBoolean);
    if (typeface == null) {
      if (parama != null)
        return typeface; 
      stringBuilder = new StringBuilder();
      stringBuilder.append("Font resource ID #0x");
      stringBuilder.append(Integer.toHexString(paramInt1));
      stringBuilder.append(" could not be retrieved.");
      throw new Resources.NotFoundException(stringBuilder.toString());
    } 
    return (Typeface)stringBuilder;
  }
  
  private static Typeface a(Context paramContext, Resources paramResources, TypedValue paramTypedValue, int paramInt1, int paramInt2, a parama, Handler paramHandler, boolean paramBoolean) {
    StringBuilder stringBuilder;
    String str;
    CharSequence charSequence = paramTypedValue.string;
    if (charSequence != null) {
      charSequence = charSequence.toString();
      if (!charSequence.startsWith("res/")) {
        if (parama != null)
          parama.a(-3, paramHandler); 
        return null;
      } 
      Typeface typeface = d.b(paramResources, paramInt1, paramInt2);
      if (typeface != null) {
        if (parama != null)
          parama.a(typeface, paramHandler); 
        return typeface;
      } 
      try {
        if (charSequence.toLowerCase().endsWith(".xml")) {
          c.a a1 = c.a((XmlPullParser)paramResources.getXml(paramInt1), paramResources);
          if (a1 == null) {
            Log.e("ResourcesCompat", "Failed to find font-family tag");
            if (parama != null) {
              parama.a(-3, paramHandler);
              return null;
            } 
          } else {
            return d.a(paramContext, a1, paramResources, paramInt1, paramInt2, parama, paramHandler, paramBoolean);
          } 
        } else {
          Typeface typeface1 = d.a(paramContext, paramResources, paramInt1, (String)charSequence, paramInt2);
          if (parama != null) {
            if (typeface1 != null) {
              parama.a(typeface1, paramHandler);
              return typeface1;
            } 
            parama.a(-3, paramHandler);
          } 
          return typeface1;
        } 
      } catch (XmlPullParserException xmlPullParserException) {
        stringBuilder = new StringBuilder();
        str = "Failed to parse xml resource ";
        stringBuilder.append(str);
        stringBuilder.append((String)charSequence);
        Log.e("ResourcesCompat", stringBuilder.toString(), (Throwable)xmlPullParserException);
        if (parama != null)
          parama.a(-3, paramHandler); 
        return null;
      } catch (IOException iOException) {
        stringBuilder = new StringBuilder();
        str = "Failed to read xml resource ";
      } 
    } else {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Resource \"");
      stringBuilder1.append(stringBuilder.getResourceName(paramInt1));
      stringBuilder1.append("\" (");
      stringBuilder1.append(Integer.toHexString(paramInt1));
      stringBuilder1.append(") is not a Font: ");
      stringBuilder1.append(str);
      throw new Resources.NotFoundException(stringBuilder1.toString());
    } 
    return null;
  }
  
  public static void a(Context paramContext, int paramInt, a parama, Handler paramHandler) {
    androidx.core.util.f.a(parama);
    if (paramContext.isRestricted()) {
      parama.a(-4, paramHandler);
      return;
    } 
    a(paramContext, paramInt, new TypedValue(), 0, parama, paramHandler, false);
  }
  
  public static Drawable b(Resources paramResources, int paramInt, Resources.Theme paramTheme) {
    return (Build.VERSION.SDK_INT >= 21) ? paramResources.getDrawable(paramInt, paramTheme) : paramResources.getDrawable(paramInt);
  }
  
  public static abstract class a {
    public abstract void a(int param1Int);
    
    public final void a(int param1Int, Handler param1Handler) {
      Handler handler = param1Handler;
      if (param1Handler == null)
        handler = new Handler(Looper.getMainLooper()); 
      handler.post(new b(this, param1Int));
    }
    
    public abstract void a(Typeface param1Typeface);
    
    public final void a(Typeface param1Typeface, Handler param1Handler) {
      Handler handler = param1Handler;
      if (param1Handler == null)
        handler = new Handler(Looper.getMainLooper()); 
      handler.post(new a(this, param1Typeface));
    }
    
    class a implements Runnable {
      a(f.a this$0, Typeface param2Typeface) {}
      
      public void run() {
        this.d.a(this.c);
      }
    }
    
    class b implements Runnable {
      b(f.a this$0, int param2Int) {}
      
      public void run() {
        this.d.a(this.c);
      }
    }
  }
  
  class a implements Runnable {
    a(f this$0, Typeface param1Typeface) {}
    
    public void run() {
      this.d.a(this.c);
    }
  }
  
  class b implements Runnable {
    b(f this$0, int param1Int) {}
    
    public void run() {
      this.d.a(this.c);
    }
  }
  
  public static final class b {
    public static void a(Resources.Theme param1Theme) {
      int i = Build.VERSION.SDK_INT;
      if (i >= 29) {
        b.a(param1Theme);
        return;
      } 
      if (i >= 23)
        a.a(param1Theme); 
    }
    
    static class a {
      private static final Object a = new Object();
      
      private static Method b;
      
      private static boolean c;
      
      static void a(Resources.Theme param2Theme) {
        synchronized (a) {
          boolean bool = c;
          if (!bool) {
            try {
              b = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
              b.setAccessible(true);
            } catch (NoSuchMethodException noSuchMethodException) {
              Log.i("ResourcesCompat", "Failed to retrieve rebase() method", noSuchMethodException);
            } 
            c = true;
          } 
          Method method = b;
          if (method != null)
            try {
              b.invoke(param2Theme, new Object[0]);
            } catch (IllegalAccessException illegalAccessException) {
              Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", illegalAccessException);
              b = null;
            } catch (InvocationTargetException invocationTargetException) {} 
          return;
        } 
      }
    }
    
    static class b {
      static void a(Resources.Theme param2Theme) {
        param2Theme.rebase();
      }
    }
  }
  
  static class a {
    private static final Object a = new Object();
    
    private static Method b;
    
    private static boolean c;
    
    static void a(Resources.Theme param1Theme) {
      synchronized (a) {
        boolean bool = c;
        if (!bool) {
          try {
            b = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
            b.setAccessible(true);
          } catch (NoSuchMethodException noSuchMethodException) {
            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", noSuchMethodException);
          } 
          c = true;
        } 
        Method method = b;
        if (method != null)
          try {
            b.invoke(param1Theme, new Object[0]);
          } catch (IllegalAccessException illegalAccessException) {
            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", illegalAccessException);
            b = null;
          } catch (InvocationTargetException invocationTargetException) {} 
        return;
      } 
    }
  }
  
  static class b {
    static void a(Resources.Theme param1Theme) {
      param1Theme.rebase();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/e/d/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */