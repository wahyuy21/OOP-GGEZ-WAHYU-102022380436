package MODUL2.MODUL2_WAHYU;

public class Ekspedisi {
 protected int jumlahCabang;
 protected String pusat;
 protected float tarif;

 public Ekspedisi(int jumlahCabang, String pusat, float tarif) {
  this.jumlahCabang = jumlahCabang;
  this.pusat = pusat;
  this.tarif = tarif;
 }

 public void informasi(){
  System.out.println("Ekspedisi tidak diketahui dengan jumlah cabang " + this.jumlahCabang 
  + " dan berpusat di " + this.pusat 
  + " Mempunyai tarif " + this.tarif + " per Kg ");

 }

 
}
