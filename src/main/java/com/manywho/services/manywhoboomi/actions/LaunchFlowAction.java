package com.manywho.services.manywhoboomi.actions;

import com.manywho.sdk.api.ContentType;
import com.manywho.sdk.services.actions.Action;
import com.manywho.services.manywhoboomi.types.LaunchFlowResponse;

@Action.Metadata(name = "Launch Flow", summary = "Launch Flow Summary", uri = "launch-flow")
public class LaunchFlowAction {
    public static class Input {
        @Action.Input(name = "Auth Token", contentType = ContentType.String, required = true)
        private String authToken;

        public String getAuthToken() {
            return authToken;
        }
    }

    public static class Output {
        @Action.Output(name = "Flow Responses", contentType = ContentType.Object)
        private LaunchFlowResponse launchFlowResponse;

        public Output(LaunchFlowResponse response) {
            this.launchFlowResponse = response;
        }
    }
}
