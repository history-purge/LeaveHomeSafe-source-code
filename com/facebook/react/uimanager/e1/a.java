package com.facebook.react.uimanager.e1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface a {
  String customType() default "__default_type__";
  
  boolean defaultBoolean() default false;
  
  double defaultDouble() default 0.0D;
  
  float defaultFloat() default 0.0F;
  
  int defaultInt() default 0;
  
  String name();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/e1/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */