package Tugas1;
public class Asdos extends Mahasiswa{
private int jamNgasdos;

    Asdos(String nama, int sks, int jamNgasdos) {
        super(nama, sks);
        cekNgasdos (jamNgasdos);

        //TODO Auto-generated constructor stub
    }
    public int getJamSibuk(){
        return jamNgasdos + super.getJamSibuk();

    }
    void cekNgasdos(int newJamNgasdos){
        if(newJamNgasdos>0){
            jamNgasdos = newJamNgasdos;
        }
    }
    public void cek(){
        System.out.println(getNama() + " Adalah seorang Asdos dengan jam Sibuk " + getJamSibuk());
    }
    
}
