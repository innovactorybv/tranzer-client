package com.innovactory.tranzer.client.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE, getterVisibility = JsonAutoDetect.Visibility.NONE, isGetterVisibility = JsonAutoDetect.Visibility.NONE, creatorVisibility = JsonAutoDetect.Visibility.NONE )
@JsonIgnoreProperties(ignoreUnknown = true)
public class TranzerMedia {

    @JsonProperty("virgin")
    private TranzerMediaFrontBack virgin;

    @JsonProperty("valid")
    private TranzerMediaFrontBack valid;

    @JsonProperty("expired")
    private TranzerMediaFrontBack expired;

    public TranzerMediaFrontBack getVirgin() {
        return virgin;
    }

    public void setVirgin(TranzerMediaFrontBack virgin) {
        this.virgin = virgin;
    }

    public TranzerMediaFrontBack getValid() {
        return valid;
    }

    public void setValid(TranzerMediaFrontBack valid) {
        this.valid = valid;
    }

    public TranzerMediaFrontBack getExpired() {
        return expired;
    }

    public void setExpired(TranzerMediaFrontBack expired) {
        this.expired = expired;
    }
}
