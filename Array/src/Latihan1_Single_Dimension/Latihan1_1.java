package Latihan1_Single_Dimension;

public class Latihan1_1 {
    public static void main (String []args) {
        
        // Deklarasi
        int nilai [] = new int [3];
        
        //input
        nilai [0] = 70;
        nilai [1] = 80;
        nilai [2] = 65;
        
        // Deklarasi 2
        double ratarata = 0.0;
        
        for (int i = 0; i < nilai.length; i++) ratarata += nilai [i];
        ratarata /= nilai.length;
        
        //output
        System.out.println("Nilai rata-rata = "+ ratarata);
        
    }
}
