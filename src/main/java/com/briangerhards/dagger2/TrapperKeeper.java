package com.briangerhards.dagger2;

import javax.inject.Inject;

public class TrapperKeeper {
    String note;

    @Inject
    TrapperKeeper(){
        this.note = "Hello world";
    }

    public String getNote(){
        return this.note;
    }

}
