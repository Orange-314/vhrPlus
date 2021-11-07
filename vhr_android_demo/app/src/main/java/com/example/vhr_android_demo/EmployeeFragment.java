package com.example.vhr_android_demo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmployeeFragment extends ListFragment {
    private Map<String, String> data = new HashMap<>();

    public LayoutInflater mInflater;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mInflater = getActivity().getLayoutInflater();
        data = getData();
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


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_employee_fragment, container, false);
        return view;
    }

    private Map<String, String> getData() {
        String[] words = { "apple", "advice", "animal", "add", "according",
                "bee", "bed", "better", "because", "bad",
                "cow", "can", "call", "cycle", "certain",
                "door", "do", "dad", "due", "data",
                "east", "even", "edit", "exactly", "everything",
                "fast", "forget", "feel", "flat", "friend",
                "green", "good", "get", "give", "gold",
                "hand", "help", "happy", "he", "have",
                "important", "is", "ice", "idea", "if",
                "jeep", "just", "jack", "job", "join",
                "king", "konw", "keep", "kid", "kind",
                "lion", "let", "like", "look", "love",
                "man", "maybe", "me", "map", "main",
                "need", "now", "new", "not", "number",
                "ok", "or", "oh", "only", "old",
                "possible", "please", "pull", "put", "problem",
                "road", "read", "really", "remember", "room",
                "seat", "set", "so", "sea", "some",
                "test", "they", "talk", "tie", "till",
                "umbrella", "use", "ultimate", "up", "update",
                "volleyball", "very", "visit", "value", "view",
                "xanadu", "xerox", "xero", "xenic", "xenium",
                "yellow", "yes", "you", "year", "young",
                "zebra", "zero", "zoo", "zebra", "zeal"};
        String[] meanings = {"苹果", "建议", "动物", "添加", "根据",
                "蜜蜂", "床", "更好", "因为", "不好",
                "奶牛", "可能", "叫", "自行车", "确定的",
                "门", "做", "爸", "应得", "数据",
                "东边", "甚至", "编辑", "其实", "所有",
                "快的", "忘记", "感觉", "平地", "朋友",
                "绿色", "好", "拿", "给", "金黄色",
                "手", "帮助", "快乐", "他", "有",
                "重要的", "是", "冰", "想法", "如果",
                "吉普车", "仅", "插座", "工作", "参加",
                "国王", "知道", "保持", "儿童", "种类",
                "狮子", "让", "喜欢", "看", "喜爱",
                "男人", "可能", "我", "地图", "主要",
                "需要", "现在", "新", "不", "数字",
                "好的", "或", "哦", "只", "老",
                "可能的", "请", "拉", "放", "问题",
                "马路", "读", "真的", "记得", "室",
                "座位", "设置", "因此", "大海", "一些",
                "测试", "他们", "讲话", "联系", "钱箱",
                "雨伞", "使用", "最终的", "上", "升级",
                "排球", "非常", "参观", "数值", "看法",
                "世外桃源", "复印", "干燥", "异类的", "礼物",
                "黄色", "对", "你", "年", "年轻",
                "斑马", "零", "动物园", "斑马", "热情"};
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], meanings[i]);
        }
        return map;
    }
}
