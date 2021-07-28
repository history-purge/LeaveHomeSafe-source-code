package b.g.k;

import android.util.Base64;
import androidx.core.util.f;
import java.util.List;

public final class a {
  private final String a;
  
  private final String b;
  
  private final String c;
  
  private final List<List<byte[]>> d;
  
  private final int e;
  
  private final String f;
  
  public a(String paramString1, String paramString2, String paramString3, List<List<byte[]>> paramList) {
    f.a(paramString1);
    this.a = paramString1;
    f.a(paramString2);
    this.b = paramString2;
    f.a(paramString3);
    this.c = paramString3;
    f.a(paramList);
    this.d = paramList;
    this.e = 0;
    StringBuilder stringBuilder = new StringBuilder(this.a);
    stringBuilder.append("-");
    stringBuilder.append(this.b);
    stringBuilder.append("-");
    stringBuilder.append(this.c);
    this.f = stringBuilder.toString();
  }
  
  public List<List<byte[]>> a() {
    return this.d;
  }
  
  public int b() {
    return this.e;
  }
  
  public String c() {
    return this.f;
  }
  
  public String d() {
    return this.a;
  }
  
  public String e() {
    return this.b;
  }
  
  public String f() {
    return this.c;
  }
  
  public String toString() {
    StringBuilder stringBuilder1 = new StringBuilder();
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append("FontRequest {mProviderAuthority: ");
    stringBuilder2.append(this.a);
    stringBuilder2.append(", mProviderPackage: ");
    stringBuilder2.append(this.b);
    stringBuilder2.append(", mQuery: ");
    stringBuilder2.append(this.c);
    stringBuilder2.append(", mCertificates:");
    stringBuilder1.append(stringBuilder2.toString());
    for (int i = 0; i < this.d.size(); i++) {
      stringBuilder1.append(" [");
      List<byte[]> list = this.d.get(i);
      for (int j = 0; j < list.size(); j++) {
        stringBuilder1.append(" \"");
        stringBuilder1.append(Base64.encodeToString(list.get(j), 0));
        stringBuilder1.append("\"");
      } 
      stringBuilder1.append(" ]");
    } 
    stringBuilder1.append("}");
    stringBuilder2 = new StringBuilder();
    stringBuilder2.append("mCertificatesArray: ");
    stringBuilder2.append(this.e);
    stringBuilder1.append(stringBuilder2.toString());
    return stringBuilder1.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/k/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */