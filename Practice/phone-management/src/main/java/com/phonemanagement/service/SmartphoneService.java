package com.phonemanagement.service;

import com.phonemanagement.model.Smartphone;
import com.phonemanagement.repository.ISmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class SmartphoneService implements ISmartphoneService{
    @Autowired
    private ISmartphoneRepository smartphoneRepository;

    @Override
    public Iterable<Smartphone> findAll() {
        return smartphoneRepository.findAll();
    }

    @Override
    public Optional<Smartphone> findById(Long id) {
        return smartphoneRepository.findById(id);
    }

    @Override
    public Smartphone save(Smartphone smartPhone) {
        return smartphoneRepository.save(smartPhone);
    }

    @Override
    public void remove(Long id) {
        smartphoneRepository.deleteById(id);
    }
}
