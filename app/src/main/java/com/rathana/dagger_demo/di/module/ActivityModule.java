package com.rathana.dagger_demo.di.module;

import com.rathana.dagger_demo.Person;
import com.rathana.dagger_demo.di.scope.ActivityScope;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    @Provides
    @ActivityScope
    @Named("Dara")
    Person provideData(){
        return new Person("Dara","male");
    }

}
