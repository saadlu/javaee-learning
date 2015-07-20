package net.mashrur.learning.javaee.rest;


import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/book")
@Produces({MediaType.TEXT_PLAIN})
@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Stateless
public class BookRestService {

    @GET
    @Path("{id}")
    public Response getBook(@PathParam("id") String id){
        return Response.ok("this is a test: " + id ).build();
    }

}
