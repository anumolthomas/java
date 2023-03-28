public class Product
{
int pcode,price;
String pname;
void getdata(int p1,String p2,int p3)
{
pcode=p1;
pname=p2;
price=p3;
}
public static void main(String[] agrs)
{
System.out.println(" Course name : Object Oriented Programming Lab \n Course code : 20MCA132 \n Name : Anumol Thomas \n Register no : SJC22MCA-2011 \n Date : 24/03/2023\n");
int s;
Product a=new Product();
Product b=new Product();
Product c=new Product();
a.getdata(101,"apple",30);
b.getdata(102,"grape",20);
c.getdata(103,"kiwi",50);
if(a.price < b.price  && a.price < c.price)
s=a.price;
else if(b.price <a.price && b.price <c.price)
s=b.price;
else
s=c.price;
System.out.println("smallest price is "+s);
}
}



