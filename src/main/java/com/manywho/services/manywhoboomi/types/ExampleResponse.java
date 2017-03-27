package com.manywho.services.manywhoboomi.types;

import com.manywho.sdk.api.ContentType;
import com.manywho.sdk.services.types.Type;

@Type.Element(name = ExampleResponse.NAME, summary = "Example Response")
public class ExampleResponse implements Type {
    public final static String NAME = "Example Response";

    @Type.Identifier
    private String id;

    @Type.Property(name = "Description", contentType = ContentType.String)
    private String description;

    public ExampleResponse(String id, String description) {
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
