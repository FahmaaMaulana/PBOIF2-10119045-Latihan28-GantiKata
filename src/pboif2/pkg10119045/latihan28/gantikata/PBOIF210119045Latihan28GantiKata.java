/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119045.latihan28.gantikata;
import java.util.Scanner;
/**
 *
 * @author Legion
 * NAMA                 : Fahma Maulana
 * KELAS                : PBOIF2
 * NIM                  : 10119045
 * Deskripsi Program    : Ganti Kata
 */
public class PBOIF210119045Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        String kalimat,ganti,menjadi;
        
        System.out.println("===Program Mengganti Kata===");
        System.out.print("Masukkan Kalimat : ");
        kalimat = input.nextLine();
        System.out.print("Ganti Kata : ");
        ganti = input.nextLine();
        System.out.print("Menjadi Kata : ");
        menjadi = input.nextLine();
        
        System.out.println("===Hasil Formatting===");
        System.out.println("Kalimat Awal : " + kalimat);
        System.out.println("Kalimat Baru : " + kalimat.replace(ganti,menjadi));
    }
    
}
