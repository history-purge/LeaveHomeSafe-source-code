package e.e.l.l;

import e.e.e.e.a;
import e.e.l.o.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class b implements c {
  private final List<c> a;
  
  public b(Set<c> paramSet) {
    this.a = new ArrayList<c>(paramSet.size());
    for (c c1 : paramSet) {
      if (c1 != null)
        this.a.add(c1); 
    } 
  }
  
  public b(c... paramVarArgs) {
    this.a = new ArrayList<c>(paramVarArgs.length);
    int j = paramVarArgs.length;
    for (int i = 0; i < j; i++) {
      c c1 = paramVarArgs[i];
      if (c1 != null)
        this.a.add(c1); 
    } 
  }
  
  private void a(String paramString, Throwable paramThrowable) {
    a.b("ForwardingRequestListener", paramString, paramThrowable);
  }
  
  public void a(c paramc) {
    this.a.add(paramc);
  }
  
  public void a(c paramc, Object paramObject, String paramString, boolean paramBoolean) {
    int j = this.a.size();
    int i;
    for (i = 0; i < j; i++) {
      c c1 = this.a.get(i);
      try {
        c1.a(paramc, paramObject, paramString, paramBoolean);
      } catch (Exception exception) {
        a("InternalListener exception in onRequestStart", exception);
      } 
    } 
  }
  
  public void a(c paramc, String paramString, Throwable paramThrowable, boolean paramBoolean) {
    int j = this.a.size();
    int i;
    for (i = 0; i < j; i++) {
      c c1 = this.a.get(i);
      try {
        c1.a(paramc, paramString, paramThrowable, paramBoolean);
      } catch (Exception exception) {
        a("InternalListener exception in onRequestFailure", exception);
      } 
    } 
  }
  
  public void a(c paramc, String paramString, boolean paramBoolean) {
    int j = this.a.size();
    int i;
    for (i = 0; i < j; i++) {
      c c1 = this.a.get(i);
      try {
        c1.a(paramc, paramString, paramBoolean);
      } catch (Exception exception) {
        a("InternalListener exception in onRequestSuccess", exception);
      } 
    } 
  }
  
  public void a(String paramString1, String paramString2) {
    int j = this.a.size();
    for (int i = 0; i < j; i++) {
      c c1 = this.a.get(i);
      try {
        c1.a(paramString1, paramString2);
      } catch (Exception exception) {
        a("InternalListener exception in onProducerStart", exception);
      } 
    } 
  }
  
  public void a(String paramString1, String paramString2, String paramString3) {
    int j = this.a.size();
    int i;
    for (i = 0; i < j; i++) {
      c c1 = this.a.get(i);
      try {
        c1.a(paramString1, paramString2, paramString3);
      } catch (Exception exception) {
        a("InternalListener exception in onIntermediateChunkStart", exception);
      } 
    } 
  }
  
  public void a(String paramString1, String paramString2, Throwable paramThrowable, Map<String, String> paramMap) {
    int j = this.a.size();
    int i;
    for (i = 0; i < j; i++) {
      c c1 = this.a.get(i);
      try {
        c1.a(paramString1, paramString2, paramThrowable, paramMap);
      } catch (Exception exception) {
        a("InternalListener exception in onProducerFinishWithFailure", exception);
      } 
    } 
  }
  
  public void a(String paramString1, String paramString2, Map<String, String> paramMap) {
    int j = this.a.size();
    int i;
    for (i = 0; i < j; i++) {
      c c1 = this.a.get(i);
      try {
        c1.a(paramString1, paramString2, paramMap);
      } catch (Exception exception) {
        a("InternalListener exception in onProducerFinishWithSuccess", exception);
      } 
    } 
  }
  
  public void a(String paramString1, String paramString2, boolean paramBoolean) {
    int j = this.a.size();
    int i;
    for (i = 0; i < j; i++) {
      c c1 = this.a.get(i);
      try {
        c1.a(paramString1, paramString2, paramBoolean);
      } catch (Exception exception) {
        a("InternalListener exception in onProducerFinishWithSuccess", exception);
      } 
    } 
  }
  
  public boolean a(String paramString) {
    int j = this.a.size();
    for (int i = 0; i < j; i++) {
      if (((c)this.a.get(i)).a(paramString))
        return true; 
    } 
    return false;
  }
  
  public void b(String paramString) {
    int j = this.a.size();
    for (int i = 0; i < j; i++) {
      c c1 = this.a.get(i);
      try {
        c1.b(paramString);
      } catch (Exception exception) {
        a("InternalListener exception in onRequestCancellation", exception);
      } 
    } 
  }
  
  public void b(String paramString1, String paramString2, Map<String, String> paramMap) {
    int j = this.a.size();
    int i;
    for (i = 0; i < j; i++) {
      c c1 = this.a.get(i);
      try {
        c1.b(paramString1, paramString2, paramMap);
      } catch (Exception exception) {
        a("InternalListener exception in onProducerFinishWithCancellation", exception);
      } 
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/l/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */