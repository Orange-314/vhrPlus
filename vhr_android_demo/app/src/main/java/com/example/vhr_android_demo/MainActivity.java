package com.example.vhr_android_demo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.frame_login);
        String HTTPSTR = Constants.HTTPSTR;
        getSupportActionBar().hide();

        ImageButton loginBbutton = findViewById(R.id.loginButton);

        Button registButton = findViewById(R.id.registButton);

        registButton.setOnClickListener(new View.OnClickListener() {//注册按钮的监听代码块
            @Override
            public void onClick(View view) {
                new Thread(new Runnable() {//创建一个新线程
                    @Override
                    public void run() {
                        try {//用try-catch包围易错操作
                            Intent regist = new Intent(MainActivity.this, RegistActivity.class);
                            startActivity(regist);
                        }catch(Exception e){//如果连接错误，则输出提示
                            e.printStackTrace();
                            runOnUiThread(new Runnable() {//在主线程的UI线程来显示连接失败
                                @Override
                                public void run() {
                                    Toast.makeText(MainActivity.this, "注册按钮失败！", Toast.LENGTH_SHORT).show();
                                }
                            });

                        }
                    }
                }).start();
            }
        });


        loginBbutton.setOnClickListener(new View.OnClickListener(){//登录按钮监听程序块
            @Override
            public void onClick(View view){
                new Thread(new Runnable() {//创建一个新线程
                    @Override
                    public void run() {
                        try {//用try-catch包围易错操作
                            TextView Username = findViewById(R.id.username);
                            TextView Password = findViewById(R.id.password);
                            String username = Username.getText().toString();
                            String password = Password.getText().toString();
                            String json = "{\n" +
                                    "\t\"username\":\"" + username + "\",\n" +
                                    "\t\"password\":\"" + password + "\"\n" +
                                    "}";//创建json格式的命令

                            OkHttpClient client = new OkHttpClient();//创建http客户端
                            Request request = new Request.Builder()
                                    .url(HTTPSTR+"hr/login2")//在本机运行时的本机IP地址！！
                                    .post(RequestBody.create(MediaType.parse("application/json"),json))
                                    .build();//创建http请求
                            Response response = client.newCall(request).execute();

                            runOnUiThread(new Runnable() {//在主线程的UI线程来显示连接成功
                                @Override
                                public void run() {
                                    String responseData = null;
                                    try {
                                        responseData = response.body().string();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                    if (!responseData.equals("")) {
                                        Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
                                        Intent loginDone = new Intent(MainActivity.this, LoginDoneActivity.class);
                                        startActivity(loginDone);

                                    } else {
                                        Toast.makeText(MainActivity.this, "用户名不存在或密码输入错误", Toast.LENGTH_SHORT).show();

                                    }
                                }
                            });
                        }catch(Exception e){//如果连接错误，则输出提示
                            e.printStackTrace();
                            runOnUiThread(new Runnable() {//在主线程的UI线程来显示连接失败
                                @Override
                                public void run() {
                                    Toast.makeText(MainActivity.this, "网络连接失败！", Toast.LENGTH_SHORT).show();
                                }
                            });

                        }
                    }
                }).start();
            }
        });
    }

}