package com.muqsibagas.rambu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;

public class menurambu extends AppCompatActivity {

    private Button kembali,peringatan,larangan,perintah,petunjuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menurambu);

        kembali = (Button) findViewById(R.id.btnback);
        peringatan = (Button) findViewById(R.id.btnperingatan);
        larangan = (Button) findViewById(R.id.btnlarangan);
        perintah = (Button) findViewById(R.id.btnperintah);
        petunjuk = (Button) findViewById(R.id.btnpetunjuk);

        final MediaPlayer b1 = MediaPlayer.create(this, R.raw.pengenalan_rambu_peringatan);
        final MediaPlayer b2 = MediaPlayer.create(this, R.raw.pengenalan_rambu_larangan);
        final MediaPlayer b3 = MediaPlayer.create(this, R.raw.pengenalan_rambu_perintah);
        final MediaPlayer b4 = MediaPlayer.create(this, R.raw.pengenalan_rambu_petunjuk);

        Button peringatan = (Button) this.findViewById(R.id.btnperingatan);
        Button larangan = (Button) this.findViewById(R.id.btnlarangan);
        Button perintah = (Button) this.findViewById(R.id.btnperintah);
        Button petunjuk = (Button) this.findViewById(R.id.btnpetunjuk);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intructionIntent = new Intent(menurambu.this, menu.class);
                startActivity(intructionIntent);
            }
        });

        peringatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intructionIntent = new Intent(menurambu.this, rperingatan.class);
                startActivity(intructionIntent);
                b1.start();
            }
        });

        larangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intructionIntent = new Intent(menurambu.this, rlarangan.class);
                startActivity(intructionIntent);
                b2.start();
            }
        });

        perintah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intructionIntent = new Intent(menurambu.this, rperintah.class);
                startActivity(intructionIntent);
                b3.start();
            }
        });

        petunjuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intructionIntent = new Intent(menurambu.this, rpetunjuk.class);
                startActivity(intructionIntent);
                b4.start();
            }
        });
    }
}
