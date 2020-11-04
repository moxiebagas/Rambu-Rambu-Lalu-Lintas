package com.muqsibagas.rambu;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import java.util.concurrent.TimeUnit;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class kuis extends AppCompatActivity {
    private static final long COUNTDOWN_IN_MILLIS = 30000;

    ImageButton jw1, jw2, jw3, jw4;
    ImageView soal;
    int s, s1, j1, j2, j3, j4;
    int skor = 0;
    private Button btnStart;
    public TextView text;

    private CountDownTimer countDownTimer;
    private long timeLeftInMillis;

    soal Soal = new soal();
    int n = Soal.getjumlah();

    boolean jawabanbenar = true;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);
        btnStart = (Button) this.findViewById(R.id.start);
        text = (TextView) this.findViewById(R.id.timer);

        soal = (ImageView) findViewById(R.id.soal);
        jw1 = (ImageButton) findViewById(R.id.jawaban1);
        jw2 = (ImageButton) findViewById(R.id.jawaban2);
        jw3 = (ImageButton) findViewById(R.id.jawaban3);
        jw4 = (ImageButton) findViewById(R.id.jawaban4);



        final MediaPlayer SuaraButton = MediaPlayer.create(this, R.raw.ding);

        newlevel();

        jw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isCorrect(j1 == s);
            }
        });

        jw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isCorrect(j2 == s);
            }
        });

        jw3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isCorrect(j3 == s);
            }
        });

        jw4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isCorrect(j4 == s);
            }
        });
    }

    public  void newlevel(){
                s = Soal.getrandomhuruf();
                s1 = Soal.getrandomhuruf();
                int i = new Random().nextInt(4) +1;

                if(i==1) {
                    j1 = s;
                }
                else {
                    j1 = Soal.getrandomhuruf();
                }

                if(i==2) {
                    j2 = s;
                }
                else {
                    j2 = Soal.getrandomhuruf();
                }

                if(i==3) {
                    j3 = s;
                }
                else {
                    j3 = Soal.getrandomhuruf();
                }

                if(i==4) {
                    j4 = s;
                }
                else {
                    j4 = Soal.getrandomhuruf();
                }

                soal.setBackgroundResource(Soal.getimagesoal(s));
                jw1.setBackgroundResource(Soal.getimagejwbn(j1));
                jw2.setBackgroundResource(Soal.getimagejwbn(j2));
                jw3.setBackgroundResource(Soal.getimagejwbn(j3));
                jw4.setBackgroundResource(Soal.getimagejwbn(j4));
            }

            public void isCorrect(boolean input){
                TextView tampilSkor = (TextView) findViewById(R.id.skor);

                if(input && i < n) {
                    MediaPlayer benar = MediaPlayer.create(getBaseContext(), R.raw.benar);
                    skor += 10;
                    benar.start();
                    newlevel();
                    i++;
                }else{
                    MediaPlayer salah = MediaPlayer.create(getBaseContext(), R.raw.salah);
                    skor -= 5;
                    salah.start();
                    newlevel();
                    i++;
                }

                tampilSkor.setText("SKOR :"+skor);
            }
    }
