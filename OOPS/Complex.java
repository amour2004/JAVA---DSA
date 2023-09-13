import java.util.Scanner;

public class Complex {
    public static void main(String args[]){
        pomplex c1 = new pomplex();
        c1.sum(2, 3, 1, 2);
    }
}

class pomplex{
    int real1;
    int real2;
    int complex1;
    int complex2;


    void sum(int real1, int complex1,int real2, int complex2){
        

        System.out.println("Sum of complex number is " + (real1+real2)+"+i"+(complex1+complex2) );
    }

}
