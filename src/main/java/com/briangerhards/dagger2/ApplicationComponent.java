package com.briangerhards.dagger2;

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {BookbagModule.class})
public interface ApplicationComponent {
        Bookbag getBookbag();
}
