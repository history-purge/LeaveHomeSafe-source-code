package e.d.a;

public enum a {
  A,
  B,
  C,
  D,
  E,
  F,
  G,
  H,
  I,
  J,
  K,
  L,
  M,
  N,
  O,
  c("Unknown", "Unknown", null, new String[0]),
  d("JPEG", "Joint Photographic Experts Group", "image/jpeg", new String[] { "jpg", "jpeg", "jpe" }),
  e("TIFF", "Tagged Image File Format", "image/tiff", new String[] { "tiff", "tif" }),
  f("PSD", "Photoshop Document", "image/vnd.adobe.photoshop", new String[] { "psd" }),
  g("PNG", "Portable Network Graphics", "image/png", new String[] { "png" }),
  h("BMP", "Device Independent Bitmap", "image/bmp", new String[] { "bmp" }),
  i("GIF", "Graphics Interchange Format", "image/gif", new String[] { "gif" }),
  j("ICO", "Windows Icon", "image/x-icon", new String[] { "ico" }),
  k("PCX", "PiCture eXchange", "image/x-pcx", new String[] { "pcx" }),
  l("RIFF", "Resource Interchange File Format", null, new String[0]),
  m("WAV", "Waveform Audio File Format", "audio/vnd.wave", new String[] { "wav", "wave" }),
  n("AVI", "Audio Video Interleaved", "video/vnd.avi", new String[] { "avi" }),
  o("WebP", "WebP", "image/webp", new String[] { "webp" }),
  p("MOV", "QuickTime Movie", "video/quicktime", new String[] { "mov", "qt" }),
  q("MP4", "MPEG-4 Part 14", "video/mp4", new String[] { "mp4", "m4a", "m4p", "m4b", "m4r", "m4v" }),
  r("HEIF", "High Efficiency Image File Format", "image/heif", new String[] { "heif", "heic" }),
  s("EPS", "Encapsulated PostScript", "application/postscript", new String[] { "eps", "epsf", "epsi" }),
  t("ARW", "Sony Camera Raw", null, new String[] { "arw" }),
  u("CRW", "Canon Camera Raw", null, new String[] { "crw" }),
  v("CR2", "Canon Camera Raw", null, new String[] { "cr2" }),
  w("NEF", "Nikon Camera Raw", null, new String[] { "nef" }),
  x("ORF", "Olympus Camera Raw", null, new String[] { "orf" }),
  y("RAF", "FujiFilm Camera Raw", null, new String[] { "raf" }),
  z("RW2", "Panasonic Camera Raw", null, new String[] { "rw2" });
  
  private final String[] _extensions;
  
  private final String _longName;
  
  private final String _mimeType;
  
  private final String _name;
  
  static {
    A = new a("Aac", 24, "AAC", "Advanced Audio Coding", "audio/aac", new String[] { "m4a" });
    B = new a("Asf", 25, "ASF", "Advanced Systems Format", "video/x-ms-asf", new String[] { "asf", "wma", "wmv" });
    C = new a("Cfbf", 26, "CFBF", "Compound File Binary Format", null, null);
    D = new a("Flv", 27, "FLV", "Flash Video", "video/x-flv", new String[] { ".flv", ".f4v," });
    E = new a("Indd", 28, "INDD", "INDesign Document", "application/octet-stream", new String[] { ".indd" });
    F = new a("Mxf", 29, "MXF", "Material Exchange Format", "application/mxf", new String[] { "mxf" });
    G = new a("Pdf", 30, "PDF", "Portable Document Format", "application/pdf", new String[] { "pdf" });
    H = new a("Qxp", 31, "QXP", "Quark XPress Document", null, new String[] { "qzp", "qxd" });
    I = new a("Ram", 32, "RAM", "RealAudio", "audio/vnd.rn-realaudio", new String[] { "aac", "ra" });
    J = new a("Rtf", 33, "RTF", "Rich Text Format", "application/rtf", new String[] { "rtf" });
    K = new a("Sit", 34, "SIT", "Stuffit Archive", "application/x-stuffit", new String[] { "sit" });
    L = new a("Sitx", 35, "SITX", "Stuffit X Archive", "application/x-stuffitx", new String[] { "sitx" });
    M = new a("Swf", 36, "SWF", "Small Web Format", "application/vnd.adobe.flash-movie", new String[] { "swf" });
    N = new a("Vob", 37, "VOB", "Video Object", "video/dvd", new String[] { ".vob" });
    O = new a("Zip", 38, "ZIP", "ZIP Archive", "application/zip", new String[] { ".zip", ".zipx" });
    P = new a[] { 
        c, d, e, f, g, h, i, j, k, l, 
        m, n, o, p, q, r, s, t, u, v, 
        w, x, y, z, A, B, C, D, E, F, 
        G, H, I, J, K, L, M, N, O };
  }
  
  a(String paramString1, String paramString2, String paramString3, String... paramVarArgs) {
    this._name = paramString1;
    this._longName = paramString2;
    this._mimeType = paramString3;
    this._extensions = paramVarArgs;
  }
  
  public String a() {
    String[] arrayOfString = this._extensions;
    return (arrayOfString == null || arrayOfString.length == 0) ? null : arrayOfString[0];
  }
  
  public String b() {
    return this._longName;
  }
  
  public String c() {
    return this._mimeType;
  }
  
  public String d() {
    return this._name;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */