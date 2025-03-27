import java.util.*;

public class MapTasks {
    public static void main(String[] args) {
        storeCityPopulation();
        copyTreeMap();
        performMapOperations();
        managePersonHeights();
        getSubMap();
    }

    private static void storeCityPopulation() {
        Map<String, Integer> cityPopulation = new HashMap<>();
        cityPopulation.put("NY", 8419600);
        cityPopulation.put("LA", 3980400);
        cityPopulation.put("Chicago", 2716000);
        cityPopulation.put("Hyderabad", 2328000);
        cityPopulation.put("Delhi", 1690000);


        for (Map.Entry<String, Integer> entry : cityPopulation.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    private static void copyTreeMap() {
        TreeMap<Integer, String> originalMap = new TreeMap<>();
        originalMap.put(1, "Apple");
        originalMap.put(2, "Banana");
        originalMap.put(3, "Cherry");

        TreeMap<Integer, String> copiedMap = new TreeMap<>(originalMap);


        System.out.println("Original TreeMap: " + originalMap);
        System.out.println("Copied TreeMap: " + copiedMap);
    }

    private static void performMapOperations() {
        TreeMap<Integer, String> dataMap = new TreeMap<>();
        dataMap.put(3, "Three");
        dataMap.put(1, "One");
        dataMap.put(2, "Two");




        System.out.println("Search Key 2: " + (dataMap.containsKey(2) ? "Found" : "Not Found"));
        System.out.println("Search Value 'Three': " + (dataMap.containsValue("Three") ? "Found" : "Not Found"));

        System.out.println("Get Value for Key 1: " + dataMap.get(1));

        TreeMap<Integer, String> sortedMap = new TreeMap<>(Comparator.reverseOrder());
        sortedMap.putAll(dataMap);
        System.out.println("Sorted in Reverse Order: " + sortedMap);

        dataMap.clear();
        System.out.println("Map after deleting all elements: " + dataMap);
    }

    private static void managePersonHeights() {
        TreeMap<String, Double> personHeights = new TreeMap<>();
        personHeights.put("Bob", 6.0);
        personHeights.put("Alice", 5.6);
        personHeights.put("Charlie", 5.9);


        System.out.println("Original Map: " + personHeights);

        personHeights.remove("Charlie");

        System.out.println("Updated Map after removing Charlie: " + personHeights);
    }

    private static void getSubMap() {
        TreeMap<Integer, String> numberMap = new TreeMap<>();
        numberMap.put(1, "One");
        numberMap.put(2, "Two");
        numberMap.put(3, "Three");
        numberMap.put(4, "Four");
        numberMap.put(5, "Five");

        SortedMap<Integer, String> subMap = numberMap.subMap(2, 5);

        System.out.println("\nTask 5: Get SubMap from 2 (inclusive) to 5 (exclusive)");
        System.out.println(subMap);
    }
}
