import java.util.HashMap;
import java.util.Map;
public class Q17 {
    public static void main(String[] args) {
    System.out.println(" Course name : Object Oriented Programming Lab \n Course code : 20MCA132 \n Name : Anumol Thomas \n Register no : SJC22MCA-2011 \n Date : 27/06/2023\n");
              Map<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Alice", 30);
        map.put("Bob", 35);
System.out.println("-----------OUTPUT---------");
        System.out.println("Initial Map: " + map);
        map.put("Alice", 32);
        System.out.println("Map after changing an element: " + map);
        map.remove("Bob");
        System.out.println("Map after removing an element: " + map);
    }
}

