class parent{
    String name;
}

//inheritance increases the reusability
class child1 extends parent{  //single level,heirarchial
    int age;
}
class child2 extends child1{        //multilevel

}
class son extends parent{       //hierarchial

}


public class three {
    public static void main(String[] args) {
        child1 c=new child1();
    c.age=20;
    c.name="shri";
    System.out.println(c.age+" "+c.name);
    }
    
}
