package com.codevinci.ceva.dibasics.model;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    private Engine engine;
    private Wheel wheel;

    @Inject //constructor injection
    public Car(Engine engine, Wheel wheel){
        this.engine = engine;
        this.wheel = wheel;
    }

    public void drive(){
        Log.d(TAG, "driving...");
    }

    @Inject
    public void enableRemote(Remote remote){
        Log.d(TAG, "enableRemote: ");
        remote.setListener(this);
    }
}
