package com.rathana.dagger_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.rathana.dagger_demo.base.BaseActivity;
import com.rathana.dagger_demo.di.component.ActivityComponent;
import com.rathana.dagger_demo.di.component.DaggerActivityComponent;

import javax.inject.Inject;
import javax.inject.Named;

public class LoginActivity extends BaseActivity {

    @Inject @Named("Dara")
    Person person;

    final static  String TAG= LoginActivity.class.getSimpleName();

    @Override
    protected void onInject(ActivityComponent activityComponent) {
        activityComponent.inject(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Log.e(TAG, "onCreate: Person"+person);
    }
}
