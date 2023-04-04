import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task {

    public static int[] array1 = {1,2,3,4,5};
    public static int[] array2 = {2,3,4,5,1};
    public static int[] array3 = {3,4,5,2,1};
    public static int[] array4 = {4,5,3,2,1};
    public static int[] array5 = {5,4,3,2,1};

    public static int[] bigArray = {4,5,6,2,34,5,56,8,7,0,9,8,7,4,3,5,6,1};



    public static List<int[]> list = Arrays.asList(array1,array2,array3,array4,array5);

    public static boolean checkEquals(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int buff = array[i];
            for (int j = 0; j < array.length; j++) {
                if (array[j] == buff) count++;
            }
            if (count > 1) return true;
            count = 0;

        }
        return false;


    }
    public static List<int[]> getReversedList() {
        List<int[]> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            newList.add(i, list.get(list.size() - i - 1));
        }
        return newList;
    }

    public static void compare() {
        list.stream().map(Arrays::toString).forEach(elem -> System.out.print(elem + " "));
        System.out.println("\n_______________________________________________________________________________");
        getReversedList().stream().map(Arrays::toString).forEach(elem -> System.out.print(elem + " "));
        System.out.println("\n_______________________________________________________________________________");
    }

    public static int[] setElement(int arrayNum, int elemNum, int num) {
        int[] newArray = list.get(arrayNum - 1);
        newArray[elemNum - 1] = num;
        return newArray;
    }
    public static void OgeTask() {
        int count = 0;
        int num = Main.sc.nextInt();
        for (int i = 0; i < num; i++) {
            int x = Main.sc.nextInt();
            if (x % 4 == 0 && x % 7 != 0) count++;
        }
        System.out.println(count);
    }
}
