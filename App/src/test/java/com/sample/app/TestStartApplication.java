package com.sample.app;

import org.robolectric.TestLifecycleApplication;

import java.lang.Override;
import java.lang.reflect.Method;

import java.util.Arrays;
import java.util.List;

import com.sample.app.dagger.ProductionModule;


public class TestStartApplication extends StartApplication implements TestLifecycleApplication {

    @Override
    public void beforeTest(Method method) {
    }

    @Override
    public void prepareTest(Object test) {
    }

    @Override
    public void afterTest(Method method) {
    }

    @Override
    protected List<Object> getModules() {
        return Arrays.asList(
                new ProductionModule(),
                new com.sample.library.dagger.RoboModule()
        );
    }

}
