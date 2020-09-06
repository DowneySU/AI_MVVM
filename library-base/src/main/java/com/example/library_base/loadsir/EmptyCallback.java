package com.example.library_base.loadsir;

import com.example.library_base.R;
import com.kingja.loadsir.callback.Callback;

/**
 * Created by Downey on 2020/8/25
 * Describe:
 */
public class EmptyCallback extends Callback {
    @Override
    protected int onCreateView() {
        return R.layout.base_layout_empty;
    }
}
