package com.manywho.services.manywhoboomi.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ExampleController {

    @Path("/example")
    @POST
    public String describe() throws Exception {
        return "{\"hello\":  \"world\"}";
    }
}
