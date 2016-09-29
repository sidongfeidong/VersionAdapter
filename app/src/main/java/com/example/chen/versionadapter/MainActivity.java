package com.example.chen.versionadapter;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int versionNumber = Build.VERSION.SDK_INT;
        Log.e("=="+versionNumber,"====");
        if (versionNumber>=Build.VERSION_CODES.HONEYCOMB){
            Toast.makeText(this,"当前",Toast.LENGTH_LONG);
        }else {

        }
    }
}
