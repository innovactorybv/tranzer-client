package com.innovactory.tranzer.client.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE, getterVisibility = JsonAutoDetect.Visibility.NONE, isGetterVisibility = JsonAutoDetect.Visibility.NONE, creatorVisibility = JsonAutoDetect.Visibility.NONE )
@JsonIgnoreProperties(ignoreUnknown = true)
public class TranzerMediaFrontBack {

    @JsonProperty("front")
    private TranzerMediaFrontBackData front;

    @JsonProperty("back")
    private TranzerMediaFrontBackData back;

    public TranzerMediaFrontBackData getFront() {
        return front;
    }

    public void setFront(TranzerMediaFrontBackData front) {
        this.front = front;
    }

    public TranzerMediaFrontBackData getBack() {
        return back;
    }

    public void setBack(TranzerMediaFrontBackData back) {
        this.back = back;
    }
}
