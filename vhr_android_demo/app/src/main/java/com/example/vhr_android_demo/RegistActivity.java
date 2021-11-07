package com.example.vhr_android_demo;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.util.Objects;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
public class RegistActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_register);
        getSupportActionBar().hide();
        ImageButton registButton = findViewById(R.id.registButton);
        String HTTPSTR = Constants.HTTPSTR;

        registButton.setOnClickListener(new View.OnClickListener() {//注册按钮的监听代码块
            @Override
            public void onClick(View view) {
                new Thread(new Runnable() {//创建一个新线程
                    @Override
                    public void run() {
                        try {//用try-catch包围易错操作

                            TextView Username = findViewById(R.id.registUsername);
                            TextView Password = findViewById(R.id.registPassword);
                            String username = Username.getText().toString();
                            String password = Password.getText().toString();

                            FormBody.Builder params = new FormBody.Builder();
                            params.add("username", username);

                            OkHttpClient client = new OkHttpClient();//创建http客户端
                            Request request = new Request.Builder()
                                    .url(HTTPSTR+"hr/login3")//在本机运行时的本机IP地址！！
                                    .post(params.build())
                                    .build();//创建http请求
                            Response response = client.newCall(request).execute();//发送所创建的请求

                            String responseData = response.body().string();//接收返回来的json格式的数据


                            if(responseData.equals("")){
                                try {
                                    FormBody.Builder paramsRegist = new FormBody.Builder();
                                    paramsRegist.add("username", username);
                                    paramsRegist.add("password", password);
                                    OkHttpClient clientRegist = new OkHttpClient();//创建http客户端
                                    Request requestRegist = new Request.Builder()
                                            .url(HTTPSTR+"hr/regist")//在本机运行时的本机IP地址！！
                                            .post(paramsRegist.build())
                                            .build();//创建http请求

                                    Response responseRegist = clientRegist.newCall(requestRegist).execute();//发送所创建的请求
                                    String responseRegistData = responseRegist.body().string();//接收返回来的json格式的数据
                                    Intent registDone = new Intent(RegistActivity.this, MainActivity.class);
                                    startActivity(registDone);

                                    runOnUiThread(new Runnable() {//在主线程的UI线程来显示连接成功
                                        @Override
                                        public void run() {
                                            Toast.makeText(RegistActivity.this, "注册成功！", Toast.LENGTH_SHORT).show();
                                        }
                                    });
                                } catch (IOException e) {
                                    e.printStackTrace();
                                    runOnUiThread(new Runnable() {//在主线程的UI线程来显示连接失败
                                        @Override
                                        public void run() {
                                            Toast.makeText(RegistActivity.this, "创建用户错误！", Toast.LENGTH_SHORT).show();
                                        }
                                    });
                                }
                            }else{
                                runOnUiThread(new Runnable() {//在主线程的UI线程来显示连接失败
                                    @Override
                                    public void run() {
                                        Toast.makeText(RegistActivity.this, "注册失败！该用户名已注册！", Toast.LENGTH_SHORT).show();
                                    }
                                });

                            }

                        }catch(Exception e){//如果连接错误，则输出提示
                            e.printStackTrace();
                            runOnUiThread(new Runnable() {//在主线程的UI线程来显示连接失败
                                @Override
                                public void run() {
                                    Toast.makeText(RegistActivity.this, "网络连接失败！", Toast.LENGTH_SHORT).show();
                                }
                            });
                        }
                    }
                }).start();
            }
        });

    }
}