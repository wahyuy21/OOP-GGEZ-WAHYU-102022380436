package MODUL3.TPMODUL3_WAHYU;

public class Admin extends User {

    public Admin(String name, int id) {
        super(name, id);
    }

    public void manageSystem(String system) {
        System.out.println(name + " is managing the system for: " + system);
    }

    @Override
    public String getUserDetails() {
        return super.getUserDetails() + ", Manages Systems.";
    }
}