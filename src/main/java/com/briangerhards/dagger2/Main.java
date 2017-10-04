package com.briangerhards.dagger2;

public class Main {

    public static void main(String[] args) {
        ApplicationComponent appComponent = DaggerApplicationComponent.create();
        Bookbag bookbag = appComponent.getBookbag();
        System.out.println(bookbag.helloWorld());
    }
}
