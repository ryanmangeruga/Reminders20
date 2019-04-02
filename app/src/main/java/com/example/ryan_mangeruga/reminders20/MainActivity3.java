package com.example.ryan_mangeruga.reminders20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    // headers
    private TextView w2Header;
    private TextView w2r1c1;
    private TextView w2r1c2;
    private TextView w2r1c3;

    // week 2 monday
    private TextView w2r2c1;
    private TextView w2r2c2;
    private TextView w2r2c3;

    // week 2 tuesday
    private TextView w2r3c1;
    private TextView w2r3c2;
    private TextView w2r3c3;

    // week 2 wednesday
    private TextView w2r4c1;
    private TextView w2r4c2;
    private TextView w2r4c3;

    // week 2 thursday
    private TextView w2r5c1;
    private TextView w2r5c2;
    private TextView w2r5c3;

    // week 2 friday
    private TextView w2r6c1;
    private TextView w2r6c2;
    private TextView w2r6c3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        w2Header = (TextView) findViewById(R.id.week2Header);

        w2r1c1 = (TextView) findViewById(R.id.week2r1c1);
        w2r1c2 = (TextView) findViewById(R.id.week2r1c2);
        w2r1c3 = (TextView) findViewById(R.id.week2r1c3);

        w2r2c1 = (TextView) findViewById(R.id.week2r2c1);
        w2r2c2 = (TextView) findViewById(R.id.week2r2c2);
        w2r2c3 = (TextView) findViewById(R.id.week2r2c3);

        w2r3c1 = (TextView) findViewById(R.id.week2r3c1);
        w2r3c2 = (TextView) findViewById(R.id.week2r3c2);
        w2r3c3 = (TextView) findViewById(R.id.week2r3c3);

        w2r4c1 = (TextView) findViewById(R.id.week2r4c1);
        w2r4c2 = (TextView) findViewById(R.id.week2r4c2);
        w2r4c3 = (TextView) findViewById(R.id.week2r4c3);

        w2r5c1 = (TextView) findViewById(R.id.week2r5c1);
        w2r5c2 = (TextView) findViewById(R.id.week2r5c2);
        w2r5c3 = (TextView) findViewById(R.id.week2r5c3);

        w2r6c1 = (TextView) findViewById(R.id.week2r6c1);
        w2r6c2 = (TextView) findViewById(R.id.week2r6c2);
        w2r6c3 = (TextView) findViewById(R.id.week2r6c3);

    }
}
