package employee;

public class Manager extends Employee {

    double Jabatan;
    public Manager(String nama, String jabatan, String IDkerja,int LK,int TunjanganIstri,int TunjanganAnak) {
        super(nama, jabatan, IDkerja,LK,TunjanganIstri,TunjanganAnak);  
    }  
    public double getTunjanganJabatan(){
      double Jabatan=0.1*getTotal();
      return Jabatan;
    }
      public void data(){
        System.out.println("Hasil Data Pegawai Tetap");
        System.out.println("Nama    :"+getnama());
        System.out.println("IDkerja :"+getIDkerja());
        System.out.println("Jabatan :"+getjabatan());
        System.out.println("Gaji    :"+"Rp."+getGaji());
        System.out.println("----------------------------");
        System.out.println("Tunjangan :Rp."+getTunjangan());
        System.out.println("----------------------------");
        System.out.println("Tunjangan istri:Rp."+getTunjanganIstri());
        System.out.println("----------------------------");
        System.out.println("Tunjangan Anak :Rp."+getTunjanganAnak());
        System.out.println("----------------------------");
        System.out.println("Bonus   :Rp."+getBonus());
        System.out.println("----------------------------");
        System.out.println("Tunjangan Jabatan :Rp."+getTunjanganJabatan());
        System.out.println("----------------------------");
        System.out.println("Total Gaji Yang Diperoleh :Rp."+(getTotalGaji()+getTunjanganJabatan()));
    }
}