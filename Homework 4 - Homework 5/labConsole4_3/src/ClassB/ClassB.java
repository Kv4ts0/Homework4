package ClassB;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class ClassB implements InterfaceB {
    int a;
    int b;
    Integer[] newArray = new Integer[] {0,0,0};
    List<Integer> l1 = new ArrayList<>();
    int n = 0;
    public void _a(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number which will be a value of a: \n");
        a = sc.nextInt();
        if(a > 0){
            System.out.println("The value of an a is: " + a);
        }
        else
            System.out.println("You entered the negative number. ");
    }
    public void _b(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number which will be a value of b. It must include 3 digits : \n");
        b = sc.nextInt();
        int length = String.valueOf(b).length();
        if (length != 3){
            System.out.println("You must enter the number which includes 3 digits!!! :");
            b = sc.nextInt();
            System.out.println("The value of b is: " + b);
        }
        else
            System.out.println("The value of b is: " + b);
        }
    public void method1(){
        System.out.println("\n3 Random numbers between a to b ");
        Random rand = new Random();
        for(int i = 0; i < 3; i++){
            newArray[i] = rand.nextInt( b - a + 1) + a;
            System.out.println(newArray[i]);
        }
    }
    public void method2(){
        for(int i = 1; i <= a; i++){
            if(a%i == 0 ){
                l1.add(i);
            }
        }
        System.out.print("\n3 a-s jeradi: " + l1.get(0) + " " + l1.get(1) + " " +  l1.get(2));

    }
    public void method4(){
        int lastdig = b%10;
        while (b >= 10)
            b /= 10;
        int middle = (b+lastdig)/2;

        System.out.println("\n\nSum digits of b: "+ (lastdig + b + middle));
    }
}
