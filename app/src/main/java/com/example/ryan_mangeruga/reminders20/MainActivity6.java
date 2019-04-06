package com.example.ryan_mangeruga.reminders20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    ImageView tip3Picture;
    Button t3Back;
    Button t3Next;
    TextView tip3Num;
    TextView tip3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        tip3Picture = (ImageView) findViewById(R.id.tip3Picture);
        tip3Picture.setImageResource(R.drawable.tip3);
        t3Back = (Button) findViewById(R.id.t3back);
        t3Next = (Button) findViewById(R.id.t3next);
        tip3Num = (TextView) findViewById(R.id.tip3num);
        tip3 = (TextView) findViewById(R.id.tip3);

        t3Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });
        t3Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity7();
            }
        });

    }

    private void openActivity1(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void openActivity7(){
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }

}

