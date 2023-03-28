import java.util.*;
public class Complex
{
double r,i;
public Complex(double r,double i)
{
this.r=r;
this.i=i;
}
public static void main(String[]args)
{
System.out.println(" Course name : Object Oriented Programming Lab \n Course code : 20MCA132 \n Name : Anumol thomas \n Register no : SJC22MCA-2011 \n Date : 28/03/2023\n");
Complex n1 = new Complex(2.3, 4.5),
        n2 = new Complex(3.4, 5.0),
        temp;
temp = add(n1, n2);
System.out.printf("Sum = %.1f + %.1fi\n", temp.r, temp.i);
}
public static Complex add(Complex n1, Complex n2)
{
Complex temp = new Complex(0.0, 0.0);
temp.r = n1.r + n2.r;
temp.i = n1.i + n2.i;
return(temp);
}
}
