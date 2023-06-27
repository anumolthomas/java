import java.util.LinkedHashSet;
import java.util.Set;

public class Q15{
public static void main(String[] args) {
System.out.println(" Course name : Object Oriented Programming Lab \n Course code : 20MCA132 \n Name : Anumol Thomas \n Register no : SJC22MCA-2011 \n Date : 27/06/2023\n");
        Set<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); 
System.out.println("-----------OUTPUT---------");
        System.out.println("Set elements: " + set);
        boolean containsBanana = set.contains("Banana");
        System.out.println("Contains 'Banana'? " + containsBanana);
        boolean removedOrange = set.remove("Orange");
        System.out.println("Removed 'Orange'? " + removedOrange);
        System.out.println("Set after removal: " + set);
    }
}

