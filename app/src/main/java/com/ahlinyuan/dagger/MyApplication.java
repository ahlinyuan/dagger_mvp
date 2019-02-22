package com.ahlinyuan.dagger;

import android.app.Application;
import android.content.Context;

import com.ahlinyuan.dagger.dagger.DaggerHttpComponent;
import com.ahlinyuan.dagger.dagger.HttpComponent;
import com.ahlinyuan.dagger.dagger.HttpModule;

/**
 * creataed by ahlinyuan
 * on 2019/2/20
 */
public class MyApplication extends Application {

    private static MyApplication instance;

    public static MyApplication get(Context context){
        return (MyApplication)context.getApplicationContext();
    }

    private HttpComponent httpComponent;



    @Override
    public void onCreate() {
        super.onCreate();
        httpComponent = DaggerHttpComponent.builder().httpModule(new HttpModule()).build();
    }


    public HttpComponent getHttpComponent() {
        return httpComponent;
    }
}
