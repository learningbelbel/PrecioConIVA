package bootcamp.basico.modulo2.EjercicioPrecio;

public class PrecioConIVA {
    /**
     * El porcentaje del IVA está adaptado al IVA de mi pais, Guatemala, el cual es el 12%
     * si se quisiera calcular el precio con IVA de otro pais solo se deberia de reemplazar el pocentaje en la
     * variable ivaLocal en @calcularPrecioIva
     */
    public static void main(String[] args) {

        double precioConIva = calcularPrecioIva(100);
        System.out.println(precioConIva);
    }

    private static double calcularPrecioIva(double precio) {
        double ivaLocal = 0.12;
        double iva = precio * ivaLocal;
        return precio + iva;
    }
}
