package com.example.ryan_mangeruga.reminders20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    ImageView tip1Picture;
    Button t1Back;
    Button t1Next;
    TextView tip1Num;
    TextView tip1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        tip1Picture = (ImageView) findViewById(R.id.tip1Picture);
        tip1Picture.setImageResource(R.drawable.tip1);
        t1Back = (Button) findViewById(R.id.t1back);
        t1Next = (Button) findViewById(R.id.t1next);
        tip1Num = (TextView) findViewById(R.id.tip1num);
        tip1 = (TextView) findViewById(R.id.tip1);

        t1Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });
        t1Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });

    }

    private void openActivity1(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void openActivity5(){
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }

}
