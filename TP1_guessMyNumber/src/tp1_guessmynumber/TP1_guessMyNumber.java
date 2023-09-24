/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author NB-X02
 */
public class TP1_guessMyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Initialisation
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        int rules;
        int n = generateurAleat.nextInt(10);//nombre aléatoire
        int nb;
        
        System.out.println("1) facile");
        System.out.println("2) normal");
        System.out.println("3) difficile");
        System.out.println("4) cauchemar");
        rules =sc.nextInt();
        
        while(rules<1 || rules>4){
            System.out.println("Veuillez rentrer un nombre correspondant à un de ces modes de jeu");
            rules =sc.nextInt();
        }
        
        System.out.println("Entrer un nombre nombre :");
        nb =sc.nextInt();// nombre choisi
        int compteur=0;//compteur
        
        while(nb!=n){
            if(compteur>=5 && rules==3)break;
            if(n<nb){
                  if(rules==4 || rules==1){
                  int random =generateurAleat.nextInt(10);
                  if (random<=3 && rules==4){
                     System.out.println("Plus grand");  
                  }else{
                     System.out.println("Plus petit"); 
                  }
                }
            }else if(n>nb){
              if(rules==4 || rules==1){
                  int random =generateurAleat.nextInt(10);
                  if (random<=3 && rules==4){
                     System.out.println("Plus petit");  
                  }else{
                     System.out.println("Plus grand"); 
                  }
            }
            System.out.println("Entrez un nouveau nombre");
            nb =sc.nextInt();
            compteur++;
        }
        }
        if(compteur>5 && rules==3){
            System.out.println("Vous êtes nuls");
        }else{
        System.out.println("Vous avez gagné, c'était bien le nombre: "+n);
        System.out.println("Vous avez effectué "+ compteur+" tentatives");
        }
    }
    
}
