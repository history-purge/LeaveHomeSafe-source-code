package e.f.a.c.i.x.j;

final class w extends z {
  private final long b;
  
  private final int c;
  
  private final int d;
  
  private final long e;
  
  private final int f;
  
  private w(long paramLong1, int paramInt1, int paramInt2, long paramLong2, int paramInt3) {
    this.b = paramLong1;
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramLong2;
    this.f = paramInt3;
  }
  
  int a() {
    return this.d;
  }
  
  long b() {
    return this.e;
  }
  
  int c() {
    return this.c;
  }
  
  int d() {
    return this.f;
  }
  
  long e() {
    return this.b;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof z) {
      paramObject = paramObject;
      return (this.b == paramObject.e() && this.c == paramObject.c() && this.d == paramObject.a() && this.e == paramObject.b() && this.f == paramObject.d());
    } 
    return false;
  }
  
  public int hashCode() {
    long l = this.b;
    int i = (int)(l ^ l >>> 32L);
    int j = this.c;
    int k = this.d;
    l = this.e;
    int m = (int)(l ^ l >>> 32L);
    return this.f ^ ((((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ k) * 1000003 ^ m) * 1000003;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("EventStoreConfig{maxStorageSizeInBytes=");
    stringBuilder.append(this.b);
    stringBuilder.append(", loadBatchSize=");
    stringBuilder.append(this.c);
    stringBuilder.append(", criticalSectionEnterTimeoutMs=");
    stringBuilder.append(this.d);
    stringBuilder.append(", eventCleanUpAge=");
    stringBuilder.append(this.e);
    stringBuilder.append(", maxBlobByteSizePerRow=");
    stringBuilder.append(this.f);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  static final class b extends z.a {
    private Long a;
    
    private Integer b;
    
    private Integer c;
    
    private Long d;
    
    private Integer e;
    
    z.a a(int param1Int) {
      this.c = Integer.valueOf(param1Int);
      return this;
    }
    
    z.a a(long param1Long) {
      this.d = Long.valueOf(param1Long);
      return this;
    }
    
    z a() {
      Long long_ = this.a;
      String str1 = "";
      if (long_ == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("");
        stringBuilder1.append(" maxStorageSizeInBytes");
        str1 = stringBuilder1.toString();
      } 
      String str2 = str1;
      if (this.b == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str1);
        stringBuilder1.append(" loadBatchSize");
        str2 = stringBuilder1.toString();
      } 
      str1 = str2;
      if (this.c == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str2);
        stringBuilder1.append(" criticalSectionEnterTimeoutMs");
        str1 = stringBuilder1.toString();
      } 
      str2 = str1;
      if (this.d == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str1);
        stringBuilder1.append(" eventCleanUpAge");
        str2 = stringBuilder1.toString();
      } 
      str1 = str2;
      if (this.e == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str2);
        stringBuilder1.append(" maxBlobByteSizePerRow");
        str1 = stringBuilder1.toString();
      } 
      if (str1.isEmpty())
        return new w(this.a.longValue(), this.b.intValue(), this.c.intValue(), this.d.longValue(), this.e.intValue(), null); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Missing required properties:");
      stringBuilder.append(str1);
      throw new IllegalStateException(stringBuilder.toString());
    }
    
    z.a b(int param1Int) {
      this.b = Integer.valueOf(param1Int);
      return this;
    }
    
    z.a b(long param1Long) {
      this.a = Long.valueOf(param1Long);
      return this;
    }
    
    z.a c(int param1Int) {
      this.e = Integer.valueOf(param1Int);
      return this;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/c/i/x/j/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */