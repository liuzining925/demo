package com.lzn.demo.list;

import com.lzn.demo.bean.ArticleBean;
import com.lzn.demo.bean.BannerBean;

import java.util.List;

/**
 * Created by 哼哼
 * Date：2020/7/19 19:43
 * Desc:
 */
public class IWxArticle {
    public interface M{
        void requestData();
    }

    public interface VP{
        void requestData();

        void responseData(List<BannerBean> bannerBean);
    }
}