package MODUL2.MODUL2_WAHYU;

public class Main {
 public static void main(String[] args) {
   Ekspedisi ekspedisi1 = new Ekspedisi(10, "BD", 1000);
   TelUExpress ekspedisi2 = new TelUExpress(100,"JKT",10000,true);
   FRIExpress ekspedisi3 = new FRIExpress(100,"BS",2000,true);
   ekspedisi1.informasi();
   ekspedisi2.informasi();
   ekspedisi2.ambil("Sukabirus");
   ekspedisi2.antar(380436);
   ekspedisi2.antar(380436,380433);
   ekspedisi3.informasi();
   ekspedisi3.terima(1000);
   ekspedisi3.kirim("Sukabirus");
   ekspedisi3.kirim("Sukabirus","Bojongsoang");
 }

 
}
