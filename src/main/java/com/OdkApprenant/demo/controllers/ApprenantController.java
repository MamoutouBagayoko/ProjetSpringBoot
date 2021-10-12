package com.OdkApprenant.demo.controllers;

import com.OdkApprenant.demo.model.Apprenant;
import com.OdkApprenant.demo.services.ApprenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apprenantOdk")
public class ApprenantController {
    
    @Autowired
    ApprenantService apprenantService;

    @PostMapping(value="/apprenant")
    public Apprenant save(@RequestBody Apprenant apprenant) {
        return apprenantService.ajouter_apprenant(apprenant);
    }

    @GetMapping(path = "/apprenant/{id}")
    public Apprenant getOne (@PathVariable Long id){
        return apprenantService.afficher_apprenant_by_id(id);
    }

    @CrossOrigin("*")
    @GetMapping("/apprenant")
    @ResponseBody
    public List<Apprenant> liste(){
        System.out.println("com.OdkApprenant.demo.controllers.ApprenantController.liste()");
        return apprenantService.liste_apprenant();
    }

    @PutMapping(path = "/apprenant/{id}")
    public Apprenant update(@RequestBody Apprenant apprenant, @PathVariable Long id){
        return apprenantService.modifier_apprenant(id, apprenant);
    }

    @DeleteMapping(value="/apprenant/{id}")
    public void delete(@PathVariable("id") Long id) {
        apprenantService.supprimer_apprenant(id);

    }


        @CrossOrigin("*")
      @PostMapping(path="/auth/{login}/{password}")
      @ResponseBody
      public Apprenant login (
              @RequestBody Apprenant apprenant,
            @PathVariable("login") String login,
            @PathVariable("password") String password)


        {
    return apprenantService.login(login,password);

    }
}
