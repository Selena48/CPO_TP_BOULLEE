/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_boullee_version_console;

/**
 *
 * @author NB-X02
 */

public class CelluleLumineuse {
    
    private boolean etat;
    
    CelluleLumineuse(){
        etat = false ;       
    }
    
    /**
    * Passe l'état de la cellule de false à true
    */
    public void activerCellule() {
        if(etat==false){
            etat = true;
        }
   }
    
   /**
    * Passe l'état de la cellule de true à false
    */
   public void eteindreCellule() {
        if(etat==true){
            etat = false;
        }
   }
   
    /**
    * Renvoie l'état de la cellule
    * 
    * @return l'état (booléen) de la cellule 
    */
   public boolean getEtat(){
       return etat;
   }
   
    /**
    * Renvoie si oui ou non la cellule est éteinte
    * 
    * @return un booléen, si la cellule est éteinte true, sinon false
    */
   public boolean estEteint(){
       if (etat){
        return false;
       }else{
           return true;
       }
   }
   
    // méthode toString()
    public String toString() {
        if(etat){
            return "X";
        }else{
            return "O";
        }
   }
    
}
