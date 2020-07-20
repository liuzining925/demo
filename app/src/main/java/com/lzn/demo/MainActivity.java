package com.lzn.demo;
import android.util.Log;
import android.widget.Button;
import com.lzn.common.base.BaseActivity;
import com.lzn.demo.bean.ArticleBean;
import com.lzn.demo.bean.BannerBean;
import com.lzn.demo.list.IWxArticle;
import com.lzn.demo.list.WxArticlePresenter;

import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity<WxArticlePresenter, IWxArticle.VP> {
    private static final String TAG = "MainActivity";
    @BindView(R.id.button)
    Button button;
    @Override
    public IWxArticle.VP getContract() {
        return new IWxArticle.VP() {
            @Override
            public void requestData() {
                button.setText("正在请求..");
                mPresenter.getContract().requestData();
            }

            @Override
            public void responseData(List<BannerBean> bannerBean) {
                if (bannerBean.size()>0){
                    button.setText(bannerBean.get(0).getLink());
                    Log.d(TAG, "responseData: "+bannerBean.get(0).getLink());
                    String s = "Rxhttp";
                    Log.d(TAG, "responseData: "+s.length());
                }else {
                    Log.d(TAG, "responseData: 撒也不是");
                }
            }
        };
    }

    @Override
    protected WxArticlePresenter getPresenterInstance() {
        return new WxArticlePresenter();
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void destroy() {

    }

    @OnClick(R.id.button)
    public void onViewClicked() {
       getContract().requestData();
    }
}