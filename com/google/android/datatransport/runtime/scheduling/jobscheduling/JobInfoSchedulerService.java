package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import e.f.a.c.i.a0.a;
import e.f.a.c.i.n;
import e.f.a.c.i.r;

public class JobInfoSchedulerService extends JobService {
  public boolean onStartJob(JobParameters paramJobParameters) {
    String str1 = paramJobParameters.getExtras().getString("backendName");
    String str2 = paramJobParameters.getExtras().getString("extras");
    int i = paramJobParameters.getExtras().getInt("priority");
    int j = paramJobParameters.getExtras().getInt("attemptNumber");
    r.a(getApplicationContext());
    n.a a = n.d();
    a.a(str1);
    a.a(a.a(i));
    if (str2 != null)
      a.a(Base64.decode(str2, 0)); 
    r.b().a().b(a.a(), j, new c(this, paramJobParameters));
    return true;
  }
  
  public boolean onStopJob(JobParameters paramJobParameters) {
    return true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/datatransport/runtime/scheduling/jobscheduling/JobInfoSchedulerService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */