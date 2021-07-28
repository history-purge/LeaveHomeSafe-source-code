package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import b.a.f;
import b.h.a.c;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
class q0 extends c implements View.OnClickListener {
  private int A = -1;
  
  private final SearchView n;
  
  private final SearchableInfo o;
  
  private final Context p;
  
  private final WeakHashMap<String, Drawable.ConstantState> q;
  
  private final int r;
  
  private boolean s = false;
  
  private int t = 1;
  
  private ColorStateList u;
  
  private int v = -1;
  
  private int w = -1;
  
  private int x = -1;
  
  private int y = -1;
  
  private int z = -1;
  
  public q0(Context paramContext, SearchView paramSearchView, SearchableInfo paramSearchableInfo, WeakHashMap<String, Drawable.ConstantState> paramWeakHashMap) {
    super(paramContext, paramSearchView.getSuggestionRowLayout(), null, true);
    this.n = paramSearchView;
    this.o = paramSearchableInfo;
    this.r = paramSearchView.getSuggestionCommitIconResId();
    this.p = paramContext;
    this.q = paramWeakHashMap;
  }
  
  private Drawable a(ComponentName paramComponentName) {
    String str;
    PackageManager packageManager = ((b.h.a.a)this).f.getPackageManager();
    try {
      StringBuilder stringBuilder;
      ActivityInfo activityInfo = packageManager.getActivityInfo(paramComponentName, 128);
      int i = activityInfo.getIconResource();
      if (i == 0)
        return null; 
      Drawable drawable = packageManager.getDrawable(paramComponentName.getPackageName(), i, activityInfo.applicationInfo);
      if (drawable == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid icon resource ");
        stringBuilder.append(i);
        stringBuilder.append(" for ");
        stringBuilder.append(paramComponentName.flattenToShortString());
        str = stringBuilder.toString();
        Log.w("SuggestionsAdapter", str);
        return null;
      } 
      return (Drawable)stringBuilder;
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      str = nameNotFoundException.toString();
    } 
    Log.w("SuggestionsAdapter", str);
    return null;
  }
  
  private Drawable a(String paramString) {
    Drawable.ConstantState constantState = this.q.get(paramString);
    return (constantState == null) ? null : constantState.newDrawable();
  }
  
  private static String a(Cursor paramCursor, int paramInt) {
    if (paramInt == -1)
      return null; 
    try {
      return paramCursor.getString(paramInt);
    } catch (Exception exception) {
      Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", exception);
      return null;
    } 
  }
  
  public static String a(Cursor paramCursor, String paramString) {
    return a(paramCursor, paramCursor.getColumnIndex(paramString));
  }
  
  private void a(ImageView paramImageView, Drawable paramDrawable, int paramInt) {
    paramImageView.setImageDrawable(paramDrawable);
    if (paramDrawable == null) {
      paramImageView.setVisibility(paramInt);
      return;
    } 
    paramImageView.setVisibility(0);
    paramDrawable.setVisible(false, false);
    paramDrawable.setVisible(true, false);
  }
  
  private void a(TextView paramTextView, CharSequence paramCharSequence) {
    boolean bool;
    paramTextView.setText(paramCharSequence);
    if (TextUtils.isEmpty(paramCharSequence)) {
      bool = true;
    } else {
      bool = false;
    } 
    paramTextView.setVisibility(bool);
  }
  
  private void a(String paramString, Drawable paramDrawable) {
    if (paramDrawable != null)
      this.q.put(paramString, paramDrawable.getConstantState()); 
  }
  
  private Drawable b(ComponentName paramComponentName) {
    Drawable.ConstantState constantState1;
    String str = paramComponentName.flattenToShortString();
    boolean bool = this.q.containsKey(str);
    Drawable.ConstantState constantState2 = null;
    if (bool) {
      constantState1 = this.q.get(str);
      return (constantState1 == null) ? null : constantState1.newDrawable(this.p.getResources());
    } 
    Drawable drawable = a((ComponentName)constantState1);
    if (drawable == null) {
      constantState1 = constantState2;
    } else {
      constantState1 = drawable.getConstantState();
    } 
    this.q.put(str, constantState1);
    return drawable;
  }
  
  private Drawable b(Uri paramUri) {
    try {
      boolean bool = "android.resource".equals(paramUri.getScheme());
      if (bool)
        try {
          return a(paramUri);
        } catch (android.content.res.Resources.NotFoundException notFoundException) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Resource does not exist: ");
          stringBuilder1.append(paramUri);
          throw new FileNotFoundException(stringBuilder1.toString());
        }  
      InputStream inputStream = this.p.getContentResolver().openInputStream(paramUri);
      if (inputStream != null)
        try {
          Drawable drawable = Drawable.createFromStream(inputStream, null);
        } finally {
          try {
            iOException.close();
          } catch (IOException iOException1) {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append("Error closing icon stream for ");
            stringBuilder1.append(paramUri);
            Log.e("SuggestionsAdapter", stringBuilder1.toString(), iOException1);
          } 
        }  
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Failed to open ");
      stringBuilder.append(paramUri);
      throw new FileNotFoundException(stringBuilder.toString());
    } catch (FileNotFoundException fileNotFoundException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Icon not found: ");
      stringBuilder.append(paramUri);
      stringBuilder.append(", ");
      stringBuilder.append(fileNotFoundException.getMessage());
      Log.w("SuggestionsAdapter", stringBuilder.toString());
      return null;
    } 
  }
  
  private Drawable b(String paramString) {
    StringBuilder stringBuilder2 = null;
    StringBuilder stringBuilder1 = stringBuilder2;
    if (paramString != null) {
      stringBuilder1 = stringBuilder2;
      if (!paramString.isEmpty()) {
        if ("0".equals(paramString))
          return null; 
        try {
          int i = Integer.parseInt(paramString);
          stringBuilder1 = new StringBuilder();
          stringBuilder1.append("android.resource://");
          stringBuilder1.append(this.p.getPackageName());
          stringBuilder1.append("/");
          stringBuilder1.append(i);
          String str = stringBuilder1.toString();
          Drawable drawable = a(str);
          if (drawable != null)
            return drawable; 
          drawable = b.g.e.a.c(this.p, i);
          a(str, drawable);
          return drawable;
        } catch (NumberFormatException numberFormatException) {
          Drawable drawable = a(paramString);
          if (drawable != null)
            return drawable; 
          drawable = b(Uri.parse(paramString));
          a(paramString, drawable);
          return drawable;
        } catch (android.content.res.Resources.NotFoundException notFoundException) {
          stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Icon resource not found: ");
          stringBuilder1.append(paramString);
          Log.w("SuggestionsAdapter", stringBuilder1.toString());
          return null;
        } 
      } 
    } 
    return (Drawable)stringBuilder1;
  }
  
  private CharSequence b(CharSequence paramCharSequence) {
    if (this.u == null) {
      TypedValue typedValue = new TypedValue();
      ((b.h.a.a)this).f.getTheme().resolveAttribute(b.a.a.textColorSearchUrl, typedValue, true);
      this.u = ((b.h.a.a)this).f.getResources().getColorStateList(typedValue.resourceId);
    } 
    SpannableString spannableString = new SpannableString(paramCharSequence);
    spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.u, null), 0, paramCharSequence.length(), 33);
    return (CharSequence)spannableString;
  }
  
  private Drawable c() {
    Drawable drawable = b(this.o.getSearchActivity());
    return (drawable != null) ? drawable : ((b.h.a.a)this).f.getPackageManager().getDefaultActivityIcon();
  }
  
  private Drawable d(Cursor paramCursor) {
    int i = this.y;
    if (i == -1)
      return null; 
    Drawable drawable = b(paramCursor.getString(i));
    return (drawable != null) ? drawable : c();
  }
  
  private Drawable e(Cursor paramCursor) {
    int i = this.z;
    return (i == -1) ? null : b(paramCursor.getString(i));
  }
  
  private void f(Cursor paramCursor) {
    if (paramCursor != null) {
      Bundle bundle = paramCursor.getExtras();
    } else {
      paramCursor = null;
    } 
    if (paramCursor == null || paramCursor.getBoolean("in_progress"));
  }
  
  Cursor a(SearchableInfo paramSearchableInfo, String paramString, int paramInt) {
    SearchableInfo searchableInfo = null;
    if (paramSearchableInfo == null)
      return null; 
    String str1 = paramSearchableInfo.getSuggestAuthority();
    if (str1 == null)
      return null; 
    Uri.Builder builder = (new Uri.Builder()).scheme("content").authority(str1).query("").fragment("");
    String str2 = paramSearchableInfo.getSuggestPath();
    if (str2 != null)
      builder.appendEncodedPath(str2); 
    builder.appendPath("search_suggest_query");
    str2 = paramSearchableInfo.getSuggestSelection();
    if (str2 != null) {
      String[] arrayOfString = new String[1];
      arrayOfString[0] = paramString;
    } else {
      builder.appendPath(paramString);
      paramSearchableInfo = searchableInfo;
    } 
    if (paramInt > 0)
      builder.appendQueryParameter("limit", String.valueOf(paramInt)); 
    Uri uri = builder.build();
    return ((b.h.a.a)this).f.getContentResolver().query(uri, null, str2, (String[])paramSearchableInfo, null);
  }
  
  public Cursor a(CharSequence paramCharSequence) {
    if (paramCharSequence == null) {
      paramCharSequence = "";
    } else {
      paramCharSequence = paramCharSequence.toString();
    } 
    if (this.n.getVisibility() == 0) {
      if (this.n.getWindowVisibility() != 0)
        return null; 
      try {
        Cursor cursor = a(this.o, (String)paramCharSequence, 50);
        if (cursor != null) {
          cursor.getCount();
          return cursor;
        } 
      } catch (RuntimeException runtimeException) {
        Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", runtimeException);
      } 
    } 
    return null;
  }
  
  Drawable a(Uri paramUri) {
    String str = paramUri.getAuthority();
    if (!TextUtils.isEmpty(str))
      try {
        int i;
        Resources resources = ((b.h.a.a)this).f.getPackageManager().getResourcesForApplication(str);
        List<String> list = paramUri.getPathSegments();
        if (list != null) {
          StringBuilder stringBuilder2;
          i = list.size();
          if (i == 1)
            try {
              i = Integer.parseInt(list.get(0));
              if (i != 0)
                return resources.getDrawable(i); 
              stringBuilder2 = new StringBuilder();
              stringBuilder2.append("No resource found for: ");
              stringBuilder2.append(paramUri);
              throw new FileNotFoundException(stringBuilder2.toString());
            } catch (NumberFormatException numberFormatException) {
              stringBuilder2 = new StringBuilder();
              stringBuilder2.append("Single path segment is not a resource ID: ");
              stringBuilder2.append(paramUri);
              throw new FileNotFoundException(stringBuilder2.toString());
            }  
          if (i == 2) {
            i = resources.getIdentifier(list.get(1), list.get(0), (String)stringBuilder2);
          } else {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("More than two path segments: ");
            stringBuilder2.append(paramUri);
            throw new FileNotFoundException(stringBuilder2.toString());
          } 
        } else {
          StringBuilder stringBuilder2 = new StringBuilder();
          stringBuilder2.append("No path: ");
          stringBuilder2.append(paramUri);
          throw new FileNotFoundException(stringBuilder2.toString());
        } 
        if (i != 0)
          return resources.getDrawable(i); 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("No resource found for: ");
        stringBuilder1.append(paramUri);
        throw new FileNotFoundException(stringBuilder1.toString());
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("No package found for authority: ");
        stringBuilder1.append(paramUri);
        throw new FileNotFoundException(stringBuilder1.toString());
      }  
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("No authority: ");
    stringBuilder.append(paramUri);
    throw new FileNotFoundException(stringBuilder.toString());
  }
  
  public void a(int paramInt) {
    this.t = paramInt;
  }
  
  public void a(Cursor paramCursor) {
    if (this.s) {
      Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
      if (paramCursor != null)
        paramCursor.close(); 
      return;
    } 
    try {
      super.a(paramCursor);
      if (paramCursor != null) {
        this.v = paramCursor.getColumnIndex("suggest_text_1");
        this.w = paramCursor.getColumnIndex("suggest_text_2");
        this.x = paramCursor.getColumnIndex("suggest_text_2_url");
        this.y = paramCursor.getColumnIndex("suggest_icon_1");
        this.z = paramCursor.getColumnIndex("suggest_icon_2");
        this.A = paramCursor.getColumnIndex("suggest_flags");
        return;
      } 
    } catch (Exception exception) {
      Log.e("SuggestionsAdapter", "error changing cursor and caching columns", exception);
    } 
  }
  
  public void a(View paramView, Context paramContext, Cursor paramCursor) {
    a a = (a)paramView.getTag();
    int i = this.A;
    if (i != -1) {
      i = paramCursor.getInt(i);
    } else {
      i = 0;
    } 
    if (a.a != null) {
      String str = a(paramCursor, this.v);
      a(a.a, str);
    } 
    if (a.b != null) {
      String str = a(paramCursor, this.x);
      if (str != null) {
        CharSequence charSequence = b(str);
      } else {
        str = a(paramCursor, this.w);
      } 
      if (TextUtils.isEmpty(str)) {
        TextView textView = a.a;
        if (textView != null) {
          textView.setSingleLine(false);
          a.a.setMaxLines(2);
        } 
      } else {
        TextView textView = a.a;
        if (textView != null) {
          textView.setSingleLine(true);
          a.a.setMaxLines(1);
        } 
      } 
      a(a.b, str);
    } 
    ImageView imageView = a.c;
    if (imageView != null)
      a(imageView, d(paramCursor), 4); 
    imageView = a.d;
    if (imageView != null)
      a(imageView, e(paramCursor), 8); 
    int j = this.t;
    if (j == 2 || (j == 1 && (i & 0x1) != 0)) {
      a.e.setVisibility(0);
      a.e.setTag(a.a.getText());
      a.e.setOnClickListener(this);
      return;
    } 
    a.e.setVisibility(8);
  }
  
  public View b(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup) {
    View view = super.b(paramContext, paramCursor, paramViewGroup);
    view.setTag(new a(view));
    ((ImageView)view.findViewById(f.edit_query)).setImageResource(this.r);
    return view;
  }
  
  public CharSequence b(Cursor paramCursor) {
    if (paramCursor == null)
      return null; 
    String str = a(paramCursor, "suggest_intent_query");
    if (str != null)
      return str; 
    if (this.o.shouldRewriteQueryFromData()) {
      str = a(paramCursor, "suggest_intent_data");
      if (str != null)
        return str; 
    } 
    if (this.o.shouldRewriteQueryFromText()) {
      String str1 = a(paramCursor, "suggest_text_1");
      if (str1 != null)
        return str1; 
    } 
    return null;
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    try {
      return super.getDropDownView(paramInt, paramView, paramViewGroup);
    } catch (RuntimeException runtimeException) {
      Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", runtimeException);
      View view = a(((b.h.a.a)this).f, ((b.h.a.a)this).e, paramViewGroup);
      if (view != null)
        ((a)view.getTag()).a.setText(runtimeException.toString()); 
      return view;
    } 
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    try {
      return super.getView(paramInt, paramView, paramViewGroup);
    } catch (RuntimeException runtimeException) {
      Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", runtimeException);
      View view = b(((b.h.a.a)this).f, ((b.h.a.a)this).e, paramViewGroup);
      if (view != null)
        ((a)view.getTag()).a.setText(runtimeException.toString()); 
      return view;
    } 
  }
  
  public boolean hasStableIds() {
    return false;
  }
  
  public void notifyDataSetChanged() {
    super.notifyDataSetChanged();
    f(a());
  }
  
  public void notifyDataSetInvalidated() {
    super.notifyDataSetInvalidated();
    f(a());
  }
  
  public void onClick(View paramView) {
    Object object = paramView.getTag();
    if (object instanceof CharSequence)
      this.n.a((CharSequence)object); 
  }
  
  private static final class a {
    public final TextView a;
    
    public final TextView b;
    
    public final ImageView c;
    
    public final ImageView d;
    
    public final ImageView e;
    
    public a(View param1View) {
      this.a = (TextView)param1View.findViewById(16908308);
      this.b = (TextView)param1View.findViewById(16908309);
      this.c = (ImageView)param1View.findViewById(16908295);
      this.d = (ImageView)param1View.findViewById(16908296);
      this.e = (ImageView)param1View.findViewById(f.edit_query);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/q0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */