/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_hello_world;

import java.util.Scanner;

/**
 *
 * @author NB-X02
 */
public class TP0_hello_world {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        // TODO code application logic here
        System.out.println( " Bonjour " ) ; 
        String prenom;
        Scanner sc ;
        sc = new Scanner (System.in) ;
        System.out.println("Quel est votre prénom ?");
        prenom = sc.nextLine();
        System.out.println("Au revoir "+ prenom);
    }
    
    
}
