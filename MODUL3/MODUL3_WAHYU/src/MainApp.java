import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        // TO DO : Create a Scanner object to receive input from the user
        Scanner scanner = new Scanner(System.in);
        // TO DO : Create Bioskop and Cashier objects
        Bioskop b1 = new Bioskop();
        // TO DO : Take the name from the user, make sure it is not empty
        System.out.println("===SIlahkan Register===");
        System.out.println("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.println("Masukkan No Handphone: ");
        String noHandPhone = scanner.nextLine();
        // TO DO : Take the phone number from the user, make sure it is valid
        User u1 = new User(nama, noHandPhone);
        System.out.println("======================");
        System.out.println("Register Berhasil");
        System.out.println("Nama        : "+u1.getNama());
        System.out.println("No Handphone: "+u1.getNoHandPhone());
        // TO DO : Create a code for ticket order
        // TO DO : Create a exception if user enter not numbe
        // TO DO : Create a exception if user enter number is out of range
        // TO DO : Call the method to reserve seats in the cinema
        System.out.println("\nSelamat Datang di Bioskop EAD!");
        b1.displaySeating();
        System.out.println("\nApakah anda ingin memesan kursi ? (y/n)");
        String uChoice = scanner.nextLine();
        if(uChoice.equals("y")){
            System.out.println("Masukkan Baris: ");
            int row = scanner.nextInt();
            System.out.println("Masukkan Kolom: ");
            int seat = scanner.nextInt();
            b1.bookSeat(row, seat);
        }else{
            System.out.println("Selamat Menonton");
        }
        // TO DO : Close the Scanner object when the user is finished   
        scanner.close();
    }
}