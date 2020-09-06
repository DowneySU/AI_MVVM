package com.example.library_base.activity;

/**
 * * 应用模块:
 * <p>
 * 类描述:
 * <p>
 * Created by Downey on 2020/8/25
 * Describe:
 */
public interface IBasePagingView extends IBaseView{
    /**
     * 加载更多失败
     */
    void onLoadMoreFailure(String message);

    /**
     * 没有更多了
     */
    void onLoadMoreEmpty();

}
