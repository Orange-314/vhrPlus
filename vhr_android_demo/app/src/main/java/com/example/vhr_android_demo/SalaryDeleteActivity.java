package com.example.vhr_android_demo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class SalaryDeleteActivity extends AppCompatActivity {
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        String HTTPSTR = Constants.HTTPSTR;
        getSupportActionBar().hide();
        setContentView(R.layout.frame_ass_delete);
        ImageButton SalaryDeleteButton = findViewById(R.id.salaryDeleteButton);

        SalaryDeleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @SuppressLint("WrongConstant")
                    @Override
                    public void run() {
                        try{
                            FormBody.Builder paramsDeleteSalary = new FormBody.Builder();

                            TextView SalaryDeleteidCard = findViewById(R.id.salaryDeleteid);                //身份证

                            String salaryDeleteidCard = SalaryDeleteidCard.getText().toString();

                            paramsDeleteSalary.add("id", salaryDeleteidCard);

                            OkHttpClient clientDeleteSalary = new OkHttpClient();//创建http客户端
                            Request requestDeleteSalary = new Request.Builder()
                                    .url(HTTPSTR+"salary/delete")//在本机运行时的本机IP地址！！
                                    .post(paramsDeleteSalary.build())
                                    .build();//创建http请求
                            Response responseDeleteSalary = clientDeleteSalary.newCall(requestDeleteSalary).execute();
                            String responseDeleteSalaryData = responseDeleteSalary.body().string();
                            String responseSalarySearchDataSelect = "["+responseDeleteSalaryData+"]";
                            if(responseDeleteSalaryData.equals("成功删除1条数据")){
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
