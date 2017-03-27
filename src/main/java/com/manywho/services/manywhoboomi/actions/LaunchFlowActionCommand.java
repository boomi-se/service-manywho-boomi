package com.manywho.services.manywhoboomi.actions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.manywho.sdk.api.InvokeType;
import com.manywho.sdk.api.run.elements.config.ServiceRequest;
import com.manywho.sdk.services.actions.ActionCommand;
import com.manywho.sdk.services.actions.ActionResponse;
import com.manywho.services.manywhoboomi.ServiceConfiguration;
import com.manywho.services.manywhoboomi.types.LaunchFlowResponse;
import javax.inject.Inject;


public class LaunchFlowActionCommand implements ActionCommand<ServiceConfiguration, LaunchFlowAction, LaunchFlowAction.Input, LaunchFlowAction.Output> {

    private ObjectMapper objectMapper;

    @Inject
    public LaunchFlowActionCommand(ObjectMapper objectMapper)
    {
        this.objectMapper = objectMapper;
    }

    @Override
    public ActionResponse<LaunchFlowAction.Output> execute(ServiceConfiguration serviceConfiguration, ServiceRequest serviceRequest, LaunchFlowAction.Input input) {
       LaunchFlowResponse launchFlowResponse = new LaunchFlowResponse("1", "example decription");
        // get input properties
        //input.getAuthToken()
        ActionResponse<LaunchFlowAction.Output> response = new ActionResponse<>(new LaunchFlowAction.Output(launchFlowResponse), InvokeType.Forward);

        return response;
    }
}
