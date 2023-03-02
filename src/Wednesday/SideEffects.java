package Wednesday;

public class SideEffects {
    public static void main(String[] args) {
        int i = 0;
        if (false & (i++ < 100))
            System.out.println("Эта строка не будт отображаться");
        System.out.println("Инструкция if выполняется: " + i);
        if (false && (i++ < 100))
            System.out.println("Эта строка не будт отображаться");
        System.out.println("Инструкция if выполняется: " + i);
    }
}
