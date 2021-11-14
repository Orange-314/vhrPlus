package com.example.vhr_android_demo;

import android.os.Bundle;
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

public class SalaryInsertActivity extends AppCompatActivity {
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        String HTTPSTR = Constants.HTTPSTR;
        getSupportActionBar().hide();
        setContentView(R.layout.test_update);
        ImageButton EmployeeUpdateButton = findViewById(R.id.SalaryUpdateButton);

        EmployeeUpdateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try{
                            FormBody.Builder paramsUpdateEmployee = new FormBody.Builder();

//                            TextView SalaryUpdateId = findViewById(R.id.SalaryUpdateId);
                            TextView SalaryUpdatebasicSalary = findViewById(R.id.SalaryUpdatebasicSalary);
                            TextView SalaryUpdatebonus = findViewById(R.id.SalaryUpdatebonus);
                            TextView SalaryUpdatelunchSalary = findViewById(R.id.SalaryUpdatelunchSalary);
                            TextView SalaryUpdatetrafficSalary = findViewById(R.id.SalaryUpdatetrafficSalary);
                            TextView SalaryUpdateallSalary = findViewById(R.id.SalaryUpdateallSalary);

//                            String salaryUpdateId = SalaryUpdateId.getText().toString();
                            String salaryUpdatebasicSalary = SalaryUpdatebasicSalary.getText().toString();
                            String salaryUpdatebonus = SalaryUpdatebonus.getText().toString();
                            String salaryUpdatelunchSalary = SalaryUpdatelunchSalary.getText().toString();
                            String salaryUpdatetrafficSalary = SalaryUpdatetrafficSalary.getText().toString();
                            String salaryUpdateallSalary = SalaryUpdateallSalary.getText().toString();

//                            paramsUpdateEmployee.add("id", salaryUpdateId);
                            paramsUpdateEmployee.add("basicSalary", salaryUpdatebasicSalary);
                            paramsUpdateEmployee.add("bonus", salaryUpdatebonus);
                            paramsUpdateEmployee.add("lunchSalary", salaryUpdatelunchSalary);
                            paramsUpdateEmployee.add("trafficSalary", salaryUpdatetrafficSalary);
                            paramsUpdateEmployee.add("allSalary", salaryUpdateallSalary);

                            OkHttpClient clientUpdateEmployee = new OkHttpClient();//创建http客户端
                            Request requestUpdateEmployee = new Request.Builder()
                                    .url(HTTPSTR+"salary/insert1")//在本机运行时的本机IP地址！！
                                    .post(paramsUpdateEmployee.build())
                                    .build();//创建http请求
                            Response responseUpdateEmployee = clientUpdateEmployee.newCall(requestUpdateEmployee).execute();
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(SalaryInsertActivity.this, "添加成功！", Toast.LENGTH_SHORT).show();//显示登录成功！
                                }
                            });
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            }
        });
    }
}
