package com.backend.service.backendservice.service;

import com.backend.service.backendservice.model.Company;
import com.backend.service.backendservice.repository.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepo companyRepo;



    // create Company
    public Company insertCompany (Company company){
        Company companySaved = companyRepo.save(company);
        return companySaved;
    }

    // delete company using id
    public void deleteCompany(int id){
        companyRepo.deleteById(id);
    }

    public List getCompany() {
        List<Company> list = (List) companyRepo.findAll();
        for(Company c: list){
            System.out.println(
                 "id = "+ c.getId()+
                ", name = " + c.getName() +
                ", location = " + c.getLocation()+
                ", nbbuilding = " + c.getnbbuilding());
        }
        return list;
    }
}
