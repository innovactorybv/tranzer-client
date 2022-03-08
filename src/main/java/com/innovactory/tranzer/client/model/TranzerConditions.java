package com.innovactory.tranzer.client.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE, getterVisibility = JsonAutoDetect.Visibility.NONE, isGetterVisibility = JsonAutoDetect.Visibility.NONE, creatorVisibility = JsonAutoDetect.Visibility.NONE )
@JsonIgnoreProperties(ignoreUnknown = true)
public class TranzerConditions {

    @JsonProperty("url")
    private String url;

    @JsonProperty("oneliner")
    private String oneliner;

    @JsonProperty("full_text")
    private String fullText;

    @JsonProperty("howto_link")
    private String howtoLink;

    @JsonProperty("conditions_link")
    private String conditionsLink;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOneliner() {
        return oneliner;
    }

    public void setOneliner(String oneliner) {
        this.oneliner = oneliner;
    }

    public String getFullText() {
        return fullText;
    }

    public void setFullText(String fullText) {
        this.fullText = fullText;
    }

    public String getHowtoLink() {
        return howtoLink;
    }

    public void setHowtoLink(String howtoLink) {
        this.howtoLink = howtoLink;
    }

    public String getConditionsLink() {
        return conditionsLink;
    }

    public void setConditionsLink(String conditionsLink) {
        this.conditionsLink = conditionsLink;
    }
}
