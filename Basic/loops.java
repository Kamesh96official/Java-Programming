public class loops{
    public static void main (String args []){

        int i;

        for(i=1;i<=5;i++){
            System.out.println("*");
        }
        System.out.println("The value of i is:" + i);

        
        int j=1;

        while (j<=5) {
            
            System.out.println("*");
            j++;
            }
        System.out.println(" The value of j is :" + j);

        int k=1;

        do{
            System.out.println("*");
            k++;
            } while(k<=5);
            System.out.println("The value of k is: " + k);
}
}