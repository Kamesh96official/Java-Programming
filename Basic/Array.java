public class Array{  //loops
    public static void main (String args []){


                            //ONE Dimensional Array
        // int marks[];  Here memory is not allocated
        // marks= new int [6];  Here we allocated the memory as "6" , so 0 to 5.

                        //OR

        // int marks[]= new int [6];
        // marks[0]= 65;
        // marks[1]=45;
        // marks[2]=80;
        // marks[3]=60;
        // marks[4]=82;
        // marks[5]=65;

        // System.out.println(marks[4]);


                        //OR

        int marks[] = {36,68,80,70,65,45,82};  // Here we are mot created the memory for array, but based on the values we given it automatically takes the space and 
        System.out.println(marks[4]);                       // it will be empty.


                                //TWO DIMENSIONAL ARRAY

        int[][] a= new int[3][4];   //int array "a".
        a[0][0]=50;
        a[2][3]=70;
        System.out.println(a[2][3]);

        //EXPLANATION FOR ABOVE PROGRAM.

       /*  int[][] a = new int[3][4];
       
    All Elements are:
        0 0 0 0
        0 0 0 0
        0 0 0 0

    Assign values

        a[0][0] = 50;
        a[2][3] = 70;

    Now array looks like:

        50 0  0  0
        0  0  0  0
        0  0  0  70

    Output
        System.out.println(a[2][3]);

        O/P:  70    */

        
    float oneD[] = new float[50];    // "oneD" array need it should be in float

        char[]c1,c2,c3;    //declare as a Character array.


      int b[][]= new int [4][];

        b[0] = new int[]{2,3,4,5};
        b[1] = new int[]{5,6,7};
        b[2] = new int[]{1,2,3};
        b[3] = new int[]{9,8,7,6};

        System.out.println(b[1][1]);



        //EXPLANATION FOR ABOVE PROGRAM.

        /*
        
        int b[][] = new int[4][];
        Creates 4 rows, but columns are not fixed

        Assign rows with different sizes

        b[0] → [2,3,4,5]     (4 elements)
        b[1] → [5,6,7]       (3 elements)
        b[2] → [1,2,3]       (3 elements)
        b[3] → [9,8,7,6]     (4 elements)
        
        Each row has different length

        OUTPUT

        System.out.println(b[1][1]);

        Row 1:

        [5, 6, 7]
             ↑
            index 1 = 6
        
        O/P= 6.

        Important Rule

        Fixed array → new int[rows][columns]

        Jagged array → new int[rows][] + assign each row separately


When to use what?

✅ Use fixed array → tables, matrices
✅ Use jagged array → variable data (marks, schedules, etc.) */
        

    }
}