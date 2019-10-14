package com.codevinci.ceva.dibasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.codevinci.ceva.dibasics.di.ActivityComponent;
import com.codevinci.ceva.dibasics.di.DieselEngineModule;
import com.codevinci.ceva.dibasics.model.Car;

import javax.inject.Inject;

import dagger.android.DaggerActivity;

public class MainActivity extends AppCompatActivity {
    @Inject Car car1, car2;//field injection

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Engine engine = new Engine();
        Wheels wheel = new Wheels();
        Car car = new Car(engine,wheel);
        car.drive();*/

        /*ActivityComponent activityComponent = DaggerCarComponent.create();
        //Car car = activityComponent.getCar();*/
        /*ActivityComponent activityComponent = DaggerCarComponent.builder()
                .dieselEngineModule(new DieselEngineModule(100))
                .build();*/
        /*ActivityComponent activityComponent = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(1000)
                .build();*/
        /*ActivityComponent activityComponent = ((ExampleApp)getApplication()).getComponent();*/
        /*ActivityComponent activityComponent = DaggerActivityComponent.builder()
                .horsePower(256)
                .engineCapacity(4000)
                .appComponent(((ExampleApp)getApplication()).getComponent())
                .build();*/
        ActivityComponent activityComponent = ((ExampleApp)getApplication()).getComponent()
                .getActivityComponent(new DieselEngineModule(120));

        activityComponent.inject(this);
        car1.drive();
        car2.drive();
    }
}
