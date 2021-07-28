package okhttp3;

import j.c;
import j.d;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.Util;

public final class FormBody extends RequestBody {
  private static final MediaType CONTENT_TYPE = MediaType.get("application/x-www-form-urlencoded");
  
  private final List<String> encodedNames;
  
  private final List<String> encodedValues;
  
  FormBody(List<String> paramList1, List<String> paramList2) {
    this.encodedNames = Util.immutableList(paramList1);
    this.encodedValues = Util.immutableList(paramList2);
  }
  
  private long writeOrCountBytes(d paramd, boolean paramBoolean) {
    c c;
    if (paramBoolean) {
      c = new c();
    } else {
      c = c.f();
    } 
    int i = 0;
    int j = this.encodedNames.size();
    while (i < j) {
      if (i > 0)
        c.writeByte(38); 
      c.a(this.encodedNames.get(i));
      c.writeByte(61);
      c.a(this.encodedValues.get(i));
      i++;
    } 
    if (paramBoolean) {
      long l = c.s();
      c.a();
      return l;
    } 
    return 0L;
  }
  
  public long contentLength() {
    return writeOrCountBytes(null, true);
  }
  
  public MediaType contentType() {
    return CONTENT_TYPE;
  }
  
  public String encodedName(int paramInt) {
    return this.encodedNames.get(paramInt);
  }
  
  public String encodedValue(int paramInt) {
    return this.encodedValues.get(paramInt);
  }
  
  public String name(int paramInt) {
    return HttpUrl.percentDecode(encodedName(paramInt), true);
  }
  
  public int size() {
    return this.encodedNames.size();
  }
  
  public String value(int paramInt) {
    return HttpUrl.percentDecode(encodedValue(paramInt), true);
  }
  
  public void writeTo(d paramd) {
    writeOrCountBytes(paramd, false);
  }
  
  public static final class Builder {
    private final Charset charset;
    
    private final List<String> names = new ArrayList<String>();
    
    private final List<String> values = new ArrayList<String>();
    
    public Builder() {
      this(null);
    }
    
    public Builder(Charset param1Charset) {
      this.charset = param1Charset;
    }
    
    public Builder add(String param1String1, String param1String2) {
      if (param1String1 != null) {
        if (param1String2 != null) {
          this.names.add(HttpUrl.canonicalize(param1String1, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.charset));
          this.values.add(HttpUrl.canonicalize(param1String2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.charset));
          return this;
        } 
        throw new NullPointerException("value == null");
      } 
      throw new NullPointerException("name == null");
    }
    
    public Builder addEncoded(String param1String1, String param1String2) {
      if (param1String1 != null) {
        if (param1String2 != null) {
          this.names.add(HttpUrl.canonicalize(param1String1, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.charset));
          this.values.add(HttpUrl.canonicalize(param1String2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.charset));
          return this;
        } 
        throw new NullPointerException("value == null");
      } 
      throw new NullPointerException("name == null");
    }
    
    public FormBody build() {
      return new FormBody(this.names, this.values);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/FormBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */