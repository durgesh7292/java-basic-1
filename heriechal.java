public class heriechal {
    public static void main(String[] args) {
        Fish bobby=new Fish();
        bobby.eat();
        
    }
}
class Animals{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Mammal extends Animals{
    void walk(){
        System.out.println("walks");
    }
}
class Fish extends Animals{
    void swin(){
        System.out.println("swins");
    }
}
class Bird extends Animals{
    void fly(){
        System.out.println("flys");
    }
}
