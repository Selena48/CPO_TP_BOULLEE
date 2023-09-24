/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet;

/**
 *
 * @author NB-X02
 */
public class Convertisseur {
    
    //Constructor
    public Convertisseur() {
    nbConversions = 0;
}
    
    /*Attributs*/
    int nbConversions; 
    
// FONCTIONS
    public double CelciusVersKelvin (double tCelcius) {
        // Transforme une température celcius en kelvin
        double kelvin;
        kelvin= tCelcius+273.15;
        nbConversions++;
        return kelvin;
    }

    public double KelvinVersCelcius (double tKelvin) {
        // Transforme une température kelvin en celcius
        double celcius;
        celcius= tKelvin-273.15;
        nbConversions++;
        return celcius;
    }
    
    public double FarenheitVersCelcius (double tfarenheit) {
        // Transforme une température kelvin en celcius
        double celcius;
        celcius=(tfarenheit-32)*5/9;
        nbConversions++;
        return celcius;
    }
        
    public double CelciusVersFarenheit (double tCelcius) {
        // Transforme une température celcius en kelvin
        double farenheit;
        farenheit = (tCelcius*9/5) + 32 ;
        nbConversions++;
        return farenheit;
    }
   
        public  double FarenheitVersKelvin2 (double tfarenheit) {
        // Transforme une température kelvin en celcius
        double kelvin;
        kelvin = CelciusVersKelvin(FarenheitVersCelcius(tfarenheit));
        nbConversions++;
        return kelvin;
    }    
    public double KelvinVersFarenheit2 (double tKelvin) {
        // Transforme une température celcius en kelvin
        double farenheit;
        farenheit = CelciusVersFarenheit(KelvinVersCelcius(tKelvin)) ;
        nbConversions++;
        return farenheit;
    }
    
    @Override
    public String toString() {
    return "nb de conversions : "+ nbConversions ;
    }
   
    
}
