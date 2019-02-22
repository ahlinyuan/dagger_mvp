package com.ahlinyuan.dagger.dagger;

import com.ahlinyuan.dagger.MainActivity;

import dagger.Component;

/**
 * creataed by ahlinyuan
 * on 2019/2/20
 */
@UserScope
@Component(modules = MainModule.class, dependencies = HttpComponent.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
