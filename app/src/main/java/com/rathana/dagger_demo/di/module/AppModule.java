package com.rathana.dagger_demo.di.module;

import android.app.Application;
import android.content.Context;

import com.rathana.dagger_demo.Address;
import com.rathana.dagger_demo.Person;
import com.rathana.dagger_demo.di.scope.ActivityScope;

import javax.inject.Named;
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
    @Named(value = "BaseUrl")
    String provideBaseUrl(){
        return "http://api-ams.me";
    }

    @Provides
    @Singleton
    @Named("ApiKey")
    String provideApiKey(){
        return  "jshG996Ke9ke(7jskejke";
    }

    @Provides
    @Singleton
    Person provideAdministrator(Address address){
        Person person=new Person();
        person.setAddress(address);
        person.setName("administrator");
        person.setGender("female");
        return person;
    }

    @Provides
    @Singleton
    Address provideAddress(){
        Address address=new Address();
        address.setCountry("Cambodia");
        address.setProvince("Phnom Penh");
        address.setState("Phnom Penh");
        return address;
    }
}
