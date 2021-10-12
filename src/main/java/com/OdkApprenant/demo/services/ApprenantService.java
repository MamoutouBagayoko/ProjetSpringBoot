package com.OdkApprenant.demo.services;

import com.OdkApprenant.demo.model.Apprenant;

import java.util.List;

public interface ApprenantService {

    public Apprenant ajouter_apprenant(Apprenant apprenant);
    public Apprenant modifier_apprenant(Long id, Apprenant apprenant);
    public List<Apprenant> liste_apprenant();
    public Apprenant afficher_apprenant_by_id(Long id);
    public Apprenant login(String username,String password);
    void supprimer_apprenant(Long id);
}
