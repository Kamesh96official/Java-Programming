import java.util.Scanner;
public class SwitchDemo{
    public static void main (String args[]){
        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a:");
        a = sc.nextInt();
        System.out.println("Enter the value of b:");
        b= sc.nextInt();

        char operator;
        System.out.println("Enter the operatore +,/,*,-,% : ");
        operator = sc.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println(a + "+" + b + "=" + (a+b));
                break;
            case  '-':
                System.out.println(a + "+" + b + "=" + (a-b));
                break;
            case '*':
                System.out.println(a + "+" + b + "=" + (a*b));
                break;
            case '/':
                System.out.println(a + "+" + b + "=" + (a/b));
                break;
            case '%':
                System.out.println(a + "+" + "b" + "=" + (a%b));
                break;
            default:
                System.out.println("The operator is invalid");    
        
        
            }






    }
}