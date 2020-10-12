package ClassC;

import java.util.Scanner;

public class ClassC implements InterfaceC {
    int a = 10;
    int b = 9;
    String s = "#";
    String h = "@";
    public void method1(){
        System.out.println("Int variables: " + a + " " + b);
    }
    public void method2(){
        System.out.println("Symbolic variables: " + s + " " + h);
    }
    public void method3(){
        int sum = (a+b);
        int mult = (a*b);
        int dif = (a-b);
        int div = (a/b);
        System.out.println("Sum: "  + sum + "\n" + "Mult: " + mult + "\n"  + "Dif: " + dif + "\n" + "Div: " + div + "\n");
    }
    public void method4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");

        a = sc.nextInt();
        System.out.println("The value of a has changed to: " + a);
    }
    public void method5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");

        b = sc.nextInt();
        System.out.println("The value of b has changed to: " + b);
    }
    public void method6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Symbol 1: ");

        s = sc.nextLine();
        System.out.println("Enter the Symbol 2: ");

        h = sc.nextLine();
        System.out.println("The values of s and h have changed to: " + s + " " + h);
    }
}