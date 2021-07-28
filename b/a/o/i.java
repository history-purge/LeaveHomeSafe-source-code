package b.a.o;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class i implements Window.Callback {
  final Window.Callback c;
  
  public i(Window.Callback paramCallback) {
    if (paramCallback != null) {
      this.c = paramCallback;
      return;
    } 
    throw new IllegalArgumentException("Window callback may not be null");
  }
  
  public final Window.Callback a() {
    return this.c;
  }
  
  public boolean dispatchGenericMotionEvent(MotionEvent paramMotionEvent) {
    return this.c.dispatchGenericMotionEvent(paramMotionEvent);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    return this.c.dispatchKeyEvent(paramKeyEvent);
  }
  
  public boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent) {
    return this.c.dispatchKeyShortcutEvent(paramKeyEvent);
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    return this.c.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent) {
    return this.c.dispatchTouchEvent(paramMotionEvent);
  }
  
  public boolean dispatchTrackballEvent(MotionEvent paramMotionEvent) {
    return this.c.dispatchTrackballEvent(paramMotionEvent);
  }
  
  public void onActionModeFinished(ActionMode paramActionMode) {
    this.c.onActionModeFinished(paramActionMode);
  }
  
  public void onActionModeStarted(ActionMode paramActionMode) {
    this.c.onActionModeStarted(paramActionMode);
  }
  
  public void onAttachedToWindow() {
    this.c.onAttachedToWindow();
  }
  
  public void onContentChanged() {
    this.c.onContentChanged();
  }
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu) {
    return this.c.onCreatePanelMenu(paramInt, paramMenu);
  }
  
  public View onCreatePanelView(int paramInt) {
    return this.c.onCreatePanelView(paramInt);
  }
  
  public void onDetachedFromWindow() {
    this.c.onDetachedFromWindow();
  }
  
  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem) {
    return this.c.onMenuItemSelected(paramInt, paramMenuItem);
  }
  
  public boolean onMenuOpened(int paramInt, Menu paramMenu) {
    return this.c.onMenuOpened(paramInt, paramMenu);
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu) {
    this.c.onPanelClosed(paramInt, paramMenu);
  }
  
  public void onPointerCaptureChanged(boolean paramBoolean) {
    this.c.onPointerCaptureChanged(paramBoolean);
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu) {
    return this.c.onPreparePanel(paramInt, paramView, paramMenu);
  }
  
  public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> paramList, Menu paramMenu, int paramInt) {
    this.c.onProvideKeyboardShortcuts(paramList, paramMenu, paramInt);
  }
  
  public boolean onSearchRequested() {
    return this.c.onSearchRequested();
  }
  
  public boolean onSearchRequested(SearchEvent paramSearchEvent) {
    return this.c.onSearchRequested(paramSearchEvent);
  }
  
  public void onWindowAttributesChanged(WindowManager.LayoutParams paramLayoutParams) {
    this.c.onWindowAttributesChanged(paramLayoutParams);
  }
  
  public void onWindowFocusChanged(boolean paramBoolean) {
    this.c.onWindowFocusChanged(paramBoolean);
  }
  
  public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback) {
    return this.c.onWindowStartingActionMode(paramCallback);
  }
  
  public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback, int paramInt) {
    return this.c.onWindowStartingActionMode(paramCallback, paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/a/o/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */