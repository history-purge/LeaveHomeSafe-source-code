package e.f.a.f.l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.List;

public class b {
  public static void a(AnimatorSet paramAnimatorSet, List<Animator> paramList) {
    int j = paramList.size();
    long l = 0L;
    for (int i = 0; i < j; i++) {
      Animator animator = paramList.get(i);
      l = Math.max(l, animator.getStartDelay() + animator.getDuration());
    } 
    ValueAnimator valueAnimator = ValueAnimator.ofInt(new int[] { 0, 0 });
    valueAnimator.setDuration(l);
    paramList.add(0, valueAnimator);
    paramAnimatorSet.playTogether(paramList);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/f/l/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */