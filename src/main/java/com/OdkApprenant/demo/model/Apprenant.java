package com.OdkApprenant.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Apprenant {

    /*   private static final long serialVersionUID = 1L;*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String nom;
    private String prenom;
    private int age;
    private int telephone;
    private String email;
    private String login;
    private String password;
    private String genre;
    @Enumerated(EnumType.STRING)
    private ApprenantStatut apprenantStatut;
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Temporal(TemporalType.DATE)
    private Date dateModification;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public ApprenantStatut getApprenantStatut() {
        return apprenantStatut;
    }

    public void setApprenantStatut(ApprenantStatut apprenantStatut) {
        this.apprenantStatut = apprenantStatut;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public Date getDateModification() {
        return dateModification;
    }

    public Apprenant(String nom, String prenom, int age, int telephone, String email, String login, String password, String genre, ApprenantStatut apprenantStatut, Date dateCreation, Date dateModification) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.telephone = telephone;
        this.email = email;
        this.login = login;
        this.password = password;
        this.genre = genre;
        this.apprenantStatut = apprenantStatut;
        this.dateCreation = dateCreation;
        this.dateModification = dateModification;
    }

    public void setDateModification(Date dateModification) {
        this.dateModification = dateModification;
    }

    public Apprenant() {
        super();
    }

    @Override
    public String toString() {
        return "Apprenant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", telephone=" + telephone +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", genre='" + genre + '\'' +
                ", apprenantStatut=" + apprenantStatut +
                ", dateCreation=" + dateCreation +
                ", dateModification=" + dateModification +
                '}';
    }
}
