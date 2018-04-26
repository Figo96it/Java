package pl.sda;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.jaxrs.client.AbstractClient;
import org.apache.cxf.jaxrs.client.WebClient;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class AppJson {
    public static void main(String[] args) {
        List<Object> providers = new ArrayList<Object>();
        providers.add(new JacksonJsonProvider());

        WebClient client = WebClient.create("http://localhost:8081/jsonTest/withQuery", providers);
        client.query("imie", "P");
        client.query("nazwisko", "W");
        client.query("wiek", 25);

        Uczen u = client.accept(MediaType.APPLICATION_JSON).get(Uczen.class);
        System.out.println("Uczen: " + u.imie + " " + u.nazwisko + " (" + u.wiek + ")");

        client.close();

        // -------------------------------------------------------------

        client = WebClient.create("http://localhost:8081/jsonTest/dodaj/5", providers);
        Uczen uInput = new Uczen("W1", "W2", 32);
        Uczen u1 = client.accept(MediaType.APPLICATION_JSON)    // HTTP Accept header
                .type(MediaType.APPLICATION_JSON)               // Content-Type header
                .post(uInput)                                   // Request body
                .readEntity(Uczen.class);                       // Response
        System.out.println("Uczen: " + u1.imie + " " + u1.nazwisko + " (" + u1.wiek + ")");

        client.close();
    }
}
