/**
Accept a two digits number from command line argument like 01 or 02 or 11 or 99 and suppose
these are the years like 1901, 1902, 1911 and 1999. 
Now find the accepted year is leap year or not
*/


// defining a class
class FindLeapYear {
    public static void main(String[]args) {

        if(Integer.parseInt(args[0]) % 4 == 0) {
            System.out.println(args[0] + " is a leap year");
        } else {
            System.out.println(args[0] + " is not a  leap year");
        }
    }
}