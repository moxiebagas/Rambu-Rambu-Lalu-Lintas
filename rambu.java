package com.muqsibagas.rambu;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class rambu extends Activity {
    ImageView loading;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        ImageView loading = (ImageView) findViewById(R.id.sscreen);

        AnimationDrawable animation = new AnimationDrawable();

        animation.addFrame(getResources().getDrawable(R.drawable.splashscren), 400);
        animation.addFrame(getResources().getDrawable(R.drawable.splashscren1), 400);
        animation.addFrame(getResources().getDrawable(R.drawable.splashscren2), 400);
        animation.addFrame(getResources().getDrawable(R.drawable.splashscren3), 400);
        animation.addFrame(getResources().getDrawable(R.drawable.splashscren), 400);
        animation.addFrame(getResources().getDrawable(R.drawable.splashscren1), 400);
        animation.addFrame(getResources().getDrawable(R.drawable.splashscren2), 400);
        animation.addFrame(getResources().getDrawable(R.drawable.splashscren3), 400);

        loading.setBackgroundDrawable(animation);
        animation.start();
        pindahAct();
    }
    private  void pindahAct() {
        Thread thread = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                    Intent intent = new Intent(getApplicationContext(), menu.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }
}