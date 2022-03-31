package com.innovactory.tranzer.client.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.innovactory.tranzer.client.util.InstantDateTimeDeserializer;
import com.innovactory.tranzer.client.util.InstantDateTimeSerializer;
import org.joda.time.DateTime;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE, getterVisibility = JsonAutoDetect.Visibility.NONE, isGetterVisibility = JsonAutoDetect.Visibility.NONE, creatorVisibility = JsonAutoDetect.Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TranzerProduct {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("logo")
    private String logo;

    @JsonProperty("logo_white")
    private String logoWhite;

    @JsonProperty("background_color")
    private String backgroundColor;

    @JsonProperty("day_ticket_channel")
    private String dayTicketChannel;

    @JsonProperty("price")
    private Double price;

    @JsonProperty("price_currency")
    private String priceCurrency;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("offer_start")
    @JsonDeserialize(using = InstantDateTimeDeserializer.class)
    @JsonSerialize(using = InstantDateTimeSerializer.class)
    private DateTime offerStart;

    @JsonProperty("offer_end")
    @JsonDeserialize(using = InstantDateTimeDeserializer.class)
    @JsonSerialize(using = InstantDateTimeSerializer.class)
    private DateTime offerEnd;

    @JsonProperty("validity_fence")
    private TranzerValidityFence validityFence;

    @JsonProperty("conditions")
    private String conditions;

    @JsonProperty("travel_predicates")
    private List<TranzerTravelPredicate> travelPredicates;

    @JsonProperty("validity_string")
    private String validityString;

    @JsonProperty("validity_days")
    private List<Integer> validityDays;

    @JsonProperty("validity_duration")
    private String validityDuration;

    @JsonProperty("service_fees")
    private List<TranzerServiceFee> serviceFees;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLogoWhite() {
        return logoWhite;
    }

    public void setLogoWhite(String logoWhite) {
        this.logoWhite = logoWhite;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getDayTicketChannel() {
        return dayTicketChannel;
    }

    public void setDayTicketChannel(String dayTicketChannel) {
        this.dayTicketChannel = dayTicketChannel;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPriceCurrency() {
        return priceCurrency;
    }

    public void setPriceCurrency(String priceCurrency) {
        this.priceCurrency = priceCurrency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public DateTime getOfferStart() {
        return offerStart;
    }

    public void setOfferStart(DateTime offerStart) {
        this.offerStart = offerStart;
    }

    public DateTime getOfferEnd() {
        return offerEnd;
    }

    public void setOfferEnd(DateTime offerEnd) {
        this.offerEnd = offerEnd;
    }

    public TranzerValidityFence getValidityFence() {
        return validityFence;
    }

    public void setValidityFence(TranzerValidityFence validityFence) {
        this.validityFence = validityFence;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public List<TranzerTravelPredicate> getTravelPredicates() {
        return travelPredicates;
    }

    public void setTravelPredicates(List<TranzerTravelPredicate> travelPredicates) {
        this.travelPredicates = travelPredicates;
    }

    public String getValidityString() {
        return validityString;
    }

    public void setValidityString(String validityString) {
        this.validityString = validityString;
    }

    public List<Integer> getValidityDays() {
        return validityDays;
    }

    public void setValidityDays(List<Integer> validityDays) {
        this.validityDays = validityDays;
    }

    public String getValidityDuration() {
        return validityDuration;
    }

    public void setValidityDuration(String validityDuration) {
        this.validityDuration = validityDuration;
    }

    public List<TranzerServiceFee> getServiceFees() {
        return serviceFees;
    }

    public void setServiceFees(List<TranzerServiceFee> serviceFees) {
        this.serviceFees = serviceFees;
    }
}
