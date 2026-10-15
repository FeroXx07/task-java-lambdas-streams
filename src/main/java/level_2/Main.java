package level_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    List<String> names = new ArrayList<>(List.of("Gil", "Pedro", "Ania", "Marcos", "Zubizarreta", "Carlos", "Bernardo", "Silva", "Ana", "Mia"));
    List<Integer> nums = new ArrayList<>(List.of(3, 55, 44, 1, 2, 7, 88));
    List<String> namesAndNums;
    void main(){
        System.out.println("Ex 1 (Strings with letter 'A' and exactly 3 length):");
        StringUtility.getWithLetterAndLength(names, "A",3,3).forEach(System.out::println);

        System.out.println("Ex 2 (Concatenated strings with delimiter ',' and prefix 'o'):");
        String concatResult = StringUtility.concatStringsInto(nums, ",", "e", "o");
        System.out.println(concatResult);

        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        System.out.println("Ex 3 (Addition operation of 12 and 6.2): " + Calculator.operate(12.f, 6.2f, addition));
        System.out.println("Ex 3 (Subtraction operation of 12 and 6.2): " + Calculator.operate(12.f, 6.2f, subtraction));
        System.out.println("Ex 3 (Multiplication operation of 12 and 6.2): " + Calculator.operate(12.f, 6.2f, multiplication));
        System.out.println("Ex 3 (Division operation of 12 and 6.2): " + Calculator.operate(12.f, 6.2f, division));

        StringUtility.processList(names, nums);
    }
}
