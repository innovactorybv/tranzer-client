package com.innovactory.tranzer.client.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE, getterVisibility = JsonAutoDetect.Visibility.NONE, isGetterVisibility = JsonAutoDetect.Visibility.NONE, creatorVisibility = JsonAutoDetect.Visibility.NONE )
public class TranzerTokenResponse {

    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("expires_in")
    private Integer expireSecs;

    @JsonProperty("token_type")
    private String tokenType;

    @JsonProperty("scope")
    private String scope;

    private long expirationTime = 0;

    public String getAccessToken() {
        return accessToken;
    }

    public TranzerTokenResponse setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    public Integer getExpireSecs() {
        return expireSecs;
    }

    public void setExpireSecs(Integer expireSecs) {
        this.expireSecs = expireSecs;
    }

    public String getTokenType() {
        return tokenType;
    }

    public TranzerTokenResponse setTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    public String getScope() {
        return scope;
    }

    public TranzerTokenResponse setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public boolean isExpired() {
        return expirationTime < System.currentTimeMillis();
    }

    public void calculateExpirationTime() {
        expireSecs = Math.max(60 * 60, expireSecs);
        expirationTime = System.currentTimeMillis() + (expireSecs * 1000L) - 60000L;
    }
}
