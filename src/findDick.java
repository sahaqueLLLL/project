

public class findDick {
    public static String[] listOFDicks = {"Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick",
            "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick",
            "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick",
            "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick",
            "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick",
            "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick",
            "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick",
            "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick",
            "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick", "Dick" };

    public static int findWrongDick() {
        int index = 0;
        while (index < listOFDicks.length) {
            if (listOFDicks[index].contains("o")) {
                return index+1;
            }
            index++;
        }
        System.out.println("The wrong dick is not found.");
        return -1;
    }









}
