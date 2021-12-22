package Metodos.Set;

import java.util.*;

public class MetodosSet {

    public static void main(String[] args) {

        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d); //não vai entrar no conjunto (Set não repete)
        notas.add(0d);
        notas.add(3.7);
        System.out.println(notas);

        System.out.println("Exiba a posicao da nota 5.0: HÁ COMO TRABALHAR COM POSIÇÕES NO SET");

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Double soma = 0d;
        for (Double iterador : notas) {
            soma += iterador;
        }
        System.out.println("Exibir a soma das notas: " + soma);

        System.out.println("Exibir a média das notas: " + soma/ notas.size());

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        notas.removeIf(iterador -> iterador < 7.0);
        System.out.println("Remova as notas menores que 7 e exiba o conjunto: ");
        System.out.println(notas);

        System.out.println("Exiba na ordem que foram adicionadas");
        Set<Double> notas2 = new LinkedHashSet<>(notas);
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d); //não vai entrar no conjunto (Set não repete)
        notas2.add(0d);
        notas2.add(3.7);
        System.out.println(notas2);

        System.out.println("Exiba a todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apagure todo o conjunto: ");
        notas3.clear();
        System.out.println(notas3);

        System.out.println("Confira se o conjunto 'notas3' está vazio: " + notas3.isEmpty());
        System.out.println("Confira se o conjunto 'notas2' está vazio: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto 'notas' está vazio: " + notas.isEmpty());

    }

}
