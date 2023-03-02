package Wednesday;

public class Guess {
    public static void main(String[] args) throws java.io.IOException {
        char ch, answer = 'K';
        String smile = "\uD83D\uDE12";
        System.out.println("Задумана буква из диапазона А-Z");
        System.out.print("Попытайтесь ее угадать ");
        ch = (char) System.in.read();
        if (ch == answer) {
            System.out.println("***Правильно***");
        } else {
            System.out.println("Извините, вы не угадали " + smile);
        }

    }
}
