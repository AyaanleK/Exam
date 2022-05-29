package com.koukou.keaexam.model;

public class DommageModel {


    private int dommage_id;
    private String dommage_date;
    private String dommage_description;
    private int dommage_chassisNumber;
    private int dommage_total_cost;


    public DommageModel() {
    }

    public DommageModel(int dommage_id, String dommage_date, String dommage_description,
                        int dommage_chassisNumber, int dommage_total_cost) {
        this.dommage_id = dommage_id;
        this.dommage_date = dommage_date;
        this.dommage_description = dommage_description;
        this.dommage_chassisNumber = dommage_chassisNumber;
        this.dommage_total_cost = dommage_total_cost;
    }

    public int getDommage_id() {
        return dommage_id;
    }

    public void setDommage_id(int dommage_id) {
        this.dommage_id = dommage_id;
    }

    public String getDommage_date() {
        return dommage_date;
    }

    public void setDommage_date(String dommage_date) {
        this.dommage_date = dommage_date;
    }

    public String getDommage_description() {
        return dommage_description;
    }

    public void setDommage_description(String dommage_description) {
        this.dommage_description = dommage_description;
    }

    public int getDommage_chassisNumber() {
        return dommage_chassisNumber;
    }

    public void setDommage_chassisNumber(int dommage_chassisNumber) {
        this.dommage_chassisNumber = dommage_chassisNumber;
    }

    public int getDommage_total_cost() {
        return dommage_total_cost;
    }

    public void setDommage_total_cost(int dommage_total_cost) {
        this.dommage_total_cost = dommage_total_cost;
    }
}
