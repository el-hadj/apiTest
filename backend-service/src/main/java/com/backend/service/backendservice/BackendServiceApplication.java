package com.backend.service.backendservice;

import com.backend.service.backendservice.model.Company;
import com.backend.service.backendservice.repository.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@SpringBootApplication
public class BackendServiceApplication implements CommandLineRunner {

	private static final Logger logger = Logger.getLogger(BackendServiceApplication.class.getName());

	@Autowired
	private CompanyRepo companyRepo;
	private Company company;
	public static void main(String[] args) {

		SpringApplication.run(BackendServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("debut de la commande");
		company = new Company(003L,"SFR","Lyon",50);
		companyRepo.save(company);
		logger.info("fin de la sauvegarde");
		logger.info("l'ensemble des entreprises");
		companyRepo.save(company);


	}
}
