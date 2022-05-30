package com.koukou.keaexam.service;

import com.koukou.keaexam.model.DommageModel;
import com.koukou.keaexam.repository.DommageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DommageService {

    private DommageRepository dommageRepository;


    public DommageService(DommageRepository dommageRepository) {
      this.dommageRepository = dommageRepository;
    }


    public List<DommageModel> showAllDommage(){
      return dommageRepository.getAllCarDommage();
    }


    public void addDommageControle(DommageModel dommage) {
      dommageRepository.addControleDommage(dommage);
    }
  }

