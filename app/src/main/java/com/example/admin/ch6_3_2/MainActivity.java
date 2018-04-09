package com.example.admin.ch6_3_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton imgbtn1,imgbtn2,imgbtn3;

    //將撲克牌分成兩組，兩張人頭在不同組別，利用random先決定使用哪一組撲克牌
    private int random;
    private int[] poker_1= new int[3]; //組別1:含方塊13(人頭)
    private int[] poker_2= new int[3]; //組別2:含紅心11(人頭)
    private int[] res= new int[3]; //存放最終結果的陣列

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //先抽取撲克牌組別
        random = (int) (Math.random()*2); //0,1

        //組別1
        poker_1[0] = R.drawable.d13; //方塊13(人頭)
        poker_1[1] = R.drawable.d8;
        poker_1[2] = R.drawable.h7;

        //組別2
        poker_2[0] = R.drawable.h11; //紅心11(人頭)
        poker_2[1] = R.drawable.d8;
        poker_2[2] = R.drawable.h7;

        imgbtn1= (ImageButton)findViewById(R.id.imgbtn1);
        imgbtn2= (ImageButton)findViewById(R.id.imgbtn2);
        imgbtn3= (ImageButton)findViewById(R.id.imgbtn3);

        //隨機抽取組別內的三張牌，且不能重複
        final int[] arr = new int[3]; //先產生一個陣列:arr[0].arr[1].arr[2]

        for (int i=0; i<3; i++) {
            arr[i] = (int) (Math.random() * 3);//產生0~2的亂數，並放入random陣列中
            for (int j = 0; j < i; j++) { //檢查有沒有重複
                if (arr[i] == arr[j]) { //重複就跳出迴圈重新抽一次
                    i--;
                    break;
                }
            }
        }

        //根據所抽的組別，給予隨機抽取的順序
        if (random == 0) { //若random值為0，即為組別1
            for (int i = 0; i <= 2; i++) {
                res[i] = poker_1[arr[i]]; //將最終的結果放入新的陣列res[]
            }

        } else { //若random值為1，即為組別2
            for (int i = 0; i <= 2; i++) {
                res[i] = poker_2[arr[i]]; //將最終的結果放入新的陣列res[]
            }
        }

        //建立事件處理請聽者物件
        //當觸動OnClick的時候就會更改ImageButton的圖片
        imgbtn1.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        imgbtn1.setImageResource(res[0]); //顯示res[0]所對應的圖片
                    }
                }
        );

        imgbtn2.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        imgbtn2.setImageResource(res[1]); //顯示res[1]所對應的圖片
                    }
                }
        );

        imgbtn3.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        imgbtn3.setImageResource(res[2]); //顯示res[2]所對應的圖片
                    }
                }
        );
    }
}
