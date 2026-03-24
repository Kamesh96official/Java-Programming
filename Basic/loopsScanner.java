import java.util.Scanner;

public class loopsScanner{
    public static void main (String args []){

        int i =1;
        int n;
         Scanner sc = new Scanner(System.in);
        System.out.println("How many stars you want");
        n= sc.nextInt();

        while (i<=n) {          // Here in this case w have initiated the valuefrom "1", so zero will fails
            System.out.println("*");    
            i++;
            }
        
        int j=1;
        int m;
        System.out.println("How many stars you want");
        m=sc.nextInt();

        do{
            System.out.println("*");
            j++;
        } while (j<=m);             // Here also we have initiated as 1 but executes one time and fails.

    /************** Print first  n odd numbers *******************/

        int k=1;
        int o;
        System.out.println("Enter the value of o:");
        o=sc.nextInt();

        while(k<=o){
            
            System.out.println(2*k -1 );
            k++;
             System.out.println("To know the vale of 'K':" +k);
        }

    /****** FIND THE SUM OF n NATURAL NUMBERS ******/
        int q ;
       int sum=0;
        System.out.println("Enter the value of q:");
        q=sc.nextInt();

        // for(;p<=q;p++){
            
        // }
        // System.out.println("The numbers is" + q*(q+1)/2);

                        //OR

        for(int p = 1; p <= q; p++){
        sum += p;
        System.out.println("What is the value of sum here is:" + sum);
}

        System.out.println("Sum is " + sum);



       /*******  FIND THE FACTORIAL OF n   *********/
       int r;
       int fact=1;
       int t;

       System.out.println("Enter the value of t");
       t=sc.nextInt();
        for(r=1;r<=t;r++){
            fact = fact *r;
            System.out.println("The factorial of n is:" + fact);
        }
            System.out.println("The factorial of n is:" + fact);

       
    }
}