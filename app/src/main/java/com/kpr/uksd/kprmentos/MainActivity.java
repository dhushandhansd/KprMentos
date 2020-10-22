package com.kpr.uksd.kprmentos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.timqi.sectorprogressview.ColorfulRingProgressView;

public class MainActivity extends AppCompatActivity {


    ColorfulRingProgressView bar;
    TextView title,percentage;
    Button b1,b2,b3,b4;
    int sd;
    String sds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sd = 90;
        sds = "90%";
        bar = (ColorfulRingProgressView) findViewById(R.id.crpv);
        bar.setPercent(sd);

        title = findViewById(R.id.title);
        percentage = findViewById(R.id.percenttxtmp);
        b1 = findViewById(R.id.attendancebutt);
        b2 = findViewById(R.id.halbookbutt);
        b3 = findViewById(R.id.placementbutt);
        b4 = findViewById(R.id.Semeresbutt);

        percentage.setText(sds);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Attendance.class));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),HallBooking.class));
            }
        });


    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
