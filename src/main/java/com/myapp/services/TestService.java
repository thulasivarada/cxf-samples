package com.myapp.services;

/**
 * Created by chida on 2/2/16.
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/")
public class TestService {

    @GET
    @Path("/get")
    public String  test(){
        return "Hello";
    }



}
