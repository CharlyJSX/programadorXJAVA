import java.util.ArrayList;

public class Quicksort {
    

public static void main(String[] args){

    ArrayList<Integer> números = new ArrayList<Integer>();
    números.add(23);
    números.add(45);
    números.add(16);
    números.add(37);
    números.add(3);
    números.add(99);
    números.add(22);

    ArrayList<Integer> listaOrdenada = quicksort(números);

    System.out.println(listaOrdenada);


    }

    static ArrayList<Integer> quicksort(ArrayList<Integer> lista) {
        if (lista.size () <= 1) {
            return lista;
        }
        Integer pivote = lista.get(0);
        ArrayList<Integer> izquierda = new ArrayList<Integer>();
        ArrayList<Integer> derecha = new ArrayList<Integer>();
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) < pivote) {
                izquierda.add(lista.get(i));
            } else {
                derecha.add(lista.get(i));
            }
        }
        ArrayList<Integer> primero = quicksort(izquierda);
        ArrayList<Integer> medio = quicksort(izquierda);
        medio.add(pivote);
        ArrayList<Integer> segundo = quicksort(izquierda);

        primero.addAll(medio);
        primero.addAll(segundo);

        return primero;
    }
}