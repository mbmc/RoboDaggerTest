package com.sample.library.dagger;

import com.sample.library.Library;
import com.sample.library.test.LibraryTestImpl;

import dagger.Module;
import dagger.Provides;


@Module(
        library = true,
        injects = Library.class
)
public class PojoModule {

    @Provides
    public Library provideLibrary() {
        return new LibraryTestImpl();
    }

}