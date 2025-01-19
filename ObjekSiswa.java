import java.util.Scanner;

public class ObjekSiswa {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan nama siswa: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan usia siswa: ");
        int usia = scanner.nextInt();

        System.out.print("Masukkan nilai rata-rata siswa: ");
        double nilai = scanner.nextDouble();

        // Membuat objek Siswa dengan data yang dimasukkan oleh pengguna
        Siswa siswa1 = new Siswa(nama, usia, nilai);

        // Menampilkan informasi siswa
        siswa1.tampilkanInformasi();

        
    
    }
}


