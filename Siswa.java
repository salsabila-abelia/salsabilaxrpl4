public class Siswa {

    private String nama;
    private int usia;
    private double nilai;

    
    public Siswa(String nama, int usia, double nilai) {
        this.nama = nama;
        setUsia(usia); 
        setNilai(nilai); 
    }

   
    public String getNama() {
        return nama;
    }

    
    public void setNama(String nama) {
        this.nama = nama;
    }

    
    public int getUsia() {
        return usia;
    }

    
    public void setUsia(int usia) {
        if (usia > 0) {
            this.usia = usia; 
        } else {
            System.out.println("Usia tidak valid. Usia harus lebih dari 0.");
        }
    }

    
    public double getNilai() {
        return nilai;
    }

    
    public void setNilai(double nilai) {
        if (nilai >= 0 && nilai <= 100) {
            this.nilai = nilai; 
        } else {
            System.out.println("Nilai tidak valid. Nilai harus berada di antara 0 dan 100.");
        }
    }


    public void tampilkanInformasi() {
        System.out.println("Nama: " + getNama());
        System.out.println("Usia: " + getUsia());
        System.out.println("Nilai Rata-Rata: " + getNilai());
    }
}
