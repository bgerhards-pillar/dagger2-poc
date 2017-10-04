package com.briangerhards.dagger2;

import javax.inject.Inject;

public class Bookbag {

    private TrapperKeeper trapperKeeper;

    @Inject
    public Bookbag(TrapperKeeper trapperKeeper) {
        this.trapperKeeper = trapperKeeper;
    }

    public String helloWorld(){
        return "Hello world";
    }


}
