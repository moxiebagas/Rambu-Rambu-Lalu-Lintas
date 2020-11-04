package com.muqsibagas.rambu;

import java.util.Random;

public class soal {
    private int listhuruf[] = {
            R.drawable.soal1,
            R.drawable.soal2,
            R.drawable.soal3,
            R.drawable.soal4,
            R.drawable.soal5,
            R.drawable.soal6,
            R.drawable.soal7,
            R.drawable.soal8,
            R.drawable.soal9,
            R.drawable.soal10,
            R.drawable.soal11,
            R.drawable.soal12,
            R.drawable.soal13,
            R.drawable.soal14,
            R.drawable.soal15,
            R.drawable.soal16,
            R.drawable.soal17,
            R.drawable.soal18,
            R.drawable.soal19,
            R.drawable.soal20,
    };

    private int listhuruf2[] = {
            R.drawable.larangan6,
            R.drawable.perintah2,
            R.drawable.larangan2,
            R.drawable.petunjuk9,
            R.drawable.peringatan6,
            R.drawable.perintah5,
            R.drawable.peringatan2,
            R.drawable.peringatan5,
            R.drawable.peringatan9,
            R.drawable.petunjuk3,
            R.drawable.petunjuk8,
            R.drawable.petunjuk6,
            R.drawable.perintah8,
            R.drawable.larangan7,
            R.drawable.larangan8,
            R.drawable.perintah1,
            R.drawable.perintah7,
            R.drawable.petunjuk1,
            R.drawable.petunjuk2,
            R.drawable.petunjuk4,
    };

    public int[] getlist() {
        return listhuruf;
    }
    public int[] getlist2() {
        return listhuruf2;
    }
    public int getrandomhuruf() {
        int rnd = new Random().nextInt(listhuruf.length);
        return rnd;
    }
    public int getimagesoal(int i) {
        return listhuruf[i];
    }
    public int getimagejwbn(int i) {
        return listhuruf2[i];
    }
    public int getjumlah() {
        return listhuruf.length;
    }
    public int getjumlah2() {
        return listhuruf2.length;
    }
}
