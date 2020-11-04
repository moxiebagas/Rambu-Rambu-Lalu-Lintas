package com.muqsibagas.rambu;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class menu extends AppCompatActivity {

    private Button rmbu,quiz,tentang,keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        rmbu = (Button) findViewById(R.id.btn_rambu);
        tentang = (Button) findViewById(R.id.btn_tentang);
        keluar = (Button) findViewById(R.id.btn_keluar);
        quiz = (Button) findViewById(R.id.btn_kuis);

        rmbu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intructionIntent = new Intent(menu.this, menurambu.class);
                startActivity(intructionIntent);
            }
        });

        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intructionIntent = new Intent(menu.this, kuis.class);
                startActivity(intructionIntent);
            }
        });

        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intructionIntent = new Intent(menu.this, tentang.class);
                startActivity(intructionIntent);
            }
        });

        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                keluar.setVisibility(View.VISIBLE);
                final AlertDialog.Builder builderInner = new AlertDialog.Builder(menu.this);
                builderInner.setMessage("Yakin keluar dari aplikasi ini?");
                builderInner.setPositiveButton("YA", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    finish();
                    moveTaskToBack(true);
                    }
                });
                builderInner.setNegativeButton("TIDAK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();}});
                        builderInner.show();
            }
        });
    }
}