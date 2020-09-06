package com.example.ai_mvvm;

import androidx.viewbinding.BuildConfig;

import com.example.library_base.base.BaseApplication;

/**
 * 应用模块: 宿主app
 * <p>
 * 类描述: 宿主app的 application ,在这里通过common组件中定义的组件生命周期配置类进行相应初始化(通过反射调用各个组件的初始化器)
 * <p>
 * Created by Downey on 2020/8/24
 * Describe:
 */

public class AppApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        setsDebug(BuildConfig.DEBUG);
//        ModuleLifecycleConfig.getInstance().initModuleAhead(this);
    }
}
