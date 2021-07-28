package e.e.k;

public final class b {
  public static final c a = new c("JPEG", "jpeg");
  
  public static final c b = new c("PNG", "png");
  
  public static final c c = new c("GIF", "gif");
  
  public static final c d = new c("BMP", "bmp");
  
  public static final c e = new c("ICO", "ico");
  
  public static final c f = new c("WEBP_SIMPLE", "webp");
  
  public static final c g = new c("WEBP_LOSSLESS", "webp");
  
  public static final c h = new c("WEBP_EXTENDED", "webp");
  
  public static final c i = new c("WEBP_EXTENDED_WITH_ALPHA", "webp");
  
  public static final c j = new c("WEBP_ANIMATED", "webp");
  
  public static final c k = new c("HEIF", "heif");
  
  public static boolean a(c paramc) {
    return (paramc == f || paramc == g || paramc == h || paramc == i);
  }
  
  public static boolean b(c paramc) {
    return (a(paramc) || paramc == j);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/k/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */