package com.example.vhr_android_demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import androidx.fragment.app.FragmentActivity;

import org.json.JSONArray;
import org.json.JSONObject;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class SalaryActivity extends FragmentActivity {
    String HTTPSTR = Constants.HTTPSTR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().getDecorView().setSystemUiVisibility( View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN|View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
            getWindow().setNavigationBarColor(getColor(R.color.fafafa));
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {//用try-catch包围易错操作
                    FormBody.Builder paramsSalary = new FormBody.Builder();
                    OkHttpClient clientSalary = new OkHttpClient();//创建http客户端
                    Request requestSalary = new Request.Builder()
                            .url(HTTPSTR+"salary/findall")//在本机运行时的本机IP地址！！
                            .post(paramsSalary.build())
                            .build();//创建http请求
                    Response responseSalary;//发送所创建的请求
                    responseSalary = clientSalary.newCall(requestSalary).execute();

                    String responseDataSalary = responseSalary.body().string();//接收返回来的json格式的数据
                    JSONArray jsonArraySalary = new JSONArray(responseDataSalary);

                    String[] salary = new String[jsonArraySalary.length()];
                    String[] salary_information = new String[jsonArraySalary.length()];

                    for(int i = 0; i< jsonArraySalary.length(); i++){
                        JSONObject jsonObjectSalary = jsonArraySalary.getJSONObject(i);
                        salary[i] = ""+jsonObjectSalary.getString("name");
                        salary_information[i] =""
                                +"\nID:"+jsonObjectSalary.getString("id")
                                +"\n基本工资:"+jsonObjectSalary.getString("basicSalary")
                                +"\n奖   金:"+jsonObjectSalary.getString("bonus")
                                +"\n午餐补助:"+jsonObjectSalary.getString("lunchSalary")
                                +"\n交通补助:"+jsonObjectSalary.getString("trafficSalary")
                                +"\n应发工资:"+jsonObjectSalary.getString("allSalary")
                                +"\n养老金基数:"+jsonObjectSalary.getString("pensionBase")
                                +"\n养老金比率"+jsonObjectSalary.getString("pensionPer")
                                +"\n启动时间:"+jsonObjectSalary.getString("createDate")
                                +"\n医疗基数:"+jsonObjectSalary.getString("medicalBase")
                                +"\n医疗保险比率:"+jsonObjectSalary.getString("medicalPer")
                                +"\n公积金基数:"+jsonObjectSalary.getString("accumulationFundBase")
                                +"\n公积金比率:"+jsonObjectSalary.getString("accumulationFundPer");
                    }//遍历接收到的json数据内容

                    Data.setSalaryName(salary);
                    Data.setSalaryDetail(salary_information);//将数据赋值给常量
                }catch(Exception e){//如果连接错误，则输出提示
                    e.printStackTrace();
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        setContentView(R.layout.frame_salary);


                        Button emp_2Button = findViewById(R.id.emp_2);//帐套跳转
                        Button my_2Button = findViewById(R.id.my_2);//我的跳转

                        emp_2Button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                new Thread(new Runnable() {
                                    @Override
                                    public void run() {
                                        Intent change = new Intent(SalaryActivity.this, EmployeeActivity.class);
                                        startActivity(change);
                                    }
                                }).start();
                            }
                        });

                        my_2Button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                new Thread(new Runnable() {
                                    @Override
                                    public void run() {
                                        Intent change = new Intent(SalaryActivity.this, MyActivity.class);
                                        startActivity(change);
                                    }
                                }).start();
                            }
                        });

                    }

                });
            }
        }).start();
    }


    public static class DetailsActivity extends Activity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            if (savedInstanceState == null) {
                //初始化，添加显示详细内容的Fragment
                SalaryDetailsFragment details = new SalaryDetailsFragment();
                details.setArguments(getIntent().getExtras());
                getFragmentManager().beginTransaction().add(android.R.id.content,details).commit();
            }
        }
    }
}
