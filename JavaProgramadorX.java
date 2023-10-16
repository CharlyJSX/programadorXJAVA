import java.util.ArrayList;
import java.util.List;

public class JavaProgramadorX {
    

public static void main(String[] args){
        
    
        List<Object> datosMixtos = new ArrayList<Object>();
        datosMixtos.add("texto");
        datosMixtos.add(69);
        datosMixtos.add(true);
        String[] lista = {"lista dentro de otra lista"};
        datosMixtos.add(lista);

        System.out.println(datosMixtos.get(2));



    }
}


/* 

- Módulos

Lenguaje html = new Lenguaje("HTML", 1999);
html.descripción();

Lenguaje css = new Lenguaje("CSS", 1996);
css.descripción();

Lenguaje javascript = new Lenguaje("Javascript", 1995);
javascript.descripción(); */


/*

- Ciclo While

int entero = 100;
int emergencia = 911;


    while(entero <= emergencia) {
        System.out.println(entero);
        entero++;
    }

- Ciclos

    ArrayList<String> animales = new ArrayList<String>();
        animales.add("perro");
        animales.add("gato");
        animales.add("tigre");

        for (String animal : animales) {
            System.out.println(animal);


- Multiplicaciónd de enteros

    ArrayList<Integer> números = new ArrayList<Integer>();
        números.add(23);
        números.add(45);
        números.add(16);
        números.add(37);
        números.add(3);
        números.add(99);
        números.add(22);

    for(Integer número : números) {
        multiplicar(número, 2);
    }
}

    static void multiplicar(Integer primero, Integer segundo) {
        System.out.println(primero * segundo);
        }
 */
/*

- Condicionales

boolean autorizado = true;

        if (!autorizado) {
            System.out.println("Puede ingresar");
        } else {
            System.out.println("No puede Ingresar");
        } 
        
        
        int entero = 100;

        if (entero == 99) {
        System.out.println("Es 99");
        } else if (entero == 100) {
            System.out.println("Es 100");
        } else {
            System.out.println("No es 99 ni 100");
        }


                String color = "amarillo";
        
        switch (color) {
            case "verde":
                System.out.println("Éxito");
                break;
            case "amarillo":
                System.out.println("Advertencia");
                break;
            default:
                System.out.println("Error");
                break;


        public static void main(String[] args){
        Integer resultado = sumar(3, 4);
        System.out.println(resultado);
    }

    static Integer sumar(Integer primero, Integer segundo) {
        return primero + segundo;
    }

        }
        
        */


/* 

- Operadores de lógicos

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false || true);
        System.out.println(false || false);  System.out.println(4 == 4);
        System.out.println(4 != 5);
        System.out.println(4 < 5);
        System.out.println(4 >= 5); */


/* 

- Operadores de comparación

        System.out.println(4 == 4);
        System.out.println(4 != 5);
        System.out.println(4 < 5);
        System.out.println(4 >= 5); */




/* 

- Operadores aritméticos

        System.out.println(1 + 1);
        System.out.println(1 - 1);
        System.out.println(10 * 2);
        System.out.println(10 / 2); */

/* HashMap<String, String> paises = new HashMap<>();
        paises.put("ESC", "Ecuador");
        paises.put("MX", "México");
        paises.put("AR", "Argentina");

        System.out.println(paises.get("ESC")); */


/* 

-  HashMap de enteros

        HashMap<Integer, String> jugadores = new HashMap<Integer,
        String>();
        jugadores.put(10, "Messi");
        jugadores.put(7, "Cristiano Ronaldo");

        System.out.println(jugadores.get(7)); */


/* 

- Array de objetos

        List<Object> datosMixtos = new ArrayList<Object>();
        datosMixtos.add("texto");
        datosMixtos.add(69);
        datosMixtos.add(true);
        String[] lista = {"lista dentro de otra lista"};
        datosMixtos.add(lista);

        System.out.println(datosMixtos.get(2)); */

/* 

- Array de cadenas

    String[] animales = {"perro", "gato", "tigre"};

    System.out.println(animales[2]); */

/* 

- Array de enteros

    ArrayList<Integer> números = new ArrayList<>();
        números.add(23);
        números.add(45);
        números.add(16);
        números.add(37);
        números.add(3);
        números.add(37);
        números.add(2);
        números.add(99);
        números.add(16);
        números.add(1);
        números.add(33);
        números.add(83);

        System.out.println(números.get(8)); */