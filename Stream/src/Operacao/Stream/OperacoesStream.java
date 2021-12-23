package Operacao.Stream;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class OperacoesStream {
    public static void main(String[] args) {

        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "8", "9", "5", "7", "6", "2", "9");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleatorios.forEach(System.out::println);

        System.out.println("\nPegue os 5 primeiros números e coloque dentro de um Set: ");
         Set<String> collectSet =
                 numerosAleatorios.stream()
                 .limit(5)
                 .collect(Collectors.toSet());

        System.out.println("Transforme essa lista de String em numeros inteiros: ");
        List<Integer> colletaList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(colletaList);

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
        List<Integer> listaPares = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(resp -> (resp%2 == 0 && resp > 2))
                .collect(Collectors.toList());
        System.out.println(listaPares);

        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os valores impares: ");
        colletaList.removeIf(resp -> resp%2 != 0);
        System.out.println(colletaList);

    }

}
