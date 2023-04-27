package equals.pratica;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Porshe"));
        listaCarros.add(new Carro("Ferrari"));
        listaCarros.add(new Carro("Lambo"));

        System.out.println(listaCarros.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford").hashCode());

        Carro carro1 = new Carro("Chevrolet");

        System.out.println(carro1.equals(carro1));

    }
}
