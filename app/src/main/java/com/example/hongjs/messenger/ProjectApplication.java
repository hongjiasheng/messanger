package com.example.hongjs.messenger;

import android.app.Application;
import android.content.Context;

/**
 * Created by hongj on 2019/1/6.
 */

public class ProjectApplication extends Application{
    private static Context context ;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext(){
        return context ;
    }
}
