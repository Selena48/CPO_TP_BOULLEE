/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet;

import java.util.Scanner;

/**
 *
 * @author NB-X02
 */
public class TP2_convertisseurObjet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Initialisation
        double nb; // premier nombre 
        int methodNumber;
        Scanner sc = new Scanner(System.in);
        Convertisseur conv = new Convertisseur() ;

        //Affichage du menu complet des températures
        System.out.println("Bonjour, saisissez une valeur  :");
        nb =sc.nextDouble();
        
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Celcius vers Farenheit");
        System.out.println("3) De Kelvin vers Celcius");
        System.out.println("4) De Kelvin vers Farenheit");
        System.out.println("5) De Farenheit vers Celcius");
        System.out.println("6) De Farenheit vers Kelvin");
        
        methodNumber =sc.nextInt();
        switch (methodNumber) {
          case 1 -> conv.CelciusVersFarenheit(nb);
          case 2 -> conv.CelciusVersKelvin(nb);
          case 3 -> conv.FarenheitVersCelcius(nb);
          case 4 -> conv.FarenheitVersKelvin2(nb);
          case 5 -> conv.KelvinVersCelcius(nb);
          case 6 -> conv.KelvinVersFarenheit2(nb);
        }
        
        System.out.println(conv.toString());
      
    }
    
}
