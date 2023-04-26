package fila.pratica;

public class Main {
    public static void main(String[]args){
        Fila minhaFila = new Fila();

        minhaFila.enqueue(new Noo("Primeiro"));
        minhaFila.enqueue(new Noo("Segundo"));
        minhaFila.enqueue(new Noo("Terceiro"));
        minhaFila.enqueue(new Noo("Quarto"));


        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());
        minhaFila.enqueue(new Noo("Ultimo"));

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());
        System.out.println(minhaFila);
    }

}
