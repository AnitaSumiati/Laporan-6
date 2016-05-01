package employee;
import java.util.*;
public class PegawaiTidakTetap extends Employee{
   Scanner input=new Scanner(System.in);
    
    private int jam,Lembur;

    public PegawaiTidakTetap(String nama, String jabatan, String IDkerja, int LK, int TunjanganIstri, int TunjanganAnak,int Lembur) {
        super(nama, jabatan, IDkerja, LK, TunjanganIstri, TunjanganAnak);
        this.Lembur=Lembur;
    }
    
public int Lembur(){
    System.out.println("Masukan Banyak Lemburan (jam) :");
     int jam=input.nextInt();
        if(jam <10)
           Lembur=0;
        else
            Lembur=jam*10000;
        return Lembur;
    }
    public int Total(){
        return getGaji()+Lembur();
    }
public void Data(){
    System.out.println("Hasil Pendapatan Pegawai Tidak Tetap");
    System.out.println("Nama    :"+super.getnama());
    System.out.println("IDkerja :"+super.getIDkerja());
    System.out.println("Jabatan :"+super.getjabatan());
    System.out.println("----------------------------");
    System.out.println("Lembur  :"+Lembur());
    System.out.println("----------------------------");
    System.out.println("Total Gaji Yang Diperoleh   :"+"Rp."+Total());
}
}