package ClassA;
public class ClassA implements InterfaceA {
    int a = 30;
    int b = 50;
    public void method1(){
        for(int i = a; i < b; i++)
            System.out.print(i + " ");
    }
    public void method2(){
        System.out.println("\n\nCommon Divisors of 30: ");
        for (int x = 1; x <= a; x++){
            if (a % x == 0){
                System.out.print(x + " ");
            }
        }
    }
    public void method3(){
        System.out.println("\n\nCommon Divisors of 50: ");
        for (int x = 1; x <= b; x++){
            if (b % x == 0){
                System.out.print(x + " ");
            }
        }
    }
}

