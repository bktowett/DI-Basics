package com.codevinci.ceva.dibasics.model;

import android.util.Log;

import com.codevinci.ceva.dibasics.di.PerActivityScope;

import javax.inject.Inject;

@PerActivityScope
public class Car {
    private static final String TAG = "Car";
    private Engine engine;
    private Wheels wheels;
    private Driver driver;

    @Inject //constructor injection
    public Car(Driver driver,Engine engine, Wheels wheels){
        this.driver = driver;
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive(){
        engine.start();
        Log.d(TAG, driver+" drives "+this);

    }

    @Inject
    public void enableRemote(Remote remote){
        Log.d(TAG, "enableRemote: ");
        remote.setListener(this);
    }
}
