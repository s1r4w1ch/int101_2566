package int101.work04;

public class Person {
    private int id;
    public Person(int id){this.id = id;}
    public int getid(){return id;}
    public void setid(int id){this.id = id;}
    
    @Override
    public String toString(){return "Person("+"id = "+ id +')';}
}
