/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_boullee_version_console;

import java.util.Scanner;

/**
 *
 * @author NB-X02
 */
public class Partie {

    int nbCoups;
    GrilleDeCellules grille;
    
    Partie(int p_nbLignes, int p_nbColonnes){
        grille = new GrilleDeCellules(p_nbLignes,p_nbColonnes);
        nbCoups = 0;
    }
    
    /**
     * Initialise la partie en mélangeant la grille de jeu
     * @param nbTours
     */
    public void initialiserPartie(int nbTours) {
        grille.melangerMatriceAleatoirement(nbTours);
    }

    /**
     * Lance la partie de LightOff en affichant l'état initial de la grille, puis en entrant dans une boucle de jeu qui continue tant que toutes les cellules ne sont pas éteintes
     */
    public void  lancerPartie(){
        System.out.println(grille);
        while (!grille.cellulesToutesEteintes()){
           nbCoups ++;
           Scanner sc = new Scanner(System.in); 
           System.out.println("Pour une ligne : tapez 1 \n Pour une colonne : tapez 2 \n pour une diagonale : tapez 3");
           switch(sc.nextLine()){
                case "1" -> {
                    System.out.println("choisir une ligne entre 0 et "+(grille.nbLignes-1));
                    grille.activerLigneDeCellules(sc.nextInt());
                }
                case "2" -> {
                    System.out.println("choisir une colonne entre 0 et "+(grille.nbColonnes-1));
                    grille.activerColonneDeCellules(sc.nextInt());
                }
                case "3" -> {
                    System.out.println("rentrer haut pour la diagonale montante et bas pour la diagonale descendante");
                    switch(sc.nextLine()){
                        case "haut":
                            grille.activerDiagonaleMontante();
                            break;
                        case "bas":
                            grille.activerDiagonaleDescendante();
                    }
                }
            }
           System.out.println(grille);
           System.out.println("Nombre de coups :"+ nbCoups);
        }
        System.out.println("C'est la victoire, tu as gagne en : "+nbCoups+" coups"
                + "");
    }
}
