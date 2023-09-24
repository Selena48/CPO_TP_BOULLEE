/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author NB-X02
 */
public class TP1_stats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] tb = new int[6];
        int m;
        Random generateurAleat = new Random();
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Entrer un nombre nombre :");
        m =sc.nextInt();// nombre choisi
        
        for (int i = 0; i < m; i++) {
            int resultatLancer = generateurAleat.nextInt(6);
            tb[resultatLancer]++;
        }
        
        for (int i = 0; i < tb.length; i++) {
            double pourcentage = (double) tb[i] / m * 100;
            System.out.println("la face "+(i+1)+" : "+pourcentage+"%");
        }
    }
    
}
