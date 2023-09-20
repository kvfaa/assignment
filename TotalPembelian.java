package Perulangan;

import java.util.Scanner;

public class TotalPembelian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Item Yang Dibeli: ");
        int jumlahitem = input.nextInt();

        int i = 1;
        int harga = 0;
        int totalharga = 0;
        while (jumlahitem >= i) {

            System.out.println(i + "." + "Harga: ");
            harga = input.nextInt();

            System.out.println(i + "." + "Jumlah: ");
            jumlahitem = input.nextInt();
            System.out.println("-------------------");

            totalharga += harga * jumlahitem;
            i++;
        }

        System.out.println("Jumlah Item Yang DIbeli: " + jumlahitem);
        System.out.println("Total Harga: " + totalharga);

        input.close();

    }

}
