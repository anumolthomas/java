import java.util.*;
public class Q10 {

    public static void main(String[] args) {
System.out.println(" Course name : Object Oriented Programming Lab \n Course code : 20MCA132 \n Name : Anumol Thomas \n Register no : SJC22MCA-2011 \n Date : 23/06/2023");
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("JAVA");
        obj.add("C");
        obj.add("PYTHON");
        obj.add("CSS");
System.out.println(" Original ArrayList:");
        for(String str:obj)
            System.out.println(str);
obj.add(1, "PHP");
System.out.println(" ArrayList after add operation:");
        for(String str:obj)
            System.out.println(str);
obj.remove("PHP");
System.out.println("ArrayList after remove operation:");
        for(String str:obj)
            System.out.println(str);
obj.remove(3);
System.out.println(" Final ArrayList:");
        for(String str:obj)
            System.out.println(str);
Collections.sort(obj);
System.out.println(" ArrayList after sorting:");
        for (String str : obj)
            System.out.println(str);
System.out.println("\n Object at index 2:"+obj.get(2));
System.out.println("\n Six is in the ArrayList :"+obj.contains("degree"));
System.out.println("\n Two is in the ArrayList :"+obj.contains("dell"));
System.out.println("\n Size of the ArrayList:"+obj.size());
obj.clear();
 System.out.println("** ArrayList Removed **");
}
}

