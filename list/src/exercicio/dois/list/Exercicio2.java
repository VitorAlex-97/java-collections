package exercicio.dois.list;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        ArrayList<Boolean> respostas = new ArrayList<Boolean>();
        Scanner scan = new Scanner(System.in);

        String classificacao;

        System.out.println("Telefonou para a vítima? [S / N]");
        Character resp = scan.next().toUpperCase().charAt(0);
        respostas = transformaEmBoolean(resp, respostas);

        System.out.println("Esteve no local do crime? [S / N]");
        Character resp1 = scan.next().toUpperCase().charAt(0);
        respostas = transformaEmBoolean(resp1, respostas);

        System.out.println("Mora perto da vítima? [S / N]");
        Character resp2 = scan.next().toUpperCase().charAt(0);
        respostas = transformaEmBoolean(resp2, respostas);

        System.out.println("Devia para a vítima? [S / N]");
        Character resp3 = scan.next().toUpperCase().charAt(0);
        respostas = transformaEmBoolean(resp3, respostas);

        System.out.println("Já trabalhou com a vítima? [S / N]");
        Character resp4 = scan.next().toUpperCase().charAt(0);
        respostas = transformaEmBoolean(resp4, respostas);

        int somadorTrue = 0;
        for (Boolean iterador : respostas) {
            if (iterador == true) {
                somadorTrue++;
            }
        }

        if (somadorTrue == 2) {
            classificacao = "Suspeita";
        } else if (somadorTrue == 3 || somadorTrue == 4){
            classificacao = "Cúmplice";
        } else if (somadorTrue == 5) {
            classificacao = "Assassina";
        } else {
            classificacao = "Inocente";
        }

        System.out.println("Você foi considerado(a) " + classificacao);

    }

    public static ArrayList<Boolean> transformaEmBoolean (Character resp, ArrayList<Boolean> respostas) {
        if( 'S' == resp) {
            respostas.add(true);
        } else {
            respostas.add(false);
        }

        return respostas;
    }
}


