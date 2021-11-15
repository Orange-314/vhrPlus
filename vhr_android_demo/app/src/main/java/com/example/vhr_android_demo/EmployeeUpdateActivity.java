package com.example.vhr_android_demo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

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
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        String HTTPSTR = Constants.HTTPSTR;
        getSupportActionBar().hide();
        setContentView(R.layout.frame_employee_update);
        ImageButton EmployeeUpdateButton = findViewById(R.id.EmployeeUpdateButton);

        EmployeeUpdateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try{
                            FormBody.Builder paramsUpdateEmployee = new FormBody.Builder();

                            TextView EmployeeUpdatename = findViewById(R.id.EmployeeUpdatename);                    //员工姓名
                            TextView EmployeeUpdategender = findViewById(R.id.EmployeeUpdategender);                //性别
                            TextView EmployeeUpdatebirthday = findViewById(R.id.EmployeeUpdatebirthday);            //出生日期
                            TextView EmployeeUpdateidCard = findViewById(R.id.EmployeeUpdateidCard);                //身份证号
                            TextView EmployeeUpdatewedlock = findViewById(R.id.EmployeeUpdatewedlock);              //婚姻状况
                            TextView EmployeeUpdatenationId = findViewById(R.id.EmployeeUpdatenationId);            //民族
                            TextView EmployeeUpdatenativePlace = findViewById(R.id.EmployeeUpdatenativePlace);      //籍贯
                            TextView EmployeeUpdatepoliticId = findViewById(R.id.EmployeeUpdatepoliticId);          //政治面貌
                            TextView EmployeeUpdateemail = findViewById(R.id.EmployeeUpdateemail);                  //邮箱
                            TextView EmployeeUpdatephone = findViewById(R.id.EmployeeUpdatephone);                  //电话号码
                            TextView EmployeeUpdateaddress = findViewById(R.id.EmployeeUpdateaddress);              //联系地址
                            TextView EmployeeUpdatedepartmentId = findViewById(R.id.EmployeeUpdatedepartmentId);    //所属部门
                            TextView EmployeeUpdatejobLevelId = findViewById(R.id.EmployeeUpdatejobLevelId);        //职称ID
                            TextView EmployeeUpdateposId = findViewById(R.id.EmployeeUpdateposId);                  //职位ID
                            TextView EmployeeUpdateengageForm = findViewById(R.id.EmployeeUpdateengageForm);        //聘用形式
                            TextView EmployeeUpdatetiptopDegree = findViewById(R.id.EmployeeUpdatetiptopDegree);    //最高学历
                            TextView EmployeeUpdatespecialty = findViewById(R.id.EmployeeUpdatespecialty);          //所属专业
                            TextView EmployeeUpdateschool = findViewById(R.id.EmployeeUpdateschool);                //毕业院校
                            TextView EmployeeUpdatebeginDate = findViewById(R.id.EmployeeUpdatebeginDate);          //入职日期
                            TextView EmployeeUpdatecontractTerm = findViewById(R.id.EmployeeUpdatecontractTerm);    //合同期限
                            TextView EmployeeUpdateconversionTime = findViewById(R.id.EmployeeUpdateconversionTime);//转正日期
                            TextView EmployeeUpdatebeginContract = findViewById(R.id.EmployeeUpdatebeginContract);  //合同起始日期
                            TextView EmployeeUpdateendContract = findViewById(R.id.EmployeeUpdateendContract);      //合同终止日期

                            String employeeUpdatename = EmployeeUpdatename.getText().toString();
                            String employeeUpdategender = EmployeeUpdategender.getText().toString();
                            String employeeUpdatebirthday = EmployeeUpdatebirthday.getText().toString();
                            String employeeUpdateidCard = EmployeeUpdateidCard.getText().toString();
                            String employeeUpdatewedlock = EmployeeUpdatewedlock.getText().toString();
                            String employeeUpdatenationId = EmployeeUpdatenationId.getText().toString();
                            String employeeUpdatenativePlace = EmployeeUpdatenativePlace.getText().toString();
                            String employeeUpdatepoliticId = EmployeeUpdatepoliticId.getText().toString();
                            String employeeUpdateemail = EmployeeUpdateemail.getText().toString();
                            String employeeUpdatephone = EmployeeUpdatephone.getText().toString();
                            String employeeUpdateaddress = EmployeeUpdateaddress.getText().toString();
                            String employeeUpdatedepartmentId = EmployeeUpdatedepartmentId.getText().toString();
                            String employeeUpdatejobLevelId = EmployeeUpdatejobLevelId.getText().toString();
                            String employeeUpdateposId = EmployeeUpdateposId.getText().toString();
                            String employeeUpdateengageForm = EmployeeUpdateengageForm.getText().toString();
                            String employeeUpdatetiptopDegree = EmployeeUpdatetiptopDegree.getText().toString();
                            String employeeUpdatespecialty = EmployeeUpdatespecialty.getText().toString();
                            String employeeUpdateschool = EmployeeUpdateschool.getText().toString();
                            String employeeUpdatebeginDate = EmployeeUpdatebeginDate.getText().toString();
                            String employeeUpdatecontractTerm = EmployeeUpdatecontractTerm.getText().toString();
                            String employeeUpdateconversionTime = EmployeeUpdateconversionTime.getText().toString();
                            String employeeUpdatebeginContract = EmployeeUpdatebeginContract.getText().toString();
                            String employeeUpdateendContract = EmployeeUpdateendContract.getText().toString();

                            paramsUpdateEmployee.add("name", employeeUpdatename);
                            paramsUpdateEmployee.add("gender", employeeUpdategender);
                            paramsUpdateEmployee.add("birthday", employeeUpdatebirthday);
                            paramsUpdateEmployee.add("idCard", employeeUpdateidCard);
                            paramsUpdateEmployee.add("wedlock", employeeUpdatewedlock);
                            paramsUpdateEmployee.add("nationId", employeeUpdatenationId);
                            paramsUpdateEmployee.add("nativePlace", employeeUpdatenativePlace);
                            paramsUpdateEmployee.add("politicId", employeeUpdatepoliticId);
                            paramsUpdateEmployee.add("email", employeeUpdateemail);
                            paramsUpdateEmployee.add("phone", employeeUpdatephone);
                            paramsUpdateEmployee.add("address", employeeUpdateaddress);
                            paramsUpdateEmployee.add("departmentId", employeeUpdatedepartmentId);
                            paramsUpdateEmployee.add("jobLevelId", employeeUpdatejobLevelId);
                            paramsUpdateEmployee.add("posId", employeeUpdateposId);
                            paramsUpdateEmployee.add("engageForm", employeeUpdateengageForm);
                            paramsUpdateEmployee.add("tiptopDegree", employeeUpdatetiptopDegree);
                            paramsUpdateEmployee.add("specialty", employeeUpdatespecialty);
                            paramsUpdateEmployee.add("school", employeeUpdateschool);
                            paramsUpdateEmployee.add("beginDate", employeeUpdatebeginDate);
                            paramsUpdateEmployee.add("contractTerm", employeeUpdatecontractTerm);
                            paramsUpdateEmployee.add("conversionTime", employeeUpdateconversionTime);
                            paramsUpdateEmployee.add("beginContract", employeeUpdatebeginContract);
                            paramsUpdateEmployee.add("endContract", employeeUpdateendContract);

                            OkHttpClient clientUpdateEmployee = new OkHttpClient();//创建http客户端
                            Request requestUpdateEmployee = new Request.Builder()
                                    .url(HTTPSTR+"salary/update1")//在本机运行时的本机IP地址！！
                                    .post(paramsUpdateEmployee.build())
                                    .build();//创建http请求
                            Response responseUpdateEmployee = clientUpdateEmployee.newCall(requestUpdateEmployee).execute();
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(EmployeeUpdateActivity.this, "添加成功！", Toast.LENGTH_SHORT).show();//显示登录成功！
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
