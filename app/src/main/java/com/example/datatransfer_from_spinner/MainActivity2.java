package com.example.datatransfer_from_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tv1,tv2;
    String name,price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv1 = findViewById(R.id.textview_1);
        tv2 = findViewById(R.id.textview_2);

         name = getIntent().getExtras().getString("key1");
        price = getIntent().getExtras().getString("key2");
         tv1.setText(name);
        tv2.setText(price);

    }
}