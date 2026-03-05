import java.util.Scanner;

public class ProjectPrintPyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 5; i++) {

            // Print spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            // Print the input number
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}