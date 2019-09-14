package com.rathana.dagger_demo.di.module;

import android.app.Application;
import android.content.Context;

import com.rathana.dagger_demo.Person;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Context provideApplicationContext(){
        return application;
    }
    @Provides
    @Singleton
    String provideBaseUrl(){
        return "http://api-ams.me";
    }

    @Provides
    @Singleton
    Person provideAdministrator(){
        return new Person("Administrator","male");
    }
}
