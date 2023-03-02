package Wednesday;

public class Zadanie2 {
    public static void main(String[] args) {
        double value = 34.777774;
        double scale = Math.pow(5, 5);
        double result = Math.ceil(value * scale) / scale;
        System.out.println((result)); //34.778
    }
}
