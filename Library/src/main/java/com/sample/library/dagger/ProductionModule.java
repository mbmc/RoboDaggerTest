package com.sample.library.dagger;

import com.sample.library.Library;
import com.sample.library.LibraryImpl;
import com.sample.library.Service;
import com.sample.library.ServiceImpl;

import dagger.Module;
import dagger.Provides;


@Module(library = true)
public class ProductionModule {

    @Provides
    public Library provideLibrary() {
        return new LibraryImpl();
    }

    @Provides
    public Service provideService() {
        return new ServiceImpl();
    }

}