package com.example.destroy.signup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText phone;
    EditText email;
    EditText pass;
    Button sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText)findViewById(R.id.text_username);
        phone=(EditText)findViewById(R.id.text_phone);
        email=(EditText)findViewById(R.id.text_email);
        pass=(EditText)findViewById(R.id.text_pass);
        sign=(Button)findViewById(R.id.signup);

    }

    public void login(View view) {
        String usern=username.getText().toString();
        String phn=phone.getText().toString();
        String ema=email.getText().toString();
        String ps=pass.getText().toString();
        Intent rt=new Intent(MainActivity.this,Main2Activity.class);
        rt.putExtra("e1",usern);
        rt.putExtra("e2",phn);
        rt.putExtra("e3",ema);
        rt.putExtra("e4",ps);
        Toast.makeText(this, "username : "+usern+" \n phone : "+phn+"\n email: "+ema, Toast.LENGTH_SHORT).show();
        startActivity(rt);
    }
}
