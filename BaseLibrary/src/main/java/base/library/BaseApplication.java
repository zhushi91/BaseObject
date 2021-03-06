package base.library;

import android.app.Application;

/**
 * Created by wangjiangpeng01 on 2016/11/23.
 */
public abstract class BaseApplication extends Application {

    private static BaseApplication application;

    public static BaseApplication getInstance(){
        return application;
    }


    @Override
    public void onCreate() {
        super.onCreate();

        application = this;

    }

    /**
     * 环境初始化，在环境初始化任务中被调用
     */
    public abstract void envInit();


}
