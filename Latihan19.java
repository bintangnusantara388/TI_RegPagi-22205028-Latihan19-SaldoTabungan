/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan19;
/**
 *
 * @author user 
 Nama              : Bintang Fajar Nusantara 
 Nim               : 22205028 
 Prodi             : Teknik Informatika 
 Kelas             : PBO 1
 Deskripsi Program : Program ini berisi program yang menampilkan Saldo Tabungan
 */
import java.util.Scanner;



public class Latihan19 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Saldo Awal: ");
        int saldoAwal = scanner.nextInt();

        System.out.print("Bunga/Bulan (%): ");
        int bungaPerBulan = scanner.nextInt();

        System.out.print("Lama (bulan): ");
        int lama = scanner.nextInt();

        // Hitung saldo
        for (int i = 1; i <= lama; i++) {
            saldoAwal += saldoAwal * bungaPerBulan / 100;
            System.out.println("Saldo di bulan ke-" + i + " Rp." + saldoAwal);
 }
}

}
