package pl.sda;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.HashMap;

public class Wizyty {

    private Przychodnia przychodnia = new Przychodnia();

    @GET
    @Path("listaLekarzy")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Lekarz> getListLekarzy () {

        return przychodnia.getListLekarzy();
    }

    @GET
    @Path("listaLekarzy/{lekarzId}/godzinyPrzyjec")
    @Produces(MediaType.APPLICATION_JSON)
    public HashMap<Integer, String> getGodzinyPrzyjec (@PathParam("lekarzId") String id) {

        return przychodnia.getGodzinyPrzyjec(id);
    }

    @POST
    @Path("listaLekarzy/{lekarzId}/rezerwacja")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean zarezerwuj (@PathParam("lekarzId") String lekarzId, @QueryParam("slot") Integer slot) {

        return przychodnia.zarezerwuj(lekarzId, slot);
    }

}
