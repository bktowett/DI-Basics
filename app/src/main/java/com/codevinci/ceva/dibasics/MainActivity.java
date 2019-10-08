package com.codevinci.ceva.dibasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.codevinci.ceva.dibasics.di.CarComponent;
import com.codevinci.ceva.dibasics.di.DaggerCarComponent;
import com.codevinci.ceva.dibasics.model.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject Car car;//field injection

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Engine engine = new Engine();
        Wheels wheel = new Wheels();
        Car car = new Car(engine,wheel);
        car.drive();*/

        CarComponent carComponent = DaggerCarComponent.create();
        //Car car = carComponent.getCar();
        carComponent.inject(this);
        car.drive();
    }
}
