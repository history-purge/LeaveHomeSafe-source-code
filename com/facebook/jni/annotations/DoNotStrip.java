package com.facebook.jni.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface DoNotStrip {}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/jni/annotations/DoNotStrip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */