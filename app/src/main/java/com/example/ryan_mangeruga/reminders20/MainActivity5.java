package com.example.ryan_mangeruga.reminders20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    ImageView tip2Picture;
    Button t2Back;
    Button t2Next;
    TextView tip2Num;
    TextView tip2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        tip2Picture = (ImageView) findViewById(R.id.tip2Picture);
        tip2Picture.setImageResource(R.drawable.tip2);
        t2Back = (Button) findViewById(R.id.t2back);
        t2Next = (Button) findViewById(R.id.t2next);
        tip2Num = (TextView) findViewById(R.id.tip2num);
        tip2 = (TextView) findViewById(R.id.tip2);

        t2Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });
        t2Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity6();
            }
        });

    }

    private void openActivity1(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void openActivity6(){
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }

}
