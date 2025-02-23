package com.codevinci.ceva.dibasics.di;

import com.codevinci.ceva.dibasics.model.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {
    //Driver getDriver();
    ActivityComponent getActivityComponent(DieselEngineModule dieselEngineModule);
}
