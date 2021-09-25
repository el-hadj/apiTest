package com.backend.service.backendservice.repository;

import com.backend.service.backendservice.model.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CompanyRepo extends CrudRepository<Company,Integer> {
}