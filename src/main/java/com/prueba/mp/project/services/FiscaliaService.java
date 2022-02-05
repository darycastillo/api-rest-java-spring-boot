package com.prueba.mp.project.services;

import java.util.ArrayList;
import java.util.Optional;

import com.prueba.mp.project.models.FiscaliaModel;
import com.prueba.mp.project.repositories.FiscaliaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FiscaliaService {
    @Autowired
    FiscaliaRepository fiscaliaRepository;

    public ArrayList<FiscaliaModel> getAll() {
        return (ArrayList<FiscaliaModel>) fiscaliaRepository.findAll();
    }

    public FiscaliaModel postAndUpdate(FiscaliaModel fiscalia) {
        return fiscaliaRepository.save(fiscalia);
    }

    public Optional<FiscaliaModel> getById(Long id) {
        return fiscaliaRepository.findById(id);
    }

    public boolean deleteById(Long id) {
        try {
            fiscaliaRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}