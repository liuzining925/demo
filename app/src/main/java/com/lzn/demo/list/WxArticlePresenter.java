package com.lzn.demo.list;

import com.lzn.common.base.BasePresenter;
import com.lzn.demo.MainActivity;
import com.lzn.demo.bean.ArticleBean;
import com.lzn.demo.bean.BannerBean;

import java.util.List;

/**
 * Created by 哼哼
 * Date：2020/7/19 20:18
 * Desc:
 */
public class WxArticlePresenter extends BasePresenter<MainActivity,WxArticleModel,IWxArticle.VP>{
    @Override
    public WxArticleModel getModelInstance() {
        return new WxArticleModel(this);
    }

    @Override
    public IWxArticle.VP getContract() {
        return new IWxArticle.VP() {
            @Override
            public void requestData() {
                mModel.getContract().requestData();
            }

            @Override
            public void responseData(List<BannerBean> bannerBean) {
                mView.getContract().responseData(bannerBean);
            }

        };
    }
}