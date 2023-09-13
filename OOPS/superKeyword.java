public class superKeyword {
    public static void main(String args[]){
        horse h1 = new horse();
        System.out.println(h1.color);
    }
}

class animal{
    String color;
    animal(){
        System.out.println("Animal constructor is called!!");
    }
}

class horse extends animal{
    
    horse(){
        super.color = "Brown";
        System.out.println("horse constructor is called..");
    }
}
