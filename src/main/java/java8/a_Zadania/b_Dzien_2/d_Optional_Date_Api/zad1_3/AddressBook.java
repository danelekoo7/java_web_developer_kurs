package java8.a_Zadania.b_Dzien_2.d_Optional_Date_Api.zad1_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class AddressBook {

    private static final HashMap<String, String> phoneBookEntries = new HashMap<>();

    static {
        phoneBookEntries.put("Jan Kowalski", "Kraków Polna 11");
        phoneBookEntries.put("Marek Marecki", "016/161617");
        phoneBookEntries.put("Adam", "aa");
    }

    public static void main(String[] args) {
        System.out.println(findAddressByName("Jan Kowalski"));
        System.out.println(findAddressByName("Adam"));
        System.out.println(findNameByAddress("016/161617"));
    }

//    public static Optional<String> findAddressByName(String name) {
//        return phoneBookEntries.entrySet().stream()
//                .filter(entry -> entry.getKey().equals(name))
//                .map(Map.Entry::getValue)
//                .findFirst();
//    }

    public static Optional<String> findAddressByName(String name) {
        return Optional.ofNullable(phoneBookEntries.get(name));
    }

    public static Optional<String> findNameByAddress(String addr) {
        return phoneBookEntries.entrySet()
                .stream()
                .filter(entry -> entry.getValue().equals(addr))
                .map(Map.Entry::getKey)
                .findFirst();
    }


}