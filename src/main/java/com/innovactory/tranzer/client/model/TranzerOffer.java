package com.innovactory.tranzer.client.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE, getterVisibility = JsonAutoDetect.Visibility.NONE, isGetterVisibility = JsonAutoDetect.Visibility.NONE, creatorVisibility = JsonAutoDetect.Visibility.NONE )
@JsonIgnoreProperties(ignoreUnknown = true)
public class TranzerOffer {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("status")
    private String status;

    @JsonProperty("total_ticket_price")
    private Double totalTicketPrice;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("day_ticket_product")
    private TranzerProduct dayTicketProduct;

    @JsonProperty("tickets")
    private List<TranzerTicket> tickets;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getTotalTicketPrice() {
        return totalTicketPrice;
    }

    public void setTotalTicketPrice(Double totalTicketPrice) {
        this.totalTicketPrice = totalTicketPrice;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public TranzerProduct getDayTicketProduct() {
        return dayTicketProduct;
    }

    public void setDayTicketProduct(TranzerProduct dayTicketProduct) {
        this.dayTicketProduct = dayTicketProduct;
    }

    public List<TranzerTicket> getTickets() {
        return tickets;
    }

    public void setTickets(List<TranzerTicket> tickets) {
        this.tickets = tickets;
    }
}
