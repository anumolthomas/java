import java.util.Scanner;
public class Mstring{
    public static void main(String[] args) {
    System.out.println(" Course name : Object Oriented Programming Lab \n Course code : 20MCA132 \n Name : Anumol Thomas \n Register no : SJC22MCA-2011 \n Date : 11/04/2023\n");
        System.out.println("Enter The String");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println("Length of String = "+str1.length());
        System.out.println("Character at First position  = "+str1.charAt(0));
        System.out.println("String Contains 'Col'sequence :"+str1.contains("Col"));
        System.out.println("String ends with e : "+str1.endsWith("e"));
        System.out.println("Replace'col' with 'kol' : "+str1.replaceAll("Col","kol"));
        System.out.println("LOWERCASE : "+str1.toLowerCase());
        System.out.println("UPPERCASE : "+str1.toUpperCase());
}
}
