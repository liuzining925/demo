package com.lzn.common.base;

/**
 * Created by 哼哼
 * Date：2020/7/19 17:15
 * Desc:
 */
public abstract class BaseModel<P extends BasePresenter,CONTRACT> extends SuperBase<CONTRACT>{
    public P mPresenter;

    public BaseModel(P presenter) {
        this.mPresenter = presenter;
    }


}