package MODUL2.TPMODUL2_WAHYU;

class Bus extends Kendaraan {
    private int jumlahRoda;

    public Bus(String nomorIdentifikasi, double kecepatanMaksimum, int kapasitasPenumpang, int jumlahRoda) {
        super(nomorIdentifikasi, kecepatanMaksimum, kapasitasPenumpang);
        this.jumlahRoda = jumlahRoda;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "jumlahRoda=" + jumlahRoda +
                "} " + super.toString();
    }
}
