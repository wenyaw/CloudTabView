package com.code.slide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.code.slide.lisenter.OnTagClickListener;
import com.code.slide.widget.FlowTagLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * 可滑动的tab
 * Created by ljw on 2019/1/14.
 */

public class SlideTabAct extends AppCompatActivity {

    FlowTagLayout mFlowTaglayout;
    TagAdpater mTagAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_cloud_tab);
        init();
    }

    private void init(){
        mFlowTaglayout = findViewById(R.id.flow_layout);
        mTagAdapter = new TagAdpater(this);
        mFlowTaglayout.setAdapter(mTagAdapter);
        setData();
        mFlowTaglayout.setOnTagClickListener(new OnTagClickListener() {
            @Override
            public void onItemClick(FlowTagLayout parent, View view, int position) {
                String tag = (String) mTagAdapter.getItem(position);
                Toast.makeText(SlideTabAct.this,"当前点击了" + tag,Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setData(){
        List<String> tags = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            tags.add("云标签" + i);
        }
        mTagAdapter.onlyAddAll(tags);
    }
}
