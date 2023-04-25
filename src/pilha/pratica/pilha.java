package pilha.pratica;

public class pilha {

    private No refNoEntradaPilha;

    public pilha() {

        this.refNoEntradaPilha = null;

    }
    public void push(No novoNo){

        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop(){
        //Se minha pilha não estiver vazia
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;

            //referencia de entrada
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;

    }

    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){
// Esse metodo refatorado fica igual o return.


//        if(refNoEntradaPilha == null){
//            return true;
//        }
//        return false;

        return refNoEntradaPilha == null ? true : false;

    }
}
