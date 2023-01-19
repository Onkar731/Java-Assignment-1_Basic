/**
Accept three sides of triangle in any order that is user can given three sides as 
3 4 5 or 4 5 3 or 3 5 4 in all situations you have to check that given input can
form a right-angled triangle or not.

If given input can form right angled triangle print 1 else print -1.
*/

import java.util.Scanner;

// defining a class
class FormRightAngledTriangle {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three side of right angle triangle : ");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        // checking whether a right angled triangle can form or not
        if(side1 > side2 && side1 > side2) {
            System.out.println((side1*side1 == side2*side2 + side3*side3) ? 1 : -1);
        } else if (side2 > side3) {
            System.out.println((side2*side2 == side1*side1 + side3*side3) ? 1 : -1);
        } else {
            System.out.println((side3*side3 == side1*side1 + side2*side2) ? 1 : -1);
        }
    }
}