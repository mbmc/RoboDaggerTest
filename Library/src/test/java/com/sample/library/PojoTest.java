package com.sample.library;

import org.junit.Test;

import dagger.ObjectGraph;

import com.sample.library.dagger.PojoModule;

import static org.junit.Assert.*;


public class PojoTest {

    @Test
    public void testLibrary() {
        ObjectGraph objectGraph = ObjectGraph.create(new PojoModule());
        Library library = objectGraph.get(Library.class);
        assertNotNull(library);
        assertEquals("Received message from LibraryTestImpl", library.getMessage());
    }

}