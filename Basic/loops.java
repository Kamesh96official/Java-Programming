import java.util.Scanner;
public class loops{
    public static void main (String args []){

        int i;

        for(i=1;i<=5;i++){  //i = iteration
            System.out.println("*");
        }
        System.out.println("The value of i is:" + i);


        int j=1;

        while(j<=5){                       // While loop is entry controlled loop.
                                       
            System.out.println(j);
             j++;
        }
            System.out.println("Now the value of j is:" + j);



        int k=1;
        do{
            System.out.println(k);
            k++;
        }while(k<=5);                       //do while is Exit controlled loop
        System.out.println("Now the value of k is:"+ k);


        int l=1;
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        m= sc.nextInt();

        while (l<=m) {
            System.out.println("*");
            l++;
        }
    }
}