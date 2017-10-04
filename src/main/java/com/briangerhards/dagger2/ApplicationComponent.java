package com.briangerhards.dagger2;

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component()
public interface ApplicationComponent {
        Bookbag getBookbag();
}
