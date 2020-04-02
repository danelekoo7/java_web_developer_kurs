package java8.a_Zadania.b_Dzien_2.c_Strumienie.zad5;

import java.util.*;
import java.util.stream.Collectors;


public class Main5 {
    public static void main(String[] args) {
        List<String> animals = Arrays.asList("anakonda", "zyrafa", "slon", "hipek", "chomik", "pies", "kotek", "borsuc");

//        opcja 1
        HashSet<Map<String, String>> collect = animals.stream()
                .map(s -> {
                    Map<String, String> map = new HashMap<>();
                    map.put(s, reverse(s));
                    return map;
                })
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(collect);


//        opcja 2
        Map<String, String> collected = animals.stream()
                .collect(
                        Collectors.toMap(elem -> elem, elem -> new StringBuilder(elem).reverse().toString())
                );
        System.out.println(collected);

    }

    static String reverse(String string) {
        char[] chars = string.toCharArray();
        char[] newChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            newChars[i] = chars[chars.length - i - 1];
        }
        String result = new String(newChars);
        return result;
    }
}
