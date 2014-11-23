package com.sample.library;

import android.app.Application;

import com.sample.library.dagger.ProductionModule;

import java.util.Arrays;
import java.util.List;

import dagger.ObjectGraph;


public class StartApplication extends Application {

    private ObjectGraph graph;


    @Override
    public void onCreate() {
        super.onCreate();

        graph = ObjectGraph.create(getModules().toArray());
    }

    public void inject(Object object) {
        graph.inject(object);
    }

    protected List<Object> getModules() {
        return Arrays.asList((Object) new ProductionModule());
    }

}