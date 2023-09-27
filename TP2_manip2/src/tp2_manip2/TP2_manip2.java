/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip2;

/**
 *
 * @author NB-X02
 */
public class TP2_manip2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ;
        
        //Combien de tartiflettes ont réellement été créées ? 2
        //assiette2 et assiette3 référencent-elles la même tartiflette, ou deux tartiflettes différentes ? une seule tartiflette
        
        // Inverser les objets référencés par assiette1 et assiette2
        Tartiflette temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;
        
        // une référence objet qui annonce référencer un type d’objet peut-elle en référencer un autre qui n’a aucun rapport ? non

        System.out.println("nb de calories de Assiette 2 : " +assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +assiette2.nbCalories) ;
        
        Moussaka monTableauDeMoussaka[ ] = new Moussaka[10];
        for(int i = 0; i<monTableauDeMoussaka.length; i++){
            monTableauDeMoussaka[1]= new Moussaka(400);
            System.out.println(monTableauDeMoussaka[i]);
        }
    }
    
}
