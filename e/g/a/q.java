package e.g.a;

import e.g.a.r.c;
import e.g.a.u.a;
import java.io.PrintStream;

public class q {
  public static boolean a = false;
  
  public static <T extends f> T a(f paramf, Class<T> paramClass) {
    f f1 = paramf;
    if (paramClass.isInstance(paramf))
      return (T)paramf; 
    while (f1 instanceof a) {
      paramf = ((a)f1).a();
      f1 = paramf;
      if (paramClass.isInstance(paramf))
        return (T)paramf; 
    } 
    return null;
  }
  
  public static void a(i parami, g paramg) {
    PrintStream printStream;
    StringBuilder stringBuilder;
    c c = null;
    while (!parami.b()) {
      c c1 = parami.c();
      c = c1;
      if (c1 != null) {
        int j = paramg.e();
        c = c1;
        if (j > 0) {
          c1.a(parami, paramg);
          c = c1;
          if (j == paramg.e()) {
            c = c1;
            if (c1 == parami.c()) {
              c = c1;
              if (!parami.b()) {
                printStream = System.out;
                stringBuilder = new StringBuilder();
                stringBuilder.append("handler: ");
                stringBuilder.append(c1);
                printStream.println(stringBuilder.toString());
                paramg.d();
                if (a)
                  return; 
                throw new RuntimeException("mDataHandler failed to consume data, yet remains the mDataHandler.");
              } 
            } 
          } 
        } 
      } 
    } 
    if (paramg.e() != 0 && !printStream.b()) {
      PrintStream printStream2 = System.out;
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append("handler: ");
      stringBuilder2.append(stringBuilder);
      printStream2.println(stringBuilder2.toString());
      PrintStream printStream1 = System.out;
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("emitter: ");
      stringBuilder1.append(printStream);
      printStream1.println(stringBuilder1.toString());
      paramg.d();
      if (a)
        return; 
      throw new RuntimeException("Not all data was consumed by Util.emitAllData");
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/g/a/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */