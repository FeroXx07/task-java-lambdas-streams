package level_1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.Parameter;
import org.junit.jupiter.params.ParameterizedClass;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ParameterizedClass
@MethodSource("stringsList")
class StringUtilityTest {
    @Parameter
    List<String> values;

    static Stream<List<String>> stringsList() {
        return Stream.of(List.of("Alberto", "Silva", "Rio", "Lisa", "Bernardo", "Marcos", "Zubizarreta", "Carlos"));
    }

    @Test
    void getWithO() {
        List<String> expected = List.of("Alberto", "Rio", "Bernardo", "Marcos", "Carlos");
        List<String> actual = StringUtility.getWithO(values);
        assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void getWith6MinLength() {
        List<String> expected = List.of("Alberto", "Bernardo", "Marcos", "Zubizarreta", "Carlos");
        List<String> actual = StringUtility.getWith6MinLength(values);
        assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void getWith6MinAndO() {
        List<String> expected = List.of("Alberto", "Bernardo", "Marcos", "Carlos");
        List<String> actual = StringUtility.getWith6MinAndO(values);
        assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void sortByLengthMinMax() {
        List<String> expected = List.of("Rio", "Lisa", "Silva", "Marcos", "Carlos", "Alberto", "Bernardo", "Zubizarreta");
        List<String> actual = StringUtility.sortByLengthMinMax(values);
        assertThat(actual).containsExactlyElementsOf(expected);
    }

    @Test
    void sortByLengthMaxMin() {
        List<String> expected = List.of("Zubizarreta", "Bernardo", "Alberto", "Marcos", "Carlos", "Silva", "Lisa", "Rio");
        List<String> actual = StringUtility.sortByLengthMaxMin(values);
        assertThat(actual).containsExactlyElementsOf(expected);
    }

}