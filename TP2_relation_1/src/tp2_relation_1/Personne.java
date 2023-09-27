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
}
    
    /*Attributs*/
    String prenom;
    String nom;
   
    
    @Override
    public String toString() {
     return "Personne: "+prenom+", "+nom;
    }
}
