package com.test;

import org.apache.cxf.jaxrs.ext.PATCH;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * @author t.varada.
 */
@Path("/")
public class HelloWorldImpl /*implements HelloWorld */{

    @GET
    @Path("sayHi")
    @Produces("application/json")
    public String sayHi(/*String name*/) {
        return "Hello Varada";// + name;
    }
}
