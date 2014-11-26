package com.sample.library;

import javax.inject.Inject;


public class ServiceImpl implements Service {

    @Inject
    public ServiceImpl() {

    }

    @Override
    public int getValue() {
        return 123;
    }

}
