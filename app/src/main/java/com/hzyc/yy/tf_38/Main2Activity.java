package com.hzyc.yy.tf_38;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        //观察者模式  线程  设计模式
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this, "点击了图片", Toast.LENGTH_LONG).show();
            }
        });
        //R.drawable.messenger
    }
}
