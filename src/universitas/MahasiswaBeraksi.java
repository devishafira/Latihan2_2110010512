package universitas;


public class MahasiswaBeraksi {
    public static void main(String[] args){
            
    Mahasiswa mhs = new Mahasiswa(2110010512, "Devi shafira", "Teknik Informatika");

        // Calling accessor method
        System.out.println("Npm  - " + mhs.getNpm());
        System.out.println("Nama  - " + mhs.getNama());
        System.out.println("Prodi - " + mhs.getProdi());
    }
}
