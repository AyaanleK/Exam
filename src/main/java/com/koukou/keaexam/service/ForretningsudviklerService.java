package com.koukou.keaexam.service;

import com.koukou.keaexam.model.ForretningsudviklerModel;
import com.koukou.keaexam.repository.ForretningsudviklerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForretningsudviklerService {

    private ForretningsudviklerRepository forretningsudviklerRepository;

    public ForretningsudviklerService(ForretningsudviklerRepository forretningsudviklerRepository) {
        this.forretningsudviklerRepository = forretningsudviklerRepository;
    }

    public List<ForretningsudviklerModel> showTotalPris() {
        return forretningsudviklerRepository.getTotalPris();
    }

    public List<ForretningsudviklerModel> showTotalAbonnementer() {
        return forretningsudviklerRepository.getTotalAbonnementer();
    }
}
