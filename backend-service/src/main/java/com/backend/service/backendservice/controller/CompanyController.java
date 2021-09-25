package com.backend.service.backendservice.controller;

import com.backend.service.backendservice.model.Company;
import com.backend.service.backendservice.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService service;


    public Company savedCompany(Company company){
        Company companySaved = service.insertCompany(company);
        return companySaved;
    }

   @PostMapping("/company")
    public List printAllCompany(){
        return service.getCompany();
   }

}
