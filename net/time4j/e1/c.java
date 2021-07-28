package net.time4j.e1;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface c {
  String value();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */