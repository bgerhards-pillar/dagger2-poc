package com.briangerhards.dagger2;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class BookbagModule {

    public BookbagModule(){}

    @Provides
    @Singleton
    public Bookbag provideBookBag(TrapperKeeper trapperKeeper){
        return new Bookbag(trapperKeeper);
    }

}
