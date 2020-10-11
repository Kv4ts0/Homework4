package ClassB;
import java.util.Scanner;
public class ClassB implements InterfaceB {
    int a = 33;
    double b = 9.7;
    String s = "#";
    int firstValueofa = a;
    @Override
    public void method1(){
        System.out.println(s);
    }
    @Override
    public void method2(){
        System.out.println(a);
    }
    @Override
    public void method3(){
        System.out.println(b);
    }
    @Override
    public void method4(){
        System.out.println(a-b);
    }
    @Override
    public double method5(){
        return(a/b);
    }
    @Override
    public void method6(){
        a = 70;
        b = 20.6;
        s = "@";
    }
    @Override
    public void method7(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        a = sc.nextInt();
        System.out.println("The value of a is: " + a);
    }
    @Override
    public void method8(){
        System.out.println(firstValueofa+10);
    }

}
