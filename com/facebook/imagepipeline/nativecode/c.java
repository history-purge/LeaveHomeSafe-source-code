package com.facebook.imagepipeline.nativecode;

import e.e.l.q.d;
import java.lang.reflect.InvocationTargetException;

public final class c {
  public static d a(int paramInt, boolean paramBoolean) {
    try {
      return Class.forName("com.facebook.imagepipeline.nativecode.NativeJpegTranscoderFactory").getConstructor(new Class[] { int.class, boolean.class }).newInstance(new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    } catch (NoSuchMethodException noSuchMethodException) {
    
    } catch (SecurityException securityException) {
    
    } catch (InstantiationException instantiationException) {
    
    } catch (InvocationTargetException invocationTargetException) {
    
    } catch (IllegalAccessException illegalAccessException) {
    
    } catch (IllegalArgumentException illegalArgumentException) {
    
    } catch (ClassNotFoundException classNotFoundException) {}
    throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", classNotFoundException);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/nativecode/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */