package com.UST.springbootEmployee.service;

import com.UST.springbootEmployee.model.springbootModel;
import com.UST.springbootEmployee.repository.springbootRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class springbootService {
    @Autowired
    private springbootRepo repo;
    public springbootModel createspringbootModel(springbootModel springbootmodel) {
        return repo.save(springbootmodel);
    }
    public List<springbootModel> getspringbootmodel() {
        return repo.findAll();
    }


    public springbootModel getspringbootserviceBy(int Id) {

        return repo.findById( Id).orElse(null);
    }


    public springbootModel deletespringbootmodel(int Id) {
         repo.deleteById(Id);
        return null;
    }
}
