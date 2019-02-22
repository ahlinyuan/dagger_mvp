package com.ahlinyuan.dagger.presenter;

import com.trello.rxlifecycle2.LifecycleTransformer;

public interface IBaseView {

    /**
     * 绑定直到销毁的生命周期
     *
     * @return 绑定的直到销毁的生命周期
     */
    <T> LifecycleTransformer<T> bindUntilDestroyEvent();
}
