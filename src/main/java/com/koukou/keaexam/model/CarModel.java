package com.koukou.keaexam.model;


/*---------- Ayaanle A.Hassan ------------*/
public class CarModel {


  private String car_chassis_number;
  private String car_color;
  private String car_model;
  private String car_registration_fee;

  public CarModel(String car_chassis_number, String car_color, String car_model, String car_registrationFee) {

    this.car_chassis_number = car_chassis_number;
    this.car_color = car_color;
    this.car_model = car_model;
    this.car_registration_fee = car_registrationFee;
  }

  public CarModel() {

  }

  public CarModel(int car_dommage_id, String car_dommage_date, String car_dommage_description,
                  int dommage_total_cost, int car_dommage_chassisNumber) {
  }


  public String getCar_chassis_number() {
    return car_chassis_number;
  }

  public void setCar_chassis_number(String car_chassis_number) {
    this.car_chassis_number = car_chassis_number;
  }

  public String getCar_color() {
    return car_color;
  }

  public void setCar_color(String car_color) {
    this.car_color = car_color;
  }

  public String getCar_model() {
    return car_model;
  }

  public void setCar_model(String car_model) {
    this.car_model = car_model;
  }

  public String getCar_registration_fee() {
    return car_registration_fee;
  }

  public void setCar_registration_fee(String car_registration_fee) {
    this.car_registration_fee = car_registration_fee;
  }



  @Override
  public String toString() {
    return "CarModel{" +
        "car_chassis_number='" + car_chassis_number + '\'' +
        ", car_color='" + car_color + '\'' +
        ", car_model='" + car_model + '\'' +
        ", car_registrationFee=" + car_registration_fee +
        '}';
  }
}
