package level_1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    List<String> list = new ArrayList<>(List.of("Manzana","Abelardo", "Arbol", "Intuición","Pan", "Arboles"));
    List<String> months = new ArrayList<>(List.of("January", "February", "March", "April",
            "May", "June", "July", "August", "September", "October", "November", "December"));
    List<String> names = new ArrayList<>(List.of("Gil", "Pedro", "Ania", "Marcos", "Zubizarreta", "Carlos", "Bernardo", "Silva"));

    void main() {
        System.out.println("Ex 1 (Strings with only 'o'):");
        StringUtility.getWithO(list).forEach(System.out::println);

        System.out.println("Ex 2 (Strings with only 'o' and more than 5 length):");
        StringUtility.getWith6MinAndO(list).forEach(System.out::println);

        System.out.println("Ex 3 (Print list with lambda):");
        months.forEach(s -> System.out.println(s));

        System.out.println("Ex 4 (Print list with method reference):");
        months.forEach(System.out::println);

        System.out.println("Ex 5 Functional Interface:");
        MathPi mathPi = new MathPi() {
            @Override
            public double getPiValue() {
                return 3.1415;
            }
        };
        System.out.println("The PI number is: " + mathPi.getPiValue());

        System.out.println("Ex 6:");
        StringUtility.sortByLengthMinMax(names).forEach(System.out::println);

        System.out.println("Ex 7:");
        StringUtility.sortByLengthMaxMin(names).forEach(System.out::println);

        System.out.println("Ex 8:");
        StringReverse stringReverse = (String s) -> new StringBuilder(s).reverse().toString();
        String word = "Robledo";
        System.out.println("The reverse of the word "+ word + " is " + stringReverse.reverse(word));
    }
}
