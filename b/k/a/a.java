package b.k.a;

import android.content.res.AssetManager;
import android.util.Log;
import android.util.Pair;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;

public class a {
  private static final d[] A;
  
  private static final d[] B;
  
  private static final d[] C;
  
  private static final d[] D;
  
  private static final d[] E;
  
  private static final d F;
  
  private static final d[] G;
  
  private static final d[] H;
  
  private static final d[] I;
  
  private static final d[] J;
  
  static final d[][] K;
  
  private static final d[] L;
  
  private static final d M;
  
  private static final d N;
  
  private static final HashMap<Integer, d>[] O;
  
  private static final HashMap<String, d>[] P;
  
  private static final HashSet<String> Q;
  
  private static final HashMap<Integer, Integer> R;
  
  static final Charset S;
  
  static final byte[] T;
  
  private static final Pattern U;
  
  public static final int[] r = new int[] { 8, 8, 8 };
  
  public static final int[] s = new int[] { 8 };
  
  static final byte[] t = new byte[] { -1, -40, -1 };
  
  private static final byte[] u = new byte[] { 79, 76, 89, 77, 80, 0 };
  
  private static final byte[] v = new byte[] { 79, 76, 89, 77, 80, 85, 83, 0, 73, 73 };
  
  private static SimpleDateFormat w;
  
  static final String[] x = new String[] { 
      "", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", 
      "SRATIONAL", "SINGLE", "DOUBLE" };
  
  static final int[] y = new int[] { 
      0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 
      8, 4, 8, 1 };
  
  static final byte[] z = new byte[] { 65, 83, 67, 73, 73, 0, 0, 0 };
  
  private final String a;
  
  private final AssetManager.AssetInputStream b;
  
  private int c;
  
  private final HashMap<String, c>[] d;
  
  private Set<Integer> e;
  
  private ByteOrder f;
  
  private boolean g;
  
  private int h;
  
  private int i;
  
  private byte[] j;
  
  private int k;
  
  private int l;
  
  private int m;
  
  private int n;
  
  private int o;
  
  private int p;
  
  private boolean q;
  
  static {
    A = new d[] { 
        new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), 
        new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), 
        new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), 
        new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), 
        new d("JpgFromRaw", 46, 7) };
    B = new d[] { 
        new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("ComponentsConfiguration", 37121, 7), 
        new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), 
        new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), 
        new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), 
        new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), 
        new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4) };
    C = new d[] { 
        new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), 
        new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), 
        new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), 
        new d("GPSDifferential", 30, 3) };
    D = new d[] { new d("InteroperabilityIndex", 1, 2) };
    E = new d[] { 
        new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), 
        new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), 
        new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), 
        new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4) };
    F = new d("StripOffsets", 273, 3);
    G = new d[] { new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4) };
    H = new d[] { new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4) };
    I = new d[] { new d("AspectFrame", 4371, 3) };
    J = new d[] { new d("ColorSpace", 55, 3) };
    d[] arrayOfD1 = A;
    K = new d[][] { arrayOfD1, B, C, D, E, arrayOfD1, G, H, I, J };
    L = new d[] { new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1) };
    M = new d("JPEGInterchangeFormat", 513, 4);
    N = new d("JPEGInterchangeFormatLength", 514, 4);
    d[][] arrayOfD = K;
    O = (HashMap<Integer, d>[])new HashMap[arrayOfD.length];
    P = (HashMap<String, d>[])new HashMap[arrayOfD.length];
    Q = new HashSet<String>(Arrays.asList(new String[] { "FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp" }));
    R = new HashMap<Integer, Integer>();
    S = Charset.forName("US-ASCII");
    T = "Exif\000\000".getBytes(S);
    w = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
    w.setTimeZone(TimeZone.getTimeZone("UTC"));
    for (int i = 0; i < K.length; i++) {
      O[i] = new HashMap<Integer, d>();
      P[i] = new HashMap<String, d>();
      for (d d1 : K[i]) {
        O[i].put(Integer.valueOf(d1.a), d1);
        P[i].put(d1.b, d1);
      } 
    } 
    R.put(Integer.valueOf((L[0]).a), integer6);
    R.put(Integer.valueOf((L[1]).a), integer1);
    R.put(Integer.valueOf((L[2]).a), integer3);
    R.put(Integer.valueOf((L[3]).a), integer2);
    R.put(Integer.valueOf((L[4]).a), integer5);
    R.put(Integer.valueOf((L[5]).a), integer4);
    Pattern.compile(".*[1-9].*");
    U = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
  }
  
  public a(InputStream paramInputStream) {
    d[][] arrayOfD = K;
    this.d = (HashMap<String, c>[])new HashMap[arrayOfD.length];
    this.e = new HashSet<Integer>(arrayOfD.length);
    this.f = ByteOrder.BIG_ENDIAN;
    if (paramInputStream != null) {
      AssetManager.AssetInputStream assetInputStream;
      arrayOfD = null;
      this.a = null;
      if (paramInputStream instanceof AssetManager.AssetInputStream)
        assetInputStream = (AssetManager.AssetInputStream)paramInputStream; 
      this.b = assetInputStream;
      a(paramInputStream);
      return;
    } 
    throw new IllegalArgumentException("inputStream cannot be null");
  }
  
  public a(String paramString) {
    d[][] arrayOfD = K;
    this.d = (HashMap<String, c>[])new HashMap[arrayOfD.length];
    this.e = new HashSet<Integer>(arrayOfD.length);
    this.f = ByteOrder.BIG_ENDIAN;
    if (paramString != null) {
      String str = null;
      this.b = null;
      this.a = paramString;
      try {
        FileInputStream fileInputStream = new FileInputStream(paramString);
      } finally {
        arrayOfD = null;
      } 
      a((Closeable)paramString);
      throw arrayOfD;
    } 
    throw new IllegalArgumentException("filename cannot be null");
  }
  
  private int a(b paramb, int paramInt) {
    char c;
    d[][] arrayOfD = K;
    int[] arrayOfInt1 = new int[arrayOfD.length];
    int[] arrayOfInt2 = new int[arrayOfD.length];
    d[] arrayOfD1 = L;
    int j = arrayOfD1.length;
    int i;
    for (i = 0; i < j; i++)
      d((arrayOfD1[i]).b); 
    d(M.b);
    d(N.b);
    for (i = 0; i < K.length; i++) {
      Object[] arrayOfObject = this.d[i].entrySet().toArray();
      int m = arrayOfObject.length;
      for (j = 0; j < m; j++) {
        Map.Entry entry = (Map.Entry)arrayOfObject[j];
        if (entry.getValue() == null)
          this.d[i].remove(entry.getKey()); 
      } 
    } 
    if (!this.d[1].isEmpty())
      this.d[0].put((L[1]).b, c.a(0L, this.f)); 
    if (!this.d[2].isEmpty())
      this.d[0].put((L[2]).b, c.a(0L, this.f)); 
    if (!this.d[3].isEmpty())
      this.d[1].put((L[3]).b, c.a(0L, this.f)); 
    if (this.g) {
      this.d[4].put(M.b, c.a(0L, this.f));
      this.d[4].put(N.b, c.a(this.i, this.f));
    } 
    for (i = 0; i < K.length; i++) {
      Iterator<Map.Entry> iterator = this.d[i].entrySet().iterator();
      j = 0;
      while (iterator.hasNext()) {
        int m = ((c)((Map.Entry)iterator.next()).getValue()).a();
        if (m > 4)
          j += m; 
      } 
      arrayOfInt2[i] = arrayOfInt2[i] + j;
    } 
    j = 0;
    for (i = 8; j < K.length; i = m) {
      int m = i;
      if (!this.d[j].isEmpty()) {
        arrayOfInt1[j] = i;
        m = i + this.d[j].size() * 12 + 2 + 4 + arrayOfInt2[j];
      } 
      j++;
    } 
    j = i;
    if (this.g) {
      this.d[4].put(M.b, c.a(i, this.f));
      this.h = paramInt + i;
      j = i + this.i;
    } 
    int k = j + 8;
    if (!this.d[1].isEmpty())
      this.d[0].put((L[1]).b, c.a(arrayOfInt1[1], this.f)); 
    if (!this.d[2].isEmpty())
      this.d[0].put((L[2]).b, c.a(arrayOfInt1[2], this.f)); 
    if (!this.d[3].isEmpty())
      this.d[1].put((L[3]).b, c.a(arrayOfInt1[3], this.f)); 
    paramb.b(k);
    paramb.write(T);
    if (this.f == ByteOrder.BIG_ENDIAN) {
      c = '䵍';
    } else {
      c = '䥉';
    } 
    paramb.a(c);
    paramb.a(this.f);
    paramb.b(42);
    paramb.a(8L);
    for (paramInt = 0; paramInt < K.length; paramInt++) {
      if (!this.d[paramInt].isEmpty()) {
        paramb.b(this.d[paramInt].size());
        i = arrayOfInt1[paramInt] + 2 + this.d[paramInt].size() * 12 + 4;
        for (Map.Entry<String, c> entry : this.d[paramInt].entrySet()) {
          int m = ((d)P[paramInt].get(entry.getKey())).a;
          c c1 = (c)entry.getValue();
          j = c1.a();
          paramb.b(m);
          paramb.b(c1.a);
          paramb.writeInt(c1.b);
          if (j > 4) {
            paramb.a(i);
            i += j;
            continue;
          } 
          paramb.write(c1.c);
          if (j < 4)
            while (j < 4) {
              paramb.writeByte(0);
              j++;
            }  
        } 
        if (paramInt == 0 && !this.d[4].isEmpty()) {
          paramb.a(arrayOfInt1[4]);
        } else {
          paramb.a(0L);
        } 
        Iterator iterator = this.d[paramInt].entrySet().iterator();
        while (iterator.hasNext()) {
          byte[] arrayOfByte = ((c)((Map.Entry)iterator.next()).getValue()).c;
          if (arrayOfByte.length > 4)
            paramb.write(arrayOfByte, 0, arrayOfByte.length); 
        } 
      } 
    } 
    if (this.g)
      paramb.write(c()); 
    paramb.a(ByteOrder.BIG_ENDIAN);
    return k;
  }
  
  private int a(BufferedInputStream paramBufferedInputStream) {
    paramBufferedInputStream.mark(5000);
    byte[] arrayOfByte = new byte[5000];
    paramBufferedInputStream.read(arrayOfByte);
    paramBufferedInputStream.reset();
    return a(arrayOfByte) ? 4 : (c(arrayOfByte) ? 9 : (b(arrayOfByte) ? 7 : (d(arrayOfByte) ? 10 : 0)));
  }
  
  private static int a(InputStream paramInputStream, OutputStream paramOutputStream) {
    byte[] arrayOfByte = new byte[8192];
    int i = 0;
    while (true) {
      int j = paramInputStream.read(arrayOfByte);
      if (j != -1) {
        i += j;
        paramOutputStream.write(arrayOfByte, 0, j);
        continue;
      } 
      return i;
    } 
  }
  
  private void a(int paramInt1, int paramInt2) {
    if (!this.d[paramInt1].isEmpty()) {
      if (this.d[paramInt2].isEmpty())
        return; 
      c c1 = this.d[paramInt1].get("ImageLength");
      c c2 = this.d[paramInt1].get("ImageWidth");
      c c3 = this.d[paramInt2].get("ImageLength");
      c c4 = this.d[paramInt2].get("ImageWidth");
      if (c1 != null) {
        if (c2 == null)
          return; 
        if (c3 != null) {
          if (c4 == null)
            return; 
          int i = c1.b(this.f);
          int j = c2.b(this.f);
          int k = c3.b(this.f);
          int m = c4.b(this.f);
          if (i < k && j < m) {
            HashMap<String, c>[] arrayOfHashMap = this.d;
            HashMap<String, c> hashMap = arrayOfHashMap[paramInt1];
            arrayOfHashMap[paramInt1] = arrayOfHashMap[paramInt2];
            arrayOfHashMap[paramInt2] = hashMap;
          } 
        } 
      } 
    } 
  }
  
  private void a(a parama) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial c : (Lb/k/a/a$a;)V
    //   5: aload_0
    //   6: getfield d : [Ljava/util/HashMap;
    //   9: iconst_1
    //   10: aaload
    //   11: ldc_w 'MakerNote'
    //   14: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   17: checkcast b/k/a/a$c
    //   20: astore_1
    //   21: aload_1
    //   22: ifnull -> 401
    //   25: new b/k/a/a$a
    //   28: dup
    //   29: aload_1
    //   30: getfield c : [B
    //   33: invokespecial <init> : ([B)V
    //   36: astore_1
    //   37: aload_1
    //   38: aload_0
    //   39: getfield f : Ljava/nio/ByteOrder;
    //   42: invokevirtual a : (Ljava/nio/ByteOrder;)V
    //   45: getstatic b/k/a/a.u : [B
    //   48: arraylength
    //   49: newarray byte
    //   51: astore #8
    //   53: aload_1
    //   54: aload #8
    //   56: invokevirtual readFully : ([B)V
    //   59: aload_1
    //   60: lconst_0
    //   61: invokevirtual a : (J)V
    //   64: getstatic b/k/a/a.v : [B
    //   67: arraylength
    //   68: newarray byte
    //   70: astore #9
    //   72: aload_1
    //   73: aload #9
    //   75: invokevirtual readFully : ([B)V
    //   78: aload #8
    //   80: getstatic b/k/a/a.u : [B
    //   83: invokestatic equals : ([B[B)Z
    //   86: ifeq -> 103
    //   89: ldc2_w 8
    //   92: lstore #6
    //   94: aload_1
    //   95: lload #6
    //   97: invokevirtual a : (J)V
    //   100: goto -> 122
    //   103: aload #9
    //   105: getstatic b/k/a/a.v : [B
    //   108: invokestatic equals : ([B[B)Z
    //   111: ifeq -> 122
    //   114: ldc2_w 12
    //   117: lstore #6
    //   119: goto -> 94
    //   122: aload_0
    //   123: aload_1
    //   124: bipush #6
    //   126: invokespecial b : (Lb/k/a/a$a;I)V
    //   129: aload_0
    //   130: getfield d : [Ljava/util/HashMap;
    //   133: bipush #7
    //   135: aaload
    //   136: ldc_w 'PreviewImageStart'
    //   139: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   142: checkcast b/k/a/a$c
    //   145: astore_1
    //   146: aload_0
    //   147: getfield d : [Ljava/util/HashMap;
    //   150: bipush #7
    //   152: aaload
    //   153: ldc_w 'PreviewImageLength'
    //   156: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   159: checkcast b/k/a/a$c
    //   162: astore #8
    //   164: aload_1
    //   165: ifnull -> 200
    //   168: aload #8
    //   170: ifnull -> 200
    //   173: aload_0
    //   174: getfield d : [Ljava/util/HashMap;
    //   177: iconst_5
    //   178: aaload
    //   179: ldc 'JPEGInterchangeFormat'
    //   181: aload_1
    //   182: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   185: pop
    //   186: aload_0
    //   187: getfield d : [Ljava/util/HashMap;
    //   190: iconst_5
    //   191: aaload
    //   192: ldc 'JPEGInterchangeFormatLength'
    //   194: aload #8
    //   196: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   199: pop
    //   200: aload_0
    //   201: getfield d : [Ljava/util/HashMap;
    //   204: bipush #8
    //   206: aaload
    //   207: ldc_w 'AspectFrame'
    //   210: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   213: checkcast b/k/a/a$c
    //   216: astore_1
    //   217: aload_1
    //   218: ifnull -> 401
    //   221: aload_1
    //   222: aload_0
    //   223: getfield f : Ljava/nio/ByteOrder;
    //   226: invokevirtual d : (Ljava/nio/ByteOrder;)Ljava/lang/Object;
    //   229: checkcast [I
    //   232: astore_1
    //   233: aload_1
    //   234: ifnull -> 361
    //   237: aload_1
    //   238: arraylength
    //   239: iconst_4
    //   240: if_icmpeq -> 246
    //   243: goto -> 361
    //   246: aload_1
    //   247: iconst_2
    //   248: iaload
    //   249: aload_1
    //   250: iconst_0
    //   251: iaload
    //   252: if_icmple -> 401
    //   255: aload_1
    //   256: iconst_3
    //   257: iaload
    //   258: aload_1
    //   259: iconst_1
    //   260: iaload
    //   261: if_icmple -> 401
    //   264: aload_1
    //   265: iconst_2
    //   266: iaload
    //   267: aload_1
    //   268: iconst_0
    //   269: iaload
    //   270: isub
    //   271: iconst_1
    //   272: iadd
    //   273: istore #5
    //   275: aload_1
    //   276: iconst_3
    //   277: iaload
    //   278: aload_1
    //   279: iconst_1
    //   280: iaload
    //   281: isub
    //   282: iconst_1
    //   283: iadd
    //   284: istore #4
    //   286: iload #5
    //   288: istore_3
    //   289: iload #4
    //   291: istore_2
    //   292: iload #5
    //   294: iload #4
    //   296: if_icmpge -> 314
    //   299: iload #5
    //   301: iload #4
    //   303: iadd
    //   304: istore_3
    //   305: iload_3
    //   306: iload #4
    //   308: isub
    //   309: istore_2
    //   310: iload_3
    //   311: iload_2
    //   312: isub
    //   313: istore_3
    //   314: iload_3
    //   315: aload_0
    //   316: getfield f : Ljava/nio/ByteOrder;
    //   319: invokestatic a : (ILjava/nio/ByteOrder;)Lb/k/a/a$c;
    //   322: astore_1
    //   323: iload_2
    //   324: aload_0
    //   325: getfield f : Ljava/nio/ByteOrder;
    //   328: invokestatic a : (ILjava/nio/ByteOrder;)Lb/k/a/a$c;
    //   331: astore #8
    //   333: aload_0
    //   334: getfield d : [Ljava/util/HashMap;
    //   337: iconst_0
    //   338: aaload
    //   339: ldc 'ImageWidth'
    //   341: aload_1
    //   342: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   345: pop
    //   346: aload_0
    //   347: getfield d : [Ljava/util/HashMap;
    //   350: iconst_0
    //   351: aaload
    //   352: ldc 'ImageLength'
    //   354: aload #8
    //   356: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   359: pop
    //   360: return
    //   361: new java/lang/StringBuilder
    //   364: dup
    //   365: invokespecial <init> : ()V
    //   368: astore #8
    //   370: aload #8
    //   372: ldc_w 'Invalid aspect frame values. frame='
    //   375: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   378: pop
    //   379: aload #8
    //   381: aload_1
    //   382: invokestatic toString : ([I)Ljava/lang/String;
    //   385: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   388: pop
    //   389: ldc_w 'ExifInterface'
    //   392: aload #8
    //   394: invokevirtual toString : ()Ljava/lang/String;
    //   397: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   400: pop
    //   401: return
  }
  
  private void a(a parama, int paramInt) {
    this.f = e(parama);
    parama.a(this.f);
    int i = parama.readUnsignedShort();
    int j = this.c;
    if (j == 7 || j == 10 || i == 42) {
      i = parama.readInt();
      if (i >= 8 && i < paramInt) {
        paramInt = i - 8;
        if (paramInt > 0) {
          if (parama.skipBytes(paramInt) == paramInt)
            return; 
          StringBuilder stringBuilder2 = new StringBuilder();
          stringBuilder2.append("Couldn't jump to first Ifd: ");
          stringBuilder2.append(paramInt);
          throw new IOException(stringBuilder2.toString());
        } 
        return;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Invalid first Ifd offset: ");
      stringBuilder1.append(i);
      throw new IOException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Invalid start code: ");
    stringBuilder.append(Integer.toHexString(i));
    throw new IOException(stringBuilder.toString());
  }
  
  private void a(a parama, int paramInt1, int paramInt2) {
    parama.a(ByteOrder.BIG_ENDIAN);
    parama.a(paramInt1);
    int i = parama.readByte();
    if (i == -1) {
      if (parama.readByte() == -40) {
        paramInt1 = paramInt1 + 1 + 1;
        while (true) {
          i = parama.readByte();
          if (i == -1) {
            byte b = parama.readByte();
            if (b != -39) {
              if (b == -38)
                continue; 
              i = parama.readUnsignedShort() - 2;
              int j = paramInt1 + 1 + 1 + 2;
              if (i >= 0) {
                if (b != -31) {
                  if (b != -2) {
                    switch (b) {
                      default:
                        switch (b) {
                          default:
                            switch (b) {
                              default:
                                switch (b) {
                                  default:
                                    paramInt1 = i;
                                    i = j;
                                    break;
                                  case -51:
                                  case -50:
                                  case -49:
                                    break;
                                } 
                                break;
                              case -55:
                              case -54:
                              case -53:
                                break;
                            } 
                            break;
                          case -59:
                          case -58:
                          case -57:
                            break;
                        } 
                      case -64:
                      case -63:
                      case -62:
                      case -61:
                        if (parama.skipBytes(1) == 1) {
                          this.d[paramInt2].put("ImageLength", c.a(parama.readUnsignedShort(), this.f));
                          this.d[paramInt2].put("ImageWidth", c.a(parama.readUnsignedShort(), this.f));
                          paramInt1 = i - 5;
                          i = j;
                          break;
                        } 
                        throw new IOException("Invalid SOFx");
                    } 
                  } else {
                    byte[] arrayOfByte = new byte[i];
                    if (parama.read(arrayOfByte) == i) {
                      i = j;
                      if (a("UserComment") == null) {
                        this.d[1].put("UserComment", c.b(new String(arrayOfByte, S)));
                        i = j;
                      } 
                    } else {
                      throw new IOException("Invalid exif");
                    } 
                    paramInt1 = 0;
                  } 
                } else if (i < 6) {
                  paramInt1 = i;
                  i = j;
                } else {
                  byte[] arrayOfByte = new byte[6];
                  if (parama.read(arrayOfByte) == 6) {
                    j += 6;
                    paramInt1 = i - 6;
                    if (!Arrays.equals(arrayOfByte, T)) {
                      i = j;
                    } else {
                      if (paramInt1 > 0) {
                        this.l = j;
                        arrayOfByte = new byte[paramInt1];
                        if (parama.read(arrayOfByte) == paramInt1) {
                          i = j + paramInt1;
                          a(arrayOfByte, paramInt2);
                        } else {
                          throw new IOException("Invalid exif");
                        } 
                      } else {
                        throw new IOException("Invalid exif");
                      } 
                      paramInt1 = 0;
                    } 
                  } else {
                    throw new IOException("Invalid exif");
                  } 
                } 
                if (paramInt1 >= 0) {
                  if (parama.skipBytes(paramInt1) == paramInt1) {
                    paramInt1 = i + paramInt1;
                    continue;
                  } 
                  throw new IOException("Invalid JPEG segment");
                } 
                throw new IOException("Invalid length");
              } 
              throw new IOException("Invalid length");
            } 
            parama.a(this.f);
            return;
          } 
          StringBuilder stringBuilder2 = new StringBuilder();
          stringBuilder2.append("Invalid marker:");
          stringBuilder2.append(Integer.toHexString(i & 0xFF));
          throw new IOException(stringBuilder2.toString());
        } 
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Invalid marker: ");
      stringBuilder1.append(Integer.toHexString(i & 0xFF));
      throw new IOException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Invalid marker: ");
    stringBuilder.append(Integer.toHexString(i & 0xFF));
    IOException iOException = new IOException(stringBuilder.toString());
    throw iOException;
  }
  
  private void a(a parama, HashMap paramHashMap) {
    // Byte code:
    //   0: aload_2
    //   1: ldc 'JPEGInterchangeFormat'
    //   3: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6: checkcast b/k/a/a$c
    //   9: astore #7
    //   11: aload_2
    //   12: ldc 'JPEGInterchangeFormatLength'
    //   14: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   17: checkcast b/k/a/a$c
    //   20: astore_2
    //   21: aload #7
    //   23: ifnull -> 178
    //   26: aload_2
    //   27: ifnull -> 178
    //   30: aload #7
    //   32: aload_0
    //   33: getfield f : Ljava/nio/ByteOrder;
    //   36: invokevirtual b : (Ljava/nio/ByteOrder;)I
    //   39: istore #4
    //   41: aload_2
    //   42: aload_0
    //   43: getfield f : Ljava/nio/ByteOrder;
    //   46: invokevirtual b : (Ljava/nio/ByteOrder;)I
    //   49: aload_1
    //   50: invokevirtual available : ()I
    //   53: iload #4
    //   55: isub
    //   56: invokestatic min : (II)I
    //   59: istore #5
    //   61: aload_0
    //   62: getfield c : I
    //   65: istore #6
    //   67: iload #6
    //   69: iconst_4
    //   70: if_icmpeq -> 108
    //   73: iload #6
    //   75: bipush #9
    //   77: if_icmpeq -> 108
    //   80: iload #6
    //   82: bipush #10
    //   84: if_icmpne -> 90
    //   87: goto -> 108
    //   90: iload #4
    //   92: istore_3
    //   93: iload #6
    //   95: bipush #7
    //   97: if_icmpne -> 118
    //   100: aload_0
    //   101: getfield m : I
    //   104: istore_3
    //   105: goto -> 113
    //   108: aload_0
    //   109: getfield l : I
    //   112: istore_3
    //   113: iload #4
    //   115: iload_3
    //   116: iadd
    //   117: istore_3
    //   118: iload_3
    //   119: ifle -> 178
    //   122: iload #5
    //   124: ifle -> 178
    //   127: aload_0
    //   128: iconst_1
    //   129: putfield g : Z
    //   132: aload_0
    //   133: iload_3
    //   134: putfield h : I
    //   137: aload_0
    //   138: iload #5
    //   140: putfield i : I
    //   143: aload_0
    //   144: getfield a : Ljava/lang/String;
    //   147: ifnonnull -> 178
    //   150: aload_0
    //   151: getfield b : Landroid/content/res/AssetManager$AssetInputStream;
    //   154: ifnonnull -> 178
    //   157: iload #5
    //   159: newarray byte
    //   161: astore_2
    //   162: aload_1
    //   163: iload_3
    //   164: i2l
    //   165: invokevirtual a : (J)V
    //   168: aload_1
    //   169: aload_2
    //   170: invokevirtual readFully : ([B)V
    //   173: aload_0
    //   174: aload_2
    //   175: putfield j : [B
    //   178: return
  }
  
  private static void a(Closeable paramCloseable) {
    if (paramCloseable != null)
      try {
        paramCloseable.close();
        return;
      } catch (RuntimeException runtimeException) {
        throw runtimeException;
      } catch (Exception exception) {
        return;
      }  
  }
  
  private void a(InputStream paramInputStream) {
    int i = 0;
    try {
      while (i < K.length) {
        this.d[i] = new HashMap<String, c>();
        i++;
      } 
      paramInputStream = new BufferedInputStream(paramInputStream, 5000);
      this.c = a((BufferedInputStream)paramInputStream);
      paramInputStream = new a(paramInputStream);
      switch (this.c) {
        case 10:
          d((a)paramInputStream);
          break;
        case 9:
          b((a)paramInputStream);
          break;
        case 7:
          a((a)paramInputStream);
          break;
        case 4:
          a((a)paramInputStream, 0, 0);
          break;
        case 0:
        case 1:
        case 2:
        case 3:
        case 5:
        case 6:
        case 8:
        case 11:
          c((a)paramInputStream);
          break;
      } 
      f((a)paramInputStream);
    } catch (IOException iOException) {
    
    } finally {
      e();
    } 
    e();
  }
  
  private void a(byte[] paramArrayOfbyte, int paramInt) {
    a a1 = new a(paramArrayOfbyte);
    a(a1, paramArrayOfbyte.length);
    b(a1, paramInt);
  }
  
  private boolean a(HashMap paramHashMap) {
    c c = (c)paramHashMap.get("BitsPerSample");
    if (c != null) {
      int[] arrayOfInt = (int[])c.d(this.f);
      if (Arrays.equals(r, arrayOfInt))
        return true; 
      if (this.c == 3) {
        c c1 = (c)paramHashMap.get("PhotometricInterpretation");
        if (c1 != null) {
          int i = c1.b(this.f);
          if ((i == 1 && Arrays.equals(arrayOfInt, s)) || (i == 6 && Arrays.equals(arrayOfInt, r)))
            return true; 
        } 
      } 
    } 
    return false;
  }
  
  private static boolean a(byte[] paramArrayOfbyte) {
    int i = 0;
    while (true) {
      byte[] arrayOfByte = t;
      if (i < arrayOfByte.length) {
        if (paramArrayOfbyte[i] != arrayOfByte[i])
          return false; 
        i++;
        continue;
      } 
      return true;
    } 
  }
  
  private static long[] a(Object paramObject) {
    if (paramObject instanceof int[]) {
      paramObject = paramObject;
      long[] arrayOfLong = new long[paramObject.length];
      for (int i = 0; i < paramObject.length; i++)
        arrayOfLong[i] = paramObject[i]; 
      return arrayOfLong;
    } 
    return (paramObject instanceof long[]) ? (long[])paramObject : null;
  }
  
  private static double b(String paramString1, String paramString2) {
    try {
      String[] arrayOfString1 = paramString1.split(",", -1);
      String[] arrayOfString2 = arrayOfString1[0].split("/", -1);
      double d1 = Double.parseDouble(arrayOfString2[0].trim()) / Double.parseDouble(arrayOfString2[1].trim());
      arrayOfString2 = arrayOfString1[1].split("/", -1);
      double d2 = Double.parseDouble(arrayOfString2[0].trim()) / Double.parseDouble(arrayOfString2[1].trim());
      arrayOfString1 = arrayOfString1[2].split("/", -1);
      double d3 = Double.parseDouble(arrayOfString1[0].trim()) / Double.parseDouble(arrayOfString1[1].trim());
      d1 = d1 + d2 / 60.0D + d3 / 3600.0D;
      if (paramString2.equals("S") || paramString2.equals("W"))
        return -d1; 
      if (!paramString2.equals("N")) {
        if (paramString2.equals("E"))
          return d1; 
        throw new IllegalArgumentException();
      } 
      return d1;
    } catch (NumberFormatException|ArrayIndexOutOfBoundsException numberFormatException) {
      throw new IllegalArgumentException();
    } 
  }
  
  private c b(String paramString) {
    String str = paramString;
    if ("ISOSpeedRatings".equals(paramString))
      str = "PhotographicSensitivity"; 
    for (int i = 0; i < K.length; i++) {
      c c = this.d[i].get(str);
      if (c != null)
        return c; 
    } 
    return null;
  }
  
  private void b(a parama) {
    parama.skipBytes(84);
    byte[] arrayOfByte1 = new byte[4];
    byte[] arrayOfByte2 = new byte[4];
    parama.read(arrayOfByte1);
    parama.skipBytes(4);
    parama.read(arrayOfByte2);
    int i = ByteBuffer.wrap(arrayOfByte1).getInt();
    int j = ByteBuffer.wrap(arrayOfByte2).getInt();
    a(parama, i, 5);
    parama.a(j);
    parama.a(ByteOrder.BIG_ENDIAN);
    j = parama.readInt();
    for (i = 0; i < j; i++) {
      c c;
      int k = parama.readUnsignedShort();
      int m = parama.readUnsignedShort();
      if (k == F.a) {
        i = parama.readShort();
        j = parama.readShort();
        c = c.a(i, this.f);
        c c1 = c.a(j, this.f);
        this.d[0].put("ImageLength", c);
        this.d[0].put("ImageWidth", c1);
        return;
      } 
      c.skipBytes(m);
    } 
  }
  
  private void b(a parama, int paramInt) {
    this.e.add(Integer.valueOf(parama.f));
    if (parama.f + 2 > parama.e)
      return; 
    short s = parama.readShort();
    if (parama.f + s * 12 <= parama.e) {
      if (s <= 0)
        return; 
      for (short s1 = 0;; s1 = (short)(s1 + 1)) {
        int i = paramInt;
        if (s1 < s) {
          String str;
          int m = parama.readUnsignedShort();
          int k = parama.readUnsignedShort();
          int n = parama.readInt();
          long l2 = parama.a() + 4L;
          d d1 = O[i].get(Integer.valueOf(m));
          if (d1 == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Skip the tag entry since tag number is not defined: ");
            stringBuilder.append(m);
            str = stringBuilder.toString();
          } else {
            StringBuilder stringBuilder;
            if (k <= 0 || k >= y.length) {
              stringBuilder = new StringBuilder();
              stringBuilder.append("Skip the tag entry since data format is invalid: ");
              stringBuilder.append(k);
            } else if (!d1.a(k)) {
              stringBuilder = new StringBuilder();
              stringBuilder.append("Skip the tag entry since data format (");
              stringBuilder.append(x[k]);
              stringBuilder.append(") is unexpected for tag: ");
              stringBuilder.append(d1.b);
            } else {
              int i1 = k;
              if (k == 7)
                i1 = d1.c; 
              long l = n * y[i1];
              if (l < 0L || l > 2147483647L) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Skip the tag entry since the number of components is invalid: ");
                stringBuilder.append(n);
                Log.w("ExifInterface", stringBuilder.toString());
              } else {
                k = 1;
              } 
              k = 0;
            } 
            str = stringBuilder.toString();
          } 
          Log.w("ExifInterface", str);
          long l1 = 0L;
          int j = k;
        } else {
          StringBuilder stringBuilder;
          if (parama.a() + 4 <= parama.e) {
            paramInt = parama.readInt();
            long l = paramInt;
            if (l > 0L && paramInt < parama.e) {
              if (!this.e.contains(Integer.valueOf(paramInt))) {
                parama.a(l);
                HashMap<String, c>[] arrayOfHashMap = this.d;
                paramInt = 4;
                if (!arrayOfHashMap[4].isEmpty()) {
                  arrayOfHashMap = this.d;
                  paramInt = 5;
                  if (arrayOfHashMap[5].isEmpty())
                    b(parama, paramInt); 
                  break;
                } 
              } else {
                stringBuilder = new StringBuilder();
                String str = "Stop reading file since re-reading an IFD may cause an infinite loop: ";
                stringBuilder.append(str);
                stringBuilder.append(paramInt);
                Log.w("ExifInterface", stringBuilder.toString());
              } 
            } else {
              stringBuilder = new StringBuilder();
              String str = "Stop reading file since a wrong offset may cause an infinite loop: ";
              stringBuilder.append(str);
              stringBuilder.append(paramInt);
              Log.w("ExifInterface", stringBuilder.toString());
            } 
          } else {
            break;
          } 
          b((a)stringBuilder, paramInt);
        } 
        boolean bool = false;
      } 
    } 
  }
  
  private void b(a parama, HashMap paramHashMap) {
    c c1 = (c)paramHashMap.get("StripOffsets");
    c c2 = (c)paramHashMap.get("StripByteCounts");
    if (c1 != null && c2 != null) {
      String str;
      long[] arrayOfLong1 = a(c1.d(this.f));
      long[] arrayOfLong2 = a(c2.d(this.f));
      if (arrayOfLong1 == null) {
        str = "stripOffsets should not be null.";
      } else if (arrayOfLong2 == null) {
        str = "stripByteCounts should not be null.";
      } else {
        int j = arrayOfLong2.length;
        long l = 0L;
        int i;
        for (i = 0; i < j; i++)
          l += arrayOfLong2[i]; 
        byte[] arrayOfByte = new byte[(int)l];
        j = 0;
        int k = 0;
        i = 0;
        while (j < arrayOfLong1.length) {
          int n = (int)arrayOfLong1[j];
          int m = (int)arrayOfLong2[j];
          n -= k;
          if (n < 0)
            Log.d("ExifInterface", "Invalid strip offset value"); 
          str.a(n);
          byte[] arrayOfByte1 = new byte[m];
          str.read(arrayOfByte1);
          k = k + n + m;
          System.arraycopy(arrayOfByte1, 0, arrayOfByte, i, arrayOfByte1.length);
          i += arrayOfByte1.length;
          j++;
        } 
        this.g = true;
        this.j = arrayOfByte;
        this.i = arrayOfByte.length;
        return;
      } 
      Log.w("ExifInterface", str);
      return;
    } 
  }
  
  private void b(InputStream paramInputStream) {
    a(0, 5);
    a(0, 4);
    a(5, 4);
    c c1 = this.d[1].get("PixelXDimension");
    c c2 = this.d[1].get("PixelYDimension");
    if (c1 != null && c2 != null) {
      this.d[0].put("ImageWidth", c1);
      this.d[0].put("ImageLength", c2);
    } 
    if (this.d[4].isEmpty() && b(this.d[5])) {
      HashMap<String, c>[] arrayOfHashMap = this.d;
      arrayOfHashMap[4] = arrayOfHashMap[5];
      arrayOfHashMap[5] = new HashMap<String, c>();
    } 
    if (!b(this.d[4]))
      Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image."); 
  }
  
  private void b(InputStream paramInputStream, OutputStream paramOutputStream) {
    paramInputStream = new DataInputStream(paramInputStream);
    paramOutputStream = new b(paramOutputStream, ByteOrder.BIG_ENDIAN);
    if (paramInputStream.readByte() == -1) {
      paramOutputStream.writeByte(-1);
      if (paramInputStream.readByte() == -40) {
        paramOutputStream.writeByte(-40);
        paramOutputStream.writeByte(-1);
        paramOutputStream.writeByte(-31);
        a((b)paramOutputStream, 6);
        byte[] arrayOfByte = new byte[4096];
        while (paramInputStream.readByte() == -1) {
          int i = paramInputStream.readByte();
          if (i != -39 && i != -38) {
            if (i != -31) {
              paramOutputStream.writeByte(-1);
              paramOutputStream.writeByte(i);
              int k = paramInputStream.readUnsignedShort();
              paramOutputStream.b(k);
              k -= 2;
              if (k >= 0) {
                while (k > 0) {
                  int m = paramInputStream.read(arrayOfByte, 0, Math.min(k, arrayOfByte.length));
                  if (m >= 0) {
                    paramOutputStream.write(arrayOfByte, 0, m);
                    k -= m;
                  } 
                } 
                continue;
              } 
              throw new IOException("Invalid length");
            } 
            int j = paramInputStream.readUnsignedShort() - 2;
            if (j >= 0) {
              byte[] arrayOfByte1 = new byte[6];
              if (j >= 6)
                if (paramInputStream.read(arrayOfByte1) == 6) {
                  if (Arrays.equals(arrayOfByte1, T)) {
                    i = j - 6;
                    if (paramInputStream.skipBytes(i) == i)
                      continue; 
                    throw new IOException("Invalid length");
                  } 
                } else {
                  throw new IOException("Invalid exif");
                }  
              paramOutputStream.writeByte(-1);
              paramOutputStream.writeByte(i);
              paramOutputStream.b(j + 2);
              i = j;
              if (j >= 6) {
                i = j - 6;
                paramOutputStream.write(arrayOfByte1);
              } 
              while (i > 0) {
                j = paramInputStream.read(arrayOfByte, 0, Math.min(i, arrayOfByte.length));
                if (j >= 0) {
                  paramOutputStream.write(arrayOfByte, 0, j);
                  i -= j;
                } 
              } 
              continue;
            } 
            throw new IOException("Invalid length");
          } 
          paramOutputStream.writeByte(-1);
          paramOutputStream.writeByte(i);
          a(paramInputStream, paramOutputStream);
          return;
        } 
        throw new IOException("Invalid marker");
      } 
      throw new IOException("Invalid marker");
    } 
    IOException iOException = new IOException("Invalid marker");
    throw iOException;
  }
  
  private boolean b(HashMap paramHashMap) {
    c c2 = (c)paramHashMap.get("ImageLength");
    c c1 = (c)paramHashMap.get("ImageWidth");
    if (c2 != null && c1 != null) {
      int i = c2.b(this.f);
      int j = c1.b(this.f);
      if (i <= 512 && j <= 512)
        return true; 
    } 
    return false;
  }
  
  private boolean b(byte[] paramArrayOfbyte) {
    a a1 = new a(paramArrayOfbyte);
    this.f = e(a1);
    a1.a(this.f);
    short s = a1.readShort();
    a1.close();
    return (s == 20306 || s == 21330);
  }
  
  private static Pair<Integer, Integer> c(String paramString) {
    Pair<Integer, Integer> pair;
    long l1;
    long l2;
    boolean bool = paramString.contains(",");
    int i = 1;
    Integer integer1 = Integer.valueOf(2);
    Integer integer2 = Integer.valueOf(-1);
    if (bool) {
      String[] arrayOfString = paramString.split(",", -1);
      Pair<Integer, Integer> pair1 = c(arrayOfString[0]);
      pair = pair1;
      if (((Integer)pair1.first).intValue() == 2)
        return pair1; 
      while (i < arrayOfString.length) {
        byte b1;
        byte b2;
        pair1 = c(arrayOfString[i]);
        if (((Integer)pair1.first).equals(pair.first) || ((Integer)pair1.second).equals(pair.first)) {
          b1 = ((Integer)pair.first).intValue();
        } else {
          b1 = -1;
        } 
        if (((Integer)pair.second).intValue() != -1 && (((Integer)pair1.first).equals(pair.second) || ((Integer)pair1.second).equals(pair.second))) {
          b2 = ((Integer)pair.second).intValue();
        } else {
          b2 = -1;
        } 
        if (b1 == -1 && b2 == -1)
          return new Pair(integer1, integer2); 
        if (b1 == -1) {
          pair = new Pair(Integer.valueOf(b2), integer2);
        } else if (b2 == -1) {
          pair = new Pair(Integer.valueOf(b1), integer2);
        } 
        i++;
      } 
      return pair;
    } 
    if (pair.contains("/")) {
      String[] arrayOfString = pair.split("/", -1);
      if (arrayOfString.length == 2) {
        try {
          l1 = (long)Double.parseDouble(arrayOfString[0]);
          l2 = (long)Double.parseDouble(arrayOfString[1]);
          if (l1 < 0L || l2 < 0L)
            return new Pair(Integer.valueOf(10), integer2); 
        } catch (NumberFormatException numberFormatException) {
          return new Pair(integer1, integer2);
        } 
      } else {
        return new Pair(integer1, integer2);
      } 
    } else {
      try {
        Long long_ = Long.valueOf(Long.parseLong((String)numberFormatException));
        return (long_.longValue() >= 0L && long_.longValue() <= 65535L) ? new Pair(Integer.valueOf(3), Integer.valueOf(4)) : ((long_.longValue() < 0L) ? new Pair(Integer.valueOf(9), integer2) : new Pair(Integer.valueOf(4), integer2));
      } catch (NumberFormatException numberFormatException1) {
        try {
          Double.parseDouble((String)numberFormatException);
          return new Pair(Integer.valueOf(12), integer2);
        } catch (NumberFormatException numberFormatException2) {
          return new Pair(integer1, integer2);
        } 
      } 
    } 
    return (l1 > 2147483647L || l2 > 2147483647L) ? new Pair(Integer.valueOf(5), integer2) : new Pair(Integer.valueOf(10), Integer.valueOf(5));
  }
  
  private String c(double paramDouble) {
    long l1 = (long)paramDouble;
    double d1 = l1;
    Double.isNaN(d1);
    paramDouble -= d1;
    long l2 = (long)(paramDouble * 60.0D);
    d1 = l2;
    Double.isNaN(d1);
    long l3 = Math.round((paramDouble - d1 / 60.0D) * 3600.0D * 1.0E7D);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(l1);
    stringBuilder.append("/1,");
    stringBuilder.append(l2);
    stringBuilder.append("/1,");
    stringBuilder.append(l3);
    stringBuilder.append("/10000000");
    return stringBuilder.toString();
  }
  
  private void c(a parama) {
    a(parama, parama.available());
    b(parama, 0);
    d(parama, 0);
    d(parama, 5);
    d(parama, 4);
    b(parama);
    if (this.c == 8) {
      c c = this.d[1].get("MakerNote");
      if (c != null) {
        a a1 = new a(c.c);
        a1.a(this.f);
        a1.a(6L);
        b(a1, 9);
        c c1 = this.d[9].get("ColorSpace");
        if (c1 != null)
          this.d[1].put("ColorSpace", c1); 
      } 
    } 
  }
  
  private void c(a parama, int paramInt) {
    c c1 = this.d[paramInt].get("ImageLength");
    c c2 = this.d[paramInt].get("ImageWidth");
    if (c1 == null || c2 == null) {
      c1 = this.d[paramInt].get("JPEGInterchangeFormat");
      if (c1 != null)
        a(parama, c1.b(this.f), paramInt); 
    } 
  }
  
  private boolean c(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
    for (int i = 0; i < arrayOfByte.length; i++) {
      if (paramArrayOfbyte[i] != arrayOfByte[i])
        return false; 
    } 
    return true;
  }
  
  private void d(a parama) {
    c(parama);
    if ((c)this.d[0].get("JpgFromRaw") != null)
      a(parama, this.p, 5); 
    c c1 = this.d[0].get("ISO");
    c c2 = this.d[1].get("PhotographicSensitivity");
    if (c1 != null && c2 == null)
      this.d[1].put("PhotographicSensitivity", c1); 
  }
  
  private void d(a parama, int paramInt) {
    c c1;
    int[] arrayOfInt;
    c c2 = this.d[paramInt].get("DefaultCropSize");
    c c3 = this.d[paramInt].get("SensorTopBorder");
    c c4 = this.d[paramInt].get("SensorLeftBorder");
    c c5 = this.d[paramInt].get("SensorBottomBorder");
    c c6 = this.d[paramInt].get("SensorRightBorder");
    if (c2 != null) {
      if (c2.a == 5) {
        e[] arrayOfE = (e[])c2.d(this.f);
        if (arrayOfE == null || arrayOfE.length != 2) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Invalid crop size values. cropSize=");
          String str = Arrays.toString((Object[])arrayOfE);
        } else {
          c1 = c.a(arrayOfE[0], this.f);
          c2 = c.a(arrayOfE[1], this.f);
          this.d[paramInt].put("ImageWidth", c1);
          this.d[paramInt].put("ImageLength", c2);
        } 
      } else {
        arrayOfInt = (int[])c2.d(this.f);
        if (arrayOfInt == null || arrayOfInt.length != 2) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Invalid crop size values. cropSize=");
          String str = Arrays.toString(arrayOfInt);
        } else {
          c1 = c.a(arrayOfInt[0], this.f);
          c2 = c.a(arrayOfInt[1], this.f);
          this.d[paramInt].put("ImageWidth", c1);
          this.d[paramInt].put("ImageLength", c2);
        } 
      } 
      c2.append((String)c1);
      Log.w("ExifInterface", c2.toString());
      return;
    } 
    if (arrayOfInt != null && c4 != null && c5 != null && c6 != null) {
      int i = arrayOfInt.b(this.f);
      int j = c5.b(this.f);
      int k = c6.b(this.f);
      int m = c4.b(this.f);
      if (j > i && k > m) {
        c1 = c.a(j - i, this.f);
        c2 = c.a(k - m, this.f);
        this.d[paramInt].put("ImageLength", c1);
        this.d[paramInt].put("ImageWidth", c2);
        return;
      } 
    } else {
      c((a)c1, paramInt);
    } 
  }
  
  private void d(String paramString) {
    for (int i = 0; i < K.length; i++)
      this.d[i].remove(paramString); 
  }
  
  private boolean d(byte[] paramArrayOfbyte) {
    a a1 = new a(paramArrayOfbyte);
    this.f = e(a1);
    a1.a(this.f);
    short s = a1.readShort();
    a1.close();
    return (s == 85);
  }
  
  private ByteOrder e(a parama) {
    short s = parama.readShort();
    if (s != 18761) {
      if (s == 19789)
        return ByteOrder.BIG_ENDIAN; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid byte order: ");
      stringBuilder.append(Integer.toHexString(s));
      throw new IOException(stringBuilder.toString());
    } 
    return ByteOrder.LITTLE_ENDIAN;
  }
  
  private void e() {
    String str = a("DateTimeOriginal");
    if (str != null && a("DateTime") == null)
      this.d[0].put("DateTime", c.b(str)); 
    if (a("ImageWidth") == null)
      this.d[0].put("ImageWidth", c.a(0L, this.f)); 
    if (a("ImageLength") == null)
      this.d[0].put("ImageLength", c.a(0L, this.f)); 
    if (a("Orientation") == null)
      this.d[0].put("Orientation", c.a(0L, this.f)); 
    if (a("LightSource") == null)
      this.d[1].put("LightSource", c.a(0L, this.f)); 
  }
  
  private void f(a parama) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : [Ljava/util/HashMap;
    //   4: iconst_4
    //   5: aaload
    //   6: astore_3
    //   7: aload_3
    //   8: ldc 'Compression'
    //   10: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   13: checkcast b/k/a/a$c
    //   16: astore #4
    //   18: aload #4
    //   20: ifnull -> 74
    //   23: aload_0
    //   24: aload #4
    //   26: aload_0
    //   27: getfield f : Ljava/nio/ByteOrder;
    //   30: invokevirtual b : (Ljava/nio/ByteOrder;)I
    //   33: putfield k : I
    //   36: aload_0
    //   37: getfield k : I
    //   40: istore_2
    //   41: iload_2
    //   42: iconst_1
    //   43: if_icmpeq -> 59
    //   46: iload_2
    //   47: bipush #6
    //   49: if_icmpeq -> 80
    //   52: iload_2
    //   53: bipush #7
    //   55: if_icmpeq -> 59
    //   58: return
    //   59: aload_0
    //   60: aload_3
    //   61: invokespecial a : (Ljava/util/HashMap;)Z
    //   64: ifeq -> 86
    //   67: aload_0
    //   68: aload_1
    //   69: aload_3
    //   70: invokespecial b : (Lb/k/a/a$a;Ljava/util/HashMap;)V
    //   73: return
    //   74: aload_0
    //   75: bipush #6
    //   77: putfield k : I
    //   80: aload_0
    //   81: aload_1
    //   82: aload_3
    //   83: invokespecial a : (Lb/k/a/a$a;Ljava/util/HashMap;)V
    //   86: return
  }
  
  public double a(double paramDouble) {
    double d1 = a("GPSAltitude", -1.0D);
    int i = a("GPSAltitudeRef", -1);
    if (d1 >= 0.0D && i >= 0) {
      byte b = 1;
      if (i == 1)
        b = -1; 
      paramDouble = b;
      Double.isNaN(paramDouble);
      return d1 * paramDouble;
    } 
    return paramDouble;
  }
  
  public double a(String paramString, double paramDouble) {
    c c = b(paramString);
    if (c == null)
      return paramDouble; 
    try {
      return c.a(this.f);
    } catch (NumberFormatException numberFormatException) {
      return paramDouble;
    } 
  }
  
  public int a(String paramString, int paramInt) {
    c c = b(paramString);
    if (c == null)
      return paramInt; 
    try {
      return c.b(this.f);
    } catch (NumberFormatException numberFormatException) {
      return paramInt;
    } 
  }
  
  public String a(String paramString) {
    c c = b(paramString);
    if (c != null) {
      StringBuilder stringBuilder;
      if (!Q.contains(paramString))
        return c.c(this.f); 
      if (paramString.equals("GPSTimeStamp")) {
        String str;
        int i = c.a;
        if (i != 5 && i != 10) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("GPS Timestamp format is not rational. format=");
          stringBuilder1.append(c.a);
          str = stringBuilder1.toString();
          Log.w("ExifInterface", str);
          return null;
        } 
        e[] arrayOfE = (e[])c.d(this.f);
        if (arrayOfE == null || arrayOfE.length != 3) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Invalid GPS Timestamp array. array=");
          stringBuilder.append(Arrays.toString((Object[])arrayOfE));
          str = stringBuilder.toString();
          Log.w("ExifInterface", str);
          return null;
        } 
        return String.format("%02d:%02d:%02d", new Object[] { Integer.valueOf((int)((float)((e)str[0]).a / (float)((e)str[0]).b)), Integer.valueOf((int)((float)((e)str[1]).a / (float)((e)str[1]).b)), Integer.valueOf((int)((float)((e)str[2]).a / (float)((e)str[2]).b)) });
      } 
      try {
        return Double.toString(stringBuilder.a(this.f));
      } catch (NumberFormatException numberFormatException) {
        return null;
      } 
    } 
    return null;
  }
  
  public void a(double paramDouble1, double paramDouble2) {
    if (paramDouble1 >= -90.0D && paramDouble1 <= 90.0D && !Double.isNaN(paramDouble1)) {
      if (paramDouble2 >= -180.0D && paramDouble2 <= 180.0D && !Double.isNaN(paramDouble2)) {
        String str;
        if (paramDouble1 >= 0.0D) {
          str = "N";
        } else {
          str = "S";
        } 
        a("GPSLatitudeRef", str);
        a("GPSLatitude", c(Math.abs(paramDouble1)));
        if (paramDouble2 >= 0.0D) {
          str = "E";
        } else {
          str = "W";
        } 
        a("GPSLongitudeRef", str);
        a("GPSLongitude", c(Math.abs(paramDouble2)));
        return;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Longitude value ");
      stringBuilder1.append(paramDouble2);
      stringBuilder1.append(" is not valid.");
      throw new IllegalArgumentException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Latitude value ");
    stringBuilder.append(paramDouble1);
    stringBuilder.append(" is not valid.");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public void a(String paramString1, String paramString2) {
    // Byte code:
    //   0: aload_2
    //   1: astore #5
    //   3: ldc_w 'ISOSpeedRatings'
    //   6: aload_1
    //   7: invokevirtual equals : (Ljava/lang/Object;)Z
    //   10: ifeq -> 21
    //   13: ldc_w 'PhotographicSensitivity'
    //   16: astore #7
    //   18: goto -> 24
    //   21: aload_1
    //   22: astore #7
    //   24: ldc_w 'ExifInterface'
    //   27: astore_1
    //   28: aload #5
    //   30: astore #6
    //   32: aload #5
    //   34: ifnull -> 247
    //   37: aload #5
    //   39: astore #6
    //   41: getstatic b/k/a/a.Q : Ljava/util/HashSet;
    //   44: aload #7
    //   46: invokevirtual contains : (Ljava/lang/Object;)Z
    //   49: ifeq -> 247
    //   52: aload #7
    //   54: ldc_w 'GPSTimeStamp'
    //   57: invokevirtual equals : (Ljava/lang/Object;)Z
    //   60: ifeq -> 217
    //   63: getstatic b/k/a/a.U : Ljava/util/regex/Pattern;
    //   66: aload #5
    //   68: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   71: astore_2
    //   72: aload_2
    //   73: invokevirtual find : ()Z
    //   76: ifne -> 129
    //   79: new java/lang/StringBuilder
    //   82: dup
    //   83: invokespecial <init> : ()V
    //   86: astore_1
    //   87: aload_1
    //   88: ldc_w 'Invalid value for '
    //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: pop
    //   95: aload_1
    //   96: aload #7
    //   98: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: pop
    //   102: aload_1
    //   103: ldc_w ' : '
    //   106: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: pop
    //   110: aload_1
    //   111: aload #5
    //   113: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: pop
    //   117: ldc_w 'ExifInterface'
    //   120: aload_1
    //   121: invokevirtual toString : ()Ljava/lang/String;
    //   124: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   127: pop
    //   128: return
    //   129: new java/lang/StringBuilder
    //   132: dup
    //   133: invokespecial <init> : ()V
    //   136: astore #5
    //   138: aload #5
    //   140: aload_2
    //   141: iconst_1
    //   142: invokevirtual group : (I)Ljava/lang/String;
    //   145: invokestatic parseInt : (Ljava/lang/String;)I
    //   148: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   151: pop
    //   152: aload #5
    //   154: ldc_w '/1,'
    //   157: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: pop
    //   161: aload #5
    //   163: aload_2
    //   164: iconst_2
    //   165: invokevirtual group : (I)Ljava/lang/String;
    //   168: invokestatic parseInt : (Ljava/lang/String;)I
    //   171: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   174: pop
    //   175: aload #5
    //   177: ldc_w '/1,'
    //   180: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: pop
    //   184: aload #5
    //   186: aload_2
    //   187: iconst_3
    //   188: invokevirtual group : (I)Ljava/lang/String;
    //   191: invokestatic parseInt : (Ljava/lang/String;)I
    //   194: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   197: pop
    //   198: aload #5
    //   200: ldc_w '/1'
    //   203: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: pop
    //   207: aload #5
    //   209: invokevirtual toString : ()Ljava/lang/String;
    //   212: astore #6
    //   214: goto -> 247
    //   217: new b/k/a/a$e
    //   220: dup
    //   221: aload_2
    //   222: invokestatic parseDouble : (Ljava/lang/String;)D
    //   225: invokespecial <init> : (D)V
    //   228: invokevirtual toString : ()Ljava/lang/String;
    //   231: astore #6
    //   233: goto -> 247
    //   236: new java/lang/StringBuilder
    //   239: dup
    //   240: invokespecial <init> : ()V
    //   243: astore_1
    //   244: goto -> 87
    //   247: iconst_0
    //   248: istore_3
    //   249: iload_3
    //   250: getstatic b/k/a/a.K : [[Lb/k/a/a$d;
    //   253: arraylength
    //   254: if_icmpge -> 1345
    //   257: iload_3
    //   258: iconst_4
    //   259: if_icmpne -> 274
    //   262: aload_0
    //   263: getfield g : Z
    //   266: ifne -> 274
    //   269: aload_1
    //   270: astore_2
    //   271: goto -> 1336
    //   274: getstatic b/k/a/a.P : [Ljava/util/HashMap;
    //   277: iload_3
    //   278: aaload
    //   279: aload #7
    //   281: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   284: checkcast b/k/a/a$d
    //   287: astore #10
    //   289: aload_1
    //   290: astore_2
    //   291: aload #10
    //   293: ifnull -> 1336
    //   296: aload #6
    //   298: ifnonnull -> 318
    //   301: aload_0
    //   302: getfield d : [Ljava/util/HashMap;
    //   305: iload_3
    //   306: aaload
    //   307: aload #7
    //   309: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   312: pop
    //   313: aload_1
    //   314: astore_2
    //   315: goto -> 1336
    //   318: aload #6
    //   320: invokestatic c : (Ljava/lang/String;)Landroid/util/Pair;
    //   323: astore #9
    //   325: aload #10
    //   327: getfield c : I
    //   330: aload #9
    //   332: getfield first : Ljava/lang/Object;
    //   335: checkcast java/lang/Integer
    //   338: invokevirtual intValue : ()I
    //   341: if_icmpeq -> 700
    //   344: aload #10
    //   346: getfield c : I
    //   349: aload #9
    //   351: getfield second : Ljava/lang/Object;
    //   354: checkcast java/lang/Integer
    //   357: invokevirtual intValue : ()I
    //   360: if_icmpne -> 366
    //   363: goto -> 700
    //   366: aload #10
    //   368: getfield d : I
    //   371: istore #4
    //   373: iload #4
    //   375: iconst_m1
    //   376: if_icmpeq -> 424
    //   379: iload #4
    //   381: aload #9
    //   383: getfield first : Ljava/lang/Object;
    //   386: checkcast java/lang/Integer
    //   389: invokevirtual intValue : ()I
    //   392: if_icmpeq -> 414
    //   395: aload #10
    //   397: getfield d : I
    //   400: aload #9
    //   402: getfield second : Ljava/lang/Object;
    //   405: checkcast java/lang/Integer
    //   408: invokevirtual intValue : ()I
    //   411: if_icmpne -> 424
    //   414: aload #10
    //   416: getfield d : I
    //   419: istore #4
    //   421: goto -> 707
    //   424: aload #10
    //   426: getfield c : I
    //   429: istore #4
    //   431: iload #4
    //   433: iconst_1
    //   434: if_icmpeq -> 700
    //   437: iload #4
    //   439: bipush #7
    //   441: if_icmpeq -> 700
    //   444: iload #4
    //   446: iconst_2
    //   447: if_icmpne -> 453
    //   450: goto -> 700
    //   453: new java/lang/StringBuilder
    //   456: dup
    //   457: invokespecial <init> : ()V
    //   460: astore #8
    //   462: aload #8
    //   464: ldc_w 'Given tag ('
    //   467: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   470: pop
    //   471: aload #8
    //   473: aload #7
    //   475: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   478: pop
    //   479: aload #8
    //   481: ldc_w ') value didn't match with one of expected '
    //   484: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   487: pop
    //   488: aload #8
    //   490: ldc_w 'formats: '
    //   493: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   496: pop
    //   497: aload #8
    //   499: getstatic b/k/a/a.x : [Ljava/lang/String;
    //   502: aload #10
    //   504: getfield c : I
    //   507: aaload
    //   508: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   511: pop
    //   512: aload #10
    //   514: getfield d : I
    //   517: istore #4
    //   519: ldc ''
    //   521: astore #5
    //   523: iload #4
    //   525: iconst_m1
    //   526: if_icmpne -> 535
    //   529: ldc ''
    //   531: astore_2
    //   532: goto -> 570
    //   535: new java/lang/StringBuilder
    //   538: dup
    //   539: invokespecial <init> : ()V
    //   542: astore_2
    //   543: aload_2
    //   544: ldc_w ', '
    //   547: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   550: pop
    //   551: aload_2
    //   552: getstatic b/k/a/a.x : [Ljava/lang/String;
    //   555: aload #10
    //   557: getfield d : I
    //   560: aaload
    //   561: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   564: pop
    //   565: aload_2
    //   566: invokevirtual toString : ()Ljava/lang/String;
    //   569: astore_2
    //   570: aload #8
    //   572: aload_2
    //   573: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   576: pop
    //   577: aload #8
    //   579: ldc_w ' (guess: '
    //   582: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   585: pop
    //   586: aload #8
    //   588: getstatic b/k/a/a.x : [Ljava/lang/String;
    //   591: aload #9
    //   593: getfield first : Ljava/lang/Object;
    //   596: checkcast java/lang/Integer
    //   599: invokevirtual intValue : ()I
    //   602: aaload
    //   603: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   606: pop
    //   607: aload #9
    //   609: getfield second : Ljava/lang/Object;
    //   612: checkcast java/lang/Integer
    //   615: invokevirtual intValue : ()I
    //   618: iconst_m1
    //   619: if_icmpne -> 628
    //   622: aload #5
    //   624: astore_2
    //   625: goto -> 669
    //   628: new java/lang/StringBuilder
    //   631: dup
    //   632: invokespecial <init> : ()V
    //   635: astore_2
    //   636: aload_2
    //   637: ldc_w ', '
    //   640: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   643: pop
    //   644: aload_2
    //   645: getstatic b/k/a/a.x : [Ljava/lang/String;
    //   648: aload #9
    //   650: getfield second : Ljava/lang/Object;
    //   653: checkcast java/lang/Integer
    //   656: invokevirtual intValue : ()I
    //   659: aaload
    //   660: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   663: pop
    //   664: aload_2
    //   665: invokevirtual toString : ()Ljava/lang/String;
    //   668: astore_2
    //   669: aload #8
    //   671: aload_2
    //   672: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   675: pop
    //   676: aload #8
    //   678: ldc_w ')'
    //   681: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   684: pop
    //   685: aload_1
    //   686: aload #8
    //   688: invokevirtual toString : ()Ljava/lang/String;
    //   691: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   694: pop
    //   695: aload_1
    //   696: astore_2
    //   697: goto -> 1336
    //   700: aload #10
    //   702: getfield c : I
    //   705: istore #4
    //   707: iload #4
    //   709: tableswitch default -> 772, 1 -> 1310, 2 -> 1293, 3 -> 1225, 4 -> 1157, 5 -> 1059, 6 -> 772, 7 -> 1293, 8 -> 772, 9 -> 980, 10 -> 882, 11 -> 772, 12 -> 809
    //   772: new java/lang/StringBuilder
    //   775: dup
    //   776: invokespecial <init> : ()V
    //   779: astore_2
    //   780: aload_2
    //   781: ldc_w 'Data format isn't one of expected formats: '
    //   784: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   787: pop
    //   788: aload_2
    //   789: iload #4
    //   791: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   794: pop
    //   795: aload_2
    //   796: invokevirtual toString : ()Ljava/lang/String;
    //   799: astore_2
    //   800: aload_1
    //   801: aload_2
    //   802: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   805: pop
    //   806: goto -> 1338
    //   809: aload #6
    //   811: ldc_w ','
    //   814: iconst_m1
    //   815: invokevirtual split : (Ljava/lang/String;I)[Ljava/lang/String;
    //   818: astore_2
    //   819: aload_2
    //   820: arraylength
    //   821: newarray double
    //   823: astore #5
    //   825: iconst_0
    //   826: istore #4
    //   828: iload #4
    //   830: aload_2
    //   831: arraylength
    //   832: if_icmpge -> 856
    //   835: aload #5
    //   837: iload #4
    //   839: aload_2
    //   840: iload #4
    //   842: aaload
    //   843: invokestatic parseDouble : (Ljava/lang/String;)D
    //   846: dastore
    //   847: iload #4
    //   849: iconst_1
    //   850: iadd
    //   851: istore #4
    //   853: goto -> 828
    //   856: aload_0
    //   857: getfield d : [Ljava/util/HashMap;
    //   860: iload_3
    //   861: aaload
    //   862: aload #7
    //   864: aload #5
    //   866: aload_0
    //   867: getfield f : Ljava/nio/ByteOrder;
    //   870: invokestatic a : ([DLjava/nio/ByteOrder;)Lb/k/a/a$c;
    //   873: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   876: pop
    //   877: aload_1
    //   878: astore_2
    //   879: goto -> 1336
    //   882: aload #6
    //   884: ldc_w ','
    //   887: iconst_m1
    //   888: invokevirtual split : (Ljava/lang/String;I)[Ljava/lang/String;
    //   891: astore_2
    //   892: aload_2
    //   893: arraylength
    //   894: anewarray b/k/a/a$e
    //   897: astore #5
    //   899: iconst_0
    //   900: istore #4
    //   902: iload #4
    //   904: aload_2
    //   905: arraylength
    //   906: if_icmpge -> 959
    //   909: aload_2
    //   910: iload #4
    //   912: aaload
    //   913: ldc_w '/'
    //   916: iconst_m1
    //   917: invokevirtual split : (Ljava/lang/String;I)[Ljava/lang/String;
    //   920: astore #8
    //   922: aload #5
    //   924: iload #4
    //   926: new b/k/a/a$e
    //   929: dup
    //   930: aload #8
    //   932: iconst_0
    //   933: aaload
    //   934: invokestatic parseDouble : (Ljava/lang/String;)D
    //   937: d2l
    //   938: aload #8
    //   940: iconst_1
    //   941: aaload
    //   942: invokestatic parseDouble : (Ljava/lang/String;)D
    //   945: d2l
    //   946: invokespecial <init> : (JJ)V
    //   949: aastore
    //   950: iload #4
    //   952: iconst_1
    //   953: iadd
    //   954: istore #4
    //   956: goto -> 902
    //   959: aload_0
    //   960: getfield d : [Ljava/util/HashMap;
    //   963: iload_3
    //   964: aaload
    //   965: astore_2
    //   966: aload #5
    //   968: aload_0
    //   969: getfield f : Ljava/nio/ByteOrder;
    //   972: invokestatic a : ([Lb/k/a/a$e;Ljava/nio/ByteOrder;)Lb/k/a/a$c;
    //   975: astore #5
    //   977: goto -> 1045
    //   980: aload #6
    //   982: ldc_w ','
    //   985: iconst_m1
    //   986: invokevirtual split : (Ljava/lang/String;I)[Ljava/lang/String;
    //   989: astore_2
    //   990: aload_2
    //   991: arraylength
    //   992: newarray int
    //   994: astore #5
    //   996: iconst_0
    //   997: istore #4
    //   999: iload #4
    //   1001: aload_2
    //   1002: arraylength
    //   1003: if_icmpge -> 1027
    //   1006: aload #5
    //   1008: iload #4
    //   1010: aload_2
    //   1011: iload #4
    //   1013: aaload
    //   1014: invokestatic parseInt : (Ljava/lang/String;)I
    //   1017: iastore
    //   1018: iload #4
    //   1020: iconst_1
    //   1021: iadd
    //   1022: istore #4
    //   1024: goto -> 999
    //   1027: aload_0
    //   1028: getfield d : [Ljava/util/HashMap;
    //   1031: iload_3
    //   1032: aaload
    //   1033: astore_2
    //   1034: aload #5
    //   1036: aload_0
    //   1037: getfield f : Ljava/nio/ByteOrder;
    //   1040: invokestatic a : ([ILjava/nio/ByteOrder;)Lb/k/a/a$c;
    //   1043: astore #5
    //   1045: aload_2
    //   1046: aload #7
    //   1048: aload #5
    //   1050: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1053: pop
    //   1054: aload_1
    //   1055: astore_2
    //   1056: goto -> 1336
    //   1059: aload #6
    //   1061: ldc_w ','
    //   1064: iconst_m1
    //   1065: invokevirtual split : (Ljava/lang/String;I)[Ljava/lang/String;
    //   1068: astore_2
    //   1069: aload_2
    //   1070: arraylength
    //   1071: anewarray b/k/a/a$e
    //   1074: astore #5
    //   1076: iconst_0
    //   1077: istore #4
    //   1079: iload #4
    //   1081: aload_2
    //   1082: arraylength
    //   1083: if_icmpge -> 1136
    //   1086: aload_2
    //   1087: iload #4
    //   1089: aaload
    //   1090: ldc_w '/'
    //   1093: iconst_m1
    //   1094: invokevirtual split : (Ljava/lang/String;I)[Ljava/lang/String;
    //   1097: astore #8
    //   1099: aload #5
    //   1101: iload #4
    //   1103: new b/k/a/a$e
    //   1106: dup
    //   1107: aload #8
    //   1109: iconst_0
    //   1110: aaload
    //   1111: invokestatic parseDouble : (Ljava/lang/String;)D
    //   1114: d2l
    //   1115: aload #8
    //   1117: iconst_1
    //   1118: aaload
    //   1119: invokestatic parseDouble : (Ljava/lang/String;)D
    //   1122: d2l
    //   1123: invokespecial <init> : (JJ)V
    //   1126: aastore
    //   1127: iload #4
    //   1129: iconst_1
    //   1130: iadd
    //   1131: istore #4
    //   1133: goto -> 1079
    //   1136: aload_0
    //   1137: getfield d : [Ljava/util/HashMap;
    //   1140: iload_3
    //   1141: aaload
    //   1142: astore_2
    //   1143: aload #5
    //   1145: aload_0
    //   1146: getfield f : Ljava/nio/ByteOrder;
    //   1149: invokestatic b : ([Lb/k/a/a$e;Ljava/nio/ByteOrder;)Lb/k/a/a$c;
    //   1152: astore #5
    //   1154: goto -> 1324
    //   1157: aload #6
    //   1159: ldc_w ','
    //   1162: iconst_m1
    //   1163: invokevirtual split : (Ljava/lang/String;I)[Ljava/lang/String;
    //   1166: astore_2
    //   1167: aload_2
    //   1168: arraylength
    //   1169: newarray long
    //   1171: astore #5
    //   1173: iconst_0
    //   1174: istore #4
    //   1176: iload #4
    //   1178: aload_2
    //   1179: arraylength
    //   1180: if_icmpge -> 1204
    //   1183: aload #5
    //   1185: iload #4
    //   1187: aload_2
    //   1188: iload #4
    //   1190: aaload
    //   1191: invokestatic parseLong : (Ljava/lang/String;)J
    //   1194: lastore
    //   1195: iload #4
    //   1197: iconst_1
    //   1198: iadd
    //   1199: istore #4
    //   1201: goto -> 1176
    //   1204: aload_0
    //   1205: getfield d : [Ljava/util/HashMap;
    //   1208: iload_3
    //   1209: aaload
    //   1210: astore_2
    //   1211: aload #5
    //   1213: aload_0
    //   1214: getfield f : Ljava/nio/ByteOrder;
    //   1217: invokestatic a : ([JLjava/nio/ByteOrder;)Lb/k/a/a$c;
    //   1220: astore #5
    //   1222: goto -> 1324
    //   1225: aload #6
    //   1227: ldc_w ','
    //   1230: iconst_m1
    //   1231: invokevirtual split : (Ljava/lang/String;I)[Ljava/lang/String;
    //   1234: astore_2
    //   1235: aload_2
    //   1236: arraylength
    //   1237: newarray int
    //   1239: astore #5
    //   1241: iconst_0
    //   1242: istore #4
    //   1244: iload #4
    //   1246: aload_2
    //   1247: arraylength
    //   1248: if_icmpge -> 1272
    //   1251: aload #5
    //   1253: iload #4
    //   1255: aload_2
    //   1256: iload #4
    //   1258: aaload
    //   1259: invokestatic parseInt : (Ljava/lang/String;)I
    //   1262: iastore
    //   1263: iload #4
    //   1265: iconst_1
    //   1266: iadd
    //   1267: istore #4
    //   1269: goto -> 1244
    //   1272: aload_0
    //   1273: getfield d : [Ljava/util/HashMap;
    //   1276: iload_3
    //   1277: aaload
    //   1278: astore_2
    //   1279: aload #5
    //   1281: aload_0
    //   1282: getfield f : Ljava/nio/ByteOrder;
    //   1285: invokestatic b : ([ILjava/nio/ByteOrder;)Lb/k/a/a$c;
    //   1288: astore #5
    //   1290: goto -> 1324
    //   1293: aload_0
    //   1294: getfield d : [Ljava/util/HashMap;
    //   1297: iload_3
    //   1298: aaload
    //   1299: astore_2
    //   1300: aload #6
    //   1302: invokestatic b : (Ljava/lang/String;)Lb/k/a/a$c;
    //   1305: astore #5
    //   1307: goto -> 1324
    //   1310: aload_0
    //   1311: getfield d : [Ljava/util/HashMap;
    //   1314: iload_3
    //   1315: aaload
    //   1316: astore_2
    //   1317: aload #6
    //   1319: invokestatic a : (Ljava/lang/String;)Lb/k/a/a$c;
    //   1322: astore #5
    //   1324: aload_2
    //   1325: aload #7
    //   1327: aload #5
    //   1329: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1332: pop
    //   1333: goto -> 1338
    //   1336: aload_2
    //   1337: astore_1
    //   1338: iload_3
    //   1339: iconst_1
    //   1340: iadd
    //   1341: istore_3
    //   1342: goto -> 249
    //   1345: return
    //   1346: astore_1
    //   1347: goto -> 236
    // Exception table:
    //   from	to	target	type
    //   217	233	1346	java/lang/NumberFormatException
  }
  
  public double[] a() {
    String str1 = a("GPSLatitude");
    String str2 = a("GPSLatitudeRef");
    String str3 = a("GPSLongitude");
    String str4 = a("GPSLongitudeRef");
    if (str1 != null && str2 != null && str3 != null && str4 != null)
      try {
        double d1 = b(str1, str2);
        double d2 = b(str3, str4);
        return new double[] { d1, d2 };
      } catch (IllegalArgumentException illegalArgumentException) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Latitude/longitude values are not parseable. ");
        stringBuilder.append(String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", new Object[] { str1, str2, str3, str4 }));
        Log.w("ExifInterface", stringBuilder.toString());
      }  
    return null;
  }
  
  public void b(double paramDouble) {
    String str;
    if (paramDouble >= 0.0D) {
      str = "0";
    } else {
      str = "1";
    } 
    a("GPSAltitude", (new e(Math.abs(paramDouble))).toString());
    a("GPSAltitudeRef", str);
  }
  
  public byte[] b() {
    int i = this.k;
    return (i == 6 || i == 7) ? c() : null;
  }
  
  public byte[] c() {
    // Byte code:
    //   0: aload_0
    //   1: getfield g : Z
    //   4: ifne -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: aload_0
    //   10: getfield j : [B
    //   13: astore #4
    //   15: aload #4
    //   17: ifnull -> 23
    //   20: aload #4
    //   22: areturn
    //   23: aload_0
    //   24: getfield b : Landroid/content/res/AssetManager$AssetInputStream;
    //   27: ifnull -> 98
    //   30: aload_0
    //   31: getfield b : Landroid/content/res/AssetManager$AssetInputStream;
    //   34: astore #4
    //   36: aload #4
    //   38: astore #6
    //   40: aload #4
    //   42: astore #5
    //   44: aload #4
    //   46: invokevirtual markSupported : ()Z
    //   49: ifeq -> 68
    //   52: aload #4
    //   54: astore #6
    //   56: aload #4
    //   58: astore #5
    //   60: aload #4
    //   62: invokevirtual reset : ()V
    //   65: goto -> 124
    //   68: aload #4
    //   70: astore #6
    //   72: aload #4
    //   74: astore #5
    //   76: ldc_w 'ExifInterface'
    //   79: ldc_w 'Cannot read thumbnail from inputstream without mark/reset support'
    //   82: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   85: pop
    //   86: aload #4
    //   88: invokestatic a : (Ljava/io/Closeable;)V
    //   91: aconst_null
    //   92: areturn
    //   93: astore #4
    //   95: goto -> 295
    //   98: aload_0
    //   99: getfield a : Ljava/lang/String;
    //   102: ifnull -> 121
    //   105: new java/io/FileInputStream
    //   108: dup
    //   109: aload_0
    //   110: getfield a : Ljava/lang/String;
    //   113: invokespecial <init> : (Ljava/lang/String;)V
    //   116: astore #4
    //   118: goto -> 124
    //   121: aconst_null
    //   122: astore #4
    //   124: aload #4
    //   126: ifnull -> 266
    //   129: aload #4
    //   131: astore #6
    //   133: aload #4
    //   135: astore #5
    //   137: aload #4
    //   139: aload_0
    //   140: getfield h : I
    //   143: i2l
    //   144: invokevirtual skip : (J)J
    //   147: lstore_2
    //   148: aload #4
    //   150: astore #6
    //   152: aload #4
    //   154: astore #5
    //   156: aload_0
    //   157: getfield h : I
    //   160: istore_1
    //   161: lload_2
    //   162: iload_1
    //   163: i2l
    //   164: lcmp
    //   165: ifne -> 247
    //   168: aload #4
    //   170: astore #6
    //   172: aload #4
    //   174: astore #5
    //   176: aload_0
    //   177: getfield i : I
    //   180: newarray byte
    //   182: astore #7
    //   184: aload #4
    //   186: astore #6
    //   188: aload #4
    //   190: astore #5
    //   192: aload #4
    //   194: aload #7
    //   196: invokevirtual read : ([B)I
    //   199: aload_0
    //   200: getfield i : I
    //   203: if_icmpne -> 228
    //   206: aload #4
    //   208: astore #6
    //   210: aload #4
    //   212: astore #5
    //   214: aload_0
    //   215: aload #7
    //   217: putfield j : [B
    //   220: aload #4
    //   222: invokestatic a : (Ljava/io/Closeable;)V
    //   225: aload #7
    //   227: areturn
    //   228: aload #4
    //   230: astore #6
    //   232: aload #4
    //   234: astore #5
    //   236: new java/io/IOException
    //   239: dup
    //   240: ldc_w 'Corrupted image'
    //   243: invokespecial <init> : (Ljava/lang/String;)V
    //   246: athrow
    //   247: aload #4
    //   249: astore #6
    //   251: aload #4
    //   253: astore #5
    //   255: new java/io/IOException
    //   258: dup
    //   259: ldc_w 'Corrupted image'
    //   262: invokespecial <init> : (Ljava/lang/String;)V
    //   265: athrow
    //   266: aload #4
    //   268: astore #6
    //   270: aload #4
    //   272: astore #5
    //   274: new java/io/FileNotFoundException
    //   277: dup
    //   278: invokespecial <init> : ()V
    //   281: athrow
    //   282: astore #4
    //   284: aconst_null
    //   285: astore #5
    //   287: goto -> 320
    //   290: astore #4
    //   292: aconst_null
    //   293: astore #6
    //   295: aload #6
    //   297: astore #5
    //   299: ldc_w 'ExifInterface'
    //   302: ldc_w 'Encountered exception while getting thumbnail'
    //   305: aload #4
    //   307: invokestatic d : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   310: pop
    //   311: aload #6
    //   313: invokestatic a : (Ljava/io/Closeable;)V
    //   316: aconst_null
    //   317: areturn
    //   318: astore #4
    //   320: aload #5
    //   322: invokestatic a : (Ljava/io/Closeable;)V
    //   325: aload #4
    //   327: athrow
    // Exception table:
    //   from	to	target	type
    //   23	36	290	java/io/IOException
    //   23	36	282	finally
    //   44	52	93	java/io/IOException
    //   44	52	318	finally
    //   60	65	93	java/io/IOException
    //   60	65	318	finally
    //   76	86	93	java/io/IOException
    //   76	86	318	finally
    //   98	118	290	java/io/IOException
    //   98	118	282	finally
    //   137	148	93	java/io/IOException
    //   137	148	318	finally
    //   156	161	93	java/io/IOException
    //   156	161	318	finally
    //   176	184	93	java/io/IOException
    //   176	184	318	finally
    //   192	206	93	java/io/IOException
    //   192	206	318	finally
    //   214	220	93	java/io/IOException
    //   214	220	318	finally
    //   236	247	93	java/io/IOException
    //   236	247	318	finally
    //   255	266	93	java/io/IOException
    //   255	266	318	finally
    //   274	282	93	java/io/IOException
    //   274	282	318	finally
    //   299	311	318	finally
  }
  
  public void d() {
    if (this.q && this.c == 4) {
      if (this.a != null) {
        this.j = b();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(".tmp");
        File file = new File(stringBuilder.toString());
        if ((new File(this.a)).renameTo(file)) {
          Closeable closeable;
          FileOutputStream fileOutputStream = null;
          try {
            closeable = new FileInputStream(file);
          } finally {
            stringBuilder = null;
          } 
          a(closeable);
          a(fileOutputStream);
          file.delete();
          throw stringBuilder;
        } 
        stringBuilder = new StringBuilder();
        stringBuilder.append("Could not rename to ");
        stringBuilder.append(file.getAbsolutePath());
        throw new IOException(stringBuilder.toString());
      } 
      throw new IOException("ExifInterface does not support saving attributes for the current input.");
    } 
    throw new IOException("ExifInterface only supports saving attributes on JPEG formats.");
  }
  
  static {
    Integer integer1 = Integer.valueOf(1);
    Integer integer2 = Integer.valueOf(3);
    Integer integer3 = Integer.valueOf(2);
    Integer integer4 = Integer.valueOf(8);
    Arrays.asList(new Integer[] { integer1, Integer.valueOf(6), integer2, integer4 });
    Integer integer5 = Integer.valueOf(7);
    Integer integer6 = Integer.valueOf(5);
    Arrays.asList(new Integer[] { integer3, integer5, Integer.valueOf(4), integer6 });
  }
  
  private static class a extends InputStream implements DataInput {
    private static final ByteOrder g = ByteOrder.LITTLE_ENDIAN;
    
    private static final ByteOrder h = ByteOrder.BIG_ENDIAN;
    
    private DataInputStream c;
    
    private ByteOrder d = ByteOrder.BIG_ENDIAN;
    
    final int e;
    
    int f;
    
    public a(InputStream param1InputStream) {
      this.c = new DataInputStream(param1InputStream);
      this.e = this.c.available();
      this.f = 0;
      this.c.mark(this.e);
    }
    
    public a(byte[] param1ArrayOfbyte) {
      this(new ByteArrayInputStream(param1ArrayOfbyte));
    }
    
    public int a() {
      return this.f;
    }
    
    public void a(long param1Long) {
      int i = this.f;
      if (i > param1Long) {
        this.f = 0;
        this.c.reset();
        this.c.mark(this.e);
      } else {
        param1Long -= i;
      } 
      i = (int)param1Long;
      if (skipBytes(i) == i)
        return; 
      throw new IOException("Couldn't seek up to the byteCount");
    }
    
    public void a(ByteOrder param1ByteOrder) {
      this.d = param1ByteOrder;
    }
    
    public int available() {
      return this.c.available();
    }
    
    public long b() {
      return readInt() & 0xFFFFFFFFL;
    }
    
    public int read() {
      this.f++;
      return this.c.read();
    }
    
    public int read(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      param1Int1 = this.c.read(param1ArrayOfbyte, param1Int1, param1Int2);
      this.f += param1Int1;
      return param1Int1;
    }
    
    public boolean readBoolean() {
      this.f++;
      return this.c.readBoolean();
    }
    
    public byte readByte() {
      this.f++;
      if (this.f <= this.e) {
        int i = this.c.read();
        if (i >= 0)
          return (byte)i; 
        throw new EOFException();
      } 
      throw new EOFException();
    }
    
    public char readChar() {
      this.f += 2;
      return this.c.readChar();
    }
    
    public double readDouble() {
      return Double.longBitsToDouble(readLong());
    }
    
    public float readFloat() {
      return Float.intBitsToFloat(readInt());
    }
    
    public void readFully(byte[] param1ArrayOfbyte) {
      this.f += param1ArrayOfbyte.length;
      if (this.f <= this.e) {
        if (this.c.read(param1ArrayOfbyte, 0, param1ArrayOfbyte.length) == param1ArrayOfbyte.length)
          return; 
        throw new IOException("Couldn't read up to the length of buffer");
      } 
      throw new EOFException();
    }
    
    public void readFully(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      this.f += param1Int2;
      if (this.f <= this.e) {
        if (this.c.read(param1ArrayOfbyte, param1Int1, param1Int2) == param1Int2)
          return; 
        throw new IOException("Couldn't read up to the length of buffer");
      } 
      throw new EOFException();
    }
    
    public int readInt() {
      this.f += 4;
      if (this.f <= this.e) {
        int i = this.c.read();
        int j = this.c.read();
        int k = this.c.read();
        int m = this.c.read();
        if ((i | j | k | m) >= 0) {
          ByteOrder byteOrder = this.d;
          if (byteOrder == g)
            return (m << 24) + (k << 16) + (j << 8) + i; 
          if (byteOrder == h)
            return (i << 24) + (j << 16) + (k << 8) + m; 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Invalid byte order: ");
          stringBuilder.append(this.d);
          throw new IOException(stringBuilder.toString());
        } 
        throw new EOFException();
      } 
      throw new EOFException();
    }
    
    public String readLine() {
      Log.d("ExifInterface", "Currently unsupported");
      return null;
    }
    
    public long readLong() {
      this.f += 8;
      if (this.f <= this.e) {
        int i = this.c.read();
        int j = this.c.read();
        int k = this.c.read();
        int m = this.c.read();
        int n = this.c.read();
        int i1 = this.c.read();
        int i2 = this.c.read();
        int i3 = this.c.read();
        if ((i | j | k | m | n | i1 | i2 | i3) >= 0) {
          ByteOrder byteOrder = this.d;
          if (byteOrder == g)
            return (i3 << 56L) + (i2 << 48L) + (i1 << 40L) + (n << 32L) + (m << 24L) + (k << 16L) + (j << 8L) + i; 
          if (byteOrder == h)
            return (i << 56L) + (j << 48L) + (k << 40L) + (m << 32L) + (n << 24L) + (i1 << 16L) + (i2 << 8L) + i3; 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Invalid byte order: ");
          stringBuilder.append(this.d);
          throw new IOException(stringBuilder.toString());
        } 
        throw new EOFException();
      } 
      throw new EOFException();
    }
    
    public short readShort() {
      this.f += 2;
      if (this.f <= this.e) {
        int i = this.c.read();
        int j = this.c.read();
        if ((i | j) >= 0) {
          ByteOrder byteOrder = this.d;
          if (byteOrder == g)
            return (short)((j << 8) + i); 
          if (byteOrder == h)
            return (short)((i << 8) + j); 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Invalid byte order: ");
          stringBuilder.append(this.d);
          throw new IOException(stringBuilder.toString());
        } 
        throw new EOFException();
      } 
      throw new EOFException();
    }
    
    public String readUTF() {
      this.f += 2;
      return this.c.readUTF();
    }
    
    public int readUnsignedByte() {
      this.f++;
      return this.c.readUnsignedByte();
    }
    
    public int readUnsignedShort() {
      this.f += 2;
      if (this.f <= this.e) {
        int i = this.c.read();
        int j = this.c.read();
        if ((i | j) >= 0) {
          ByteOrder byteOrder = this.d;
          if (byteOrder == g)
            return (j << 8) + i; 
          if (byteOrder == h)
            return (i << 8) + j; 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Invalid byte order: ");
          stringBuilder.append(this.d);
          throw new IOException(stringBuilder.toString());
        } 
        throw new EOFException();
      } 
      throw new EOFException();
    }
    
    public int skipBytes(int param1Int) {
      int i = Math.min(param1Int, this.e - this.f);
      for (param1Int = 0; param1Int < i; param1Int += this.c.skipBytes(i - param1Int));
      this.f += param1Int;
      return param1Int;
    }
  }
  
  private static class b extends FilterOutputStream {
    private final OutputStream c;
    
    private ByteOrder d;
    
    public b(OutputStream param1OutputStream, ByteOrder param1ByteOrder) {
      super(param1OutputStream);
      this.c = param1OutputStream;
      this.d = param1ByteOrder;
    }
    
    public void a(long param1Long) {
      writeInt((int)param1Long);
    }
    
    public void a(ByteOrder param1ByteOrder) {
      this.d = param1ByteOrder;
    }
    
    public void a(short param1Short) {
      int i;
      OutputStream outputStream;
      ByteOrder byteOrder = this.d;
      if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
        this.c.write(param1Short >>> 0 & 0xFF);
        outputStream = this.c;
        i = param1Short >>> 8;
      } else if (outputStream == ByteOrder.BIG_ENDIAN) {
        this.c.write(i >>> 8 & 0xFF);
        outputStream = this.c;
        i >>>= 0;
      } else {
        return;
      } 
      outputStream.write(i & 0xFF);
    }
    
    public void b(int param1Int) {
      a((short)param1Int);
    }
    
    public void write(byte[] param1ArrayOfbyte) {
      this.c.write(param1ArrayOfbyte);
    }
    
    public void write(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      this.c.write(param1ArrayOfbyte, param1Int1, param1Int2);
    }
    
    public void writeByte(int param1Int) {
      this.c.write(param1Int);
    }
    
    public void writeInt(int param1Int) {
      OutputStream outputStream;
      ByteOrder byteOrder = this.d;
      if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
        this.c.write(param1Int >>> 0 & 0xFF);
        this.c.write(param1Int >>> 8 & 0xFF);
        this.c.write(param1Int >>> 16 & 0xFF);
        outputStream = this.c;
        param1Int >>>= 24;
      } else if (outputStream == ByteOrder.BIG_ENDIAN) {
        this.c.write(param1Int >>> 24 & 0xFF);
        this.c.write(param1Int >>> 16 & 0xFF);
        this.c.write(param1Int >>> 8 & 0xFF);
        outputStream = this.c;
        param1Int >>>= 0;
      } else {
        return;
      } 
      outputStream.write(param1Int & 0xFF);
    }
  }
  
  private static class c {
    public final int a;
    
    public final int b;
    
    public final byte[] c;
    
    c(int param1Int1, int param1Int2, byte[] param1ArrayOfbyte) {
      this.a = param1Int1;
      this.b = param1Int2;
      this.c = param1ArrayOfbyte;
    }
    
    public static c a(int param1Int, ByteOrder param1ByteOrder) {
      return b(new int[] { param1Int }, param1ByteOrder);
    }
    
    public static c a(long param1Long, ByteOrder param1ByteOrder) {
      return a(new long[] { param1Long }, param1ByteOrder);
    }
    
    public static c a(a.e param1e, ByteOrder param1ByteOrder) {
      return b(new a.e[] { param1e }, param1ByteOrder);
    }
    
    public static c a(String param1String) {
      if (param1String.length() == 1 && param1String.charAt(0) >= '0' && param1String.charAt(0) <= '1') {
        byte[] arrayOfByte1 = new byte[1];
        arrayOfByte1[0] = (byte)(param1String.charAt(0) - 48);
        return new c(1, arrayOfByte1.length, arrayOfByte1);
      } 
      byte[] arrayOfByte = param1String.getBytes(a.S);
      return new c(1, arrayOfByte.length, arrayOfByte);
    }
    
    public static c a(double[] param1ArrayOfdouble, ByteOrder param1ByteOrder) {
      ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[a.y[12] * param1ArrayOfdouble.length]);
      byteBuffer.order(param1ByteOrder);
      int j = param1ArrayOfdouble.length;
      for (int i = 0; i < j; i++)
        byteBuffer.putDouble(param1ArrayOfdouble[i]); 
      return new c(12, param1ArrayOfdouble.length, byteBuffer.array());
    }
    
    public static c a(int[] param1ArrayOfint, ByteOrder param1ByteOrder) {
      ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[a.y[9] * param1ArrayOfint.length]);
      byteBuffer.order(param1ByteOrder);
      int j = param1ArrayOfint.length;
      for (int i = 0; i < j; i++)
        byteBuffer.putInt(param1ArrayOfint[i]); 
      return new c(9, param1ArrayOfint.length, byteBuffer.array());
    }
    
    public static c a(long[] param1ArrayOflong, ByteOrder param1ByteOrder) {
      ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[a.y[4] * param1ArrayOflong.length]);
      byteBuffer.order(param1ByteOrder);
      int j = param1ArrayOflong.length;
      for (int i = 0; i < j; i++)
        byteBuffer.putInt((int)param1ArrayOflong[i]); 
      return new c(4, param1ArrayOflong.length, byteBuffer.array());
    }
    
    public static c a(a.e[] param1ArrayOfe, ByteOrder param1ByteOrder) {
      ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[a.y[10] * param1ArrayOfe.length]);
      byteBuffer.order(param1ByteOrder);
      int j = param1ArrayOfe.length;
      for (int i = 0; i < j; i++) {
        a.e e1 = param1ArrayOfe[i];
        byteBuffer.putInt((int)e1.a);
        byteBuffer.putInt((int)e1.b);
      } 
      return new c(10, param1ArrayOfe.length, byteBuffer.array());
    }
    
    public static c b(String param1String) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(param1String);
      stringBuilder.append(false);
      byte[] arrayOfByte = stringBuilder.toString().getBytes(a.S);
      return new c(2, arrayOfByte.length, arrayOfByte);
    }
    
    public static c b(int[] param1ArrayOfint, ByteOrder param1ByteOrder) {
      ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[a.y[3] * param1ArrayOfint.length]);
      byteBuffer.order(param1ByteOrder);
      int j = param1ArrayOfint.length;
      for (int i = 0; i < j; i++)
        byteBuffer.putShort((short)param1ArrayOfint[i]); 
      return new c(3, param1ArrayOfint.length, byteBuffer.array());
    }
    
    public static c b(a.e[] param1ArrayOfe, ByteOrder param1ByteOrder) {
      ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[a.y[5] * param1ArrayOfe.length]);
      byteBuffer.order(param1ByteOrder);
      int j = param1ArrayOfe.length;
      for (int i = 0; i < j; i++) {
        a.e e1 = param1ArrayOfe[i];
        byteBuffer.putInt((int)e1.a);
        byteBuffer.putInt((int)e1.b);
      } 
      return new c(5, param1ArrayOfe.length, byteBuffer.array());
    }
    
    public double a(ByteOrder param1ByteOrder) {
      Object object = d(param1ByteOrder);
      if (object != null) {
        if (object instanceof String)
          return Double.parseDouble((String)object); 
        if (object instanceof long[]) {
          object = object;
          if (object.length == 1)
            return object[0]; 
          throw new NumberFormatException("There are more than one component");
        } 
        if (object instanceof int[]) {
          object = object;
          if (object.length == 1)
            return object[0]; 
          throw new NumberFormatException("There are more than one component");
        } 
        if (object instanceof double[]) {
          object = object;
          if (object.length == 1)
            return object[0]; 
          throw new NumberFormatException("There are more than one component");
        } 
        if (object instanceof a.e[]) {
          object = object;
          if (object.length == 1)
            return object[0].a(); 
          throw new NumberFormatException("There are more than one component");
        } 
        throw new NumberFormatException("Couldn't find a double value");
      } 
      throw new NumberFormatException("NULL can't be converted to a double value");
    }
    
    public int a() {
      return a.y[this.a] * this.b;
    }
    
    public int b(ByteOrder param1ByteOrder) {
      Object object = d(param1ByteOrder);
      if (object != null) {
        if (object instanceof String)
          return Integer.parseInt((String)object); 
        if (object instanceof long[]) {
          object = object;
          if (object.length == 1)
            return (int)object[0]; 
          throw new NumberFormatException("There are more than one component");
        } 
        if (object instanceof int[]) {
          object = object;
          if (object.length == 1)
            return object[0]; 
          throw new NumberFormatException("There are more than one component");
        } 
        throw new NumberFormatException("Couldn't find a integer value");
      } 
      throw new NumberFormatException("NULL can't be converted to a integer value");
    }
    
    public String c(ByteOrder param1ByteOrder) {
      Object object = d(param1ByteOrder);
      if (object == null)
        return null; 
      if (object instanceof String)
        return (String)object; 
      StringBuilder stringBuilder = new StringBuilder();
      boolean bool = object instanceof long[];
      int j = 0;
      boolean bool1 = false;
      boolean bool2 = false;
      int i = 0;
      if (bool) {
        object = object;
        while (i < object.length) {
          stringBuilder.append(object[i]);
          j = i + 1;
          i = j;
          if (j != object.length) {
            stringBuilder.append(",");
            i = j;
          } 
        } 
        return stringBuilder.toString();
      } 
      if (object instanceof int[]) {
        object = object;
        i = j;
        while (i < object.length) {
          stringBuilder.append(object[i]);
          j = i + 1;
          i = j;
          if (j != object.length) {
            stringBuilder.append(",");
            i = j;
          } 
        } 
        return stringBuilder.toString();
      } 
      if (object instanceof double[]) {
        object = object;
        i = bool1;
        while (i < object.length) {
          stringBuilder.append(object[i]);
          j = i + 1;
          i = j;
          if (j != object.length) {
            stringBuilder.append(",");
            i = j;
          } 
        } 
        return stringBuilder.toString();
      } 
      if (object instanceof a.e[]) {
        object = object;
        i = bool2;
        while (i < object.length) {
          stringBuilder.append(((a.e)object[i]).a);
          stringBuilder.append('/');
          stringBuilder.append(((a.e)object[i]).b);
          j = i + 1;
          i = j;
          if (j != object.length) {
            stringBuilder.append(",");
            i = j;
          } 
        } 
        return stringBuilder.toString();
      } 
      return null;
    }
    
    Object d(ByteOrder param1ByteOrder) {
      // Byte code:
      //   0: new b/k/a/a$a
      //   3: dup
      //   4: aload_0
      //   5: getfield c : [B
      //   8: invokespecial <init> : ([B)V
      //   11: astore #14
      //   13: aload #14
      //   15: astore #13
      //   17: aload #14
      //   19: aload_1
      //   20: invokevirtual a : (Ljava/nio/ByteOrder;)V
      //   23: aload #14
      //   25: astore #13
      //   27: aload_0
      //   28: getfield a : I
      //   31: istore #12
      //   33: iconst_1
      //   34: istore #5
      //   36: iconst_0
      //   37: istore_3
      //   38: iconst_0
      //   39: istore #6
      //   41: iconst_0
      //   42: istore #7
      //   44: iconst_0
      //   45: istore #8
      //   47: iconst_0
      //   48: istore #9
      //   50: iconst_0
      //   51: istore #10
      //   53: iconst_0
      //   54: istore #11
      //   56: iconst_0
      //   57: istore #4
      //   59: iconst_0
      //   60: istore_2
      //   61: iload #12
      //   63: tableswitch default -> 1097, 1 -> 857, 2 -> 677, 3 -> 611, 4 -> 545, 5 -> 466, 6 -> 857, 7 -> 677, 8 -> 400, 9 -> 334, 10 -> 253, 11 -> 187, 12 -> 124
      //   124: aload #14
      //   126: astore #13
      //   128: aload_0
      //   129: getfield b : I
      //   132: newarray double
      //   134: astore_1
      //   135: aload #14
      //   137: astore #13
      //   139: iload_2
      //   140: aload_0
      //   141: getfield b : I
      //   144: if_icmpge -> 166
      //   147: aload #14
      //   149: astore #13
      //   151: aload_1
      //   152: iload_2
      //   153: aload #14
      //   155: invokevirtual readDouble : ()D
      //   158: dastore
      //   159: iload_2
      //   160: iconst_1
      //   161: iadd
      //   162: istore_2
      //   163: goto -> 135
      //   166: aload #14
      //   168: invokevirtual close : ()V
      //   171: aload_1
      //   172: areturn
      //   173: astore #13
      //   175: ldc 'ExifInterface'
      //   177: ldc 'IOException occurred while closing InputStream'
      //   179: aload #13
      //   181: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   184: pop
      //   185: aload_1
      //   186: areturn
      //   187: aload #14
      //   189: astore #13
      //   191: aload_0
      //   192: getfield b : I
      //   195: newarray double
      //   197: astore_1
      //   198: iload_3
      //   199: istore_2
      //   200: aload #14
      //   202: astore #13
      //   204: iload_2
      //   205: aload_0
      //   206: getfield b : I
      //   209: if_icmpge -> 232
      //   212: aload #14
      //   214: astore #13
      //   216: aload_1
      //   217: iload_2
      //   218: aload #14
      //   220: invokevirtual readFloat : ()F
      //   223: f2d
      //   224: dastore
      //   225: iload_2
      //   226: iconst_1
      //   227: iadd
      //   228: istore_2
      //   229: goto -> 200
      //   232: aload #14
      //   234: invokevirtual close : ()V
      //   237: aload_1
      //   238: areturn
      //   239: astore #13
      //   241: ldc 'ExifInterface'
      //   243: ldc 'IOException occurred while closing InputStream'
      //   245: aload #13
      //   247: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   250: pop
      //   251: aload_1
      //   252: areturn
      //   253: aload #14
      //   255: astore #13
      //   257: aload_0
      //   258: getfield b : I
      //   261: anewarray b/k/a/a$e
      //   264: astore_1
      //   265: iload #6
      //   267: istore_2
      //   268: aload #14
      //   270: astore #13
      //   272: iload_2
      //   273: aload_0
      //   274: getfield b : I
      //   277: if_icmpge -> 313
      //   280: aload #14
      //   282: astore #13
      //   284: aload_1
      //   285: iload_2
      //   286: new b/k/a/a$e
      //   289: dup
      //   290: aload #14
      //   292: invokevirtual readInt : ()I
      //   295: i2l
      //   296: aload #14
      //   298: invokevirtual readInt : ()I
      //   301: i2l
      //   302: invokespecial <init> : (JJ)V
      //   305: aastore
      //   306: iload_2
      //   307: iconst_1
      //   308: iadd
      //   309: istore_2
      //   310: goto -> 268
      //   313: aload #14
      //   315: invokevirtual close : ()V
      //   318: aload_1
      //   319: areturn
      //   320: astore #13
      //   322: ldc 'ExifInterface'
      //   324: ldc 'IOException occurred while closing InputStream'
      //   326: aload #13
      //   328: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   331: pop
      //   332: aload_1
      //   333: areturn
      //   334: aload #14
      //   336: astore #13
      //   338: aload_0
      //   339: getfield b : I
      //   342: newarray int
      //   344: astore_1
      //   345: iload #7
      //   347: istore_2
      //   348: aload #14
      //   350: astore #13
      //   352: iload_2
      //   353: aload_0
      //   354: getfield b : I
      //   357: if_icmpge -> 379
      //   360: aload #14
      //   362: astore #13
      //   364: aload_1
      //   365: iload_2
      //   366: aload #14
      //   368: invokevirtual readInt : ()I
      //   371: iastore
      //   372: iload_2
      //   373: iconst_1
      //   374: iadd
      //   375: istore_2
      //   376: goto -> 348
      //   379: aload #14
      //   381: invokevirtual close : ()V
      //   384: aload_1
      //   385: areturn
      //   386: astore #13
      //   388: ldc 'ExifInterface'
      //   390: ldc 'IOException occurred while closing InputStream'
      //   392: aload #13
      //   394: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   397: pop
      //   398: aload_1
      //   399: areturn
      //   400: aload #14
      //   402: astore #13
      //   404: aload_0
      //   405: getfield b : I
      //   408: newarray int
      //   410: astore_1
      //   411: iload #8
      //   413: istore_2
      //   414: aload #14
      //   416: astore #13
      //   418: iload_2
      //   419: aload_0
      //   420: getfield b : I
      //   423: if_icmpge -> 445
      //   426: aload #14
      //   428: astore #13
      //   430: aload_1
      //   431: iload_2
      //   432: aload #14
      //   434: invokevirtual readShort : ()S
      //   437: iastore
      //   438: iload_2
      //   439: iconst_1
      //   440: iadd
      //   441: istore_2
      //   442: goto -> 414
      //   445: aload #14
      //   447: invokevirtual close : ()V
      //   450: aload_1
      //   451: areturn
      //   452: astore #13
      //   454: ldc 'ExifInterface'
      //   456: ldc 'IOException occurred while closing InputStream'
      //   458: aload #13
      //   460: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   463: pop
      //   464: aload_1
      //   465: areturn
      //   466: aload #14
      //   468: astore #13
      //   470: aload_0
      //   471: getfield b : I
      //   474: anewarray b/k/a/a$e
      //   477: astore_1
      //   478: iload #9
      //   480: istore_2
      //   481: aload #14
      //   483: astore #13
      //   485: iload_2
      //   486: aload_0
      //   487: getfield b : I
      //   490: if_icmpge -> 524
      //   493: aload #14
      //   495: astore #13
      //   497: aload_1
      //   498: iload_2
      //   499: new b/k/a/a$e
      //   502: dup
      //   503: aload #14
      //   505: invokevirtual b : ()J
      //   508: aload #14
      //   510: invokevirtual b : ()J
      //   513: invokespecial <init> : (JJ)V
      //   516: aastore
      //   517: iload_2
      //   518: iconst_1
      //   519: iadd
      //   520: istore_2
      //   521: goto -> 481
      //   524: aload #14
      //   526: invokevirtual close : ()V
      //   529: aload_1
      //   530: areturn
      //   531: astore #13
      //   533: ldc 'ExifInterface'
      //   535: ldc 'IOException occurred while closing InputStream'
      //   537: aload #13
      //   539: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   542: pop
      //   543: aload_1
      //   544: areturn
      //   545: aload #14
      //   547: astore #13
      //   549: aload_0
      //   550: getfield b : I
      //   553: newarray long
      //   555: astore_1
      //   556: iload #10
      //   558: istore_2
      //   559: aload #14
      //   561: astore #13
      //   563: iload_2
      //   564: aload_0
      //   565: getfield b : I
      //   568: if_icmpge -> 590
      //   571: aload #14
      //   573: astore #13
      //   575: aload_1
      //   576: iload_2
      //   577: aload #14
      //   579: invokevirtual b : ()J
      //   582: lastore
      //   583: iload_2
      //   584: iconst_1
      //   585: iadd
      //   586: istore_2
      //   587: goto -> 559
      //   590: aload #14
      //   592: invokevirtual close : ()V
      //   595: aload_1
      //   596: areturn
      //   597: astore #13
      //   599: ldc 'ExifInterface'
      //   601: ldc 'IOException occurred while closing InputStream'
      //   603: aload #13
      //   605: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   608: pop
      //   609: aload_1
      //   610: areturn
      //   611: aload #14
      //   613: astore #13
      //   615: aload_0
      //   616: getfield b : I
      //   619: newarray int
      //   621: astore_1
      //   622: iload #11
      //   624: istore_2
      //   625: aload #14
      //   627: astore #13
      //   629: iload_2
      //   630: aload_0
      //   631: getfield b : I
      //   634: if_icmpge -> 656
      //   637: aload #14
      //   639: astore #13
      //   641: aload_1
      //   642: iload_2
      //   643: aload #14
      //   645: invokevirtual readUnsignedShort : ()I
      //   648: iastore
      //   649: iload_2
      //   650: iconst_1
      //   651: iadd
      //   652: istore_2
      //   653: goto -> 625
      //   656: aload #14
      //   658: invokevirtual close : ()V
      //   661: aload_1
      //   662: areturn
      //   663: astore #13
      //   665: ldc 'ExifInterface'
      //   667: ldc 'IOException occurred while closing InputStream'
      //   669: aload #13
      //   671: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   674: pop
      //   675: aload_1
      //   676: areturn
      //   677: iload #4
      //   679: istore_2
      //   680: aload #14
      //   682: astore #13
      //   684: aload_0
      //   685: getfield b : I
      //   688: getstatic b/k/a/a.z : [B
      //   691: arraylength
      //   692: if_icmplt -> 751
      //   695: iconst_0
      //   696: istore_2
      //   697: iload #5
      //   699: istore_3
      //   700: aload #14
      //   702: astore #13
      //   704: iload_2
      //   705: getstatic b/k/a/a.z : [B
      //   708: arraylength
      //   709: if_icmpge -> 735
      //   712: aload #14
      //   714: astore #13
      //   716: aload_0
      //   717: getfield c : [B
      //   720: iload_2
      //   721: baload
      //   722: getstatic b/k/a/a.z : [B
      //   725: iload_2
      //   726: baload
      //   727: if_icmpeq -> 1100
      //   730: iconst_0
      //   731: istore_3
      //   732: goto -> 735
      //   735: iload #4
      //   737: istore_2
      //   738: iload_3
      //   739: ifeq -> 751
      //   742: aload #14
      //   744: astore #13
      //   746: getstatic b/k/a/a.z : [B
      //   749: arraylength
      //   750: istore_2
      //   751: aload #14
      //   753: astore #13
      //   755: new java/lang/StringBuilder
      //   758: dup
      //   759: invokespecial <init> : ()V
      //   762: astore_1
      //   763: aload #14
      //   765: astore #13
      //   767: iload_2
      //   768: aload_0
      //   769: getfield b : I
      //   772: if_icmpge -> 827
      //   775: aload #14
      //   777: astore #13
      //   779: aload_0
      //   780: getfield c : [B
      //   783: iload_2
      //   784: baload
      //   785: istore_3
      //   786: iload_3
      //   787: ifne -> 793
      //   790: goto -> 827
      //   793: iload_3
      //   794: bipush #32
      //   796: if_icmplt -> 813
      //   799: aload #14
      //   801: astore #13
      //   803: aload_1
      //   804: iload_3
      //   805: i2c
      //   806: invokevirtual append : (C)Ljava/lang/StringBuilder;
      //   809: pop
      //   810: goto -> 1107
      //   813: aload #14
      //   815: astore #13
      //   817: aload_1
      //   818: bipush #63
      //   820: invokevirtual append : (C)Ljava/lang/StringBuilder;
      //   823: pop
      //   824: goto -> 1107
      //   827: aload #14
      //   829: astore #13
      //   831: aload_1
      //   832: invokevirtual toString : ()Ljava/lang/String;
      //   835: astore_1
      //   836: aload #14
      //   838: invokevirtual close : ()V
      //   841: aload_1
      //   842: areturn
      //   843: astore #13
      //   845: ldc 'ExifInterface'
      //   847: ldc 'IOException occurred while closing InputStream'
      //   849: aload #13
      //   851: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   854: pop
      //   855: aload_1
      //   856: areturn
      //   857: aload #14
      //   859: astore #13
      //   861: aload_0
      //   862: getfield c : [B
      //   865: arraylength
      //   866: iconst_1
      //   867: if_icmpne -> 946
      //   870: aload #14
      //   872: astore #13
      //   874: aload_0
      //   875: getfield c : [B
      //   878: iconst_0
      //   879: baload
      //   880: iflt -> 946
      //   883: aload #14
      //   885: astore #13
      //   887: aload_0
      //   888: getfield c : [B
      //   891: iconst_0
      //   892: baload
      //   893: iconst_1
      //   894: if_icmpgt -> 946
      //   897: aload #14
      //   899: astore #13
      //   901: new java/lang/String
      //   904: dup
      //   905: iconst_1
      //   906: newarray char
      //   908: dup
      //   909: iconst_0
      //   910: aload_0
      //   911: getfield c : [B
      //   914: iconst_0
      //   915: baload
      //   916: bipush #48
      //   918: iadd
      //   919: i2c
      //   920: castore
      //   921: invokespecial <init> : ([C)V
      //   924: astore_1
      //   925: aload #14
      //   927: invokevirtual close : ()V
      //   930: aload_1
      //   931: areturn
      //   932: astore #13
      //   934: ldc 'ExifInterface'
      //   936: ldc 'IOException occurred while closing InputStream'
      //   938: aload #13
      //   940: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   943: pop
      //   944: aload_1
      //   945: areturn
      //   946: aload #14
      //   948: astore #13
      //   950: new java/lang/String
      //   953: dup
      //   954: aload_0
      //   955: getfield c : [B
      //   958: getstatic b/k/a/a.S : Ljava/nio/charset/Charset;
      //   961: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
      //   964: astore_1
      //   965: aload #14
      //   967: invokevirtual close : ()V
      //   970: aload_1
      //   971: areturn
      //   972: astore #13
      //   974: ldc 'ExifInterface'
      //   976: ldc 'IOException occurred while closing InputStream'
      //   978: aload #13
      //   980: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   983: pop
      //   984: aload_1
      //   985: areturn
      //   986: aload #14
      //   988: invokevirtual close : ()V
      //   991: aconst_null
      //   992: areturn
      //   993: astore_1
      //   994: ldc 'ExifInterface'
      //   996: ldc 'IOException occurred while closing InputStream'
      //   998: aload_1
      //   999: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   1002: pop
      //   1003: aconst_null
      //   1004: areturn
      //   1005: astore #13
      //   1007: aload #14
      //   1009: astore_1
      //   1010: aload #13
      //   1012: astore #14
      //   1014: goto -> 1028
      //   1017: astore_1
      //   1018: aconst_null
      //   1019: astore #13
      //   1021: goto -> 1064
      //   1024: astore #14
      //   1026: aconst_null
      //   1027: astore_1
      //   1028: aload_1
      //   1029: astore #13
      //   1031: ldc 'ExifInterface'
      //   1033: ldc 'IOException occurred during reading a value'
      //   1035: aload #14
      //   1037: invokestatic w : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   1040: pop
      //   1041: aload_1
      //   1042: ifnull -> 1061
      //   1045: aload_1
      //   1046: invokevirtual close : ()V
      //   1049: aconst_null
      //   1050: areturn
      //   1051: astore_1
      //   1052: ldc 'ExifInterface'
      //   1054: ldc 'IOException occurred while closing InputStream'
      //   1056: aload_1
      //   1057: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   1060: pop
      //   1061: aconst_null
      //   1062: areturn
      //   1063: astore_1
      //   1064: aload #13
      //   1066: ifnull -> 1089
      //   1069: aload #13
      //   1071: invokevirtual close : ()V
      //   1074: goto -> 1089
      //   1077: astore #13
      //   1079: ldc 'ExifInterface'
      //   1081: ldc 'IOException occurred while closing InputStream'
      //   1083: aload #13
      //   1085: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   1088: pop
      //   1089: goto -> 1094
      //   1092: aload_1
      //   1093: athrow
      //   1094: goto -> 1092
      //   1097: goto -> 986
      //   1100: iload_2
      //   1101: iconst_1
      //   1102: iadd
      //   1103: istore_2
      //   1104: goto -> 697
      //   1107: iload_2
      //   1108: iconst_1
      //   1109: iadd
      //   1110: istore_2
      //   1111: goto -> 763
      // Exception table:
      //   from	to	target	type
      //   0	13	1024	java/io/IOException
      //   0	13	1017	finally
      //   17	23	1005	java/io/IOException
      //   17	23	1063	finally
      //   27	33	1005	java/io/IOException
      //   27	33	1063	finally
      //   128	135	1005	java/io/IOException
      //   128	135	1063	finally
      //   139	147	1005	java/io/IOException
      //   139	147	1063	finally
      //   151	159	1005	java/io/IOException
      //   151	159	1063	finally
      //   166	171	173	java/io/IOException
      //   191	198	1005	java/io/IOException
      //   191	198	1063	finally
      //   204	212	1005	java/io/IOException
      //   204	212	1063	finally
      //   216	225	1005	java/io/IOException
      //   216	225	1063	finally
      //   232	237	239	java/io/IOException
      //   257	265	1005	java/io/IOException
      //   257	265	1063	finally
      //   272	280	1005	java/io/IOException
      //   272	280	1063	finally
      //   284	306	1005	java/io/IOException
      //   284	306	1063	finally
      //   313	318	320	java/io/IOException
      //   338	345	1005	java/io/IOException
      //   338	345	1063	finally
      //   352	360	1005	java/io/IOException
      //   352	360	1063	finally
      //   364	372	1005	java/io/IOException
      //   364	372	1063	finally
      //   379	384	386	java/io/IOException
      //   404	411	1005	java/io/IOException
      //   404	411	1063	finally
      //   418	426	1005	java/io/IOException
      //   418	426	1063	finally
      //   430	438	1005	java/io/IOException
      //   430	438	1063	finally
      //   445	450	452	java/io/IOException
      //   470	478	1005	java/io/IOException
      //   470	478	1063	finally
      //   485	493	1005	java/io/IOException
      //   485	493	1063	finally
      //   497	517	1005	java/io/IOException
      //   497	517	1063	finally
      //   524	529	531	java/io/IOException
      //   549	556	1005	java/io/IOException
      //   549	556	1063	finally
      //   563	571	1005	java/io/IOException
      //   563	571	1063	finally
      //   575	583	1005	java/io/IOException
      //   575	583	1063	finally
      //   590	595	597	java/io/IOException
      //   615	622	1005	java/io/IOException
      //   615	622	1063	finally
      //   629	637	1005	java/io/IOException
      //   629	637	1063	finally
      //   641	649	1005	java/io/IOException
      //   641	649	1063	finally
      //   656	661	663	java/io/IOException
      //   684	695	1005	java/io/IOException
      //   684	695	1063	finally
      //   704	712	1005	java/io/IOException
      //   704	712	1063	finally
      //   716	730	1005	java/io/IOException
      //   716	730	1063	finally
      //   746	751	1005	java/io/IOException
      //   746	751	1063	finally
      //   755	763	1005	java/io/IOException
      //   755	763	1063	finally
      //   767	775	1005	java/io/IOException
      //   767	775	1063	finally
      //   779	786	1005	java/io/IOException
      //   779	786	1063	finally
      //   803	810	1005	java/io/IOException
      //   803	810	1063	finally
      //   817	824	1005	java/io/IOException
      //   817	824	1063	finally
      //   831	836	1005	java/io/IOException
      //   831	836	1063	finally
      //   836	841	843	java/io/IOException
      //   861	870	1005	java/io/IOException
      //   861	870	1063	finally
      //   874	883	1005	java/io/IOException
      //   874	883	1063	finally
      //   887	897	1005	java/io/IOException
      //   887	897	1063	finally
      //   901	925	1005	java/io/IOException
      //   901	925	1063	finally
      //   925	930	932	java/io/IOException
      //   950	965	1005	java/io/IOException
      //   950	965	1063	finally
      //   965	970	972	java/io/IOException
      //   986	991	993	java/io/IOException
      //   1031	1041	1063	finally
      //   1045	1049	1051	java/io/IOException
      //   1069	1074	1077	java/io/IOException
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("(");
      stringBuilder.append(a.x[this.a]);
      stringBuilder.append(", data length:");
      stringBuilder.append(this.c.length);
      stringBuilder.append(")");
      return stringBuilder.toString();
    }
  }
  
  static class d {
    public final int a;
    
    public final String b;
    
    public final int c;
    
    public final int d;
    
    d(String param1String, int param1Int1, int param1Int2) {
      this.b = param1String;
      this.a = param1Int1;
      this.c = param1Int2;
      this.d = -1;
    }
    
    d(String param1String, int param1Int1, int param1Int2, int param1Int3) {
      this.b = param1String;
      this.a = param1Int1;
      this.c = param1Int2;
      this.d = param1Int3;
    }
    
    boolean a(int param1Int) {
      int i = this.c;
      if (i != 7) {
        if (param1Int == 7)
          return true; 
        if (i != param1Int) {
          int j = this.d;
          return (j == param1Int) ? true : (((i == 4 || j == 4) && param1Int == 3) ? true : (((this.c == 9 || this.d == 9) && param1Int == 8) ? true : (((this.c == 12 || this.d == 12) && param1Int == 11))));
        } 
      } 
      return true;
    }
  }
  
  private static class e {
    public final long a;
    
    public final long b;
    
    e(double param1Double) {
      this((long)(param1Double * 10000.0D), 10000L);
    }
    
    e(long param1Long1, long param1Long2) {
      if (param1Long2 == 0L) {
        this.a = 0L;
        this.b = 1L;
        return;
      } 
      this.a = param1Long1;
      this.b = param1Long2;
    }
    
    public double a() {
      double d1 = this.a;
      double d2 = this.b;
      Double.isNaN(d1);
      Double.isNaN(d2);
      return d1 / d2;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.a);
      stringBuilder.append("/");
      stringBuilder.append(this.b);
      return stringBuilder.toString();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/k/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */