package com.iescamp.supermercado;

import java.util.LinkedList;

/**
 *
 * @author eloy
 *
 * La cinta tiene un tamaño de cinco objetos, por lo que a partir de este
 * número, bloqueará al cliente hasta que el cajero vaya vaciándola.
 */
public class CintaTransportadora {

    private final static int LIMITE_CINTA = 5;
    private final LinkedList<Producto> cinta;

    public CintaTransportadora() {
        cinta = new LinkedList<>();
    }

    public synchronized void depositarProducto(Producto p1) throws InterruptedException {

        while (cinta.size() == LIMITE_CINTA) {
            wait();
        }
        cinta.add(p1);
        notify();
    }

    public synchronized Producto tomarProducto() throws InterruptedException {
        Producto auxP;

        while (cinta.isEmpty()) {
            wait();
        }
        auxP = cinta.remove();
        notify();
        return auxP;
    }

}
