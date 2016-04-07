package com.example.admin.soundservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playSong(View v){
        intent = new Intent(this, SoundService.class);
        startService(intent);
    }

    public void stopSong(View v){
        if(intent != null){
            stopService(intent);
        }
    }
}
