package com.sample.library.test;

import com.sample.library.Library;

import javax.inject.Inject;


public class LibraryTestImpl implements Library {

    @Inject
    public LibraryTestImpl() {
        // Need this!
    }

    public String getMessage() {
        return "Received message from LibraryTestImpl";
    }

}