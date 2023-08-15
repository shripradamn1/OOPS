//method overloading
    class Student{
        String name;
        int age;

        public void output(int age){
            System.out.println("age is "+this.age);
        }
        public void output(String name){
            System.out.println("name is "+this.name);
        }
        public void output(String name,int age){
            System.out.println("name is "+this.name+" "+this.age);
        }
    }

public class two {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="shri";
        s1.age=25;
        s1.output(s1.age);
        s1.output(s1.name);
        s1.output(s1.name,s1.age);

    }
}
