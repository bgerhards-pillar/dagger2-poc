package com.briangerhards.dagger2;

import javax.inject.Inject;

public class SomeActivity {
    @Inject Bookbag bookbag;

    public SomeActivity(){
    }

    public void LetsDoSometing(){
        bookbag.helloWorld();
    }
}
