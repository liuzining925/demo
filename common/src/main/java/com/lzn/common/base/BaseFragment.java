package com.lzn.common.base;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by 哼哼
 * Date：2020/7/19 17:17
 * Desc:
 */
public abstract class BaseFragment<P extends BasePresenter,CONTRACT> extends Fragment {
    public View rootView;
    public Unbinder mUnBinder;
    public P mPresenter;
    public abstract CONTRACT getContract();

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        if (rootView == null){
            rootView = inflater.inflate(getLayoutResource(),container,false);
        }
        mUnBinder = ButterKnife.bind(this, rootView);
        initView();
        mPresenter = getPresenterInstance();
        if (mPresenter != null){
            mPresenter.bindView(this);
        }
        return rootView;
    }

    protected abstract int getLayoutResource();

    protected abstract void initView();

    protected abstract P getPresenterInstance();

    /**
     * 通过class跳转界面
     * @param cls
     */
    public void startActivity(Class<?> cls) {
        startActivity(cls, null);
    }


    /**
     * 带有bundle
     * @param cls
     * @param bundle
     */
    public void startActivity(Class<?> cls, Bundle bundle) {
        Intent intent = new Intent();
        intent.setClass(getActivity(), cls);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mUnBinder.unbind();
        mPresenter.unBindView();
    }
}