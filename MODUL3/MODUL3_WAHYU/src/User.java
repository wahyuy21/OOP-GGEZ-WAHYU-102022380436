public class User {
   
   
   // TO DO: Create Private Attributes of User (nama, noHandphone)
   private String nama;
   private String noHandPhone;
   // TO DO: Create Constructor of User
   
   public User(String nama, String noHandPhone) {
      this.nama = nama;
      this.noHandPhone = noHandPhone;
   }
   public void setNama(String nama) {
      this.nama = nama;
   }
   public void setNoHandPhone(String noHandPhone) {
      this.noHandPhone = noHandPhone;
   }
   // TO DO: Create register Method to show information about name and phone number
   public void register(){
        System.out.println("\nRegister Berhasil");
        System.out.println("\nNama: "+this.nama);
        System.out.println("\nNo Handphone: "+this.noHandPhone);
    }
   // TO DO: Create method to return name and phone number

   public String getNama() {
      return nama;
   }

   public String getNoHandPhone() {
      return noHandPhone;
   }
}






  