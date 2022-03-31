package com.innovactory.tranzer.client.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.joda.time.DateTime;

import java.io.IOException;

public class InstantDateTimeSerializer extends JsonSerializer<DateTime> {

    @Override
    public void serialize(DateTime time, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        if(time != null) {
            jsonGenerator.writeString(
                    time.toInstant().toString()
            );
        } else {
            jsonGenerator.writeNull();
        }
    }

}
