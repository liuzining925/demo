package com.lzn.common.base;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.lzn.common.utils.AppManager;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by 哼哼
 * Date：2020/7/19 16:58
 * Desc:
 */
public abstract class BaseActivity<P extends BasePresenter,CONTRACT> extends AppCompatActivity{
    public P mPresenter;
    public abstract CONTRACT getContract();
    public Unbinder mUnbinder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResource());
        ButterKnife.bind(this);
        AppManager.getAppManager().addActivity(this);
        mPresenter = getPresenterInstance();
        if (mPresenter != null){
            mPresenter.bindView(this);
        }
        initView();

    }
    protected abstract P getPresenterInstance();

    protected abstract int getLayoutResource();

    protected abstract void initView();





    /**
     * 通过class跳转界面
     * @param cls
     */
    public void startActivity(Class<?> cls) {
        startActivity(cls, null);
    }


    public void startActivity(Class<?> cls, Bundle bundle) {
        Intent intent = new Intent();
        intent.setClass(this, cls);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null){
            mPresenter.bindView(this);
        }
        mUnbinder.unbind();
        AppManager.getAppManager().finishActivity(this);
        destroy();
    }

    protected abstract void destroy();

}