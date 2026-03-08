import java.net.SocketPermission;

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

    }
}