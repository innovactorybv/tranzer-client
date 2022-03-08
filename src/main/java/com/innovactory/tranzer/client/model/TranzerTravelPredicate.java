package com.innovactory.tranzer.client.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE, getterVisibility = JsonAutoDetect.Visibility.NONE, isGetterVisibility = JsonAutoDetect.Visibility.NONE, creatorVisibility = JsonAutoDetect.Visibility.NONE )
@JsonIgnoreProperties(ignoreUnknown = true)
public class TranzerTravelPredicate {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("agency")
    private String agency;

    @JsonProperty("modality")
    private TranzerModality modality;

    @JsonProperty("concession")
    private String concession;

    @JsonProperty("line_name")
    private String lineName;

    @JsonProperty("day_ticket_product")
    private Integer dayTicketProduct;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public TranzerModality getModality() {
        return modality;
    }

    public void setModality(TranzerModality modality) {
        this.modality = modality;
    }

    public String getConcession() {
        return concession;
    }

    public void setConcession(String concession) {
        this.concession = concession;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public Integer getDayTicketProduct() {
        return dayTicketProduct;
    }

    public void setDayTicketProduct(Integer dayTicketProduct) {
        this.dayTicketProduct = dayTicketProduct;
    }
}
