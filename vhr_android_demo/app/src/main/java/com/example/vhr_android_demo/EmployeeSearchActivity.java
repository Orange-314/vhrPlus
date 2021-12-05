package com.example.vhr_android_demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

public class EmployeeSearchActivity extends AppCompatActivity {
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        String HTTPSTR = Constants.HTTPSTR;
        getSupportActionBar().hide();
        setContentView(R.layout.frame_emp_search);
        ImageButton EmployeeSearchButton = findViewById(R.id.employeeSearchButton);

        EmployeeSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try{
                            FormBody.Builder paramsSearchEmployee = new FormBody.Builder();

                            TextView EmployeeSearchidCard = findViewById(R.id.employeeSearchIDCard);                //身份证

                            String employeeSearchidCard = EmployeeSearchidCard.getText().toString();

                            paramsSearchEmployee.add("idCard", employeeSearchidCard);

                            OkHttpClient clientSearchEmployee = new OkHttpClient();//创建http客户端
                            Request requestSearchEmployee = new Request.Builder()
                                    .url(HTTPSTR+"employee/select")//在本机运行时的本机IP地址！！
                                    .post(paramsSearchEmployee.build())
                                    .build();//创建http请求
                            Response responseSearchEmployee = clientSearchEmployee.newCall(requestSearchEmployee).execute();
                            String responseSearchEmployeeData = responseSearchEmployee.body().string();
                            String responseEmployeeSearchDataSelect = "["+responseSearchEmployeeData+"]";

                            try {
                                JSONArray jsonArray_empSearch = new JSONArray(responseEmployeeSearchDataSelect);
                                String[] hrStrN_empSearch = new String[jsonArray_empSearch.length()];
                                String[] hrStrI_empSearch = new String[jsonArray_empSearch.length()];
                                for (int i = 0; i < jsonArray_empSearch.length(); i++) {
                                    JSONObject jsonObject_empSearch = jsonArray_empSearch.getJSONObject(i);
                                    hrStrN_empSearch[i] = "" + jsonObject_empSearch.getString("name");
                                    hrStrI_empSearch[i] =""
                                            +"\nID:"+jsonObject_empSearch.getString("id")
                                            +"\n姓名:"+jsonObject_empSearch.getString("name")
                                            +"\n性别:"+jsonObject_empSearch.getString("gender")
                                            +"\n出生日期:"+jsonObject_empSearch.getString("birthday")
                                            +"\nID卡号:"+jsonObject_empSearch.getString("idCard")
                                            +"\n婚姻状况:"+jsonObject_empSearch.getString("wedlock")
                                            +"\n籍贯"+jsonObject_empSearch.getString("nativePlace")
                                            +"\n邮箱:"+jsonObject_empSearch.getString("email")
                                            +"\n电话:"+jsonObject_empSearch.getString("phone")
                                            +"\n地址:"+jsonObject_empSearch.getString("address")
                                            +"\n合同类型:"+jsonObject_empSearch.getString("engageForm")
                                            +"\n学历:"+jsonObject_empSearch.getString("tiptopDegree")
                                            +"\n专业:"+jsonObject_empSearch.getString("specialty")
                                            +"\n毕业学校:"+jsonObject_empSearch.getString("school");
                                }
                                Data.setEmployeeSearchdetail(null);
                                Data.setEmployeeSearchdetail(hrStrI_empSearch);
                                Intent change = new Intent(EmployeeSearchActivity.this, EmployeeSearchDoneActivity.class);
                            } catch (JSONException e) {
                                e.printStackTrace();
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
