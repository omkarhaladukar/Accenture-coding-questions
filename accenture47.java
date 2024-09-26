import java.util.Scanner;

public class accenture47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coefficients a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Calculate and display the roots
        findRoots(a, b, c);

        scanner.close();
    }

    public static void findRoots(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("Roots are real and different.\nRoot 1: %.2f\nRoot 2: %.2f\n", root1, root2);
        } else if (discriminant == 0) {
            // One double real root
            double root = -b / (2 * a);
            System.out.printf("Roots are real and the same.\nRoot: %.2f\n", root);
        } else {
            // No real roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.printf("Roots are complex and different.\nRoot 1: %.2f + %.2fi\nRoot 2: %.2f - %.2fi\n",
                    realPart, imaginaryPart, realPart, imaginaryPart);
        }
    }
}
