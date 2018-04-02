package com.example.admin.ch6_3_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton imgbtn1,imgbtn2,imgbtn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgbtn1= (ImageButton)findViewById(R.id.imgbtn1);
        imgbtn2= (ImageButton)findViewById(R.id.imgbtn2);
        imgbtn3= (ImageButton)findViewById(R.id.imgbtn3);

        //建立事件處理請聽者物件
        //當觸動OnClick的時候就會更改ImageButton的圖片
        imgbtn1.setOnClickListener(
                new View.OnClickListener(){
                    public  void onClick(View v){
                        imgbtn1.setImageResource(R.drawable.h11);
                    }
                }
        );

        imgbtn2.setOnClickListener(
                new View.OnClickListener(){
                    public  void onClick(View v){
                        imgbtn2.setImageResource(R.drawable.d8);
                    }
                }
        );

        imgbtn3.setOnClickListener(
                new View.OnClickListener(){
                    public  void onClick(View v){
                        imgbtn3.setImageResource(R.drawable.h7);
                    }
                }
        );
    }
}
