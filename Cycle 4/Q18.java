import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class Q18 {
    public static void main(String[] args) {
    System.out.println(" Course name : Object Oriented Programming Lab \n Course code : 20MCA132 \n Name : Anumol Thomas \n Register no : SJC22MCA-2011 \n Date : 27/06/2023\n");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 25);
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 35);
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
System.out.println("-----------OUTPUT---------");
        System.out.println("HashMap: " + hashMap);
        System.out.println("TreeMap: " + treeMap);
    }
}

