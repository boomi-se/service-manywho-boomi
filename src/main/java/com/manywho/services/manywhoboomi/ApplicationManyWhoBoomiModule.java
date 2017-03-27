package com.manywho.services.manywhoboomi;

import com.google.inject.AbstractModule;
import com.manywho.sdk.services.types.TypeProvider;
import com.manywho.services.manywhoboomi.managers.DescribeManager;
import com.manywho.services.manywhoboomi.types.RawTypeProvider;

public class ApplicationManyWhoBoomiModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(DescribeManager.class);
        bind(TypeProvider.class).to(RawTypeProvider.class);
    }
}
