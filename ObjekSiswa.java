import java.util.Scanner;

public class ObjekSiswa {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        int usia = 0;
        double nilai = 0;
        
        System.out.print("Masukkan nama siswa: ");
        String nama = scanner.nextLine();

        do { 
            System.out.print("Masukkan usia siswa: ");
            usia = scanner.nextInt();
            if (usia < 0) {
                System.out.println("tidak cukup umur");
            }
        } while (usia < 0);

        do { 
            System.out.print("Masukkan nilai rata-rata siswa: ");
            nilai = scanner.nextDouble();
            if (nilai < 0) {
                System.out.println("nilai tidak boleh negatif");
            }
        } while (nilai < 0);


        // Membuat objek Siswa dengan data yang dimasukkan oleh pengguna
        Siswa siswa1 = new Siswa(nama, usia, nilai);

        // Menampilkan informasi siswa
        siswa1.tampilkanInformasi();

        
    
    }
}


