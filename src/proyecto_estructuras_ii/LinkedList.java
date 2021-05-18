package proyecto_estructuras_ii;

import java.util.ArrayList;

public class LinkedList {

    private Nodo inicio;
    private int nElementos;

    public LinkedList() {
        this.inicio = null;
        this.nElementos = 0;
    }

    /**
     * moverse a traves de la lista
     *
     * @param posicion int que es la posición donde se ubicara en la lista
     * @return un nodo siendo este el de la posicion dada
     */
    public Nodo moverse(int posicion) {
        Nodo temp = this.inicio;
        for (int i = 0; i < posicion - 1; i++) {
            temp = temp.getSiguiente();
        }
        return temp;
    }

    /**
     * que inserta un nuevo nodo en la lista y lo enlaza a los nodos
     * siguiente y anterior
     *
     * @param posicion int con la posicion donde se insertará en la lista
     * @param data el objeto que se guardara en la psoición dada
     * @return true si se realizó correctamente la inserción
     */
    public boolean insertar(int posicion, Object data) {
        if (posicion < 1 || posicion > nElementos) {
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

    /**
     * extrae el object que hay en una posicion en la lista
     *
     * @param posicion int con la posición a eliminar
     * @return el Object en la posicion suprimida de la lista
     */
    public Object extraer(int posicion) {
        Object retValue = null; //asignar null
        if (posicion > 0 && posicion <= nElementos) {
            Nodo temp = inicio;
            Nodo tempSiguiente;
            if (posicion == 0) {
                //Si esta al inicio
                tempSiguiente = temp.getSiguiente();
                if (tempSiguiente != null) {
                    //Hay otro elemento en frente del primero
                    temp.setSiguiente(null);
                    tempSiguiente.setAnterior(null);
                    retValue = temp.getData();
                    temp.setData(null);
                    inicio = tempSiguiente;
                    temp = null;
                } else {
                    //El siguiente elemento es Null
                    retValue = temp.getData();
                    temp.setData(null);
                    temp = null;
                    inicio = null;
                } // Fin If
            } else {
                //Caso cuando la posicion ingresada es != 1
                //Borramos 3
                temp = moverse(posicion); // Ej. 2
                tempSiguiente = temp.getSiguiente(); // Ej. 3
                temp.setSiguiente(tempSiguiente.getSiguiente()); //el siguiente de 2 es 4
                if (posicion != nElementos) {
                    temp.getSiguiente().setAnterior(temp); //Ahora el anterior de 4 es 2
                } // Fin If
                //Suprimimos 3
                retValue = tempSiguiente.getData();
                tempSiguiente.setSiguiente(null);
                tempSiguiente.setAnterior(null);
                tempSiguiente.setData(null);
                tempSiguiente = null;
            } // Fin If
            nElementos--;
        } // Fin If
        return retValue;
    }

    /**
     * elimina todo lo que este en la lista
     */
    public void anula() {
        while (inicio != null) {
            Nodo temp;
            temp = inicio;
            inicio = inicio.getSiguiente();
            if (temp.getData() != null) {
                temp.setData(null);
                temp.setSiguiente(null);
            } // Fin If
        } // Fin While
        //resetar n
        nElementos = 0;
    }

    /**
     * localiza un nodo dentro de la lista dado el objeto
     *
     * @param data la informacion a buscar
     * @return la posicion donde se encuentre, -1 en caso de no estar
     */
    public int localiza(Object data) {
        //establecer un contador
        int Localizacion = 1;
        Nodo temp = inicio;
        //recorrer desde inicio temp = temp.siguiente
        while ((temp != null) && (Localizacion <= nElementos)) {
            if (temp.getData().equals(data)) {
                return Localizacion;
            } else {
                Localizacion++;
            } // Fin If
            temp = temp.getSiguiente();
        } // Fin While
        return -1;
    } // Fin Localiza

    /**
     * recupera el objeto en la posicion dada
     *
     * @param posicion donde esta el objeto a recuperar
     * @return el objeto en la posicion, null si esta vacio el nodo
     */
    public Object recupera(int posicion) {
        Object temp = null;
        if (posicion > 1 || posicion < nElementos) {
            temp = moverse(posicion).getData();
        }
        return temp;
    } // Fin Recupera

    /**
     * verifica si la lista esta vacia o no
     *
     * @return true en caso que no existan elementos en la lista
     */
    public boolean vacia() {
        if (nElementos == 0) {
            return true;
        } else {
            return false;
        }
    }
}
