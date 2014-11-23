package com.sample.library.dagger;

import com.sample.library.Library;
import com.sample.library.test.LibraryTestImpl;

import dagger.Module;
import dagger.Provides;


@Module(
        includes = ProductionModule.class,
        library = true,
        injects = Library.class,
        overrides = true
)
public class RoboModule {

    @Provides
    public Library provideLibrary() {
        return new LibraryTestImpl();
    }

}