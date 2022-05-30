package com.koukou.keaexam.controller;

import com.koukou.keaexam.model.CarModel;
import com.koukou.keaexam.model.SkadeModel;
import com.koukou.keaexam.service.SkadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class SkadeController {

    @Autowired
    private SkadeService skadeService;

    @GetMapping({"/skade","/liste-skade"})
    public ModelAndView showSkadeList() {

        ModelAndView mav = new ModelAndView("liste-skade");
        List<SkadeModel> skadeList = skadeService.showAllSkade();
        mav.addObject("skade", skadeList);
        return mav;
    }

    //                  url
    @GetMapping({"/addSkadeForm","/add-skade"})
    public ModelAndView addSkadeForm(){

        ModelAndView mav = new ModelAndView("add-skade-form"); // themleaf template name
        CarModel newSkade = new SkadeModel();
        mav.addObject("skadeAdded", newSkade); // carAdded is model obejct  inside the html
        return mav;
    }

    @PostMapping({"/addSkade", "/newSkade"})
    public String addSkade(@ModelAttribute SkadeModel skade){
        skadeService.addSkade(skade);
        return "redirect:/liste-skade";
    }

}
