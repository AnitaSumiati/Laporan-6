package employee;
import java.util.*;
public class MainEmployee {
    public static void main (String [] args){
    String nama,IDkerja,jabatan ;
    int LK,jumlahAnak = 0,TahunMasuk,Lembur = 0;
    Scanner input = new Scanner (System.in);
        System.out.println("-------------------------------");
        System.out.println("    Data Employee    ");
        System.out.println("-------------------------------");
        System.out.print("Nama Employee             : ");
        nama = input.next();
        System.out.print("ID Kerja Employee         : ");
        IDkerja = input.next();
        System.out.print("Jabatan Employe           : ");
        jabatan= input.next();
        System.out.print("Punya Istri (iya/tidak)   : ");
        String Status = input.next();
        System.out.print("Punya Anak (iya/tidak)    : ");
        String Anak = input.next();
        System.out.print("Tahun Masuk Employe       : ");
        TahunMasuk = input.nextInt();
        System.out.println("-------------------------------");
        System.out.println("    Jabatan     ");
        System.out.println("1.Pegawai Tetap\n2.Manager\n3.Pegawai Tidak Tetap");
        System.out.print("Masukkan jabatan Anda: ");
        int jabatan1 = input.nextInt();
        if (jabatan1 == 1) {
            PegawaiTetap PT = new PegawaiTetap(nama, Status, IDkerja, TahunMasuk, 2, jumlahAnak);
            System.out.println("-------------------------------");
            PT.data();
            System.out.println("-------------------------------");
        } else if (jabatan1 == 2) {
            Manager M = new Manager(nama,Status, IDkerja, TahunMasuk, 1, jumlahAnak);
            System.out.println("-------------------------------");
            M.data();
            System.out.println("-------------------------------");
        } else {
            PegawaiTidakTetap PTT = new PegawaiTidakTetap(nama, Status, IDkerja, TahunMasuk, 3,jumlahAnak, Lembur);
            System.out.println("-------------------------------");
            PTT.Data();
            System.out.println("-------------------------------");
        }
    }
}