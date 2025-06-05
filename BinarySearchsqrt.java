package demo;
import java.util.Scanner;
public class BinarySearchsqrt {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative number: ");
        double number = scanner.nextDouble();
        if (number < 0) {
            System.out.println("Square root is not defined for negative numbers.");
            return;
        }
        double sqrt = squareRoot(number);
        System.out.printf("Square root of %.1f is approximately %.1f\n", number, sqrt);
    }
    public static double squareRoot(double num) {
        if (num == 0 || num == 1)
            return num;
        double start = 0;
        double end = num;
        double mid;
        if (num < 1) {
            end = 1;
        }
        double precision = 0.00001;
        while ((end - start) > precision) {
            mid = (start + end) / 2;
            double square = mid * mid;
            if (Math.abs(square - num) < precision)
                return mid;
            else if (square < num)
                start = mid;
            else
                end = mid;
        }
        return (start + end) / 2;
    }
}
