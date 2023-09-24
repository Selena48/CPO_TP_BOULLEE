/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint;

import java.util.Scanner;

/**
 *
 * @author NB-X02
 */
public class TP1_manipNombresInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Initialisation
        int nb1; // premier nombre 
        int nb2; // deuxième nombre 
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le premier nombre :");
        nb1 =sc.nextInt();
        System.out.println("Entrer le deuxieme nombre :");
        nb2 =sc.nextInt();
        
        //Calculs
 
        // Somme
        System.out.println("la somme des deux nombres est: "+ (nb1+nb2));
        // Différence
        System.out.println("la difference des deux nombres est: "+ (nb1-nb2));
        // Produit
        System.out.println("le produit des deux nombres est: "+ (nb1*nb2));
        // Quotient entier
        System.out.println("le quotient des deux nombres est: "+ (nb1/nb2));
        //Division euclidienne
        System.out.println("la division euclidienne des deux nombres est: "+ (nb1%nb2));
        
    }
    
}
