package com.koukou.keaexam.service;

import com.koukou.keaexam.model.CarModel;
import com.koukou.keaexam.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

  private CarRepository carRepository;


  public CarService(CarRepository carRepository) {
    this.carRepository = carRepository;
  }


  public List<CarModel> showAllCars(){
    return carRepository.getAllCars();
  }


  public void addCar(CarModel car) {
    carRepository.addCar(car);
  }
}
