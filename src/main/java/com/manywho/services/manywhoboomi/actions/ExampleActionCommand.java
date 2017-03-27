package com.manywho.services.manywhoboomi.actions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.manywho.sdk.api.InvokeType;
import com.manywho.sdk.api.run.elements.config.ServiceRequest;
import com.manywho.sdk.services.actions.ActionCommand;
import com.manywho.sdk.services.actions.ActionResponse;
import com.manywho.services.manywhoboomi.ServiceConfiguration;
import com.manywho.services.manywhoboomi.types.ExampleResponse;
import javax.inject.Inject;


public class ExampleActionCommand implements ActionCommand<ServiceConfiguration, ExampleAction, ExampleAction.Input, ExampleAction.Output> {

    private ObjectMapper objectMapper;

    @Inject
    public ExampleActionCommand(ObjectMapper objectMapper)
    {
        this.objectMapper = objectMapper;
    }

    @Override
    public ActionResponse<ExampleAction.Output> execute(ServiceConfiguration serviceConfiguration, ServiceRequest serviceRequest, ExampleAction.Input input) {
       ExampleResponse rateResponse = new ExampleResponse("1", "example decription");
        // get input properties
        //input.getAuthToken()
        ActionResponse<ExampleAction.Output> response = new ActionResponse<>(new ExampleAction.Output(rateResponse), InvokeType.Forward);

        return response;
    }
}
