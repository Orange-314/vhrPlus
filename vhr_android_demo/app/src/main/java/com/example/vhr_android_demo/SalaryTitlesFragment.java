package com.example.vhr_android_demo;

import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SalaryTitlesFragment extends ListFragment {
    boolean mDualPane;
    int mCurCheckPosition = 0;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // 设置适配器，加载标题项
        setListAdapter(new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1/*simple_list_item_single_choice*/, Data.SALARY_NAME));
        if (savedInstanceState != null) {
            // 更新选中项目的位置
            mCurCheckPosition =savedInstanceState.getInt("curChoice", 0);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("curChoice",mCurCheckPosition);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        showDetails(position);
    }
    /**
     * Helper function to show the details of a selected item,either by
     * displaying a fragment in-place in the current UI, orstarting a
     * whole new activity in which it is displayed.
     */
    void showDetails(int index) {
        mCurCheckPosition = index;
        // 加载一个新的Activity 显示详细内容
        Intent intent = new Intent();
        intent.setClass(getActivity(),SalaryActivity.DetailsActivity.class);
        intent.putExtra("index",index);
        startActivity(intent);
    }

}
