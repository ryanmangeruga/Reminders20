package com.example.ryan_mangeruga.reminders20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity8 extends AppCompatActivity {

    ImageView tip5Picture;
    Button t5Back;
    TextView tip5Num;
    TextView tip5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        tip5Picture = (ImageView) findViewById(R.id.tip5Picture);
        tip5Picture.setImageResource(R.drawable.tip5);
        t5Back = (Button) findViewById(R.id.t5back);
        tip5Num = (TextView) findViewById(R.id.tip5num);
        tip5 = (TextView) findViewById(R.id.tip5);

        t5Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });

    }

    private void openActivity1(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
