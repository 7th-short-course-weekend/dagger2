package com.rathana.dagger_demo;

import android.app.Application;

import com.rathana.dagger_demo.di.component.AppComponent;
import com.rathana.dagger_demo.di.component.DaggerAppComponent;
import com.rathana.dagger_demo.di.module.AppModule;

public class App extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();

        component.inject(this);
    }

    public AppComponent getComponent() {
        return component;
    }
}
