package Sunday;

public class Break4 {
    public static void main(String[] args) {
        int i;
        for (i = 1; i < 4; i++) {
            one:
            {
                two:
                {
                    three:
                    {
                        System.out.println("\ni равно " + i);
                        if (i == 1) break one;
                        if (i == 2) break two;
                        if (i == 3) break three;
                        System.out.println("не будет выведено");

                    }
                    System.out.println("После блока 3");
                }
                System.out.println("После блока 2");
            }
            System.out.println("После блока 1");
        }
        System.out.println("После блока for");
    }
}
