package fila.pratica;


public class Fila {

    private Noo refNoEntradaFila;

    public Fila() {
        //instanciando a entrada da fila vazia
        this.refNoEntradaFila = null;
    }

    public void enqueue(Noo novoNoo){
        novoNoo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNoo;


    }

    public Noo first(){
        if (!this.isEmpty()){
            Noo primeiroNoo = refNoEntradaFila;
            while (true){
                //se nao for o primeiro
                if (primeiroNoo.getRefNo()!= null){
                    primeiroNoo = primeiroNoo.getRefNo();

                }else {
                    break;
                }

            }
            return primeiroNoo;
        }
        return null;

    }
    public Noo dequeue(){
        if (!this.isEmpty()){
            Noo primeiroNoo = refNoEntradaFila;
            Noo noAuxiliar = refNoEntradaFila;
            while (true){
                //se nao for o primeiro
                if (primeiroNoo.getRefNo() != null){
                    noAuxiliar = primeiroNoo;
                    primeiroNoo = primeiroNoo.getRefNo();

                }else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return primeiroNoo;
        }
        return null;

    }


    public boolean isEmpty(){
        //Se a fila for igual a nulo se estiver vazia caso ao contrario retorna falso
        return refNoEntradaFila == null? true: false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        Noo noAuxiliar = refNoEntradaFila;
        if (refNoEntradaFila != null){
            while (true){
                stringRetorno += "[Noo{objeto=" + noAuxiliar.getObject() + "}]---->";
                //proximo Nó
                noAuxiliar = noAuxiliar.getRefNo();
                if (noAuxiliar.getRefNo() != null){

                }else{
                    stringRetorno += "null";
                    break;
                }
            }
        }else {
            stringRetorno = "null";
        }


        return stringRetorno;
    }
}
