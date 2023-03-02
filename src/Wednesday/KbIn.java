package Wednesday;

import java.io.IOException;

public class KbIn {
    public static void main(String[] args) throws IOException {
        char ch;
        System.out.println("Выберете клавишу, затем нажмите Enter: ");
        ch = (char) System.in.read();
        System.out.println("Вы нажали " + ch);

    }
}

