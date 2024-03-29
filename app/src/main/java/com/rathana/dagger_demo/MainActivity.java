package com.rathana.dagger_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.rathana.dagger_demo.base.BaseActivity;
import com.rathana.dagger_demo.di.component.ActivityComponent;
import com.rathana.dagger_demo.di.component.DaggerActivityComponent;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends BaseActivity {

//    @Inject
//    @Named("BaseUrl")
//    String baseUrl;
//    @Inject Person person;

    @Inject
    @Named("Dara")
    Person person;

    @Inject @Named("BaseUrl")
    String baseUrl;

    private ActivityComponent component;

    @Override
    protected void onInject(ActivityComponent activityComponent) {
        activityComponent.inject(this);
    }

    static final String TAG= MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(TAG, "onCreate: BaseUrl "+baseUrl );
        Log.e(TAG, "onCreate: Person "+person.toString());

    }
}
