package com.facebook.react.uimanager.e1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface b {
  String customType() default "__default_type__";
  
  double defaultDouble() default 0.0D;
  
  float defaultFloat() default 0.0F;
  
  int defaultInt() default 0;
  
  String[] names();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/e1/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */