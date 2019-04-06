package com.example.ryan_mangeruga.reminders20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {

    ImageView tip4Picture;
    Button t4Back;
    Button t4Next;
    TextView tip4Num;
    TextView tip4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        tip4Picture = (ImageView) findViewById(R.id.tip4Picture);
        tip4Picture.setImageResource(R.drawable.tip4);
        t4Back = (Button) findViewById(R.id.t4back);
        t4Next = (Button) findViewById(R.id.t4next);
        tip4Num = (TextView) findViewById(R.id.tip4num);
        tip4 = (TextView) findViewById(R.id.tip4);

        t4Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });
        t4Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity8();
            }
        });

    }

    private void openActivity1(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void openActivity8(){
        Intent intent = new Intent(this, MainActivity8.class);
        startActivity(intent);
    }

}
