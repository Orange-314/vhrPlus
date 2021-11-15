package com.example.vhr_android_demo;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
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

public class EmployeeSelectActivity extends FragmentActivity {
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
            getWindow().setNavigationBarColor(getColor(R.color.fafafa));
        }
        String HTTPSTR = Constants.HTTPSTR;
        setContentView(R.layout.frame_employee_select);
        ImageButton EmployeeSelectButton = findViewById(R.id.EmployeeSelectButton);

        EmployeeSelectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try{
                        TextView EmployeeSelectidCard = findViewById(R.id.EmployeeSelectidCard);
                        String employeeSelectidCard = EmployeeSelectidCard.getText().toString();
                        FormBody.Builder paramsSelectEmployee = new FormBody.Builder();
                        paramsSelectEmployee.add("idCard", employeeSelectidCard);
                        OkHttpClient clientSelectEmployee = new OkHttpClient();//创建http客户端
                        Request requestSelectEmployee = new Request.Builder()
                                .url(HTTPSTR + "employee/select")//在本机运行时的本机IP地址！！
                                .post(paramsSelectEmployee.build())
                                .build();//创建http请求
                        Response responseSelectEmployee = clientSelectEmployee.newCall(requestSelectEmployee).execute();//发送所创建的请求

                        String responseDataSelectEmployee = responseSelectEmployee.body().string();//接收返回来的json格式的数据

                        //responseData = "["+responseData+"]";

                        JSONArray jsonArraySelectEmployee = new JSONArray(responseDataSelectEmployee);
                        for (int i = 0; i < jsonArraySelectEmployee.length(); i++) {
                            JSONObject jsonObjectSelectEmployee = jsonArraySelectEmployee.getJSONObject(i);
                            Data.SELECT_EMPLOYEE[0] = "" + jsonObjectSelectEmployee.getString("name");
                            Data.SELECT_EMPLOYEE[1] = "" + jsonObjectSelectEmployee.getString("gender");
                            Data.SELECT_EMPLOYEE[2] = "" + jsonObjectSelectEmployee.getString("birthday");
                            Data.SELECT_EMPLOYEE[3] = "" + jsonObjectSelectEmployee.getString("idCard");
                            Data.SELECT_EMPLOYEE[4] = "" + jsonObjectSelectEmployee.getString("wedlock");
                            Data.SELECT_EMPLOYEE[5] = "" + jsonObjectSelectEmployee.getString("nationId");
                            Data.SELECT_EMPLOYEE[6] = "" + jsonObjectSelectEmployee.getString("nativePlace");
                            Data.SELECT_EMPLOYEE[7] = "" + jsonObjectSelectEmployee.getString("politicId");
                            Data.SELECT_EMPLOYEE[8] = "" + jsonObjectSelectEmployee.getString("email");
                            Data.SELECT_EMPLOYEE[9] = "" + jsonObjectSelectEmployee.getString("phone");
                            Data.SELECT_EMPLOYEE[10] = "" + jsonObjectSelectEmployee.getString("address");
                            Data.SELECT_EMPLOYEE[11] = "" + jsonObjectSelectEmployee.getString("departmentId");
                            Data.SELECT_EMPLOYEE[12] = "" + jsonObjectSelectEmployee.getString("jobLevelId");
                            Data.SELECT_EMPLOYEE[13] = "" + jsonObjectSelectEmployee.getString("posId");
                            Data.SELECT_EMPLOYEE[14] = "" + jsonObjectSelectEmployee.getString("engageForm");
                            Data.SELECT_EMPLOYEE[15] = "" + jsonObjectSelectEmployee.getString("tiptopDegree");
                            Data.SELECT_EMPLOYEE[16] = "" + jsonObjectSelectEmployee.getString("specialty");
                            Data.SELECT_EMPLOYEE[17] = "" + jsonObjectSelectEmployee.getString("school");
                            Data.SELECT_EMPLOYEE[18] = "" + jsonObjectSelectEmployee.getString("beginDate");
                            Data.SELECT_EMPLOYEE[19] = "" + jsonObjectSelectEmployee.getString("contractTerm");
                            Data.SELECT_EMPLOYEE[20] = "" + jsonObjectSelectEmployee.getString("conversionTime");
                            Data.SELECT_EMPLOYEE[21] = "" + jsonObjectSelectEmployee.getString("beginContract");
                            Data.SELECT_EMPLOYEE[22] = "" + jsonObjectSelectEmployee.getString("endContract");
                        }

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Intent change = new Intent(EmployeeSelectActivity.this, EmployeeUpdateActivity.class);
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
