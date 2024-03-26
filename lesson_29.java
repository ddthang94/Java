import java.util.HashMap;

public class lesson_29 {
    public static void main(String[] args) {
        /* Hashmap */
        /* initialize */
        HashMap<Integer, String> map = new HashMap<>();
//        HashMap<Integer, Float> map1 = new HashMap<>();

        /* Methods */
        /* put(key, value) - adding an element into Hashmap */
        map.put(1,"apple");
        map.put(2,"banana");
        map.put(3,"cherry");
        map.put(4,"kiwi");
        map.put(5,"watermelon");
        System.out.println(map);
        /* get(key) - return a value following its key */
        String value = map.get(5);
        System.out.println("Get value where key=5 "+value);
        /* remove(key) - removing an element both key and value */
        map.remove(4);
        System.out.println("Get value where key=4 "+map.get(4));
        System.out.println("After removing key=4 "+map);
        /* containsKey(key) - check if key is available in Hashmap or not */
        boolean checker = map.containsKey(5);
        System.out.println(checker);
        /* containsValue(value) - check if value is available in Hashmap or not */
        boolean checker1 = map.containsValue("kiwi");
        System.out.println(checker1);
        /* isEmpty() - check if hashmap is empty or not */
        boolean checker2 = map.isEmpty();
        System.out.println("IsEmpty() = "+checker2);
        /* size() - check the size of hashmap */
        int elements = map.size();
        System.out.println("Check size: "+elements);
        System.out.println("=========================");

        /* loop through the hashmap */
        for (Integer key : map.keySet()) {
            String val = map.get(key);
            System.out.println(key+ " : "+val);
        }
    }
}
