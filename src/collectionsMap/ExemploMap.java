package collectionsMap;

import java.util.*;

/*
Dados os modelos dos carros e seus respectivos consumos na estrada, faça:
modelo = gol - consumo = 14,4km/L
modelo = uno - consumo = 15,6km/L
modelo = mobi - consumo = 16,1km/L
modelo = hb20 - consumo = 14,5km/L
modelo = kwid - consumo = 15,6km/L
 */
public class ExemploMap {
    public static void main(String[] args) {

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos: ");
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            //não tem como usar o método add
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2); //tem como alterar e não adicionar, pois a chave já existe
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));
        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));
        System.out.println("Exiba o terceiro modelo adicionado: "); //não é possivel

        System.out.println("Exiba os modelos: ");
        //keySet retorna um set
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);
        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);
        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry : entries) {
            //se o valor dele for igual ao consumo mais eficiente,
            //o modelo eficiente é igual a chave referente ao entry
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }

        }
    }
}
