package b.a.o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import b.a.j;
import b.g.m.h;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class g extends MenuInflater {
  static final Class<?>[] e = new Class[] { Context.class };
  
  static final Class<?>[] f = e;
  
  final Object[] a;
  
  final Object[] b;
  
  Context c;
  
  private Object d;
  
  public g(Context paramContext) {
    super(paramContext);
    this.c = paramContext;
    this.a = new Object[] { paramContext };
    this.b = this.a;
  }
  
  private Object a(Object paramObject) {
    if (paramObject instanceof android.app.Activity)
      return paramObject; 
    Object object = paramObject;
    if (paramObject instanceof ContextWrapper)
      object = a(((ContextWrapper)paramObject).getBaseContext()); 
    return object;
  }
  
  private void a(XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Menu paramMenu) {
    StringBuilder stringBuilder;
    b b = new b(this, paramMenu);
    int i = paramXmlPullParser.getEventType();
    while (true) {
      if (i == 2) {
        String str = paramXmlPullParser.getName();
        if (str.equals("menu")) {
          i = paramXmlPullParser.next();
          break;
        } 
        stringBuilder = new StringBuilder();
        stringBuilder.append("Expecting menu, got ");
        stringBuilder.append(str);
        throw new RuntimeException(stringBuilder.toString());
      } 
      int m = stringBuilder.next();
      i = m;
      if (m == 1) {
        i = m;
        break;
      } 
    } 
    Menu menu = null;
    boolean bool = false;
    int j = 0;
    int k = i;
    while (!bool) {
      if (k != 1) {
        Menu menu1;
        boolean bool1;
        if (k != 2) {
          if (k != 3) {
            i = j;
            paramMenu = menu;
            bool1 = bool;
          } else {
            String str = stringBuilder.getName();
            if (j && str.equals(menu)) {
              paramMenu = null;
              i = 0;
              bool1 = bool;
            } else if (str.equals("group")) {
              b.d();
              i = j;
              paramMenu = menu;
              bool1 = bool;
            } else if (str.equals("item")) {
              i = j;
              paramMenu = menu;
              bool1 = bool;
              if (!b.c()) {
                b.g.m.b b1 = b.A;
                if (b1 != null && b1.a()) {
                  b.b();
                  i = j;
                  menu1 = menu;
                  bool1 = bool;
                } else {
                  b.a();
                  i = j;
                  menu1 = menu;
                  bool1 = bool;
                } 
              } 
            } else {
              i = j;
              paramMenu = menu;
              bool1 = bool;
              if (str.equals("menu")) {
                bool1 = true;
                i = j;
                paramMenu = menu;
              } 
            } 
          } 
        } else if (j) {
          i = j;
          paramMenu = menu;
          bool1 = bool;
        } else {
          String str = stringBuilder.getName();
          if (str.equals("group")) {
            b.a(paramAttributeSet);
            i = j;
            menu1 = menu;
            bool1 = bool;
          } else if (menu1.equals("item")) {
            b.b(paramAttributeSet);
            i = j;
            menu1 = menu;
            bool1 = bool;
          } else if (menu1.equals("menu")) {
            a((XmlPullParser)stringBuilder, paramAttributeSet, (Menu)b.b());
            i = j;
            menu1 = menu;
            bool1 = bool;
          } else {
            i = 1;
            bool1 = bool;
          } 
        } 
        k = stringBuilder.next();
        j = i;
        menu = menu1;
        bool = bool1;
        continue;
      } 
      throw new RuntimeException("Unexpected end of document");
    } 
  }
  
  Object a() {
    if (this.d == null)
      this.d = a(this.c); 
    return this.d;
  }
  
  public void inflate(int paramInt, Menu paramMenu) {
    if (!(paramMenu instanceof b.g.h.a.a)) {
      super.inflate(paramInt, paramMenu);
      return;
    } 
    XmlResourceParser xmlResourceParser2 = null;
    XmlResourceParser xmlResourceParser3 = null;
    XmlResourceParser xmlResourceParser1 = null;
    try {
      XmlResourceParser xmlResourceParser = this.c.getResources().getLayout(paramInt);
      xmlResourceParser1 = xmlResourceParser;
      xmlResourceParser2 = xmlResourceParser;
      xmlResourceParser3 = xmlResourceParser;
      a((XmlPullParser)xmlResourceParser, Xml.asAttributeSet((XmlPullParser)xmlResourceParser), paramMenu);
      if (xmlResourceParser != null)
        xmlResourceParser.close(); 
      return;
    } catch (XmlPullParserException xmlPullParserException) {
      xmlResourceParser1 = xmlResourceParser3;
      throw new InflateException("Error inflating menu XML", xmlPullParserException);
    } catch (IOException iOException) {
      xmlResourceParser1 = xmlResourceParser2;
      throw new InflateException("Error inflating menu XML", iOException);
    } finally {}
    if (xmlResourceParser1 != null)
      xmlResourceParser1.close(); 
    throw paramMenu;
  }
  
  private static class a implements MenuItem.OnMenuItemClickListener {
    private static final Class<?>[] c = new Class[] { MenuItem.class };
    
    private Object a;
    
    private Method b;
    
    public a(Object param1Object, String param1String) {
      this.a = param1Object;
      Class<?> clazz = param1Object.getClass();
      try {
        this.b = clazz.getMethod(param1String, c);
        return;
      } catch (Exception exception) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Couldn't resolve menu item onClick handler ");
        stringBuilder.append(param1String);
        stringBuilder.append(" in class ");
        stringBuilder.append(clazz.getName());
        InflateException inflateException = new InflateException(stringBuilder.toString());
        inflateException.initCause(exception);
        throw inflateException;
      } 
    }
    
    public boolean onMenuItemClick(MenuItem param1MenuItem) {
      try {
        if (this.b.getReturnType() == boolean.class)
          return ((Boolean)this.b.invoke(this.a, new Object[] { param1MenuItem })).booleanValue(); 
        this.b.invoke(this.a, new Object[] { param1MenuItem });
        return true;
      } catch (Exception exception) {
        throw new RuntimeException(exception);
      } 
    }
  }
  
  private class b {
    b.g.m.b A;
    
    private CharSequence B;
    
    private CharSequence C;
    
    private ColorStateList D = null;
    
    private PorterDuff.Mode E = null;
    
    private Menu a;
    
    private int b;
    
    private int c;
    
    private int d;
    
    private int e;
    
    private boolean f;
    
    private boolean g;
    
    private boolean h;
    
    private int i;
    
    private int j;
    
    private CharSequence k;
    
    private CharSequence l;
    
    private int m;
    
    private char n;
    
    private int o;
    
    private char p;
    
    private int q;
    
    private int r;
    
    private boolean s;
    
    private boolean t;
    
    private boolean u;
    
    private int v;
    
    private int w;
    
    private String x;
    
    private String y;
    
    private String z;
    
    public b(g this$0, Menu param1Menu) {
      this.a = param1Menu;
      d();
    }
    
    private char a(String param1String) {
      return (param1String == null) ? Character.MIN_VALUE : param1String.charAt(0);
    }
    
    private <T> T a(String param1String, Class<?>[] param1ArrayOfClass, Object[] param1ArrayOfObject) {
      try {
        null = Class.forName(param1String, false, this.F.c.getClassLoader()).getConstructor(param1ArrayOfClass);
        null.setAccessible(true);
        return (T)null.newInstance(param1ArrayOfObject);
      } catch (Exception exception) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot instantiate class: ");
        stringBuilder.append(param1String);
        Log.w("SupportMenuInflater", stringBuilder.toString(), exception);
        return null;
      } 
    }
    
    private void a(MenuItem param1MenuItem) {
      boolean bool2;
      MenuItem menuItem = param1MenuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
      int i = this.r;
      boolean bool1 = false;
      if (i >= 1) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      menuItem.setCheckable(bool2).setTitleCondensed(this.l).setIcon(this.m);
      i = this.v;
      if (i >= 0)
        param1MenuItem.setShowAsAction(i); 
      if (this.z != null)
        if (!this.F.c.isRestricted()) {
          param1MenuItem.setOnMenuItemClickListener(new g.a(this.F.a(), this.z));
        } else {
          throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
        }  
      if (this.r >= 2)
        if (param1MenuItem instanceof j) {
          ((j)param1MenuItem).c(true);
        } else if (param1MenuItem instanceof k) {
          ((k)param1MenuItem).a(true);
        }  
      String str = this.x;
      if (str != null) {
        param1MenuItem.setActionView(a(str, g.e, this.F.a));
        bool1 = true;
      } 
      i = this.w;
      if (i > 0)
        if (!bool1) {
          param1MenuItem.setActionView(i);
        } else {
          Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
        }  
      b.g.m.b b1 = this.A;
      if (b1 != null)
        h.a(param1MenuItem, b1); 
      h.a(param1MenuItem, this.B);
      h.b(param1MenuItem, this.C);
      h.a(param1MenuItem, this.n, this.o);
      h.b(param1MenuItem, this.p, this.q);
      PorterDuff.Mode mode = this.E;
      if (mode != null)
        h.a(param1MenuItem, mode); 
      ColorStateList colorStateList = this.D;
      if (colorStateList != null)
        h.a(param1MenuItem, colorStateList); 
    }
    
    public void a() {
      this.h = true;
      a(this.a.add(this.b, this.i, this.j, this.k));
    }
    
    public void a(AttributeSet param1AttributeSet) {
      TypedArray typedArray = this.F.c.obtainStyledAttributes(param1AttributeSet, j.MenuGroup);
      this.b = typedArray.getResourceId(j.MenuGroup_android_id, 0);
      this.c = typedArray.getInt(j.MenuGroup_android_menuCategory, 0);
      this.d = typedArray.getInt(j.MenuGroup_android_orderInCategory, 0);
      this.e = typedArray.getInt(j.MenuGroup_android_checkableBehavior, 0);
      this.f = typedArray.getBoolean(j.MenuGroup_android_visible, true);
      this.g = typedArray.getBoolean(j.MenuGroup_android_enabled, true);
      typedArray.recycle();
    }
    
    public SubMenu b() {
      this.h = true;
      SubMenu subMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
      a(subMenu.getItem());
      return subMenu;
    }
    
    public void b(AttributeSet param1AttributeSet) {
      throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public boolean c() {
      return this.h;
    }
    
    public void d() {
      this.b = 0;
      this.c = 0;
      this.d = 0;
      this.e = 0;
      this.f = true;
      this.g = true;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/a/o/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */