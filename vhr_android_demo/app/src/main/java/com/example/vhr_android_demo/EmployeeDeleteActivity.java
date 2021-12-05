package com.example.vhr_android_demo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class EmployeeDeleteActivity extends AppCompatActivity {
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        String HTTPSTR = Constants.HTTPSTR;
        getSupportActionBar().hide();
        setContentView(R.layout.frame_emp_delete);
        ImageButton EmployeeDeleteButton = findViewById(R.id.employeeDeleleButton);

        EmployeeDeleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @SuppressLint("WrongConstant")
                    @Override
                    public void run() {
                        try{
                            FormBody.Builder paramsDeleteEmployee = new FormBody.Builder();

                            TextView EmployeeDeleteidCard = findViewById(R.id.employeeDeleteIDCard);                //身份证

                            String employeeDeleteidCard = EmployeeDeleteidCard.getText().toString();

                            paramsDeleteEmployee.add("idCard", employeeDeleteidCard);

                            OkHttpClient clientDeleteEmployee = new OkHttpClient();//创建http客户端
                            Request requestDeleteEmployee = new Request.Builder()
                                    .url(HTTPSTR+"employee/delete1")//在本机运行时的本机IP地址！！
                                    .post(paramsDeleteEmployee.build())
                                    .build();//创建http请求
                            Response responseDeleteEmployee = clientDeleteEmployee.newCall(requestDeleteEmployee).execute();
                            String responseDeleteEmployeeData = responseDeleteEmployee.body().string();
                            String responseEmployeeSearchDataSelect = "["+responseDeleteEmployeeData+"]";
                            if(responseDeleteEmployeeData.equals("删除成功1条数据")){
                                Looper.prepare();
                                Toast.makeText(getApplicationContext(), "删除成功1条数据！",1).show();
                                Looper.loop();
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            }
        });
    }
}
