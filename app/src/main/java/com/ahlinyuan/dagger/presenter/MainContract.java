package com.ahlinyuan.dagger.presenter;

public interface MainContract {

    interface IMainPresenter {
        void getRecommend(String m, String api, String a, String client, String version, String deviceId);
    }

    interface IMainView extends IBaseView{

    }
}
