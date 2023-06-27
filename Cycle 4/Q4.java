import java.util.*;
class NegException extends Exception
{
public NegException(String s){
super(s);
}
}
public class Q4{
public static void main (String args[])
{
System.out.println(" Course name : Object Oriented Programming Lab \n Course code : 20MCA132 \n Name : Anumol Thomas \n Register no : SJC22MCA-2011 \n Date : 16/06/2023\n");
int i;
double sum=0,avg=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter N number");
int n=sc.nextInt();
for(i=1;i<=n;i++)
{
try
{
System.out.println("Enter number"+i);
int a=sc.nextInt();
if(a<0)
{
i--;
throw new NegException("negative number is not allowed");
}
else
{
sum=sum+a;
}
}
catch (NegException e)
{
System.out.println("Negative Exception occur\n"+e);
}
}
avg=sum/n;
System.out.println("Average="+avg);
sc.close();
}
}

