package com.koukou.keaexam.controller;

import com.koukou.keaexam.model.CarModel;
import com.koukou.keaexam.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;


/*---------- Ayaanle A.Hassan ------------*/
@Controller
public class CarController {

  @Autowired
  private CarService carService;



  @GetMapping({"/list","/liste-car"})

  public ModelAndView showCarList(){

    ModelAndView mav = new ModelAndView("list-car");
    List<CarModel> carList = carService.showAllCars();
    mav.addObject("leCar", carList);

    return mav;
  }

//                  url
  @GetMapping({"/addCarForm","/add-car","add"})
  public ModelAndView addCarForm(){

    ModelAndView mav = new ModelAndView("add-car-form"); // themleaf template name
    CarModel newCar = new CarModel();

    mav.addObject("carAdded", newCar); // carAdded is model obejct  inside the html

    return mav;
  }



  @PostMapping({"/addCar", "/newCar"})
  public String  addCar(@ModelAttribute CarModel mycar){

    carService.addCar(mycar);


    return "redirect:/liste-car";
  }
}
