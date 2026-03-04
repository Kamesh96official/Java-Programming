public class First {

    public static void main(String args []) {
        System.out.println("Hello World");  
        System.out.println("Hiiiii"); 
        
        System.out.println("Hellow \nWorld");   // Here we are splitting the content inside where "\n" says "Escape sequence"
        System.out.println("\"Hellow World\"");  // Here if we need doublr quotes inside the printed statement we can follow this, this is also a escape sequence.


        int ticketPrize ;  /*variable declaration -  data type (int) variable name (ticketPrize);   For variables we can use only ($ and _) this both symbols only.
                            and the variable should not starts with numbers.    The variable names ahold be meaningful so that it can be easily understanby everyone.*/
         ticketPrize=900;
        System.out.println(ticketPrize);
        System.out.println("The ticket prize is = " + ticketPrize);

         /*assigning value for variable   //ticketPrize (camel case)   OR  int ticketPrize=900; The value which we giving is said to be as "literals"
                                Why it says "literals" means what we mention there it will take it the same thats why.   900 is numerical literal*/

        boolean paid = true;  // True is a Boolean literal.
         System.out.println(paid);
        char c, d; 
        c= 'C';                 // C is character Literal.
        d= '0';   
        System.out.println(c);
        System.out.println(d);



        int octal = 010;   // Octal value so taking the nearby value of 10 is "8".
         System.out.println(octal);

        int hexaDecimal = 0X10;   //Here it will take the hexadecimal value, for hexa decimal we can provide small "x" or "Capital X"
         System.out.println(hexaDecimal);

        int hexa_Decimal = 0xA;  // Here the value of A in hexadecimal is "10".
        System.out.println(hexa_Decimal);

        long lng = 7L;     // Here we can use "l"  or "L", here it will consider as a long number. 
        System.out.println(lng);

        int n =0b011001;     //Binary format  (Above JDK version 7 & above this features works )
        System.out.println(n);

        int n1=123_456_789;   //In java we can use under score instead of comma, Why using comma for splitting the numbers to read it like zero's and one's.
        System.out.println(n1);
        
        //float pi = 3.14159;   For floating point we can assign in standard notation (3.14) and scientifi notation (314159e-05).


        /****************************  TYPE CASTING ******************************
         * *************************************************************************/


        byte b= 10;  //1 byte
        int m;   //8 byte
        m=b;   /*Here the byte value wiil be converted into integer value. so this is automatic type conversion.Even if its in different type it will chage his type thats
                     said as implicit type conversion, In conversion the receiver side byte value is high means its possible since here "m" is 8 byte.*/
        System.out.println(b);

        b= (byte)m; //Here the "m" value will temporaryly convert into byte and store in "b" and this is called as explicit type conversion.
        System.out.println(b);
    }
}