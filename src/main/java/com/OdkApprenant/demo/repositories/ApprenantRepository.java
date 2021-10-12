package com.OdkApprenant.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OdkApprenant.demo.model.Apprenant;
import org.springframework.stereotype.Repository;

@Repository
public interface ApprenantRepository extends JpaRepository<Apprenant, Long> {

    Apprenant findByLoginAndPassword(String login, String password);
}
