package collectionsList;

import java.util.LinkedList;

public class DesafiosList {
    public static void main(String[] args) {
        /*
        Resolva esses exercícios utilizando os métodos da implementação LinkedList:
        System.out.println("Crie uma lista chamada notas2: " + "coloque todos os elementos
        da List ArrayList nessa nova lista:);

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo");
        System.out.println("Mostre a primeira nota da nova lista removendo-o");
         */
        System.out.println("Crie uma lista chamada notas2: ");
        LinkedList<Double> notas2 = new LinkedList<Double>();
        System.out.println(notas2);
        System.out.println("Coloque todos os elementos da List ArrayList nessa nova lista: ");
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);
        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: " + notas2.getFirst());
        System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
        System.out.println(notas2.removeFirst());
        System.out.println(notas2);

    }
}
