// Generated by data binding compiler. Do not edit!
package com.example.app2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.app2.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentGameBinding extends ViewDataBinding {
  @NonNull
  public final TextView CountText;

  @NonNull
  public final Button btnGuess;

  @NonNull
  public final EditText numText;

  @NonNull
  public final TextView tvhint;

  protected FragmentGameBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView CountText, Button btnGuess, EditText numText, TextView tvhint) {
    super(_bindingComponent, _root, _localFieldCount);
    this.CountText = CountText;
    this.btnGuess = btnGuess;
    this.numText = numText;
    this.tvhint = tvhint;
  }

  @NonNull
  public static FragmentGameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_game, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentGameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentGameBinding>inflateInternal(inflater, R.layout.fragment_game, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentGameBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_game, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentGameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentGameBinding>inflateInternal(inflater, R.layout.fragment_game, null, false, component);
  }

  public static FragmentGameBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentGameBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentGameBinding)bind(component, view, R.layout.fragment_game);
  }
}
