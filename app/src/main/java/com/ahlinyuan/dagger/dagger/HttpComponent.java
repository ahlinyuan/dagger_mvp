package com.ahlinyuan.dagger.dagger;

import com.ahlinyuan.dagger.http.ApiService;

import javax.inject.Singleton;

import dagger.Component;

/**
 * creataed by ahlinyuan
 * on 2019/2/20
 */
@Singleton
@Component(modules = HttpModule.class)
public interface HttpComponent {
    ApiService getApiService();
}
