package Collections;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Джон");
        names.add("Ольга");
        names.add("Ольга");
        names.add("Женя");
        names.add("Максим");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
