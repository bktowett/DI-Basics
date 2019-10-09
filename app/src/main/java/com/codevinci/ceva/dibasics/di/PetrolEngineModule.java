package com.codevinci.ceva.dibasics.di;

import com.codevinci.ceva.dibasics.model.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
