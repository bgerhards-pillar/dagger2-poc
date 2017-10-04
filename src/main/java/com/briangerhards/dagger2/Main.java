package com.briangerhards.dagger2;

import javax.inject.Inject;

public class Main {

    static SomeActivity someActivity;

    public static void main(String[] args) {
        ApplicationComponent appComponent = DaggerApplicationComponent.builder()
                .bookbagModule(new BookbagModule())
                .build();
        Bookbag bookbag = appComponent.getBookbag();
        System.out.println(bookbag.helloWorld());
    }
}
