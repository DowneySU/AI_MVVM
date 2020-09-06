package com.example.module_main.ui

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

/**
 *Created by Downey on 2020/8/24
 *Describe:
 */
abstract class BaseDataActivity :AppCompatActivity(){
    protected var mDrawableList: MutableList<Int> =ArrayList()
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState)
        initData()
    }

    private fun initData(){
        for (i in 0..2){
            val drawable=resources.getIdentifier("guide$i","drawable",packageName)
            mDrawableList.add(drawable)
        }
    }
}