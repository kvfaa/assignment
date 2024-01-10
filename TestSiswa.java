package PBO.Enkapsulasi;

public class TestSiswa {

    public static void main(String[] args) {
        // TODO code application logic here
        encapSiswa siswa = new encapSiswa();
        siswa.setName("Kalip");
        siswa.setAge(16);
        siswa.setAddress("Malang");

        System.out.println("nama: " + siswa.getName()
                + " alamat " + siswa.getAddress() + " berumur " + siswa.getAge()
                + " tahun");
    }

}
