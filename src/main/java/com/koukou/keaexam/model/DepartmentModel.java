package com.koukou.keaexam.model;


/*---------- Ayaanle A.Hassan ------------*/
public class DepartmentModel {

  private String dataRegistration;
  private String skadeUdbedring;
  private String forretningsudvilklere;

  public String getDataRegistration() {
    return dataRegistration;
  }

  public void setDataRegistration(String dataRegistration) {
    this.dataRegistration = dataRegistration;
  }

  public String getSkadeUdbedring() {
    return skadeUdbedring;
  }

  public void setSkadeUdbedring(String skadeUdbedring) {
    this.skadeUdbedring = skadeUdbedring;
  }

  public String getForretningsudvilklere() {
    return forretningsudvilklere;
  }

  public void setForretningsudvilklere(String forretningsudvilklere) {
    this.forretningsudvilklere = forretningsudvilklere;
  }

  @Override
  public String toString() {
    return "DepartmentModel{" +
        "dataRegistration='" + dataRegistration + '\'' +
        ", skadeUdbedring='" + skadeUdbedring + '\'' +
        ", forretningsudvilklere='" + forretningsudvilklere + '\'' +
        '}';
  }
}
