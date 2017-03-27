package com.manywho.services.manywhoboomi;

import com.manywho.sdk.api.ContentType;
import com.manywho.sdk.services.configuration.Configuration;

public class ServiceConfiguration implements Configuration {
    @Configuration.Setting(name="Username", contentType= ContentType.String)
    private String username;

    public String getUsername() {
        return username;
    }
}
