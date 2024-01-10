package PBO.Enkapsulasi;

public class BolaEnkapsulasi {

    private double Jarijari;

    public BolaEnkapsulasi() {
        // this.Jarijari = Jarijari = 0.0;
    }

    public void setJarijari(double Jarijari) {
        if (Jarijari > 0) {
            this.Jarijari = Jarijari;
        } else {
            System.out.println("Jari-jari harus lebih dari 0");
        }
    }

    public double showDiameter() {
        return 2 * Jarijari;
    }

    public double showLuasPermukaan() {
        return 4 * Math.PI * Math.pow(Jarijari, 2);
    }

    public double showVolume() {
        return (4 / 3) * Math.PI * Math.pow(Jarijari, 3);
    }

    public static void main(String[] args) {
        double JarijariVariable = 5.0;

        BolaEnkapsulasi bolaObjek = new BolaEnkapsulasi();

        System.out.println("Diameter: " + bolaObjek.showDiameter());
        System.out.println("Luas Permukaan: " + bolaObjek.showLuasPermukaan());
        System.out.println("Volume: " + bolaObjek.showVolume());

        bolaObjek.setJarijari(JarijariVariable);

        System.out.println("\nSetelah Manipulasi:");
        System.out.println("Diameter: " + bolaObjek.showDiameter());
        System.out.println("Luas Permukaan: " + bolaObjek.showLuasPermukaan());
        System.out.println("Volume: " + bolaObjek.showVolume());

    }
}
