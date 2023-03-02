package Friday;

public class Guess2 {
    public static void main(String[] args) throws java.io.IOException {
        char ch, ignore, answer = 'K';
        String smile = "\uD83D\uDE12";
        do {
            System.out.println("Задумана буква из диапазона А-Z");
            System.out.print("Попытайтесь ее угадать ");
            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (ch == answer) System.out.println("***Правильно***");
            else {
                System.out.println("Извините, нужная буква находится  ");
                if (ch < answer) System.out.println("ближе к концу алфавита");
                else System.out.println("ближе к началу алфавита");
                System.out.println("Повторите попытку!\n" +smile);
            }
        } while (answer != ch);

    }
}

