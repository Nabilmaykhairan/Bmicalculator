/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author 
 */
public class Bmicalculator {
public static void main(String[] args) {
     
     Scanner be = new Scanner (System.in);
     Scanner ti = new Scanner(System.in);
     
     double b; double t; double BMI;
     
     
     System.out.println("Masukkan Berat badan anda = ");
     b = be.nextDouble();
     
     System.out.println("Masukkan Tinggi badan anda = ");
     t = ti.nextDouble();
     
     double bmi = b/(t*t);
     System.out.print("Hasil dari BMI anda adalah "  +  bmi  );
     
     if (bmi < 18.5)
        System.out.println(" Kurus");
     else if (bmi < 25)
         System.out.println(" Normal");
     else if (bmi < 30)
         System.out.println(" Gemuk");
     else if(bmi >30)
         System.out.println(" Obesitas");
         }
}
