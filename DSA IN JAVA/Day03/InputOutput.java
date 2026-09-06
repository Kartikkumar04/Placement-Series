import java.util.*;
public class InputOutput {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to add:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum is:" + sum);
        float pi = sc.nextFloat();
        System.out.println("Pi is:" + pi);
        sc.close()
;
    }
}
