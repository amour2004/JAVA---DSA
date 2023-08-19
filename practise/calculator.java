import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("What do you want to do??");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Divison");

        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        System.out.print("Enter the value of a:");
        float a = sc.nextFloat();
        System.out.print("Enter the value of b:");
        float b = sc.nextFloat();

        switch (z) {
            case 1:
                System.out.println("The addition of these two numbers is " + (a + b));
                break;
            case 2:
                System.out.println("The substration of these two numbers is " + (a - b));
                break;
            case 3:
                System.out.println("The multiplication of these two numbers is " + (a * b));
                break;
            case 4:
                System.out.println("The divison of these two numbers is " + (a / b));
                break;
            default : 
                System.out.println("Wrong operator");
        }
    }
}
