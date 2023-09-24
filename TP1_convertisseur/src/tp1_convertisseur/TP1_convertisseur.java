/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur;

import java.util.Scanner;

/**
 *
 * @author NB-X02
 */
public class TP1_convertisseur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Initialisation
        double nb; // premier nombre 
        int methodNumber;
        Scanner sc = new Scanner(System.in);

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
          case 1 -> System.out.println(nb +" degré Celcius est égal à "+CelciusVersKelvin(nb)+" degrés Kelvin");
          case 2 -> System.out.println(nb +" degré Celcius est égal à "+CelciusVersFarenheit(nb)+" degrés Farenheit");
          case 3 -> System.out.println(nb +" degré Kelvin est égal à "+KelvinVersCelcius(nb)+" degrés Celcius");
          case 4 -> System.out.println(nb +" degré Kelvin est égal à "+KelvinVersFarenheit2(nb)+" degrés Farenheit");
          case 5 -> System.out.println(nb +" degré Farenheit est égal à "+FarenheitVersCelcius(nb)+" degrés Celcius");
          case 6 -> System.out.println(nb +" degré Farenheit est égal à "+FarenheitVersKelvin2(nb)+" degrés Kelvin");
        }
    }
    
    // FONCTIONS
    public static double CelciusVersKelvin (double tCelcius) {
        // Transforme une température celcius en kelvin
        double kelvin;
        kelvin= tCelcius+273.15;
        return kelvin;
    }

    public static double KelvinVersCelcius (double tKelvin) {
        // Transforme une température kelvin en celcius
        double celcius;
        celcius= tKelvin-273.15;
        return celcius;
    }
    
    public static double FarenheitVersCelcius (double tfarenheit) {
        // Transforme une température kelvin en celcius
        double celcius;
        celcius=(tfarenheit-32)*5/9;
        return celcius;
    }
        
    public static double CelciusVersFarenheit (double tCelcius) {
        // Transforme une température celcius en kelvin
        double farenheit;
        farenheit = (tCelcius*9/5) + 32 ;
        return farenheit;
    }
    
    // Méthode malin
        public static double FarenheitVersKelvin2 (double tfarenheit) {
        // Transforme une température kelvin en celcius
        double kelvin;
        kelvin = CelciusVersKelvin(FarenheitVersCelcius(tfarenheit));
        return kelvin;
    }    
    public static double KelvinVersFarenheit2 (double tKelvin) {
        // Transforme une température celcius en kelvin
        double farenheit;
        farenheit = CelciusVersFarenheit(KelvinVersCelcius(tKelvin)) ;
        return farenheit;
    }
    
}
