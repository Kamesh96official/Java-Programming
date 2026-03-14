import java.util.Scanner; 

/************************ Arithmetic Operator ****************/

public class Operators{
    public static void main (String args[]){

        //+,-,*,/

        int a=10,b=5,c,d,e,f,j;
        double g=5,h=3,i; 
        c= a+b;  //(= is a assigning operator, "+" operator, "a" & "b"  are operands)
        System.out.println(c);
        d = a-b;
        System.out.println(d);
        e= a*b;
        System.out.println(e);
        f= a/b;
        System.out.println(f);
        i=h/g;  /*Here we have used double so the output displays the point value if i use int it will not display the point
                even we can use float also*/
        System.out.println(i);
        g=h%g;  //it will give the reminder (modulos)
        System.out.println(g);


/********************* Compound Assignment *********/   
System.out.println("Below Doing COMPOUND ASSIGNMENTS"); 
       a=a+3;  //Here we are adding the number to the variable and assigning to the "a" data type.
       b+=3;
       c%=5;
       d*=7;
       e/=7;
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
       System.out.println(d);
       System.out.println(e);

/****************Increment & Decrement Opertor ***************/
        System.out.println("Below is INCREMENT & DECREMENT OPERATOR");

        int m=1;
        m++; //post increment (Here m=1 +1 =2)
        ++m;  //pre increment (Here m=2+1=3)
        System.out.println(m);  //So here the output is "3".

        int n=2;
        n--; //post decrement (Here n=2-1=1)
        --n; //pre decrement   (Here n=1-1=0)
        System.out.println(n);

        int p=3,q,r;
        q=p++; // Here Due to "post increment" the value is first assigned so not incremented so the value displays the same
        r=++p;  //But here "pre increment" so done the increment and displays the value.
        System.out.println("Q is "+q);
        System.out.println("R is "+ r);


/******** Practise - Getting 2 inputs from user and perform arithmetic operators.  ***************** */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the valu of A:");
        int z=sc.nextInt();

        System.out.println("Enter the value B:");
        int y=sc.nextInt();

        int x = z+y;
        int w = y-z;
        int v= z*y;
        float u= (float)z/y;
        int s =z%y;

        System.out.println(x);
        System.out.println(w);
        System.out.println(v);
        System.out.println(u);
        System.out.println(s);

/************** Add 100  to a number using compound  assignment ******/
        
       System.out.println("The value of a is what : " +a);

       a = a+100;
       System.out.println("Now the value of a is :" +a);

       a= a+100;

       System.out.println("Now the value of a is : "+ a) ;

       

       float k =1;
        System.out.println("The value of k is:" +k);


       k/= 5;

       System.out.println("Now the value of k is :"+ k);

 /******** Justify the output *********************/      
       int A=3,B=4,C;
       C=A+B + A++ + B++ + ++A + ++B;

       System.out.println(C);
       System.out.println(A);
       System.out.println(B);



/***************** Relational Operators (Comparing and say true or false) (<,<=,>,>=, ==, !=) ************/

        int D= 10, E=40;
        System.out.println(D>E);

        System.out.println(D<E);

        int F=40,G=40;
        System.out.println(F>=G);

        System.out.println(F<=G);

        System.out.println(G==E);

        System.out.println(D!=F);

        System.out.println(D>100);


/********* Bitwise Operators (Usage to encrypt and decrypt like messages encryption in whatsapp. 
 
                ~NOT     << left shift
                & AND    >> righr shift
                | OR     >>> right shift zero fill
                ^EXOR                             ****************/

        int H=9, I=12;
        int J= H&I;  //(AND Operator)
        System.out.println("H&I  is "+J);

         J= H|I;     //(OR Operator)
        System.out.println("H|I is "+J);

        J= ~H;     //(NOT Operator)
        System.out.println("~H is "+J);  // For this the output will comes like minus (-). To check the minus we can use 2's Complement.

        //<< left shift.

        int a1=4;
        System.out.println(a1<<1); //Left shifting  (0000 0100) So here the 1 is left shited one time and got that 1 postion number as 8, So 4 to 8 which is multiple by 2.

        int a2=4;
        System.out.println(a2<<5); //(0100 0000 ) Here the one is left shifted five time and got that 1 position as 128.

        byte a3=4;
        System.out.println(a3<<28); //If we use arithmetic or logical or bitwise operators the byte & short will promote as int. 

        byte a4 =4;
        System.out.println((byte)(a4<<28));  //Here if we need as byte only we can typelscast it, so now displaying zero.


        int a5=-5;

        System.out.println("Right shift " +(a5>>1));
        System.out.println("Right shift with zero fill"+ (a5>>>1));

        //Boolean Operators

        boolean a6=true,b1=false; //1=true, 0=false
        System.out.println(a6&b1);


/************************ SHORT CIRCUIT LOGICAL OPERATORS
                                && || ************/

        int a7=20;
        System.out.println((a7>22)& (a7<30)); //Here it will check the both sided values

        System.out.println((a7>22)&&(a7<30));  //Here it will leck only one sided values and give the output.

        int a8=22;
        System.out.println((a8>25) | (a8<30));
        System.out.println((a8>25) || (a8<30));

        /******************** OPERATOR PRECEDENCE *********************/

        int a9=10,a10=20;
        double b2= a9*a10-10/a9; /*  These combined is said to be as expression (Here it will first do multiplication & division
        then only it will do the substration like a priority)  */
        double b3= (a9*a10-10)/a9; // If we need to change the priority we can mention inside perantasis.
        System.out.println(b2);
        System.out.println(b3);

        /*  Practise  */

        int a11= 10;

        a11= a11++ + ++a11; /*  Here first it displays the value then add ++ and the other side it will first add and store it
                                a11=10 -- a11++(11) + ++a11(12)
                                Output = Post decrement (10)+12 = 22 */
        System.out.println(a11);

        int a12=10;
        a12= ++a12 + ++a12;         /*  a12=10 -- (11)++a12 + (12)++a12
                                Output = Pre decrement (10)+(12) =    */
        System.out.println(a12);

      /*   int a13= 11++;               Here we can directly assign constant as directly 
                                        if we do it will create a error (interview question)
        System.out.println(a13);     */

        int a14=5;                     // 5= 0101 & 1=0001 = (AND Operator (&)) So output will be "1" 
        System.out.println(a14 & 1);            

        int a15 =5;
        System.out.println((a15^3)^a15);   //5(0101) ^ 3(0011) = (6)0110 ^ 5(0101) = (3)0011 > The O/P: 3 




 }
}