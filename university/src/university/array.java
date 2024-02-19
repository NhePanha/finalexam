package university;

import java.util.Scanner;
class InputNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int numElements = scanner.nextInt();
        int[] numbers = new int[numElements];
        System.out.print("Enter the numbers:");
        for (int i = 0; i < numElements; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.print("The input numbers are: [");
        for (int num : numbers) {
            System.out.print(num + ", ");
        }
        System.out.print("\b]");
    }
}