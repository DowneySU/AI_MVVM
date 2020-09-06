package com.example.library_base.loadsir;

import android.content.Context;
import android.view.View;

import com.example.library_base.R;
import com.kingja.loadsir.callback.Callback;

/**
 * 应用模块:
 * <p>
 * 类描述: 骨架屏
 * <p>
 * Created by Downey on 2020/8/26
 * Describe:
 */
public class ShimmerCallback extends Callback {
    @Override
    protected int onCreateView() {
        return R.layout.base_layout_placeholder;
    }

    @Override
    protected boolean onReloadEvent(Context context, View view) {
        return true;
    }


}
