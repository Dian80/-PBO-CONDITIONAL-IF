/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_genap_ganjil;

import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;
/**
 *
 * @author ENDANG
 */
public class Tugas_genap_ganjil {
    public static void main (String [] args){
    //membuat program untuk mengacak bilangan ganjil
    Scanner input = new Scanner (System.in);
    
    System.out.println("Masukkan Sebuah Angka");
        int angka = input.nextInt();
        
        //Ganjil -> jika angka % 2 = 1
        //Genap -> jika angka % 2 = 0
        if (angka % 2 == 0){
            System.out.println("Angka" + angka + "Adalah Bilangan Genap");
        }else{
            System.out.println("Angka" + angka + "Adalah Bilangan Ganjil");
        }
        
    }
    
}
