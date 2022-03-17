package com.example.recylerview_infragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    ImageView imageView;
    TextView t3,t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView = findViewById(R.id.im);
        t3 = findViewById(R.id.tv1);
        t4 = findViewById(R.id.tv2);
        getSupportActionBar().hide();

        imageView.setImageResource(getIntent().getIntExtra("imagename",0));
        t3.setText(getIntent().getStringExtra("header"));
        t4.setText(getIntent().getStringExtra("desc"));

    }
}