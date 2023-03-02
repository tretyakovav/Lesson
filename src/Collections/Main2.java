package Collections;

import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("Джон");
        names.add("Ольга");
        names.add("Женя");
        names.add("Максим");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
