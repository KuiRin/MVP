package com.ifi.kuirrin.mvp.base.di;

import com.ifi.kuirrin.mvp.home.MainActivity;

/**
 * Created by ddquy on 7/14/2017.
 */

//@Singleton
//@Component(modules = {ActivityModule.class})
public interface IActivityComponent {

    void inject(MainActivity obj);

}
