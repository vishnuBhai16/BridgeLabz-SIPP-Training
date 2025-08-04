package Day_2_Collection_Framework;

import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        
        List<String> stringList = List.of("A", "B", "C", "D");
        System.out.println("Original List: " + stringList);
        
        
        List<String> mutableList = new java.util.ArrayList<>(stringList);
        reverseList(mutableList);
        
        System.out.println("Reversed List: " + mutableList);
    }
    public static <T> void reverseList(List<T> list) {
    int left = 0, right = list.size() - 1;
    while (left < right) {
        T temp = list.get(left);
        list.set(left, list.get(right));
        list.set(right, temp);
        left++;
        right--;
    }
}

}
