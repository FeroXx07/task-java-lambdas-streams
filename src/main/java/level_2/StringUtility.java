package level_2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringUtility {
    public static List<String> getWithLetterAndLength(List<String> list, String letter, int minLength, int maxLength) {
        Predicate<String> predicateLength = s -> s.length() >= minLength && s.length() <= maxLength;
        Predicate<String> predicateLetter = s -> s.contains(letter);
        return list
                .stream()
                .filter(predicateLength.and(predicateLetter))
                .toList();
    }

    public static String concatStringsInto(List<Integer> list, String delimiter, String prefixEven, String prefixOdd) {
        Function<Integer, String> funcPrefix = (i) -> (i % 2 == 0 ? prefixEven : prefixOdd) + i;
        return list
                .stream()
                .map(funcPrefix)
                .collect(Collectors.joining(delimiter));
    }

    public static void processList(List<String> stringList, List<Integer> integerListlist) {
        // Convert and concat nums into names
        List<String> namesAndNums = new ArrayList<>(stringList);
        namesAndNums.addAll(integerListlist
                .stream()
                .map(String::valueOf)
                .toList());

        // Alphabetic sort order by the first char
        List<String> listA = namesAndNums
                .stream()
                .sorted((s1, s2) -> Character.compare(s1.charAt(0), s2.charAt(0)))
                .toList();

        System.out.println("Ex 4: The following list is ordered by alphabetic order of the first character\n" + listA);

        // Priority of "e" letter in sort,
        // the comparator works so that n<0 means o1 comes before o2, n=0 equal, n>0 o2 comes before o1
        List<String> listB = listA
                .stream()
                .sorted((s1, s2) -> {
                    if (s1.contains("e") == s2.contains("e")) {
                        return 0;
                    }
                    else if (s1.contains("e") && !s2.contains("e")) {
                        return -1;
                    }
                    else {
                        return 1;
                    }
                })
                .toList();

        System.out.println("Ex 4: The following list is ordered by 'e' containing elements first\n" + listB);

        // Transformation of all elements with char "a", transformation of such char into char "4"
        Function<String, String> transformInto4 = s->s.replace("a","4");
        List<String> listC = listB
                .stream()
                .map(transformInto4)
                .toList();

        System.out.println("Ex 4: The following list has its 'a' converted into '4'\n" + listC);

        // Filtering of numeric elements only
        Predicate<String> predicateNumeric = StringUtility::isNumeric;
        List<String> listD = listC
                .stream()
                .filter(predicateNumeric)
                .toList();

        System.out.println("Ex 4: The following list has filtered to have only numeric elements'\n" + listD);
    }

    private static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
