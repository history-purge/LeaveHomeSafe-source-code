package e.e.j.a.a.i;

public class d {
  public static int a(String paramString) {
    byte b;
    switch (paramString.hashCode()) {
      default:
        b = -1;
        break;
      case 2113652014:
        if (paramString.equals("LocalContentUriFetchProducer")) {
          b = 9;
          break;
        } 
      case 2109593398:
        if (paramString.equals("PartialDiskCacheProducer")) {
          b = 5;
          break;
        } 
      case 1793127518:
        if (paramString.equals("LocalContentUriThumbnailFetchProducer")) {
          b = 10;
          break;
        } 
      case 1721672898:
        if (paramString.equals("DataFetchProducer")) {
          b = 7;
          break;
        } 
      case 1023071510:
        if (paramString.equals("PostprocessedBitmapMemoryCacheProducer")) {
          b = 2;
          break;
        } 
      case 1019542023:
        if (paramString.equals("LocalAssetFetchProducer")) {
          b = 8;
          break;
        } 
      case 957714404:
        if (paramString.equals("BitmapMemoryCacheProducer")) {
          b = 1;
          break;
        } 
      case 656304759:
        if (paramString.equals("DiskCacheProducer")) {
          b = 4;
          break;
        } 
      case 473552259:
        if (paramString.equals("VideoThumbnailProducer")) {
          b = 13;
          break;
        } 
      case -1224383234:
        if (paramString.equals("NetworkFetchProducer")) {
          b = 6;
          break;
        } 
      case -1307634203:
        if (paramString.equals("EncodedMemoryCacheProducer")) {
          b = 3;
          break;
        } 
      case -1579985851:
        if (paramString.equals("LocalFileFetchProducer")) {
          b = 11;
          break;
        } 
      case -1683996557:
        if (paramString.equals("LocalResourceFetchProducer")) {
          b = 12;
          break;
        } 
      case -1914072202:
        if (paramString.equals("BitmapMemoryCacheGetProducer")) {
          b = 0;
          break;
        } 
      case -1917159454:
        if (paramString.equals("QualifiedResourceFetchProducer")) {
          b = 14;
          break;
        } 
    } 
    switch (b) {
      default:
        return 1;
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
        return 6;
      case 6:
        return 2;
      case 4:
      case 5:
        return 3;
      case 3:
        return 4;
      case 0:
      case 1:
      case 2:
        break;
    } 
    return 5;
  }
  
  public static String a(int paramInt) {
    return (paramInt != 2) ? ((paramInt != 3) ? ((paramInt != 4) ? ((paramInt != 5) ? ((paramInt != 6) ? "unknown" : "local") : "memory_bitmap") : "memory_encoded") : "disk") : "network";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/a/a/i/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */