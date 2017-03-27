package com.manywho.services.manywhoboomi.types;

import com.manywho.sdk.api.describe.DescribeServiceRequest;
import com.manywho.sdk.api.draw.elements.type.TypeElement;
import com.manywho.sdk.services.configuration.ConfigurationParser;
import com.manywho.sdk.services.types.TypeProvider;
import com.manywho.services.manywhoboomi.ServiceConfiguration;
import com.manywho.services.manywhoboomi.managers.DescribeManager;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class RawTypeProvider implements TypeProvider {

    private ConfigurationParser configurationParser;

    @Inject
    public RawTypeProvider(ConfigurationParser configurationParser) {
        this.configurationParser = configurationParser;
    }

    @Override
    public boolean doesTypeExist(String s) {
        return true;
    }

    @Override
    public List<TypeElement> describeTypes(DescribeServiceRequest describeServiceRequest) {
        ServiceConfiguration serviceConfiguration = configurationParser.from(describeServiceRequest);
        // create dynamic types
        // call describe manager
        return new ArrayList<>();
    }
}
