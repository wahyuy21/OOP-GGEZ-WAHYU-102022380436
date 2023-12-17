package MODUL3.TPMODUL3_WAHYU;

public class Teacher extends User {

    public Teacher(String name, int id) {
        super(name, id);
    }

    public void teachClass(String course) {
        System.out.println(name + " is now teaching the course: " + course);
    }

    @Override
    public String getUserDetails() {
        return super.getUserDetails() + ", Teaches Classes.";
    }
}
