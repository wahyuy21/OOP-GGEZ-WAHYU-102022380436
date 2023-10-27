// package MODUL1.MODUL1_WAHYU.src;

public class User {
    private String userName;
    private char phoneNumber;
    // TODO: Create Private Attribute of User (Name and Phone Number) then Create Setter method for each attribute
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public char getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(char phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // TODO: Create Method to Register User and Display User's Name and Phone Number and success message
    public void Register(String userName, char phoneNumber){
        this.userName = userName;
        this.phoneNumber = phoneNumber;
    }
}
