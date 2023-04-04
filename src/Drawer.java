

public class Drawer {


    public void drawRoad() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("*                        *");
            Thread.sleep(100);
        }
        System.out.println("Done!");


        }
    public void drawLayers() throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            if (i % 100 == 0) {
                System.out.println();
            }
            System.out.print("*");
            Thread.sleep(10);

        }
    }

    public void countDown() throws InterruptedException {
        for (int i = 10; i > 0 ; i--) {
            System.out.println(i + "!");
            Thread.sleep(1000);
        }
        System.out.println("Boom!");
    }
    

    }


