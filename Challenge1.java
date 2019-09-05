package challenge;

import java.util.Scanner;

public class Challenge1 {
    public static void main(String [] args) {
        int F, E, D, C, B, A;
        
        // Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("=-Selamat Datang di Program Challenge 2-=");
        System.out.println("\nSilahkan Input Nilai Siswa/Siswi Anda");
        System.out.print("\nNilai Tugas Harian = ");
        Double Nilai_TH = scanner.nextDouble();
        System.out.print("Nilai Laporan = ");
        Double Nilai_Laporan = scanner.nextDouble();
        System.out.print("Nilai Ujian = ");
        Double Nilai_Ujian = scanner.nextDouble();
        Double Nilai_Akhir;
        
        // Procces All Grade (Except Last Grade)
        System.out.println("\n=-=Hasil nilai menurut kententuan=-=");
        Nilai_TH = ((Nilai_TH * 30) / 100);
        System.out.println("Hasil Nilai Tugas Harian = " + Nilai_TH);
        Nilai_Laporan = ((Nilai_Laporan * 20) / 100);
        System.out.println("Hasil Nilai Laporan = " + Nilai_Laporan);
        Nilai_Ujian = ((Nilai_Ujian * 50) / 100);
        System.out.println("Hasil Nilai Ujian = " + Nilai_Ujian);
        
        // Procces Last Grade
        System.out.println("\n=-=Hasil Nilai Akhir=-=");
        Nilai_Akhir = (Nilai_TH + Nilai_Laporan + Nilai_Ujian); 
        System.out.println("Nilai Akhir = " + Nilai_Akhir);
        
        // Decision
        System.out.println("\n=-=Tingkatan Nilai=-=");
        
        if (Nilai_Akhir < 40) {
            System.out.println("Nilai F");
            
        } else if (Nilai_Akhir < 55) {
            System.out.println("Nilai E");
            
        } else if (Nilai_Akhir < 74) {
            System.out.println("Nilai D");
            
        } else if (Nilai_Akhir < 85) {
            System.out.println("Nilai C");
            
        } else if (Nilai_Akhir < 92) {
            System.out.println("Nilai B");
            
        } else {
            System.out.println("Nilai A");
        }
        
        // Decision 2
        System.out.println("\n=-=Pernyataan Lulus Dan Tidak Kelulusan Siswa=-=");
        if (Nilai_Akhir < 55) {
            System.out.println("Anda tidak lulus, tingkatkan belajar anda");
            
        } else if (Nilai_Akhir < 74) {
            System.out.println("Anda tidak lulus, tingkatkan belajar anda");
            
        } else if (Nilai_Akhir < 85) {
            System.out.println("Anda lulus dengan cukup, tingkatkan lagi prestasimu");
            
        } else if (Nilai_Akhir < 92) {
            System.out.println("Anda lulus dengan baik, pertahankan prestasimu");
            
        } else
            System.out.println("Anda lulus, Excellent");
     
    }
}
