import java.util.*;

public class Main {

    public static void main(String[] args) {
        String string1 = "LLLA";
        String string2 = "LLLL";

        System.out.println(areAnagrams(string1, string2));

    }

    private static Map<Character, Integer> mapFromString(String string) {
        Map<Character, Integer> mapFromString = new HashMap<>();

        for (Character ch : string.toCharArray()
        ) {
            if (mapFromString.containsKey(ch)) {
                mapFromString.put(ch, mapFromString.get(ch) + 1);
            }
            mapFromString.put(ch, 1);
        }

        return mapFromString;
    }

    private static boolean areAnagrams(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        return (mapFromString(string1).equals(mapFromString(string2)));
    }
}
