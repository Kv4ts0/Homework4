import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class ClassA {

    int a;
    int b;
    Integer[] m = new Integer[] {3,1,20,12,3,7,8,2,3,4,5,6};
    List<Integer> Even = new ArrayList<>();
    List<Integer> nonZero = new ArrayList<>();
    List<Integer> noneZero = new ArrayList<>();
    int SumofnoneZero = 0;
    public void method1(){
        Random random = new Random();
        a = random.nextInt(25 - 10) + 10;
        b = random.nextInt(25 - 10) + 10;
    }
    public void method2(){
        System.out.println("The value of a: " + a + "\nThe value of b: " + b);
    }
    public void method3(){
        System.out.println("Symbols of a and b: " + a + " " + b);
    }
    public void method4() {
        Random rand = new Random();
        for (int i = 0; i < m.length; i++){
            m[i] = rand.nextInt(60)-10;
        }
        System.out.println(Arrays.toString(m));
    }
    public void method5() {
        for (Integer integer : m) {
            if (integer % 2 == 0) {
                Even.add(integer);
            }
        }
        System.out.println("The Even numbers of an array are: " + Even);
    }
    public void method6(){
        for (Integer integer : m) {
            if (integer > 0) {
                noneZero.add(integer);
            }
        }
        for (int i: noneZero) {
            SumofnoneZero = SumofnoneZero+i;
        }
        System.out.println("Sum of nonezero elements " + SumofnoneZero);

    }
    public void method7(){
        int min = Collections.min(noneZero);
        System.out.println("The min number of nonezero array is : " + min);
    }

}
