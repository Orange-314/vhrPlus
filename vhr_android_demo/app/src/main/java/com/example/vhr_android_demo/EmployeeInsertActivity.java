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

public class EmployeeInsertActivity extends AppCompatActivity {
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        String HTTPSTR = Constants.HTTPSTR;
        getSupportActionBar().hide();
        setContentView(R.layout.frame_employee_insert);
        ImageButton EmployeeInsertButton = findViewById(R.id.EmployeeInsertButton);

        EmployeeInsertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try{
                            FormBody.Builder paramsInsertEmployee = new FormBody.Builder();

                            TextView EmployeeInsertname = findViewById(R.id.EmployeeInsertname);                    //员工姓名
                            TextView EmployeeInsertgender = findViewById(R.id.EmployeeInsertgender);                //性别
                            TextView EmployeeInsertbirthday = findViewById(R.id.EmployeeInsertbirthday);            //出生日期
                            TextView EmployeeInsertidCard = findViewById(R.id.EmployeeInsertidCard);                //身份证号
                            TextView EmployeeInsertwedlock = findViewById(R.id.EmployeeInsertwedlock);              //婚姻状况
                            TextView EmployeeInsertnationId = findViewById(R.id.EmployeeInsertnationId);            //民族
                            TextView EmployeeInsertnativePlace = findViewById(R.id.EmployeeInsertnativePlace);      //籍贯
                            TextView EmployeeInsertpoliticId = findViewById(R.id.EmployeeInsertpoliticId);          //政治面貌
                            TextView EmployeeInsertemail = findViewById(R.id.EmployeeInsertemail);                  //邮箱
                            TextView EmployeeInsertphone = findViewById(R.id.EmployeeInsertphone);                  //电话号码
                            TextView EmployeeInsertaddress = findViewById(R.id.EmployeeInsertaddress);              //联系地址
                            TextView EmployeeInsertdepartmentId = findViewById(R.id.EmployeeInsertdepartmentId);    //所属部门
                            TextView EmployeeInsertjobLevelId = findViewById(R.id.EmployeeInsertjobLevelId);        //职称ID
                            TextView EmployeeInsertposId = findViewById(R.id.EmployeeInsertposId);                  //职位ID
                            TextView EmployeeInsertengageForm = findViewById(R.id.EmployeeInsertengageForm);        //聘用形式
                            TextView EmployeeInserttiptopDegree = findViewById(R.id.EmployeeInserttiptopDegree);    //最高学历
                            TextView EmployeeInsertspecialty = findViewById(R.id.EmployeeInsertspecialty);          //所属专业
                            TextView EmployeeInsertschool = findViewById(R.id.EmployeeInsertschool);                //毕业院校
                            TextView EmployeeInsertbeginDate = findViewById(R.id.EmployeeInsertbeginDate);          //入职日期
                            TextView EmployeeInsertcontractTerm = findViewById(R.id.EmployeeInsertcontractTerm);    //合同期限
                            TextView EmployeeInsertconversionTime = findViewById(R.id.EmployeeInsertconversionTime);//转正日期
                            TextView EmployeeInsertbeginContract = findViewById(R.id.EmployeeInsertbeginContract);  //合同起始日期
                            TextView EmployeeInsertendContract = findViewById(R.id.EmployeeInsertendContract);      //合同终止日期

                            String employeeInsertname = EmployeeInsertname.getText().toString();
                            String employeeInsertgender = EmployeeInsertgender.getText().toString();
                            String employeeInsertbirthday = EmployeeInsertbirthday.getText().toString();
                            String employeeInsertidCard = EmployeeInsertidCard.getText().toString();
                            String employeeInsertwedlock = EmployeeInsertwedlock.getText().toString();
                            String employeeInsertnationId = EmployeeInsertnationId.getText().toString();
                            String employeeInsertnativePlace = EmployeeInsertnativePlace.getText().toString();
                            String employeeInsertpoliticId = EmployeeInsertpoliticId.getText().toString();
                            String employeeInsertemail = EmployeeInsertemail.getText().toString();
                            String employeeInsertphone = EmployeeInsertphone.getText().toString();
                            String employeeInsertaddress = EmployeeInsertaddress.getText().toString();
                            String employeeInsertdepartmentId = EmployeeInsertdepartmentId.getText().toString();
                            String employeeInsertjobLevelId = EmployeeInsertjobLevelId.getText().toString();
                            String employeeInsertposId = EmployeeInsertposId.getText().toString();
                            String employeeInsertengageForm = EmployeeInsertengageForm.getText().toString();
                            String employeeInserttiptopDegree = EmployeeInserttiptopDegree.getText().toString();
                            String employeeInsertspecialty = EmployeeInsertspecialty.getText().toString();
                            String employeeInsertschool = EmployeeInsertschool.getText().toString();
                            String employeeInsertbeginDate = EmployeeInsertbeginDate.getText().toString();
                            String employeeInsertcontractTerm = EmployeeInsertcontractTerm.getText().toString();
                            String employeeInsertconversionTime = EmployeeInsertconversionTime.getText().toString();
                            String employeeInsertbeginContract = EmployeeInsertbeginContract.getText().toString();
                            String employeeInsertendContract = EmployeeInsertendContract.getText().toString();

                            paramsInsertEmployee.add("name", employeeInsertname);
                            paramsInsertEmployee.add("gender", employeeInsertgender);
                            paramsInsertEmployee.add("birthday", employeeInsertbirthday);
                            paramsInsertEmployee.add("idCard", employeeInsertidCard);
                            paramsInsertEmployee.add("wedlock", employeeInsertwedlock);
                            paramsInsertEmployee.add("nationId", employeeInsertnationId);
                            paramsInsertEmployee.add("nativePlace", employeeInsertnativePlace);
                            paramsInsertEmployee.add("politicId", employeeInsertpoliticId);
                            paramsInsertEmployee.add("email", employeeInsertemail);
                            paramsInsertEmployee.add("phone", employeeInsertphone);
                            paramsInsertEmployee.add("address", employeeInsertaddress);
                            paramsInsertEmployee.add("departmentId", employeeInsertdepartmentId);
                            paramsInsertEmployee.add("jobLevelId", employeeInsertjobLevelId);
                            paramsInsertEmployee.add("posId", employeeInsertposId);
                            paramsInsertEmployee.add("engageForm", employeeInsertengageForm);
                            paramsInsertEmployee.add("tiptopDegree", employeeInserttiptopDegree);
                            paramsInsertEmployee.add("specialty", employeeInsertspecialty);
                            paramsInsertEmployee.add("school", employeeInsertschool);
                            paramsInsertEmployee.add("beginDate", employeeInsertbeginDate);
                            paramsInsertEmployee.add("contractTerm", employeeInsertcontractTerm);
                            paramsInsertEmployee.add("conversionTime", employeeInsertconversionTime);
                            paramsInsertEmployee.add("beginContract", employeeInsertbeginContract);
                            paramsInsertEmployee.add("endContract", employeeInsertendContract);

                            OkHttpClient clientInsertEmployee = new OkHttpClient();//创建http客户端
                            Request requestInsertEmployee = new Request.Builder()
                                    .url(HTTPSTR+"salary/insert1")//在本机运行时的本机IP地址！！
                                    .post(paramsInsertEmployee.build())
                                    .build();//创建http请求
                            Response responseInsertEmployee = clientInsertEmployee.newCall(requestInsertEmployee).execute();
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(EmployeeInsertActivity.this, "添加成功！", Toast.LENGTH_SHORT).show();//显示登录成功！
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
