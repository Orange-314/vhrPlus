package com.example.vhr_android_demo;

import android.content.Intent;
import android.os.Bundle;
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

public class SalarySearchActivity extends AppCompatActivity {
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        String HTTPSTR = Constants.HTTPSTR;
        getSupportActionBar().hide();
        setContentView(R.layout.frame_ass_search);
        ImageButton SalarySearchButton = findViewById(R.id.salarySearchButton);

        SalarySearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try{
                            FormBody.Builder paramsSearchSalary = new FormBody.Builder();

                            TextView SalarySearchidCard = findViewById(R.id.salarySearchIDCard);                //身份证

                            String salarySearchidCard = SalarySearchidCard.getText().toString();

                            paramsSearchSalary.add("id", salarySearchidCard);

                            OkHttpClient clientSearchSalary = new OkHttpClient();//创建http客户端
                            Request requestSearchSalary = new Request.Builder()
                                    .url(HTTPSTR+"salary/select")//在本机运行时的本机IP地址！！
                                    .post(paramsSearchSalary.build())
                                    .build();//创建http请求
                            Response responseSearchSalary = clientSearchSalary.newCall(requestSearchSalary).execute();
                            String responseSearchSalaryData = responseSearchSalary.body().string();
                            String responseSalarySearchDataSelect = "["+responseSearchSalaryData+"]";

                            try {
                                JSONArray jsonArray_assSearch = new JSONArray(responseSalarySearchDataSelect);
                                String[] hrStrN_assSearch = new String[jsonArray_assSearch.length()];
                                String[] hrStrI_assSearch = new String[jsonArray_assSearch.length()];
                                for (int i = 0; i < jsonArray_assSearch.length(); i++) {
                                    JSONObject jsonObject_assSearch = jsonArray_assSearch.getJSONObject(i);
                                    hrStrN_assSearch[i] = "" + jsonObject_assSearch.getString("name");
                                    hrStrI_assSearch[i] =""
                                            +"\nID:"+jsonObject_assSearch.getString("id")
                                            +"\n基本工资:"+jsonObject_assSearch.getString("basicSalary")
                                            +"\n奖   金:"+jsonObject_assSearch.getString("bonus")
                                            +"\n午餐补助:"+jsonObject_assSearch.getString("lunchSalary")
                                            +"\n交通补助:"+jsonObject_assSearch.getString("trafficSalary")
                                            +"\n应发工资:"+jsonObject_assSearch.getString("allSalary")
                                            +"\n养老金基数:"+jsonObject_assSearch.getString("pensionBase")
                                            +"\n养老金比率"+jsonObject_assSearch.getString("pensionPer")
                                            +"\n启动时间:"+jsonObject_assSearch.getString("createDate")
                                            +"\n医疗基数:"+jsonObject_assSearch.getString("medicalBase")
                                            +"\n医疗保险比率:"+jsonObject_assSearch.getString("medicalPer")
                                            +"\n公积金基数:"+jsonObject_assSearch.getString("accumulationFundBase")
                                            +"\n公积金比率:"+jsonObject_assSearch.getString("accumulationFundPer");
                                }
                                Data.setSalarySearchdetail(null);
                                Data.setSalarySearchdetail(hrStrI_assSearch);


                            } catch (JSONException e) {
                                e.printStackTrace();
                                runOnUiThread(new Runnable() {//在主线程的UI线程来显示连接失败
                                    @Override
                                    public void run() {
                                        Toast.makeText(SalarySearchActivity.this, "查无此帐套！", Toast.LENGTH_SHORT).show();
                                    }
                                });
                            }


                        } catch (IOException e) {
                            e.printStackTrace();
                            runOnUiThread(new Runnable() {//在主线程的UI线程来显示连接失败
                                @Override
                                public void run() {
                                    Toast.makeText(SalarySearchActivity.this, "查无此帐套！", Toast.LENGTH_SHORT).show();
                                }
                            });
                        }
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                TextView tv = findViewById(R.id.salary_Search_Result);//获取textview组件
                                String cn = Data.getSalarySearchdetail()[0];//获取edittext中填写的内容
                                tv.setText(cn);//在textview中显示
                                Intent change = new Intent(SalarySearchActivity.this, SalarySearchActivity.class);
                                //startActivity(change);
                            }
                        });

                    }
                }).start();
            }
        });
    }
}
