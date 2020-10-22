package com.kpr.uksd.kprmentos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.timqi.sectorprogressview.ColorfulRingProgressView;

public class Attendance extends AppCompatActivity {
    public Loginfragment loginfrag;
    public attendance_getter attendancefrag;
    TextView back;
    ColorfulRingProgressView bar;
    int sd;
    String sds;
    Button stats;
    TextView percentage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);
        sd = 90;
        sds = "90%";
        bar = (ColorfulRingProgressView) findViewById(R.id.crpv);
        bar.setPercent(sd);
        percentage = findViewById(R.id.percetxtap);
        percentage.setText(sds);
        back = findViewById(R.id.backbutton);
        stats = findViewById(R.id.statisticsbutt);
        loginfrag = new Loginfragment();
        attendancefrag = new attendance_getter();

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragmentcontainer,loginfrag);
        fragmentTransaction.commit();

        stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Statistics.class));
            }
        });





    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    }

    public void tomainpage(View view) {

        startActivity(new Intent(getApplicationContext(),MainActivity.class));

    }
}
