package com.koukou.keaexam.controller;

import com.koukou.keaexam.model.DommageModel;
import com.koukou.keaexam.service.DommageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class DommageController {


  @Autowired
  private DommageService dommageService;


  @GetMapping({"/list_dommage","/list-dommage"})
  public ModelAndView showCarDommageList(){

    ModelAndView mav = new ModelAndView("list-dommage");
    List<DommageModel> dommageList = dommageService.showAllDommage();

    mav.addObject("leD", dommageList);

    return mav;
  }

  //                  url
  @GetMapping({"/addDommageForm","/add-dommage","add"})
  public ModelAndView addCarDommageForm(){

    ModelAndView mav = new ModelAndView("add-dommage-form"); // themleaf template name
    DommageModel newDommage = new DommageModel();

    mav.addObject("dommageAdded", newDommage); // carAdded is model obejct  inside the html

    return mav;
  }



  @PostMapping({"/addDommage", "/newDommage"})
  public String  addCarDommage(@ModelAttribute DommageModel carDommage){

    dommageService.addDommageControle(carDommage);


    return "redirect:/list-dommage";
  }
}
