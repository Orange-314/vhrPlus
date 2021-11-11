package com.example.vhr_android_demo;

import android.app.Fragment;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

public class SalaryDetailsFragment extends Fragment {
    /**
     * 创建一个 DetailsFragment的实例, 初始化显示数据
     */
    public static SalaryDetailsFragment newInstance(int index) {
        SalaryDetailsFragment f = new SalaryDetailsFragment();
        // 提供 index 作为参数
        Bundle args = new Bundle();
        args.putInt("index", index);
        f.setArguments(args);

        return f;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //创建一个滚动视图
        ScrollView scroller = new ScrollView(getActivity());
        TextView text = new TextView(getActivity());
        int padding = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 4, getActivity().getResources()
                        .getDisplayMetrics());
        text.setPadding(padding, padding, padding, padding);
        //将TextView加载到滚动视图中
        scroller.addView(text);
        //设置TextView要显示的详细内容
        text.setText(Data.SALARY_DETAIL[getShownIndex()]);
        return scroller;
    }

    //获取要显示的列表索引项
    private int getShownIndex() {
        return getArguments().getInt("index", 0);
    }
}
