package Multithreading;

public class Main2 {
    static boolean win = false;

    public static void main(String[] args) {
        int random = (int) (Math.random() * 10);
        System.out.println(random);
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                try {
                    while (!win) {
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);

                    }
                } catch (InterruptedException e) {

                }

            }
        });
        Thread player = new Thread(new Runnable() {
            @Override
            public void run() {
                int quessNumber = (int) (Math.random() * 10);
                if (quessNumber == random) {
                    win = true;
                    System.out.println(quessNumber);
                }

            }
        });
        timer.start();
        player.start();
    }
}
