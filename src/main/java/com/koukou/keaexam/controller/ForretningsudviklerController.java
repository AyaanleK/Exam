package com.koukou.keaexam.controller;

import com.koukou.keaexam.model.ForretningsudviklerModel;
import com.koukou.keaexam.service.ForretningsudviklerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ForretningsudviklerController {

    @Autowired
    private ForretningsudviklerService forretningsudviklerService;

    @GetMapping({"/forretningsudvikler"})
    public ModelAndView showTotalPrisOgAbonnementer(){

        ModelAndView mav = new ModelAndView("forretningsudvikler");
        List<ForretningsudviklerModel> forretningsudviklerList1 = forretningsudviklerService.showTotalAbonnementer();
        List<ForretningsudviklerModel> forretningsudviklerList2 = forretningsudviklerService.showTotalPris();
        mav.addObject("forretningsU1", forretningsudviklerList1);
        mav.addObject("forretningsU2", forretningsudviklerList2);

        return mav;
    }
}