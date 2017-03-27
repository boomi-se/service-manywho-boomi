package com.manywho.services.manywhoboomi.actions;

import com.manywho.sdk.api.ContentType;
import com.manywho.sdk.services.actions.Action;
import com.manywho.services.manywhoboomi.types.ExampleResponse;

@Action.Metadata(name = "Example", summary = "Example summary", uri = "example")
public class ExampleAction {
    public static class Input {
        @Action.Input(name = "Auth Token", contentType = ContentType.String, required = true)
        private String authToken;

        public String getAuthToken() {
            return authToken;
        }
    }

    public static class Output {
        @Action.Output(name = "Flow Responses", contentType = ContentType.Object)
        private ExampleResponse response;

        public Output(ExampleResponse response) {
            this.response = response;
        }
    }
}
