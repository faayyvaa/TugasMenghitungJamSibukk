package Tugas1;

public class App {
//polimorphizm
    public static void main(String[] args) throws Exception {
    //Downcasting
    Asdos a = new Asdos("Fairuzikun", 24, 1);
    //polimorphizm
    Dosen b = new Dosen("Raja OP Demanik", 5);
    //upcasting
    Elemen c = new Asdos("Angle-Chan", 21, 1);
    //polimorphizm
    Mahasiswa d = new Mahasiswa("Firman ", 20);
    //downcasting
    Elemen e = new Mahasiswa("Nid to pass this sem ", 23);
    //upcasting
    Elemen f = new Dosen("Nivotko", 3);

    a.cek();
    b.cek();
    c.cek();
    d.cek();
    e.cek();
    f.cek();

    int total = a.getJamSibuk() + b.getJamSibuk() + c.getJamSibuk() + d.getJamSibuk() + e.getJamSibuk() + f.getJamSibuk();
    System.out.println("Total jam Sibuk Elemen Fasilkom adalah " + total);

    }
}
