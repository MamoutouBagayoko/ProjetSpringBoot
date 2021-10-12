package com.OdkApprenant.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OdkApprenant.demo.model.Apprenant;

public interface ApprenantRepository extends JpaRepository<Apprenant, Long> {

}
