import java.util.Scanner;

public class IfDemo{
public static void main (String args[]){

    int num;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    num =sc.nextInt();

    if (num>0) {
        System.out.println(num +" " +"The number is positive");
        
    }
    else if (num ==0)

       {
            System.out.println(num + " "+ "The number is Neutral");
        }
        else{
        System.out.println(num  +" "+ "The number is negative");
        }

        /************** Mark list ********************
                        >=90 --A Grade
                        80 - 89 -- B Grade
                        70 - 79 -- C Grade
                        60 - 69 -- D Grade
                        <60 - E Grade
                                        */
        int mark;

            System.out.println("Enter the mark");
            mark = sc.nextInt();

            if (mark>=90) {
                System.out.println(mark +" "+"is A Grade");
                }
            else if (mark>=80) {
                System.out.println(mark + " " + "is a B Grade");
            }
            else if (mark>=70){
                System.out.println(mark + " "+ "is C Grade");
            }
            else if (mark>=60){
                System.out.println(mark + " "+ "is D Grade");
            }
            else{
                System.out.println(mark + " "+ "is E Grade");
            }




    }
        
}

