package level_2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilityTest {

    static Stream<Arguments> filterCases() {
        List<String> names = Arrays.asList(
                "Gil", "Pedro", "Ania", "Marcos",
                "Silva", "Ana", "Mia"
        );

        return Stream.of(
                Arguments.of(names, "a", 3, 5,
                        Arrays.asList("Ania", "Silva", "Ana", "Mia")),
                Arguments.of(names, "i", 3, 3,
                        Arrays.asList("Gil", "Mia")),
                Arguments.of(names, "z", 1, 10,
                        List.of())
        );
    }

    // To avoid a large duplicate code of input arguments, @MethodSource is useful because allows some variance in input
    @ParameterizedTest
    @MethodSource("filterCases")
    void getWithLetterAndLength(
            List<String> input,
            String letter,
            int minLength,
            int maxLength,
            List<String> expected) {

        assertEquals(expected, StringUtility.getWithLetterAndLength(input, letter, minLength, maxLength));
    }

    @ParameterizedTest
    @CsvSource({
            "'3, 55, 44', ',' , e, o, 'o3,o55,e44'",
            "'2, 7, 10', '-', EVEN_, ODD_, 'EVEN_2-ODD_7-EVEN_10'",
            "'0', ',', E, O, E0"
    })
    void concatStringsInto(
            String input,
            String delimiter,
            String prefixEven,
            String prefixOdd,
            String expected) {

        List<Integer> numbers = Arrays
                .stream(input.split(",\\s*"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        assertEquals(expected, StringUtility.concatStringsInto(numbers, delimiter, prefixEven, prefixOdd));
    }

}