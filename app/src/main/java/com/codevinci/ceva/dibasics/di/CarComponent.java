package com.codevinci.ceva.dibasics.di;

import com.codevinci.ceva.dibasics.MainActivity;
import com.codevinci.ceva.dibasics.model.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {WheelsModule.class, PetrolEngineModule.class}) //add this annotation - dagger will at compile time implement this interface
public interface CarComponent {

    Car getCar();//provision method

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder horsePower(@HorsePower int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("enginecapacity") int engineCapacity);

        CarComponent build();

    }
}
