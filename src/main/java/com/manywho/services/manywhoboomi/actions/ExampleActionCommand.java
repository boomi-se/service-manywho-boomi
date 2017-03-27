package com.manywho.services.manywhoboomi.actions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.manywho.sdk.api.InvokeType;
import com.manywho.sdk.api.run.elements.config.ServiceRequest;
import com.manywho.sdk.services.actions.ActionCommand;
import com.manywho.sdk.services.actions.ActionResponse;
import com.manywho.services.manywhoboomi.ServiceConfiguration;
import com.manywho.services.manywhoboomi.types.ExampleResponse;
import javax.inject.Inject;


public class ExampleActionCommand implements ActionCommand<ServiceConfiguration, LaunchFlowAction, LaunchFlowAction.Input, LaunchFlowAction.Output> {

    private ObjectMapper objectMapper;

    @Inject
    public ExampleActionCommand(ObjectMapper objectMapper)
    {
        this.objectMapper = objectMapper;
    }

    @Override
    public ActionResponse<LaunchFlowAction.Output> execute(ServiceConfiguration serviceConfiguration, ServiceRequest serviceRequest, LaunchFlowAction.Input input) {
       ExampleResponse rateResponse = new ExampleResponse("1", "example decription");
        // get input properties
        //input.getAuthToken()
        ActionResponse<LaunchFlowAction.Output> response = new ActionResponse<>(new LaunchFlowAction.Output(rateResponse), InvokeType.Forward);

        return response;
    }
}
