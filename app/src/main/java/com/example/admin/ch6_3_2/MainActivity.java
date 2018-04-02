package com.example.admin.ch6_3_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton imgbtn1,imgbtn2,imgbtn3;
    private int num1,num2,num3;
    private int[] pp= new int[4];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pp[0] = R.drawable.d13;
        pp[1] = R.drawable.d8;
        pp[2] = R.drawable.h7;
        pp[3] = R.drawable.h11;

        //亂數
        num1 = (int)(Math.random()*3);
        num2 = (int)(Math.random()*3);
        num3 = (int)(Math.random()*3);

        imgbtn1= (ImageButton)findViewById(R.id.imgbtn1);
        imgbtn2= (ImageButton)findViewById(R.id.imgbtn2);
        imgbtn3= (ImageButton)findViewById(R.id.imgbtn3);

        //建立事件處理請聽者物件
        //當觸動OnClick的時候就會更改ImageButton的圖片
        imgbtn1.setOnClickListener(
                new View.OnClickListener(){
                    public  void onClick(View v){
                        imgbtn1.setImageResource(pp[num1]);
                    }
                }
        );

        imgbtn2.setOnClickListener(
                new View.OnClickListener(){
                    public  void onClick(View v){
                        imgbtn2.setImageResource(pp[num2]);
                    }
                }
        );

        imgbtn3.setOnClickListener(
                new View.OnClickListener(){
                    public  void onClick(View v){
                        imgbtn3.setImageResource(pp[num3]);
                    }
                }
        );
    }
}
