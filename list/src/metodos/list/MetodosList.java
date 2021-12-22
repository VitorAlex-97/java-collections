package metodos.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MetodosList {

    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione 7 elementos:");

        List<Double> notas = new ArrayList<Double>();

        //Método add
        notas.add(7.0);
        notas.add(8.0);
        notas.add(5.0);
        notas.add(6.0);
        notas.add(9.0);
        notas.add(5.8);
        notas.add(7.5);
        System.out.println(notas.toString());

        //indexOf -> Nos traz a posição do objeto
        System.out.println("Exiba a posicao da nota 5.0: " + notas.indexOf(5d));

        //add(index, elemento) -> adiciona na posição 'index'
        System.out.println("Adcione na posição 4 a nota 6.5: ");
        notas.add(4, 6.5);
        System.out.println(notas.toString());

        //set()
        System.out.println("Substitua a nota 5.0 pela nota 5.4:");
        notas.set(notas.indexOf(5d), 5.4);
        System.out.println(notas.toString());

        //Verifica se contem um objeto
        System.out.println("Confira se a nota 5.0 esta na lista:");
        System.out.println(notas.contains(5.0));
        System.out.println(notas.toString());

        //forEach
        System.out.println("Imprima a lista com ordem de insersao");
        for (Double iteradorNotas : notas) {
            System.out.println(iteradorNotas);
        }

        System.out.println("Exiba a 3a nota adicionada: " + notas.get(3));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma das notas: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 5.0: ");
        notas.remove(5d);
        System.out.println(notas.toString());

        System.out.println("Remova a nota na posição 3: ");
        notas.remove(3);
        System.out.println(notas.toString());

        System.out.println("Remova as notas menores que 7: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7){
                iterator1.remove();
            }
        }
        System.out.println(notas.toString());

        System.out.println("Remova toda a lista: ");
        notas.clear();
        System.out.println(notas.toString());

        System.out.println("A lista está vazia? " + notas.isEmpty());

    }
}
