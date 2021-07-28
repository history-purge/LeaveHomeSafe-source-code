package com.transistorsoft.tsbackgroundfetch;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.util.Log;

@TargetApi(21)
public class FetchJobService extends JobService {
  public boolean onStartJob(JobParameters paramJobParameters) {
    a a = new a((Context)this, paramJobParameters.getExtras().getString("taskId"), new a(this, paramJobParameters), paramJobParameters.getJobId());
    b.a(getApplicationContext()).a(a);
    return true;
  }
  
  public boolean onStopJob(JobParameters paramJobParameters) {
    Log.d("TSBackgroundFetch", "- onStopJob");
    a a = a.b(paramJobParameters.getExtras().getString("taskId"));
    if (a != null)
      a.a(getApplicationContext()); 
    jobFinished(paramJobParameters, false);
    return true;
  }
  
  class a implements b {
    a(FetchJobService this$0, JobParameters param1JobParameters) {}
    
    public void finish() {
      Log.d("TSBackgroundFetch", "- jobFinished");
      this.b.jobFinished(this.a, false);
    }
  }
  
  public static interface b {
    void finish();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/transistorsoft/tsbackgroundfetch/FetchJobService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */