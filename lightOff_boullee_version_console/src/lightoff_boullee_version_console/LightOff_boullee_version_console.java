/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_boullee_version_console;

/**
 *
 * @author NB-X02
 */
public class LightOff_boullee_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CelluleLumineuse cellule1 = new CelluleLumineuse();
        CelluleLumineuse cellule2 = new CelluleLumineuse();
        System.out.println("Etat de cellule1 : "+cellule1.getEtat());
        cellule1.activerCellule();
        System.out.println("Etat de cellule1 apres methode activerCellule: "+cellule1.getEtat());
        System.out.println("Est ce que cellule1 est eteinte ? "+cellule1.estEteint());
        System.out.println("Est ce que cellule1 est eteinte ? "+cellule2);
        
        GrilleDeCellules grille1 = new GrilleDeCellules(7,7);
        System.out.println(grille1);
        grille1.activerDiagonaleMontante();
        System.out.println(grille1);
        grille1.melangerMatriceAleatoirement(5);
        System.out.println(grille1);
        
    }
    
}
