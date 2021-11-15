package com.example.vhr_android_demo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
        setContentView(R.layout.frame_ass_insert);
        Button SalaryInsertButton = findViewById(R.id.SalaryInsertButton);

        SalaryInsertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try{
                            FormBody.Builder paramsInsertSalary = new FormBody.Builder();

                            TextView SalaryInsertId = findViewById(R.id.SalaryInsertId);
                            TextView SalaryInsertbasicSalary = findViewById(R.id.SalaryInsertbasicSalary);
                            TextView SalaryInsertbonus = findViewById(R.id.SalaryInsertbonus);
                            TextView SalaryInsertlunchSalary = findViewById(R.id.SalaryInsertlunchSalary);
                            TextView SalaryInserttrafficSalary = findViewById(R.id.SalaryInserttrafficSalary);
                            TextView SalaryInsertallSalary = findViewById(R.id.SalaryInsertallSalary);
                            TextView SalaryInsertpensionBase = findViewById(R.id.SalaryInsertpensionBase);
                            TextView SalaryInsertpensionPer= findViewById(R.id.SalaryInsertpensionPer);
                            TextView SalaryInsertmedicalBase = findViewById(R.id.SalaryInsertmedicalBase);
                            TextView SalaryInsertmedicalPer= findViewById(R.id.SalaryInsertmedicalPer);
                            TextView SalaryInsertaccumulationFundBase = findViewById(R.id.SalaryInsertaccumulationFundBase);
                            TextView SalaryInsertaccumulationFundPer = findViewById(R.id.SalaryInsertaccumulationFundPer);
                            TextView SalaryInsertname = findViewById(R.id.SalaryInsertname);

                            String salaryInsertId = SalaryInsertId.getText().toString();
                            String salaryInsertbasicSalary = SalaryInsertbasicSalary.getText().toString();
                            String salaryInsertbonus = SalaryInsertbonus.getText().toString();
                            String salaryInsertlunchSalary = SalaryInsertlunchSalary.getText().toString();
                            String salaryInserttrafficSalary = SalaryInserttrafficSalary.getText().toString();
                            String salaryInsertallSalary = SalaryInsertallSalary.getText().toString();
                            String salaryInsertpensionBase = SalaryInsertpensionBase.getText().toString();
                            String salaryInsertpensionPer = SalaryInsertpensionPer.getText().toString();
                            String salaryInsertmedicalBase = SalaryInsertmedicalBase.getText().toString();
                            String salaryInsertmedicalPer = SalaryInsertmedicalPer.getText().toString();
                            String salaryInsertaccumulationFundBase = SalaryInsertaccumulationFundBase.getText().toString();
                            String salaryInsertaccumulationFundPer = SalaryInsertaccumulationFundPer.getText().toString();
                            String salaryInsertname = SalaryInsertname.getText().toString();

                            paramsInsertSalary.add("id", salaryInsertId);
                            paramsInsertSalary.add("basicSalary", salaryInsertbasicSalary);
                            paramsInsertSalary.add("bonus", salaryInsertbonus);
                            paramsInsertSalary.add("lunchSalary", salaryInsertlunchSalary);
                            paramsInsertSalary.add("trafficSalary", salaryInserttrafficSalary);
                            paramsInsertSalary.add("allSalary", salaryInsertallSalary);
                            paramsInsertSalary.add("pensionBase", salaryInsertpensionBase);
                            paramsInsertSalary.add("pensionPer", salaryInsertpensionPer);
                            paramsInsertSalary.add("medicalBase", salaryInsertmedicalBase);
                            paramsInsertSalary.add("medicalPer", salaryInsertmedicalPer);
                            paramsInsertSalary.add("accumulationFundBase", salaryInsertaccumulationFundBase);
                            paramsInsertSalary.add("accumulationFundPer", salaryInsertaccumulationFundPer);
                            paramsInsertSalary.add("name", salaryInsertname);

                            OkHttpClient clientInsertSalary = new OkHttpClient();//创建http客户端
                            Request requestInsertSalary = new Request.Builder()
                                    .url(HTTPSTR+"salary/insert")//在本机运行时的本机IP地址！！
                                    .post(paramsInsertSalary.build())
                                    .build();//创建http请求
                            Response responseInsertSalary = clientInsertSalary.newCall(requestInsertSalary).execute();
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
