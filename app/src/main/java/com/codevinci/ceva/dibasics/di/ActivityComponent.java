package com.codevinci.ceva.dibasics.di;

import com.codevinci.ceva.dibasics.MainActivity;
import com.codevinci.ceva.dibasics.model.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@PerActivityScope
@Subcomponent( modules = {WheelsModule.class, DieselEngineModule.class}) //add this annotation - dagger will at compile time implement this interface
public interface ActivityComponent {

    Car getCar();//provision method

    void inject(MainActivity mainActivity);
   //subcomponents dont need builders
   /* @Component.Builder
    interface Builder{
        @BindsInstance
        Builder horsePower(@HorsePower int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("enginecapacity") int engineCapacity);

        Builder appComponent(AppComponent component);

        ActivityComponent build();

    }*/
}
