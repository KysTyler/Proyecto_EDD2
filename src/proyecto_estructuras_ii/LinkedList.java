package proyecto_estructuras_ii;

import java.util.ArrayList;

/**Implementación de LinkedList que se utilizará como AvailList.
 * 
 * @author Andrés Nuila
 * @author Josué Fernández
 * @version 1.2
 */
public class LinkedList<T> {

    private Nodo<T> cabeza;
    private Nodo<T> cola;

    private int nElementos;

    public LinkedList() {
        this.cabeza = new Node<>();
        this.cola = new Node<>();

        conectar(this.cabeza, this.cola);

        this.nElementos = 0;
    }

    /**
     * Busca y retorna el nodo en la posición indicada.
     *
     * @param posicion posición del nodo en la lista
     * @return el nodo en la posición de la lista indicada
     */
    private Nodo<T> obtenerNodo(int posicion) throws IndexOutOfBoundsException {
        // Verificar si la posición es válida
        if (posicion < 0 || posicion >= nElementos) 
            throw new IndexOutOfBoundsException("Element " + posicion + " in LinkedList size " + nElementos + " not found.");
        
        Nodo<T> temp = null;

        if(nElementos - posicion < posicion) {
            temp = this.cabeza;
            for (int i = -1; i < posicion; i++)
                temp = temp.getSiguiente();
        } else {
            temp = this.cola;
            for (int i = nElementos; i > posicion; i--)
                temp = temp.getAnterior();
        }
        return temp;
    }

    /**
     * Inserta el elemento en la posición indicada de la lista.
     *
     * @param posicion posicion donde se insertará en la lista
     * @param data el elemento a insertar
     * @return true si se realizó correctamente la inserción, false de otro modo
     */
    public boolean insertar(int posicion, T data) {
        if (posicion < 0 || posicion > nElementos) {
            return false;
        } else {
            if (posicion == 1 && data != null) {
                Nodo temp = new Nodo();
                temp.setData(data);
                temp.setSiguiente(this.inicio);
                if (this.inicio != null) {
                    this.inicio.setAnterior(temp);
                }
                this.inicio = temp;
                nElementos++;
                return true;
            } else {
                if (posicion == nElementos + 1) {
                    Nodo temp = moverse(posicion);
                    Nodo temp2 = new Nodo();
                    temp2.setData(data);
                    temp.setSiguiente(temp2);
                    temp2.setAnterior(temp);
                    nElementos++;
                    return true;
                } else {
                    Nodo temp = moverse(posicion);
                    Nodo temp2 = new Nodo();
                    Nodo temp3 = moverse(posicion + 1);
                    temp2.setData(data);
                    temp2.setAnterior(temp);
                    temp2.setSiguiente(temp3);
                    temp3.setAnterior(temp2);
                    nElementos++;
                    return true;
                }
            }
        }
    }

    /**Inserta un nodo entre los nodos especificados. 
     * 
     * @param newest El nodo a insertar
     * @param prev Nodo después del cual se insertará
     * @param next Nodo antes del cual se insertará
     */
    private void insertarEntre(Node<T> newest, Node<T> prev, Node<T> next) {
        if(newest != null && previo != null && next != null) {
            newest.setAnterior(prev);
            newest.setSiguiente(next);
            next.setAnterior(newest);
            prev.setSiguiente(newest);
        }
    }

    /**Conecta dos nodos contiguamente, sin modificar sus otros parámetros.
     */
    private void conectar(Node<T> primero, Node<T> segundo) {
        primero.setSiguiente(segundo);
        segundo.setAnterior(primero);
    }

    /**
     * Retorna el elemento en la posición indicada de la lista.
     *
     * @param posicion posición a eliminar de la lista
     * @return el elemento en la posicion suprimida de la lista
     */
    public T obtener(int posicion) throws IndexOutOfBoundsException  {
        // Este método verifica que la posición sea válida
        Node<T> nodo = obtenerNodo(posicion);

        return nodo.getData();
    }

    /**Elimina todos los elementos en la lista.
     */
    public void anular() {
        Node<T> walk = this.cabeza.getSiguiente();
        while (walk != this.cola) {
            Nodo<T> temp = walk.getSiguiente();

            // Eliminamos los datos internos del nodo
            if (walk.getData() != null) {
                walk.setData(null);
                walk.setSiguiente(null);
                walk.setAnterior(null);
            } 

            walk = temp;
        }
        nElementos = 0;
        conectar(this.cabeza, this.cola);
    }

    /**
     * Retorna el índice del primer elemento igual al parámetro.
     * Si no hay tal elemento en la lista, retorna -1;
     *
     * @param data la informacion a buscar
     * @return la posicion donde se encuentre, -1 en caso de no estar
     */
    public int localiza(T data) {
        //establecer un contador
        int Localizacion = 0;
        Nodo<T> temp = this.cabeza.getSiguiente();

        // Recorrer desde inicio, temp = temp.siguiente
        while (temp != this.cola && Localizacion < nElementos) {
            
            if (temp.getData().equals(data))
                return Localizacion;
            else
                Localizacion++;
            
            temp = temp.getSiguiente();
        } // Fin While
        return -1;
    } // Fin Localiza

    /**Elimina el elemento de la lista con el índice  indicado.
     *
     * @param posicion int con la posición a eliminar
     * @return el elemento en la posicion suprimida de la lista, null si no lo encuentra
     */
    public T suprimir(int posicion) {
        T temp = null;
        try {
            Nodo<T> nodo = obtenerNodo(posicion);
            temp = nodo.getData();

            conectar(nodo.getAnterior(), nodo.getSiguiente());
            nodo.setData(null);
            nodo.setSiguiente(null);
            nodo.setAnterior(null);
            
        } catch (IndexOutOfBoundsException e) {
            temp = null;
        }
        return temp;
    } // Fin Recupera

    /**Verifica si la lista esta vacia o no.
     *
     * @return true en caso que no existan elementos en la lista; caso contrario, false
     */
    public boolean vacia() {
        return nElementos == 0;
    }

    /**Retorna el número total de elementos en la lista.
     * 
     * @return el tamaño de la lista
     */
    public int longitud() {
        return this.nElementos;
    }
}
