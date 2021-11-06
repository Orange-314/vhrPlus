package com.example.vhr_android_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState) {

        super.onCreate(saveInstanceState);
        setContentView(R.layout.frame_login);

        ImageButton button = findViewById(R.id.loginButton);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                new Thread(new Runnable() {//创建一个新线程
                    @Override
                    public void run() {
                        try {//用try-catch包围易错操作
                            FormBody.Builder params = new FormBody.Builder();
                            params.add("id", "3");
                            OkHttpClient client = new OkHttpClient();//创建http客户端
                            Request request = new Request.Builder()
                                    .url("http://192.168.1.113:8989/hr/login3")//在本机运行时的本机IP地址！！
                                    .post(params.build())
                                    .build();//创建http请求
                            Response response = client.newCall(request).execute();//发送所创建的请求

                            String responseData = response.body().string();//接收返回来的json格式的数据

                            String json = "[{\"name\":\"张三\",\"code\":\"123\"},{\"name\":\"李四\",\"code\":\"123\"}]";
                            responseData = "["+responseData+"]";

                            JSONArray jsonArray = new JSONArray(responseData);
                            for(int i = 0; i< jsonArray.length(); i++){
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                Log.d("id",""+jsonObject.getString("id"));
                                Log.d("username",""+jsonObject.getString("username"));
                                Log.d("password",""+jsonObject.getString("password"));
                            }//遍历接收到的json数据内容


                            runOnUiThread(new Runnable() {//在主线程的UI线程来显示连接成功
                                @Override
                                public void run() {
                                    Toast.makeText(MainActivity2.this, "发送成功！", Toast.LENGTH_SHORT).show();
                                }
                            });
                        }catch(Exception e){//如果连接错误，则输出提示
                            e.printStackTrace();
                            runOnUiThread(new Runnable() {//在主线程的UI线程来显示连接失败
                                @Override
                                public void run() {
                                    Toast.makeText(MainActivity2.this, "网络连接失败！", Toast.LENGTH_SHORT).show();
                                }
                            });

                        }
                    }
                }).start();
            }
        });
    }
}