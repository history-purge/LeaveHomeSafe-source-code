package com.facebook.react.modules.blob;

import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.facebook.fbreact.specs.NativeBlobModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.f;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import e.e.o.d0.a.a;
import j.f;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

@a(name = "BlobModule")
public class BlobModule extends NativeBlobModuleSpec {
  public static final String NAME = "BlobModule";
  
  private final Map<String, byte[]> mBlobs = (Map)new HashMap<String, byte>();
  
  private final NetworkingModule.f mNetworkingRequestBodyHandler = new c(this);
  
  private final NetworkingModule.g mNetworkingResponseHandler = new d(this);
  
  private final NetworkingModule.h mNetworkingUriHandler = new b(this);
  
  private final WebSocketModule.b mWebSocketContentHandler = new a(this);
  
  public BlobModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  private byte[] getBytesFromUri(Uri paramUri) {
    ByteArrayOutputStream byteArrayOutputStream;
    InputStream inputStream = getReactApplicationContext().getContentResolver().openInputStream(paramUri);
    if (inputStream != null) {
      byteArrayOutputStream = new ByteArrayOutputStream();
      byte[] arrayOfByte = new byte[1024];
      while (true) {
        int i = inputStream.read(arrayOfByte);
        if (i != -1) {
          byteArrayOutputStream.write(arrayOfByte, 0, i);
          continue;
        } 
        return byteArrayOutputStream.toByteArray();
      } 
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("File not found for ");
    stringBuilder.append(byteArrayOutputStream);
    FileNotFoundException fileNotFoundException = new FileNotFoundException(stringBuilder.toString());
    throw fileNotFoundException;
  }
  
  private long getLastModifiedFromUri(Uri paramUri) {
    return "file".equals(paramUri.getScheme()) ? (new File(paramUri.toString())).lastModified() : 0L;
  }
  
  private String getMimeTypeFromUri(Uri paramUri) {
    String str3 = getReactApplicationContext().getContentResolver().getType(paramUri);
    String str2 = str3;
    if (str3 == null) {
      String str = MimeTypeMap.getFileExtensionFromUrl(paramUri.getPath());
      str2 = str3;
      if (str != null)
        str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str); 
    } 
    String str1 = str2;
    if (str2 == null)
      str1 = ""; 
    return str1;
  }
  
  private String getNameFromUri(Uri paramUri) {
    if ("file".equals(paramUri.getScheme()))
      return paramUri.getLastPathSegment(); 
    Cursor cursor = getReactApplicationContext().getContentResolver().query(paramUri, new String[] { "_display_name" }, null, null, null);
    if (cursor != null)
      try {
        if (cursor.moveToFirst())
          return cursor.getString(0); 
      } finally {
        cursor.close();
      }  
    return paramUri.getLastPathSegment();
  }
  
  private WebSocketModule getWebSocketModule(String paramString) {
    ReactApplicationContext reactApplicationContext = getReactApplicationContextIfActiveOrWarn();
    return (reactApplicationContext != null) ? (WebSocketModule)reactApplicationContext.getNativeModule(WebSocketModule.class) : null;
  }
  
  public void addNetworkingHandler() {
    ReactApplicationContext reactApplicationContext = getReactApplicationContextIfActiveOrWarn();
    if (reactApplicationContext != null) {
      NetworkingModule networkingModule = (NetworkingModule)reactApplicationContext.getNativeModule(NetworkingModule.class);
      networkingModule.addUriHandler(this.mNetworkingUriHandler);
      networkingModule.addRequestBodyHandler(this.mNetworkingRequestBodyHandler);
      networkingModule.addResponseHandler(this.mNetworkingResponseHandler);
    } 
  }
  
  public void addWebSocketHandler(double paramDouble) {
    int i = (int)paramDouble;
    WebSocketModule webSocketModule = getWebSocketModule("addWebSocketHandler");
    if (webSocketModule != null)
      webSocketModule.setContentHandler(i, this.mWebSocketContentHandler); 
  }
  
  public void createFromParts(ReadableArray paramReadableArray, String paramString) {
    ArrayList<byte[]> arrayList = new ArrayList(paramReadableArray.size());
    int i = 0;
    int j;
    for (j = 0; i < paramReadableArray.size(); j = k) {
      byte[] arrayOfByte;
      ReadableMap readableMap = paramReadableArray.getMap(i);
      String str = readableMap.getString("type");
      int k = -1;
      int m = str.hashCode();
      if (m != -891985903) {
        if (m == 3026845 && str.equals("blob"))
          k = 0; 
      } else if (str.equals("string")) {
        k = 1;
      } 
      if (k != 0) {
        if (k == 1) {
          arrayOfByte = readableMap.getString("data").getBytes(Charset.forName("UTF-8"));
          k = j + arrayOfByte.length;
          arrayList.add(i, arrayOfByte);
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Invalid type for blob: ");
          stringBuilder.append(arrayOfByte.getString("type"));
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
      } else {
        ReadableMap readableMap1 = arrayOfByte.getMap("data");
        k = j + readableMap1.getInt("size");
        arrayList.add(i, resolve(readableMap1));
      } 
      i++;
    } 
    ByteBuffer byteBuffer = ByteBuffer.allocate(j);
    Iterator<byte> iterator = arrayList.iterator();
    while (iterator.hasNext())
      byteBuffer.put((byte[])iterator.next()); 
    store(byteBuffer.array(), paramString);
  }
  
  public String getName() {
    return "BlobModule";
  }
  
  public Map<String, Object> getTypedExportedConstants() {
    Resources resources = getReactApplicationContext().getResources();
    int i = resources.getIdentifier("blob_provider_authority", "string", getReactApplicationContext().getPackageName());
    return (i == 0) ? f.c() : f.a("BLOB_URI_SCHEME", "content", "BLOB_URI_HOST", resources.getString(i));
  }
  
  public void initialize() {
    BlobCollector.a((ReactContext)getReactApplicationContext(), this);
  }
  
  public void release(String paramString) {
    remove(paramString);
  }
  
  @e.e.n.a.a
  public void remove(String paramString) {
    synchronized (this.mBlobs) {
      this.mBlobs.remove(paramString);
      return;
    } 
  }
  
  public void removeWebSocketHandler(double paramDouble) {
    int i = (int)paramDouble;
    WebSocketModule webSocketModule = getWebSocketModule("removeWebSocketHandler");
    if (webSocketModule != null)
      webSocketModule.setContentHandler(i, null); 
  }
  
  public byte[] resolve(Uri paramUri) {
    boolean bool;
    byte b1;
    String str2 = paramUri.getLastPathSegment();
    String str3 = paramUri.getQueryParameter("offset");
    if (str3 != null) {
      bool = Integer.parseInt(str3, 10);
    } else {
      bool = false;
    } 
    String str1 = paramUri.getQueryParameter("size");
    if (str1 != null) {
      b1 = Integer.parseInt(str1, 10);
    } else {
      b1 = -1;
    } 
    return resolve(str2, bool, b1);
  }
  
  public byte[] resolve(ReadableMap paramReadableMap) {
    return resolve(paramReadableMap.getString("blobId"), paramReadableMap.getInt("offset"), paramReadableMap.getInt("size"));
  }
  
  public byte[] resolve(String paramString, int paramInt1, int paramInt2) {
    synchronized (this.mBlobs) {
      byte[] arrayOfByte = this.mBlobs.get(paramString);
      if (arrayOfByte == null)
        return null; 
      int i = paramInt2;
      if (paramInt2 == -1)
        i = arrayOfByte.length - paramInt1; 
      if (paramInt1 <= 0) {
        byte[] arrayOfByte1 = arrayOfByte;
        if (i != arrayOfByte.length) {
          arrayOfByte1 = Arrays.copyOfRange(arrayOfByte, paramInt1, i + paramInt1);
          return arrayOfByte1;
        } 
        return arrayOfByte1;
      } 
      return Arrays.copyOfRange(arrayOfByte, paramInt1, i + paramInt1);
    } 
  }
  
  public void sendOverSocket(ReadableMap paramReadableMap, double paramDouble) {
    int i = (int)paramDouble;
    WebSocketModule webSocketModule = getWebSocketModule("sendOverSocket");
    if (webSocketModule != null) {
      byte[] arrayOfByte = resolve(paramReadableMap.getString("blobId"), paramReadableMap.getInt("offset"), paramReadableMap.getInt("size"));
      if (arrayOfByte != null) {
        f f1 = f.a(arrayOfByte);
      } else {
        arrayOfByte = null;
      } 
      webSocketModule.sendBinary((f)arrayOfByte, i);
    } 
  }
  
  public String store(byte[] paramArrayOfbyte) {
    String str = UUID.randomUUID().toString();
    store(paramArrayOfbyte, str);
    return str;
  }
  
  public void store(byte[] paramArrayOfbyte, String paramString) {
    synchronized (this.mBlobs) {
      this.mBlobs.put(paramString, paramArrayOfbyte);
      return;
    } 
  }
  
  class a implements WebSocketModule.b {
    a(BlobModule this$0) {}
    
    public void a(f param1f, WritableMap param1WritableMap) {
      byte[] arrayOfByte = param1f.u();
      WritableMap writableMap = Arguments.createMap();
      writableMap.putString("blobId", this.a.store(arrayOfByte));
      writableMap.putInt("offset", 0);
      writableMap.putInt("size", arrayOfByte.length);
      param1WritableMap.putMap("data", (ReadableMap)writableMap);
      param1WritableMap.putString("type", "blob");
    }
    
    public void a(String param1String, WritableMap param1WritableMap) {
      param1WritableMap.putString("data", param1String);
    }
  }
  
  class b implements NetworkingModule.h {
    b(BlobModule this$0) {}
    
    public WritableMap a(Uri param1Uri) {
      byte[] arrayOfByte = this.a.getBytesFromUri(param1Uri);
      WritableMap writableMap = Arguments.createMap();
      writableMap.putString("blobId", this.a.store(arrayOfByte));
      writableMap.putInt("offset", 0);
      writableMap.putInt("size", arrayOfByte.length);
      writableMap.putString("type", this.a.getMimeTypeFromUri(param1Uri));
      writableMap.putString("name", this.a.getNameFromUri(param1Uri));
      writableMap.putDouble("lastModified", this.a.getLastModifiedFromUri(param1Uri));
      return writableMap;
    }
    
    public boolean a(Uri param1Uri, String param1String) {
      boolean bool1;
      String str = param1Uri.getScheme();
      boolean bool = "http".equals(str);
      boolean bool2 = false;
      if (bool || "https".equals(str)) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      bool = bool2;
      if (!bool1) {
        bool = bool2;
        if ("blob".equals(param1String))
          bool = true; 
      } 
      return bool;
    }
  }
  
  class c implements NetworkingModule.f {
    c(BlobModule this$0) {}
    
    public RequestBody a(ReadableMap param1ReadableMap, String param1String) {
      String str = param1String;
      if (param1ReadableMap.hasKey("type")) {
        str = param1String;
        if (!param1ReadableMap.getString("type").isEmpty())
          str = param1ReadableMap.getString("type"); 
      } 
      param1String = str;
      if (str == null)
        param1String = "application/octet-stream"; 
      param1ReadableMap = param1ReadableMap.getMap("blob");
      str = param1ReadableMap.getString("blobId");
      byte[] arrayOfByte = this.a.resolve(str, param1ReadableMap.getInt("offset"), param1ReadableMap.getInt("size"));
      return RequestBody.create(MediaType.parse(param1String), arrayOfByte);
    }
    
    public boolean a(ReadableMap param1ReadableMap) {
      return param1ReadableMap.hasKey("blob");
    }
  }
  
  class d implements NetworkingModule.g {
    d(BlobModule this$0) {}
    
    public WritableMap a(ResponseBody param1ResponseBody) {
      byte[] arrayOfByte = param1ResponseBody.bytes();
      WritableMap writableMap = Arguments.createMap();
      writableMap.putString("blobId", this.a.store(arrayOfByte));
      writableMap.putInt("offset", 0);
      writableMap.putInt("size", arrayOfByte.length);
      return writableMap;
    }
    
    public boolean a(String param1String) {
      return "blob".equals(param1String);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/blob/BlobModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */