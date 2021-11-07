package com.example.vhr_android_demo;

import static com.example.vhr_android_demo.Constants.HTTPSTR;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class EmployeeFragment extends ListFragment {
    public LayoutInflater mInflater;
    private Map<String, String> data = new HashMap<>();
    String[] employees = new String[100];
    String[] employees_information = new String[100];
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mInflater = getActivity().getLayoutInflater();
        new Thread(new Runnable() {
            @Override
            public void run() {

                try {//用try-catch包围易错操作
                    FormBody.Builder paramsEmployee = new FormBody.Builder();
                    OkHttpClient client = new OkHttpClient();//创建http客户端
                    Request requestEmployee = new Request.Builder()
                            .url(HTTPSTR+"employee/findall")//在本机运行时的本机IP地址！！
                            .post(paramsEmployee.build())
                            .build();//创建http请求
                    Response responseEmployee = client.newCall(requestEmployee).execute();//发送所创建的请求
                    String responseDataEmployee = responseEmployee.body().string();//接收返回来的json格式的数据
                    //responseDataEmployee = "["+responseDataEmployee+"]";
                    JSONArray jsonArray = new JSONArray(responseDataEmployee);
                    for(int i = 0; i< jsonArray.length(); i++){
                        JSONObject jsonObject = jsonArray.getJSONObject(i);
                        employees[i]=jsonObject.getString("name");
                        employees_information[i]=jsonObject.getString("id");
                        Log.d("name",""+jsonObject.getString("name"));
                    }//遍历接收到的json数据内容
                    data = getData();
                }catch(Exception e){//如果连接错误，则输出提示
                    e.printStackTrace();
                }
            }
        }).start();
        this.setListAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, android.R.id.text1, new ArrayList<>(data.keySet()))
        );


    }
    @Override
    public void onListItemClick(@NonNull ListView parent, @NonNull View item, int position, long id) {
        super.onListItemClick(parent, item, position, id);
        MeaningFragment rightFragment = (MeaningFragment) getFragmentManager().findFragmentById(R.id.fragment_meaning);
        ((TextView) rightFragment.getActivity().findViewById(R.id.meaning))
                .setText(data.get(((TextView) item).getText()));

    }

    String[] employees1= {
            "江南一点雨","陈静","赵林浩"
    };
    String[] employees_information1= {
            "1","2","3"
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_employee_fragment, container, false);
        return view;
    }
    private Map<String, String> getData() {

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < employees1.length; i++) {
            map.put(employees1[i], employees_information1[i]);
        }
        return map;
    }
}
