public class hierchi {
    public static void main(String[] args) {
        Animal bobby=new Animal();
        bobby.eat();
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}
class Fish extends Animal{
void swin(){
    System.out.println("swins");
}
}
class Bird extends Animal{
    void fly(){
        System.out.println("flys");
    }

}
