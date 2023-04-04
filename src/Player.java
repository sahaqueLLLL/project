public class Player implements Songs{
    public static void play() throws InterruptedException {
        int songIndex = Main.sc.nextInt();
        playSong(songIndex);
    }

    static private void playSong(int x) throws InterruptedException {
        boolean end = false;
        while (!end) {
        switch (x) {
            case 1:
                Thread.sleep(1000);
                System.out.println(Yen_Song);
                Thread.sleep(1000);
                x = Main.sc.nextInt();
                break;
            case 2:
                Thread.sleep(1000);
                System.out.println(Warranty_Song);
                Thread.sleep(1000);
                x = Main.sc.nextInt();
                break;
            case 3:
                Thread.sleep(1000);
                System.out.println(Heirloom_Song);
                Thread.sleep(1000);
                x = Main.sc.nextInt();
                break;
            case 4:
                Thread.sleep(1000);
                System.out.println(Adderall_Song);
                Thread.sleep(1000);
                x = Main.sc.nextInt();
                break;
            case 5:
                Thread.sleep(1000);
                System.out.println(HiveMind_Song);
                Thread.sleep(1000);
                x = Main.sc.nextInt();
                break;
            default:
                end = true;
                break;
        }}
    }

}
