package com.codevinci.ceva.dibasics.di;

import com.codevinci.ceva.dibasics.model.Rims;
import com.codevinci.ceva.dibasics.model.Tires;
import com.codevinci.ceva.dibasics.model.Wheels;

import dagger.Module;
import dagger.Provides;

//modules are classes that contribute to the object graph
@Module
public class WheelsModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflateTires();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(tires, rims);
    }
}
