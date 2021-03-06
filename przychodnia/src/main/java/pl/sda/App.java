package pl.sda;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;

import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App 
{
    public static void main( String[] args ) {

        JAXRSServerFactoryBean factoryBean = new JAXRSServerFactoryBean();
        factoryBean.setAddress("http://localhost:8080/");

        Map<Object, Object> extensionMappings = new HashMap<>();
        extensionMappings.put("json", MediaType.APPLICATION_JSON);
        factoryBean.setExtensionMappings(extensionMappings);

        List<Object> providers = new ArrayList<>();
        providers.add(new JacksonJsonProvider());
        factoryBean.setProviders(providers);

        factoryBean.setResourceClasses(Wizyty.class);

        factoryBean.setResourceProvider(new SingletonResourceProvider(new Wizyty()));

        Server server = factoryBean.create();
    }
}
