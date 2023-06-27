import java.util.*;

public class Q11 {
    public static  void main(String[] args){
    System.out.println(" Course name : Object Oriented Programming Lab \n Course code : 20MCA132 \n Name : Anumol Thomas \n Register no : SJC22MCA-2011 \n Date : 23/06/2023\n");
        LinkedList<String> L=new LinkedList<>();
        L.add("JAVA");
        L.add("PYTHON");
        L.add("CSS");
        L.add(0,"PROGRAMING LANGUAGE");
        System.out.println(L);
        L.remove("CSS");
        System.out.println(L);
        L.remove(2);
        System.out.println(L);
        L.removeLast();
        System.out.println(L);
        L.removeFirst();
        System.out.println(L);


    }

}
