package e.f.a.f.l;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

public class f extends Property<ImageView, Matrix> {
  private final Matrix a = new Matrix();
  
  public f() {
    super(Matrix.class, "imageMatrixProperty");
  }
  
  public Matrix a(ImageView paramImageView) {
    this.a.set(paramImageView.getImageMatrix());
    return this.a;
  }
  
  public void a(ImageView paramImageView, Matrix paramMatrix) {
    paramImageView.setImageMatrix(paramMatrix);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/f/l/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */