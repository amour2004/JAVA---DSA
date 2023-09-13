public class Abstraction {
    public static void main(String args[]){
        dog d1 = new dog();
        System.out.println(d1.color);
    }
}

abstract class animals{
    String color;
    void eat(){
        System.out.println("eats");
    }
    animals(){
        color = "brown";
    }
    abstract void walk();
}

class dog extends animals{
    void walk(){
        System.out.println("walks on 4 legs");
    }
    void changecolor(){
        color = "black";
    }
}