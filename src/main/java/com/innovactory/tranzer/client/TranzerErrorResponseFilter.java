package com.innovactory.tranzer.client;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.innovactory.tranzer.client.model.TranzerErrorResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientResponseContext;
import javax.ws.rs.client.ClientResponseFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;


@Provider
public class TranzerErrorResponseFilter implements ClientResponseFilter {

    private static Logger logger = LoggerFactory.getLogger(TranzerErrorResponseFilter.class);

    private ObjectMapper mapper = new ObjectMapper()
            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false);


    @Override
    public void filter(ClientRequestContext requestContext, ClientResponseContext responseContext) throws IOException {
        if (responseContext.getStatus() >= 400) {
            TranzerErrorResponse err;
            try {
                err = mapper.readValue(responseContext.getEntityStream(), TranzerErrorResponse.class);
            } catch (JsonParseException e) {
                String code = String.valueOf(responseContext.getStatusInfo().getStatusCode());
                String message = responseContext.getStatusInfo().getReasonPhrase();
                logger.error("Tranzer error: code = {}, message = {}", code, message);
                err = buildTranzerErrorResponse(code, message);
            }
            throw err;
        }
    }

    private TranzerErrorResponse buildTranzerErrorResponse(String code, String message) {
        TranzerErrorResponse errorResponse = new TranzerErrorResponse();
        errorResponse.setMessage(message);
        errorResponse.setCode(code);

        return errorResponse;
    }
}
