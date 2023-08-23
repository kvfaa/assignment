import java.util.Scanner;

public class VolumeTabung {
    public static void main(String[] args) {
        
        Scanner tabung = new Scanner(System.in);

        System.out.println("Jari-Jari: ");
        double jari = tabung.nextDouble();

        System.out.println("Tinggi: ");
        double tinggi = tabung.nextDouble();

        double phi = 3.14;

        double VolumeTabung = phi*(jari*jari)*tinggi;
        System.out.println("Hasil: "+ VolumeTabung);

        tabung.close();
    }
}
