package com.sample.app;

import com.sample.app.dagger.ProductionModule;

import java.util.Arrays;
import java.util.List;


public class StartApplication extends com.sample.library.StartApplication {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected List<Object> getModules() {
        return Arrays.asList(
                new ProductionModule(),
                new com.sample.library.dagger.ProductionModule()
        );
    }

}