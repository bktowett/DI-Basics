package com.codevinci.ceva.dibasics.di;

import android.util.Log;

import com.codevinci.ceva.dibasics.model.Engine;

import javax.inject.Inject;

public class PetrolEngine implements Engine {
    private static final String TAG = "Car";

    @Inject
    public PetrolEngine(){

    }
    @Override
    public void start() {
        Log.d(TAG, "Petrol start engine");
    }
}
