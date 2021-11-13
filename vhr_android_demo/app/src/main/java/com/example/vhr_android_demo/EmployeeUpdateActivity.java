package com.example.vhr_android_demo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.io.IOException;

import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class EmployeeUpdateActivity extends AppCompatActivity {
//    protected void onCreate(Bundle saveInstanceState) {
//        super.onCreate(saveInstanceState);
//        String HTTPSTR = Constants.HTTPSTR;
//        getSupportActionBar().hide();
//        setContentView(R.layout.test_update);
//        Button EmployeeUpdateButton = findViewById(R.id.EmployeeUpdateButton);
//
//        EmployeeUpdateButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//                        try{
//                            FormBody.Builder paramsUpdateEmployee = new FormBody.Builder();
//
//                            TextView EmployeeID = findViewById(R.id.EmployeeUpdateId);
//                            TextView EmployeeName = findViewById(R.id.EmployeeUpdateName);
//                            TextView EmployeeGender = findViewById(R.id.EmployeeUpdateGender);
//                            TextView EmployeeIDCard = findViewById(R.id.EmployeeUpdateIDCard);
//                            TextView EmployeeBirthday = findViewById(R.id.EmployeeUpdateBirthday);
//
//                            String employeeID = EmployeeID.getText().toString();
//                            String employeeName = EmployeeName.getText().toString();
//                            String employeeGender = EmployeeGender.getText().toString();
//                            String employeeIDCard = EmployeeIDCard.getText().toString();
//                            String employeeBirthday = EmployeeBirthday.getText().toString();
//
//                            paramsUpdateEmployee.add("id", employeeID);
//                            paramsUpdateEmployee.add("name", employeeName);
//                            paramsUpdateEmployee.add("gender", employeeGender);
//                            paramsUpdateEmployee.add("IDCard", employeeIDCard);
//                            paramsUpdateEmployee.add("birthday", employeeBirthday);
//
//                            OkHttpClient clientUpdateEmployee = new OkHttpClient();//创建http客户端
//                            Request requestUpdateEmployee = new Request.Builder()
//                                    .url(HTTPSTR+"hr/login2")//在本机运行时的本机IP地址！！
//                                    .post(paramsUpdateEmployee.build())
//                                    .build();//创建http请求
//                            Response responseUpdateEmployee = clientUpdateEmployee.newCall(requestUpdateEmployee).execute();
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                })
//            }
//        });
//    }
}
