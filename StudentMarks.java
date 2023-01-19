/**
Accept 5 subject marks using command line argument and if, in all subject sutdent
secure more than or equal to 35 marks add all subject marks and find percentage
and print it. If student is failed in one or more subject print failed along 
with subject number/numbers.
*/

// defining a class
class StudentMarks {
    public static void main(String[]args) {
        
        int sub_sum = 0;
        boolean fail = false;

        // calculating subject marks and finding percentage
        for(int i = 0; i < args.length; i++) {
            sub_sum += Integer.parseInt(args[i]);

            if(Integer.parseInt(args[i]) < 35) {
                if(fail != true) {
                    System.out.print("Failed ");
                    fail = true;
                }
                System.out.print((i+1) + " ");
            }
        }

        if(fail != true) {
            System.out.println("Percentage : " + (sub_sum/5.0));
        }
    }
}