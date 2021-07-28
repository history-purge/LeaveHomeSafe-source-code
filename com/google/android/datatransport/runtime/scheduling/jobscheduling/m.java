package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import e.f.a.c.i.a0.a;
import e.f.a.c.i.n;
import e.f.a.c.i.v.a;
import e.f.a.c.i.x.j.y;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.zip.Adler32;

public class m implements s {
  private final Context a;
  
  private final y b;
  
  private final n c;
  
  public m(Context paramContext, y paramy, n paramn) {
    this.a = paramContext;
    this.b = paramy;
    this.c = paramn;
  }
  
  private boolean a(JobScheduler paramJobScheduler, int paramInt1, int paramInt2) {
    boolean bool;
    Iterator<JobInfo> iterator = paramJobScheduler.getAllPendingJobs().iterator();
    while (true) {
      boolean bool2 = iterator.hasNext();
      boolean bool1 = false;
      bool = bool1;
      if (bool2) {
        JobInfo jobInfo = iterator.next();
        int i = jobInfo.getExtras().getInt("attemptNumber");
        if (jobInfo.getId() == paramInt1) {
          bool = bool1;
          if (i >= paramInt2)
            bool = true; 
          break;
        } 
        continue;
      } 
      break;
    } 
    return bool;
  }
  
  int a(n paramn) {
    Adler32 adler32 = new Adler32();
    adler32.update(this.a.getPackageName().getBytes(Charset.forName("UTF-8")));
    adler32.update(paramn.a().getBytes(Charset.forName("UTF-8")));
    adler32.update(ByteBuffer.allocate(4).putInt(a.a(paramn.c())).array());
    if (paramn.b() != null)
      adler32.update(paramn.b()); 
    return (int)adler32.getValue();
  }
  
  public void a(n paramn, int paramInt) {
    a(paramn, paramInt, false);
  }
  
  public void a(n paramn, int paramInt, boolean paramBoolean) {
    ComponentName componentName = new ComponentName(this.a, JobInfoSchedulerService.class);
    JobScheduler jobScheduler = (JobScheduler)this.a.getSystemService("jobscheduler");
    int i = a(paramn);
    if (!paramBoolean && a(jobScheduler, i, paramInt)) {
      a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", paramn);
      return;
    } 
    long l = this.b.b(paramn);
    n n1 = this.c;
    JobInfo.Builder builder = new JobInfo.Builder(i, componentName);
    n1.a(builder, paramn.c(), l, paramInt);
    PersistableBundle persistableBundle = new PersistableBundle();
    persistableBundle.putInt("attemptNumber", paramInt);
    persistableBundle.putString("backendName", paramn.a());
    persistableBundle.putInt("priority", a.a(paramn.c()));
    if (paramn.b() != null)
      persistableBundle.putString("extras", Base64.encodeToString(paramn.b(), 0)); 
    builder.setExtras(persistableBundle);
    a.a("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", new Object[] { paramn, Integer.valueOf(i), Long.valueOf(this.c.a(paramn.c(), l, paramInt)), Long.valueOf(l), Integer.valueOf(paramInt) });
    jobScheduler.schedule(builder.build());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/datatransport/runtime/scheduling/jobscheduling/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */