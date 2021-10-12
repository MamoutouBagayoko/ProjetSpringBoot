package com.OdkApprenant.demo.services;

import com.OdkApprenant.demo.model.Apprenant;
import com.OdkApprenant.demo.repositories.ApprenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import java.util.List;


@Service
public class ApprenantServiceImp implements ApprenantService{

    @Autowired
    ApprenantRepository apprenantRepository;
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public Apprenant ajouter_apprenant(Apprenant apprenant) {
        return apprenantRepository.save(apprenant);
    }

    @Override
    public Apprenant modifier_apprenant(Long id, Apprenant apprenant) {
        return apprenantRepository.save(apprenant);
    }

    @Override
    public List<Apprenant> liste_apprenant() {
        return apprenantRepository.findAll();
    }

    @Override
    public Apprenant afficher_apprenant_by_id(Long id) {
        return apprenantRepository.findById(id).get();
    }
 // pour verifier login
    @Override
    public Apprenant login(String username, String password) {
        try {
            /*String sql="Select a from" +Apprenant.class.getName()+" a" + "Where a.login=:login AND a.password=:password";
            Query query = entityManager.createQuery(sql);
            query.setParameter("login",username);
            query.setParameter("password",password);*/
            Apprenant testMadame=apprenantRepository.findByLoginAndPassword(username,password);
            System.out.println("apprenanat de madam trouve========"+testMadame.getNom());
            return testMadame;
        } catch (NoResultException e){
            return null;
        }
    }

    @Override
    public void supprimer_apprenant(Long id) {
        apprenantRepository.deleteById(id);
    }
    /*public List<Apprenant> apprenantList(){
        return apprenantRepository.findAll();
    }*/
}
