package com.example.ryan_mangeruga.reminders20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    // headers
    private TextView w1Header;
    private TextView w1r1c1;
    private TextView w1r1c2;
    private TextView w1r1c3;

    // week 1 monday
    private TextView w1r2c1;
    private TextView w1r2c2;
    private TextView w1r2c3;

    // week 1 tuesday
    private TextView w1r3c1;
    private TextView w1r3c2;
    private TextView w1r3c3;

    // week 1 wednesday
    private TextView w1r4c1;
    private TextView w1r4c2;
    private TextView w1r4c3;

    // week 1 thursday
    private TextView w1r5c1;
    private TextView w1r5c2;
    private TextView w1r5c3;

    // week 1 friday
    private TextView w1r6c1;
    private TextView w1r6c2;
    private TextView w1r6c3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        w1Header = (TextView) findViewById(R.id.week1Header);

        w1r1c1 = (TextView) findViewById(R.id.week1r1c1);
        w1r1c2 = (TextView) findViewById(R.id.week1r1c2);
        w1r1c3 = (TextView) findViewById(R.id.week1r1c3);

        w1r2c1 = (TextView) findViewById(R.id.week1r2c1);
        w1r2c2 = (TextView) findViewById(R.id.week1r2c2);
        w1r2c3 = (TextView) findViewById(R.id.week1r2c3);

        w1r3c1 = (TextView) findViewById(R.id.week1r3c1);
        w1r3c2 = (TextView) findViewById(R.id.week1r3c2);
        w1r3c3 = (TextView) findViewById(R.id.week1r3c3);

        w1r4c1 = (TextView) findViewById(R.id.week1r4c1);
        w1r4c2 = (TextView) findViewById(R.id.week1r4c2);
        w1r4c3 = (TextView) findViewById(R.id.week1r4c3);

        w1r5c1 = (TextView) findViewById(R.id.week1r5c1);
        w1r5c2 = (TextView) findViewById(R.id.week1r5c2);
        w1r5c3 = (TextView) findViewById(R.id.week1r5c3);

        w1r6c1 = (TextView) findViewById(R.id.week1r6c1);
        w1r6c2 = (TextView) findViewById(R.id.week1r6c2);
        w1r6c3 = (TextView) findViewById(R.id.week1r6c3);

    }
}
