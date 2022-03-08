package com.innovactory.tranzer.client.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE, getterVisibility = JsonAutoDetect.Visibility.NONE, isGetterVisibility = JsonAutoDetect.Visibility.NONE, creatorVisibility = JsonAutoDetect.Visibility.NONE )
@JsonIgnoreProperties(ignoreUnknown = true)
public class TranzerTicket {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("user")
    private Integer user;

    @JsonProperty("status")
    private String status;

    @JsonProperty("channel")
    private String channel;

    @JsonProperty("day_ticket_offer")
    private Integer dayTicketOffer;

    @JsonProperty("date_created")
    private String dateCreated;

    @JsonProperty("purchased_datetime")
    private String purchasedDatetime;

    @JsonProperty("price")
    private Double price;

    @JsonProperty("price_currency")
    private String priceCurrency;

    @JsonProperty("type")
    private String type;

    @JsonProperty("conditions")
    private TranzerConditions conditions;

    @JsonProperty("passenger")
    private Integer passenger;

    @JsonProperty("product_name")
    private String productName;

    @JsonProperty("show_before_valid")
    private Boolean showBeforeValid;

    @JsonProperty("validity_start")
    private String validityStart;

    @JsonProperty("validity_end")
    private String validityEnd;

    @JsonProperty("barcode")
    private String barcode;

    @JsonProperty("valid_on")
    private String validOn;

    @JsonProperty("original")
    private Boolean original;

    @JsonProperty("media")
    private TranzerMedia media;

    @JsonProperty("name")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Integer getDayTicketOffer() {
        return dayTicketOffer;
    }

    public void setDayTicketOffer(Integer dayTicketOffer) {
        this.dayTicketOffer = dayTicketOffer;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getPurchasedDatetime() {
        return purchasedDatetime;
    }

    public void setPurchasedDatetime(String purchasedDatetime) {
        this.purchasedDatetime = purchasedDatetime;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TranzerConditions getConditions() {
        return conditions;
    }

    public void setConditions(TranzerConditions conditions) {
        this.conditions = conditions;
    }

    public Integer getPassenger() {
        return passenger;
    }

    public void setPassenger(Integer passenger) {
        this.passenger = passenger;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Boolean getShowBeforeValid() {
        return showBeforeValid;
    }

    public void setShowBeforeValid(Boolean showBeforeValid) {
        this.showBeforeValid = showBeforeValid;
    }

    public String getValidityStart() {
        return validityStart;
    }

    public void setValidityStart(String validityStart) {
        this.validityStart = validityStart;
    }

    public String getValidityEnd() {
        return validityEnd;
    }

    public void setValidityEnd(String validityEnd) {
        this.validityEnd = validityEnd;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getValidOn() {
        return validOn;
    }

    public void setValidOn(String validOn) {
        this.validOn = validOn;
    }

    public Boolean getOriginal() {
        return original;
    }

    public void setOriginal(Boolean original) {
        this.original = original;
    }

    public TranzerMedia getMedia() {
        return media;
    }

    public void setMedia(TranzerMedia media) {
        this.media = media;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
