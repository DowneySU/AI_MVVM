package com.example.library_base.utils;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import android.widget.Toast;

/**
 * 应用模块: utils
 * <p>
 * 类描述: toast显示工具类
 * <p>
 * Created by Downey on 2020/8/25
 * Describe:
 */
public class ToastUtil {
    private static Toast mToast;
    public static void show(Context context,String msg){
        try{
            if(context !=null && TextUtils.isEmpty(msg)){
                if(mToast !=null){
                    mToast.cancel();
                }
                mToast=Toast.makeText(context,"",Toast.LENGTH_SHORT);
                mToast.setText(msg);
                mToast.show();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
