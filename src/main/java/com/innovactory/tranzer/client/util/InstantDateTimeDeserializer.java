package com.innovactory.tranzer.client.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.joda.time.DateTime;
import org.joda.time.Instant;

import java.io.IOException;

public class InstantDateTimeDeserializer extends JsonDeserializer<DateTime> {

    @Override
    public DateTime deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {

        final String stringDate = jp.getText();

        if(stringDate == null || stringDate.trim().isEmpty()) {
            return null;
        }
        Instant instant = Instant.parse(stringDate);
        return new DateTime(instant);
    }
}
