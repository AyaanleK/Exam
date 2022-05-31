package com.koukou.keaexam.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*---------- Ayaanle A.Hassan ------------*/
@Controller
public class WelcomController {

  @GetMapping("/")
  public String index() {
    return "mainPage";
  }


  @GetMapping("/skade")
  public String skade() {
    return "skadeUdbedring";
  }


  @GetMapping("/data")
  public String data() {
    return "dataregistrering";
  }

  @GetMapping("/forretning")
  public String forretning() {
    return "forretningsudvikler";
  }
}
