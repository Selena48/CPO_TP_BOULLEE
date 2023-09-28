/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1;

/**
 *
 * @author NB-X02
 */
public class Voiture {
    
    //Constructor
    public Voiture(String modele_param, String marque_param, int puissance_param) {
    modele = modele_param;
    marque = marque_param;
    puissanceCV = puissance_param;
    proprietaire = null;
}
    
    /*Attributs*/
    String modele;
    String marque;
    int puissanceCV;
    Personne proprietaire ;
   
    
    @Override
    public String toString() {
     return "Voiture: "+modele+", "+marque+", "+puissanceCV ;
    }
    
}
