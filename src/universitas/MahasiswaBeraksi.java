package universitas;


public class MahasiswaBeraksi {
    public static void main(String[] args){
            
    Mahasiswa mhs = new Mahasiswa("2110010512", " Devi shafira", " Teknik Informatika");
    
    
        System.out.println("Nama: "+mhs.getNama());
        System.out.println("NPM: "+mhs.getNpm());
        System.out.println("Prodi: "+mhs.getProdi());
        
        System.out.println(mhs.setDetail());

    
}
}
