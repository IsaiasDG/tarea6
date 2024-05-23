package tarea6ed;

public class Descuento {
    
    private static final double DESCUENTO_5_PORCIENTO = 0.95;
    private static final double DESCUENTO_20_PORCIENTO = 0.8;

public void aplicarDescuento(double precioProducto, int numProductos){
    double total;
    if(numProductos>3)
        precioProducto-=5;
            if (numProductos!=0){
            total = precioProducto*DESCUENTO_20_PORCIENTO;
            mensajeFinal(total);
        }else {
            total = precioProducto*DESCUENTO_5_PORCIENTO;
            mensajeFinal(total);
        }   

    }

    private void mensajeFinal(double total) {
        System.out.println("El total a pagar es:"+total);
        System.out.println("Enviado");
    }
}
