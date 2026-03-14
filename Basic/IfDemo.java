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
    else{

        if( num ==0){
            System.out.println(num + " "+ "The number is Neutral");
        }
        else{
        System.out.println(num  +" "+ "The number is negative");
        }
    }
        
}
}