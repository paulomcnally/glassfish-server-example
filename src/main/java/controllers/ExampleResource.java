package controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by paulomcnally on 5/8/14.
 */
@Path("/example")
public class ExampleResource {

    @Path("/all")
    @GET
    @Produces("*/*")
    public String getAll(){
        return "McNally";

    }

}
