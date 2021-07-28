package e.e.o.d0.a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface a {
  boolean canOverrideExistingModule() default false;
  
  boolean hasConstants() default true;
  
  boolean isCxxModule() default false;
  
  String name();
  
  boolean needsEagerInit() default false;
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/d0/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */