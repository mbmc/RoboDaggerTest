package com.sample.library;

import javax.inject.Inject;


public class LibraryImpl implements Library {

    @Inject
    public LibraryImpl() {
        // Need this!
    }

    public String getMessage() {
        return "Received message from LibraryImpl";
    }

}