package com.ym.TestProject2;

//import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;

import com.unity3d.player.UnityPlayerActivity;

//public class MainActivity extends AppCompatActivity {
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent();
        intent.setClass(this, UnityPlayerActivity.class);
        startActivity(intent);
    }
}