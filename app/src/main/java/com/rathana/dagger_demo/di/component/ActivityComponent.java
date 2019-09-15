package com.rathana.dagger_demo.di.component;

import com.rathana.dagger_demo.LoginActivity;
import com.rathana.dagger_demo.MainActivity;
import com.rathana.dagger_demo.di.module.ActivityModule;
import com.rathana.dagger_demo.di.scope.ActivityScope;

import dagger.Component;

@ActivityScope
@Component(
        modules = {ActivityModule.class},
        dependencies = {AppComponent.class}
)
public interface ActivityComponent {

    void inject(MainActivity activity);
    void inject(LoginActivity activity);
}

