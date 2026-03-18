import java.util.Scanner;
public class SwitchPractiseVowel{
    public static void main (String args[]){

        char vowels;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Word: ");
        vowels=sc.next().charAt(0);

        switch (vowels){

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':

                System.out.println(vowels + " "+"is a vowel");
                break;

            default:
                System.out.println("Its a constant");
        }
    }
}