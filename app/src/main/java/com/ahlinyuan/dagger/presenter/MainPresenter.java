package com.ahlinyuan.dagger.presenter;

import android.annotation.SuppressLint;
import android.util.Log;

import com.ahlinyuan.dagger.http.ApiService;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class MainPresenter implements MainContract.IMainPresenter {

    MainContract.IMainView view;
    ApiService apiService;

    @Inject
    public MainPresenter(MainContract.IMainView view, ApiService apiService) {
        this.view = view;
        this.apiService = apiService;
    }

    @SuppressLint("CheckResult")
    @Override
    public void getRecommend(String m, String api, String a, String client, String version, String deviceId) {
        apiService.getRecommend(m, api, a, client, version, deviceId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .compose(view.bindUntilDestroyEvent())
                .subscribe(model -> {
                    if(model.isOk()) {
                        Log.e("ahlinyuan", "ahlinyuan print model:" + model.getStatus());
                    }
                }, e -> {
                    e.printStackTrace();
                    Log.e("ahlinyuan", "ahlinyuan e:" + e.getMessage());
                });
    }
}
