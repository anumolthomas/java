import package_graphics.*;
import java.util.*;
public class Q1 {
    public static void main(String []args){
        package_graphics testObj = new package_graphics();
        int l,h,r,a,c,d;
        Scanner s=new Scanner(System.in);
        System.out.println(" Course name : Object Oriented Programming Lab \n Course code : 20MCA132 \n Name : Anumol Thomas \n Register no : SJC22MCA-2011 \n Date : 16/06/2023\n");
System.out.println("-----------OUTPUT---------");
        System.out.println("Enter the length for rectangle");
        l=s.nextInt();
        System.out.println("Enter the breadth for rectangle");
        h=s.nextInt();
        System.out.println("Enter the radius of circle");
        r=s.nextInt();
        System.out.println("Enter the side for Square");
        a=s.nextInt();
        System.out.println("Enter the breadth for triangle");
        c=s.nextInt();
        System.out.println("Enter the height for triangle");
        d=s.nextInt();
        System.out.println("Area of rectangle="+testObj.recArea(l,h));
        System.out.println("Area of circle="+testObj.cirArea(r));
        System.out.println("Area of square="+testObj.squArea(a));
        System.out.println("Area of triangle="+testObj.triArea(c,d));
   }
}

