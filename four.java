class Student {
    public String Fname;// can be accessed anywhere
    String Lname; // default access modifier cannot be accessed in different packege
    protected int age; // can be accessed in different package by subclasses
    private String password;// can be accessed within the class

    public String get() {
        return this.password;
    }

    public void set(String p) {
        this.password = p;
    }
}

public class four {
    public static void main(String[] args) {
        Student s = new Student();
        s.set("shri");
        System.out.println(s.get());
    }

}
