package com.koukou.keaexam.model;

public class ForretningsudviklerModel {

    private String total_pris;
    private String total_abonnementer;

    public ForretningsudviklerModel(String total_pris, String total_abonnementer) {
        this.total_pris = total_pris;
        this.total_abonnementer = total_abonnementer;
    }

    public ForretningsudviklerModel(String total_pris) {
    }

    public String getTotal_pris() {
        return total_pris;
    }

    public void setTotal_pris(String total_pris) {
        this.total_pris = total_pris;
    }

    public String getTotal_abonnementer() {
        return total_abonnementer;
    }

    public void setTotal_abonnementer(String total_abonnementer) {
        this.total_abonnementer = total_abonnementer;
    }

    @Override
    public String toString() {
        return "ForretningsudviklerModel{" +
                "total_pris='" + total_pris + '\'' +
                ", total_abonnementer='" + total_abonnementer + '\'' +
                '}';
    }
}
