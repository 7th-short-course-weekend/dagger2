package com.rathana.dagger_demo.di.component;

import com.rathana.dagger_demo.MainActivity;
import com.rathana.dagger_demo.di.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {AppModule.class})
@Singleton
public interface AppComponent {

    void inject(MainActivity activity);
}
