package com.manywho.services.manywhoboomi.managers;

import com.manywho.sdk.api.draw.elements.type.TypeElement;
import com.manywho.services.manywhoboomi.ServiceConfiguration;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class DescribeManager {

    @Inject
    public DescribeManager() {

    }

    public List<TypeElement> getListTypeElementFromTableMetadata(ServiceConfiguration serviceConfiguration) throws Exception {
        List<TypeElement> listOfTypeElements = new ArrayList<>();

        return listOfTypeElements;
    }
}
