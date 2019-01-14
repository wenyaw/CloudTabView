package com.code.slide.lisenter;

import com.code.slide.widget.FlowTagLayout;

import java.util.List;

public interface OnTagSelectListener {
    void onItemSelect(FlowTagLayout parent, List<Integer> selectedList);
}
