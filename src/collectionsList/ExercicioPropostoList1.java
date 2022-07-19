package collectionsList;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
Após, calcule a média semestral das temps e mostre as temps acima da média, e em que mês elas
ocorreram(mostrar o mês por extenso: 1-Janeiro, 1-Fevereiro)
 */
public class ExercicioPropostoList1 {
    public static void main(String[] args) {
        List<meses> seisMeses = new ArrayList<>(){{
            add(new meses("Janeiro", 25));
            add(new meses("Fevereiro", 23));
            add(new meses("Março", 26));
            add(new meses("Abril", 31));
            add(new meses("Maio", 32));
            add(new meses("Junho", 26));
        }};
        System.out.println(seisMeses);
        System.out.println("A soma das temperaturas: ");

        }



    }


class meses {
    private String mes;
    private Integer temperatura;

    public meses(String mes, Integer temperatura) {
        this.mes = mes;
        this.temperatura = temperatura;
    }

    public String getMes() {
        return mes;
    }

    public Integer getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return "{" +
                "mes='" + mes + '\'' +
                ", temperatura=" + temperatura +
                '}';
    }
}
