package com.example.datatransfer_from_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Spinner product_sp,price_sp,quant_sp;
    Button  next_btn;
    ArrayAdapter<String>product_adap,price_adap,quant_adap;
    String [] product_names={"shirt","pant","perfume","towel"};
    String [] price_names={"500","600","900","200"};

    String [] quantity_number={"1","2","3","4"};
    String a,b,c;
    int x,y,z;
    String total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        product_sp = findViewById(R.id.product_sp);
        price_sp = findViewById(R.id.price_sp);
        quant_sp = findViewById(R.id.quant_sp);
        next_btn = findViewById(R.id.nextButton);

        product_adap=new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,product_names);
        product_sp.setAdapter(product_adap);

        price_adap=new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,price_names);
        price_sp.setAdapter(price_adap);

        quant_adap=new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,quantity_number);
        quant_sp.setAdapter(quant_adap);


//product on select string capture
        product_sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                a = ((TextView)view).getText().toString();
                //Toast.makeText(MainActivity.this, a, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


//price on select string capture
        price_sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                b = ((TextView)view).getText().toString();
               // Toast.makeText(MainActivity.this, b, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

//quantity on select string capture
        quant_sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                c = ((TextView)view).getText().toString();
               // Toast.makeText(MainActivity.this, c, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });






  next_btn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          Intent i = new Intent(MainActivity.this, MainActivity2.class);
          i.putExtra("key1",a);
          x= Integer.valueOf(b);
          y= Integer.valueOf(c);
          z = x*y;
          total= String.valueOf(z);

          i.putExtra("key2",total);
          startActivity(i);
      }
  });










    }
}