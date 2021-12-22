package Ordenar.Map;

/*
* Dadas as seguintes informações sobre seus livros favoritos e seus autores,
* crie um dicionario e ordene-o.
* exibindo (Nome Autor - Nome Livro)
*
* Autor: Hawking, Stephem - Livro = nome: Uma Breve História do tempo. Paginas: 256;
* Autor: Harari, Yuval Noah - Livro = nome: 21 liçoes para o seculo 21. Paginas: 408;
* Autor: Duhigg, Charles - Livro = nome: O Poder do Hábito. Paginas: 432;
*
*
* */

import java.util.*;

public class OrdenarMap {
    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--");
        Map<String, Livro>meusLivros = new HashMap<>();
        meusLivros.put("Hawking, Stephem", new Livro("Uma Breve História do tempo", 256));
        meusLivros.put("Harari, Yuval Noah", new Livro("21 liçoes para o seculo 21", 408));
        meusLivros.put("Duhigg, Charles", new Livro("O Poder do Hábito", 432));
        for (Map.Entry<String, Livro> iterador : meusLivros.entrySet()){
            System.out.println(iterador.getKey() + " - " + iterador.getValue().getNome());
        }

        System.out.println("\n--\tOrdem de inserção\t--");
        Map<String, Livro> meusLivros2 = new LinkedHashMap<>();
        meusLivros2.put("Hawking, Stephem", new Livro("Uma Breve História do tempo", 256));
        meusLivros2.put("Harari, Yuval Noah", new Livro("1 liçoes para o seculo 21", 408));
        meusLivros2.put("Duhigg, Charles", new Livro("O Poder do Hábito", 432));
        for (Map.Entry<String, Livro> iterador : meusLivros2.entrySet()){
            System.out.println(iterador.getKey() + " - " + iterador.getValue().getNome());
        }

        System.out.println("\n--\tOrdem de alfabética autores\t--");
        Map<String, Livro> meusLivros3 = new TreeMap<>(meusLivros2);
        for (Map.Entry<String, Livro> iterador : meusLivros3.entrySet()){
            System.out.println(iterador.getKey() + " - " + iterador.getValue().getNome());
        }

        System.out.println("\n--\tOrdem de alfabética dos livros\t--");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNome());
        meusLivros4.addAll(meusLivros3.entrySet());
        for (Map.Entry<String, Livro> iterador : meusLivros4){
            System.out.println(iterador.getKey() + " - " + iterador.getValue().getNome());
        }





    }

}



class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
        return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
    }
}
