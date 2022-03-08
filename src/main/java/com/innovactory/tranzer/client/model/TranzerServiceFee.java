package com.innovactory.tranzer.client.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE, getterVisibility = JsonAutoDetect.Visibility.NONE, isGetterVisibility = JsonAutoDetect.Visibility.NONE, creatorVisibility = JsonAutoDetect.Visibility.NONE )
@JsonIgnoreProperties(ignoreUnknown = true)
public class TranzerServiceFee {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("payment_method")
    private String paymentMethod;

    @JsonProperty("amount")
    private Double amount;

    @JsonProperty("fee_base")
    private Double feeBase;

    @JsonProperty("fee_percentage")
    private Double feePercentage;

    @JsonProperty("day_ticket_product")
    private Integer dayTicketProduct;

    @JsonProperty("display_name")
    private String displayName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getFeeBase() {
        return feeBase;
    }

    public void setFeeBase(Double feeBase) {
        this.feeBase = feeBase;
    }

    public Double getFeePercentage() {
        return feePercentage;
    }

    public void setFeePercentage(Double feePercentage) {
        this.feePercentage = feePercentage;
    }

    public Integer getDayTicketProduct() {
        return dayTicketProduct;
    }

    public void setDayTicketProduct(Integer dayTicketProduct) {
        this.dayTicketProduct = dayTicketProduct;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
