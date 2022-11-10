package Tugas1;
public class Mahasiswa extends Elemen { //polimorphizm
    private int sks;
    int jamSibuk;

    Mahasiswa(String nama, int sks) {
        super(nama);
        jamSibuk = sks*3;
        //TODO Auto-generated constructor stub
    }
    public int getJamSibuk(){
        return jamSibuk;
    }
    public void cek(){ //menggunakan method dri parent class
        System.out.println(getNama() + "adalah seorang mahasiswa dengan jam sibuk " + getJamSibuk());
    }
    public int sks(){
        return sks;
    }
}   
