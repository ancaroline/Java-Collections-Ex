package collectionsMap;
/*Dados as seguintes informações sobre meus livros favoritos e seus autores, crie um dicionário e ordene
este dicionário:
exibindo (Nome Autor - Nome Livro);
Autor = Hawking, Stephen - Livro = nome: História do tempo. Páginas: 256
Autor = Duhigg, Charles - Livro - nome: Hábito, paginas: 408
Autor = Harari, Yuval Noah - Livro = 21 lições, páginas 432
 */

import java.util.*;

public class ExemplosOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t---");
        //HashMap
        Map<String, Livro> meusLivros = new HashMap<>() {{
            put("Hawking, Stephen", new Livro("História do tempo", 256));
            put("Duhigg, Charles", new Livro("Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 lições", 432));
        }};
        //for para imprimir a chave e o nome do livro, utilizando entrySet
        for(Map.Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem de Inserção\t---");
        //LinkedHashMap
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{
            put("Hawking, Stephen", new Livro("História do tempo", 256));
            put("Duhigg, Charles", new Livro("Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 lições", 432));
        }};
        for(Map.Entry<String, Livro> livro : meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());


        System.out.println("--\tOrdem alfabética dos autores\t---");
        //Ordenação das chaves = TreeMap

        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for(Map.Entry<String, Livro> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());


        System.out.println("--\tOrdem alfabética dos nomes dos livros\t---");
        //Para trabalhar com valores, tem que usar o TreeSet, pois é preciso usar um comparator
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Livro> livro : meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        //System.out.println("--\tOrdem número de páginas\t---");

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

    public Integer getPaginas() {
        return paginas;
    }

    //Como vamos usar o hashmap, treemap e linkedhashmap, irei sobrescrever o equals e o hashcode
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

    //para não mostrar o endereço de memória
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
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}
