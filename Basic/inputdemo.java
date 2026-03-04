
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

        System.out.println("This is ur rating " + rating);
        

    }

}