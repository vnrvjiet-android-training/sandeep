package com.example.freewaresys.cricketchirps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText et;
    Button btn;
    TextView tv;
    DecimalFormat formatter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.editText);
        btn=findViewById(R.id.button2);
        tv=findViewById(R.id.textView2);
        tv.setVisibility(View.GONE);
        formatter =new DecimalFormat("0.0");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter something in the Text Field", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int chirps=Integer.parseInt(et.getText().toString().trim());
                    double temp=(chirps/3.0)+4;
                    String res="The Approximate temperature outside is "+formatter.format(temp)+" degrees celsius";
                    tv.setText(res);
                    tv.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
