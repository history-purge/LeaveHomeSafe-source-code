package e.f.a.e.i.j;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class g5 {
  public static String a(String paramString, Object... paramVarArgs) {
    int j = 0;
    int i = 0;
    while (true) {
      int k = paramVarArgs.length;
      if (i < k) {
        String str;
        Object object = paramVarArgs[i];
        if (object == null) {
          str = "null";
        } else {
          try {
            str = object.toString();
          } catch (Exception exception) {
            str = object.getClass().getName();
            object = Integer.toHexString(System.identityHashCode(object));
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(object).length());
            stringBuilder2.append(str);
            stringBuilder2.append('@');
            stringBuilder2.append((String)object);
            object = stringBuilder2.toString();
            Logger logger = Logger.getLogger("com.google.common.base.Strings");
            Level level = Level.WARNING;
            str = String.valueOf(object);
            if (str.length() != 0) {
              str = "Exception during lenientFormat for ".concat(str);
            } else {
              str = new String("Exception during lenientFormat for ");
            } 
            logger.logp(level, "com.google.common.base.Strings", "lenientToString", str, exception);
            str = exception.getClass().getName();
            StringBuilder stringBuilder1 = new StringBuilder(String.valueOf(object).length() + 9 + String.valueOf(str).length());
            stringBuilder1.append("<");
            stringBuilder1.append((String)object);
            stringBuilder1.append(" threw ");
            stringBuilder1.append(str);
            stringBuilder1.append(">");
            str = stringBuilder1.toString();
          } 
        } 
        paramVarArgs[i] = str;
        i++;
        continue;
      } 
      StringBuilder stringBuilder = new StringBuilder(paramString.length() + k * 16);
      k = 0;
      i = j;
      while (true) {
        j = paramVarArgs.length;
        if (i < j) {
          int m = paramString.indexOf("%s", k);
          if (m == -1)
            break; 
          stringBuilder.append(paramString, k, m);
          stringBuilder.append(paramVarArgs[i]);
          k = m + 2;
          i++;
          continue;
        } 
        break;
      } 
      stringBuilder.append(paramString, k, paramString.length());
      if (i < j) {
        stringBuilder.append(" [");
        k = i + 1;
        stringBuilder.append(paramVarArgs[i]);
        for (i = k; i < paramVarArgs.length; i++) {
          stringBuilder.append(", ");
          stringBuilder.append(paramVarArgs[i]);
        } 
        stringBuilder.append(']');
      } 
      return stringBuilder.toString();
    } 
  }
  
  public static boolean a(String paramString) {
    return e3.a(paramString);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/j/g5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */