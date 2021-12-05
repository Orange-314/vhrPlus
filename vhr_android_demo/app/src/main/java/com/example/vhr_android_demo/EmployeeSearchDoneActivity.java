package com.example.vhr_android_demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class EmployeeSearchDoneActivity extends AppCompatActivity {

    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        String HTTPSTR = Constants.HTTPSTR;
        getSupportActionBar().hide();
        setContentView(R.layout.frame_emp_searchdone_1);

        String[] SearchEmployeeResult = Data.getEmployeeSearchdetail();

    }
}
