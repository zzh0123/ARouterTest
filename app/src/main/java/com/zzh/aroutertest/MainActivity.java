package com.zzh.aroutertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.zzh.baselibrary.Test;

@Route(path = "/app/MainActivity")
public class MainActivity extends AppCompatActivity {

    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ARouter.getInstance().build("/commonModule/MyActivity").navigation();

        Test test = new Test("Jack", "Rose");
        Test1 test1 = new Test1();
        // 直接传递Bundle
        Bundle params = new Bundle();
        params.putSerializable("key4", test);
        // 2. Jump with parameters
        ARouter.getInstance().build("/commonModule/MyActivity")
                .withLong("key1", 666L)
                .withString("key3", "888")
                .with(params)
//                .withObject("key4", test1)
                .navigation();
//        handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Log.i("--handler--", "--handler--");
//                // 1. Simple jump within application (Jump via URL in 'Advanced usage')
////                ARouter.getInstance().build("/commonModule/MyActivity").navigation();
//
//
//            }
//        }, 3000);
    }
}
