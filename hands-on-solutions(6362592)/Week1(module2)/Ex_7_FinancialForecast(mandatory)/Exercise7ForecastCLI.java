// CLI for Exercise 7
import java.util.Scanner;

public class Exercise7ForecastCLI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter present value: ");
        double value = sc.nextDouble();
        System.out.print("Enter rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter years: ");
        int years = sc.nextInt();
        double future = Exercise7Forecast.futureValue(value, rate, years);
        System.out.println("Future Value: " + future);
    }
}
