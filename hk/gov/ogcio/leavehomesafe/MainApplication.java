package hk.gov.ogcio.leavehomesafe;

import android.app.Application;
import android.content.Context;
import com.facebook.soloader.SoLoader;
import e.e.o.g;
import e.e.o.p;
import e.e.o.r;
import e.e.o.u;
import e.e.o.v;
import java.util.ArrayList;
import java.util.List;

public class MainApplication extends Application implements p {
  private final u c = new a(this, this);
  
  private static void a(Context paramContext, r paramr) {}
  
  public u a() {
    return this.c;
  }
  
  public void onCreate() {
    super.onCreate();
    SoLoader.a((Context)this, false);
    a((Context)this, a().h());
  }
  
  class a extends u {
    a(MainApplication this$0, Application param1Application) {
      super(param1Application);
    }
    
    protected String e() {
      return "index";
    }
    
    protected List<v> g() {
      ArrayList<b> arrayList = (new g(this)).a();
      arrayList.add(new b());
      arrayList.add(new a());
      return (List)arrayList;
    }
    
    public boolean k() {
      return false;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/hk/gov/ogcio/leavehomesafe/MainApplication.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */