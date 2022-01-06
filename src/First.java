import java.util.Scanner;
public class First {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int first, second, result;
        System.out.print("Enter first number:");
        first = num.nextInt();
        System.out.print("Enter second number:");
        second = num.nextInt();
        result = first + second;
        System.out.println("Result is - " + result);


    }
}
