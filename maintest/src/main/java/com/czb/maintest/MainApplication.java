package com.czb.maintest;

import android.app.Application;

import com.czb.baselibrary.IAppComponent;
import com.czb.baselibrary.ServiceFactory;

/**
 * FileName: MainApplication
 * Author: huangming
 * Date: 2019/4/27
 * Description: ${DESCRIPTION}
 */
public class MainApplication extends Application implements IAppComponent {

    private static Application application;

    public static Application getApplication(){
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initializa(this);
    }

    @Override
    public void initializa(Application app) {
      application=app;
        ServiceFactory.getInstance().setiMainService(new MainService());
    }
}
