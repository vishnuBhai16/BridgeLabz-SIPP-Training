package Day_2_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class RotateList {
    public static void main(String[] args) {
        List<String> stringList = List.of("A", "B", "C", "D", "E");
        System.out.println("Original List: " + stringList);
        
        List<String> mutableList = new ArrayList<>(stringList);
        rotate(mutableList, 2);
        
        System.out.println("Rotated List: " + mutableList);
    }
    public static <T> void rotate(List<T> list, int k) {
    int n = list.size();
    k = k % n;
    List<T> temp = new ArrayList<>(list.subList(k, n));
    temp.addAll(list.subList(0, k));
    for (int i = 0; i < n; i++)
        list.set(i, temp.get(i));
}

}
