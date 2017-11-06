package com.example.destroy.signup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
  TextView t1,t2,t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE) ;
        setContentView(R.layout.activity_main2);
        t1=(TextView)findViewById(R.id.text1);
        t2=(TextView)findViewById(R.id.text2);
        t3=(TextView)findViewById(R.id.text3);
        t4=(TextView)findViewById(R.id.text4);
        Intent inte=getIntent();
        Bundle bundle=getIntent().getExtras(); // we can also use to impliment multiple data by that
        String str=bundle.getString("e1"); // this method is the part of bundle object
        String s1=inte.getStringExtra("e1");
        t1.setText(s1);
        String s2=inte.getStringExtra("e2");
        t2.setText(s2);
        String s3=inte.getStringExtra("e3");
        t3.setText(s3);
        String s4=inte.getStringExtra("e4");
        t4.setText(s4);


    }
}
