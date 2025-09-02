//Comparator : If you want to specify an external sorting logic (you decide the rule while sorting).
//Comparable : If you want to give power to the class itself to define how its objects should be compared (natural/default sorting).


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

class Students {
    int age;
    String name;

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}

public class ComparatorvsComparable {
    public static void main(String[] args) {

        // Comparator to sort Students by age
        Comparator<Students> com = (i, j) -> i.age > j.age ? 1 : -1;

        List<Students> studs = new ArrayList<>();
        studs.add(new Students(21, "Navin"));
        studs.add(new Students(12, "John"));
        studs.add(new Students(18, "Parul"));
        studs.add(new Students(20, "Kiran"));

        System.out.println("Before Sorting:");
        for (Students s : studs)
            System.out.println(s);

        // Sorting using comparator
        Collections.sort(studs, com);

        System.out.println("\nAfter Sorting by Age:");
        for (Students s : studs)
            System.out.println(s);
    }
}
