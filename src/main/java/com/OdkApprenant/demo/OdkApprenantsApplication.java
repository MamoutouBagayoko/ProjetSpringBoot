package com.OdkApprenant.demo;

import com.OdkApprenant.demo.model.Apprenant;
import com.OdkApprenant.demo.model.ApprenantStatut;
import com.OdkApprenant.demo.repositories.ApprenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class OdkApprenantsApplication {

	@Autowired
	private ApprenantRepository apprenantRepository;

	public static void main(String[] args) {
		SpringApplication.run(OdkApprenantsApplication.class, args);
	}



}
