public class Siswa {
    // Atribut private
    private String nama;
    private int usia;
    private double nilai;

    // Konstruktor
    public Siswa(String nama, int usia, double nilai) {
        this.nama = nama;
        setUsia(usia); // Menggunakan setter untuk validasi
        setNilai(nilai); // Menggunakan setter untuk validasi
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk usia
    public int getUsia() {
        return usia;
    }

    // Setter untuk usia dengan validasi
    public void setUsia(int usia) {
        if (usia > 0) {
            this.usia = usia; // Usia hanya bisa diubah jika lebih dari 0
        } else {
            System.out.println("Usia tidak valid. Usia harus lebih dari 0.");
        }
    }

    // Getter untuk nilai
    public double getNilai() {
        return nilai;
    }

    // Setter untuk nilai dengan validasi
    public void setNilai(double nilai) {
        if (nilai >= 0 && nilai <= 100) {
            this.nilai = nilai; // Nilai hanya bisa diubah jika berada antara 0 dan 100
        } else {
            System.out.println("Nilai tidak valid. Nilai harus berada di antara 0 dan 100.");
        }
    }

    // Method untuk menampilkan informasi siswa
    public void tampilkanInformasi() {
        System.out.println("Nama: " + getNama());
        System.out.println("Usia: " + getUsia());
        System.out.println("Nilai Rata-Rata: " + getNilai());
    }
}
