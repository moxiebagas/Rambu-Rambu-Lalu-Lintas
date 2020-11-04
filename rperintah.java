package com.muqsibagas.rambu;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class rperintah extends AppCompatActivity {

    ImageView TampilGambar;
    Button kembali ,show1, show2, show3, show4, show5, show6, show7, show8, show9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rperintah);

        kembali = (Button) findViewById(R.id.btnback);
        TampilGambar = (ImageView) findViewById(R.id.popup);
        show1 = (Button) findViewById(R.id.jawaban1);
        show2 = (Button) findViewById(R.id.jawaban2);
        show3 = (Button) findViewById(R.id.rambu3);
        show4 = (Button) findViewById(R.id.jawaban3);
        show5 = (Button) findViewById(R.id.jawaban4);
        show6 = (Button) findViewById(R.id.rambu6);
        show7 = (Button) findViewById(R.id.rambu7);
        show8 = (Button) findViewById(R.id.rambu8);
        show9 = (Button) findViewById(R.id.rambu9);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intructionIntent = new Intent(rperintah.this, menurambu.class);
                startActivity(intructionIntent);
            }
        });

        final android.view.animation.Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anime_scale);

        TampilGambar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setVisibility(view.INVISIBLE);
                show1.setVisibility(view.VISIBLE);
                show2.setVisibility(view.VISIBLE);
                show3.setVisibility(view.VISIBLE);
                show4.setVisibility(view.VISIBLE);
                show5.setVisibility(view.VISIBLE);
                show6.setVisibility(view.VISIBLE);
                show7.setVisibility(view.VISIBLE);
                show8.setVisibility(view.VISIBLE);
                show9.setVisibility(view.VISIBLE);
            }
        });

        final MediaPlayer b1 = MediaPlayer.create(this, R.raw.memasuki_kiri);
        final MediaPlayer b2 = MediaPlayer.create(this, R.raw.pejalan_kaki);
        final MediaPlayer b3 = MediaPlayer.create(this, R.raw.memasuki_kanan);
        final MediaPlayer b4 = MediaPlayer.create(this, R.raw.megikuti_kiri);
        final MediaPlayer b5 = MediaPlayer.create(this, R.raw.jalan_tol);
        final MediaPlayer b6 = MediaPlayer.create(this, R.raw.megikuti_kanan);
        final MediaPlayer b7 = MediaPlayer.create(this, R.raw.mengitari_bundaran);
        final MediaPlayer b8 = MediaPlayer.create(this, R.raw.min_kecepatan);
        final MediaPlayer b9 = MediaPlayer.create(this, R.raw.wajib_jalan);

        Button ButtonSuara1 = (Button) this.findViewById(R.id.jawaban1);
        Button ButtonSuara2 = (Button) this.findViewById(R.id.jawaban2);
        Button ButtonSuara3 = (Button) this.findViewById(R.id.rambu3);
        Button ButtonSuara4 = (Button) this.findViewById(R.id.jawaban3);
        Button ButtonSuara5 = (Button) this.findViewById(R.id.jawaban4);
        Button ButtonSuara6 = (Button) this.findViewById(R.id.rambu6);
        Button ButtonSuara7 = (Button) this.findViewById(R.id.rambu7);
        Button ButtonSuara8 = (Button) this.findViewById(R.id.rambu8);
        Button ButtonSuara9 = (Button) this.findViewById(R.id.rambu9);

        ButtonSuara1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.perintahpopup1);
                TampilGambar.setVisibility(view.VISIBLE);
                TampilGambar.startAnimation(animScale);
                mInvisible(view);
                b1.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.perintahpopup2);
                TampilGambar.setVisibility(view.VISIBLE);
                TampilGambar.startAnimation(animScale);
                mInvisible(view);
                b2.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.perintahpopup3);
                TampilGambar.setVisibility(view.VISIBLE);
                TampilGambar.startAnimation(animScale);
                mInvisible(view);
                b3.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.perintahpopup4);
                TampilGambar.setVisibility(view.VISIBLE);
                TampilGambar.startAnimation(animScale);
                mInvisible(view);
                b4.start();
            }
        });

        ButtonSuara5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.perintahpopup5);
                TampilGambar.setVisibility(view.VISIBLE);
                TampilGambar.startAnimation(animScale);
                mInvisible(view);
                b5.start();
            }
        });

        ButtonSuara6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.perintahpopup6);
                TampilGambar.setVisibility(view.VISIBLE);
                TampilGambar.startAnimation(animScale);
                mInvisible(view);
                b6.start();
            }
        });

        ButtonSuara7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.perintahpopup7);
                TampilGambar.setVisibility(view.VISIBLE);
                TampilGambar.startAnimation(animScale);
                mInvisible(view);
                b7.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.perintahpopup8);
                TampilGambar.setVisibility(view.VISIBLE);
                TampilGambar.startAnimation(animScale);
                mInvisible(view);
                b8.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.perintahpopup9);
                TampilGambar.setVisibility(view.VISIBLE);
                TampilGambar.startAnimation(animScale);
                mInvisible(view);
                b9.start();
            }
        });

    }
    public void mInvisible(View view){
        show1.setVisibility(view.INVISIBLE);
        show2.setVisibility(view.INVISIBLE);
        show3.setVisibility(view.INVISIBLE);
        show4.setVisibility(view.INVISIBLE);
        show5.setVisibility(view.INVISIBLE);
        show6.setVisibility(view.INVISIBLE);
        show7.setVisibility(view.INVISIBLE);
        show8.setVisibility(view.INVISIBLE);
        show9.setVisibility(view.INVISIBLE);
    }
}