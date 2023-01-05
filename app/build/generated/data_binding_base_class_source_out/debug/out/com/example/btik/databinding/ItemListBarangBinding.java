// Generated by data binding compiler. Do not edit!
package com.example.btik.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.btik.R;
import com.example.btik.dashboard.DataBarang;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemListBarangBinding extends ViewDataBinding {
  @NonNull
  public final ImageView ProductImg;

  @NonNull
  public final TextView ProductInfo;

  @NonNull
  public final TextView ProductName;

  @Bindable
  protected DataBarang mIsProduct;

  protected ItemListBarangBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView ProductImg, TextView ProductInfo, TextView ProductName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ProductImg = ProductImg;
    this.ProductInfo = ProductInfo;
    this.ProductName = ProductName;
  }

  public abstract void setIsProduct(@Nullable DataBarang isProduct);

  @Nullable
  public DataBarang getIsProduct() {
    return mIsProduct;
  }

  @NonNull
  public static ItemListBarangBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_list_barang, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemListBarangBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemListBarangBinding>inflateInternal(inflater, R.layout.item_list_barang, root, attachToRoot, component);
  }

  @NonNull
  public static ItemListBarangBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_list_barang, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemListBarangBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemListBarangBinding>inflateInternal(inflater, R.layout.item_list_barang, null, false, component);
  }

  public static ItemListBarangBinding bind(@NonNull View view) {
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
  public static ItemListBarangBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemListBarangBinding)bind(component, view, R.layout.item_list_barang);
  }
}
