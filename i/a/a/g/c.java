package i.a.a.g;

import i.a.a.c.a;
import i.a.a.e.f;
import i.a.a.e.h;
import i.a.a.h.e;
import java.io.File;

public class c {
  private static void a(f paramf, File paramFile) {
    if (paramf.n() <= 0)
      return; 
    if (paramFile.exists())
      paramFile.setLastModified(e.a(paramf.n())); 
  }
  
  public static void a(f paramf, File paramFile, h paramh) {
    if (paramf != null) {
      if (paramFile != null) {
        if (e.a(paramFile)) {
          if (paramh == null) {
            a(paramf, paramFile);
            if (paramh == null) {
              a(paramf, paramFile, true, true, true, true);
              return;
            } 
            paramh.a();
            throw null;
          } 
          paramh.b();
          throw null;
        } 
        throw new a("cannot set file properties: file doesnot exist");
      } 
      throw new a("cannot set file properties: output file is null");
    } 
    throw new a("cannot set file properties: file header is null");
  }
  
  private static void a(f paramf, File paramFile, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    // Byte code:
    //   0: aload_0
    //   1: ifnull -> 222
    //   4: aload_0
    //   5: invokevirtual h : ()[B
    //   8: astore_0
    //   9: aload_0
    //   10: ifnonnull -> 14
    //   13: return
    //   14: aload_0
    //   15: iconst_0
    //   16: baload
    //   17: istore #6
    //   19: iload #6
    //   21: iconst_1
    //   22: if_icmpeq -> 213
    //   25: iload #6
    //   27: iconst_2
    //   28: if_icmpeq -> 204
    //   31: iload #6
    //   33: iconst_3
    //   34: if_icmpeq -> 189
    //   37: iload #6
    //   39: bipush #18
    //   41: if_icmpeq -> 204
    //   44: iload #6
    //   46: bipush #38
    //   48: if_icmpeq -> 163
    //   51: iload #6
    //   53: bipush #48
    //   55: if_icmpeq -> 153
    //   58: iload #6
    //   60: bipush #50
    //   62: if_icmpeq -> 137
    //   65: iload #6
    //   67: tableswitch default -> 96, 32 -> 153, 33 -> 121, 34 -> 137, 35 -> 97
    //   96: return
    //   97: iload #4
    //   99: ifeq -> 106
    //   102: aload_1
    //   103: invokestatic d : (Ljava/io/File;)V
    //   106: iload_2
    //   107: ifeq -> 114
    //   110: aload_1
    //   111: invokestatic f : (Ljava/io/File;)V
    //   114: iload_3
    //   115: ifeq -> 221
    //   118: goto -> 208
    //   121: iload #4
    //   123: ifeq -> 130
    //   126: aload_1
    //   127: invokestatic d : (Ljava/io/File;)V
    //   130: iload_2
    //   131: ifeq -> 221
    //   134: goto -> 217
    //   137: iload #4
    //   139: ifeq -> 146
    //   142: aload_1
    //   143: invokestatic d : (Ljava/io/File;)V
    //   146: iload_3
    //   147: ifeq -> 221
    //   150: goto -> 208
    //   153: iload #4
    //   155: ifeq -> 221
    //   158: aload_1
    //   159: invokestatic d : (Ljava/io/File;)V
    //   162: return
    //   163: iload_2
    //   164: ifeq -> 171
    //   167: aload_1
    //   168: invokestatic f : (Ljava/io/File;)V
    //   171: iload_3
    //   172: ifeq -> 179
    //   175: aload_1
    //   176: invokestatic e : (Ljava/io/File;)V
    //   179: iload #5
    //   181: ifeq -> 221
    //   184: aload_1
    //   185: invokestatic g : (Ljava/io/File;)V
    //   188: return
    //   189: iload_2
    //   190: ifeq -> 197
    //   193: aload_1
    //   194: invokestatic f : (Ljava/io/File;)V
    //   197: iload_3
    //   198: ifeq -> 221
    //   201: goto -> 208
    //   204: iload_3
    //   205: ifeq -> 221
    //   208: aload_1
    //   209: invokestatic e : (Ljava/io/File;)V
    //   212: return
    //   213: iload_2
    //   214: ifeq -> 221
    //   217: aload_1
    //   218: invokestatic f : (Ljava/io/File;)V
    //   221: return
    //   222: new i/a/a/c/a
    //   225: dup
    //   226: ldc 'invalid file header. cannot set file attributes'
    //   228: invokespecial <init> : (Ljava/lang/String;)V
    //   231: athrow
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/i/a/a/g/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */