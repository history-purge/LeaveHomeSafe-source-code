package okhttp3.internal.http2;

import j.c;
import j.d;
import j.e;
import j.f;
import j.l;
import j.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

final class Hpack {
  static final Map<f, Integer> NAME_TO_FIRST_INDEX;
  
  private static final int PREFIX_4_BITS = 15;
  
  private static final int PREFIX_5_BITS = 31;
  
  private static final int PREFIX_6_BITS = 63;
  
  private static final int PREFIX_7_BITS = 127;
  
  static final Header[] STATIC_HEADER_TABLE = new Header[] { 
      new Header(Header.TARGET_AUTHORITY, ""), new Header(Header.TARGET_METHOD, "GET"), new Header(Header.TARGET_METHOD, "POST"), new Header(Header.TARGET_PATH, "/"), new Header(Header.TARGET_PATH, "/index.html"), new Header(Header.TARGET_SCHEME, "http"), new Header(Header.TARGET_SCHEME, "https"), new Header(Header.RESPONSE_STATUS, "200"), new Header(Header.RESPONSE_STATUS, "204"), new Header(Header.RESPONSE_STATUS, "206"), 
      new Header(Header.RESPONSE_STATUS, "304"), new Header(Header.RESPONSE_STATUS, "400"), new Header(Header.RESPONSE_STATUS, "404"), new Header(Header.RESPONSE_STATUS, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), 
      new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), 
      new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), 
      new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), 
      new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), 
      new Header("www-authenticate", "") };
  
  static {
    NAME_TO_FIRST_INDEX = nameToFirstIndex();
  }
  
  static f checkLowercase(f paramf) {
    int j = paramf.s();
    int i = 0;
    while (i < j) {
      byte b = paramf.f(i);
      if (b < 65 || b > 90) {
        i++;
        continue;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("PROTOCOL_ERROR response malformed: mixed case name: ");
      stringBuilder.append(paramf.v());
      throw new IOException(stringBuilder.toString());
    } 
    return paramf;
  }
  
  private static Map<f, Integer> nameToFirstIndex() {
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(STATIC_HEADER_TABLE.length);
    int i = 0;
    while (true) {
      Header[] arrayOfHeader = STATIC_HEADER_TABLE;
      if (i < arrayOfHeader.length) {
        if (!linkedHashMap.containsKey((arrayOfHeader[i]).name))
          linkedHashMap.put((STATIC_HEADER_TABLE[i]).name, Integer.valueOf(i)); 
        i++;
        continue;
      } 
      return (Map)Collections.unmodifiableMap(linkedHashMap);
    } 
  }
  
  static final class Reader {
    Header[] dynamicTable = new Header[8];
    
    int dynamicTableByteCount = 0;
    
    int headerCount = 0;
    
    private final List<Header> headerList = new ArrayList<Header>();
    
    private final int headerTableSizeSetting;
    
    private int maxDynamicTableByteCount;
    
    int nextHeaderIndex = this.dynamicTable.length - 1;
    
    private final e source;
    
    Reader(int param1Int1, int param1Int2, t param1t) {
      this.headerTableSizeSetting = param1Int1;
      this.maxDynamicTableByteCount = param1Int2;
      this.source = l.a(param1t);
    }
    
    Reader(int param1Int, t param1t) {
      this(param1Int, param1Int, param1t);
    }
    
    private void adjustDynamicTableByteCount() {
      int i = this.maxDynamicTableByteCount;
      int j = this.dynamicTableByteCount;
      if (i < j) {
        if (i == 0) {
          clearDynamicTable();
          return;
        } 
        evictToRecoverBytes(j - i);
      } 
    }
    
    private void clearDynamicTable() {
      Arrays.fill((Object[])this.dynamicTable, (Object)null);
      this.nextHeaderIndex = this.dynamicTable.length - 1;
      this.headerCount = 0;
      this.dynamicTableByteCount = 0;
    }
    
    private int dynamicTableIndex(int param1Int) {
      return this.nextHeaderIndex + 1 + param1Int;
    }
    
    private int evictToRecoverBytes(int param1Int) {
      int i = 0;
      boolean bool = false;
      if (param1Int > 0) {
        i = this.dynamicTable.length - 1;
        int j = param1Int;
        param1Int = bool;
        while (i >= this.nextHeaderIndex && j > 0) {
          Header[] arrayOfHeader1 = this.dynamicTable;
          j -= (arrayOfHeader1[i]).hpackSize;
          this.dynamicTableByteCount -= (arrayOfHeader1[i]).hpackSize;
          this.headerCount--;
          param1Int++;
          i--;
        } 
        Header[] arrayOfHeader = this.dynamicTable;
        i = this.nextHeaderIndex;
        System.arraycopy(arrayOfHeader, i + 1, arrayOfHeader, i + 1 + param1Int, this.headerCount);
        this.nextHeaderIndex += param1Int;
        i = param1Int;
      } 
      return i;
    }
    
    private f getName(int param1Int) {
      if (isStaticHeader(param1Int)) {
        Header header = Hpack.STATIC_HEADER_TABLE[param1Int];
        return header.name;
      } 
      int i = dynamicTableIndex(param1Int - Hpack.STATIC_HEADER_TABLE.length);
      if (i >= 0) {
        Header[] arrayOfHeader = this.dynamicTable;
        if (i < arrayOfHeader.length) {
          Header header = arrayOfHeader[i];
          return header.name;
        } 
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Header index too large ");
      stringBuilder.append(param1Int + 1);
      IOException iOException = new IOException(stringBuilder.toString());
      throw iOException;
    }
    
    private void insertIntoDynamicTable(int param1Int, Header param1Header) {
      this.headerList.add(param1Header);
      int j = param1Header.hpackSize;
      int i = j;
      if (param1Int != -1)
        i = j - (this.dynamicTable[dynamicTableIndex(param1Int)]).hpackSize; 
      j = this.maxDynamicTableByteCount;
      if (i > j) {
        clearDynamicTable();
        return;
      } 
      j = evictToRecoverBytes(this.dynamicTableByteCount + i - j);
      if (param1Int == -1) {
        param1Int = this.headerCount;
        Header[] arrayOfHeader = this.dynamicTable;
        if (param1Int + 1 > arrayOfHeader.length) {
          Header[] arrayOfHeader1 = new Header[arrayOfHeader.length * 2];
          System.arraycopy(arrayOfHeader, 0, arrayOfHeader1, arrayOfHeader.length, arrayOfHeader.length);
          this.nextHeaderIndex = this.dynamicTable.length - 1;
          this.dynamicTable = arrayOfHeader1;
        } 
        param1Int = this.nextHeaderIndex;
        this.nextHeaderIndex = param1Int - 1;
        this.dynamicTable[param1Int] = param1Header;
        this.headerCount++;
      } else {
        int k = dynamicTableIndex(param1Int);
        this.dynamicTable[param1Int + k + j] = param1Header;
      } 
      this.dynamicTableByteCount += i;
    }
    
    private boolean isStaticHeader(int param1Int) {
      return (param1Int >= 0 && param1Int <= Hpack.STATIC_HEADER_TABLE.length - 1);
    }
    
    private int readByte() {
      return this.source.readByte() & 0xFF;
    }
    
    private void readIndexedHeader(int param1Int) {
      if (isStaticHeader(param1Int)) {
        Header header = Hpack.STATIC_HEADER_TABLE[param1Int];
        this.headerList.add(header);
        return;
      } 
      int i = dynamicTableIndex(param1Int - Hpack.STATIC_HEADER_TABLE.length);
      if (i >= 0) {
        Header[] arrayOfHeader = this.dynamicTable;
        if (i < arrayOfHeader.length) {
          this.headerList.add(arrayOfHeader[i]);
          return;
        } 
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Header index too large ");
      stringBuilder.append(param1Int + 1);
      throw new IOException(stringBuilder.toString());
    }
    
    private void readLiteralHeaderWithIncrementalIndexingIndexedName(int param1Int) {
      insertIntoDynamicTable(-1, new Header(getName(param1Int), readByteString()));
    }
    
    private void readLiteralHeaderWithIncrementalIndexingNewName() {
      insertIntoDynamicTable(-1, new Header(Hpack.checkLowercase(readByteString()), readByteString()));
    }
    
    private void readLiteralHeaderWithoutIndexingIndexedName(int param1Int) {
      f f1 = getName(param1Int);
      f f2 = readByteString();
      this.headerList.add(new Header(f1, f2));
    }
    
    private void readLiteralHeaderWithoutIndexingNewName() {
      f f1 = Hpack.checkLowercase(readByteString());
      f f2 = readByteString();
      this.headerList.add(new Header(f1, f2));
    }
    
    public List<Header> getAndResetHeaderList() {
      ArrayList<Header> arrayList = new ArrayList<Header>(this.headerList);
      this.headerList.clear();
      return arrayList;
    }
    
    int maxDynamicTableByteCount() {
      return this.maxDynamicTableByteCount;
    }
    
    f readByteString() {
      boolean bool;
      int i = readByte();
      if ((i & 0x80) == 128) {
        bool = true;
      } else {
        bool = false;
      } 
      i = readInt(i, 127);
      return bool ? f.a(Huffman.get().decode(this.source.e(i))) : this.source.c(i);
    }
    
    void readHeaders() {
      while (!this.source.j()) {
        int i = this.source.readByte() & 0xFF;
        if (i != 128) {
          if ((i & 0x80) == 128) {
            readIndexedHeader(readInt(i, 127) - 1);
            continue;
          } 
          if (i == 64) {
            readLiteralHeaderWithIncrementalIndexingNewName();
            continue;
          } 
          if ((i & 0x40) == 64) {
            readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(i, 63) - 1);
            continue;
          } 
          if ((i & 0x20) == 32) {
            this.maxDynamicTableByteCount = readInt(i, 31);
            i = this.maxDynamicTableByteCount;
            if (i >= 0 && i <= this.headerTableSizeSetting) {
              adjustDynamicTableByteCount();
              continue;
            } 
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid dynamic table size update ");
            stringBuilder.append(this.maxDynamicTableByteCount);
            throw new IOException(stringBuilder.toString());
          } 
          if (i == 16 || i == 0) {
            readLiteralHeaderWithoutIndexingNewName();
            continue;
          } 
          readLiteralHeaderWithoutIndexingIndexedName(readInt(i, 15) - 1);
          continue;
        } 
        throw new IOException("index == 0");
      } 
    }
    
    int readInt(int param1Int1, int param1Int2) {
      param1Int1 &= param1Int2;
      if (param1Int1 < param1Int2)
        return param1Int1; 
      param1Int1 = 0;
      while (true) {
        int i = readByte();
        if ((i & 0x80) != 0) {
          param1Int2 += (i & 0x7F) << param1Int1;
          param1Int1 += 7;
          continue;
        } 
        return param1Int2 + (i << param1Int1);
      } 
    }
  }
  
  static final class Writer {
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
    
    Header[] dynamicTable = new Header[8];
    
    int dynamicTableByteCount = 0;
    
    private boolean emitDynamicTableSizeUpdate;
    
    int headerCount = 0;
    
    int headerTableSizeSetting;
    
    int maxDynamicTableByteCount;
    
    int nextHeaderIndex = this.dynamicTable.length - 1;
    
    private final c out;
    
    private int smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
    
    private final boolean useCompression;
    
    Writer(int param1Int, boolean param1Boolean, c param1c) {
      this.headerTableSizeSetting = param1Int;
      this.maxDynamicTableByteCount = param1Int;
      this.useCompression = param1Boolean;
      this.out = param1c;
    }
    
    Writer(c param1c) {
      this(4096, true, param1c);
    }
    
    private void adjustDynamicTableByteCount() {
      int i = this.maxDynamicTableByteCount;
      int j = this.dynamicTableByteCount;
      if (i < j) {
        if (i == 0) {
          clearDynamicTable();
          return;
        } 
        evictToRecoverBytes(j - i);
      } 
    }
    
    private void clearDynamicTable() {
      Arrays.fill((Object[])this.dynamicTable, (Object)null);
      this.nextHeaderIndex = this.dynamicTable.length - 1;
      this.headerCount = 0;
      this.dynamicTableByteCount = 0;
    }
    
    private int evictToRecoverBytes(int param1Int) {
      int i = 0;
      boolean bool = false;
      if (param1Int > 0) {
        i = this.dynamicTable.length - 1;
        int j = param1Int;
        param1Int = bool;
        while (i >= this.nextHeaderIndex && j > 0) {
          Header[] arrayOfHeader1 = this.dynamicTable;
          j -= (arrayOfHeader1[i]).hpackSize;
          this.dynamicTableByteCount -= (arrayOfHeader1[i]).hpackSize;
          this.headerCount--;
          param1Int++;
          i--;
        } 
        Header[] arrayOfHeader = this.dynamicTable;
        i = this.nextHeaderIndex;
        System.arraycopy(arrayOfHeader, i + 1, arrayOfHeader, i + 1 + param1Int, this.headerCount);
        arrayOfHeader = this.dynamicTable;
        i = this.nextHeaderIndex;
        Arrays.fill((Object[])arrayOfHeader, i + 1, i + 1 + param1Int, (Object)null);
        this.nextHeaderIndex += param1Int;
        i = param1Int;
      } 
      return i;
    }
    
    private void insertIntoDynamicTable(Header param1Header) {
      int i = param1Header.hpackSize;
      int j = this.maxDynamicTableByteCount;
      if (i > j) {
        clearDynamicTable();
        return;
      } 
      evictToRecoverBytes(this.dynamicTableByteCount + i - j);
      j = this.headerCount;
      Header[] arrayOfHeader = this.dynamicTable;
      if (j + 1 > arrayOfHeader.length) {
        Header[] arrayOfHeader1 = new Header[arrayOfHeader.length * 2];
        System.arraycopy(arrayOfHeader, 0, arrayOfHeader1, arrayOfHeader.length, arrayOfHeader.length);
        this.nextHeaderIndex = this.dynamicTable.length - 1;
        this.dynamicTable = arrayOfHeader1;
      } 
      j = this.nextHeaderIndex;
      this.nextHeaderIndex = j - 1;
      this.dynamicTable[j] = param1Header;
      this.headerCount++;
      this.dynamicTableByteCount += i;
    }
    
    void setHeaderTableSizeSetting(int param1Int) {
      this.headerTableSizeSetting = param1Int;
      param1Int = Math.min(param1Int, 16384);
      int i = this.maxDynamicTableByteCount;
      if (i == param1Int)
        return; 
      if (param1Int < i)
        this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, param1Int); 
      this.emitDynamicTableSizeUpdate = true;
      this.maxDynamicTableByteCount = param1Int;
      adjustDynamicTableByteCount();
    }
    
    void writeByteString(f param1f) {
      int i;
      boolean bool;
      if (this.useCompression && Huffman.get().encodedLength(param1f) < param1f.s()) {
        c c1 = new c();
        Huffman.get().encode(param1f, (d)c1);
        param1f = c1.c();
        i = param1f.s();
        bool = true;
      } else {
        i = param1f.s();
        bool = false;
      } 
      writeInt(i, 127, bool);
      this.out.a(param1f);
    }
    
    void writeHeaders(List<Header> param1List) {
      // Byte code:
      //   0: aload_0
      //   1: getfield emitDynamicTableSizeUpdate : Z
      //   4: ifeq -> 52
      //   7: aload_0
      //   8: getfield smallestHeaderTableSizeSetting : I
      //   11: istore_2
      //   12: iload_2
      //   13: aload_0
      //   14: getfield maxDynamicTableByteCount : I
      //   17: if_icmpge -> 29
      //   20: aload_0
      //   21: iload_2
      //   22: bipush #31
      //   24: bipush #32
      //   26: invokevirtual writeInt : (III)V
      //   29: aload_0
      //   30: iconst_0
      //   31: putfield emitDynamicTableSizeUpdate : Z
      //   34: aload_0
      //   35: ldc 2147483647
      //   37: putfield smallestHeaderTableSizeSetting : I
      //   40: aload_0
      //   41: aload_0
      //   42: getfield maxDynamicTableByteCount : I
      //   45: bipush #31
      //   47: bipush #32
      //   49: invokevirtual writeInt : (III)V
      //   52: aload_1
      //   53: invokeinterface size : ()I
      //   58: istore #8
      //   60: iconst_0
      //   61: istore #4
      //   63: iload #4
      //   65: iload #8
      //   67: if_icmpge -> 451
      //   70: aload_1
      //   71: iload #4
      //   73: invokeinterface get : (I)Ljava/lang/Object;
      //   78: checkcast okhttp3/internal/http2/Header
      //   81: astore #10
      //   83: aload #10
      //   85: getfield name : Lj/f;
      //   88: invokevirtual t : ()Lj/f;
      //   91: astore #11
      //   93: aload #10
      //   95: getfield value : Lj/f;
      //   98: astore #12
      //   100: getstatic okhttp3/internal/http2/Hpack.NAME_TO_FIRST_INDEX : Ljava/util/Map;
      //   103: aload #11
      //   105: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
      //   110: checkcast java/lang/Integer
      //   113: astore #13
      //   115: aload #13
      //   117: ifnull -> 194
      //   120: aload #13
      //   122: invokevirtual intValue : ()I
      //   125: iconst_1
      //   126: iadd
      //   127: istore_3
      //   128: iload_3
      //   129: iconst_1
      //   130: if_icmple -> 187
      //   133: iload_3
      //   134: bipush #8
      //   136: if_icmpge -> 187
      //   139: getstatic okhttp3/internal/http2/Hpack.STATIC_HEADER_TABLE : [Lokhttp3/internal/http2/Header;
      //   142: iload_3
      //   143: iconst_1
      //   144: isub
      //   145: aaload
      //   146: getfield value : Lj/f;
      //   149: aload #12
      //   151: invokestatic equal : (Ljava/lang/Object;Ljava/lang/Object;)Z
      //   154: ifeq -> 162
      //   157: iload_3
      //   158: istore_2
      //   159: goto -> 198
      //   162: getstatic okhttp3/internal/http2/Hpack.STATIC_HEADER_TABLE : [Lokhttp3/internal/http2/Header;
      //   165: iload_3
      //   166: aaload
      //   167: getfield value : Lj/f;
      //   170: aload #12
      //   172: invokestatic equal : (Ljava/lang/Object;Ljava/lang/Object;)Z
      //   175: ifeq -> 187
      //   178: iload_3
      //   179: istore_2
      //   180: iload_3
      //   181: iconst_1
      //   182: iadd
      //   183: istore_3
      //   184: goto -> 198
      //   187: iload_3
      //   188: istore_2
      //   189: iconst_m1
      //   190: istore_3
      //   191: goto -> 198
      //   194: iconst_m1
      //   195: istore_3
      //   196: iconst_m1
      //   197: istore_2
      //   198: iload_3
      //   199: istore #6
      //   201: iload_2
      //   202: istore #7
      //   204: iload_3
      //   205: iconst_m1
      //   206: if_icmpne -> 332
      //   209: aload_0
      //   210: getfield nextHeaderIndex : I
      //   213: iconst_1
      //   214: iadd
      //   215: istore #5
      //   217: aload_0
      //   218: getfield dynamicTable : [Lokhttp3/internal/http2/Header;
      //   221: arraylength
      //   222: istore #9
      //   224: iload_3
      //   225: istore #6
      //   227: iload_2
      //   228: istore #7
      //   230: iload #5
      //   232: iload #9
      //   234: if_icmpge -> 332
      //   237: iload_2
      //   238: istore #6
      //   240: aload_0
      //   241: getfield dynamicTable : [Lokhttp3/internal/http2/Header;
      //   244: iload #5
      //   246: aaload
      //   247: getfield name : Lj/f;
      //   250: aload #11
      //   252: invokestatic equal : (Ljava/lang/Object;Ljava/lang/Object;)Z
      //   255: ifeq -> 320
      //   258: aload_0
      //   259: getfield dynamicTable : [Lokhttp3/internal/http2/Header;
      //   262: iload #5
      //   264: aaload
      //   265: getfield value : Lj/f;
      //   268: aload #12
      //   270: invokestatic equal : (Ljava/lang/Object;Ljava/lang/Object;)Z
      //   273: ifeq -> 298
      //   276: aload_0
      //   277: getfield nextHeaderIndex : I
      //   280: istore_3
      //   281: getstatic okhttp3/internal/http2/Hpack.STATIC_HEADER_TABLE : [Lokhttp3/internal/http2/Header;
      //   284: arraylength
      //   285: iload #5
      //   287: iload_3
      //   288: isub
      //   289: iadd
      //   290: istore #6
      //   292: iload_2
      //   293: istore #7
      //   295: goto -> 332
      //   298: iload_2
      //   299: istore #6
      //   301: iload_2
      //   302: iconst_m1
      //   303: if_icmpne -> 320
      //   306: iload #5
      //   308: aload_0
      //   309: getfield nextHeaderIndex : I
      //   312: isub
      //   313: getstatic okhttp3/internal/http2/Hpack.STATIC_HEADER_TABLE : [Lokhttp3/internal/http2/Header;
      //   316: arraylength
      //   317: iadd
      //   318: istore #6
      //   320: iload #5
      //   322: iconst_1
      //   323: iadd
      //   324: istore #5
      //   326: iload #6
      //   328: istore_2
      //   329: goto -> 224
      //   332: iload #6
      //   334: iconst_m1
      //   335: if_icmpeq -> 352
      //   338: aload_0
      //   339: iload #6
      //   341: bipush #127
      //   343: sipush #128
      //   346: invokevirtual writeInt : (III)V
      //   349: goto -> 442
      //   352: iload #7
      //   354: iconst_m1
      //   355: if_icmpne -> 389
      //   358: aload_0
      //   359: getfield out : Lj/c;
      //   362: bipush #64
      //   364: invokevirtual writeByte : (I)Lj/c;
      //   367: pop
      //   368: aload_0
      //   369: aload #11
      //   371: invokevirtual writeByteString : (Lj/f;)V
      //   374: aload_0
      //   375: aload #12
      //   377: invokevirtual writeByteString : (Lj/f;)V
      //   380: aload_0
      //   381: aload #10
      //   383: invokespecial insertIntoDynamicTable : (Lokhttp3/internal/http2/Header;)V
      //   386: goto -> 442
      //   389: aload #11
      //   391: getstatic okhttp3/internal/http2/Header.PSEUDO_PREFIX : Lj/f;
      //   394: invokevirtual b : (Lj/f;)Z
      //   397: ifeq -> 429
      //   400: getstatic okhttp3/internal/http2/Header.TARGET_AUTHORITY : Lj/f;
      //   403: aload #11
      //   405: invokevirtual equals : (Ljava/lang/Object;)Z
      //   408: ifne -> 429
      //   411: aload_0
      //   412: iload #7
      //   414: bipush #15
      //   416: iconst_0
      //   417: invokevirtual writeInt : (III)V
      //   420: aload_0
      //   421: aload #12
      //   423: invokevirtual writeByteString : (Lj/f;)V
      //   426: goto -> 442
      //   429: aload_0
      //   430: iload #7
      //   432: bipush #63
      //   434: bipush #64
      //   436: invokevirtual writeInt : (III)V
      //   439: goto -> 374
      //   442: iload #4
      //   444: iconst_1
      //   445: iadd
      //   446: istore #4
      //   448: goto -> 63
      //   451: return
    }
    
    void writeInt(int param1Int1, int param1Int2, int param1Int3) {
      c c1;
      if (param1Int1 < param1Int2) {
        c1 = this.out;
        param1Int1 |= param1Int3;
      } else {
        this.out.writeByte(param1Int3 | param1Int2);
        for (param1Int1 -= param1Int2; param1Int1 >= 128; param1Int1 >>>= 7)
          this.out.writeByte(0x80 | param1Int1 & 0x7F); 
        c1 = this.out;
      } 
      c1.writeByte(param1Int1);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/http2/Hpack.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */