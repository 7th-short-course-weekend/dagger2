package com.rathana.dagger_demo.di.component;

import com.rathana.dagger_demo.App;
import com.rathana.dagger_demo.di.module.AppModule;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {AppModule.class})
@Singleton
public interface AppComponent {
    void inject(App application);

    @Named("BaseUrl")
    String getBaseUrl();

}
