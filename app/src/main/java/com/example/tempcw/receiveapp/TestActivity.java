package com.example.tempcw.receiveapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;

/**
 * Created by TempCw on 2016/10/9.
 */

public class TestActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode){
            case KeyEvent.KEYCODE_BACK:
                Intent relult=new Intent("com.example.tempcw.startapp", Uri.parse("MK:youth is not a time of life,it's a state of mind"));
                setResult(Activity.RESULT_OK,relult);
                finish();
                break;
        }
        return super.onKeyDown(keyCode, event);
    }
}
//intent.putExtra("user","17715369021");
//        intent.putExtra("pwd","1111111");