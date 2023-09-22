/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres;

/**
 *
 * @author NB-X02
 */
public class TP2_Bieres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       //première bière
       /*BouteilleBiere uneBiere = new BouteilleBiere() ;
       uneBiere.nom ="Cuvée des trolls";
       uneBiere.degreAlcool= 7.0;
       uneBiere.brasserie="Dubuisson";
       uneBiere.lireEtiquette();*/
      BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0,"Dubuisson") ;
      //uneBiere.lireEtiquette();
       
       //Deuxième bière
       /*BouteilleBiere deuxiemeBiere = new BouteilleBiere();
       deuxiemeBiere.nom="Leffe";
       deuxiemeBiere.degreAlcool=6.6;
       deuxiemeBiere.brasserie="Abbaye de Leffe";*/
       
      BouteilleBiere autreBiere = new BouteilleBiere("Leffe",6.6,"Abaye de Leffe") ;
      //autreBiere.lireEtiquette();
      
      BouteilleBiere troisBiere = new BouteilleBiere("Trois",6.0,"Abaye de Trois") ;
      //troisBiere.lireEtiquette();
      
      BouteilleBiere quatreBiere = new BouteilleBiere("Leffre",6.8,"Abaye de Leffre") ;
      //quatreBiere.lireEtiquette();
      
      BouteilleBiere cinqBiere = new BouteilleBiere("Left",6.2,"Abaye de Left") ;
      //cinqBiere.lireEtiquette();
      cinqBiere.Decapsuler();
      cinqBiere.toString();
      System.out.println(cinqBiere) ;
    }
    
}
