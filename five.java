abstract class Animal{  //we cannot create the Animal object;
    abstract void walk();       //we must implement in child class if it is abstract
    public void run()       //its up to us ,these r not showing only useful info
    {
            //the methods which consist abstract those are showing only usefull info
    }
    Animal()       //can have the constructors
    {

    }       //so by using the abstract keyword we can archive the pure abstraction
}
class tiger extends Animal{
    public void walk()
    {
        System.out.println("walking");
    }
}


public class five {
    public static void main(String[] args) {
         tiger t=new tiger();
    t.walk();
    }
   

}
