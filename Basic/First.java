public class First {

    public static void main(String[] args) {
        System.out.println("Hello World");  
        System.out.println("Hiiiii"); 
        
        System.out.println("Hellow \nWorld");   // Here we are splitting the content inside where "\n" says "Escape sequence"
        System.out.println("\"Hellow World\"");  // Here if we need doublr quotes inside the printed statement we can follow this, this is also a escape sequence.


        int ticketPrize;  /*variable declaration -  data type (int) variable name (ticketPrize);   For variables we can use only ($ and _) this both symbols only.
                            and the variable should not starts with numbers.    The variable names ahold be meaningful so that it can be easily understanby everyone.*/

        ticketPrize=900;  /*assigning value for variable   //ticketPrize (camel case)   OR  int ticketPrize=900; The value which we giving is said to be as "literals"
                                Why it says "literals" means what we mention there it will take it the same thats why.   900 is numerical literal*/

        boolean paid = true;  // True is a Boolean literal.
        char c, d; 
        c= 'C';                 // C is character Literal.
        d= '0';   

        int octal = 010;   // Octal value so taking the nearby value of 10 is "8".
        int hexaDecimal = 0X10;   //Here it will take the hexadecimal value, for hexa decimal we can provide small "x" or "Capital X"
        int hexa_Decimal = 0xA;  // Here the value of A in hexadecimal is "10".
        System.out.println(ticketPrize);
        System.out.println("The ticket prize is = " + ticketPrize);
        System.out.println(paid);
        System.out.println(c);
        System.out.println(d);
        System.out.println(octal);
        System.out.println(hexaDecimal);
        System.out.println(hexa_Decimal);
    }
}