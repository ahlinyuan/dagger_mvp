package com.ahlinyuan.dagger.dagger;

import com.ahlinyuan.dagger.presenter.MainContract;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    MainContract.IMainView mainView;

    public MainModule(MainContract.IMainView mainView) {
        this.mainView = mainView;
    }

    @Provides
    public MainContract.IMainView providesView() {
        return mainView;
    }
}
