package com.innovactory.tranzer.client;

import com.innovactory.api.logging.LogApi;
import com.innovactory.tranzer.client.model.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Produces(TranzerVersionUtil.API_PRODUCES)
@Consumes(TranzerVersionUtil.API_CONSUMES)
public interface TranzerApi {

    @GET
    @Path("/api/v1/day-ticket-product")
    List<TranzerProduct> listProducts(@HeaderParam("Accept-Language") String language);

    @POST
    @Path("/api/v1/day-ticket-product/{dayTicketProductId}/order/")
    @LogApi
    TranzerOffer orderProduct(@HeaderParam("Accept-Language") String language, @PathParam("dayTicketProductId") Integer dayTicketProductId, TranzerOrderProductRequest request);

    @GET
    @Path("/api/v1/day-ticket-offer/{dayTicketOfferId}/")
    TranzerOffer getOffer(@HeaderParam("Accept-Language") String language, @PathParam("dayTicketOfferId") Integer dayTicketOfferId);

    @POST
    @Path("/api/v1/day-ticket-offer/{dayTicketOfferId}/purchase/")
    @LogApi
    TranzerPurchaseOfferResponse purchaseOffer(@HeaderParam("Accept-Language") String language, @PathParam("dayTicketOfferId") Integer dayTicketOfferId, TranzerPurchaseOfferRequest request);

    @PUT
    @Path("/api/v1/day-ticket-offer/{dayTicketOfferId}/activate/")
    @LogApi
    TranzerOffer activateOffer(@HeaderParam("Accept-Language") String language, @PathParam("dayTicketOfferId") Integer dayTicketOfferId, TranzerActivateOfferRequest request);
}
