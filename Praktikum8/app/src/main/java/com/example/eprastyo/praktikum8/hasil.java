package com.example.eprastyo.praktikum8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class hasil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        Bundle a = getIntent().getExtras();

        TextView asal = (TextView)findViewById(R.id.hasilAsal);
        TextView tujuan = (TextView)findViewById(R.id.hasilTujuan);

        asal.setText(a.getCharSequence("kotaAsal"));
        tujuan.setText(a.getCharSequence("kotaTujuan"));

        TextView tgl = (TextView)findViewById(R.id.tanggal);
        TextView jam = (TextView)findViewById(R.id.waktu);

        tgl.setText(a.getCharSequence("tanggal"));
        jam.setText(a.getCharSequence("waktu"));

        TextView arm = (TextView)findViewById(R.id.armada);
        arm.setText(a.getCharSequence("arm"));
    }
}
