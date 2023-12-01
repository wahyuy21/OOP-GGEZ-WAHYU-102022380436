package MODUL2.MODUL2_WAHYU;

public class FRIExpress extends Ekspedisi{
 protected boolean pecahBelah;

 public FRIExpress(int jumlahCabang, String pusat, float tarif,boolean pecahBelah) {
  super(jumlahCabang,pusat,tarif);
  this.pecahBelah = pecahBelah;
 }

  @Override
  public void informasi(){
  // super.informasi();
  System.out.println("Ekspedisi FRIEXPRESS dengan jumlah cabang " + this.jumlahCabang 
  + " dan berpusat di " + this.pusat 
  + " Mempunyai tarif " + this.tarif + " per Kg ");
  if (pecahBelah == true){
    System.out.println("Selain itu, ekspedisi ini melayani paket pecah belah");
  }
  else{
    System.out.println("Selain itu, ekspedisi ini tidak melayani paket pecah belah");
  }
 }


 public void terima(int jumlahPaket){
  System.out.println("FRIExpress baru saja menerima paket yang masuk di sortis sebanyak "+ jumlahPaket + " paket");

 }
 public void kirim(String tujuan){
  System.out.println("FRIExpress Berhasil mengirim paket dengan ke tujuan  "+ tujuan);
  
 }

 public void kirim(String tujuan_1, String tujuan_2){
  System.out.println("FRIExpress Berhasil mengirim paket dengan ke tujuan  "+ tujuan_1 + " dan " + tujuan_2);
 }
 
 
}
