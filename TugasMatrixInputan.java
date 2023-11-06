package Matrix;

import java.util.Scanner;

public class TugasMatrixInputan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Ordo Matriks");
        System.out.println("Masukkan Jumlah Baris: ");
        int jumlah = input.nextInt();
        System.out.println("Masukkan Jumlah Kolom: ");
        int Kolom = input.nextInt();

        int Matrix[][] = new int[jumlah][Kolom];

        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                System.out.print("Masukkan Nilai Matrix 1" + i + " Kolom " + j +": ");
                Matrix[i][j] = input.nextInt();
                
            }
    
        }
     
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                System.out.print(Matrix[i][j] + ", ");
                
                
            }
            System.out.println();
        }
     





        input.close();
    }
}