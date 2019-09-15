package com.rathana.dagger_demo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.rathana.dagger_demo.App;
import com.rathana.dagger_demo.di.component.ActivityComponent;
import com.rathana.dagger_demo.di.component.DaggerActivityComponent;

public abstract class BaseActivity extends AppCompatActivity {

    private ActivityComponent component;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        component = DaggerActivityComponent.builder()
                .appComponent(((App) getApplicationContext()).getComponent())
                .build();
        onInject(component);
    }

    protected abstract void onInject(ActivityComponent activityComponent);
}
