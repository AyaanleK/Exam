package com.koukou.keaexam.service;

import com.koukou.keaexam.model.SkadeModel;
import com.koukou.keaexam.repository.SkadeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkadeService {

    private SkadeRepository skadeRepository;

    public SkadeService(SkadeRepository skadeRepository) {
        this.skadeRepository = skadeRepository;
    }

    public List<SkadeModel> showAllSkade() {
        return skadeRepository.getAllSkade();
    }

    public void addSkade(SkadeModel skade) {
        skadeRepository.addSkade(skade);
    }

}
