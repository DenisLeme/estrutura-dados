package fila.pratica;

public class Noo {

    private Object object;
    private Noo refNo;

    public Noo() {
    }
            public Noo(Object object){
            this.refNo = null;
            //construtor
            this.object = object;

        }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Noo getRefNo() {
        return refNo;
    }

    public void setRefNo(Noo refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "Noo{" +
                "object=" + object +
                '}';
    }
}
