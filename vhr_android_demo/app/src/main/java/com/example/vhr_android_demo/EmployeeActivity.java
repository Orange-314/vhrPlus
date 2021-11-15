package com.example.vhr_android_demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.fragment.app.FragmentActivity;

import org.json.JSONArray;
import org.json.JSONObject;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class EmployeeActivity extends FragmentActivity {
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
                    FormBody.Builder paramsEmployee = new FormBody.Builder();
                    OkHttpClient clientEmployee = new OkHttpClient();//创建http客户端
                    Request requestEmployee = new Request.Builder()
                            .url(HTTPSTR+"employee/findall")//在本机运行时的本机IP地址！！
                            .post(paramsEmployee.build())
                            .build();//创建http请求
                    Response responseEmployee;//发送所创建的请求
                    responseEmployee = clientEmployee.newCall(requestEmployee).execute();

                    String responseDataEmployee = responseEmployee.body().string();//接收返回来的json格式的数据

                    //responseDataEmployee = "["+responseDataEmployee+"]";

                    JSONArray jsonArrayEmployee = new JSONArray(responseDataEmployee);

                    String[] employee = new String[jsonArrayEmployee.length()];
                    String[] employee_information = new String[jsonArrayEmployee.length()];

                    for(int i = 0; i< jsonArrayEmployee.length(); i++){
                        JSONObject jsonObjectEmployee = jsonArrayEmployee.getJSONObject(i);
                        employee[i] = ""+jsonObjectEmployee.getString("name");
                        employee_information[i] =""
                                +"\nID:"+jsonObjectEmployee.getString("id")
                                +"\n姓名:"+jsonObjectEmployee.getString("name")
                                +"\n性别:"+jsonObjectEmployee.getString("gender")
                                +"\n出生日期:"+jsonObjectEmployee.getString("birthday")
                                +"\nID卡号:"+jsonObjectEmployee.getString("idCard")
                                +"\n婚姻状况:"+jsonObjectEmployee.getString("wedlock")
                                +"\n籍贯"+jsonObjectEmployee.getString("nativePlace")
                                +"\n邮箱:"+jsonObjectEmployee.getString("email")
                                +"\n电话:"+jsonObjectEmployee.getString("phone")
                                +"\n地址:"+jsonObjectEmployee.getString("address")
                                +"\n合同类型:"+jsonObjectEmployee.getString("engageForm")
                                +"\n学历:"+jsonObjectEmployee.getString("tiptopDegree")
                                +"\n专业:"+jsonObjectEmployee.getString("specialty")
                                +"\n毕业学校:"+jsonObjectEmployee.getString("school");
                    }//遍历接收到的json数据内容


                    Data.setEmployeeName(employee);
                    Data.setEmployeeDetail(employee_information);//将数据赋值给常量
                }catch(Exception e){//如果连接错误，则输出提示
                    e.printStackTrace();
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        setContentView(R.layout.frame_employee);

                        ImageButton emp_AddButton = findViewById(R.id.emp_AddButton);
                        ImageButton emp_EditButton = findViewById(R.id.emp_EditButton);
                        Button ass_1Button = findViewById(R.id.ass_1);//帐套跳转
                        Button my_1Button = findViewById(R.id.my_1);//我的跳转

                        emp_AddButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                new Thread(new Runnable() {
                                    @Override
                                    public void run() {
                                        Intent change = new Intent(EmployeeActivity.this, EmployeeInsertActivity.class);
                                        startActivity(change);
                                    }
                                }).start();
                            }
                        });
                        emp_EditButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                new Thread(new Runnable() {
                                    @Override
                                    public void run() {
                                        Intent change = new Intent(EmployeeActivity.this, EmployeeUpdateActivity.class);
                                        startActivity(change);
                                    }
                                }).start();
                            }
                        });

                        ass_1Button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                new Thread(new Runnable() {
                                    @Override
                                    public void run() {
                                        Intent change = new Intent(EmployeeActivity.this, SalaryActivity.class);
                                        startActivity(change);
                                    }
                                }).start();
                            }
                        });

                        my_1Button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                new Thread(new Runnable() {
                                    @Override
                                    public void run() {
                                        Intent change = new Intent(EmployeeActivity.this, MyActivity.class);
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
                EmployeeDetailsFragment details = new EmployeeDetailsFragment();
                details.setArguments(getIntent().getExtras());
                getFragmentManager().beginTransaction().add(android.R.id.content,details).commit();
            }
        }
    }
}
