package com.sample.library;

import org.junit.Test;

import dagger.ObjectGraph;

import com.sample.library.dagger.TestModule;

import static org.junit.Assert.*;


public class PojoTest {

    @Test
    public void testLibrary() {
        ObjectGraph objectGraph = ObjectGraph.create(new TestModule());

        Library library = objectGraph.get(Library.class);
        assertNotNull(library);
        assertEquals("Received message from LibraryTestImpl", library.getMessage());

        Service service = objectGraph.get(Service.class);
        assertNotNull(service);
        assertEquals(123, service.getValue());
    }

}