package com.sample.app.dagger;

import com.sample.app.MainActivity;

import dagger.Module;


@Module(
        injects = MainActivity.class,
        complete = false
)
public class ProductionModule {

}