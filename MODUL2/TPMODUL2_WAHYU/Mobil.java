package MODUL2.TPMODUL2_WAHYU;
class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String nomorIdentifikasi, double kecepatanMaksimum, int kapasitasPenumpang, int jumlahPintu) {
        super(nomorIdentifikasi, kecepatanMaksimum, kapasitasPenumpang);
        this.jumlahPintu = jumlahPintu;
    }


    @Override
    public String toString() {
        return "Mobil{" +
                "jumlahPintu=" + jumlahPintu +
                "} " + super.toString();
    }
}
