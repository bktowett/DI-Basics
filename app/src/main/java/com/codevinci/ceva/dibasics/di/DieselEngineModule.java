package com.codevinci.ceva.dibasics.di;

import com.codevinci.ceva.dibasics.model.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }


    /*@Binds
    abstract Engine bindEngine(DieselEngine engine);*/
    @Provides
    Engine provideEngine() {
        return new DieselEngine(horsePower);
    }
}
