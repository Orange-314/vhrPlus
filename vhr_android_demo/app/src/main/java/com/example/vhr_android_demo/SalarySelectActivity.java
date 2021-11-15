package com.example.vhr_android_demo;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;

import org.json.JSONArray;
import org.json.JSONObject;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class SalarySelectActivity extends FragmentActivity {
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
            getWindow().setNavigationBarColor(getColor(R.color.fafafa));
        }
        String HTTPSTR = Constants.HTTPSTR;
        setContentView(R.layout.frame_salary_select);
        ImageButton SalarySelectButton = findViewById(R.id.SalarySelectButton);

        SalarySelectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try{
                            TextView SalarySelectidCard = findViewById(R.id.SalarySelectidCard);
                            String salarySelectidCard = SalarySelectidCard.getText().toString();
                            FormBody.Builder paramsSelectSalary = new FormBody.Builder();
                            paramsSelectSalary.add("id", salarySelectidCard);
                            OkHttpClient clientSelectSalary = new OkHttpClient();//创建http客户端
                            Request requestSelectSalary = new Request.Builder()
                                    .url(HTTPSTR + "salary/select")//在本机运行时的本机IP地址！！
                                    .post(paramsSelectSalary.build())
                                    .build();//创建http请求
                            Response responseSelectSalary = clientSelectSalary.newCall(requestSelectSalary).execute();//发送所创建的请求

                            String responseDataSelectSalary = responseSelectSalary.body().string();//接收返回来的json格式的数据

                            //responseData = "["+responseData+"]";

                            JSONArray jsonArraySelectSalary = new JSONArray(responseDataSelectSalary);
                            for (int i = 0; i < jsonArraySelectSalary.length(); i++) {
                                JSONObject jsonObjectSelectSalary = jsonArraySelectSalary.getJSONObject(i);
                                Data.SELECT_EMPLOYEE[0] = "" + jsonObjectSelectSalary.getString("name");
                                Data.SELECT_EMPLOYEE[1] = "" + jsonObjectSelectSalary.getString("gender");
                                Data.SELECT_EMPLOYEE[2] = "" + jsonObjectSelectSalary.getString("birthday");
                                Data.SELECT_EMPLOYEE[3] = "" + jsonObjectSelectSalary.getString("idCard");
                                Data.SELECT_EMPLOYEE[4] = "" + jsonObjectSelectSalary.getString("wedlock");
                                Data.SELECT_EMPLOYEE[5] = "" + jsonObjectSelectSalary.getString("nationId");
                                Data.SELECT_EMPLOYEE[6] = "" + jsonObjectSelectSalary.getString("nativePlace");
                                Data.SELECT_EMPLOYEE[7] = "" + jsonObjectSelectSalary.getString("politicId");
                                Data.SELECT_EMPLOYEE[8] = "" + jsonObjectSelectSalary.getString("email");
                                Data.SELECT_EMPLOYEE[9] = "" + jsonObjectSelectSalary.getString("phone");
                                Data.SELECT_EMPLOYEE[10] = "" + jsonObjectSelectSalary.getString("address");
                                Data.SELECT_EMPLOYEE[11] = "" + jsonObjectSelectSalary.getString("departmentId");
                                Data.SELECT_EMPLOYEE[12] = "" + jsonObjectSelectSalary.getString("jobLevelId");
                                Data.SELECT_EMPLOYEE[13] = "" + jsonObjectSelectSalary.getString("posId");
                                Data.SELECT_EMPLOYEE[14] = "" + jsonObjectSelectSalary.getString("engageForm");
                                Data.SELECT_EMPLOYEE[15] = "" + jsonObjectSelectSalary.getString("tiptopDegree");
                                Data.SELECT_EMPLOYEE[16] = "" + jsonObjectSelectSalary.getString("specialty");
                                Data.SELECT_EMPLOYEE[17] = "" + jsonObjectSelectSalary.getString("school");
                                Data.SELECT_EMPLOYEE[18] = "" + jsonObjectSelectSalary.getString("beginDate");
                                Data.SELECT_EMPLOYEE[19] = "" + jsonObjectSelectSalary.getString("contractTerm");
                                Data.SELECT_EMPLOYEE[20] = "" + jsonObjectSelectSalary.getString("conversionTime");
                                Data.SELECT_EMPLOYEE[21] = "" + jsonObjectSelectSalary.getString("beginContract");
                                Data.SELECT_EMPLOYEE[22] = "" + jsonObjectSelectSalary.getString("endContract");
                            }

                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Intent change = new Intent(SalarySelectActivity.this, SalaryUpdateActivity.class);
                                    startActivity(change);
                                }
                            });

                        }catch(Exception e){
                            e.printStackTrace();
                        }


                    }
                }).start();
            }
        });



    }
}
