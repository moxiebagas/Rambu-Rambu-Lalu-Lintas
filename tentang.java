package com.muqsibagas.rambu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tentang extends AppCompatActivity {

    private Button kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);

        kembali = (Button) findViewById(R.id.btnback);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intructionIntent = new Intent(tentang.this, menu.class);
                startActivity(intructionIntent);
            }
        });
    }
}