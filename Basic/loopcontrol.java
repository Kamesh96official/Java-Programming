import java.util.Scanner;


// For a given n, find the nearest number divisible by 10 that is less than or equal to n

// 90  -  90
// 78  -  70
// 64  -  60
// 99  -  90


public class loopcontrol{
    public static void main (String args []){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        while (n>=0){
            if(n%10==0){
                System.out.println(n);
                break;
            }
            n--;
            System.out.println("vAlue of n here is" + n);
        }


        }
}