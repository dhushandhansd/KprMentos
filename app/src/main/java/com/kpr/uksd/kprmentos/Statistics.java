package com.kpr.uksd.kprmentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.akexorcist.roundcornerprogressbar.CenteredRoundCornerProgressBar;
import com.akexorcist.roundcornerprogressbar.RoundCornerProgressBar;
import com.timqi.sectorprogressview.ColorfulRingProgressView;

public class Statistics extends AppCompatActivity {


    Button atten;
    ProgressBar cse,ece,mech,bme,eee,civil;
    TextView back;
    ColorfulRingProgressView bar;
    int sd;
    int csea,ecea,mecha,bmea,eeea,civila;
    float max;
    String sds;
    TextView percentage;
    TextView cseatt,eceatt,mechatt,bmeatt,eeeatt,civilatt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);

        max = 100;
        sd = 90;

        csea = 90;
        ecea = 80;
        mecha = 78;
        bmea = 89;
        eeea = 88;
        civila = 87;

        //ProgressBar//
        cse = findViewById(R.id.cseprogressbar);
        ece = findViewById(R.id.eceprogressbar);
        mech = findViewById(R.id.mechprogressbar);
        bme = findViewById(R.id.bmeprogressbar);
        eee = findViewById(R.id.eeeprogressbar);
        civil = findViewById(R.id.civilprogressbar);

        //Text//
        cseatt = findViewById(R.id.cseatt);
        eceatt = findViewById(R.id.eceatt);
        mechatt = findViewById(R.id.mechatt);
        bmeatt = findViewById(R.id.bmeatt);
        eeeatt = findViewById(R.id.eeeatt);
        civilatt = findViewById(R.id.civilatt);


        back = findViewById(R.id.backbutton);

        cse.setMax(100);
        ece.setMax(100);
        mech.setMax(100);
        bme.setMax(100);
        eee.setMax(100);
        civil.setMax(100);

        valueSetter();


        sds = "90%";
        bar = (ColorfulRingProgressView) findViewById(R.id.crpv);
        bar.setPercent(sd);
        percentage = findViewById(R.id.percetxtap);
        percentage.setText(sds);

        atten = findViewById(R.id.attendancebutt);

        atten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Attendance.class));
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

    public void valueSetter(){
        cse.setProgress(csea);
        cseatt.setText(csea+"%");
        ece.setProgress(ecea);
        eceatt.setText(ecea+"%");
        mech.setProgress(mecha);
        mechatt.setText(mecha+"%");
        bme.setProgress(bmea);
        bmeatt.setText(bmea+"%");
        eee.setProgress(eeea);
        eeeatt.setText(eeea+"%");
        civil.setProgress(civila);
        civilatt.setText(civila+"%");
    }

}
