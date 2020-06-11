package com.cookandroid.dcu2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class payment_history_cancle extends Activity {
    View dialogView;
    private Button btn_confirm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_history_cancle);

        final Button cancle = (Button) findViewById(R.id.cancle);

        cancle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                dialogView = (View) View.inflate(payment_history_cancle.this, R.layout.cancle_pop, null);

                AlertDialog.Builder dlg = new AlertDialog.Builder(payment_history_cancle.this);
                dlg.setTitle("주문 취소");
                dlg.setView(dialogView);

                dlg.setPositiveButton("네", new DialogInterface.OnClickListener() {
                    //확인 버튼 클릭시 설정
                    public void onClick(DialogInterface dialog, int whichButton) {
                        Intent intent = new Intent(payment_history_cancle.this, cancle_order.class);
                        startActivity(intent); //액티비티 이동
                    }
                });

                dlg.setNegativeButton("아니오", null);
                dlg.show();


            }



        });

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                cancle.setVisibility(View.INVISIBLE);   // 버튼 활성화
            }
        }, 3000);    // 3초 뒤에

        btn_confirm = findViewById(R.id.btn_confirm);
        btn_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(payment_history_cancle.this, MainActivity.class);
                startActivity(intent); // 액티비티 이동
            }
        });

    }



}
