package com.innovactory.tranzer.client;

import com.innovactory.tranzer.client.model.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class TranzerClientTest {

    private static final String LANGUAGE_ENGLISH = "en-NL";
    private static final String LANGUAGE_DUTCH = "nl-NL";

    private TranzerClient client;

    @Before
    public void init() {
        client = new TranzerClient(
                "https://acc.tranzer.com",
                "https://acc.tranzer.com",
                "ZN22MWHqofNZ6ou2AGz7U83xhcZ4j9gto9RkUUVb",
                "193QeeQU8zqnBirabXPHIci8ZvfrBOsL7MQNtrz1yQN56G776UPTxyK0FWGNeVZ0Mb719nbDXc0dU0N7pKSuKoBqitud57HasSKEza7phNkWM9kvcEdq9L80jeFcQO3a",
                1
        );
    }

    @Test
    public void testActivateOffer() throws TranzerErrorResponse {
        TranzerProduct product = listProducts().stream().findAny().get();
        Integer dayTicketProductId = product.getId();

        TranzerOffer orderedOffer = orderProduct(dayTicketProductId);
        Integer dayTicketOfferId = orderedOffer.getId();

        getOffer(dayTicketOfferId);
        purchaseOffer(dayTicketOfferId);
        activateOffer(dayTicketOfferId);
    }

    public List<TranzerProduct> listProducts() throws TranzerErrorResponse {
        List<TranzerProduct> productList = client.listProducts(LANGUAGE_ENGLISH);
        List<TranzerProduct> gvbProductList = productList.stream().filter(product -> product.getDayTicketChannel().equals("nl_gvb_day")).collect(Collectors.toList());
        assertEquals(2, gvbProductList.size());
        return gvbProductList;
    }

    public TranzerOffer orderProduct(Integer dayTicketProductId) throws TranzerErrorResponse {
        TranzerOffer offer = client.orderProduct(LANGUAGE_ENGLISH, dayTicketProductId, buildTranzerOrderProductRequest());
        assertEquals(1, offer.getTickets().size());
        assertNotNull(offer.getDayTicketProduct().getServiceFees());
        return offer;
    }

    public TranzerOffer getOffer(Integer dayTicketOfferId) throws TranzerErrorResponse {
        TranzerOffer offer = client.getOffer(LANGUAGE_ENGLISH, dayTicketOfferId);
        assertEquals(1, offer.getTickets().size());
        assertNotNull(offer.getDayTicketProduct().getServiceFees());
        return offer;
    }

    public TranzerPurchaseOfferResponse purchaseOffer(Integer dayTicketOfferId) throws TranzerErrorResponse {
        TranzerPurchaseOfferResponse purchasedOffer = client.purchaseOffer(LANGUAGE_ENGLISH, dayTicketOfferId, buildTranzerPurchaseOfferRequest());
        assertTrue(purchasedOffer.getSucceeded());
        assertEquals(dayTicketOfferId, purchasedOffer.getDayTicketOfferId());
        return purchasedOffer;
    }

    public TranzerOffer activateOffer(Integer dayTicketOfferId) throws TranzerErrorResponse {
        TranzerOffer activatedOffer = client.activateOffer(LANGUAGE_ENGLISH, dayTicketOfferId, buildTranzerActivateOfferRequest());
        assertEquals("active", activatedOffer.getStatus());
        assertEquals(1, activatedOffer.getTickets().size());

        TranzerTicket ticket = activatedOffer.getTickets().get(0);
        assertEquals("valid", ticket.getStatus());
        assertNotNull(ticket.getValidityStart());
        assertNotNull(ticket.getValidityEnd());
        assertNotNull(ticket.getBarcode());
        assertNotNull(ticket.getValidOn());

        assertNotNull(ticket.getMedia());
        assertNotNull(ticket.getMedia().getValid().getFront().getUrl());
        assertNotNull(ticket.getMedia().getValid().getFront().getType());
        assertNotNull(ticket.getMedia().getValid().getBack().getUrl());
        assertNotNull(ticket.getMedia().getValid().getBack().getType());

        return activatedOffer;
    }

    private TranzerOrderProductRequest buildTranzerOrderProductRequest() {
        TranzerOrderProductRequest request = new TranzerOrderProductRequest();
        TranzerPassenger passenger = new TranzerPassenger();
        passenger.setFirstName("Bob");
        passenger.setLastName("Saget");
        request.setPassengers(Collections.singletonList(passenger));
        return request;
    }

    private TranzerPurchaseOfferRequest buildTranzerPurchaseOfferRequest() {
        TranzerPurchaseOfferRequest request = new TranzerPurchaseOfferRequest();
        request.setPaymentMethod("Innovactory/Gaiyo");
        return request;
    }

    private TranzerActivateOfferRequest buildTranzerActivateOfferRequest() {
        TranzerActivateOfferRequest request = new TranzerActivateOfferRequest();
        request.setPaymentMethod("Innovactory/Gaiyo");
        return request;
    }

}