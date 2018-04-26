package pl.sda;

import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.jaxrs.client.Client;
import org.apache.cxf.jaxrs.client.WebClient;

import javax.ws.rs.core.Response;
import java.io.IOException;
import java.io.InputStream;

public class App {
    public static void main(String[] args) {
        WebClient client = WebClient.create("http://localhost:8080/test");
        //Client
        //WebTarget .queryParam
        Response r = client.accept("text/plain").get();
        System.out.println("Status: " + r.getStatus());
        try {
            System.out.println("Response: " + IOUtils.toString((InputStream) r.getEntity()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
