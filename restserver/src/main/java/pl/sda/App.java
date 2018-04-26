package pl.sda;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;
import org.slf4j.*;

public class App {
    static Logger LOGGER = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        JAXRSServerFactoryBean factoryBean = new JAXRSServerFactoryBean();
        factoryBean.setResourceClasses(RestServerImpl.class);

        factoryBean.setResourceProvider(
                new SingletonResourceProvider(new RestServerImpl()));

        factoryBean.setAddress("http://localhost:8080/");

        Server server = factoryBean.create();
    }
}
