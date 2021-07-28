package e.e.e.d;

import java.util.ArrayList;
import java.util.Collections;

public class e<E> extends ArrayList<E> {
  private e(int paramInt) {
    super(paramInt);
  }
  
  public static <E> e<E> of(E... paramVarArgs) {
    e<? super E> e1 = new e(paramVarArgs.length);
    Collections.addAll(e1, paramVarArgs);
    return (e)e1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/d/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */