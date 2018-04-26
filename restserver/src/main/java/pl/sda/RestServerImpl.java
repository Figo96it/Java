package pl.sda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("test")
public class RestServerImpl {

    static Logger LOGGER = LoggerFactory.getLogger(RestServerImpl.class);

    @GET
    @Produces("text/plain")
    public String getText() {
        return "To jest testowy tekst Ziomek!";
    }


    @PUT
    @Path("dodaj/{id}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces("text/plain")
    public Response addTest(@PathParam("id") int id, String body) {
        System.out.println("Dodaje nowy obiekt id: " + id + ", body: " + body);

        return Response.accepted(true).build();
    }
}
