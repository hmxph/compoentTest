package com.czb.baselibrary;

/**
 * FileName: ServiceFactory
 * Author: huangming
 * Date: 2019/4/27
 * Description: ${DESCRIPTION}
 */
public class ServiceFactory {

    private static final ServiceFactory instance=new ServiceFactory();

    public static  ServiceFactory getInstance(){
        return instance;
    }

    private ServiceFactory(){

    }

    private ILoginService iLoginService;
    private IMainService iMainService;

    public ILoginService getiLoginService() {
        return iLoginService;
    }

    public void setiLoginService(ILoginService iLoginService) {
        this.iLoginService = iLoginService;
    }

    public IMainService getiMainService() {
        return iMainService;
    }

    public void setiMainService(IMainService iMainService) {
        this.iMainService = iMainService;
    }
}
