package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.util.f;

final class x {
  private TextView a;
  
  private TextClassifier b;
  
  x(TextView paramTextView) {
    f.a(paramTextView);
    this.a = paramTextView;
  }
  
  public TextClassifier a() {
    TextClassifier textClassifier2 = this.b;
    TextClassifier textClassifier1 = textClassifier2;
    if (textClassifier2 == null) {
      TextClassificationManager textClassificationManager = (TextClassificationManager)this.a.getContext().getSystemService(TextClassificationManager.class);
      if (textClassificationManager != null)
        return textClassificationManager.getTextClassifier(); 
      textClassifier1 = TextClassifier.NO_OP;
    } 
    return textClassifier1;
  }
  
  public void a(TextClassifier paramTextClassifier) {
    this.b = paramTextClassifier;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */