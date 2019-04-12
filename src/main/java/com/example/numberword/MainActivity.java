package com.example.numberword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    private TextView result;
    private EditText number;
    private Button click;
    private Integer num;
    private String[] ones={"zero","one","two","three","four","five","six","seven","eight","nine","ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    private String[] tens={"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number=findViewById(R.id.number);
        result=findViewById(R.id.result);
        click=findViewById(R.id.click);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=Integer.parseInt(number.getText().toString());
                if(num<20){
                    result.setText(ones[num]);
                    Toast.makeText(MainActivity.this,ones[num],Toast.LENGTH_SHORT).show();
                }else if(num<100){
                    int num1=num/10;
                    int num2=num%10;
                    if(num2==0) {
                       result.setText(tens[num1]);
                        Toast.makeText(MainActivity.this, tens[num1] , Toast.LENGTH_SHORT).show();
                    }else{
                        result.setText(tens[num1] + " " + ones[num2]);
                        Toast.makeText(MainActivity.this, tens[num1] + " " + ones[num2], Toast.LENGTH_SHORT).show();
                    }
                }else if(num<1000){
                    int num10=num/100;
                    int num12=num%100;
                    int num1=num12/10;
                    int num2=num12%10;
                    if(num12==0) {
                        result.setText(ones[num10]+" Hundred "+ tens[num1]);
                        Toast.makeText(MainActivity.this,ones[num10]+" Hundred "+ tens[num1] , Toast.LENGTH_SHORT).show();
                    }else {
                        if(num2==0) {
                            result.setText(ones[num10]+" Hundred "+tens[num1]);
                            Toast.makeText(MainActivity.this, ones[num10]+" Hundred "+tens[num1], Toast.LENGTH_SHORT).show();
                        }else{
                           result.setText(ones[num10]+" Hundred "+tens[num1] + " " + ones[num2]);
                            Toast.makeText(MainActivity.this, ones[num10]+" Hundred "+tens[num1] + " " + ones[num2], Toast.LENGTH_SHORT).show();
                        }

                    }
                }
            }
        });

    }



    }

