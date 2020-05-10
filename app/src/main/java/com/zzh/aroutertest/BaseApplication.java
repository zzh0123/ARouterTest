package com.zzh.aroutertest;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Author: zzhh
 * Date: 2020/5/10 17:45
 * Description: application基类
 */
public class BaseApplication extends Application {

    private static boolean isDebug = false;
    @Override
    public void onCreate() {
        super.onCreate();

        if (isDebug) {           // These two lines must be written before init, otherwise these configurations will be invalid in the init process
            ARouter.openLog();     // Print log
            ARouter.openDebug();   // Turn on debugging mode (If you are running in InstantRun mode, you must turn on debug mode! Online version needs to be closed, otherwise there is a security risk)
        }
        ARouter.init(this); // As early as possible, it is recommended to initialize in the Application
    }
}
