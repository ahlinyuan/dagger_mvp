package com.ahlinyuan.dagger;

import android.os.Bundle;

import com.ahlinyuan.dagger.dagger.DaggerMainComponent;
import com.ahlinyuan.dagger.dagger.MainModule;
import com.ahlinyuan.dagger.presenter.MainContract;
import com.ahlinyuan.dagger.presenter.MainPresenter;
import com.trello.rxlifecycle2.LifecycleTransformer;
import com.trello.rxlifecycle2.android.ActivityEvent;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends RxAppCompatActivity implements MainContract.IMainView {

    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainComponent.builder().mainModule(new MainModule(this))
                .httpComponent(MyApplication.get(this).getHttpComponent())
                .build().inject(this);
//m=Home&c=Api&a=getLunar&client=android&device_id=866963027059338&version=866963027059338
        mainPresenter.getRecommend("home","Api","getLunar","android","866963027059338","866963027059338");
    }

    //基础控制器的View================================

    public <T> LifecycleTransformer<T> bindUntilDestroyEvent() {
        return bindUntilEvent(ActivityEvent.DESTROY);
    }
}
