import java.util.ArrayList;

public class MergeSort {

    public static ArrayList<Integer> sort(ArrayList<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }
        int middle = list.size() / 2;
        ArrayList<Integer> left = new ArrayList<>(list.subList(0, middle));
        ArrayList<Integer> right = new ArrayList<>(list.subList(middle, list.size()));

        left = sort(left);
        right = sort(right);

        return merge(left, right);
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right) {
        ArrayList<Integer> result = new ArrayList<>();
        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex) <= right.get(rightIndex)) {
                result.add(left.get(leftIndex));
                leftIndex++;
            } else {
                result.add(right.get(rightIndex));
                rightIndex++;
            }
        }

        ArrayList<Integer> leftRest = new ArrayList<>(left.subList(leftIndex, left.size()));
        ArrayList<Integer> rightRest = new ArrayList<>(right.subList(rightIndex, right.size()));

        result.addAll(leftRest);
        result.addAll(rightRest);

        return result;
    }

    public static void main(String[] __){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);

        System.out.print("Исходный список: ");
        for (int i : list) {
            System.out.print(i + " ");
        }

        ArrayList<Integer> sortedList = sort(list);
        System.out.print("\nОтсортированный список: ");
        for (int i : sortedList) {
            System.out.print(i + " ");
        }
    }
}
