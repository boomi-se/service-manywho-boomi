package com.manywho.services.manywhoboomi.types;

import com.manywho.sdk.api.ContentType;
import com.manywho.sdk.services.types.Type;

@Type.Element(name = LaunchFlowResponse.NAME, summary = "Launch Flow Response")
public class LaunchFlowResponse implements Type {
    public final static String NAME = "Example Response";

    @Type.Identifier
    private String id;

    @Type.Property(name = "Description", contentType = ContentType.String)
    private String description;

    public LaunchFlowResponse(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }
}
