
/***************************************************************
 * ******************* Getting Input from user ***************** 
 */

import java.util.Scanner;  //Inside this package only scanner class is available so need to import it.
public class inputdemo{

    public static void main (String[]args){
        
        Scanner sc = new Scanner(System.in);  //Here scanner is a class for that "sc" is the object of that, like the same (int i).Here creating a new scanner object.
                                            // Here "System.in" is predefined object input stream.

        System.out.println("What is your name ?");
        String name = sc.nextLine();   //Here String is a class for that we are creating an object as "name", like similar to (int i).
        System.out.println("Hellow " + name);     
        
        System.out.println("What is your rating from 1 to 5");  
        int rating= sc.nextInt();  // Here we are getting the input as number so using "sc.nextInt"

        sc.nextLine();  /*Here why we are using this means in the above code we have taken the input as number, so after a number when we press "Enter" it will take that 
        "Enter" also a character it is said as next line character, so at the next line if we try to give scan the mail it will take the input as "Enter" thats the reason 
        we cant give the email as input, using this command we can now provide the input as mail.*/

        System.out.println("This is ur rating " + rating);

        System.out.println("What is your email ID: ");
        String email = sc.nextLine();

        System.out.println("this is your mail id: " + email);
        

    }

}