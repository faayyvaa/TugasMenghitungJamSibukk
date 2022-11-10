package Tugas1;
public class Dosen extends Elemen {
    private int jumlahHariKerja;
    public int jamSibuk;
    Dosen(String nama, int jumlahHariKerja) {
        super(nama);
        jamSibuk = jumlahHariKerja*8 ;
        //TODO Auto-generated constructor stub
    }
    public void cek(){
        System.out.println(getNama() + " Adalah seorang dosen dengan jam sibuk " + getJamSibuk() );
    }
    public int getJamSibuk(){
        return jamSibuk;
    }
    public int getJumlahHariKerja() {
        return jumlahHariKerja;
    }
}
