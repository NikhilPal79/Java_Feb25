package apr8.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();

        // Product = quantity    // KEY-VALUE PAIR
        map.put("smartphone",3 );
        map.put("shoes",15 );
        map.put("shades ",2 );
        map.put("car",2 );
        map.put("bottles ",5 );

        System.out.println(map);
        System.out.println();
        ///  random order because of hashMap

        ///  map values
        System.out.println(map.values());
        System.out.println();

        /// map key values
        System.out.println(map.keySet());
        System.out.println();


        System.out.println(map.get("car"));
        System.out.println();

        System.out.println(map.getOrDefault("shoes", 10));
        System.out.println();

        System.out.println(map.containsKey("shoes"));
        System.out.println();
        System.out.println();
        System.out.println();

        ///  HOW TO LOOP OVER A MAP

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        System.out.println(entrySet);
        System.out.println();


        for (Map.Entry<String, Integer> e : entrySet ) {
            System.out.println(e.getValue());

        }
        System.out.println();
        System.out.println();

        for (Map.Entry<String, Integer> element : entrySet) {
            System.out.println(element.getKey());
        }



    }
}
