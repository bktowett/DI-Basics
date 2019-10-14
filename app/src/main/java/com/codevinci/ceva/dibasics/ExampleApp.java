package com.codevinci.ceva.dibasics;

import android.app.Application;
import android.content.Context;

import com.codevinci.ceva.dibasics.di.ActivityComponent;
import com.codevinci.ceva.dibasics.di.AppComponent;
import com.codevinci.ceva.dibasics.di.DaggerAppComponent;

public class ExampleApp extends Application {
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        /*component = DaggerAppComponent.builder()
                .engineCapacity(1500)
                .horsePower(256)
                .build();*/
        component = DaggerAppComponent.create();
    }

    public AppComponent getComponent(){
        return component;
    }
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }
}
