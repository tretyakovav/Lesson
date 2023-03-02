package Thursday.Collections;

public class Main {
    public static void main(String[] args) {
        MyArrayList employees = new MyArrayList();
        employees.add("Никита");
        employees.add("Игорь");
        employees.add("Ваня");
        employees.add("Иван");
        employees.add("Ирина");
        employees.add("Алексей");
        employees.remove("Ваня");

        for (int i = 0; i < employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }

    }
}
