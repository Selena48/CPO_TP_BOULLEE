/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_boullee_version_console;

/**
 *
 * @author NB-X02
 */
public class GrilleDeCellules {
    
    int nbLignes;
    int nbColonnes;
    CelluleLumineuse matriceCellules[][];
    
    GrilleDeCellules(int nbL,int nbC){     
        nbLignes = nbL;
        nbColonnes = nbC;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }
    
    /**
     * Eteint toutes les cellules de la grille
     */
    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }
    
    /**
     * Fais une action aléatoirement (active une ligne, une colonne, ou une diagonale)
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        int nombreAleatoire = (int)(Math.random() * 4);
        switch(nombreAleatoire)
        {
            case 0:
                int nombreAleatoire2 = (int)(Math.random() * nbColonnes);
                activerColonneDeCellules(nombreAleatoire2);
            break;
            case 1:
                int nombreAleatoire3 = (int)(Math.random() * nbLignes);
                activerLigneDeCellules(nombreAleatoire3);
            break;
            case 2:
                activerDiagonaleDescendante();
            break;
            case 3:
                activerDiagonaleMontante();
            break;
        }
        
        
    }
    
    /**
     * Génère un plateau de cellules lumineuses de manière aléatoire à partir d’un nombre spécifié de tours
     * @param nbTours
     */
    public void melangerMatriceAleatoirement(int nbTours) {
        eteindreToutesLesCellules();
        for( int i = 0 ; i<nbTours; i++){
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }
    
    /**
     * Active toutes les cellules d'une ligne spécifique
     * @param idLigne
     */
    public void activerLigneDeCellules(int idLigne){
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[idLigne][j].activerCellule();
        }
    }
    
    /**
     * Active toutes les cellules d'une colonne spécifique
     * @param idColonne
     */
    public void activerColonneDeCellules(int idColonne){
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }
    
    /**
     * Active respectivement la diagonale descendante
     */
    public void activerDiagonaleDescendante() {
        for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    /**
     * Active respectivement la diagonale montante
     */
    public void activerDiagonaleMontante() {
        for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
            matriceCellules[nbLignes - 1 - i][i].activerCellule();
        }
    }
    
    /**
     * Vérifie si toutes les cellules de la grille sont éteintes
     * @return
     */
    public boolean cellulesToutesEteintes(){
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if(!matriceCellules[i][j].estEteint()){
                    return false;
                }
            }
        }
        return true;
    }
    
    // méthode toString()
    public String toString() {
        String barreH = "";
        for (int i = 0; i < nbColonnes +1; i++) {
            barreH += "----";
        }
        barreH += "\n";
        
        String result;
        result = "   |";
        
        for (int i = 0; i < nbColonnes; i++) {
            result += " " + i + " |"; 
        }
        result += "\n" + barreH;
        
        for (int i = 0; i < nbLignes; i++) {
            result += " "+ i + " |";
            for (int j = 0; j < nbColonnes; j++) {
                result += " " + matriceCellules[i][j] + " |";
            }
            result += "\n" + barreH;
        }
        return result;
        
   }
    
}
