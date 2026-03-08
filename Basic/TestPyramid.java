import java.util.Scanner;
public class TestPyramid{
    public static void main (String []args){

        Scanner sc = new Scanner (System.in);

        System.out.println("enter the number");

        int num = sc.nextInt();

//         System.out.println("    " + num);
// System.out.println("   " + num + " " + num);
// System.out.println("  " + num + " " + num + " " + num);
// System.out.println(" " + num + " " + num + " " + num + " " + num);
// System.out.println(num + " " + num + " " + num + " " + num + " " + num);


        System.out.println("   "+num);
        System.out.println("   " + num + "  " + num);
        System.out.println("  " +num+"  "+ num+" "+ num);
        System.out.println(" "+num+" "+num+" "+num+" "+num+" ");
        System.out.println(num+" "+num+" "+num+" "+num+" "+num);


    }
}