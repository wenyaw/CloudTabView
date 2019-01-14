package com.code.slide.lisenter;

import android.view.View;

import com.code.slide.widget.FlowTagLayout;

public interface OnTagClickListener {
    void onItemClick(FlowTagLayout parent, View view, int position);
}
