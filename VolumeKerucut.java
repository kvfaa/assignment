import java.util.Scanner;

public class VolumeKerucut {
    public static void main(String[] args) {
        
        Scanner kerucut = new Scanner(System.in);

        System.out.println("Masukkan Jari-Jari: ");
        double jari = kerucut.nextDouble();
        
        System.out.println("Masukkan Tinggi: ");
        double tinggi = kerucut.nextDouble();

        double phi = 3.14;

        double volumeKerucut = phi*(jari*jari)*tinggi*1/3;
        System.out.println("Volume Kerucut = "+ volumeKerucut);

        kerucut.close();
    }
}