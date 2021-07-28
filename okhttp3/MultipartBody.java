package okhttp3;

import j.c;
import j.d;
import j.f;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import okhttp3.internal.Util;

public final class MultipartBody extends RequestBody {
  public static final MediaType ALTERNATIVE;
  
  private static final byte[] COLONSPACE;
  
  private static final byte[] CRLF;
  
  private static final byte[] DASHDASH;
  
  public static final MediaType DIGEST;
  
  public static final MediaType FORM;
  
  public static final MediaType MIXED = MediaType.get("multipart/mixed");
  
  public static final MediaType PARALLEL;
  
  private final f boundary;
  
  private long contentLength = -1L;
  
  private final MediaType contentType;
  
  private final MediaType originalType;
  
  private final List<Part> parts;
  
  static {
    ALTERNATIVE = MediaType.get("multipart/alternative");
    DIGEST = MediaType.get("multipart/digest");
    PARALLEL = MediaType.get("multipart/parallel");
    FORM = MediaType.get("multipart/form-data");
    COLONSPACE = new byte[] { 58, 32 };
    CRLF = new byte[] { 13, 10 };
    DASHDASH = new byte[] { 45, 45 };
  }
  
  MultipartBody(f paramf, MediaType paramMediaType, List<Part> paramList) {
    this.boundary = paramf;
    this.originalType = paramMediaType;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramMediaType);
    stringBuilder.append("; boundary=");
    stringBuilder.append(paramf.v());
    this.contentType = MediaType.get(stringBuilder.toString());
    this.parts = Util.immutableList(paramList);
  }
  
  static StringBuilder appendQuotedString(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append('"');
    int j = paramString.length();
    for (int i = 0; i < j; i++) {
      char c = paramString.charAt(i);
      if (c != '\n') {
        if (c != '\r') {
          if (c != '"') {
            paramStringBuilder.append(c);
          } else {
            String str = "%22";
            paramStringBuilder.append(str);
          } 
        } else {
          String str = "%0D";
          paramStringBuilder.append(str);
        } 
      } else {
        String str = "%0A";
        paramStringBuilder.append(str);
      } 
    } 
    paramStringBuilder.append('"');
    return paramStringBuilder;
  }
  
  private long writeOrCountBytes(d paramd, boolean paramBoolean) {
    c c1;
    c c2;
    if (paramBoolean) {
      c2 = new c();
      c1 = c2;
    } else {
      c c = null;
      c2 = c1;
      c1 = c;
    } 
    int j = this.parts.size();
    long l1 = 0L;
    for (int i = 0; i < j; i++) {
      Part part = this.parts.get(i);
      Headers headers = part.headers;
      RequestBody requestBody = part.body;
      c2.write(DASHDASH);
      c2.a(this.boundary);
      c2.write(CRLF);
      if (headers != null) {
        int m = headers.size();
        int k;
        for (k = 0; k < m; k++)
          c2.a(headers.name(k)).write(COLONSPACE).a(headers.value(k)).write(CRLF); 
      } 
      MediaType mediaType = requestBody.contentType();
      if (mediaType != null)
        c2.a("Content-Type: ").a(mediaType.toString()).write(CRLF); 
      long l = requestBody.contentLength();
      if (l != -1L) {
        c2.a("Content-Length: ").i(l).write(CRLF);
      } else if (paramBoolean) {
        c1.a();
        return -1L;
      } 
      c2.write(CRLF);
      if (paramBoolean) {
        l1 += l;
      } else {
        requestBody.writeTo((d)c2);
      } 
      c2.write(CRLF);
    } 
    c2.write(DASHDASH);
    c2.a(this.boundary);
    c2.write(DASHDASH);
    c2.write(CRLF);
    long l2 = l1;
    if (paramBoolean) {
      l2 = l1 + c1.s();
      c1.a();
    } 
    return l2;
  }
  
  public String boundary() {
    return this.boundary.v();
  }
  
  public long contentLength() {
    long l = this.contentLength;
    if (l != -1L)
      return l; 
    l = writeOrCountBytes(null, true);
    this.contentLength = l;
    return l;
  }
  
  public MediaType contentType() {
    return this.contentType;
  }
  
  public Part part(int paramInt) {
    return this.parts.get(paramInt);
  }
  
  public List<Part> parts() {
    return this.parts;
  }
  
  public int size() {
    return this.parts.size();
  }
  
  public MediaType type() {
    return this.originalType;
  }
  
  public void writeTo(d paramd) {
    writeOrCountBytes(paramd, false);
  }
  
  public static final class Builder {
    private final f boundary;
    
    private final List<MultipartBody.Part> parts = new ArrayList<MultipartBody.Part>();
    
    private MediaType type = MultipartBody.MIXED;
    
    public Builder() {
      this(UUID.randomUUID().toString());
    }
    
    public Builder(String param1String) {
      this.boundary = f.d(param1String);
    }
    
    public Builder addFormDataPart(String param1String1, String param1String2) {
      return addPart(MultipartBody.Part.createFormData(param1String1, param1String2));
    }
    
    public Builder addFormDataPart(String param1String1, String param1String2, RequestBody param1RequestBody) {
      return addPart(MultipartBody.Part.createFormData(param1String1, param1String2, param1RequestBody));
    }
    
    public Builder addPart(Headers param1Headers, RequestBody param1RequestBody) {
      return addPart(MultipartBody.Part.create(param1Headers, param1RequestBody));
    }
    
    public Builder addPart(MultipartBody.Part param1Part) {
      if (param1Part != null) {
        this.parts.add(param1Part);
        return this;
      } 
      throw new NullPointerException("part == null");
    }
    
    public Builder addPart(RequestBody param1RequestBody) {
      return addPart(MultipartBody.Part.create(param1RequestBody));
    }
    
    public MultipartBody build() {
      if (!this.parts.isEmpty())
        return new MultipartBody(this.boundary, this.type, this.parts); 
      throw new IllegalStateException("Multipart body must have at least one part.");
    }
    
    public Builder setType(MediaType param1MediaType) {
      if (param1MediaType != null) {
        if (param1MediaType.type().equals("multipart")) {
          this.type = param1MediaType;
          return this;
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("multipart != ");
        stringBuilder.append(param1MediaType);
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      throw new NullPointerException("type == null");
    }
  }
  
  public static final class Part {
    final RequestBody body;
    
    final Headers headers;
    
    private Part(Headers param1Headers, RequestBody param1RequestBody) {
      this.headers = param1Headers;
      this.body = param1RequestBody;
    }
    
    public static Part create(Headers param1Headers, RequestBody param1RequestBody) {
      if (param1RequestBody != null) {
        if (param1Headers == null || param1Headers.get("Content-Type") == null) {
          if (param1Headers == null || param1Headers.get("Content-Length") == null)
            return new Part(param1Headers, param1RequestBody); 
          throw new IllegalArgumentException("Unexpected header: Content-Length");
        } 
        throw new IllegalArgumentException("Unexpected header: Content-Type");
      } 
      throw new NullPointerException("body == null");
    }
    
    public static Part create(RequestBody param1RequestBody) {
      return create(null, param1RequestBody);
    }
    
    public static Part createFormData(String param1String1, String param1String2) {
      return createFormData(param1String1, null, RequestBody.create((MediaType)null, param1String2));
    }
    
    public static Part createFormData(String param1String1, String param1String2, RequestBody param1RequestBody) {
      if (param1String1 != null) {
        StringBuilder stringBuilder = new StringBuilder("form-data; name=");
        MultipartBody.appendQuotedString(stringBuilder, param1String1);
        if (param1String2 != null) {
          stringBuilder.append("; filename=");
          MultipartBody.appendQuotedString(stringBuilder, param1String2);
        } 
        return create(Headers.of(new String[] { "Content-Disposition", stringBuilder.toString() }, ), param1RequestBody);
      } 
      throw new NullPointerException("name == null");
    }
    
    public RequestBody body() {
      return this.body;
    }
    
    public Headers headers() {
      return this.headers;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/MultipartBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */