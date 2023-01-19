/**
Find the smallest number between three numbers using nested ternary operator
*/

import java.util.Scanner;

// defining a class
class FindSmallestNumber {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        // finding smallest number between three numbers using nested ternary operator
        System.out.println("Smallest Number is : " + (num1<num2 ? num1<num3 ? num1 : num3 : num2<num3 ? num2 : num3));
    }
}