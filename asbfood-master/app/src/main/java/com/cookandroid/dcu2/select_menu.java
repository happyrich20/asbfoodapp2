package com.cookandroid.dcu2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class select_menu extends AppCompatActivity {

    TextView foodname_1_1,foodprice_1_1;

    String choice = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_menu);
        this.InitializeView();
        this.setTextView();


        //주문하기 버튼 누르면 결제 창으로 넘어가기
        final Button order = (Button) findViewById(R.id.order);

        order.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), order.class);
                startActivity(intent);
            }
        });
    }
    public void InitializeView(){
        foodname_1_1=(TextView)findViewById(R.id.foodname_1_1);
        foodprice_1_1=(TextView)findViewById(R.id.foodprice_1_1);
    }
    public void setTextView(){
        foodname_1_1.setText(getString(R.string.foodname_1_1));
        foodname_1_1.setText(getString(R.string.foodprice_1_1));

    }
}
