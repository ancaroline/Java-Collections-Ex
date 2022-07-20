package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        /*
            numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        */
        //LAMBDA
        //numerosAleatorios.stream().forEach(s -> System.out.println(s));
        //METHOD REFERENCE
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 últimos primeiros números e coloque dentro de um Set: ");
        //limit - collect
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("Transforme esta lista de String em uma lista de números inteiros");
        //Map (não é de collections)
        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
        //Map e Filter
        List<Integer> ListParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2)).collect(Collectors.toList());
        System.out.println(ListParesMaioresQue2);

        System.out.println("Mostre a média dos números: ");
        //MapToInt, pois vou querer pegar cada elemento dentro do list para fazer manipulações
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os valores ímpares");
        //não pode trabalhar com stram
        //método de list
        collectList.removeIf(integer -> integer % 2 != 0);
        System.out.println(collectList);


    }

}
