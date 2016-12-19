package com.example.tempcw.receiveapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent=getIntent();
        String action=intent.getAction();
        Log.i("jc","未进入");
        textView= (TextView) findViewById(R.id.text);
        if (getIntent() != null) {
            Log.i("jc","未进入1");
            if (Intent.ACTION_VIEW.equals(action)) {
                Log.i("jc","未进入2===========");
                Uri uri = Uri.parse(getIntent().getDataString());
                if (uri != null) {
                    final String username = uri.getQueryParameter("username");
                    final String password=uri.getQueryParameter("pwd");

                    Log.i("jc","获取返回值------");
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            textView.setText(username+password);
                            Toast.makeText(MainActivity.this,"获取返回值",Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        }else{
            Log.i("jc","进入else");
        }
    }


}
