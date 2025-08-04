package Day_2_Collection_Framework;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) {
        List<String> stringList = List.of("A", "B", "A", "C", "B", "A");
        System.out.println("Original List: " + stringList);
        Map<String, Integer> frequencyMap = countFrequencies(stringList);
        System.out.println("Frequencies: " + frequencyMap);
    }
    
    public static Map<String, Integer> countFrequencies(List<String> list) {
        Map<String, Integer> freqMap = new HashMap<>();
        for (String s : list)
            freqMap.put(s, freqMap.getOrDefault(s, 0) + 1);
        return freqMap;
    }
}

