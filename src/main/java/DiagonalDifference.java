import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<Integer> top = new ArrayList<>();
        top.add(11);
        top.add(2);
        top.add(4);

        List<Integer> middle = new ArrayList<>();
        middle.add(4);
        middle.add(5);
        middle.add(6);

        List<Integer> down = new ArrayList<>();
        down.add(10);
        down.add(8);
        down.add(-12);

        List<List<Integer>> arr = new ArrayList<>();
        arr.add(top);
        arr.add(middle);
        arr.add(down);

        System.out.println(diagonalDifference(arr));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftRightTotal = 0;
        int rightLeftTotal = 0;
        int positions = arr.toArray().length;
        int total = 0;
        List<Integer> getArrays = new ArrayList<>();

        for (int i = 0; i < positions; i++) {
            getArrays = arr.get(i);
            for (int k = i; k <= i; k++) {
                rightLeftTotal += getArrays.get(k);
            }

            for (int x = i; x <= i; x++) {
                Collections.reverse(getArrays);
                leftRightTotal += getArrays.get(x);
            }
        }

        total = (rightLeftTotal - leftRightTotal);
        return Math.abs(total);
    }
}