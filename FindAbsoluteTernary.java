/**
Find the absolute value of any number using ternary operator.
Example absolute value of -10 is 10 and
absolute value of 20 is 20 only.
*/
import java.util.Scanner;

class FindAbsoluteTernary {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        // finding absolute value of given n using ternary operator
        System.out.println(num<0 ? -num : num);
    }
}