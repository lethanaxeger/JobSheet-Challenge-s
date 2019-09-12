package Latihan2_Multi_Dimension;

public class Latihan2_2 {
        
        // Deklarasi
        int nis[][] = {{21652}, {21652}, {21653}};
        String nama [][] = {{"Bambang"}, {"Udin"}, {"Nurhadi"}};
        
        // Bagian Kampr*t
        public void tampil(String n) {
            System.out.println("Identitas Siswa Angkatan 24");      
    }
        public void namanis (int n) {
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 1; j++) {
                    System.out.println(nama[1][j] + " : " + nis[1][j]);
                }
            }
        }
        public static void main (String[] args) {
            Latihan2_2 siswa = new Latihan2_2();
            siswa.tampil (null);
            siswa.namanis(0);
        }
    
}
