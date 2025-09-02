//Keys are unique can be same values
//We can say in Layman language that keys are set and values are list

//HashTable : synchronized vs HashMap : a-synchronized

import java.util.HashMap;
import java.util.Map;
import java.util.Hashtable;

public class MapExample {
    public static void main(String[] args){

//    	Map<String, Integer> students=new HashMap<>();
        Map<String, Integer> students=new Hashtable<>();

        students.put("Navin",56);
        students.put("Harsh",23);
        students.put("Sushil",67);
        students.put("Kiran",92);
        students.put("Harsh",45);

        System.out.println(students.keySet());

        for(String key : students.keySet())
        {
            System.out.println(key + ":" + students.get(key));
        }

    }
}