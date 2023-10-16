public class BusquedaSecuencial {

    public static int busquedaSecuencial(int[] lista, int elemento) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == elemento) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] miLista = {10, 4, 3, 5, 8, 1, 7};
        int elementoABuscar = 5;
        int resultado = busquedaSecuencial(miLista, elementoABuscar);

        if (resultado != -1) {
            System.out.println("El elemento " + elementoABuscar + " se encontró en la posición " + resultado);
        } else {
            System.out.println("El elemento " + elementoABuscar + " no se encontró en la lista");
        }
    }
}
