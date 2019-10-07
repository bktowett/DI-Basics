package com.codevinci.ceva.dibasics.di;

import com.codevinci.ceva.dibasics.MainActivity;
import com.codevinci.ceva.dibasics.model.Car;

import dagger.Component;

@Component //add this annotation - dagger will at compile time implement this interface
public interface CarComponent {

    Car getCar();//provision method

    void inject(MainActivity mainActivity);
}
