/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1;

/**
 *
 * @author NB-X02
 */
public class TP2_relation_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
    
        bob.ajouter_voiture( une2008);
        bob.ajouter_voiture( uneMicra);
        bob.ajouter_voiture( uneClio);
        bob.ajouter_voiture( uneAutreClio);

        
        reno.ajouter_voiture( uneClio);
        reno.ajouter_voiture( uneAutreClio);


    
        System.out.println("liste des voitures disponibles \n"+ uneClio +"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        System.out.println("la premiere voiture de Bob est " +bob.liste_voitures[0] ) ;
        System.out.println("la deuxième voiture de Bob est " +bob.liste_voitures[1] ) ;
        System.out.println("la premiere voiture de Reno est " +reno.liste_voitures[0] ) ;
        System.out.println("la deuxième voiture de Reno est " +reno.liste_voitures[1] ) ;
            }
        
}
