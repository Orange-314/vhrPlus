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

public class SalaryUpdateActivity extends AppCompatActivity {
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        String HTTPSTR = Constants.HTTPSTR;
        getSupportActionBar().hide();
        setContentView(R.layout.frame_salary_update);
        ImageButton SalaryUpdateButton = findViewById(R.id.SalaryUpdateButton);

        SalaryUpdateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try{
                            FormBody.Builder paramsUpdateSalary = new FormBody.Builder();

                            TextView SalaryUpdateId = findViewById(R.id.SalaryUpdateId);
                            TextView SalaryUpdatebasicSalary = findViewById(R.id.SalaryUpdatebasicSalary);
                            TextView SalaryUpdatebonus = findViewById(R.id.SalaryUpdatebonus);
                            TextView SalaryUpdatelunchSalary = findViewById(R.id.SalaryUpdatelunchSalary);
                            TextView SalaryUpdatetrafficSalary = findViewById(R.id.SalaryUpdatetrafficSalary);
                            TextView SalaryUpdateallSalary = findViewById(R.id.SalaryUpdateallSalary);
                            TextView SalaryUpdatepensionBase = findViewById(R.id.SalaryUpdatepensionBase);
                            TextView SalaryUpdatepensionPer= findViewById(R.id.SalaryUpdatepensionPer);
                            TextView SalaryUpdatemedicalBase = findViewById(R.id.SalaryUpdatemedicalBase);
                            TextView SalaryUpdatemedicalPer= findViewById(R.id.SalaryUpdatemedicalPer);
                            TextView SalaryUpdateaccumulationFundBase = findViewById(R.id.SalaryUpdateaccumulationFundBase);
                            TextView SalaryUpdateaccumulationFundPer = findViewById(R.id.SalaryUpdateaccumulationFundPer);
                            TextView SalaryUpdatename = findViewById(R.id.SalaryUpdatename);

                            String salaryUpdateId = SalaryUpdateId.getText().toString();
                            String salaryUpdatebasicSalary = SalaryUpdatebasicSalary.getText().toString();
                            String salaryUpdatebonus = SalaryUpdatebonus.getText().toString();
                            String salaryUpdatelunchSalary = SalaryUpdatelunchSalary.getText().toString();
                            String salaryUpdatetrafficSalary = SalaryUpdatetrafficSalary.getText().toString();
                            String salaryUpdateallSalary = SalaryUpdateallSalary.getText().toString();
                            String salaryUpdatepensionBase = SalaryUpdatepensionBase.getText().toString();
                            String salaryUpdatepensionPer = SalaryUpdatepensionPer.getText().toString();
                            String salaryUpdatemedicalBase = SalaryUpdatemedicalBase.getText().toString();
                            String salaryUpdatemedicalPer = SalaryUpdatemedicalPer.getText().toString();
                            String salaryUpdateaccumulationFundBase = SalaryUpdateaccumulationFundBase.getText().toString();
                            String salaryUpdateaccumulationFundPer = SalaryUpdateaccumulationFundPer.getText().toString();
                            String salaryUpdatename = SalaryUpdatename.getText().toString();

                            paramsUpdateSalary.add("id", salaryUpdateId);
                            paramsUpdateSalary.add("basicSalary", salaryUpdatebasicSalary);
                            paramsUpdateSalary.add("bonus", salaryUpdatebonus);
                            paramsUpdateSalary.add("lunchSalary", salaryUpdatelunchSalary);
                            paramsUpdateSalary.add("trafficSalary", salaryUpdatetrafficSalary);
                            paramsUpdateSalary.add("allSalary", salaryUpdateallSalary);
                            paramsUpdateSalary.add("pensionBase", salaryUpdatepensionBase);
                            paramsUpdateSalary.add("pensionPer", salaryUpdatepensionPer);
                            paramsUpdateSalary.add("medicalBase", salaryUpdatemedicalBase);
                            paramsUpdateSalary.add("medicalPer", salaryUpdatemedicalPer);
                            paramsUpdateSalary.add("accumulationFundBase", salaryUpdateaccumulationFundBase);
                            paramsUpdateSalary.add("accumulationFundPer", salaryUpdateaccumulationFundPer);
                            paramsUpdateSalary.add("name ", salaryUpdatename);

                            OkHttpClient clientUpdateSalary = new OkHttpClient();//创建http客户端
                            Request requestUpdateSalary = new Request.Builder()
                                    .url(HTTPSTR+"salary/update")//在本机运行时的本机IP地址！！
                                    .post(paramsUpdateSalary.build())
                                    .build();//创建http请求
                            Response responseUpdateSalary = clientUpdateSalary.newCall(requestUpdateSalary).execute();
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(SalaryUpdateActivity.this, "添加成功！", Toast.LENGTH_SHORT).show();//显示登录成功！
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
