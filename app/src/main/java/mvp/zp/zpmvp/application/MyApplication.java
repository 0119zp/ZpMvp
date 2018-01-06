package mvp.zp.zpmvp.application;

import android.app.Application;

import mvp.zp.zpmvp.utils.MLog;

/**
 * Created by Administrator on 2017/3/23 0023.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        MLog.init(true);
    }
}
