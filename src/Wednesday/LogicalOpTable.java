package Wednesday;

public class LogicalOpTable {

    public static void main(String[] args) {
        boolean p, q;
        int x = 0;
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        p = q = true;
        if (p) x = 1;
        System.out.print(x + "\t");
        x = 0;
        if (q) x = 1;
        System.out.print(x + "\t");
        x = 0;
        if (p & q) x = 1;
        System.out.print(x + "\t");
        x = 0;
        if (p | q) x = 1;
        System.out.print(x + "\t");
        x = 0;
        if (p ^ q) x = 1;
        System.out.print(x + "\t");
        x = 0;
        if (!p) x = 1;
        System.out.println(x + "\t");
        x = 0;

        p = true;
        q = false;
        if (p) x = 1;
        System.out.print(x + "\t");
        x = 0;
        if (q) x = 1;
        System.out.print(x + "\t");
        x = 0;
        if (p & q) x = 1;
        System.out.print(x + "\t");
        x = 0;
        if (p | q) x = 1;
        System.out.print(x + "\t");
        x = 0;
        if (p ^ q) x = 1;
        System.out.print(x + "\t");
        x = 0;
        if (!p) x = 1;
        System.out.println(x + "\t");
        x = 0;

        p = false;
        q = true;
        if (p) x = 1;
        System.out.print(x + "\t");
        x = 0;
        if (q) x = 1;
        System.out.print(x + "\t");
        x = 0;
        if (p & q) x = 1;
        System.out.print(x + "\t");
        x = 0;
        if (p | q) x = 1;
        System.out.print(x + "\t");
        x = 0;
        if (p ^ q) x = 1;
        System.out.print(x + "\t");
        x = 0;
        if (!p) x = 1;
        System.out.println(x + "\t");
        x = 0;

        p = q = false;
        if (p) x = 1;
        System.out.print(x + "\t");
        x = 0;
        if (q) x = 1;
        System.out.print(x + "\t");
        x = 0;
        if (p & q) x = 1;
        System.out.print(x + "\t");
        x = 0;
        if (p | q) x = 1;
        System.out.print(x + "\t");
        x = 0;
        if (p ^ q) x = 1;
        System.out.print(x + "\t");
        x = 0;
        if (!p) x = 1;
        System.out.println(x + "\t");
        x = 0;
    }

}



