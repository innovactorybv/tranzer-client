package com.innovactory.tranzer.client;

import com.innovactory.tranzer.client.model.*;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.client.ClientRequestContext;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import static com.innovactory.tranzer.client.JerseyHttpClientBuilder.buildClient;
import static java.util.Collections.singletonList;

public class TranzerClient {

    private static final String GRANT_TYPE = "client_credentials";

    private final TranzerAuthApi authApi;
    private final TranzerApi api;
    private final String clientSecret;
    private final String clientId;

    private final AtomicReference<TranzerTokenResponse> tokenRef = new AtomicReference<>();

    public TranzerClient(String baseUrl, String authBaseUrl, String clientId, String clientSecret, int connectionPoolSize)  {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.authApi = buildClient(TranzerAuthApi.class, authBaseUrl, connectionPoolSize, clientId, clientSecret, null);
        this.api = buildClient(TranzerApi.class, baseUrl, connectionPoolSize, null, null, this::setAuthHeader);
    }

    public List<TranzerProduct> listProducts(String language) throws TranzerErrorResponse {
        try {
            return api.listProducts(language);
        } catch (ProcessingException ex) {
            if (ex.getCause() != null && ex.getCause() instanceof TranzerErrorResponse) {
                throw (TranzerErrorResponse) ex.getCause();
            }
            throw ex;
        }
    }

    public TranzerOffer orderProduct(String language, Integer dayTicketProductId, TranzerOrderProductRequest request) throws TranzerErrorResponse {
        try {
            return api.orderProduct(language, dayTicketProductId, request);
        } catch (ProcessingException ex) {
            if (ex.getCause() != null && ex.getCause() instanceof TranzerErrorResponse) {
                throw (TranzerErrorResponse) ex.getCause();
            }
            throw ex;
        }
    }

    public TranzerOffer getOffer(String language, Integer dayTicketOfferId) throws TranzerErrorResponse {
        try {
            return api.getOffer(language, dayTicketOfferId);
        } catch (ProcessingException ex) {
            if (ex.getCause() != null && ex.getCause() instanceof TranzerErrorResponse) {
                throw (TranzerErrorResponse) ex.getCause();
            }
            throw ex;
        }
    }

    public TranzerPurchaseOfferResponse purchaseOffer(String language, Integer dayTicketOfferId, TranzerPurchaseOfferRequest request) throws TranzerErrorResponse {
        try {
            return api.purchaseOffer(language, dayTicketOfferId, request);
        } catch (ProcessingException ex) {
            if (ex.getCause() != null && ex.getCause() instanceof TranzerErrorResponse) {
                throw (TranzerErrorResponse) ex.getCause();
            }
            throw ex;
        }
    }

    public TranzerOffer activateOffer(String language, Integer dayTicketOfferId, TranzerActivateOfferRequest request) throws TranzerErrorResponse {
        try {
            return api.activateOffer(language, dayTicketOfferId, request);
        } catch (ProcessingException ex) {
            if (ex.getCause() != null && ex.getCause() instanceof TranzerErrorResponse) {
                throw (TranzerErrorResponse) ex.getCause();
            }
            throw ex;
        }
    }

    private synchronized void ensureToken() {
        TranzerTokenResponse authResponse = tokenRef.get();
        if (authResponse == null || authResponse.isExpired()) {
            authResponse = authApi.token(GRANT_TYPE);
            authResponse.calculateExpirationTime();
            tokenRef.set(authResponse);
        }
    }

    private void setAuthHeader(ClientRequestContext requestContext) {
        ensureToken();
        requestContext
                .getHeaders()
                .put("Authorization", singletonList("Bearer " + tokenRef.get().getAccessToken()));
    }
}
