package pl.sda;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.awt.*;

@Path("jsonTest")
public class RestServerWithJson {

    @GET()
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{imie}/{nazwisko}/{wiek}")
    public Uczen getText(@PathParam("imie") String imie, @PathParam("nazwisko") String nazwisko, @PathParam("wiek") int wiek) {
        return new Uczen(imie, nazwisko, wiek);
    }

    @GET()
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/withQuery")
    public Uczen getTextQ(@QueryParam("imie") String imie, @QueryParam("nazwisko") String nazwisko, @QueryParam("wiek") int wiek) {
        return new Uczen(imie, nazwisko, wiek);
    }

    @POST
    @Path("/dodaj/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Uczen addTest(Uczen uczen, @PathParam("id") int id) {
        System.out.println("Uczen: " + uczen.imie + " " + uczen.nazwisko + " (" + uczen.wiek + ")");
        uczen.imie = uczen.imie + "!" + id;
        uczen.nazwisko = uczen.nazwisko + "!";

        return uczen;
    }
}