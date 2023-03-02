package Sunday;

public class Main {
    public static void main(String[] args) {
        int[] massif = {5, 2, 4, 6, 1, 3, 2, 6};
        System.out.print("Массив до сортировки: ");
        for (int i = 0; i < massif.length; i++)
            System.out.print(massif[i] + " ");
        System.out.println("");
        massif = sort(massif);
        System.out.print("Массив после сортировки: ");
        for (int i = 0; i < massif.length; i++)
            System.out.print(massif[i] + " ");
    }

    public static int[] sort(int x[]) {
        if (x.length == 1)
            return x;
        else {
            int half = (int) Math.floor(x.length / 2);
            int halfFirst[] = new int[half];
            int halfSecond[] = new int[x.length - half];
            for (int i = 0; i < x.length; i++) {
                if (i < half)
                    halfFirst[i] = x[i];
                else
                    halfSecond[i - half] = x[i];
            }
            halfFirst = sort(halfFirst);
            halfSecond = sort(halfSecond);
            x = sortNext(halfFirst, halfSecond);
            return x;
        }
    }

    public static int[] sortNext(int x[], int y[]) {
        int c[] = new int[x.length + y.length];
        int a = 0, b = 0;
        for (int i = 0; i < x.length + y.length; i++) {
            if (a == x.length) {
                c[i] = y[b];
                b++;
            } else if (b == y.length) {
                c[i] = x[a];
                a++;
            } else if (x[a] > y[b]) {
                c[i] = y[b];
                b++;
            } else {
                c[i] = x[a];
                a++;
            }
        }
        return c;
    }
}

