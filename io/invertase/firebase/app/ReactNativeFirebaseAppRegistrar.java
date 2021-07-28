package io.invertase.firebase.app;

import androidx.annotation.Keep;
import com.google.firebase.components.n;
import com.google.firebase.components.r;
import com.google.firebase.r.h;
import java.util.Collections;
import java.util.List;

@Keep
public class ReactNativeFirebaseAppRegistrar implements r {
  public List<n<?>> getComponents() {
    return Collections.singletonList(h.a("react-native-firebase", c.a));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/invertase/firebase/app/ReactNativeFirebaseAppRegistrar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */