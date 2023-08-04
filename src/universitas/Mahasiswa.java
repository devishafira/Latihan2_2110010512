package universitas;

public class Mahasiswa {
    private int npm;
    private String nama;
    private String prodi;

    // constructor
    Mahasiswa(int npm, String nama, String prodi) {
        this.npm = npm;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Accessor method to get sid and name
    public int getNpm() {
        return npm;
    }
    public String getNama() {
        return nama;
    }
    public String getProdi() {
        return prodi;
    }
}  