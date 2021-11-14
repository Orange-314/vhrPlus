package com.example.vhr_android_demo;

import static java.lang.Thread.sleep;

import android.app.Activity;
import android.content.Intent;
import android.net.sip.SipSession;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginDoneActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_salary);
//        Button EmployeeButton = findViewById(R.id.EmployeeButton);
//        Button SalaryButton = findViewById(R.id.SalaryButton);
//        String HTTPSTR = Constants.HTTPSTR;
//
//        SalaryButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                new Thread(new Runnable() {//创建一个新线程
//                    @Override
//                    public void run() {
//                        try {//用try-catch包围易错操作
//                            Intent SalaryView = new Intent(LoginDoneActivity.this, SalaryActivity.class);
//                            try {
//                                sleep(100);
//                            } catch (InterruptedException e) {//等待100ms
//                                e.printStackTrace();
//                            }
//                            startActivity(SalaryView);
//                        }catch(Exception e){//如果连接错误，则输出提示
//                            e.printStackTrace();
//                            runOnUiThread(new Runnable() {//在主线程的UI线程来显示连接失败
//                                @Override
//                                public void run() {
//                                    Toast.makeText(LoginDoneActivity.this, "查看失败！", Toast.LENGTH_SHORT).show();
//                                }
//                            });
//
//                        }
//                    }
//                }).start();
//            }
//        });
//
//
//        EmployeeButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                new Thread(new Runnable() {//创建一个新线程
//                    @Override
//                    public void run() {
//                                try {//用try-catch包围易错操作
//                                    Intent EmployeeView = new Intent(LoginDoneActivity.this, EmployeeActivity.class);
//                                    try {
//                                        sleep(100);
//                                    } catch (InterruptedException e) {//等待100ms
//                                        e.printStackTrace();
//                                    }
//                                    startActivity(EmployeeView);
//                                }catch(Exception e){//如果连接错误，则输出提示
//                                    e.printStackTrace();
//                                    runOnUiThread(new Runnable() {//在主线程的UI线程来显示连接失败
//                                        @Override
//                                        public void run() {
//                                            Toast.makeText(LoginDoneActivity.this, "查看失败！", Toast.LENGTH_SHORT).show();
//                                        }
//                                    });
//
//                                }
//                    }
//                }).start();
//            }
//        });

    }

}
