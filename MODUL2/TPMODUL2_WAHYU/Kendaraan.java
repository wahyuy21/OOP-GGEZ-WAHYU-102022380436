package MODUL2.TPMODUL2_WAHYU;
class Kendaraan {
    private String nomorIdentifikasi;
    private double kecepatanMaksimum;
    private int kapasitasPenumpang;

    public Kendaraan(String nomorIdentifikasi, double kecepatanMaksimum, int kapasitasPenumpang) {
        this.nomorIdentifikasi = nomorIdentifikasi;
        this.kecepatanMaksimum = kecepatanMaksimum;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }


    public double hitungWaktuTempuh(double jarak) {
        return jarak / this.kecepatanMaksimum;
    }

    @Override
    public String toString() {
        return "Kendaraan{" +
                "nomorIdentifikasi='" + nomorIdentifikasi + '\'' +
                ", kecepatanMaksimum=" + kecepatanMaksimum +
                ", kapasitasPenumpang=" + kapasitasPenumpang +
                '}';
    }
}