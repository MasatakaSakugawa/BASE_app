package com.example.base_app;

import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Results {

    private String apiVersion;
    private Integer resultsAvailable;
    private String resultsReturned;
    private Integer resultsStart;
    private List<Shop> shop = null;

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Integer getResultsAvailable() {
        return resultsAvailable;
    }

    public void setResultsAvailable(Integer resultsAvailable) {
        this.resultsAvailable = resultsAvailable;
    }

    public String getResultsReturned() {
        return resultsReturned;
    }

    public void setResultsReturned(String resultsReturned) {
        this.resultsReturned = resultsReturned;
    }

    public Integer getResultsStart() {
        return resultsStart;
    }

    public void setResultsStart(Integer resultsStart) {
        this.resultsStart = resultsStart;
    }

    public List<Shop> getShop() {
        return shop;
    }

    public void setShop(List<Shop> shop) {
        this.shop = shop;
    }

}