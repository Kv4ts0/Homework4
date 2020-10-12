package ClassA;

public class ClassA implements InterfaceA {
    int a = 10;
    int b = 29;
    @Override
    public void method1(){
        System.out.println("Hello OPP");
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
        System.out.println(a+b);
    }
    @Override
    public int method5(){
        return(a+b);
    }
    @Override
    public int method6(){
        return(a*b);
    }
    @Override
    public void method7(){
        a = 5;
        b = 6;
        System.out.println("The value of a has changed to : " + a);
        System.out.println("The value of b has changed to : " + b);
    }
}
