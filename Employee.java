package employee;
import java.util.*;
public class Employee {
private String nama,IDkerja,jabatan;
public int gaji=3500000;
public int TahunMasuk,Istri,JumlahAnak,Lembur;
public double LK,bonus,Tunjangan,TunjanganIstri,TunjanganAnak;
Scanner input=new Scanner(System.in);
   public Employee(String nama ,String jabatan,String IDkerja,int LK,int TunjanganIstri,int TunjanganAnak){
    this.nama=nama;
    this.jabatan=jabatan;
    this.IDkerja=IDkerja;
    this.LK=LK;
    this.TunjanganIstri=TunjanganIstri;
    this.TunjanganAnak=TunjanganAnak;
}
public String getnama(){
    return nama;
}
public String getjabatan(){
    return jabatan;
}
public String getIDkerja(){
    return IDkerja;
    }
public int getTahunKerja(){
    System.out.println("Tahun Masuk Kerja :");
    TahunMasuk=input.nextInt();
    return TahunMasuk;
}
public double getLamaKerja(){
    LK=2016-TahunMasuk;
    return LK;
}
public int getGaji(){
    gaji=3500000;
    return gaji;
}
public double getBonus(){
    if(getLamaKerja()<=5)
        bonus=0;
    else if(getLamaKerja()>6 && getLamaKerja()<=10)
        bonus=0.05*getGaji();
    else
        bonus=0.1*getGaji();
    return bonus;
}
public double getTunjangan(){
     if(getLamaKerja()<=5)
          Tunjangan=0;
     else if(getLamaKerja()>6 && getLamaKerja()<=10)
          Tunjangan=0;
     else
         Tunjangan=0.1*getGaji();
    return Tunjangan;
}
public double getTunjanganIstri(){
    System.out.println("1.Sudah\n2.Belum");
    System.out.println("Apakah Anda sudah Berkeluarga ?");
    int Istri =input.nextInt();
    if(Istri== 1 )
        TunjanganIstri=0.1*getGaji()+getBonus()+getTunjangan();
    else
        TunjanganIstri=0;
    return TunjanganIstri;
}
public double getTunjanganAnak(){
    System.out.println("Masukan Jumlah Anak :");
    int JumlahAnak =input.nextInt();
    if(JumlahAnak<=3)
        TunjanganAnak=(0.15*getGaji()+getBonus()+getTunjangan())*JumlahAnak;
    else 
        TunjanganAnak=(3*0.15*getGaji()+getBonus()+getTunjangan());
    return TunjanganAnak;
}
public double getTotal(){
    return getGaji()+getBonus()+getTunjangan();
    }
 public double getTotalGaji(){
        return getTotal()+TunjanganIstri+TunjanganAnak;
    }
 

}
