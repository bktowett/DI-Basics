package com.codevinci.ceva.dibasics.di;

import android.util.Log;

import com.codevinci.ceva.dibasics.model.Engine;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {
    private static final String TAG = "Car";
    private int horsePower;
    private int engineCapacity;

    @Inject
    public PetrolEngine(@HorsePower int horsePower,@Named("enginecapacity") int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void start() {

        Log.d(TAG, "Petrol start engine. \nHorse Power " + horsePower+"\nEngine Capacity: "+engineCapacity);
    }
}
