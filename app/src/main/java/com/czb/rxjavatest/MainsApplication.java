package com.czb.rxjavatest;

import android.app.Application;

import com.czb.baselibrary.AppConfig;
import com.czb.baselibrary.IAppComponent;

import java.util.Objects;

/**
 * FileName: MainsApplication
 * Author: huangming
 * Date: 2019/4/27
 * Description: ${DESCRIPTION}
 */
public class MainsApplication extends Application implements IAppComponent {

    private static MainsApplication application;
    public static MainsApplication getApplication(){
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initializa(this);
    }

    @Override
    public void initializa(Application application) {
        for(String str: AppConfig.COMPONENTS){
            try {
                Class<?> clazz=Class.forName(str);
                Object object=clazz.newInstance();
                if(object instanceof IAppComponent){
                    ((IAppComponent) object).initializa(this);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
