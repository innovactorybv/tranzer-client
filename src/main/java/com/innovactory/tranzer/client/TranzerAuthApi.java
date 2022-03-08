package com.innovactory.tranzer.client;


import com.innovactory.tranzer.client.model.TranzerTokenResponse;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

public interface TranzerAuthApi {

    @POST
    @Path("/api/v1/auth/token/")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    TranzerTokenResponse token(@FormParam("grant_type") String grantType);
}
