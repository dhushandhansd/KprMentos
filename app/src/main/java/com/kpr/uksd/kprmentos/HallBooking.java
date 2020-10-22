package com.kpr.uksd.kprmentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.timqi.sectorprogressview.ColorfulRingProgressView;

public class HallBooking extends AppCompatActivity {

    ColorfulRingProgressView bar;
    int sd;
    String sds;
    TextView percentage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hall_booking);

        sd = 90;
        sds = "90%";
        bar = (ColorfulRingProgressView) findViewById(R.id.crpv);
        bar.setPercent(sd);
        percentage = findViewById(R.id.percetxtap);
        percentage.setText(sds);
    }

    public void tomainpage(View view) {
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    }
}
