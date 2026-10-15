package level_1;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StringUtility {

    public static List<String> getWithO(List<String> list) {
        return list
                .stream()
                .filter(s -> s.contains("o"))
                .toList();
    }

    public static List<String> getWith6MinAndO(List<String> list) {
        return getWithO(getWith6MinLength(list));
    }

    public static List<String> getWith6MinLength(List<String> list) {
        return list
                .stream()
                .filter(s -> s.length() > 5)
                .toList();
    }
}
