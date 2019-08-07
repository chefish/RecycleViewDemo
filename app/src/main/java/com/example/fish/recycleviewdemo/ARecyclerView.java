package com.example.fish.recycleviewdemo;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * Created by fish on 2019/4/2.
 * yuxm_zju@aliyun.com
 */
public class ARecyclerView extends RecyclerView {
    public ARecyclerView(Context context) {
        super(context);
    }

    public ARecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ARecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        LogUtil.d("onLayout");
        super.onLayout(changed, l, t, r, b);
    }

    @Override
    public void requestLayout() {
        LogUtil.d("requestLayout");
        super.requestLayout();
    }
}
