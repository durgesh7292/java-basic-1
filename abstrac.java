public class abstrac {
    public static void main(String[] args) {
        Chicken c=new Chicken();
       c.eat();
        c.walk();
    }
}
abstract class Animal{
    void eat(){
        System.out.println("eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    void walk(){
        System.out.println("walks in 4 leg");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("walks in 4 ledddddg");
    }
}