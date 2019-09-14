package com.rathana.dagger_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.rathana.dagger_demo.di.component.AppComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    String baseUrl;

    static final String TAG= MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((AppComponent) getApplicationContext()).inject(this);


        Log.e(TAG, "onCreate: BaseUrl"+baseUrl );
    }
}
