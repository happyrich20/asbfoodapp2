package com.cookandroid.dcu2;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        try {
            Thread.sleep(3000); //대기 초 설정

            // 팝업창 시작
            final ProgressDialog dialog = ProgressDialog.show(this, "블루투스 연결 확인중", "잠시만 기다려 주세요", true);
            new Thread() {
                public void run() {
                    try {
                        sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }//찾기 중지 (블루투스 연결 안되었을 시)
                    // dialog.dismiss();
                }
            }.start();
            //팝업창끝
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}