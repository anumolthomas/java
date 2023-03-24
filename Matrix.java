import java.util.*;
class Matrix
{
public static void main(String [] args)
{
System.out.println("Name : Anumol Thomas");
System.out.println("Admission No: 22MCA011");
System.out.println("Date : 24/03/2023");
int r,c,i,j;
Scanner in =new Scanner(System.in);
System.out.println("Enter the number of rows");
r=in.nextInt();
System.out.println("Enter the number of columns");
c=in.nextInt();
int x[][]=new int[r][c];
int y[][] = new int[r][c];
int z[][] = new int[r][c];
System.out.println("Enter the elements of matrix1");
for ( i= 0 ; i < r; i++ )
{ 
for ( j= 0 ; j < c ;j++ )
x[i][j] = in.nextInt();
 
System.out.println();
}
System.out.println("Enter the elements of matrix2");
 
for ( i= 0 ; i < r ; i++ )
{
for ( j= 0 ; j < c ;j++ )
y[i][j] = in.nextInt();
System.out.println();
} 
for ( i= 0; i < r; i++ )
for ( j= 0; j < c;j++ )
z[i][j] = x[i][j] + y[i][j] ;  
System.out.println("Sum of matrices:-");
for ( i= 0 ; i < r; i++ )
{ 
for ( j= 0 ; j < c;j++ )
System.out.print(z[i][j]+"\t");
System.out.println();
}
}
}
