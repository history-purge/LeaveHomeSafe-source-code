package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class o implements Iterable<Intent> {
  private final ArrayList<Intent> c = new ArrayList<Intent>();
  
  private final Context d;
  
  private o(Context paramContext) {
    this.d = paramContext;
  }
  
  public static o a(Context paramContext) {
    return new o(paramContext);
  }
  
  public o a(Activity paramActivity) {
    Intent intent1;
    if (paramActivity instanceof a) {
      intent1 = ((a)paramActivity).h();
    } else {
      intent1 = null;
    } 
    Intent intent2 = intent1;
    if (intent1 == null)
      intent2 = g.a(paramActivity); 
    if (intent2 != null) {
      ComponentName componentName2 = intent2.getComponent();
      ComponentName componentName1 = componentName2;
      if (componentName2 == null)
        componentName1 = intent2.resolveActivity(this.d.getPackageManager()); 
      a(componentName1);
      a(intent2);
    } 
    return this;
  }
  
  public o a(ComponentName paramComponentName) {
    int i = this.c.size();
    try {
      Context context2 = this.d;
      ComponentName componentName = paramComponentName;
      Context context1 = context2;
      while (true) {
        Intent intent = g.a(context1, componentName);
        if (intent != null) {
          this.c.add(i, intent);
          context1 = this.d;
          ComponentName componentName1 = intent.getComponent();
          continue;
        } 
        return this;
      } 
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
      IllegalArgumentException illegalArgumentException = new IllegalArgumentException((Throwable)nameNotFoundException);
      throw illegalArgumentException;
    } 
  }
  
  public o a(Intent paramIntent) {
    this.c.add(paramIntent);
    return this;
  }
  
  public void a() {
    a((Bundle)null);
  }
  
  public void a(Bundle paramBundle) {
    if (!this.c.isEmpty()) {
      ArrayList<Intent> arrayList = this.c;
      Intent[] arrayOfIntent = arrayList.<Intent>toArray(new Intent[arrayList.size()]);
      arrayOfIntent[0] = (new Intent(arrayOfIntent[0])).addFlags(268484608);
      if (!b.g.e.a.a(this.d, arrayOfIntent, paramBundle)) {
        Intent intent = new Intent(arrayOfIntent[arrayOfIntent.length - 1]);
        intent.addFlags(268435456);
        this.d.startActivity(intent);
      } 
      return;
    } 
    throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
  }
  
  @Deprecated
  public Iterator<Intent> iterator() {
    return this.c.iterator();
  }
  
  public static interface a {
    Intent h();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/core/app/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */