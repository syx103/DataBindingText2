package com.example.mvvmthree;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.Observable;

import android.os.Bundle;
import android.util.Log;

import com.example.mvvmthree.BR;
import com.example.mvvmthree.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Good good;
    private ActivityMainBinding mainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        good = new Good("火龙果","好吃不贵",24);
        mainBinding.setGood(good);
        mainBinding.setGoodsHandler(new GoodHandler());
    }
    public class GoodHandler {
        public void changeGoodName() {
            good.setName("火龙果" + new Random().nextInt(100));
            good.setPrice(new Random().nextInt(100));
        }
        public void changeGoodDetail() {
            good.setDetail("好吃不贵" + new Random().nextInt(100));
            good.setPrice(new Random().nextInt(100));
        }
    }
}
