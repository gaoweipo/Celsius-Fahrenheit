import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Celsius;
        double Fahrenheit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Celsius:");
        Celsius=sc.nextInt();
        Fahrenheit = 32 + Celsius * 1.8;
        System.out.println("Your Fahrenheit is:" + Fahrenheit + "Fahrenheit.");
    }
}