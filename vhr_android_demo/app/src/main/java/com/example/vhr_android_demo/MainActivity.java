package com.example.vhr_android_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState) {

        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                new Thread(new Runnable() {//创建一个新线程
                    @Override
                    public void run() {
                        try {//用try-catch包围易错操作
                            String json = "{\n" +
                                    "\t\"username\":\"admin\",\n" +
                                    "\t\"password\":\"1234\"\n" +
                                    "}";//创建json格式的命令
                            OkHttpClient client = new OkHttpClient();//创建http客户端
                            Request request = new Request.Builder()
                                    .url("http://192.168.1.113:8989/hr/login2")//在本机运行时的本机IP地址！！
                                    .post(RequestBody.create(MediaType.parse("application/json"),json))
                                    .build();//创建http请求
                            try (Response response = client.newCall(request).execute()) {
                            }//发送所创建的请求
                            runOnUiThread(new Runnable() {//在主线程的UI线程来显示连接成功
                                @Override
                                public void run() {
                                    Toast.makeText(MainActivity.this, "发送成功！", Toast.LENGTH_SHORT).show();
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