package com.example.dipeshbisht.june1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivit extends AppCompatActivity {


    EditText obj;
    EditText obj1;
    RadioButton r1;
    RadioButton r2;
    Button b1;
    TextView msg;
    int price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        obj= findViewById(R.id.name);
        obj1= findViewById(R.id.quantity);
        r1= findViewById(R.id.radio1);
        r2= findViewById(R.id.radio2);

        b1= findViewById(R.id.button1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String names= String.valueOf(obj.getText());
                int quantity1=0;
                try {
                    quantity1 = Integer.parseInt(obj1.getText().toString());
                }
                catch(NumberFormatException e){

                    Toast.makeText(getApplicationContext(),"Enter a valid quantity",Toast.LENGTH_SHORT).show();

                }
                price=0;

                if(r1.isChecked()) {
                    price= quantity1*10;
                }
                else if (r2.isChecked()){
                    price=quantity1*15;
                }
                else{
                    Toast.makeText(getApplicationContext(),"Choose a particular size",Toast.LENGTH_SHORT).show();
                }

                Toast.makeText(getApplicationContext(),"Hello"+names+"Your total price is :"+price,Toast.LENGTH_SHORT).show();
            }
        });
    }
}

