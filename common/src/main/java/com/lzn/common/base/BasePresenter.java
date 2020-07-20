package com.lzn.common.base;
/**
 * Created by 哼哼
 * Date：2020/7/19 17:15
 * Desc: mvp ---> BasePresenter
 */
public abstract class BasePresenter<V,M extends BaseModel,CONTRACT> extends SuperBase<CONTRACT>{
    public V mView;

    public M mModel;

    public BasePresenter() {
        mModel = getModelInstance();
    }

    /**
     * 绑定view
     * @param mView
     */
    public void bindView(V mView){
        this.mView = mView;
    }

    /**
     * 解绑view
     */
    public void unBindView(){
        this.mView = null;
    }

    public abstract M getModelInstance();
}