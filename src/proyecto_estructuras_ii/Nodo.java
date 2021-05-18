package proyecto_estructuras_ii;



public class Nodo {

    private Object data;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo() {
        this.anterior = null;
        this.siguiente = null;
        this.data = null;
    }

    public Nodo(Object data) {
        siguiente = null;
        anterior = null;
        if (data != null) {
            this.data = data;
        } else {
            this.data = null;
        }
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

}
