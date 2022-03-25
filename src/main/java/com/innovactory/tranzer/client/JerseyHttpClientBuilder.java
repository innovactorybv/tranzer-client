package com.innovactory.tranzer.client;

import com.innovactory.jersey.JerseyClientBuilder;
import org.glassfish.jersey.filter.LoggingFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.client.ClientRequestFilter;

public class JerseyHttpClientBuilder {

    public static <T> T buildClient(Class<T> api, String baseUrl, int connectionPoolSize, String username, String password, ClientRequestFilter clientRequestFilter) {
        final Logger logger = LoggerFactory.getLogger(api);
        JerseyClientBuilder clientBuilder = JerseyClientBuilder.newBuilder(baseUrl)
                .poolSize(connectionPoolSize)
                .basicAuthentication(username, password)
                .enableJackson("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                .register(new LoggingFilter(new LogBridge(logger, api.getSimpleName() + baseUrl), true))
                .register(new TranzerErrorResponseFilter());
        if (clientRequestFilter != null) {
            clientBuilder = clientBuilder.register(clientRequestFilter);
        }
        return clientBuilder.target(api);
    }
}
