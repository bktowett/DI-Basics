package com.codevinci.ceva.dibasics.di;

import android.util.Log;

import com.codevinci.ceva.dibasics.model.Engine;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "Car";

    private int horsePower;

    @Inject
    public DieselEngine(int horsePower){
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "Diesel engine started. Horses: "+horsePower);
    }
}
