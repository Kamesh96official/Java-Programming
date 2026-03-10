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


/********* Bitwise Operators ****************/




      


    }
}