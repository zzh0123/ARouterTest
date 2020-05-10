package com.zzh.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.zzh.baselibrary.Test;

@Route(path = "/commonModule/MyActivity")
public class MyActivity extends AppCompatActivity {

    @Autowired
    public long key1;
    @Autowired
    public String key3;

    TextView tv;

//    @Autowired
//    Test key4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        ARouter.getInstance().inject(this);

        Bundle bundle = getIntent().getExtras();
        Test key4 = (Test) bundle.get("key4");
        tv = findViewById(R.id.tv);
        tv.setText("MyActivity \n" + "key1==" + key1 + "key3==" + key3 + "key4==" + key4.toString());
//        Toast.makeText(this, "key1==" + key1 + "key3==" + key3 + "key4==" + key4.toString(),
//                Toast.LENGTH_SHORT).show();
    }
}
