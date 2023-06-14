import java.util.Scanner;
public class Shapes{
void area(int r){
double area_val=3.14*r*r;
System.out.println("\n Area of circle is radius"+r+"="+area_val);
}
void area(int a,int b)
{
int area_val=a*b;
System.out.println("\n Area of reactangle with dimensions "+a+"X"+b+"="+area_val);
}
void area(int a,int b,int c)
{
int area_val=a*b*c;
System.out.println("\n Area of cuboid with dimensions "+a+"X"+b+"X"+c+" ="+area_val);
}
public static void main(String [] args)
{
System.out.println(" Course name : Object Oriented Programming Lab \n Course code : 20MCA132 \n Name : Anumol thomas \n Register no : SJC22MCA-2011 \n Date : 02/05/2023\n");
Scanner sc =new Scanner (System.in);
System.out.println("Enter the length");
int l=sc.nextInt();
System.out.println("Enter the breadth");
int b=sc.nextInt();
System.out.println("Enter the height");
int h=sc.nextInt();
System.out.println("Enter the radius");
int r=sc.nextInt();
Shapes obj1=new Shapes();
obj1.area(r);
obj1.area(l,b);
obj1.area(b,h);
}
}



