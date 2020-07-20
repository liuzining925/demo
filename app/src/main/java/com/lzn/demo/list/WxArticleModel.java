package com.lzn.demo.list;
import android.util.Log;

import com.lzn.common.base.BaseModel;
import com.lzn.demo.bean.BannerBean;
import com.rxjava.rxlife.RxLife;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import rxhttp.wrapper.param.RxHttp;

/**
 * Created by 哼哼
 * Date：2020/7/19 20:17
 * Desc:
 */
public class WxArticleModel extends BaseModel<WxArticlePresenter,IWxArticle.M> {
    private static final String TAG = "WxArticleModel";

    public WxArticleModel(WxArticlePresenter presenter) {
        super(presenter);
    }

    @Override
    public IWxArticle.M getContract() {
       return () -> RxHttp.get("/friend/json")
               .asResponseList(BannerBean.class)
               .observeOn(AndroidSchedulers.mainThread())
               .to(RxLife.to(mPresenter.mView))
               .subscribe(bannerBeans -> {
                   mPresenter.getContract().responseData(bannerBeans);
               },throwable -> {
                   Log.d(TAG, "requestData: "+throwable.getMessage());
               });
    }
}