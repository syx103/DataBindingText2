package com.example.mvvmthree;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.mvvmthree.BR;

public class Good extends BaseObservable {
    public String name;

    private String detail;

    private float price;

    public Good(String name,String detail,float price) {
        this.detail = detail;
        this.name = name;
        this.price = price;
    }
    public float getPrice() {
        return price;
    }
    @Bindable
    public String getDetail() {
        return detail;
    }
    @Bindable
    public String getName() {
        return name;
    }
    public void setDetail(String detail) {
        this.detail = detail;
        notifyChange();
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(com.example.mvvmthree.BR.name);
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
