package MODUL2.TPMODUL2_WAHYU;
public class MainApp {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan("K1234", 150.0, 4);
        Mobil mobil = new Mobil("M5678", 180.0, 5, 4);
        Bus bus = new Bus("B9012", 100.0, 30, 6);

        System.out.println(kendaraan);
        System.out.println(mobil);
        System.out.println(bus);

        double jarak = 300; // Example distance in kilometers
        System.out.println("Waktu tempuh kendaraan: " + kendaraan.hitungWaktuTempuh(jarak) + " jam");
        System.out.println("Waktu tempuh mobil: " + mobil.hitungWaktuTempuh(jarak) + " jam");
        System.out.println("Waktu tempuh bus: " + bus.hitungWaktuTempuh(jarak) + " jam");
    }
}