package TestPrograms;//package TestPrograms;
//// Duplicate element with count
//public class TestJava {
//
//    public static void main(String[] args) {
//        String str1 = "prafullpa";
//        int count = 0;
//
//        for (int i = 0; i < str1.length(); i++) {
//            for (int j = i + 1; j < str1.length(); j++) {
//                if (str1.charAt(i) == str1.charAt(j)) {
//                    count++;
//                    System.out.println(str1.charAt(i));
//                    break;
//                }
//            }
//        }
//        System.out.println("Total duplicate elements: " + count);
//    }
//}

// Print Duplicated characters and it's count
import java.util.HashMap;
        import java.util.Map;
        import java.util.stream.Collectors;

public class TestJava {
    public static void main(String[] args) {
        String str = "PrafullPatil";
        Map<Character, Integer> occurrenceMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (occurrenceMap.get(ch) == null || occurrenceMap.get(ch) == 0) {
                occurrenceMap.put(ch, 1);
            } else {
                int count = occurrenceMap.get(ch) + 1;
                occurrenceMap.put(ch, count);
            }
        }

        System.out.println(
                occurrenceMap.entrySet()
                        .stream()
                        .filter((k) -> k.getValue() > 1)
                        .collect(Collectors.toMap(k -> k.getKey(), k -> k.getValue()))
        );
    }
}

