package MODUL2.MODUL2_WAHYU;

public class TelUExpress extends Ekspedisi{
 protected String name;
 protected boolean antarInter;


 public TelUExpress(int jumlahCabang, String pusat, float tarif, boolean antarInter){
  super(jumlahCabang,pusat,tarif);
  this.antarInter = antarInter;
 }

 @Override
 public void informasi(){
  // super.informasi();
  System.out.println("Ekspedisi TELUEXPRESS dengan jumlah cabang " + this.jumlahCabang 
  + " dan berpusat di " + this.pusat
  + " Mempunyai tarif " + this.tarif + " per Kg ");
  if (antarInter == true){
   System.out.println("Selain itu, ekspedisi ini melayani pengantaran international");
  }
  else{
    System.out.println("Selain itu, ekspedisi ini tidak melayani pengantaran international");
  }
}
 public void ambil(String tempat){
  System.out.println("TelUExpress berhasil mengambil pake ke "+ tempat);

 }
 public void antar(int resi){
  System.out.println("TelUExpress Berhasil mengatar paket dengan no resi  "+ resi);
  
 }
 public void antar(int resi_1,int resi_2){
  System.out.println("TelUExpress Berhasil mengatar paket dengan no resi  "+ resi_1 + " dan " + resi_2);
 }

}
