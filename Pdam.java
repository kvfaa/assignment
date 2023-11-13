import java.util.Scanner;

public class Pdam {

    static void TampilNama(int id){
        String namaPelanggan[]={"Ali","Budi","Dani","Edi","Umar"};
        System.out.println(namaPelanggan[id-1]); 
    }

    static void hitungTarif(int jumlahPakai){
    int harga = 0;
    if (jumlahPakai < 0 || jumlahPakai < 10) {
        jumlahPakai = 10;
        harga = jumlahPakai * 2000;

    } else if (jumlahPakai >= 11 && jumlahPakai <= 20) {
        harga = jumlahPakai * 3000;

    } else if (jumlahPakai >= 21 && jumlahPakai <= 30) {
        harga = jumlahPakai * 4000;

    } else if (jumlahPakai >= 31) {
        harga = jumlahPakai * 5000;
    }
    System.out.println(harga);
}
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        boolean status = true;

        do{
        int namaPelanggan = input.nextInt();
        System.out.println("ID Pelanggan: "+namaPelanggan);
        System.out.print("Nama Pelanggan: ");
        TampilNama(namaPelanggan);

        System.out.println("Masukkan Banyak Pemakaian air: ");
        int jumlahPakai = input.nextInt();
        System.out.println("Jumlah tarif:");
        hitungTarif(jumlahPakai);

        System.out.println("");
        System.out.print("Apakah anda ingin mencoba lagi? (Ya/Tidak)");
            String lagi = input.next();
            if (lagi.equalsIgnoreCase ("Tidak")) {
                status = false;

            } else {
                status =  true;
            }
            }while (status);

            input.close();

    }

}