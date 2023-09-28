/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1;

/**
 *
 * @author NB-X02
 */
public class Personne {
    
        //Constructor
    public Personne(String nom_param, String prenom_param) {
    prenom = prenom_param;
    nom = nom_param;
    nbVoitures = 0;
    liste_voitures = new Voiture [3] ;
}
    
    /*Attributs*/
    String prenom;
    String nom;
    int nbVoitures ;
    Voiture [] liste_voitures ;
   
    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
     if (voiture_a_ajouter.proprietaire != null){
         return false;
     }else{
         liste_voitures[nbVoitures]=voiture_a_ajouter;
         nbVoitures ++;
         voiture_a_ajouter.proprietaire = this ; 
         return true;
     }
    }
    
    @Override
    public String toString() {
     return "Personne: "+prenom+", "+nom;
    }
}
