package Day_2_Collection_Framework;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

    public static <T> List<T> removeDuplicates(List<T> list) {
    Set<T> seen = new LinkedHashSet<>();
    seen.addAll(list);
    return new ArrayList<>(seen);
}

public static void main(String[] args) {
    List<String> stringList = List.of("A", "B", "A", "C", "B", "A","D");
    System.out.println("Original List: " + stringList);
    
    List<String> uniqueList = removeDuplicates(stringList);
    System.out.println("List after removing duplicates: " + uniqueList);
}

}
