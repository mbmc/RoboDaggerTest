package com.sample.library.dagger;

import com.sample.library.Library;
import com.sample.library.LibraryImpl;

import dagger.Module;
import dagger.Provides;


@Module(library = true)
public class ProductionModule {

    @Provides
    public Library provideLibrary() {
        return new LibraryImpl();
    }

}