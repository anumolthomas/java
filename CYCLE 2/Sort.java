import java.util.Scanner;
public class Sort
{
    public static void main(String[] args) 
    {
        int count;
        String temp;
        Scanner scan = new Scanner(System.in);
        System.out.println(" Course name : Object Oriented Programming Lab \n Course code : 20MCA132 \n Name : Anumol Thomas \n Register no : SJC22MCA-2011 \n Date : 05/04/2023\n");
        System.out.print("Enter number of strings you would like to enter:");
        count = scan.nextInt(); 
        String str[] = new String[count];
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter the Strings one by one:\n");
        for(int i = 0; i < count; i++)
        {
            str[i] = scan2.nextLine();
        }
        scan.close();
        scan2.close();
        for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) { 
                if (str[i].compareTo(str[j])>0) 
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.print("Strings in Sorted Order:\n");
        for (int i = 0; i <= count - 1; i++) 
        {
            System.out.print(str[i] + "\n");
        }
    }
}
