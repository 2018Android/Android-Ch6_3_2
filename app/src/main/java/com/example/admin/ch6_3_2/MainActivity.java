package com.example.admin.ch6_3_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton imgbtn1,imgbtn2,imgbtn3;
    private int[] pp= new int[4];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pp[0] = R.drawable.d13;
        pp[1] = R.drawable.d8;
        pp[2] = R.drawable.h7;
        pp[3] = R.drawable.h11;


        final int[] random = new int[3]; //產生一個陣列:random[0].random[1].random[2]
        for (int i=0; i<3; i++){
            random [i] = (int)(Math.random()*4); //產生0~3的亂數
            for (int j=0; j<i; j++){ //檢查有沒有重複
                if (random[i] == random[j]){ //重複就跳出迴圈重新抽一次
                    i--;
                    break;
                }
            }
        }

        imgbtn1= (ImageButton)findViewById(R.id.imgbtn1);
        imgbtn2= (ImageButton)findViewById(R.id.imgbtn2);
        imgbtn3= (ImageButton)findViewById(R.id.imgbtn3);

        //建立事件處理請聽者物件
        //當觸動OnClick的時候就會更改ImageButton的圖片
        imgbtn1.setOnClickListener(
                new View.OnClickListener(){
                    public  void onClick(View v){
                        imgbtn1.setImageResource(pp[random[0]]); //random[0]的數字丟到pp[]裡，顯示對應的圖片
                    }
                }
        );

        imgbtn2.setOnClickListener(
                new View.OnClickListener(){
                    public  void onClick(View v){
                        imgbtn2.setImageResource(pp[random[1]]); //random[1]的數字丟到pp[]裡，顯示對應的圖片
                    }
                }
        );

        imgbtn3.setOnClickListener(
                new View.OnClickListener(){
                    public  void onClick(View v){
                        imgbtn3.setImageResource(pp[random[2]]); //random[2]的數字丟到pp[]裡，顯示對應的圖片
                    }
                }
        );
    }
}
