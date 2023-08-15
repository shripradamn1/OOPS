class Student{
    String name;
    int age;

    public void output(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(Student a){    //copy constructor
        this.name=a.name;
        this.age=a.age;
       
    }
    Student(String name,int age){   //parameterized constructor
        this.name=name;
        this.age=age;
    }
}



public class one{
    public static void main(String[] args){
       
         Student s2=new Student("s",70);
         Student s1=new Student(s2);
        s1.output();
        
        s2.output();
        
    }
}